public class Tester{
  public static void main(String[]args){

    int[][]arrays = new int[3][];
    arrays[0]= new int [] {3,6,5};
    arrays[1]= new int [] {6,3,100};
    arrays[2]= new int [] {9,2,10};


    System.out.println(ArrayOps.sum(arrays[0]));

  }
}
