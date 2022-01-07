// Green Mushrooms | Emily Ortiz, Tasnim Chowdhury, Kartik Vanjani
// APCS pd8
// Lab04
<<<<<<< HEAD
// SOTW
=======
// SOTW: TBD
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437

import java.util.ArrayList;

public class Sorts {
  public Sorts(){} //default constructor

 //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      // offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void bubbleSortV( ArrayList<Comparable> data ) {
<<<<<<< HEAD
    int passCtr = 0;
  	int swapCtr = 0;
    int compCtr = 0;

  	// does length-1 passes bc that is when everything is for sure sorted
    for (int j = 0; j < data.size()-1; j++){

=======
    int passCtr = 0; 
  	int swapCtr = 0;
    int compCtr = 0;
    
  	// does length-1 passes bc that is when everything is for sure sorted
    for (int j = 0; j < data.size()-1; j++){
    	
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
      // traversing thruough array from last element to 0 index
    	for (int i = data.size()-1; i > j; i--){
					Comparable mainObj = data.get(i);
					Comparable adjacentObj = data.get(i-1);
<<<<<<< HEAD

        	// if value at index we are looking at is less than the value before it, swap
	      	if (mainObj.compareTo(adjacentObj) < 0) {
=======
  				
        	// if value at index we are looking at is less than the value before it, swap
	      	if (mainObj.compareTo(adjacentObj) < 0) { 
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
						data.set(i, adjacentObj);
						data.set(i-1, mainObj);
           	swapCtr++;
      		}
        	compCtr++;
        }
      passCtr++;
    }
    System.out.println("BubbleSort Data|\tComparisons: " + compCtr + "\tSwaps: " + swapCtr + "\tPasses: " + passCtr);
  } //end bubbleSortV

<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  		bubbleSortV(output);

		return output;
  	}
<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
  public static void selectionSortV( ArrayList<Comparable> data ) {
    //note: this version places greatest value at "rightmost" end
    int passCtr = 0;
    int swapCtr = 0;
    int compCtr = 0;
    int maxPos; //maxPos will point to position of SELECTION (greatest value)

    //does length-1 passes bc that is when everything is sorted
    for(int pass=data.size()-1; pass > 0; pass-- ) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
<<<<<<< HEAD
      int min = (int)(data.get(0));; //creating variable to represent largest value of the current pass

      // sets the max (largest position) to pass, and goes right to left to determine the largest value and print its data.
      for( maxPos=pass; maxPos > 0; maxPos-- ) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag

        //if value at current index is greater than min, change min to current value
=======
      int min = (int)(data.get(0));; //creating variable to represent largest value of the current pass 

      // sets the max (largest position) to pass, and goes right to left to determine the largest value and print its data. 
      for( maxPos=pass; maxPos > 0; maxPos-- ) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
       
        //if value at current index is greater than min, change min to current value 
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
        compCtr++;
        if ((data.get(maxPos)).compareTo(min) > 0) {
          min = (int)(data.get(maxPos));
          swapCtr++;
        }
      }
<<<<<<< HEAD

      //swap
      data.set(data.indexOf(min), data.get(pass));
      data.set(pass, min);
      System.out.println( "after swap: " +  data );//diag
=======
      
      //swap
      data.set(data.indexOf(min), data.get(pass));
      data.set(pass, min);
      System.out.println( "after swap: " +  data );//diag	
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
      passCtr++;
    }
		System.out.println("SelectionSort Data|\tComparisons: " + compCtr + "\tSwaps: " + swapCtr + "\tPasses: " + passCtr);
  }//end selectionSort
<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  		selectionSortV(output);

		return output;
  	}
<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
  public static void insertionSortV( ArrayList<Comparable> data ) {
    // partition counter.
    int passCtr = 0;
    int swapCtr = 0;
    int compCtr = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i --) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i-1)) < 0) {
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

          // swaps the values as necessary
          Comparable temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
          swapCtr++;
          passCtr++;
          compCtr++;
          System.out.println("SelectionSort Data|\tComparisons: " + compCtr + "\tSwaps: " + swapCtr + "\tPasses: " + passCtr);
        }
        else {
          break;
        }
      } 
    }
  } //end insertionSortV
<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  		insertionSortV(output);

		return output;
  	}
<<<<<<< HEAD

=======
  
>>>>>>> 83ee7b81c70422300a7f1b611866aca1dcb67437
} //end Sorts
