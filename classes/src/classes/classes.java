package classes;

public class classes {

	public static void main(String[] args) {
		CustomerManager customManager = new CustomerManager();
		CustomerManager customManager2 = new CustomerManager();
		customManager=customManager2;
		customManager.Add();
		customManager.Remove();
		customManager.Update();
		
		//value type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar;
		sayilar[0]=10;
		System.out.println(sayilar2[0]);
		
	}

}

