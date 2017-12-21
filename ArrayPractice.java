package lab04;

import java.util.*;

public class ArrayPractice {

	public static void main(String[] args) {
		
		//double Same
		int n = 10; //number of a group of people
		int m = 1000; //repeated random tests
	
		//while the tests are true, int n will add one after each iteration
		boolean[] SameBirthday = new boolean[m];
			while(true) {
				n++;
		
		//if two individuals have the same birthday, the iterations will stop
			int prob = (int)(m * Math.random());
				if (SameBirthday[prob])
					break;
					SameBirthday[prob] = true;
		}
		
		System.out.println(n);
		

	}

}