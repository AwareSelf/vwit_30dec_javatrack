package mongodb;

// Deletes a document from a collection by using the Java driver

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.lt;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;

public class DeleteOne {

    public static void main(String[] args) {
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("my_db");
            MongoCollection<Document> collection = database.getCollection("movies");

            Bson query = eq("title", "The Lego Frozen Movie");
            Bson query1 = lt("imdb", 4);

            try {
                // Deletes the first document that has a "title" value of "The Garbage Pail Kids Movie"
            //    DeleteResult result = collection.deleteOne(query);
            //    System.out.println("Deleted document count: " + result.getDeletedCount());

                // Deletes all documents that have an "imdb.rating" value less than 1.9
                DeleteResult result1 = collection.deleteMany(query1);

                // Prints the number of deleted documents
                System.out.println("Deleted document count: " + result1.getDeletedCount());

                // Prints a message if any exceptions occur during the operation
            } catch (MongoException me) {
                System.err.println("Unable to delete due to an error: " + me);
            }
        }
    }
}