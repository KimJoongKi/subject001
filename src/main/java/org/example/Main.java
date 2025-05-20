package org.example;

import com.google.gson.Gson;

import java.io.InputStream;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        InputStream inputStream =
                Main.class.getClassLoader().getResourceAsStream("books.json");

        if (inputStream==null) {
            System.out.println("파일을 찾을 수 없습니다.");
            return;
        }

    }
}
