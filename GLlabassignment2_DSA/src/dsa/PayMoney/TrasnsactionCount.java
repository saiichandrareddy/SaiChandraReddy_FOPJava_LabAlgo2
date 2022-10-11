package dsa.PayMoney;

import java.util.Scanner;

public class TrasnsactionCount {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the size of transaction array");
			int T_arraySize = scan.nextInt();
			int[] T_array = new int[T_arraySize];
			System.out.println("enter the values of array");
			for(int i=0;i<T_arraySize;i++) {
				T_array[i] = scan.nextInt();
			}
			System.out.println("enter the total no of targets that needs to be achieved");
			int TargetNO = scan.nextInt();
			while(TargetNO--!=0) {
				System.out.println("enter the value of target");
				long TargetValue = scan.nextLong();
				long sum = 0;
				int count = 0;
				for(int i=0;i<T_arraySize;i++) {
					sum = sum + T_array[i];
					if(sum>=TargetValue) {
						System.out.println("Target achieved after "+(i+1)+" transactions"); 
						System.out.println();
						count = 1;
						break;
					}
				}
				if (count == 0) {
					System.out.println("Given target is not achieved");
				}
			}
			scan.close();
		}
	}

