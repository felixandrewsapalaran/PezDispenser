/********************
Constant
********************/

public class Example {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new PEZ Dispenser");
    
    System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
    
    
    PezDispenser dispenser = new PezDispenser("Felix");

    
    System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName());//accessing getCharacterName
    
    
    //checking if the dispenser is empty
    if (dispenser.isEmpty()){
      System.out.println("Dispenser is empty");
    }
    
    //if its empty then refill it 
    System.out.println("Filling the dispenser with delicious PEZ...");
    //Calling the fill method
    dispenser.fill();
    
    //checking if the dispenser is not empty
    if(!dispenser.isEmpty()){
      System.out.println("Dispenser is full");
    }
    
    
    //Using while loop to keep it the dispenser dispensing till it becomes empty
    while (dispenser.dispense()){
      System.out.println("Chomp!");
    }
    
    //if the dispenser isEmpty display the message
    if(dispenser.isEmpty()){
      System.out.println("Ate all the PEZ...");
    }
    
    /*******************
    Ate Everything Here
    up to line 43
    *******************/
    
    
    
    /*******************
    Then we refill 4 + 2
    total 6 candys
    *******************/
    
    //filling up our dispenser
    dispenser.fill(4);//this time we'll filling up with 4
    dispenser.fill(2);//adding 2 in there
    
    //here using a while loop to keep dispensing if its still can
    while(dispenser.dispense()) {
       System.out.println("CHOMP!!");
    }
    
    /*******************
    Then ate all last six
    candy we've just added
    *******************/
    
  //New line of code her
     
    try{
      //trying to insert more than the MAXIMUM amount it allowed
    dispenser.fill(13);
    System.out.println("This will never happen");
    } catch (IllegalArgumentException iae){
      System.out.println("Whoa there!");
      System.out.printf("The error was %s", iae.getMessage());
    }
      
  }
  
 

}