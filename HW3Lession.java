/**
 * Java. Level 1. Lesson 3
 *
 * @author Ali Al-Vasiti
 * @version dated May 13, 2017
 */
import java.util.Scanner;
import java.util.*;
public class HW3Lession {

 /**
 * 1. Написать программу, которая загадывает случайное число от 0 до 9,
     * и пользователю дается 3 попытки угадать это число. 
     * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. 
     *После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет). 
     *
     */
	public static Scanner sc = new Scanner(System.in); 
   		public static void main(String[] args) {
                   int m = 1;
                    while(m==1) {
                        int b = 0;
   					    Random rand = new Random();
   					    int a = rand.nextInt(10);
   					    while ( b < 3) {	
    				    	int d = getNumberFromScanner("Vvedite chislo ot 0 do 9", 0, 9);
						  	if ( a > d) {
    					   	System.out.println("Vashe chislo menshe zaplanirovannogo");
    					   	b++;
    					    }
    						  if ( a < d) {
    						  System.out.println("Vashe chislo bolshe zaplanirovannogo");
    						  b++;
    						  }
    							 if ( a == d) {
    							 System.out.println("Pozdravlyaem-You are winner! Povtorit igru esche ras? 1-da/0-net");
    							 int c = sc.nextInt();
    								    if (c == 1) {
    								    break;		
    						            }
    										  if (c==0){
    										  System.out.println("Spasibo za igru. Udachnogo dnya");
                                              m--;
                                              break;
    										  }
    							 }		
    									   			if ( b == 3) {
    									   			System.out.println("Ha Ha! You are LOOSER! Povtorit igru esche ras? 1-da/0-net");
    									   			int c = sc.nextInt();
    										  			if (c==1){
    										  			break;
    										  		}
												    			if (c == 0) {
    											 				System.out.println("Spasibo za igru. Udachnogo dnya");
                                                    			m--;
                                                    			break;	
    											    			}
    									   			}			
    				    }
		            }
        } 

    				public static int getNumberFromScanner(String message, int min, int max){
    					int x;   
    					do { 
        					System.out.println(message);  
        					x = sc.nextInt();         
        				}   while (x < min || x > max);  
        				return x; 
        			}   
} 