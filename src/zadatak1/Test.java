package zadatak1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner unos=new Scanner(System.in);
System.out.println("Unesite naziv knjige:");
String imeKnjige=unos.nextLine();
System.out.println("Unesite ime autora:");
String imeAutora=unos.nextLine();
System.out.println("Email autora");
String email=unos.nextLine();
System.out.println("Spol autora(m/f):");
char spol=unos.next().charAt(0);
System.out.println("cijena knjige:");
unos.nextLine();
double cijena=unos.nextDouble();
System.out.println("kolicina na stanju:");
unos.nextLine();
int kolicina=unos.nextInt();
Author autor=new Author(imeAutora,email,spol);
Book test=new Book(imeKnjige,autor,cijena,kolicina);
System.out.println("Info o knjizi");
System.out.println(test.toString());
	}

}
