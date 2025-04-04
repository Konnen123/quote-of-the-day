package com.example.quoteoftheday.Controller;

import com.example.quoteoftheday.Service.QuoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/quotes")
@AllArgsConstructor
public class QuoteController
{
    private final QuoteService quoteService;

    @GetMapping("/random")
    public ResponseEntity<String> getRandomQuote()
    {
        String quote = quoteService.getRandomQuote();

        return ResponseEntity.ok(quote);
    }

    @PostMapping()
    public ResponseEntity<?> addQuote(@RequestBody String quote)
    {
        quoteService.addQuote(quote);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getQuote(@PathVariable Integer id)
    {
        String quote = quoteService.getQuote(id);
        return ResponseEntity.ok(quote);
    }

}
