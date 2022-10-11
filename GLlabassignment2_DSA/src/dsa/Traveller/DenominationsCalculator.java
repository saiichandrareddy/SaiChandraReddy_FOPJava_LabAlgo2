package dsa.Traveller;

import java.util.Scanner;

public class DenominationsCalculator {
	public void minDenominations() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of currency denominations ");
	    int Denominationssize = s.nextInt();   
		int[] denomValues = new int[Denominationssize];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<Denominationssize;i++)  // FOR LOOP TO ENTER THE VALUES IN ORDER
			denomValues[i]=s.nextInt();
		Sorting ss = new Sorting();          //CREATING AN OBJECT OF SORTING TO ACCESS SORT
		ss.sort(denomValues);                //SORTS THE RANDOM ARRAY FROM DESCENDING TO ASCENDING
		System.out.println("enter the amount you want to pay");
		int Amount = s.nextInt();
		int[] noteCount = new int[Denominationssize];    
		for(int i = 0;i<Denominationssize;i++) {
			if(Amount>=denomValues[i]) {
				noteCount[i] = Amount/denomValues[i];  //MAINTAINS THE COUNT OF MIN DENOMINATIONS TO PAY THE AMOUNT
				Amount = Amount % denomValues[i];     // RETURNS THE REMAINING AMOUNT VALUE TO AMOUNT
			}
		}	
		s.close();
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i = 0 ;i<Denominationssize;i++) {
			if(noteCount[i]!=0) {             
			System.out.println(denomValues[i]+" : "+noteCount[i]);
		}
		}
	}
}
