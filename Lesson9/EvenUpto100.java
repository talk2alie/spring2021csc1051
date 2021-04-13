public class EvenUpto100 {
    public static void main(String[] args) {
        System.out.println();

        int count = 1;
        while(count <= 100) {
            count++;
            if((count % 2) != 0) {
                break;
            }             
            System.out.println(count);
        }

        System.out.println();
    }
}
