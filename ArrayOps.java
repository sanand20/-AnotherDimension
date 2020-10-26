public class ArrayOps {
    public static int sum(int[] arr){
    int ans =0;
    for (int i=0; i<arr.length; i++){
      ans+= arr[i];
    }
    return ans;
  }
    public static int largest(int [] arr){
      int ans=0;
      for (int i = 0; i<arr.length; i++){
        if (arr[i]>ans){
          ans= arr[i];
        }
      }
      return ans;
    }
    public static int[] sumRows(int[][] matrix){
      int [] ans= new int [matrix.length];
      for (int i=0; i<matrix.length; i++){
        ans[i]= sum(matrix[i]);
      }
      return ans;
    }
    public static int[] largestInRows(int[][] matrix){
      int [] ans= new int [matrix.length];
      for (int i=0; i<matrix.length; i++){
        ans[i]= largest(matrix[i]);
      }
      return ans;
    }
    public static int sum(int[][] arr){
      return sum(sumRows(arr));
    }
    public static int[] sumCols(int[][] arr){
      int [] matrix = arr[0];
      int [] ans= new int [matrix.length];
      for (int i=0; i<matrix.length; i++){
        for (int j = 0; j<arr.length; j++){
          ans[i]+=arr[j][i];
        }
      }
      return ans;
    }
    public static boolean isRowMagic(int[][] arr){
      boolean ans = true;
      int [] ar= sumRows(arr);
      for (int i=0; i<ar.length-1; i++){
        if (ar[i]!=ar[i+1]){
          ans=false;
        }
      }
      return ans;
    }
    public static boolean isColMagic(int[][] arr){
      boolean ans = true;
      int [] ar= sumCols(arr);
      for (int i=0; i<ar.length-1; i++){
        if (ar[i]!=ar[i+1]){
          ans=false;
        }
      }
      return ans;
    }
    public static boolean isLocationMagic(int[][] matrix, int row, int col){
      int [] arr = matrix[0];
      int [] colarr = new int [arr.length];
      for (int j = 0; j<matrix.length; j++){
        colarr[j]= matrix[j][col];
      }
      int rowsum = sum(matrix[row]);
      int colsum = sum(colarr);
    
      return rowsum==colsum;

  }
}
