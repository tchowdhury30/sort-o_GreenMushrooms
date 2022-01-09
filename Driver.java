import java.util.ArrayList;

public class Driver {
  public static void main( String [] args ) {

    // best case
    ArrayList glen = new ArrayList<Integer>();
    glen.add(1);
    glen.add(3);
    glen.add(5);
    glen.add(7);
    glen.add(12);

    //worst case
    ArrayList glen_ = new ArrayList<Integer>();
    glen_.add(12);
    glen_.add(7);
    glen_.add(5);
    glen_.add(3);
    glen_.add(1);

    Sorts bob = new Sorts();


    //Bubble Sort Best Case
    System.out.println("\n\n*** Testing bubblesort best case... *** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen);
    ArrayList glenBubSrt = bob.bubbleSort(glen);
    System.out.println( "\nArrayList glen after sorting:\n" + glenBubSrt);

    //Bubble Sort Worst Case
    System.out.println("\n\n*** Testing bubblesort worst case... *** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen_);
    ArrayList glen_BubSrt = bob.bubbleSort(glen_);
    System.out.println( "\nArrayList glen after sorting:\n" + glen_BubSrt);

    /*
    ArrayList coco = bob.populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    bob.bubbleSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
		*/

    //Selection Sort Best Case
    System.out.println("\n\n*** Testing selectionsort best case... *** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen );
    ArrayList glenSelSrt = bob.selectionSort(glen);
    System.out.println( "\nArrayList glen after sorting:\n" + glenSelSrt );

    //Selection Sort Worst Case
    System.out.println("\n\n*** Testing selectionsort worst case... *** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen_ );
    ArrayList glen_SelSrt = bob.selectionSort(glen_);
    System.out.println( "\nArrayList glen after sorting:\n" + glen_SelSrt);


    /*
    ArrayList coco1 = bob.populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco1 );
    bob.selectionSortV(coco1);
    System.out.println( "ArrayList coco after sorting:\n" + coco1 );
    */

    //Insertion Sort Best Case
    System.out.println("\n\n*** Testing insertionSort best case... *** ");

    System.out.println( "\nArrayList glen before sorting:\n" + glen );
    ArrayList glenInsSrt = bob.insertionSort(glen);
    System.out.println( "\nArrayList glen after sorting:\n" + glenInsSrt );

    //Insertion Sort Worst Case
    System.out.println("\n\n*** Testing insertionSort worst case... *** ");

    System.out.println( "\nArrayList glen_ before sorting:\n" + glen_ );
    ArrayList glen_InsSrt = bob.insertionSort(glen_);
    System.out.println( "\nArrayList glen_ after sorting:\n" + glen_InsSrt );

/*
    //Insertion Sort Random Case
    System.out.println("\n*** Testing insertionSort random case... *** ");
    ArrayList insRan = bob.populate( 10, 1, 1000 );
    System.out.println( "\nArrayList coco before sorting:\n" + insRan );
    bob.insertionSortV(insRan);
    System.out.println( "\nArrayList coco after sorting:\n" + insRan );
*/

  }//end Main
}//end Driver
