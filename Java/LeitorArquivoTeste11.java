import java.io.*;

public class LeitorArquivoTeste11 {
    public static String lerArquivoTeste11(String caminhoArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
        } catch (IOException e) {
            return "Erro ao ler o arquivo: " + e.getMessage();
        }
        return conteudo.toString();
    }
}
