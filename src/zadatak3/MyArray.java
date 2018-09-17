package zadatak3;

public class MyArray {

	int[] niz;

	 MyArray(int[] niz) {
		
		this.niz = niz;
	}
	public int getSmallestElement()
	{
		int max=Integer.MAX_VALUE;
		
		for(int i=0;i<niz.length;i++)
		{
			if(niz[i]<max)
			{
				max=niz[i];
			}
		}
		return max;
		
	}
   public int getLargestElement()
   {
	   int min=Integer.MIN_VALUE;
		
		for(int i=0;i<niz.length;i++)
		{
			if(niz[i]>min)
			{
				min=niz[i];
			}
		}
		return min;
	   
   }
   public int sumAllElements()
   {
	   int suma=0;
	   for(int i=0;i<niz.length;i++)
		{
			suma+=niz[i];
		}
		return suma;
	   
   }
   public void printElements()
   {
	   System.out.println("elementi niza su");
	  
	   for(int i=0;i<niz.length;i++)
		{
			System.out.print((i+1)+"."+niz[i]+" ");
		}
		
   }
}
