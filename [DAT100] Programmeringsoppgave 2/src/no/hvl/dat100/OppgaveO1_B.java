package no.hvl.dat100;

public class OppgaveO1_B {
	

		// a) Skriv ut en matrise (bruk nøstede for-løkker)
	public static void skrivUt(int[][] matrise) {
		for (int[] i: matrise) {
			for (int j: i) {
				System.out.print(j + " "); }
				System.out.println(); }
		}


// b) Returner en streng av en matrise
	public static String tilStreng(int[][] matrise) {
		String matstreng = "";
		for (int[] i : matrise) {
			for (int j : i) {
			matstreng += j + " ";
			}	
			matstreng += "\n";
		}
		return matstreng;
	}

		
// c) Multipliser alle tall i matrisen med et gitt tall
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise[0].length];
				
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
			nymatrise[i][j] = matrise[i][j]*tall;
			}
	}
	return nymatrise;
	}

		
//d) Avgjør om to matriser er like
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
			if (a[i][j] != b[i][j])
				return false;
			}				
		}
		return true;
	}
	
	
//e) Speil en kvadratisk matrise
	public static int[][] speile(int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise.length];
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise.length; j++) {
				nymatrise[i][j] = matrise [j][i];
			}
		}
		return nymatrise;
		}

		
//f) Multipliser to matriser 
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] nymatrise = new int[a.length][b[0].length];
		int sum = 0;
		for (int i=0; i<nymatrise.length; i++) {
			for (int j=0; j<nymatrise[i].length; j++) {
				for (int k=0; k<b.length; k++) {
					sum += a[i][k]*b[k][j];
				}
				nymatrise[i][j] = sum;
				sum = 0;
			}
		}
		return nymatrise;
	}
		
}
