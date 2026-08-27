package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");
        Post p1 = new Post(
                sdf.parse("21/06/2018 16:53:26"),
                "Traveling to New Zeland",
                "I'm going to visit this wonderful place!",
                12
        );
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you!");
        Post p2 = new Post(
                sdf.parse("21/06/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
