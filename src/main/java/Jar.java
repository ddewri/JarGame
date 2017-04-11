import java.util.Random; 
import java.util.Scanner;
public class Jar {
    
  
  private String items;
  private int maxNoItem;
  private int someNumber;
  private String newItem;
  private int attempts;
  private int guessANum;
  private boolean highLowInd = false;
  Scanner scanner = new Scanner(System.in);
  
  public Jar(){
    attempts = 0;
  }
   
  public String itemType(){
      System.out.print("Name of the items in the Jar: ");
      newItem = scanner.nextLine();
      return newItem;
  }
  
  public int noOfItems (){
      System.out.printf("Maximum amount of %s: ",newItem);
      maxNoItem = scanner.nextInt();
            return maxNoItem; 
   }
  
  public void fill(){
      Random random = new Random();  
      someNumber = random.nextInt(maxNoItem);
  //    System.out.printf("Random no. is %d%n",someNumber);//remove in the final program
  }  
  
  public int getAttempts(){
    return attempts;
  }
  
  public boolean gethighLowInd(){
  return highLowInd;
  }
  
  public int getTheNumber(){
    return someNumber;
  }
  
  public boolean guess(){      
      highLowInd = false;  
      boolean result = false;  
    guessANum = scanner.nextInt();
      if (guessANum > maxNoItem){
        throw new IllegalArgumentException ("Your guess must be less than maximum fill amount"); 
        }
        
      if (guessANum == someNumber){
        result = true;
        }
      if (guessANum > (someNumber + 10) || guessANum < (someNumber - 10)){
        highLowInd = true;
        System.out.print("number is hig");
        } 
      attempts++;
    return result;
    }
} 

