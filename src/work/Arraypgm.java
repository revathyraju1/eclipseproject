package work;

public class Arraypgm {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos, neg, nul, i;
		 int A[]= {1,2,0,0,-2,-3};

		

		pos = 0;
		neg = 0;
		nul = 0;

		for (i = 0; i <= 15; i++) {
		    if (A[i] > 0) {
		        pos++;
		    }
		    if (A[i] < 0) {
		        neg++;
		    }
		    if (A[i] == 0) {
		        nul++;
		    }
		}

	}

}
