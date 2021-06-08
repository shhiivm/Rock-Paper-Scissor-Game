import java.util.Scanner;
import java.util.Random;

public class rockPaper {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:-\n \"0\" for ROCK \n \"1\" for PAPER\n \"2\" for SCISSOR");
        int user = sc.nextInt();
        
        if(user==0){
            System.out.println("You Selected\"ROCK\"");
        }
        else if(user ==1){
            System.out.println("You Selected\"PAPER\"");
        }
        else if(user ==2){
            System.out.println("You Selected\"SCISSOR\"");
        }
        else{
            System.out.println("Please Select from given option");
        }


        Random rn = new Random();
        int com = rn.nextInt(3);
        if(com==0){
            System.out.println("Computer Selected \"ROCK\"");
        }
        else if(com==1){
            System.out.println("Computer Selected\"PAPER\"");
        }
        else{
            System.out.println("Computer Selected\"SCISSOR\"");
        }

        if(user==com){
            System.out.println("Match Drawn");
        }
        else if(user==0 && com ==2 ){
            System.out.println("You Won!");
        }
        else if(user==2 && com ==1 ){
            System.out.println("You Won!");
        }
        else if(user==1 && com ==0 ){
            System.out.println("You Won!");
        }
        else{
            System.out.println("Computer Won!");
        }
        
    }

    
}
