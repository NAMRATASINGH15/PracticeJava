public class ArrayTraversal {

    public static void main(String[] args) {

        //Decalartion and Instantiation
        int[] arr = new int[6];

        //Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        //Declaration, Instantiation and Initialization at a same time
        int[] brr = {10, 20, 30, 40};

        //Treverse Array
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}
