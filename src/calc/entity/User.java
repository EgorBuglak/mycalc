package calc.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String user;
    ArrayList<String> users = new ArrayList<String>();
    void addUser(User user){
        Scanner scanner = new Scanner(System.in);
        String us = scanner.next();
        users.add(us);
    }


}


