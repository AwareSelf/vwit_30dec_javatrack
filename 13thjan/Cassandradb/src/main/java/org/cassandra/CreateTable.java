package org.cassandra;

public class CreateTable {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String createmovieTable = "CREATE TABLE IF NOT EXISTS movies_keyspace.movies"
                    + "(title varchar,year int, descreiption varchar, rating varchar, PRIMARY KEY (title, year))";

            connector.getSession().execute(createmovieTable);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}