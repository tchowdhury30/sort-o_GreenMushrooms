
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
    glen.add(12);
    glen.add(7);
    glen.add(5);
    glen.add(3);
    glen.add(1);
    
    Sorts bob = new Sorts();
    
    //Bubble Sort Best Case
    System.out.println("\n*** Testing bubblesort best case... *** ");
    ArrayList glenBubSrt = glen;
    System.out.println( "ArrayList glen before sorting:\n" + glen);
    bob.bubbleSortV(glenBubSrt);
    System.out.println( "ArrayList glen after sorting:\n" + glenBubSrt);
    
    //Bubble Sort Worst Case
    System.out.println("\n*** Testing bubblesort worst case... *** ");
    ArrayList glen_BubSrt = glen_;
    System.out.println( "ArrayList glen before sorting:\n" + glen_);
    bob.bubbleSortV(glen_BubSrt);
    System.out.println( "ArrayList glen after sorting:\n" + glen_BubSrt);
    
    /*
    ArrayList coco = bob.populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    bob.bubbleSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
		*/
    
    //Selection Sort Best Case
    System.out.println("\n*** Testing selectionsort best case... *** ");
    ArrayList glenSelSrt = glen;
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    bob.selectionSortV(glenSelSrt);
    System.out.println( "ArrayList glen after sorting:\n" + glenSelSrt );
    
    //Selection Sort Worst Case
    System.out.println("\n*** Testing selectionsort worst case... *** ");
    ArrayList glen_SelSrt = glen_;
    System.out.println( "ArrayList glen before sorting:\n" + glen_ );
    bob.selectionSortV(glen_SelSrt);
    System.out.println( "ArrayList glen after sorting:\n" + glen_SelSrt );
    
    /*
    ArrayList coco1 = bob.populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco1 );
    bob.selectionSortV(coco1);
    System.out.println( "ArrayList coco after sorting:\n" + coco1 );
    */
    
    //Insertion Sort Best Case 
    System.out.println("\n*** Testing insertionsort best case... *** ");
    ArrayList glenInsSrt = glen;
    System.out.println( "\nArrayList glen before sorting:\n" + glenInsSrt );
    bob.insertionSortV(glenInsSrt);
    System.out.println( "\nArrayList glen after sorting:\n" + glenInsSrt );

    //Insertion Sort Worst Case 
    System.out.println("\n*** Testing insertionsort worst case... *** ");
    ArrayList glen_InsSrt = glen_;
    System.out.println( "\nArrayList glen_ before sorting:\n" + glen_InsSrt );
    bob.insertionSortV(glen_InsSrt);
    System.out.println( "\nArrayList glen_ after sorting:\n" + glen_InsSrt );
    
    /*
    ArrayList coco2 = bob.populate( 10, 1, 1000 );
    System.out.println( "\nArrayList coco before sorting:\n" + coco2 );
    bob.insertionSortV(coco2);
    System.out.println( "\nArrayList coco after sorting:\n" + coco2 );
		*/
    
  }//end Main
}//end Driver
