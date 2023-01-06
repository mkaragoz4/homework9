package questions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

/*
Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin bilet satis programina bir ek program yazmaniz istendi.
 Kalkis Tokyo ve inis Kahire sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati istenecek, 
 Tokyo saatiyle kalkis saati ve tarihi, Kahire saatiyle inis saati ve tarihi verilecek. 
 (Kullanicidan istenilen bilgileri “VeriGirisi” adiyla olusturulmus class’ tan alinip “Sonuc” adiyla olusturulmus 
 class icinde olusturacaginiz static bir method’ tan kullaniciya sunulacaktir.)
*/
public class VeriGirisi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LocalDate dateTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		LocalTime timeTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));

		System.out.println("Asagida Tokyo'nun simdiki tarih ve saati verilmistir. \nBilgilerinizi bu veriye gore giriniz.");
		System.out.println("\nTarih:" + dateTokyo.getDayOfMonth() + "/" + dateTokyo.getMonthValue() + "/"
				+ dateTokyo.getYear() + "\t" + "Saat" + timeTokyo.getHour() + ":" + timeTokyo.getMinute());
		System.out.println("\nLutfen seyahat tarihini ornekteki gibi yerel olarak giriniz:(dd/mm/yyyy)");

		String tarih = scan.nextLine();

		System.out.println("\nLutfen seyahat saatini ornekteki gibi girniz:(hh:mm)");

		String saat = scan.nextLine();
		
		scan.close();

		Sonuc.ucusHesaplama(tarih, saat);

	}
}
