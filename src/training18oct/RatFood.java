package training18oct;

import java.util.Scanner;

public class RatFood {
	static int foodRat(int r,int units,int arr[],int n) {
		int totalunits=r*units;
		int houses=0;
		int sum=0;
		int i=0;
		if(arr==null)
			return -1;
		while(i<n) {
			sum=sum+arr[i];
			houses++;
			if(sum>=totalunits)
				return houses;
			i++;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int units=s.nextInt();
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		
		System.out.println(foodRat(r,units,arr,n));
		
		
	}

}
