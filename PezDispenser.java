/********************
Constant
********************/

class PezDispenser {
  
  public static final int MAX_PEZ = 12;
    
 
  final private String characterName;

  
  private int pezCount;
  
 
  public PezDispenser(String CharacterName) {
    
    this.characterName = CharacterName;
    
    //initial value set to 0 
    pezCount = 0;
  }
  
  //creating a method for fill
  public void fill(){
    
    fill(MAX_PEZ);
    
  }
  
  
  public void fill(int pezAmount){
    //Take whatever in out pezCount and we going to add our pezAmount
    /*pezCount += pezAmount;*/
    
    //New line of code here
    int newAmount = pezCount + pezAmount;
    
    //check if its more than it allows 
    if (newAmount > MAX_PEZ) {
      //then it will throw this exception
      throw new IllegalArgumentException("Too many PEZ!!!");
    }
    
    pezCount = newAmount;
    
  }
  
  public boolean dispense() {
    //storing the default value here & set it to false
    boolean wasDispensed = false;
    
    if(!isEmpty()){
    //if its not empty we want to decrement the PezCount
     pezCount--;
    //then set wasDispensed to true
      wasDispensed = true;
    }
    
    //then return what was dispensed
    return wasDispensed;
  
  }
  
  
  
  public boolean isEmpty(){
    return pezCount == 0;
  }
  
  
 
  public String getCharacterName(){
  
    
    return characterName;
  }
  
  
}