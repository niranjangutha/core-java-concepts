package ArrayPrograms;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int temp;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the input values:");
			a[i]=sc.nextInt();

		}
		for(int i = 0; i < 5; i++)
        {
            for(int j = i + 1; j < 5; j++)
            {
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.println("large number:"+a[0]);
		
		
	}

}
