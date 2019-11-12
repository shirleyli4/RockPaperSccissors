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
        String choice = input.nextLine();
        return "You chose "+choice+".";
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
        String crock = "The computer chose rock.";
        String cpap= "The computer chose paper.";
        String csci = "The computer chose scissors.";
        String prock = "You chose rock.";
        String ppap= "You chose paper.";
        String psci = "You chose scissors.";
        //different probabilities
        if((computer.equals(crock)&&person.equals(ppap))||(computer.equals(cpap)&&person.equals(psci))||(computer.equals(csci)&&person.equals(prock))){
            return win;
        }else if((computer.equals(crock)&&person.equals(psci))||(computer.equals(cpap)&&person.equals(prock))||(computer.equals(csci)&&person.equals(ppap))){
            return los;
        }else if((computer.equals(crock)&&person.equals(prock))||(computer.equals(cpap)&&person.equals(ppap))||(computer.equals(csci)&&person.equals(psci))){
            return tie;
        }else{
            return "invalid input!";
        }
    }
}
