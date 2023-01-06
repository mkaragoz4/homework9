package questions;

import java.util.Scanner;

/*
Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad” seklinde selamlayin. 
Tc kimlik numarasini talep edin ve kullaniciya tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi gorunecek sekilde yazdirin
(**** ****  **** 5434) .Tum islemleri StringBuilder kullanarak yapiniz. 
Bu programin en basinda zamani alin ve islemler tamamlaninca tekrar zaman alin ve arada gecen sureyi ekrana
 “Islemler ….. surede tamamlandi.” Ibaresini gosterip programi tamamlayin.
*/
public class Question4 {
	
	public static void main(String[]args) {
		
		long startTime = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Adinizi giriniz: ");
		String firstName = scan.nextLine();

		System.out.print("Soyadinizi giriniz: ");
		String lastName = scan.nextLine();

		System.out.print("TC kimlik numaranizi giriniz: ");
		String tcNumber = scan.nextLine();

		System.out.print("16 haneli kredi karti numaranizi giriniz: ");
		String creditCardNumber = scan.nextLine();

		StringBuilder selamlama = new StringBuilder();
		selamlama.append("Hosgeldin ").append(firstName).append(" ").append(lastName).append("!\n");
		selamlama.append("TC kimlik numaranizin onaylanan rakamlari: ").append(tcNumber.charAt(0)).append(tcNumber.charAt(3)).append(tcNumber.charAt(8)).append("\n");

		System.out.println(selamlama);

		
		  
		  
		  StringBuilder result = new StringBuilder();
		  result.append("Kredi karti numaraniz: "); for (int i = 0; i <
		  creditCardNumber.length() - 4; i++) { result.append("*"); }
		  result.append(creditCardNumber.substring(creditCardNumber.length() - 4));
		  
		  long endTime = System.currentTimeMillis(); long elapsedTime = endTime -
		  startTime;
		  
		  System.out.println(result); System.out.println("Islemler " + elapsedTime +
		  " milisaniye surede tamamlandı.");
		 

	}
	
	
}
