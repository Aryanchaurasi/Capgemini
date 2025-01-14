import java.util.Scanner;
public class MultiDimensionalArray{
 public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   //take user input is number of rows in matrix
   int row=sc.nextInt();
    // input is colum
   int colum=sc.nextInt();
  // creating 2-D metrix 
   int [][] matrix=new int[row][colum];
  // take 2-D metrix from user
   for(int i=0;i<row;++i){
      for(int j=0;j<colum;++j){
        matrix[i][j]=sc.nextInt();
       }
     }
       //creating the 1-D matrix and their size is row*colum
       int [] array=new int[row * colum];
       int index=0;
       for(int i=0;i<row;++i){
          for(int j=0;j<colum;++j){
        array[index]=matrix[i][j];
        index++;
       }
     }
       System.out.print(" one-diamentional array is :");
     // print out the 2-D to 1-D array
       for (int i=0;i<index;++i){
         System.out.print(array[i]+" ");
      }
        System.out.println();
    }
 }
   