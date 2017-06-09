/**
 * Java. Level 1. Lesson 2
 *
 * @author Ali Al-Vasiti
 * @version dated May 11, 2017
 */
public class HW2Lession {

    public static void main(String[] args) {
	invertArray();
	System.out.println("");
	fillArray();
	System.out.println("");
	changeArray();
	System.out.println("");
	fillDiagonal();

}
/**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
public static void invertArray()
{
 int[] arr = { 1, 0, 1, 0, 0, 1 };
     for (int i = 0; i < arr.length; i++)  {
    	System.out.print (i+"-"+arr[i]+" ");
    }
    System.out.println("");
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 1) {
                arr[i] = 0;
            }else arr[i] = 1;
        for(int i = 0; i < arr.length; i++){
            System.out.print (i + "-" + arr[i]+" ");
            }   
 }
/**
     * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;    
     */
public static void fillArray()
 {  
 	int[] arr = new int[8];  
 	int j=0;
 	for (int i = 0; i < arr.length; i++)
 	 { 
  	System.out.print (i + "-" + arr[i]+" ");
     }
   System.out.println (" ");
  	for(int i = 0; i < arr.length; i++, j=j+3)
  	{arr[i]=j;
  	}
 for(int i = 0; i <arr.length ; i++) 
 			{
  System.out.print (i + "-" + arr[i]+" ");
            }   
}
/**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;     
     */
public static void changeArray() 
	{    
	int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; 
	for (int i = 0; i < w.length; i++) 
		{ 
  	System.out.print (i + "-" + w[i]+" ");
     	}
     	System.out.println("");
     	for(int i = 0; i < w.length; i++)
     	 if(w[i]<6) {
            w[i] = w[i]*2;
            }
         for(int i = 0; i < w.length; i++){
            System.out.print (i + "-" + w[i]+" ");
            }   
	}
/**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;     
     */
public static void fillDiagonal()
 	{ 	
 	int[][] table = new int[4][4];  
 	for (int i = 0; i < 4; i++) {      
 	for (int j = 0; j < 4; j++) {
 	if (i == j) 
	 {
 	table[i][j]=1;
 	 } 
 System.out.print(table[i][j] + " ");       
	}  
 System.out.println();    
 	}
    } 
}