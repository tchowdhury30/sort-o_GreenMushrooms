import java.util.ArrayList;

public class Driver {
  public static void main( String [] args )
  {

 Sorts bob = new Sorts();
    //===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bob.bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = bob.populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bob.bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
     // ===========================================

     //===============for VOID methods=============
  ArrayList glen1 = new ArrayList<Integer>();
  glen1.add(7);
  glen1.add(1);
  glen1.add(5);
  glen1.add(12);
  glen1.add(3);
  System.out.println( "ArrayList glen before sorting:\n" + glen1 );
  bob.selectionSortV(glen1);
  System.out.println( "ArrayList glen after sorting:\n" + glen1 );
  ArrayList coco1 = bob.populate( 10, 1, 1000 );
  System.out.println( "ArrayList coco before sorting:\n" + coco1 );
  bob.selectionSortV(coco1);
  System.out.println( "ArrayList coco after sorting:\n" + coco1 );
//============================================

  /*===============for VOID methods=============*/
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen2 );
      bob.insertionSortV(glen2);
      System.out.println( "\nArrayList glen after sorting:\n" + glen2 );

      ArrayList coco2 = bob.populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco2 );
      bob.insertionSortV(coco2);
      System.out.println( "\nArrayList coco after sorting:\n" + coco2 );
      /*============================================*/

}
}
