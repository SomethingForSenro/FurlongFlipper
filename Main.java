import java.util.Scanner;
import java.io.*;

class Main {
  
  static Scanner watcher = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Hello, world!");

    System.out.println("What type of unit are you converting? \n    ~ LENGTH\n    ~ TIME\n    ~ SPEED");
    String unit = watcher.nextLine().toUpperCase();
    //get unit type

    //break away
    if (unit.equals("LENGTH")) {
      Length.ask();
    } else if (unit.equals("TIME")) {
      Time.ask();
    } else if (unit.equals("SPEED")) {
      Speed.ask();
    } else {
      System.out.println("You done goofed! Please restart the program.");
    } //end if
  } //end main
} //end program
