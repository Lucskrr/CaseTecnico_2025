import java.util.*;

public class Main {
        public static void main(String[] args) {
                System.out.println("===== Testes das Funções =====\n");

                // Teste da função mesCorrespondente
                System.out.println("1. Teste de MesCorrespondente:");
                System.out.println("Entrada: 1 -> Saída: " + MesCorrespondente.mesCorrespondente(1)); // Janeiro
                System.out.println("Entrada: 13 -> Saída: " + MesCorrespondente.mesCorrespondente(13)); // Mês
                                                                                                        // Desconhecido
                System.out.println("----------------------------------------");

                // Teste da função mediaSimples
                System.out.println("2. Teste de MediaSimples:");
                int[] notas = { 4, 6, 8 };
                int[] notasInvalidas = { 1, 2 };
                System.out.println("Entrada: [4,6,8] -> Saída: " + MediaSimples.mediaSimples(notas)); // 6.0
                System.out.println("Entrada: [1,2] -> Saída: " + MediaSimples.mediaSimples(notasInvalidas)); // false
                System.out.println("----------------------------------------");

                // Teste da função parOuImpar
                System.out.println("3. Teste de ParOuImpar:");
                int[] array = { 1, 2, 3, 4, 5 };
                System.out.println("Entrada: [1,2,3,4,5] -> Saída: " + ParOuImpar.parOuImpar(array)); // 2
                System.out.println("----------------------------------------");

                // Teste da função inverterString
                System.out.println("4. Teste de InverterString:");
                System.out.println("Entrada: 'foo' -> Saída: " + InverterString.inverterString("foo")); // oof
                System.out.println("Entrada: 'bar' -> Saída: " + InverterString.inverterString("bar")); // rab
                System.out.println("----------------------------------------");

                // Teste da função substituirCaracteres
                System.out.println("5. Teste de SubstituirCaracteres:");
                System.out.println("Entrada: 'Foo' -> Saída: " + SubstituirCaracteres.substituirCaracteres("Foo")); // F??
                System.out.println("Entrada: 'Bar' -> Saída: " + SubstituirCaracteres.substituirCaracteres("Bar")); // B?r
                System.out.println("----------------------------------------");

                // Teste da função ordenarArray
                System.out.println("6. Teste de OrdenarArray:");
                int[] arrayParaOrdenar = { 5, 1, 0, 7, 3, 3 };
                System.out.println(
                                "Entrada: [5,1,0,7,3,3] -> Saída: "
                                                + Arrays.toString(OrdenarArray.ordenarArray(arrayParaOrdenar))); // [0,
                                                                                                                 // 1,
                                                                                                                 // 3,
                                                                                                                 // 3,
                                                                                                                 // 5,
                                                                                                                 // 7]
                System.out.println("----------------------------------------");

                // Teste da função primeiroValorNaoRepetido
                System.out.println("7. Teste de PrimeiroValorNaoRepetido:");
                int[] arrayComRepetidos = { 2, 2, 3, 1, 1, 6 };
                System.out.println("Entrada: [2,2,3,1,1,6] -> Saída: "
                                + PrimeiroValorNaoRepetido.primeiroValorNaoRepetido(arrayComRepetidos)); // 3
                System.out.println("----------------------------------------");

                // Teste da função manipulacaoArquivo
                System.out.println("8. Teste de ManipulacaoArquivo:");
                System.out.println(
                                "Número de linhas que atendem à condição: "
                                                + ManipulacaoArquivo.manipulacaoArquivo("data/data.dat"));
                System.out.println("----------------------------------------");

                // Teste da função encontrarNumeroCartao
                System.out.println("9. Teste de EncontrarNumeroCartao:");
                System.out.println("Número do cartão: " + NumeroCartaoCredito.encontrarNumeroCartao());
                System.out.println("----------------------------------------");

                // Teste da função caixaEletronico
                System.out.println("10. Teste de CaixaEletronico:");
                int[] cedulas = { 100, 50, 20, 10, 5, 1 };
                System.out.println(
                                "Entrada: 150, [100,50,20,10,5,1] -> Saída: "
                                                + CaixaEletronico.menorNumeroNotas(150, cedulas)); // {100=1,
                                                                                                   // 50=1}
                System.out.println("========================================");

                // Teste da função lerArquivoTeste11
                System.out.println("\n===== Questão Teórica =====");
                System.out.println(LeitorArquivoTeste11.lerArquivoTeste11("teste11/teste11.txt"));

        }
}
