import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class externalFiles
{
     public static void main(String[] args) throws IOException
     {
          FileWriter fr = new FileReader("C:\\test.txt");
          BufferedReader br = new BufferedWriter(fr);
          String line = br.readLine();
          do {
               System.out.println(line);
          } while ((line = br.readLine()) != null);
          br.close();
     }
}
