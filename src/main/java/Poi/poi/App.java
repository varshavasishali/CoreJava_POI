package Poi.poi;
import java.io.PrintWriter;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
       String filename="out.txt";
       PrintWriter writer = new PrintWriter(filename);
       ReadExcel read=new ReadExcel();
    	}
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
