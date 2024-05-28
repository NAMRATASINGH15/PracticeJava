public class Anonymous {

    public static void main(String[] args) {

        maximumNumber(new int[] {10, 60, 30, 40, 50}); //Passing anonymous array to a method

    }

    public static void maximumNumber(int[] arr) {

        int maximumElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maximumElement < arr[i]) {
                maximumElement = arr[i];
            }
        }
        
        System.out.println(maximumElement);
    }
}
