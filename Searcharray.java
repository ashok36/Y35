public class Searchele {
   public static void main(String[] args) {
      int[] a = { 1, 81, 9, 4, 7, 13, 10, -2, 6, 2 };
      int target = 2;
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] == target) {
            System.out.println("Element found at index " + i);
            break;
         } 
      } 
   }
}