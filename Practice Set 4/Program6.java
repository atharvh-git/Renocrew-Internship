// Write a program to find out the type of website from the URL:
// .com => Commercial website
// .org => Organization website
// .in => Indian website

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website here: ");
        String website = sc.next();
        if(website.endsWith(".com")) System.out.println("This is a commercial website.");
        else if(website.endsWith(".org")) System.out.println("This is an organization website.");
        else if(website.endsWith(".in")) System.out.println("This is an Indian website.");
        else System.out.println("Invalid URL!");
    }
}
