
public class ArrayPractice{


	public static void main(String[] args){
		int numlist[]=new int[5];
		for(int x=0;x<5;x++){
		numlist[x]=x;
		System.out.println(numlist[x]);
		}
		numlist.append(3);
		System.out.println(numlist[5]);
		
	}
}