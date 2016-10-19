import java.util.Scanner;

public class Zipp {
	
	public Zipp(){
	Scanner odczyt = new Scanner(System.in);
	int liczbaA;
	int liczbaB;
	liczbaA = odczyt.nextInt();
	liczbaB = odczyt.nextInt();
	odczyt.close();
	String liczbaAstr = String.valueOf(liczbaA);
	String liczbaBstr = String.valueOf(liczbaB);
	int dlugoscA = liczbaAstr.length() -1;
	int dlugoscB = liczbaBstr.length() -1;
	int maxZnakow = Math.max(dlugoscA, dlugoscB);
	int minZnakow = Math.min(dlugoscA, dlugoscB);
	int STARTERA = 0;
	int STARTERB = 0;
	
	System.out.println("Długość liczby A: ");
	System.out.println(dlugoscA);
	System.out.println("Długość liczby B: ");
	System.out.println(dlugoscB);
	System.out.println("Najwięcej znaków: ");
	System.out.println(maxZnakow);
	System.out.println("Najmniej znaków: ");
	System.out.println(minZnakow);
	System.out.println("Liczba A: ");
	System.out.println(liczbaAstr);
	System.out.println("Liczba B: ");
	System.out.println(liczbaBstr);

		if(liczbaA > 100000000 || liczbaB > 100000000){
		      System.out.println("Wynik przekracza 100,000,000");
		      return;
		     }

		if(liczbaA <= 0 || liczbaB <= 0){
		      System.out.println("A lub B są nie mogą być ujemne");
		      return;
		     }
	
	System.out.println("Zipper: ");

		do {
			System.out.print(liczbaAstr.charAt(STARTERA));
			System.out.print(liczbaBstr.charAt(STARTERB));
			STARTERA++;
			STARTERB++;
			}
		while ((STARTERA <= dlugoscA) && (STARTERB <= dlugoscB));

    }
	
	}

	

