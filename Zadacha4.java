import java.util.Scanner;

public class Zadacha4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число k ");
            int k = sc.nextInt();
            System.out.print("Введите размер массива: ");
            int D = sc.nextInt();
            int[] Arr = new int[D];
            System.out.print("Введите элементы массива: ");
            for (int i = 0; i < D; i++) {
                int E = sc.nextInt();
                Arr[i]=E;
            }
            for (int i = 0; i < D; i++) {
                int a=0;
                for (int j = 0; j < i; j++) {
                    a=Arr[i]+Arr[j];
                    if (a==k && (i!= j)) {
                        System.out.println(Arr[i] + " и " + Arr[j] + " равны сумме k");
                    }
                }
            }
        }
    }
    
