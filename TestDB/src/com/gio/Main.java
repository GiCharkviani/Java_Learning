package com.gio;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/giorgi.charkviani/Desktop/Learning/Java/TestDB/" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
                    .getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

//            conn.setAutoCommit(false);

            statement.execute("DROP TABLE IF EXISTS " +  TABLE_CONTACTS);

            createContactsTable(statement);

            insertContact(statement, "Gop", 23131, "giushuna@gmail.com");
            insertContact(statement, "Gocha", 52533231, "Gocha@gmail.com");
            insertContact(statement, "Mishikuna", 525324, "mishikuna@gmail.com");
            insertContact(statement, "Jaba", 31312, "Jabava@gmail.com");

//            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
//                    "(name TEXT, phone INTEGER, email TEXT)");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Gio', 55555, 'gi@gmail.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jane', 333311, 'Jane@gmail.com')");

//            statement.execute("UPDATE contacts SET phone=777, email='Joe@gmail.com' WHERE name='Joe'");

//            statement.execute("DELETE FROM contacts WHERE name='Jane'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " + results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" +
                COLUMN_NAME + ", " + COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +  "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }

    private static void createContactsTable(Statement statement) throws SQLException {
        statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                "(" + COLUMN_NAME + " text, " + COLUMN_PHONE + " integer, " + COLUMN_EMAIL + " text" + ")");
    }
}
