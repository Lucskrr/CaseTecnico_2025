import java.io.*;

public class ManipulacaoArquivo {
    public static int manipulacaoArquivo(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                int countZeros = 0;
                int countOnes = 0;

                for (char c : linha.toCharArray()) {
                    if (c == '0') {
                        countZeros++;
                    } else if (c == '1') {
                        countOnes++;
                    }
                }

                if (countZeros % 3 == 0 || countOnes % 2 == 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
