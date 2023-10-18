package com.example.Web_Book.DAO;

import java.sql.DriverManager;

import com.example.Web_Book.WebBookApplication;

public class SQLConnection {
	public java.sql.Connection getConnection(){ 
        java.sql.Connection connection = null;
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName=WebBook; user=sa; password=123; encrypt=false;");
        } catch (Exception e) {
        }
        return connection;
    }
    
    public static void main(String[] args) {
		SQLConnection con = new SQLConnection();
		System.out.println(con.getConnection());
	}
}
