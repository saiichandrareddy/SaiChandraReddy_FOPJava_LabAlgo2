package dsa.Traveller;


public class Sorting {
	void sort(int[] Arrayy) {
	int temp = 0;
	int L = Arrayy.length;
	for(int i = 0;i<L;i++) {
		for(int j = 1; j<(L-i);j++) {
			if(Arrayy[j]>Arrayy[j-1]) {
				temp = Arrayy[j-1];
				Arrayy[j-1] = Arrayy[j];
				Arrayy[j] = temp;
			}
		}
	}
  }
}
