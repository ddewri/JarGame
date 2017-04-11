public class Game {
    public static void main(String[] args) {

      System.out.println("==========ADMINISTRATOR SETUP===============");
      Jar jar = new Jar();
  /*Create Jar to accept the items name*/
      String itemType = jar.itemType();
  /*Ask for maximum number of items*/
      int noOfItems = jar.noOfItems();
  /*Fill the jar with a random number*/    
      jar.fill();
  /*Inform player about the game*/
      System.out.printf("===============Player======================%n");    
      System.out.printf("Your goal is to guess how many %s are ine the jar. Your guess should be between 1 and %d%n",itemType,noOfItems);     
      
      System.out.print("Please enter your guess: ");
 /*Accept the guess*/
      
      boolean mainResult= false;
        try {
        mainResult=jar.guess();
        if (jar.gethighLowInd()){
        System.out.println("Your response is either too high or too low");    
                        }
            } catch(IllegalArgumentException iae) {
        System.out.println(iae.getMessage());
            }
 /*If guess is not correct, ask player to guess again*/
      while (!mainResult){
        System.out.print("Try again: ");    
        try {
        mainResult=jar.guess();
        if (jar.gethighLowInd()){
          System.out.println("Your response is either too high or too low");   
        }
          
        } catch(IllegalArgumentException iae) {
        System.out.println(iae.getMessage());
            }

      } 
 /*Get the number of attempts before player guessed the correct number*/
      int noOfAttempts = jar.getAttempts();
      int rightGuess = jar.getTheNumber();
      System.out.printf("Congratulations - you guessed that there are %d %s. It took you %d attempts to guess right.%n",rightGuess, itemType, noOfAttempts);
    }
}
