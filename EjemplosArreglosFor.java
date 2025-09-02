import java.util.Arrays;

public class EjemplosArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Externo";
        productos[2] = "Altavoces";
        productos[3] = "Monitor";
        productos[4] = "Teclado";
        productos[5] = "Disco Duro SSD";
        productos[6] = "Mouse";

        Arrays.sort(productos);
        for(int i = 0; i < productos.length; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println(" ========== Usando foreach ===============");
        for(String producto : productos) {
            System.out.println("producto = " + producto);
        }

        System.out.println("========== Usando while ================");
        int i = 0;
        while(i < productos.length) {
            System.out.println("para indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("============= Usando Do While =================");
        int k = 0;
        do {
            System.out.println("para indice " + k + ": " + productos[k]);
            k++;
        } while(k < productos.length);

        int[] numeros = new int[10];

        for(int z = 0; z < numeros.length; z++) {
            numeros[z] = z * 3;
        }

        for(int z = 0; z < numeros.length; z++) {
            System.out.println("Numeros = " + numeros[z]);
        }



    }
}