import java.util.Arrays;
import java.util.Scanner;

public class algoritm_bubble {
    public static void main(String[] args) {
        /*Необходимо написать программу для сортировки данных массива по возрастанию.
Использовать пузырьковый метод сортировки.*/
        //Создание массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int mas_long = in.nextInt();
        System.out.println("длина массива: " + mas_long);
        int[] massiv = new int[mas_long];
        System.out.println("Заполните числами массив: ");
        for (int i = 0; i < mas_long; i++) {
            massiv[i] = in.nextInt();
        }System.out.println("Массив =");
        System.out.println(Arrays.toString(massiv));
        // сортировка заданного массива
        System.out.println("Сортировка массива ");
         for (int k = massiv.length - 1; k > 0; k--) {
            for (int l = 0; l < k; l++) {
             if (massiv[l] > massiv[l + 1]) {
               int temp = massiv[l];
               massiv[l] = massiv[l + 1];
               massiv[l + 1] = temp;
                        }
                    }
                }System.out.println("Резульат сортировки =");
        System.out.println(Arrays.toString(massiv));
            }
        }
