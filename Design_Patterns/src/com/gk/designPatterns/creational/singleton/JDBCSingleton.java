package com.gk.designPatterns.creational.singleton;


import java.sql.*;

public class JDBCSingleton {

    /*
    Step 1
      create a JDBCSingleton class.
      static member holds only one instance of the JDBCSingleton class
    */
    private static JDBCSingleton jdbc;

    /*
    Step 2
    JDBCSingleton prevents the instantiation from any other class.
    */
    private JDBCSingleton() {
    }

    /*
        Step 3
        Now we are providing gloabal point of access.
    */
    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    // to get the connection from methods like insert, view etc.
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
        return con;
    }

    public int insert(String empName, String empAddress, Integer empAge) throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("insert into employee(emp_name,emp_addr,emp_age)values(?,?,?)");
        ps.setString(1, empName);
        ps.setString(2, empAddress);
        ps.setInt(3, empAge);
        int recordCount = ps.executeUpdate();
        ps.close();
        con.close();
        ;
        return recordCount;
    }

    public void view(String empName) throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("select * from employee where emp_name = ? ");
        ps.setString(1, empName);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            System.out.println("Name= " + resultSet.getString("emp_name" + " Address= " + resultSet.getString("emp_addr") + " Age= " + resultSet.getInt("emp_age")));
        }
        ps.close();
        con.close();
    }

}

// update and delete operations