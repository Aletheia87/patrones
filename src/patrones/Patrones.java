package patrones;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		int n = Integer.parseInt(sc.nextLine());
				patronUno(n);
				patronDos(n);
				patronTres(n);
		
	}
		public static void patronUno(int n) {
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					System.out.printf("*");
				}else
					System.out.printf(".");
					}
					System.out.println("\n");
	}
		public static void patronDos(int n) {
			for(int i =1; i <= n; i++) {
				if (i%4==0) {
					System.out.printf("4");
				}else if (i%4==1) {
					System.out.printf("1");
				}else if (i%4==2) {
					System.out.printf("2");
				}else if (i%4==3) {
					System.out.printf("3");
				 }
				}
				System.out.println("\n");
			}
		
		public static void patronTres(int n) {
			for(int i=1; i <= n; i++) {
				if (i%3==0) {
					System.out.printf("*");
				}else if (i%3==1) {
					System.out.printf("|");
				}else if (i%3==2) {
					System.out.printf("|");
				}
			}
			System.out.println("\n");
		}
		}



