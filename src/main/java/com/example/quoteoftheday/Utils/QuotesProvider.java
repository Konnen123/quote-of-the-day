package com.example.quoteoftheday.Utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuotesProvider
{
    private List<String> quotes;

    public List<String> getQuotes()
    {
        if(quotes == null)
            populateQuotes();

        return quotes;
    }

    private void populateQuotes()
    {
        quotes = new ArrayList<String>();

        // Motivational Quotes
        quotes.add("The best way to predict the future is to create it. - Peter Drucker");
        quotes.add("Don’t watch the clock; do what it does. Keep going. - Sam Levenson");
        quotes.add("Your limitation—it’s only your imagination.");
        quotes.add("Do what you can, with what you have, where you are. - Theodore Roosevelt");
        quotes.add("Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill");

        // Life Quotes
        quotes.add("Happiness depends upon ourselves. - Aristotle");
        quotes.add("Do what you feel in your heart to be right—for you’ll be criticized anyway. - Eleanor Roosevelt");
        quotes.add("Live each day as if your life had just begun. - Johann Wolfgang von Goethe");
        quotes.add("Life isn’t about waiting for the storm to pass but learning to dance in the rain. - Vivian Greene");
        quotes.add("To live is the rarest thing in the world. Most people exist, that is all. - Oscar Wilde");

        // Wisdom Quotes
        quotes.add("Knowing yourself is the beginning of all wisdom. - Aristotle");
        quotes.add("He who opens a school door, closes a prison. - Victor Hugo");
        quotes.add("Wise men speak because they have something to say; fools because they have to say something. - Plato");
        quotes.add("Patience is a key element of success. - Bill Gates");
        quotes.add("Turn your wounds into wisdom. - Oprah Winfrey");

        // Love & Kindness Quotes
        quotes.add("Love all, trust a few, do wrong to none. - William Shakespeare");
        quotes.add("A kind gesture can reach a wound that only compassion can heal. - Steve Maraboli");
        quotes.add("No act of kindness, no matter how small, is ever wasted. - Aesop");
        quotes.add("Happiness is not something ready-made. It comes from your own actions. - Dalai Lama");
        quotes.add("The only thing we never get enough of is love; and the only thing we never give enough of is love. - Henry Miller");

        // Success & Hard Work Quotes
        quotes.add("Opportunities don't happen. You create them. - Chris Grosser");
        quotes.add("Hardships often prepare ordinary people for an extraordinary destiny. - C.S. Lewis");
        quotes.add("It’s not whether you get knocked down, it’s whether you get up. - Vince Lombardi");
        quotes.add("Doubt kills more dreams than failure ever will. - Suzy Kassem");
        quotes.add("Do what you love, and you’ll never work a day in your life. - Confucius");

        // Growth & Change Quotes
        quotes.add("Be the change that you wish to see in the world. - Mahatma Gandhi");
        quotes.add("Growth is painful. Change is painful. But nothing is as painful as staying stuck somewhere you don’t belong.");
        quotes.add("The only way to do great work is to love what you do. - Steve Jobs");
        quotes.add("A year from now you may wish you had started today. - Karen Lamb");
        quotes.add("Don’t be afraid to give up the good to go for the great. - John D. Rockefeller");

        // Courage & Strength Quotes
        quotes.add("Courage is resistance to fear, mastery of fear, not absence of fear. - Mark Twain");
        quotes.add("The only limit to our realization of tomorrow is our doubts of today. - Franklin D. Roosevelt");
        quotes.add("Bravery is not the absence of fear but the triumph over it. - Nelson Mandela");
        quotes.add("Do the thing you fear, and the death of fear is certain. - Ralph Waldo Emerson");
        quotes.add("You gain strength, courage, and confidence by every experience in which you really stop to look fear in the face. - Eleanor Roosevelt");

        // Happiness & Positivity Quotes
        quotes.add("Keep your face always toward the sunshine—and shadows will fall behind you. - Walt Whitman");
        quotes.add("Happiness is not by chance, but by choice. - Jim Rohn");
        quotes.add("Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence. - Helen Keller");
        quotes.add("Find joy in the ordinary.");
        quotes.add("The purpose of our lives is to be happy. - Dalai Lama");

        // Creativity & Imagination Quotes
        quotes.add("Creativity is intelligence having fun. - Albert Einstein");
        quotes.add("Logic will get you from A to B. Imagination will take you everywhere. - Albert Einstein");
        quotes.add("Art enables us to find ourselves and lose ourselves at the same time. - Thomas Merton");
        quotes.add("Innovation distinguishes between a leader and a follower. - Steve Jobs");
        quotes.add("Imagination is everything. It is the preview of life’s coming attractions. - Albert Einstein");

        // Mindfulness & Inner Peace Quotes
        quotes.add("Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. - Buddha");
        quotes.add("An unexamined life is not worth living. - Socrates");
        quotes.add("Silence is a source of great strength. - Lao Tzu");
        quotes.add("Peace comes from within. Do not seek it without. - Buddha");
        quotes.add("He who lives in harmony with himself lives in harmony with the universe. - Marcus Aurelius");

        // Marcus Aurelius Quotes
        quotes.add("You have power over your mind—not outside events. Realize this, and you will find strength. - Marcus Aurelius");
        quotes.add("Waste no more time arguing what a good man should be. Be one. - Marcus Aurelius");
        quotes.add("The happiness of your life depends upon the quality of your thoughts. - Marcus Aurelius");
        quotes.add("If it is not right, do not do it; if it is not true, do not say it. - Marcus Aurelius");
        quotes.add("Dwell on the beauty of life. Watch the stars, and see yourself running with them. - Marcus Aurelius");
        quotes.add("It is not death that a man should fear, but he should fear never beginning to live. - Marcus Aurelius");
        quotes.add("The best revenge is to be unlike him who performed the injury. - Marcus Aurelius");
        quotes.add("What stands in the way becomes the way. - Marcus Aurelius");
        quotes.add("When you arise in the morning, think of what a privilege it is to be alive—to breathe, to think, to enjoy, to love. - Marcus Aurelius");
        quotes.add("A man’s worth is no greater than the worth of his ambitions. - Marcus Aurelius");

        // Epictetus Quotes
        quotes.add("It's not what happens to you, but how you react to it that matters. - Epictetus");
        quotes.add("Freedom is the only worthy goal in life. It is won by disregarding things that lie beyond our control. - Epictetus");
        quotes.add("He who laughs at himself never runs out of things to laugh at. - Epictetus");
        quotes.add("We suffer not from the events in our lives, but from our judgment about them. - Epictetus");
        quotes.add("Don’t explain your philosophy. Embody it. - Epictetus");
        quotes.add("No man is free who is not master of himself. - Epictetus");
        quotes.add("If you want to improve, be content to be thought foolish and stupid. - Epictetus");
        quotes.add("Man is not worried by real problems so much as by his imagined anxieties about real problems. - Epictetus");
        quotes.add("Circumstances don’t make the man, they only reveal him to himself. - Epictetus");
        quotes.add("Attach yourself to what is spiritually superior, regardless of what other people think or do. - Epictetus");
    }
}
