package org.fasttrackit;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuoteReader {

    @SneakyThrows
    public static List<Quote> getQuoteList() {
        List<Quote> quoteList = new ArrayList<>();
        int id = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/quotes.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split("~");
            quoteList.add(new Quote(id++, tokens[0], tokens[1], false));
        }
        bufferedReader.close();
        return quoteList;
    }
}
