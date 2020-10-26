import java.util.Arrays;
public class Tester{
  public static void main(String[]args){

    int[][]arrays = new int[3][];
    arrays[0]= new int [] {3,6,5};
    arrays[1]= new int [] {6,3,100};
    arrays[2]= new int [] {9,2,10};

    int [][][]array = new int[2][][];
    array[0]= new int [][] {{9,2,1},{3,4,5,6}};
    array[1]= new int [][] { {1,0,12,-1},{7,-2,2,1},{ -5, -2,  2, -9 }};


    System.out.println(ArrayOps.sum(arrays[0]));
    System.out.println(ArrayOps.sum(arrays[1]));
    System.out.println(ArrayOps.sum(arrays[2]));
    System.out.println(ArrayOps.largest(arrays[0]));
    System.out.println(ArrayOps.largest(arrays[1]));
    System.out.println(ArrayOps.largest(arrays[2]));
    System.out.println(Arrays.toString(ArrayOps.sumRows(array[0])));
    System.out.println(ArrayOps.sum(array[1]));


  }
}
