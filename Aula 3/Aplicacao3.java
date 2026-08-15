public class Aplicacao3{
    public static void main(String[] args) {
        Hora hora = new Hora(19,17,24);
        Data1 data = new Data1(14, 8, 2026, hora);

        System.out.println(data.dia);
        System.out.println(data.hora.minutos);
    }
}