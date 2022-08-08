package Numbers;

import java.util.Scanner;


public class Number {
	
	 Scanner numb = new Scanner(System.in);
	
	 
	 
	public static int getInt(){
	
		
	Number a = new Number();
	
	Scanner number = a.numb;
	
	
	System.out.println("Введите число:");
    int num;
    
    if(number.hasNextInt()){
        num = number.nextInt();
     } else {
         System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
         num = getInt();
        }
        return num;
    }
}