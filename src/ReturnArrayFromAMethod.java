public class ReturnArrayFromAMethod {

    public static void main(String[] args) {

        int[] arr = getValue();

        //for each loop

        for (int v:arr) {
            System.out.println(v);
        }

    }

    public static int[] getValue() {

        return new int[] {1, 20, 3, 4}; //Tip: Returning array as anonymous array syntax
    }
}
