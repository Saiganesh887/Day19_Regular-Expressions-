package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
        static Pattern pattern = Pattern.compile("^[0-9]?[a-z]{3}[0-9a-z]*$");
        public static void main(String[] args) {
            Matcher matcher = pattern.matcher("bcc");
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
}
