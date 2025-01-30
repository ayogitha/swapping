public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping:");
        System.out.printf("a = %d " , a);
        System.out.printf("b = %d \n" , b);

        // Swap the values
        int temp = a; // Use a temporary variable to store the value of a
        a = b;        // Assign the value of b to a
        b = temp;     // Assign the stored value of a (from temp) to b

        System.out.println("After Swapping:");
        System.out.printf("a = %d " , a);
        System.out.printf("b = %d " , b);
        
    }
    
    
}
