public class NoSpaces
{
  public static void main(String[] args)
  {
//VARIBLES
    String[] name = new String[1];
    name[0] = In.getString();

    String[] parts = name;
//HOLD THE SEPERATE NAMES
    for (int j = 0; j <= 0;j++)
    {
      parts = name[j].split(" ");   
  
//PRINT THE WORDS      
      for(int i = 0; i < parts.length; i++) //All Other Names
      {          
        System.out.print(parts[i]);        
      }  
    } 
  }
}