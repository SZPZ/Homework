import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileHandling {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("U:\\Desktop_2k\\text.txt");
		BufferedReader br = new BufferedReader(fileReader);
		String line;
		String[][] textFile = new String[5][2];
                             int = 0;
		while((line = br.readLine()) != null){
                                           String number = line.substr(0, 6);
                                           String food = line.substr(6, line.length);
                                           String[] items = new String[] { number, food };
			textFile[i] = items;
                                           i = i + 1;
		}
		br.close();
	}
}
