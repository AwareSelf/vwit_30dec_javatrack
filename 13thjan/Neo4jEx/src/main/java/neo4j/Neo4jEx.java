package neo4j;
import org.neo4j.driver.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.neo4j.driver.Values.parameters;

public class Neo4jEx implements AutoCloseable {
    private final Driver driver;

    public Neo4jEx(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));


    }

    @Override
    public void close() throws RuntimeException {
        driver.close();
    }

    public void printGreeting(final String message) {
        try (var session = driver.session()) {
            var greeting = session.executeWrite(tx -> {
                var query = new Query("CREATE (a:Greeting) SET a.message = $message RETURN a.message + ', from node ' + id(a)", parameters("message", message));
                var result = tx.run(query);
                return result.single().get(0).asString();
            });
            System.out.println(greeting);
        }
    }

        public void createNode()
        {
            var result = driver.executableQuery("CREATE (:Person {name: $name})")
                    .withParameters(Map.of("name", "Alice"))
                    .withConfig(QueryConfig.builder().withDatabase("neo4j").build())
                    .execute();
            var summary = result.summary();
            System.out.printf("Created %d records in %d ms.%n",
                    summary.counters().nodesCreated(),
                    summary.resultAvailableAfter(TimeUnit.MILLISECONDS));

        }
        public void retrieveAllPersonNodes()
        {
            var result = driver.executableQuery("MATCH (p:Person) RETURN p.name AS name , p.age AS age")
                    .withConfig(QueryConfig.builder().withDatabase("neo4j").build())
                    .execute();

        // Loop through results and do something with them
            var records = result.records();
            records.forEach(r -> {
                System.out.println(r);  // or r.get("name").asString()
            });

        // Summary information
            var summary = result.summary();
            System.out.printf("The query %s returned %d records in %d ms.%n",
                    summary.query(), records.size(),
                    summary.resultAvailableAfter(TimeUnit.MILLISECONDS));
        }


    public static void main(String... args) {
        try (var greeter = new Neo4jEx("bolt://localhost:7687", "neo4j", "namrata@123")) {
          //  greeter.printGreeting("hello, world");
         //   greeter.createNode();
            greeter.retrieveAllPersonNodes();
        }
    }
}
//https://neo4j.com/docs/getting-started/languages-guides/java/java-intro/
//https://neo4j.com/docs/java-manual/current/
//https://medium.com/@ksaquib/neo4j-for-beginners-an-in-depth-introduction-with-java-examples-69a7ad22946a