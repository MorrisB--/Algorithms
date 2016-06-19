package murfey;

import java.io.PrintWriter;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class Sorts2
{
   public static void main( String[] args) throws Exception
   {
      PrintWriter pw = new PrintWriter(new File("sortTimes.csv"));
      
      long startTime = System.nanoTime();
      long endTime = System.nanoTime();
      double diff1, diff2, diff3, diff4;
      int arraySize = 0;      
      boolean sortProblem = false;
      
      /* let's sort 24 different size arrays */
      /*  this might take a while... */
      for( int i=1; i<=24; i++ ) 
      {
         arraySize = i*10000; /* from 10000 - 240000 */
         int[] src = new int[arraySize]; 
         int[] a = new int[arraySize]; 
         
         for( int j=0; j<a.length; j++ ) 
         {
            src[j] = (int)(Math.random()*arraySize);
         }
         int[] sortedSrc = src.clone();
         Arrays.sort(sortedSrc);
         System.out.println( "\n-------- Array Size: " + arraySize + " --------- ");
         /* create a unique copy of src */
         a = src.clone();
         startTime = System.nanoTime();
         a = bubbleSort(a, 0, a.length-1);
         endTime = System.nanoTime();         
         /* did we sort correctly? */
         if( Arrays.equals(a, sortedSrc) == false ) 
         {
            System.out.println( "Problem with our bubble sort method!!" );
            sortProblem = true;
         }         
         diff1 = (double)((endTime - startTime)/1000000000.0);
         System.out.println( "bubble sort = " + diff1 + " seconds." );

         /* create a unique copy of src */
         a = src.clone();
         startTime = System.nanoTime();
         a = mergeSort(a, 0, a.length-1);
         endTime = System.nanoTime();         
         /* did we sort correctly? */
         if( Arrays.equals(a, sortedSrc) == false ) 
         {
            System.out.println( "Problem with our mege sort method!!" );
            sortProblem = true;
         }         
         diff2 = (double)((endTime - startTime)/1000000000.0);
         System.out.println( "merge sort = " + diff2 + " seconds." );

         /* create a unique copy of src */
         a = src.clone();
         startTime = System.nanoTime();
         a = quickSort(a, 0, a.length-1);
         endTime = System.nanoTime();         
         /* did we sort correctly? */
         if( Arrays.equals(a, sortedSrc) == false ) 
         {
            System.out.println( "Problem with our quick sort method!!" );
            sortProblem = true;
         }         
         diff3 = (double)((endTime - startTime)/1000000000.0);
         System.out.println( "quick sort = " + diff3 + " seconds." );

         /* create a unique copy of src */
         a = src.clone();
         startTime = System.nanoTime();
         a = javaSort(a, 0, a.length-1);
         endTime = System.nanoTime();         
         /* did we sort correctly? */
         if( Arrays.equals(a, sortedSrc) == false ) 
         {
            System.out.println( "Problem with Java's sort method!!" );
            sortProblem = true;
         }         
         diff4 = (double)((endTime - startTime)/1000000000.0);
         System.out.println( "Java's sort = " + diff4 + " seconds." );
         
         if( !sortProblem )
         {
            pw.printf(arraySize + ", " + diff1 + ", " + diff2 + ", " + diff3 + ", " + diff4 + "\n");
         }
         else
         {
            pw.printf( "One (or more) of the array sorts did not sort correctly!\n" );
         }
         
      }
      pw.close();
   }

   /* write an n^2 (two nested for loops) sort method here like bubblesort, etc... */
   /* try setting a flag to exit early if array is sorted (i.e when no swaps are performed) */
   public static int[] bubbleSort( int[] a, int low, int high )
   {
      return a;
   }

   /* here is our mergeSort from class - 
         note that merge is already written */
	public static int[] mergeSort(int[] a, int low, int high) {
		if (low<high){
		int[] b = new int[high/2];
			int[] c = new int[a.length - high / 2];

			// Filling up array b
			int i = 0;
			for (i = 0; i < b.length; i++)
				b[i] = a[i];

			// Filling up array c
			for (int j = c.length-1; j > high/2; j--)
				c[j] = a[j];

			// Sorting the left side
			mergeSort(b, 0, b.length - 1);

			// Sorting the right side
			mergeSort(c, 0, c.length - 1);
			
			merge(b,c);

		}
		return a;
	}
   /* this is the merge we wrote in class */
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int aIdx = 0;
		int bIdx = 0;
		for (int i = 0; i < c.length; i++) {
			if (aIdx < a.length && bIdx < b.length) {
				if (a[aIdx] < b[bIdx]) {
					c[i] = a[aIdx];
					aIdx++;
				} else {
					c[i] = b[bIdx];
					bIdx++;
				}
			} else {
				if (aIdx >= a.length) {
					c[i] = b[bIdx];
					bIdx++;
				} else {
					c[i] = a[aIdx];
					aIdx++;
				}
			}
		}
		return c;
	}
   
   /* use the Arrays class to sort a before returning it */
	public static int[] javaSort(int[] a, int low, int high) {
		Arrays.sort(a);
		return a;
	}
   
   public static int partition( int[] a, int low, int high )
   {
      return a.length/2;
   }
   public static int[] quickSort(int[] a, int low, int high)
   {
      return a;
   }
}