import java.util.Scanner;
import java.io.*;

class Length {

  static Scanner lengthGet = new Scanner(System.in);
  String sendTo;
  
  public static void ask() {
    System.out.println("What unit system do you want to convert out of?");
    String system = lengthGet.nextLine().toLowerCase();
    //get unit system

    //calculating time!
    if (system.equals("metric")) {
      System.out.println("Okay! What metric unit are you using?");
      String unit = lengthGet.nextLine().toLowerCase();
      //get unit
      if (unit.equals("centimeter")) {
        try {
          System.out.println("How many centimeters?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("meter")) {
        try {
          System.out.println("How many meters?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("kilometer")) {
        try {
          System.out.println("How many kilometers?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else {
        System.out.println("You done goofed! Please restart the program.");
      } //end nested if
    } //end metric
    else if (system.equals("imperial")) {
      System.out.println("Okay! What imperial unit are you using?");
      String unit = lengthGet.nextLine().toLowerCase();
      //get unit
      if (unit.equals("inch")) {
        try {
          System.out.println("How many inches?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("foot")) {
        try {
          System.out.println("How many feet?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("yard")) {
        try {
          System.out.println("How many yards?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("furlong")) {
        try {
          System.out.println("How many furlongs?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("mile")) {
        try {
          System.out.println("How many miles?");
          int valueIn = lengthGet.nextInt();
          //get number of units
          double middleMan = prepare(valueIn, unit);
          askB(middleMan);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else {
        System.out.println("You done goofed! Please restart the program.");
      } //end nested if
    } //end imperial
  } //end ask method

  public static double prepare(double valueFrom, String unitFrom) {
    double canonicalValue = valueFrom;
    double convertibleValue = 0.0;
    //convert input to backend value
    if (unitFrom.equals("centimeter")) {
      double CONVERSION_RATE = 2514600000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("meter")) {
      double CONVERSION_RATE = 25146000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("kilometer")) {
      double CONVERSION_RATE = 25146.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("inch")) {
      double CONVERSION_RATE = 990000000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("foot")) {
      double CONVERSION_RATE = 82500000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("yard")) {
      double CONVERSION_RATE = 27500000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("furlong")) {
      double CONVERSION_RATE = 125000.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else if (unitFrom.equals("mile")) {
      double CONVERSION_RATE = 15625.0;
      convertibleValue = canonicalValue / CONVERSION_RATE;
    } else {
      System.out.println("You done goofed! Please restart the program.");
    } //end nested if
    return convertibleValue;
  } //end prepare method

  public static void askB(double middleMan) {
    System.out.println("Okay! What unit system are you converting to?");
    String systemTo = lengthGet.next().toLowerCase();
    //get unit system

    //calculating time!
    if (systemTo.equals("metric")) {
      System.out.println("Okay! What metric unit are you using?");
      String unit = lengthGet.next().toLowerCase();
      //get unit
      if (unit.equals("centimeter")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("meter")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else if (unit.equals("kilometer")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else {
        System.out.println("You done goofed! Please restart the program.");
      } //end nested if
    } //end metric
    else if (systemTo.equals("imperial")) {
      System.out.println("Okay! What imperial unit are you using?");
      String unit = lengthGet.next().toLowerCase();
      //get unit
      if (unit.equals("inch")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } 
      else if (unit.equals("foot")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } 
      else if (unit.equals("yard")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } 
      else if (unit.equals("furlong")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } 
      else if (unit.equals("mile")) {
        try {
          double valueIn = middleMan;
          //get number of units
          convert(valueIn, unit);
        } catch (Exception e) {
          System.out.println("Sorry! That's not a number. Please restart the program.");
        } //end try
      } else {
        System.out.println("You done goofed! Please restart the program.");
      } //end nested if
    } //end imperial
  } //end ask method

  public static void convert(double valueFrom, String unitTo) {
    double convertibleValue = valueFrom;
    double finalValue = 0.0;
    if (unitTo.equals("centimeter")) {
      double CONVERSION_RATE = 2514600000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " centimeters.");
    } else if (unitTo.equals("meter")) {
      double CONVERSION_RATE = 25146000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " meters.");
    } else if (unitTo.equals("kilometer")) {
      double CONVERSION_RATE = 25146.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " kilometers.");
    } else if (unitTo.equals("inch")) {
      double CONVERSION_RATE = 990000000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " inches.");
    } else if (unitTo.equals("foot")) {
      double CONVERSION_RATE = 82500000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " feet.");
    } else if (unitTo.equals("yard")) {
      double CONVERSION_RATE = 27500000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " yards.");
    } else if (unitTo.equals("furlong")) {
      double CONVERSION_RATE = 125000.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " furlongs.");
    } else if (unitTo.equals("mile")) {
      double CONVERSION_RATE = 15625.0;
      finalValue = convertibleValue * CONVERSION_RATE;
      System.out.println("That's " + finalValue + " miles.");
    } else {
      System.out.println("You done goofed! Please restart the program.");
    } //end nested if
  } //end convert
} //end length class
