package murfey;

import java.util.Random;
import java.text.DecimalFormat;

public class BinarySearch
{
   public static void main(String[] args)
   {
      System.out.println( "Morris Ballenger" );
      System.out.println( "6/6/16" );
      System.out.println( "CS 324 - Intro to Design of Algorithms" );
      DecimalFormat df = new DecimalFormat("0.000000000");
      BinarySearch bin = new BinarySearch();
      Random r = new Random();
      int n = Math.abs(r.nextInt());  //or try 399387307 - how many guesses will you need?; 
      //n = 399387307;
      System.out.println( "n = " + n );
      
      double javaResult = Math.sqrt(n);
      double myResult = bin.squareRoot(n);
      int myResultSquared = (int) (myResult * myResult);
      int javaResultSquared = (int) (javaResult * javaResult);
      double javaResultDiff = ((double)Math.abs(javaResultSquared - n) / n) * 100.0;
      double myResultDiff = ((double)Math.abs(myResultSquared - n) / n) * 100.0;
      
      System.out.println( "According to java, the square root of " + n + " is " + javaResult );
      System.out.println( "According to my method, the square root of " + n + " is " + myResult );
      System.out.println( "Squaring java's result gives " + javaResultSquared );
      System.out.println( "Squaring my result gives " + myResultSquared );
      System.out.println( "Java's percentage difference is: " + df.format(javaResultDiff) + "%" );
      System.out.print( "My percentage difference is: " +  df.format(myResultDiff) + "%.  " );
      if( myResultDiff > 0.0001 )
      {
         System.out.println( "That's a bit too much.");
      }
      else
      {
         System.out.println( "Not too bad!");
      }
      
      int[] a = new int[30];
      System.out.println( "----------------\nCreating an array: ");
      for( int i=0; i<a.length; i++ )
      {
         a[i] = Math.abs(r.nextInt()) % 60;         
         System.out.print(a[i] + " " );
      }
      System.out.println();
      System.out.println( "Sorted: ");      
      a = bin.mergeSort(a);
      for( int i=0; i<a.length; i++ )
      {
         System.out.print(a[i] + " " );
      }
      System.out.println();
      System.out.println( "Searching array..." );
      for( int i=0; i<10; i++ )
      {
         int f = Math.abs(r.nextInt()) % 60;
         int idx = bin.findInArray(a, f);
         if( idx >= 0 )
         {
            System.out.println( f + " is in the array!  It is at position " + idx + "." );
            System.out.println( "    - The value at position " + idx + " is: " + a[idx] + "." );
         }
         else
         {
            System.out.println( f + " is NOT in the array!" );
         }
      }
   }
   
   // calculate the square root of n
   // do not use java's square root function
   // write your own using divide and conquer
   // your method will make a guess, check it's guess and adjust accordingly 
   // make it run in log2(n) time! 
   public double squareRoot(int n)
   {
		double temp;
		double squareRoot = n / 2;

		do {
			temp = squareRoot;
			squareRoot = (temp + (n / temp)) / 2;
		} while ((temp - squareRoot) != 0);

		return squareRoot;
   }
   
   /* search the array a for value x 
      return the index of value x OR
      -1 if value is not in the array.
      don't run in linear time!! */
	public int findInArray(int[] a, int x) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				return i;
		return -1;
	}

   public int[] mergeSort(int[] a)
   {
      if( a.length == 1 ) return a;
      int mid = a.length / 2;
      int[] m1 = new int[mid];
      int[] m2 = new int[a.length - mid];
      for( int i=0; i<m1.length; i++ )
      {
         m1[i] = a[i];
      }
      for( int i=0; i<m2.length; i++ )
      {
         m2[i] = a[i + mid];
      }
      int[] x = mergeSort(m1);
      int[] y = mergeSort(m2);
      int[] mFinal = merge(x, y);
      return mFinal;
   }
   
	/* this is the method you need to write */
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
			c[i] = a[i];

		for (int i = 0; i < b.length; i++)
			c[i + a.length] = b[i];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (i != j && c[j] > c[i]) {
					c[i] = c[i] + c[j];
					c[j] = c[i] - c[j];
					c[i] = c[i] - c[j];
				}
			}
		}

		return c;
	}
}