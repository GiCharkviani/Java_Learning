package com.gio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org/somepage.html");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if(responseCode != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }

            inputReader.close();

//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//
//            for(Map.Entry<String, List<String>> entry: headerFields.entrySet()) {
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//                System.out.println("---- Key = " + key);
//                for(String string: value) {
//                    System.out.println("Value = " + value);
//                }
//            }


//            inputStream.close();

//            URI uri = url.toURI();

            // Absolute URI
//            URI baseUri = new URI("https://username:password@mynewserver.com:5000");
////            URI uri = new URI("https://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//
//            // Relative URI - won't convert to URL
//            URI uriRelative = new URI("/catalogue/phones?os=android#samsung");
//
//            // Resolving relative and absolute URIs - will become Absolute URI
//            URI resolvedUri1 = baseUri.resolve(uri1);
//            URI resolvedUri2 = baseUri.resolve(uri2);
//            URI resolvedUri3 = baseUri.resolve(uri3);
//
////            URI uri = new URI("hello")
//            URL url1 = resolvedUri1.toURL();
//            System.out.println("URL 1 = " + url1);
//            URL url2 = resolvedUri2.toURL();
//            System.out.println("URL 2 = " + url2);
//            URL url3 = resolvedUri3.toURL();
//            System.out.println("URL 3 = " + url3);
//
//            URI relativizedURI = baseUri.relativize(resolvedUri2);
//            System.out.println("Relative URI = " + relativizedURI);


            // URI components:
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
                System.out.println("IO Exception: " + e.getMessage());
                e.printStackTrace();
        }
    }
}
