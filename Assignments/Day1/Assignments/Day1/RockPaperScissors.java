package Day1.Assignments.Day1;

import java.util.*;
public class RockPaperScissors {
 static String playRound(String playerMove, String computerMove) {
 if (playerMove.equals(computerMove)) {
 return "Draw";
 }
 if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
 (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
 (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
 return "Player Wins";
 }
 return "Computer Wins";
 }
 static String getComputerMove() {
 String[] moves = {"Rock", "Paper", "Scissors"};
 Random random = new Random();
 return moves[random.nextInt(moves.length)];
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int rounds = 5;
 int wins = 0;
 int losses = 0;
 int draws = 0;
 String[] playerMoves = new String[rounds];
 String[] computerMoves = new String[rounds];
 String[] results = new String[rounds];
 for (int i = 0; i < rounds; i++) {
 System.out.print("Round " + (i + 1)
 + " - Enter Rock, Paper, or Scissors: ");
 String playerMove = scanner.nextLine();
 playerMove = capitalizeMove(playerMove);
 while (!playerMove.equals("Rock") &&
 !playerMove.equals("Paper") &&
 !playerMove.equals("Scissors")) {
 System.out.print("Invalid move. Enter Rock, Paper, or Scissors: ");
 playerMove = capitalizeMove(scanner.nextLine());
 }
 String computerMove = getComputerMove();
 String result = playRound(playerMove, computerMove);
 playerMoves[i] = playerMove;
 computerMoves[i] = computerMove;
 results[i] = result;
 if (result.equals("Player Wins")) {
 wins++;
 } else if (result.equals("Computer Wins")) {
 losses++;
 } else {
 draws++;
 }
 System.out.println("Computer: " + computerMove);
 System.out.println("Result: " + result);
 System.out.println();
 }
 double winPercentage = (wins * 100.0) / rounds;
 System.out.println("========== FINAL SUMMARY ==========");
 System.out.printf("%-8s %-15s %-15s %-20s%n",
 "Round", "Player Move", "Computer Move", "Result");
 for (int i = 0; i < rounds; i++) {
 System.out.printf("%-8d %-15s %-15s %-20s%n",
 i + 1,
 playerMoves[i],
 computerMoves[i],
 results[i]);
 }
 System.out.println();
 System.out.println("Wins: " + wins);
 System.out.println("Losses: " + losses);
 System.out.println("Draws: " + draws);
 System.out.printf("Win Percentage: %.1f%%%n", winPercentage);
 scanner.close();
 }
 static String capitalizeMove(String move) {
 move = move.trim().toLowerCase();
 if (move.equals("rock")) {
 return "Rock";
 } else if (move.equals("paper")) {
 return "Paper";
 } else if (move.equals("scissors")) {
 return "Scissors";
 }
 return move;
 }
}