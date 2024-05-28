public class PassingArrayToMethod {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        minimumNumber(arr);
    }
    
    public static void minimumNumber(int[] arr) {

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }

        System.out.println(minimum + " ");
    }
}
