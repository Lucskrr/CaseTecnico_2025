public class NumeroCartaoCredito {
    public static String encontrarNumeroCartao() {
        long numero = 543210000000L;

        while (numero % 123457 != 0) {
            numero++;
        }

        String cardNumber = String.valueOf(numero);
        return cardNumber.substring(0, 6) + "******" + cardNumber.substring(cardNumber.length() - 4);
    }
}
