public class MesCorrespondente {
    public static String mesCorrespondente(int mes) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (mes >= 1 && mes <= 12) {
            return meses[mes - 1];
        } else {
            return "Mês Desconhecido";
        }
    }
}
