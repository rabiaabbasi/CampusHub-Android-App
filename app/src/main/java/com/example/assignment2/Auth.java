package com.example.assignment2;

import android.util.Patterns;

public class Auth {
    public static String name = "Muhammad Azhar";
    public static String email = "test@example.com";
    public static String password = "123456";

    public static boolean isValidEmail(String e) {
        return Patterns.EMAIL_ADDRESS.matcher(e).matches();
    }
}