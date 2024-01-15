public class Calculo {
    private int numero1;
    private int numero2;
    private int calculo;

    public int calcularSoma(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        calculo = numero1 + numero2;
        System.out.println(calculo);
        return calculo;
    }
    public static int calcularEstatico(int numero3, int numero4){
        int calculo2;
        calculo2 = numero3 + numero4;
        System.out.println(calculo2);
        return calculo2;
    }
}
