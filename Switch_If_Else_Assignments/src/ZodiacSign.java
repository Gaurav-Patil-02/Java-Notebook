//Display the Zodiac Sign Based on Month and Date
//Enter month & day, print corresponding zodiac sign.

import java.util.Scanner;

public class ZodiacSign {

//	Aries: March 21–April 19
//	Taurus: April 20–May 20
//	Gemini: May 21–June 20
//	Cancer: June 21–July 22
//	Leo: July 23–August 22
//	Virgo: August 23–September 22
//	Libra: September 23–October 22
//	Scorpio: October 23–November 21
//	Sagittarius: November 22–December 21
//	Capricorn: December 22–January 19
//	Aquarius: January 20–February 18
//	Pisces: February 19–March 20

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date-Of-Birth ");
		System.out.println("Day");
		int day = scan.nextInt();
		System.out.println("Month");
		int month = scan.nextInt();

		switch (month) {
		case 1:
			if (day >= 20 && day <= 31) {
				System.out.println("Aquarius");
			} else if (day >= 1 && day <= 19) {
				System.out.println("Capricorn");
			} else {
				System.out.println("Invalild Date");
			}
			break;

		case 2:
			if (day >= 1 && day <= 18) {
				System.out.println("Aquarius");
			} else if (day >= 19 && day <= 28) {
				System.out.println("Pisces");
			} else {
				System.out.println("Invalid Date");
			}
			break;
			
		case 3:
			if(day >= 1 && day <= 20) {
				System.out.println("Pisces");
			}else if(day >= 21 && day <= 30) {
				System.out.println("Aries");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		
		case 4:
			if(day >= 1 && day <= 19) {
				System.out.println("Aries");
			}else if(day >= 20 && day <= 31) {
				System.out.println("Taurus");
			}
			else {
				System.out.println("Invalid Date");
			}
			break;
		case 5:
			if(day >= 1 && day <= 20) {
				System.out.println("Taurus");
			}else if(day >= 21 && day <= 30) {
				System.out.println("Gemini");
			}
			else {
				System.out.println("Invalid Date");
			}
			break;
		case 6: 
			if(day >= 1 && day <= 20 ) {
				System.out.println("Gemini");
			}else if(day >= 21 && day <= 31) {
				System.out.println("Cancer");
			}
			else {
				System.out.println("Invalid Date");
			}
			break;
		case 7:
			if(day >= 1 && day <= 21) {
				System.out.println("Cancer");
			}else if(day >= 22 && day <= 30) {
				System.out.println("Leo");
			}
			else {
				System.out.println("Invalid Date");
			}
			break;
		case 8:
			if(day >= 1 && day <= 22) {
				System.out.println("Leo");
			}else if(day >= 23 && day <= 31) {
				System.out.println("Virgo");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		case 9:
			if(day >= 1 && day <= 22 ) {
				System.out.println("Virgo");
			}else if(day >= 23 && day <= 30) {
				System.out.println("Libra");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		case 10:
			if(day >= 1 && day <= 22) {
				System.out.println("Libra");
			}else if(day >= 23 && day <= 31) {
				System.out.println("Scorpio");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		case 11:
			if(day >= 1 && day <= 21) {
				System.out.println("Scorpio");
			}else if(day >= 22 && day <= 30) {
				System.out.println("Sagittarius");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		case 12: 
			if(day >= 1 && day <=21) {
				System.out.println("Sagittarius");
			}else if(day >= 22 && day <= 31) {
				System.out.println("Capricorn");
			}else {
				System.out.println("Invalid Date");
			}
			break;
		}

	}

}
