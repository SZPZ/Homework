import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class  fileHandling {
	public static void main(String[] args) throws IOException {
                      String[] students1 = new String[] { "Sophie", "Stanfield", "Class 5" };
                      String[] students2 = new String[] { "James", "Kitson", "Class 5" };
                      String[] students3 = new String[] { "Zoe", "Gaskill", "Class 1" };
                      String[] students4 = new String[] { "Paul", "Johns", "Class 1" };
                      String[] students5 = new String[] { "Freya", "Moore", "Class 5" };
String[][] students = { students1, students2, students3, students4, students5};
		FileWriter fr = new FileWriter("U:\\Desktop_2k\\data.txt");
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students[i].length; j++){
				fr.write(students[i][j] + "\t");
                                                          fr.newLine();
			}
		}
		fr.close();
	}
}
