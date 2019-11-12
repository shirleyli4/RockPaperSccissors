//Shirley Shuzhou Li 11/12/19 this program is devoted to a rock paper scissors game
package com.company;
import java.util.Scanner;
public class RockPaperSccissors {
    public static void main (String[] args){
        //invoke
        String user = getUserChoice();
        String computer = getComputerChoice();
        whoWins(computer,user);
    }
    public static String getUserChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        return "You chose "+input.nextLine()+".";
    }
    public static String getComputerChoice(){
        int num = (int)(Math.random()*3);
        if(num==0){
            return "The computer chose rock.";
        }else if(num==1){
            return "The computer chose scissors.";
        }else{
            return "The computer chose paper.";
        }
    }
    public static String whoWins(String computer, String person){
        String win ="You win!";
        String los ="You lose!";
        String tie ="It is a tie!";
        String rock = "rock";
        String pap= "paper";
        String sci = "scissors";
        //different probabilities
        if((computer.equals(rock)&&person.equals(pap))||(computer.equals(pap)&&person.equals(sci))||(computer.equals(sci)&&person.equals(rock))){
            return win;
        }else if((computer.equals(rock)&&person.equals(sci))||(computer.equals(pap)&&person.equals(rock))||(computer.equals(sci)&&person.equals(pap))){
            return los;
        }else if((computer.equals(rock)&&person.equals(rock))||(computer.equals(pap)&&person.equals(pap))||(computer.equals(sci)&&person.equals(sci))){
            return tie;
        }else{
            return "invalid input!";
        }
    }
}
