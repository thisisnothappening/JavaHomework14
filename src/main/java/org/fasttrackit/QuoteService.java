package org.fasttrackit;

import static org.fasttrackit.QuoteReader.getQuoteList;

import java.util.*;

public class QuoteService {
    private final List<Quote> favoriteQuoteList = new ArrayList<>();

    public List<Quote> getAllQuotes() {
        return getQuoteList();
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> quotesForAuthor = new ArrayList<>();
        for (Quote quote : getQuoteList()) {
            if (quote.getAuthor().equals(author)) {
                quotesForAuthor.add(quote);
            }
        }
        return quotesForAuthor;
    }

    public List<String> getAuthors() {
        Set<String> authorSet = new LinkedHashSet<>();
        for (Quote quote : getQuoteList()) {
            authorSet.add(quote.getAuthor());
        }
        return new ArrayList<>(authorSet);
    }

    public void setFavorite(int id) {
        for (Quote quote : getQuoteList()) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
                favoriteQuoteList.add(quote);
            }
        }
    }

    public List<Quote> getFavourites() {
        return favoriteQuoteList;
    }

    public String getRandomQuote() {
        Random random = new Random();
        int r = random.nextInt(getQuoteList().size());
        for (Quote quote : getQuoteList()) {
            if (quote.getId() == r) {
                return quote.getQuote();
            }
        }
        throw new RuntimeException();
    }
}
