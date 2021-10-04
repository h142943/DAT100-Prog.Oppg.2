package no.hvl.dat100;

public class OppgaveO1_A {


//a) Skriv ut tabell
	public static void skrivUt(int[] tabell) {
		for (int i:tabell) {
		System.out.print(i + " ");
		}
	}

		
//b) Returner en streng med innholdet av en tabell
	public static String tilStreng(int[] tabell) {
		String tabstring = "[";
		for (int i=0; i<tabell.length; i++) {
			tabstring += tabell[i];
			if (tabell.length-1 != i) {
			tabstring += ",";
			}
		}
		tabstring += "]";
		return tabstring;		
	}

		
//c1) Summer tall i tabell med vanlig for-løkke 
	public static int summer1(int[] tabell) {
		int sum = 0;
		for (int i=0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
			
//c2) Summer tall i tabell med while-løkke
	public static int summer2(int[] tabell) {
		int i=0;
		int sum=0;
		while (i<tabell.length) {
			sum+= tabell[i];
			i++;
		}
		return sum;
	}
			
//c3) Summer tall i tabell med utvidet for-løkke
	public static int summer3(int[] tabell) {
		int sum = 0;
		for (int i:tabell)
			sum += i;
		return sum;
	}

		
//d) Finn ut om et gitt tall finnes i tabellen
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		while (i<tabell.length) {
			if (tall == tabell[i]) {
				return true;
				}
				i++;
			}
		return false;
	}
	

//e) Finn det første index i tabell som inneholder et gitt tall og gi -1 ellers
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i<tabell.length; i++) {
				if (tall == tabell[i]) {
					return i;
					}
				}
			return -1;
		}
			

//f) Snu tabellen
	public static int[] reverser(int[] tabell) {
		int[] nytabell = new int[tabell.length];
		for (int i=0; i<tabell.length; i++) {
			nytabell[i] = tabell[tabell.length-1-i];
		}
		return nytabell;	
	}
		

//g) Finn ut om en tabell er sortert i stigende rekkefølge
	public static boolean erSortert(int[] tabell) {
		for (int i=0; i<tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
				}
			}
		return true;
	}

		
//h) Sett sammen to tabeller
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nytabell = new int[tabell1.length + tabell2.length];
		for (int i=0; i<tabell1.length; i++) {
			nytabell[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nytabell[tabell1.length+j] = tabell2[j];
		}
		return nytabell;
		}
		
	}

