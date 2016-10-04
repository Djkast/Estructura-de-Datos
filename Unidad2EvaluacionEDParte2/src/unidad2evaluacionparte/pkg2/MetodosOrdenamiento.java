package unidad2evaluacionparte.pkg2;

import static java.util.Arrays.sort;
import static java.util.Arrays.sort;

public class MetodosOrdenamiento {

    public static void QuickSortInt(int vect[], int izq, int der) {
        int i = 0;
        int j = 0;
        int x = 0;
        int aux = 0;
        i = izq;
        j = der;
        x = vect[(izq + der) / 2];
        do {
            while ((vect[i] < x) && (j <= der)) {
                i++;
            }
            while ((x < vect[j]) && (j > izq)) {
                j--;
            }
            if (i <= j) {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            QuickSortInt(vect, izq, j);
        }
        if (i < der) {
            QuickSortInt(vect, i, der);
        }
    }

    public static void QuickSortDoble(double[] arr) {
        double[] left = null, right = null;
        int nleft, nright;
        double pivot;
        int i, j, k;
        if (arr.length <= 1) {
            return;
        }
        pivot = arr[arr.length - 1];
        nleft = nright = 0;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= pivot) {
                nleft++;
            } else {
                nright++;
            }
        }
        left = new double[nleft];
        right = new double[nright];
        i = 0;
        j = 0;
        for (k = 0; k < arr.length - 1; k++) {
            if (arr[k] <= pivot) {
                left[i++] = arr[k];
            } else {
                right[j++] = arr[k];
            }
        }
        sort(left);
        sort(right);
        k = 0;
        for (i = 0; i < left.length; i++) {
            arr[k++] = left[i];
        }
        arr[k++] = pivot;
        for (j = 0; j < right.length; j++) {
            arr[k++] = right[j];
        }
    }

    public static void ShellsortInt(int[] arr) {
        int salto = arr.length / 2;
        while (salto >= 1) {
            for (int rec = salto; rec < arr.length; rec++) {
                int temp = arr[rec];
                int j = rec - salto;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + salto] = arr[j];
                    j -= salto;
                }
                arr[j + salto] = temp;
            }
            salto /= 2;
        }
    }

    public static void ShellsortDouble(double[] arr) {
        int salto = arr.length / 2;
        while (salto >= 1) {
            for (int rec = salto; rec < arr.length; rec++) {
                double temp = arr[rec];
                int j = rec - salto;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + salto] = arr[j];
                    j -= salto;
                }
                arr[j + salto] = temp;
            }
            salto /= 2;
        }
    }

    public static void imprimeA(int[] arr) {
        String sal = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                sal += " " + arr[i] + " ";
            } else {
                sal += arr[i] + " ";
            }
        }
        System.out.println(sal);
    }

    public static void imprimeB(double[] arr) {
        String sal = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                sal += " " + arr[i] + " ";
            } else {
                sal += arr[i] + " ";
            }
        }
        System.out.println(sal);
    }

    public static void main(String[] args) {
        int arreglo1[] = {25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
        double arreglo2[] = {10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
        System.out.println("Metodo QuickSort con valores enteros");
        QuickSortInt(arreglo1, 0, arreglo1.length - 1);
        imprimeA(arreglo1);
        System.out.println("Metodo QuickSort con valores Double");
        QuickSortDoble(arreglo2);
        imprimeB(arreglo2);
        System.out.println("Metodo Shell con valores enteros");
        ShellsortInt(arreglo1);
        imprimeA(arreglo1);
        System.out.println("Metodo Shell con valores Double");
        ShellsortDouble(arreglo2);
        imprimeB(arreglo2);
    }
}
