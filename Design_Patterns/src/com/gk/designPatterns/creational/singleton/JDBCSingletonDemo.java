package com.gk.designPatterns.creational.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class JDBCSingletonDemo {
    static int count = 0;
    static int choice;

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("DATABASE OPERATIONS");
            System.out.println(" --------------------- ");
            System.out.println(" 1. Insertion ");
            System.out.println(" 2. View      ");
            System.out.print("\n");
            System.out.print("Please enter the choice what you want to perform in the database: ");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter the employee name");
                    String name = br.readLine();
                    System.out.println("Enter the employee address");
                    String address = br.readLine();
                    System.out.println("Enter the employee age");
                    int age = Integer.parseInt(br.readLine());
                    try {
                        int i = jdbc.insert(name, address, age);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been inserted successfully");
                        } else {
                            System.out.println("Data has not been inserted ");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter the employee name");
                    String name = br.readLine();
                    try {
                        jdbc.view(name);

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                break;
                default:
                    return;
            }
        } while (choice != 3);
    }
}
