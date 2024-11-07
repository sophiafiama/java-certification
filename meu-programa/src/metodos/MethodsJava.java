package metodos;

public class MethodsJava {

    public double somar(double a, double b) {
        return a + b;
    }

    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    private void imprimirText(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        MethodsJava methodsJava = new MethodsJava();
        double resultado = methodsJava.somar(10, 20);
        System.out.println("Resultado: " + resultado);
        methodsJava.imprimir();
        methodsJava.imprimirText("Imprimindo texto...");
    }
}
