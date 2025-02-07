import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
// already did single line like mary had a little lamb 
// 1. doing multiple line files with 2. different number of tokens for one file 

public class FileReads {
    public static void main (String [] args) throws FileNotFoundException
    {
    Scanner in= new Scanner (new File ("./wordpopbyLine.txt"));
    double value ; //3
    String country ; //4
    while (in.hasNextLine ())
    {  
        //country = in.nextLine ();
       // value = in.nextDouble (); 
        //in.nextLine ();
        //System.out.println ("The count is " +country + " And the value is " +value) ;
       
        //parse by token 
        
        Scanner lineScanner = new Scanner (in.nextLine()); 
        country = lineScanner.next();
        //moving pointer one token ahead
        //if not a number, then fetch it as a String. 
        
        while (!lineScanner.hasNextInt ())
        {
        country = country + " " + lineScanner.next ();
    }
        
        
        value = lineScanner.nextInt ();
        System.out.println("**" + lineScanner.next());
        
        System.out.printf ("The country is %s (Population: %.0f)\n", country, value);}
        
        // parse by character
         
     //String line = in.nextLine (); mult lines
     //String line = in.nextLine ();
     //int i=0 ;
     // not a digit
     //while (!Character.isDigit(line.charAt(i)))
     
     //{i++;}
     //country = line.substring(0,i).trim ();
     //value = Double.parseDouble (line.substring (i).trim ()); 
     
     //System.out.printf("The country is %s (Population: %.0f)\n", country, value); //4
     
     //System.out.printf("%.2f\n",value); //3
     
     //System.out.println (i); 2
     //System.out.println (line); mult lines */
    }
    }

