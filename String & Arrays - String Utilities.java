//String & Arrays - String Utilities
class stringarraysstringutilities
{
  
  public static void subAssignment()   
  {
    String countLetters = "Count Letters";
    String countWord = "Count Word";
    String capEveryWord = "Capitalize Every Word";
    String revereStatement = "Reverse Statement";
    String revereLetters = "Reverse Letters";
    String reverseWord = "Reverse Word";
    String alternateCase = "Alternate Case";
    String letterFrequency = "Letter Frequency";
    String consonantsVsVowels = "Consonants vs Vowels";
    String lettersOnly = "Letters Only";
    String search = "Search";
    String searchAndReplace = "Search And Replace";
    
    String letterA = "";
    String letterB = "";
    String letterC = "";
    String letterD = "";
    String letterE = "";
    String letterF = "";
    String letterG = "";
    String letterH = "";
    String letterI = "";
    String letterJ = "";
    String letterK = "";
    String letterL = "";
    
    letterA = "A";
    letterB = "B";
    letterC = "C";
    letterD = "D";
    letterE = "E";
    letterF = "F";
    letterG = "G";
    letterH = "H";
    letterI = "I";
    letterJ = "J";
    letterK = "K";
    letterL = "L";
    
    
    countLetters = letterA  +" - " + countLetters;
    countWord = letterB  +" - " + countWord;
    capEveryWord = letterC  +" - " + capEveryWord;
    revereStatement = letterD  +" - " + revereStatement;
    revereLetters = letterE  +" - " + revereLetters;
    reverseWord = letterF  +" - " + reverseWord;
    alternateCase = letterG  +" - " + alternateCase;
    letterFrequency = letterH  +" - " + letterFrequency;
    consonantsVsVowels = letterI  +" - " + consonantsVsVowels;
    lettersOnly = letterJ  +" - " + lettersOnly;
    search = letterK  +" - " + search;
    searchAndReplace = letterL  +" - " + searchAndReplace;
    System.out.println(countLetters + "(This sub program will count the amount the letters you have entered)");
    System.out.println(countWord + "(This sub program will count the amount the words you have entered)");
    System.out.println(capEveryWord +"(This sub program will Capitalize every word you have entered)" );
    System.out.println(revereStatement);
    System.out.println(revereLetters);
    System.out.println(reverseWord);
    System.out.println(alternateCase);
    System.out.println(letterFrequency);
    System.out.println(consonantsVsVowels);
    System.out.println(lettersOnly);
    System.out.println(search);
    System.out.println(searchAndReplace);
  } 
  
  
  
  
  public static void doLetterSS(String letters)
//INPUT FROM USER
  {
    System.out.print("Please enter a statement");
    letters = In.getString (); 
    String str = letters;
    int counter = 0;
    {
//COUNTING LETTERS     
      for (int i = 0; i < str.length(); i++)
      {
        if (Character.isLetter(str.charAt(i)))
          counter++;
      }
//OUTPUT FRO PROGRAM
      System.out.println(counter + " letters.");
    }
  }
  
  
// Reverse  
  public static void reverse(String statement){
    System.out.println("Please enter a statement?");
    statement = In.getString();
    String result="";
    for(int i = statement.length()-1; i<=0; i--) {
      result = result + statement.charAt(i);
    }
    System.out.println(result);
  }
  
  
// Cap words method  
public static void capWord(String statement)
{
    
    System.out.println("Please enter your statement?");
    statement = In.getString();
    
    String capitalize = null;
    for(int i=0; i< (statement.length());i++){
      
      if(statement.charAt(i)==' '){
        
        capitalize= capitalize.substring(0,i+1)+statement.substring(i+1,i+2).toUpperCase()+statement.substring(i+2);
        
      }else if(i==0){
        
        capitalize=statement.substring(0,1).toUpperCase()+statement.substring(1);
        
      }
    }
    System.out.println("statement: "+capitalize);
  }
  
  
// Main code  
  public static void main (String[] args){
    String letters= "";
    String statement = "";

    System.out.print("Please enter you first name");
    String userName = "";
    userName = In.getString();
    System.out.println();
    System.out.println( userName + " Welcome to Subprograms Menu");
    System.out.println();
// Dispapling options
    subAssignment();
// Getting what program to run
    String runProgram = "";
    System.out.print("Please enter a letter between A to L");
    runProgram = In.getString();
    System.out.println();
    if(runProgram.equals ("A") || runProgram.equals ("a"))
    {
      doLetterSS(letters);
    }
    if(runProgram.equals ("B") || runProgram.equals ("b"))
    {
      //Count word
    }
    if(runProgram.equals ("B") || runProgram.equals ("b"))
    {
      
    }
    if(runProgram.equals ("C") || runProgram.equals ("c"))
    {
      capWord(statement);
    }
    if(runProgram.equals ("D") || runProgram.equals ("d"))
    {
      
    }
    if(runProgram.equals ("E") || runProgram.equals ("e"))
    {
      reverse(statement);
    }
    
  }
}
