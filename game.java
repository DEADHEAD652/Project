package com.company;



public class knaf{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        System.out.println("What does player one chooses rock ,paper scissor?");
        String player1 = input.next();
        System.out.println("What does player two chooses rock ,paper scissor?");
        String player2 = input.next();


        if ( (player1.equals("rock") && player2.equals("scissor")) || (player1.equals("scissor") && player2.equals("paper")) || (player1.equals("paper") && player2.equals("rock"))){

            System.out.println("Player one wins");



        }
        else {

            System.out.println("player2 wins");
        }

   }

}
