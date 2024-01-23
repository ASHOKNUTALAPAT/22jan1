package training18oct;

import java.util.Scanner;

public class Binaryops {
	static int binaryEval(String str) {
		int res=str.charAt(0)-'0';
		int i=1;
		char op=0;
		if(str==null || str.length()%2==0)
			return -1;
		while(i<str.length()) {
			op=str.charAt(i);
			i++;
			if(op=='A')
				res=res & str.charAt(i)-'0';
			if(op=='B')
				res=res | str.charAt(i)-'0';
			if(op=='C')
				res=res ^ str.charAt(i)-'0';
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String bin=s.next();
		System.out.println(binaryEval(bin));
	}

}
