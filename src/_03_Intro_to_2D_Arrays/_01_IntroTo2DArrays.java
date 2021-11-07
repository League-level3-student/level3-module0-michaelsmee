package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int [][]array = new int [3][3];
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	int y=0;
        for(int i=0; i<array.length; i++) {
        	array[i][i] = i;
        	for(int z=0; z<array[i].length; z++) {
        		y+=1;
        		array[i][z]=y;
        		 System.out.println(array[i][z]);
        	}
        }
       
        // 3. print the third element from the second 1D array (2DArray[1][2])
        System.out.println(array[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
        array[1][2] = 1;
        // 5. print the element again and verify the value has changed
        for(int i=0; i<3; i++) {
        	
        	for(int z=0; z<3; z++){
        		System.out.println(array[i][z]);
        	}
        }
    }
}
