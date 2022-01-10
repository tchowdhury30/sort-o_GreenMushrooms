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
    //random case
    ArrayList<Comparable> glenTen = bob.populate( 10, 1, 100);
    ArrayList<Compareable> glenHundred = bob.populate(100, 1, 100);
    ArrayList<Comparable> glenThousand = bob.populate(1000, 1, 100);



    //Bubble Sort Best Case
    System.out.println("\n\n***** Testing bubblesort best case... ***** ");

    System.out.println( "ArrayList glen before sorting: " + glen);
    ArrayList glenBubSrt = bob.bubbleSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenBubSrt);

    //Bubble Sort Worst Case
    System.out.println("\n\n***** Testing bubblesort worst case... ***** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen_);
    ArrayList glen_BubSrt = bob.bubbleSort(glen_);
    //System.out.println( "\nArrayList glen after sorting: " + glen_BubSrt);


    //Bubble Sort Random Case
    System.out.println("\n***** Testing BubbleSort random cases... ***** ");

    ///System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    ArrayList bubglenR = bob.bubbleSort(glenR);
    System.out.println("\n");
    //System.out.println( "\nArrayList glenR after sorting: " + bubglenR );



    //Selection Sort Best Case
    System.out.println("\n\n***** Testing selectionsort best case... ***** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen );
    ArrayList glenSelSrt = bob.selectionSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenSelSrt );

    //Selection Sort Worst Case
    System.out.println("\n\n***** Testing selectionsort worst case... ***** ");

    System.out.println( "ArrayList glen before sorting:\n" + glen_ );
    ArrayList glen_SelSrt = bob.selectionSort(glen_);
    //System.out.println( "\nArrayList glen after sorting: " + glen_SelSrt);


    //Selection Sort Random Case
    System.out.println("\n***** Testing SelectionSort random case... ***** ");

    System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    ArrayList selglenR = bob.selectionSort(glenR);
    //System.out.println( "\nArrayList glenR after sorting: " + selglenR );



    //Insertion Sort Best Case
    System.out.println("\n\n***** Testing insertionSort best case... ***** ");

    System.out.println( "\nArrayList glen before sorting:\n" + glen );
    ArrayList glenInsSrt = bob.insertionSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenInsSrt );

    //Insertion Sort Worst Case
    System.out.println("\n\n***** Testing insertionSort worst case... ***** ");

    System.out.println( "\nArrayList glen_ before sorting:\n" + glen_ );
    ArrayList glen_InsSrt = bob.insertionSort(glen_);
    //System.out.println( "\nArrayList glen_ after sorting: " + glen_InsSrt );

    //Insertion Sort Random Case
    System.out.println("\n***** Testing insertionSort random case... ***** ");

    System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    ArrayList insglenR = bob.insertionSort(glenR);
    //System.out.println( "\nArrayList glenR after sorting: " + insglenR );


  }//end Main
}//end Driver
