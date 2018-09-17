package zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite proizvoljnu reèenicu");
		String recenica=unos.nextLine();
		String[] lista=recenica.split(" ");
		int clanovi=lista.length;
		System.out.println("Predzadnja rijec je "+lista[clanovi-2]);
	}
}
