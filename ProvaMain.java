package prova.main;

import java.util.*;

public class ProvaMain {
	
	public static void main(String[] args) {

		int arrayNum2[] = {0,1,2,3};
//		System.out.println(countEqualsNumber2(arrayNum2));
		
		Integer arrayNum[] = {1,2,3,4,7,7,7,8,9,10};
//		System.out.println(countEqualsNumber(arrayNum));
		
		String array[] = {"prova", "parola", "mare", "test", "mare", "mare", "Mare", "errore"};
//		System.out.println(countEqualsWord(array));
		
		String word = "Spider-Man";
//		System.out.println(reverseString(word));
		
		String number = "2022";
//		System.out.println(convertIntoNumber(number));
		
		char voto = 'A';
//		calcolaVoto(voto);
		
//		System.out.println(Arrays.toString(shiftPosition(arrayNum2)));
		
		int arrayNum3[] = {2340,1,2,3, -3};
		
//		System.out.println(sumElements(arrayNum3));
		
		Calcolatrice calc = new Calcolatrice(16,8);
		
		System.out.println(calc.moltiplicazione());
		System.out.println(calc.divisione());
	
	}
	
	
	
//	effettua la somma solo dei numeri interi positivi
	public static int sumElements(int[] arrayOfPositiveNumbers) {
		
		int sum = 0;
		
		for(int i = 0; i < arrayOfPositiveNumbers.length; i++) {
			if(arrayOfPositiveNumbers[i] >= 0) {
				sum = sum + arrayOfPositiveNumbers[i]; 
			}
		}
		
		return sum;
	}
	
	
	
	
	
	public static int[] shiftPosition(int[] numbers) {
		
		int[] newArray = new int[numbers.length];
		
		newArray[0] = numbers[numbers.length - 1];
		
		for(int i = 0; i < numbers.length - 1; i++) {
			newArray[i + 1] = numbers[i];
		}
		
		return newArray;
	}

	

	//converte una lettera da A ad E in un voto
	public static void calcolaVoto(char voto) {
		
		//converto il caratter in Uppercase
		voto = Character.toUpperCase(voto);
		
		//controllo delle varie casistiche
		switch(voto) {
		  case 'A':
			  System.out.println("Eccellente");
		    break;
		  case 'B':
			  System.out.println("Ottimo");
		    break;
		  case 'C':
			  System.out.println("Buono");
			    break;
		  case 'D':
			  System.out.println("Sufficiente");
			    break;
		  case 'E':
			  System.out.println("Failed");
			    break;
		  default:
			  System.out.println("Voto non accettato");
		}
	}
	
	
	
	
	//inverte la stringa data in input
	public static String reverseString(String input) {
		
		  String reversed = "";
		  for (int i = input.length() - 1; i >= 0; i--) {
		    reversed = reversed + input.charAt(i); 
		  }
		  return reversed;
		}
	
	
	
	
	
	//controlla se la stringa è uguale a "mare"
	public static int countEqualsWord(String[] arrayString) {
		
		if(arrayString.length > 10 || arrayString.length < 0) {
			System.out.println("La dimensione dell'array non è accettata");
			return 0;
		}
		
		//counter
		int counterEqualsWord = 0;
		
		for(int i = 0; i < arrayString.length; i++) {
			
			//condizione se input == mare
			if(arrayString[i] != null && arrayString[i].equalsIgnoreCase("mare")) {
				counterEqualsWord++;
			}
		}
		
		return counterEqualsWord;
		
	}
	
	
	
	
	//conta quante volte c'e il numero 7 nell'array 
	public static int countEqualsNumber(Integer[] arrayString) {
		
		//controllo dimensione array
		if(arrayString.length > 10 || arrayString.length < 0) {
			System.out.println("La dimensione dell'array non è accettata");
			return 0;
		}
		
		//counter
		int counterEqualsNumber = 0;
		
		for(int i = 0; i < arrayString.length; i++) {
			
			//condizione se input == 7
			if(arrayString[i] != null && arrayString[i].equals(7)) {
				counterEqualsNumber++;
			}
		}
		
		return counterEqualsNumber;
		
	}
	
	
	
	
	
	//conta quante volte c'e il numero 7 nell'array
	public static int countEqualsNumber2(int[] arrayString) {
		
		//controllo dimensione array
		if(arrayString.length > 10 || arrayString.length < 0) {
			System.out.println("La dimensione dell'array non è accettata");
			return 0;
		}
		
		//counter
		int counterEqualsNumber = 0;
		
		for(int i = 0; i < arrayString.length; i++) {
			
			//condizione se input == 7
			if(arrayString[i] == Integer.valueOf(7)) {
				counterEqualsNumber++;
			}
		}
		
		return counterEqualsNumber;
		
	}
	
	
	
	//convertire una stringa in Integer
	public static int convertIntoNumber(String numero) {
		
		Integer intero = 0;
		
		try {
			intero = Integer.valueOf(numero);
		} catch (Exception ex) {
			System.out.println(ex.getMessage()); 
		}
		
		return intero;
	}
	
}
