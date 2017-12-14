package dataBaseConn;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class Main {

    public static void main(String[] args) {
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);

            // Creating Credentials
            MongoCredential credential;
            credential = MongoCredential.createCredential("sampleUser", "mDb",
                    "password".toCharArray());
            System.out.println("Connected to the database successfully");

            // Accessing the database
            MongoDatabase database = mongo.getDatabase("mDb");
            System.out.println("Credentials ::" + credential);
        }catch (Exception e){
            System.out.println("Problem!!");
        }
    }
}
