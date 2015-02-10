import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HaikuGenerator{
	static ArrayList<Word> ones   = new ArrayList<Word>();
	static ArrayList<Word> twos   = new ArrayList<Word>();
	static ArrayList<Word> threes = new ArrayList<Word>();
	static ArrayList<Word> fours  = new ArrayList<Word>();
	static ArrayList<Word> fives  = new ArrayList<Word>();
	static ArrayList<Word> sixes  = new ArrayList<Word>();
	static ArrayList<Word> sevens = new ArrayList<Word>();
	public static String generateLine(int Syllables){
		Random rand = new Random();
		String line = "";
		int index;
		while(Syllables > 0){
			int syllable = rand.nextInt(Syllables) + 1;
			Syllables -= syllable;
			switch(syllable){
				case 1:
					index = (int) (rand.nextDouble() * ones.size());
					line+=ones.get(index).w;
					line+=" ";
					break;
				case 2:
					index = (int) (rand.nextDouble() * twos.size());
					line+=twos.get(index).w;
					line+=" ";
					break;
				case 3:
					index = (int) (rand.nextDouble() * threes.size());
					line+=threes.get(index).w;
					line+=" ";
					break;
				case 4:
					index = (int) (rand.nextDouble() * fours.size());
					line+=fours.get(index).w;
					line+=" ";
					break;
				case 5:
					index = (int) (rand.nextDouble() * fives.size());
					line+=fives.get(index).w;
					line+=" ";
					break;
				case 6:
					index = (int) (rand.nextDouble() * sixes.size());
					line+=sixes.get(index).w;
					line+=" ";
					break;
				case 7:
					index = (int) (rand.nextDouble() * sevens.size());
					line+=sevens.get(index).w;
					line+=" ";
					break;
			}
		}
		return line;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()){
			String cur = input.nextLine();
			String[] line = cur.split(",");
			cur = line[0];
			int syll = Integer.parseInt(line[1]);
			Word word = new Word(cur,syll);
			switch(syll){
				case 1:
					ones.add(word);
					break;
				case 2:
					twos.add(word);
					break;
				case 3:
					threes.add(word);
					break;
				case 4:
					fours.add(word);
					break;
				case 5:
					fives.add(word);
					break;
				case 6:
					sixes.add(word);
					break;
				case 7:
					sevens.add(word);
					break;
			}
		}
		System.out.println(generateLine(5));
		System.out.println(generateLine(7));
		System.out.println(generateLine(5));
	}
}