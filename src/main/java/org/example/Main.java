package org.example;

public class Main {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT...");
        Database boo = Database.getInstance();
        boo.query("SELECT...");
    }
}