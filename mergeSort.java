import java.util.Scanner;
import java.util.ArrayList;
public class mergeSort{
	public static ArrayList<Word> mergeSort(ArrayList<Word> list){
		int size = list.size();
		if(size <= 1){
			return list;
		}
		ArrayList<Word> left = new ArrayList<Word>(size);
		ArrayList<Word> right = new ArrayList<Word>(size);
		int middle = list.size()/2;
		for(int i=0; i < middle; i++){
			left.add(list.get(i));
		}
		for(int i=middle; i < list.size(); i++){
			right.add(list.get(i));
		}
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left,right);	
		}
	public static ArrayList<Word> merge(ArrayList<Word> left, ArrayList<Word> right){
		ArrayList<Word> result = new ArrayList<Word>(left.size() + right.size());
		while(left.size() > 0 || right.size() > 0){
			if(left.size() > 0 && right.size() > 0){
				if(left.get(0).w.compareTo(right.get(0).w) < 0){
					result.add(left.get(0));
					left.remove(0);
				}
				else{
					result.add(right.get(0));
					right.remove(0);
				}
			}
			else if(left.size() > 0){
				result.add(left.get(0));
				left.remove(0);
			}
			else if(right.size() > 0){
				result.add(right.get(0));
				right.remove(0);
			}
		}
		return result;
	}//end method merge
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Word> dict = new ArrayList<Word>();
		while(input.hasNextLine()){
			String cur = input.nextLine();
			String[] line = cur.split(",");
			Word word = new Word(line[0],Integer.parseInt(line[1]));
			dict.add(word);
		}
		dict = mergeSort(dict);
		for(int i=0; i < dict.size(); i++){
			System.out.println(dict.get(i).w + "," + dict.get(i).s);
		}
	}
}