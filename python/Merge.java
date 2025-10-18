import java.util.Scanner;

class Merge{
  public static void mergee(int[] arr1, int m,int[] arr2,int n) {
    int p1 = m-1;
    int p2 = n-1;
    int p = m+n-1;

    while (p1>=0 && p2>=0){
      if(arr1[p1]>arr2[p2]){
        arr1[p] = arr1[p1];
        p1--;
      }
      else{
        arr1[p] = arr2[p2];
        p2--;
      }
      p--;
    }
    while(p2>=0){
      arr1[p] = arr2[p2];
      p--;
      p2--;
    }
    
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number of m (arr1): ");
    int m = s.nextInt();
    System.out.println("Enter a number n (arr2): ");
    int n = s.nextInt();

    int[] arr1= new int[m+n];
    int[] arr2= new int[n];
    for(int i=0 ; i<m ; i++){
      arr1[i] = s.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      arr2[i] = s.nextInt();
    }
    mergee(arr1,m,arr2,n);

    for (int i : arr1) {
      System.out.print(i + " ");
    }

    s.close();
  }
}