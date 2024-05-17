package com.codsoft.task4;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class CurrencyConverter {
     static double value=0.0;
    public static void convertCurrency(double amount, String fromCurrency, String toCurrency) {
        String apiKey = "cur_live_33UFeLB0BGfLSRWaP03wbV6PUp2xYGfuYhy5EpXM";
        String urlStr = "https://api.currencyapi.com/v3/latest?apikey=" + apiKey + "&currencies="+fromCurrency+"%2C"+toCurrency;

        try {
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            HttpResponse<JsonNode> response = Unirest.get(urlStr)
                    .header("accept", "application/json")
                    .asJson();

            JSONObject jsonResponse = response.getBody().getObject();
            JSONObject dataObject = jsonResponse.getJSONObject("data");


            for (Object key : dataObject.keySet()) {
                // Cast the key to String explicitly
                String currencyKey = (String) key;
                JSONObject currencyObject = dataObject.getJSONObject(currencyKey);
                String code = currencyObject.getString("code");
                value = currencyObject.getDouble("value");
                System.out.println("Code: " + code + ", Value: " + value*amount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        double amount;
        String fromCurrency, toCurrency;

        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Base Currency:");
        fromCurrency= kb.next();
        kb.nextLine();
        System.out.print("Enter Currency to Convert:");
        toCurrency=kb.next();
        kb.nextLine();
        System.out.print("Enter the amount to Convert:");
        amount=kb.nextDouble();


        convertCurrency(amount, fromCurrency, toCurrency);

    }
}
