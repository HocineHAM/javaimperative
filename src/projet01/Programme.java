package projet01;

import java.util.Arrays;
import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programme op = new Programme();
		// op.attelier2();
		// op.attelier3();
		// op.attelier4();
//		op.attelier5();
		//op.attelier6();
//		op.atelier7();
//		op.atelier8();
//		op.atelier9();
		op.atelier10();
	}

	public void attelier2() {

		int nombre = 1;
		float f = 1.1f;
		double d = 1.111;
		byte b = (byte) -111111;
		short s = -2354;

		String str = "hkdfvjdf";

		System.out.println(
				"int:" + nombre + "float :" + f + "double :" + d + "byte :" + b + "short :" + s + "String :" + s);

	}

	public void attelier3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez rentrer votre nom");
		String s = sc.nextLine();
		System.out.println("votre nom est :" + s);

		System.out.println("Veuillez rentrer votre prénom");
		String s1 = sc.nextLine();
		System.out.println("Votre prénom est :" + s1);

		System.out.println("Veuillez rentrer votre âge");
		String s2 = sc.nextLine();
		System.out.println("Votre âge est :" + s1 + " ans");

	}

	public void attelier4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuiller rentrer un nombre a");
		int a = sc.nextInt();
		System.out.println("Veuiller rentrer une nombre b ");
		int b = sc.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		if (b != 0) {
			System.out.println(a / b);
			System.out.println(a % b);
			System.out.println(a + b - a / b);
			System.out.println(a + (b - a) / b);
		}

		boolean test = a == b;
		System.out.println("a==b :" + test);
		test = a != b;
		System.out.println("a!=b :" + test);
		test = a > b;
		System.out.println("a>b :" + test);
		test = a >= b;
		System.out.println("a>=b :" + test);
		test = a < b;
		System.out.println("a<b :" + test);
		test = a <= b;
		System.out.println("a<=b :" + test);

		boolean c = true, d = false;

		boolean z = (c && d);
		System.out.println("c && d :" + z);

		z = (c || d);
		System.out.println("c || d :" + z);

		z = !c;
		System.out.println("!c :" + z);
		
		

	}

	public void attelier5() {

		byte a = 127;
		short b = 32767;
		// a = b;
		System.out.println(a);
	}

	public void attelier6() {

		String s = "Chaine de charactère";
		String s2 = new String("Une autre chaine de charactère");
		String s3 = new String("une chaine de charactère");
		String s4 = "Chaine de charactère";

		if (s.equals(s2))
			System.out.println("égalité parfaite");
		else {

			System.out.println("égalité non parfaite");
		}

		String str = s2.toUpperCase();
		System.out.println(str);

		int in = s2.length();

		System.out.println(in);

		int tt = s2.indexOf("c");
		System.out.println(tt);

	}

	public void atelier7() {
		int a =10;
		int b = 25;
		
				System.out.println(Math.min(a, b));
				System.out.println(Math.max(a, b));
				System.out.println(Math.abs(a));
				System.out.println(Math.random());
	}

	public void atelier8() {
		
		boolean a = true;
		boolean b = false;
		
		byte c = 1;
		byte d = 2;
		
		if (a == true) {
			System.out.println(" la variable a est vraie");
		}else {
			System.out.println("la valeur de a est false");
		}
		
		if (b== true) {
			System.out.println("la valeur de b est vraie");
		}else {
			System.out.println("la valeur de b est false");
		}
		
    if (c != d) {
    	if (c == 1) {
    		System.out.println("C est égale à 1");
    	}
    	if (d == 2) {
    		System.out.println("d est égale à deux");
    	}
    	else {
    		
    		System.out.println(" c est different de d");
    	}
    	
    }
    if(c>d) {
    	System.out.println("c est supérieur à d");
    
    }else {
    	
    	System.out.println("c n'est pas supérieur à d");
    }
    int x = 3;
	
	switch(x)
    {
        case 1:
            System.out.println("x=1");
        break;
        case 2:
            System.out.println("x=2");
        break;
        case 3:System.out.println("x=3");
        break;
        default:
            System.out.println("x n'est pas bon");
        break;
    }
    	
	}
	
	public void atelier9() {
		int x=1;
		while (x<6) {
			
			System.out.println(x);
			x= x+1;
		}
		do {
			System.out.println("afficher le message une seule fois");
		} while (false);
			int i;
			for (i = 1; i < 6; i++) {
				
				System.out.println(i);
			}
		
		
	}
	public void atelier10() {
	String s [] = {"Pikachu","Salameche","Bulbizarre","Carapuce","Racaillou"};
		Arrays.sort(s);
		int i;
		for (i = 0; i<s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println(Arrays.binarySearch(s, "Carapuce"));
		
		String tab [][] = {{"Pikachu","Raichu"},{"Salamèche"},{"Bulbizarre"},{"Carapuce","Torkank"},{"Onyx","Racaillou"}};
		int e;
		int j;
		for(e=0; e<tab.length;e++) {
			for(j=0; j<tab[e].length;j++) {
				
				System.out.println(tab[e][j]);
			}
		}

		
		
	}
	
	

}
