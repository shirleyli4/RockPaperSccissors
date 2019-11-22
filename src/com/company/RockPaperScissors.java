//Shirley Shuzhou Li 11/12/19 this program is devoted to a rock paper scissors game
package com.company;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main (String[] args){
        //invoke
        String user = getUserChoice();
        System.out.println(user);
        String comp = getComputerChoice();
        System.out.println(comp);
        System.out.println(whoWins(comp,user));
    }
    public static String getUserChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        String choice = input.nextLine();
        return choice;
    }
    public static String getComputerChoice(){
        int num = (int)(Math.random()*3);
        if(num==0){
            return "paper";
        }else if(num==1){
            return "scissors";
        }else{
            return "rock";
        }
    }
    public static String whoWins(String computer, String person){
        String win ="You win!";
        String los ="The computer wins!";
        String tie ="You tied!";
        String crock = "rock";
        String cpap= "paper";
        String csci = "scissors";
        String prock = "rock";
        String ppap= "paper";
        String psci = "scissors";
        String ret= "You chose "+person+"."+"\n"+"The computer chose "+computer+"."+"\n";

        //different probabilities
        if((computer.equals(crock)&&person.equals(ppap))){
            return ret+win;
        }else if((computer.equals(cpap)&&person.equals(psci))){
            return ret+win;
        }else if((computer.equals(csci)&&person.equals(prock))){
            return ret+win;
        }else if((computer.equals(crock)&&person.equals(psci))){
            return ret+los;
        }
        else if((computer.equals(cpap)&&person.equals(prock))){
            return ret+los;
        }
        else if((computer.equals(csci)&&person.equals(ppap))){
            return ret+los;
        }else if((person.equals(ppap)&&computer.equals(cpap))) {
            return ret+tie;
        }else if((person.equals(psci)&&computer.equals(csci))) {
            return ret+tie;
        } else{
            return ret+tie;
        }
    }
}