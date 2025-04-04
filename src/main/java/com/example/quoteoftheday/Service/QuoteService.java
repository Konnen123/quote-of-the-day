package com.example.quoteoftheday.Service;

import com.example.quoteoftheday.Utils.QuotesProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@AllArgsConstructor
@Service
public class QuoteService
{
    private final QuotesProvider quotesProvider;

    public String getRandomQuote()
    {
        List<String> quotes = quotesProvider.getQuotes();

        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }

    public void addQuote(String quote)
    {
        quotesProvider.getQuotes().add(quote);
    }

    public String getQuote(Integer id)
    {
        List<String> quotes = quotesProvider.getQuotes();

        if(id < 0 || id > quotes.size())
            throw new IndexOutOfBoundsException();

        return quotes.get(id);
    }
}
