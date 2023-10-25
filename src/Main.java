import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = 100;
        int justin_hp = 1;
        System.out.println("This is a short adventure game");
        System.out.println("Type and enter anything to start \n");
        String start_string = scan.nextLine();
        System.out.print("What's your name? ");
        String name_var = scan.nextLine();
        System.out.println("Welcome to my game, " + name_var);

        System.out.println("You find yourself at 50 Chayna Crescent. What do you do?");
        System.out.println("1. Yell for Preston Baichoo\n2. Yell for Om Rathee\n3. Yell for Justin Baichoo");
        System.out.print("What is your choice? ");
        int choice1 = scan.nextInt();
        scan.nextLine();
        if (choice1 == 2){
            System.out.println("Om is chill and gives you some chicken briyani");
        }
        if (choice1 == 3){
            System.out.println("justin baichoo sues you for calling his name disrespectfully and you are out of 12 billion dollars because he is the best lawyer to live, then he pulls out da glock and shoots him");
        }
        if (choice1 == 1) {
            System.out.println("Preston yells at you to get out before his dad gets here");
            System.out.println("What do you do? (run or stay)");
            String choice1_1 = scan.nextLine();

            if (choice1_1.equals("run")) {
                System.out.println("You ran from big Baichoo");
                System.out.println("Big baichoo pulls out da glock and shoots you");
            } else {
                System.out.println("A FIGHT HAS BEEN STARTED");
                System.out.print(name_var + " vs. JUSTIN BAICHOO!");
                System.out.println("It's your turn. Type \"hit\" to hit, or \"run\" to run");
                String choice1_1_1 = scan.nextLine();

                if (choice1_1_1.equals("run")) {
                    System.out.println("You ran from big Baichoo");
                } else if (choice1_1_1.equals("hit")) {
                    System.out.print("You hit big Baichoo for ");
                    int random_1 = (int) (1 + Math.random() * 100);
                    System.out.println(random_1);
                    int justin_hp_hit = justin_hp - random_1;
                    int random_2 = (int) (1 + Math.random() * 100);
                    System.out.println("Big baichoo hit you for " + random_2);
                    int player_hp_hit = health - random_2;


                    String choice1_1_1_1 = scan.nextLine();
                    if (choice1_1_1_1.equals("hit")){
                    System.out.print("You hit big Baichoo for ");
                    int random_3 = (int) (1 + Math.random() * 100);
                    System.out.println(random_3);
                    int justin_hp_hit2 = justin_hp_hit - random_3;
                    int random_4 = (int) (1 + Math.random() * 100);
                    System.out.println("Big baichoo hit you for " + random_4);
                    int player_hp_hit2 = player_hp_hit - random_4;
                    if (justin_hp_hit2 <= 1){
                        System.out.println("you won the game and killed the big baichoo");
                        if (player_hp_hit2 <= 0) {
                            System.out.println("you died. RIP gg go next");
                        }
                    }
                    }
                }

            }
         }
    }
}
