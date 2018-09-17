package zadatak3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner unos=new Scanner(System.in);
    System.out.println("Unesite broj elemenata niza");
    int i=unos.nextInt();
    unos.nextLine();
    int[] niz=new int[i];
    for(int j=0;j<i;j++)
    {
    	System.out.print((j+1)+".");
    	niz[j] =unos.nextInt();
    }
    MyArray test=new MyArray(niz);
    System.out.println("Najmanji element niza je:");
    System.out.println(test.getSmallestElement());
    System.out.println("najveæi element niza je:");
    System.out.println(test.getLargestElement());
    System.out.println("Suma svih elemenata je:");
    System.out.println(test.sumAllElements());
    System.out.println("Elementi niza su:");
    test.printElements();
	}

}
