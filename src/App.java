public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*21);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print((num[i]) + " ");
        }

        System.out.println();

        int elegido = Integer.parseInt(System.console().readLine("Introduzca un número de los que se han mostrado: "));
        int nuevo = Integer.parseInt(System.console().readLine("Introduzca el valor por el que quiere sustituirlo: "));

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]==elegido?nuevo:num[i]);
        }
    }
}
