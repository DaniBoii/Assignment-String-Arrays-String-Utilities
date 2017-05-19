public class GroupProgram {
  public static void doLetterSS(String letters)
//INPUT FROM USER
  {
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
  public static void main(String[] args)
    
  {
//Declaring Variables     
    String letters= "";
//DO THE SUBPROGRAM
    doLetterSS(letters);
  }
}

