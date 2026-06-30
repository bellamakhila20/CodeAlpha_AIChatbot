import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("hi") || userInput.equals("hello")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (userInput.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            }
            else if (userInput.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }
            else if (userInput.contains("internship")) {
                System.out.println("Bot: Internships help you gain practical experience.");
            }
            else if (userInput.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}