public class RockPaperScissors {
    public static void main(String[] args) {
        String player1 = "Player 1";
        String player2 = "Player 2";
        String choiceA = "R";//Asking player to choose between R,P, and S
        String choiceB = "S";//Asking player to choose between R,P, and S
        String playAgain = "Y";//Asking if they want to play again or not

        while (playAgain.equalsIgnoreCase("Y")) {
            String result = "";
            if (choiceA.equalsIgnoreCase("R")) {//Player 1 picks Rock
                if (choiceB.equalsIgnoreCase("S")) {//Player 2 pics Scissor
                    result = player1 + " wins! Rock breaks Scissors.";//Output player 1 wins as R beats S
                } else if (choiceB.equalsIgnoreCase("P")) {//If player 2 picks Paper
                    result = player2 + " wins! Paper covers Rock.";//Output player 2 wins
                } else {
                    result = "It's a tie! Both players chose Rock.";//The result is tie if both chooses R
                }
            } else if (choiceA.equalsIgnoreCase("P")) {//Player 1 picks Paper
                if (choiceB.equalsIgnoreCase("R")) {//Player 2 picks Rock
                    result = player1 + " wins! Paper covers Rock.";//Player 1 wins as P covers R
                } else if (choiceB.equalsIgnoreCase("S")){//If player 2 picks scissor
                    result = player2 + " wins! Scissors cuts Paper.";//output player 2 wins
                } else {
                    result = "It's a tie! Both players chose Paper.";//The result is tie if both chooses P
                }
            } else if (choiceA.equalsIgnoreCase("S")) {//Player 1 picks Scissors
                if (choiceB.equalsIgnoreCase("P")) {//Player 2 picks Paper
                    result = player1 + " wins! Scissors cuts Paper.";//Output player 1 wins as S cuts P
                } else if (choiceB.equalsIgnoreCase("R")) {//If player 2 picks Rocks
                    result = player2 + " wins! Rock breaks Scissors.";//Output player 2 wins
                } else {
                    result = "It's a tie! Both players chose Scissors.";//The result is tie if both chooses S
                }
            } else {
                System.out.println("Invalid choice for player 1: " + choiceA);
                //If player chooses other than R,P,and S, then it is an invalid move
                System.out.println("Please choose R, P, or S.");//Asking to choose between R,P,and S
                continue;
            }
            if (choiceB.equalsIgnoreCase("R")
                    || choiceB.equalsIgnoreCase("P")
                    || choiceB.equalsIgnoreCase("S")) {
                System.out.println(result);
                System.out.println("Do you want to play again? [Y/N]");//Asking if you want to play again
                playAgain = "N";
            } else {
                System.out.println("Invalid choice for player 2: " + choiceB);
                System.out.println("Please choose R, P, or S.");
            }
        }
    }
}
