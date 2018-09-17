package zadatak2;

import java.util.Scanner;

public class test {
	public static void meni()
	{
	System.out.println("1.racunar");
	System.out.println("2.Laptop");
	System.out.println("0.izlaz");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
    Racunar test;
    meni();
    System.out.println("unesite opciju");
    int t=unos.nextInt();
    unos.nextLine();
    switch(t)
    {
    case 1:
    System.out.println();
    System.out.println("Unesite kolicinu rama u GB");
    double ram=unos.nextDouble();
    unos.nextLine();
    System.out.println("Unesite kapacitet HD u GB");
    double hd=unos.nextDouble();
    unos.nextLine();
    System.out.println("Unesite brzinu procesora u GHz");
    double procesor=unos.nextDouble();
    unos.nextLine();
    System.out.println("Unesite dijagonalu monitora u inch");
    double monitor=unos.nextDouble();
    System.out.println("unesite nabavnu cijenu");
    double cijena=unos.nextDouble();
    unos.nextLine();
    unos.nextLine();
    test=new Racunar(ram,hd,procesor,monitor,cijena);
    System.out.println(test.toString());
    break;
    case 2:
    	 System.out.println();
    	    System.out.println("Unesite kolicinu rama u GB");
    	    ram=unos.nextDouble();
    	    unos.nextLine();
    	    System.out.println("Unesite kapacitet HD u GB");
    	     hd=unos.nextDouble();
    	    unos.nextLine();
    	    System.out.println("Unesite brzinu procesora u GHz");
    	     procesor=unos.nextDouble();
    	    unos.nextLine();
    	    System.out.println("Unesite dijagonalu monitora u inch");
    	     monitor=unos.nextDouble();
    	    System.out.println("unesite nabavnu cijenu");
    	     cijena=unos.nextDouble();
    	    unos.nextLine();
    	    System.out.println("trajanje baterije u satima");
    	    double baterija=unos.nextDouble();
    	    unos.nextLine();
    	    System.out.println();
    	    test=new Laptop(ram,hd,procesor,monitor,cijena,baterija);
    	    System.out.println(test.toString());
    	break;
    }
	}

}
