public class array3 {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500, 600, 700 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 500) {
                System.out.println(i);
            }
        }
    }
    
}
