import java.util.Scanner; 
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class five
{
    public static void main(String[] args) throws IOException
    {
        int choiceentry;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter one of the following commands:");
            System.out.println("1 - Search for a term");
            System.out.println("2 - Search for a keyword");
            System.out.println("3 - Exit");
            choiceentry = input.nextInt();

            switch (choiceentry)
            {
                case 1:
                System.out.println("You have selected to search for a term");
                SearchByTerm();
                break;
                case 2: 
                System.out.println("You have selected to search for a keyword");
                SearchByKeyword();
                break;
                case 3: 
                System.out.println("You have selected to exit");
                break;
                default:
                System.out.println("Choice must be a value between 1 and 3.");
            }   
        } while (choiceentry != 3);  
    }

    public static void SearchByTerm() throws IOException
    {
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("C:\\Users\\Joe\\Desktop\\college\\Computing\\Programming\\Bluej\\file.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Enter a term to search for: ");
        String term = input.nextLine();

        String myText;
        while((myText = br.readLine()) != null) {

            if(myText.equals(term)){                                   

                System.out.println("Found term: "+ term);              
                System.out.println("Description: " + br.readLine());   
                break;
            } else{
                System.out.println("Term not found");
                break;

            }

        }
        br.close();
    }
    
    public static void SearchByKeyword() throws IOException
    {
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("U:\\bluej\\file.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Enter a keyword to search for: ");
        String keyword = input.nextLine();

        String myText;
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        boolean found = false;
        for(int i = 0; i < lines.size(); i++){
            if(lines.get(i).indexOf(keyword) > -1){
                System.out.println("Term: " + lines.get(i - 1));
                found = true;
            } 
        } 
        if (found == false) {
            System.out.println("Keyword not found");
        }
        br.close();
    }
}
