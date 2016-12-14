import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {
	public static void main(String[] args) throws IOException {
		boolean[] lotteryNumbers = new boolean[50];
		int numberOfSelectedBalls = 0;
		while(numberOfSelectedBalls != 6){
		int winningBall; // winning number
			do {winningBall = (int) (Math.random() * 50);
			} while(winningBall == 0);
			if(lotteryNumbers[winningBall] == false){
				lotteryNumbers[winningBall] = true;
				numberOfSelectedBalls = numberOfSelectedBalls + 1;
			}
		}
		
		FileWriter fileWriter = new FileWriter("U:\\Desktop_2k\\lottery.txt");
		fileWriter.write("Winning balls: ");
		for(int i = 0; i < lotteryNumbers.length; i++){
			if(lotteryNumbers[i]) fileWriter.write(i + ", ");
		}
	}
}
