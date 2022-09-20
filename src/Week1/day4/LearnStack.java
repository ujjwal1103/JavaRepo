package Week1.day4;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("book1");
        books.push("book2");
        books.push("book3");
        books.push("book4");
        books.push("book5");
        books.push("book6");


        books.pop();
        books.add("book6");
        System.out.println(books.peek());
        System.out.println("-----------------------------");
        for(String s:books){
            System.out.println(s);
        }


        System.out.println(books.search("book1"));
        System.out.println(books.empty());


    }
}
