import java.util.Arrays;
public class Tester{
  public static void main(String[]args){

    int[][]arrays = new int[3][];
    arrays[0]= new int [] {1,3,5};
    arrays[1]= new int [] {6,3,100};
    arrays[2]= new int [] {9,2,10};

    int [][][]array = new int[3][][];
    array[0]= new int [][] {{9,2,1},{3,4,5,6}};
    array[1]= new int [][] { {1,0,12,-1},{7,-2,2,1},{ -5, -2,  2, -9 }};
    array[2]= new int [][] {{10,2,7},{2,10,5}};

    int[][]E = {
{ 2,  4, 2 },
{  2, 2, 2 } };
    System.out.print("sum() on [1,3,5]:   ");
    System.out.println(ArrayOps.sum(arrays[0]));
    System.out.print("sum() on [6,3,100]:   ");
    System.out.println(ArrayOps.sum(arrays[1]));
    System.out.print("largest() on [6,3,100]:   ");
    System.out.println(ArrayOps.largest(arrays[1]));
    System.out.print("largest() on [9,2,10]:   ");
    System.out.println(ArrayOps.largest(arrays[2]));
    System.out.print("sumRows() on [[9,2,1],[3,4,5,6]]:  ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(array[0])));
    System.out.print("sum() on [[1,0,12,-1],[7,-2,2,1],[-5,-2,2,-9]]:  ");
    System.out.println(ArrayOps.sum(array[1]));
    System.out.print("sum() on [1,3,5]:  ");
    System.out.println(ArrayOps.sum(arrays[0]));
    System.out.print("sumCols() on [[1,0,12,-1],[7,-2,2,1],[-5,-2,2,-9]]:  ");
    System.out.println(Arrays.toString(ArrayOps.sumCols(array[1])));
    System.out.print("isRowMagic() on [[1,0,12,-1],[7,-2,2,1],[-5,-2,2,-9]]:  ");
    System.out.println(ArrayOps.isRowMagic(array[1]));
    System.out.print("sumRows() on [[10,2,7],[2,10,5]]:  ");
    System.out.println(ArrayOps.isRowMagic(array[2]));
    System.out.print("isColMagic() on [[1,0,12,-1],[7,-2,2,1],[-5,-2,2,-9]]:  ");
    System.out.println(ArrayOps.isColMagic(array[1]));
    System.out.print("sumCols() on [[10,2,7],[2,10,5]]:  ");
    System.out.println(ArrayOps.isColMagic(array[2]));
    System.out.print("isLocationMagic() on [[2,4,2],[2,2,2]]; row 0; col 1:  ");
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.print("isLocationMagic() on [[2,4,2],[2,2,2]]; row 1; col 1:  ");
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));




  }
}
