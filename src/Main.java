package src;

public class Main {
    public static void main(String[] args) {
        final String BOT_NAME = "Ryan";
        final String BOT_CREATION_DATE = "01-22-2020";

        botGreeting(BOT_NAME, BOT_CREATION_DATE);
        introToBoot();
        guessUserAge();
        botCount();
        knowledgeTest();

        /*
        *I am planning to add some test in this project.
        * Then, i will merge it in my master branch.
         */
    }
    static void botGreeting(String name, String date) {
        System.out.println(String.format("Hello! My name is %s.", name));
        System.out.println(String.format("I was created in %s.", date));
    }
    static void introToBoot() {
        System.out.print("Please remind me your name: \n>");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(String.format("What a great name you have %s .", name));
    }
    static void guessUserAge(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] remainders = new int[3];

        System.out.println("Let's guess your age.");
        System.out.println("Enter remainder of dividing your age by 3, 5 and 7 respectively");
        for (int i = 0; i < remainders.length; i++) {
            System.out.print("> ");
            remainders[i] = scanner.nextInt();
        }
        int age = (remainders[0] * 70 + remainders[1] * 21 +remainders[2] * 15) % 105;
        System.out.println(String.format("Your age is %d; that's a good time to start programming", age));
    }
    static void botCount() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long delimiter = 0;
        System.out.println("Now I will prove to you that I can count to any number that you want.");
        System.out.print("> ");
        delimiter = scanner.nextLong();
        for (int i = 0; i <= delimiter; i++)
            System.out.println(i);
    }
    static void knowledgeTest() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Let's test your knowledge on java.\nWhat is the first name of java?");
        System.out.println("1. java");
        System.out.println("2. Oracle");
        System.out.println("3. Oak");
        System.out.println("4. Sun Micro system");
        System.out.println("5. James Gosling");
        System.out.print("> ");
        int answer = scanner.nextInt();

        while (answer != 3) {
            System.out.println("Please, try again.");
            System.out.print("> ");
            answer = scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
