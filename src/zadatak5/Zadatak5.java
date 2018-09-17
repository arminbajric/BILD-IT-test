package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		String rijec = " ";
		ArrayList lista = new ArrayList();
		while(rijec.equals("kraj")==false)
		{
			System.out.println("Unesite rijec:");
		 rijec=unos.nextLine();
		lista.add(rijec);
		}
		System.out.println("Output");
		for(int i=0;i<lista.size();i++)
		{
			System.out.print(lista.get(i)+" ");
		}
	}

}
