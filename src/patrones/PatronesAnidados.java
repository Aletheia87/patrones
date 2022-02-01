package patrones;

import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		int n = Integer.parseInt(sc.nextLine());
				//patronUno(n);
				patronDos(n);
				//patronCuatro(n);
		
	}
	/*public static void patronUno(int n) {
		//Inicio
				for(int k=0;k<n;k++) {
				System.out.print("*");
			}
			System.out.println("");
		//Medio
			for(int i=0;i<n-2;i++) {
				System.out.print("*");
				for(int k=0;k<n-2;k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		//Final
			for(int k=0;k<n;k++) {
				System.out.print("*");
			}
			System.out.println("");
	}*/

	public static void patronDos(int n) {
		if (n>1) { 
		//Inicio
				for(int k=0;k<n;k++) {
				System.out.print("*");
			}
		//Medio
			for(int i=2;i<n;i++) {
				System.out.print("\n");
				for(int k=i;k<n;k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		//Final
			for(int k=0;k<n;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}else {
			System.out.println("*");
	}
}

	/*public static void patronCuatro(int n) {
				if (n>1) { 
		//Inicio
			for(int k=0;k<n-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		//Medio
			for(int i=0;i<n-2;i++) {
				System.out.print(" ");
				for(int k=-1;k<n-3;k++) {
					System.out.print("*");
		}
				System.out.println(" ");
	}
		//Final
			for(int i=0;i<1;i++) {
				System.out.print(" ");
				for(int k=0;k<n-1;k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
				}else {
					System.out.println("*");
				}
} */
	}
