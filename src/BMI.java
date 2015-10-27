
public class BMI {

	public static void main(String[] args) {
	
		double gewicht = 80;
		double groesse = 1.8;
		double bmi = (gewicht / (groesse * groesse));
		int alter = 23;
		boolean mann = true;
		
		System.out.println("Gewicht: " + gewicht + "kg");
		System.out.println("Größe: " + groesse + "m");
		System.out.println("Alter: " + alter + " Jahre");
		System.out.println("BMI: " + bmi);
		
		if (mann == true) {
		
			//männlich
			if (alter <= 24) {
				
				if (bmi >= 20 && bmi <= 25) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 20) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 25 && alter <= 34) {

				if (bmi >= 21 && bmi <= 26) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 21) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 35 && alter <= 44) {

				if (bmi >= 22 && bmi <= 27) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 22) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 45 && alter <= 54) {

				if (bmi >= 23 && bmi <= 28) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 23) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 55 && alter <= 64) {

				if (bmi >= 24 && bmi <= 29) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 24) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else {

				if (bmi >= 25 && bmi <= 30) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 25) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			}
			
		} else {
			
			//weiblich
if (alter <= 24) {
				
				if (bmi >= 19 && bmi <= 24) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 19) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 25 && alter <= 34) {

				if (bmi >= 20 && bmi <= 25) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 20) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 35 && alter <= 44) {

				if (bmi >= 21 && bmi <= 26) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 21) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 45 && alter <= 54) {

				if (bmi >= 22 && bmi <= 27) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 22) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else if (alter >= 55 && alter <= 64) {

				if (bmi >= 23 && bmi <= 28) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 23) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			} else {

				if (bmi >= 24 && bmi <= 29) {
					//ok
					System.out.println("BMI: OK");					
				} else if (bmi < 24) {
					//zu klein
					System.out.println("BMI: Magersüchtig");
				} else {
					//zu fett
					System.out.println("BMI: I love Bacon");
				}
				
			}
			
		}

	}

}
