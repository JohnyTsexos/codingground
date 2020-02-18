import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HelloWorld{

     public static void main(String []args){
//edw deixnw spitaki

int[] roomDoors= { 2, 3, 2, 3, 4 ,3 ,2 ,3 ,2};
          int myRoom=0;
          int i=0;
          int nextRoom=0;
          boolean state= true;
          System.out.println("      |-| ");
          System.out.println("     _____ ");
          System.out.println("   /    \\  \\           _ ");
          System.out.println("   | _  |  |        |_|  ");
          System.out.println(" __|| | | _|___**____|_____**__");
          
          /*System.out.println("it is dark...must be midnight....");
          System.out.println("You wake up...an old house next to you....");
          System.out.println("A label...scratched and empty...");*/
          System.out.println("You enter the main door... a number hanging on the door bell....");
          System.out.println("..9..");
          myRoom=9;
        /*for(i=0;i<=8;i++){  
            int y=i+1;
            System.out.println("room "+ y + " has :" + roomDoors[i] + " doors");
            
        }
        */
     //edw prpei na tou knaw print kati ti na kaneiii   
        
        //CHECK ROOM CHOICE
        System.out.println("inside the room there are " + roomDoors[myRoom-1] + " doors....");
          Scanner sc = new Scanner(System.in);
          int number;
          number = sc.nextInt();
         if(number == 6){
               System.out.println("You entered room no: " + number +" which has: "+roomDoors[number] +" rooms");
         }
               /* 
          }else if(sc=8){
              System.out.println("You entered room no: " + sc +" which has:"+roomDoors[sc] +"rooms");
          }else{ 
              System.out.println("WRONG");
          }
          */
             
        //FINISH COISE ROOM
        
     }
}
