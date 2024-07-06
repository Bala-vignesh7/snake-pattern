package main;
import java.util.*;

public class snake_pro {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		//int b=in.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				arr[i][j]=in.nextInt();
			}}
			for(int i=0;i<a;i++) {
				if(i%2==0) {
					for(int j=0;j<a;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
				else {
					for(int j=arr.length-1;j>=0;j--) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
		}

	}

}
