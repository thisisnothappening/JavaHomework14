package org.fasttrackit;
/*
1) cititi fisierul quotes.txt

2)quotes txt are formatul:
AUTHOR~QUOTE

3)creati obiectul model Quote:
- id: int   (valoarea id-ului o dat voi, in ordinea in care le-ati citit din fisier: 1, 2, 3 )
- author:String
- quote: String
- favourite: boolean (este "mutabil" -> nu este final- are setter)

4) creati un obiect QuoteService care ofera urmatoarele metode:
- getAllQuotes():List<String>
- getQuotesForAuthor(String author): List<Quote>
- getAuthors(): List<String>
- setFavourite(int id)
- getFavourites():List<Quote>
- getRandomQuote():String : generati un numar random cu ajutorul obiectului java.util.Random si returnati quote-ul cu acel id
 */
public class Main {
    public static void main(String[] args) {
        QuoteService quoteService = new QuoteService();

        System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("unknown"));
        System.out.println(quoteService.getAuthors());
        quoteService.setFavorite(267);
        quoteService.setFavorite(3569);
        quoteService.setFavorite(15);
        quoteService.setFavorite(785);
        System.out.println(quoteService.getFavourites());
        System.out.println(quoteService.getRandomQuote());
    }
}