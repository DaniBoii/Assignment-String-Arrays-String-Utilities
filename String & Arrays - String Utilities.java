//String & Arrays - String Utilities
class stringarraysstringutilities
{
  public static void main (String[] args){
    System.out.println("Please enter you first name");
    String userName = "";
    userName = In.getString();
    System.out.println( userName + " Welcome to Subprograms Menu");
// User picks what they want to do
    subAssignment();
  }


  
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
    String letterM = "";
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
    letterM = "M";
    
      countLetters = letterA  +" - " + countLetters;
      countLetters = letterB  +" - " + countLetters;
      countLetters = letterC  +" - " + countLetters;
      countLetters = letterD  +" - " + countLetters;
      countLetters = letterE  +" - " + countLetters;
      countLetters = letterF  +" - " + countLetters;
      countLetters = letterG  +" - " + countLetters;
      countLetters = letterH  +" - " + countLetters;
      countLetters = letterI  +" - " + countLetters;
      countLetters = letterJ  +" - " + countLetters;
      countLetters = letterK  +" - " + countLetters;
      countLetters = letterL  +" - " + countLetters;
      countLetters = letterM  +" - " + countLetters;
      System.out.println(countLetters + "(This sub program will count the amount the letters you have entered)");
      
    }

}
