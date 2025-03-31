public class ParOuImpar {
    public static int parOuImpar(int[] array) {
        int count = 0;
        for (int numero : array) {
            if (numero % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
