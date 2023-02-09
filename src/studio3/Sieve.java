package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter max number: ");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n + 1];
		//int[] sieve = new int[n];
		for(int i = 2; i <= sieve.length-1; i++)
		{
			sieve[i] = true;
		}
		//if(sieve[i] = true)

		for(int k = 2; k < sieve.length/2; k++)
		{
			for(int j = k * 2; j < sieve.length; j += k)
			{
				sieve[j] = false;
			}

		}

		for(int z = 0; z < sieve.length; z++)
		{
			if(sieve[z])
			{
			System.out.println(z);
			}
		}

	}


	

}
