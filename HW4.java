/**
 * Java. Level 1. Lesson 2
 *
 * @author Ali Al-Vasiti
 * @version dated May 11, 2017
 */
/**
     * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
     */
import java.util.Random; 
import java.util.Scanner; 
 
public class HW4 {
	public static char[][] map;
	public static final int SIZE = 3;
	public static final int DOTS_TO_WIN = 3; 
	public static final char DOT_EMPTY = '.';
	public static final char DOT_X = 'X';
	public static final char DOT_O = 'O';
	public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) { 
        initMap(); 
        printMap();
        while (true) {
            humanTurn();
            printMap();
            	if (checkWin(DOT_X)) {
            	    System.out.println("Human is Winner!");
            	    break; 
                }   
                if (isMapFull()) {
                    System.out.println("Nichiya"); 
                    break; 
                } 
            aiTurn(); 
            printMap();
                if (checkWin(DOT_O)) { 
                    System.out.println("Terminator pobedil"); 
                    break;
                }    
                if (isMapFull()) {
                    System.out.println("Nichiya"); 
                    break;         }
                }  
        System.out.println("Game over");  
    }

	public static void initMap() {
     	map = new char[SIZE][SIZE];  
     	for (int i = 0; i < SIZE; i++) { 
        	for (int j = 0; j < SIZE; j++) { 
            	map[i][j] = DOT_EMPTY;        
        	}
    	}
	} 

	public static void printMap() {
	    for (int i = 0; i <= SIZE; i++) { 
	        System.out.print(i + " "); 
	    }    
	    System.out.println(); 
	        for (int i = 0; i < SIZE; i++) {
	            System.out.print((i + 1) + " "); 
	                for (int j = 0; j < SIZE; j++) {
	                    System.out.print(map[i][j] + " "); 
	        		}    
    				System.out.println(); 
    		}   
    	System.out.println(); 
    } 

	public static void humanTurn() {
	    int x, y;    
	    do {
	    	System.out.println("Vvedite koordinaty v formate X Y"); 
	    	x = sc.nextInt() - 1; 
	    	y = sc.nextInt() - 1; 
	    } while (!isCellValid(x, y));
	    map[y][x] = DOT_X; }

	public static boolean isCellValid(int x, int y) { 
		if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
		if (map[y][x] == DOT_EMPTY) return true;   
		return false;
	}

	public static void aiTurn() { 
		int x, y; 
			do {
		    	x = rand.nextInt(SIZE);
		    	y = rand.nextInt(SIZE);
			} while (!isCellValid(x, y));
		System.out.println("Computer pohodil v tochku " + (x + 1) + " " + (y + 1));
		map[y][x] = DOT_O;
	}
	
    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[0][0]==map [0][1]&& map [0][1]==map [0][2]&& map [0][2]!=DOT_EMPTY){
                    return true; 
                }
                if (map[1][0]==map [1][1]&& map [1][1]==map [1][2]&& map [1][2]!=DOT_EMPTY ){
                    return true; 
                }
                if (map[2][0]==map [2][1]&& map [2][1]==map [2][2]&& map [2][2]!=DOT_EMPTY ){
                    return true; 
                }
                if (map[0][0]==map [1][0]&& map [1][0]==map [2][0]&& map [2][0]!=DOT_EMPTY ){
                    return true; 
                }  
                if (map[0][1]==map [1][1]&& map [1][1]==map [2][1]&& map [2][1]!=DOT_EMPTY ){
                    return true; 
                }
                if (map[0][2]==map [1][2]&& map [1][2]==map [2][2]&& map [2][2]!=DOT_EMPTY ){
                    return true; 
                }
                if (map[0][0]==map [1][1]&& map [1][1]==map [2][2]&& map [2][2]!=DOT_EMPTY) {
                    return true; 
                }
                if (map[2][0]==map [1][1]&& map [1][1]==map [0][2]&& map [0][2]!=DOT_EMPTY){
                    return true; 
                }     
            }

        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
        	for (int j = 0; j < SIZE; j++) {
        	    if (map[i][j] == DOT_EMPTY) return false;
        	    } 
        	}
        return true;
    } 
}