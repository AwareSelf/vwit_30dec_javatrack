package mongodb;

import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
//https://www.mongodb.com/docs/drivers/java/sync/current/quick-start/#std-label-java-sync-quickstart


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("my_db");
            MongoCollection<Document> collection = database.getCollection("people");
            Document doc = collection.find(eq("name", "Rahul")).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}
