package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
        static Pattern patternName = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        static Pattern patternEmail = Pattern.compile("^[a-zA-Z]+.[a-zA-z]+@bl.co.in$");
        static Pattern patternMobile = Pattern.compile("^[0-9]{2}+\s[0-9]{10}$");
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter First Name: ");
          String firstName1 = sc.next();
            Matcher firstName = patternName.matcher(firstName1);
            if (firstName.matches()){
            } else {
                System.out.println("Invalid First Name");
            }

            System.out.println("Enter Last Name: ");
            String lastName1 = sc.next();
            Matcher lastName = patternName.matcher(lastName1);
            if (lastName.matches()) {
            } else {
                System.out.println("Invalid Last Name");
            }

            System.out.println("Enter Email ID: ");
            String email1 = sc.next();
            Matcher email = patternEmail.matcher(email1);
            if (email.matches()) {
                System.out.println("valid");
            } else {
                System.out.println("Invalid Email ID");
            }

              System.out.println("Enter Mobile number with country code: ");
              String mobile1 = sc.next();
              Matcher mobile = patternMobile.matcher(mobile1);
              if (mobile.matches()) {
                  System.out.println("valid");
              } else {
                  System.out.println("Invalid Mobile Number ");
              }
              
    }
}
