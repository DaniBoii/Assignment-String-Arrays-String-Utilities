class main
{
public static void main (String[] args){
    String letters= "";
    
    System.out.println("Please enter you first name");
    String userName = "";
    userName = In.getString();
    System.out.println( userName + " Welcome to Subprograms Menu");
// Dispapling options
    subAssignment();
// geting what program to run
     String runProgram = "";
    runProgram = In.getString();
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
  }
  }