package org.example;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.kanye.rest/");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();


            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                System.out.println(informationString);



            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Jeżeli chcesz zobaczyć następny cytat wpisz next: ");
        String next1 = scan1.nextLine();

        while (next1.equals("next")) {

            try {
                URL url = new URL("https://api.kanye.rest/");

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                //Check if connect is made
                int responseCode = conn.getResponseCode();


                // 200 OK
                if (responseCode != 200) {
                    throw new RuntimeException("HttpResponseCode: " + responseCode);
                } else {

                    StringBuilder informationString = new StringBuilder();
                    Scanner scanner = new Scanner(url.openStream());

                    while (scanner.hasNext()) {
                        informationString.append(scanner.nextLine());
                    }
                    //Close the scanner
                    scanner.close();

                    System.out.println(informationString);



                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Jeżeli chcesz zobaczyć następny cytat wpisz next: ");
            String next2 = scan1.nextLine();


            if (next2.equals("next")) {

            }else {
                break;
            }

        }

    }
}




