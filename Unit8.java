import java.util.*;

public class Unit8 {

	public static void main(String[] args){

		//Placeholder: 
		int[][] nums = {{1,2,3},{4,5,6}};
		double[][] yes = {{1.4,2.3}, {3.1,4.2}};
			
		//Problem 1: Write the code that will sum up the values stored in the 2D array nums.
		
		
		prob1(nums);


		//Problem 2: Use the variables 'row' and 'col' to create a 2D array that is of row X col in size. Then, fill up the 2d array with values starting at 0 to (row * col)-1. You will then print up the 2D array with a single loop and using the Arrays.toString() method.

		prob2(5,5);

		//Problem 3: Complete the method isSquared.  The method isSquared checks the 2D array to see if it has equal number of rows and columns. If it does it will return true, if it doesn't return false. 

		System.out.println(prob3(nums));

		//Problem 4: You will need to complete the method isAscending.  The method isAscending checks to verify that each element in the 2D array is larger than the element before it. It will also need to verify that the first element in each row is larger than the last element in the row before it.

		prob4(nums);


		//Problem 5: Complete the method closestToZero.The method will look through the 2D array and return an array of the index containing the value that is closest to zero,where index 0 of the array is the row and index 1 of the array is the column.

		System.out.println(Arrays.toString(prob5(nums)));

		/*Problem 6: Complete the method printColumns so that it prints the parameter 'array' in column order.

Example:Array = {{2.5, 5.6, 3.4},{1.2, 8.3, 9.3}} 
It would print:
2.5 1.2
5.6 8.3
3.4 9.3*/

		prob6(yes);

		

		/*Problem 7: Complete the method printReverse so that it prints the parameter 'array' in reverse order:
Example
Array = {{2.5, 5.6, 3.4},{1.2, 8.3, 9.3}}

It would print
9.3 8.3 1.2
3.4 5.6 2.5
*/

		prob7(yes);

		/*Complete the method sameDiagonalSums that returns true if the parameter 'array' has its two diagonals sum up to the same number.
-You may assume that all arrays passed into this method have equal rows and columns.
Example:
Array = {{4, 9, 2}, {3, 5, 7},{8, 1, 6}} 
returns true because 4 + 5 + 6 = 15  and 8 + 5 + 2 = 15
*/
		System.out.println(prob8(nums));

		//There are a lot more problems. Check that out on part 2!
	}

	public static void prob1(int[][] nums){
		int sum = 0;
    	for(int i = 0; i< nums.length; i++){
        	for(int j = 0; j < nums[i].length;j++){
            	sum+=nums[i][j];
         }
      }
      System.out.println(sum);
		

	}

	public static void prob2(int row, int col){
		int[][] yes = new int[row][col];
      	int c = 0;
      
      	for(int i = 0;i<yes.length;i++){
         	for(int j = 0; j < yes[i].length;j++){
            	yes[i][j] = c;
            	c++;
         	}
      	}
      
      	for(int k = 0; k< yes.length;k++){
        	System.out.println(Arrays.toString(yes[k]));
      	}
	}

	public static boolean prob3(int[][] array){
		   
      int a = array.length;
      int b = array[0].length;
      if(a==b){
         return true;
      }
      else{
         return false;
      }
        

	}
	
  public static void prob4(int[][] array) {
    
	  boolean yes = true;

	  for(int i = 0; i< array.length;i++){
		  for(int j = 0; j< array[i].length;j++){
			  if(j!=array[i].length-1 &&array[i][j] > array[i][j+1]){
				  yes = false;
			  }

			  if(j == array[i].length-1 && i!= array.length-1 && array[i][j] > array[i+1][0]){
				  yes = false;
			  }
			  
		  }

		  
	  }
	  System.out.println(yes);
  }

	public static int[] prob5(int[][] array){
		int fewest = 100000;
      	int a = 0;
      	int b = 0;
      	for(int i = 0; i<array.length;i++){
         	for(int j = 0; j<array[i].length;j++){
            	if(array[i][j] > 0 && array[i][j] < fewest){
            		fewest = array[i][j];
               		a = i;
               		b = j;
            }
            	if(array[i][j] < 0 && (array[i][j]*-1) < fewest){
               		fewest = array[i][j];
               		a = i;
               		b = j;
            }
         }
      }
      
      int[] arr = {a,b};
      return arr;
		

	}
	
	public static void prob6(double[][] array){
		for(int i = 0; i< array[0].length;i++){
			for(int j = 0; j< array.length;j++){
				System.out.print(array[j][i] + " ");
			}
			System.out.println("\n");
		}
	}

	public static void prob7(double[][] array){
		for(int i = array.length-1; i>=0;i--){
			for(int j = array[i].length-1; j>=0;j--){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static boolean prob8(int[][] array){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i = 0; i < array.length;i++){
            a+=array[i][c];
            c++;

        }
        for(int j = array.length-1; j>= 0; j--){
            b+=array[j][d];
            d++;

        }

        if(a==b){
            return true;
        }
        return false;
    }

	
}