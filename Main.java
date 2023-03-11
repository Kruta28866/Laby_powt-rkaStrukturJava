package org.example;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
        //Zadanie5();
        //Zadanie6();
        //Zadanie7();
        //Zadanie8();
        //Zadanie9();
        //Zadanie10();
    }

    static void Zadanie1() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Proszę o wprowadzenie Liczby a");
        int a = scan.nextInt();
        System.out.println("Proszę o wprowadzenie liczby b");
        int b = scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Pole prostąkota = " + (a * b));

    }

    static void Zadanie2() {
        Scanner scan = new Scanner(System.in);

        double p = 3.14;

        System.out.println("liczba pi w zaokrągleniu do dwóch miejsc po przecinku:  " + p);
        System.out.print("Pierwiastek drugiego stopnia z liczby pi wynosi: ");
        System.out.format("%.2f%n", Math.sqrt(p));

    }

    static void Zadanie3() {
        Scanner scan = new Scanner(System.in);

        String a;

        System.out.println("Proszę o podanie 2 napisów odzielonych spacją ");
        a = scan.nextLine();

        String[] napisy = a.split(" ");
        String a1 = napisy[0];
        String a2 = napisy[1];

        System.out.println(a2 + " " + a1);

    }

    static void Zadanie4() {
        Scanner scan = new Scanner(System.in);

        int a, b, c;

        System.out.println("Proszę o podanie 3 boków z których ma zostać zbudowany trójkąt:");
        System.out.print("bok a: ");
        a = scan.nextInt();
        System.out.print("bok b: ");
        b = scan.nextInt();
        System.out.print("bok c: ");
        c = scan.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c) {
                if (a + c > b) {
                    if (b + c > a) {
                        System.out.println("Z długości tych boków można utworzyć trójkąt");
                    } else {
                        System.out.println("Z tych boków nie można utworzyć trójkąta.");
                    }

                } else {
                    System.out.println("Z tych boków nie można utworzyć trójkąta.");
                }
            } else {
                System.out.println("Z tych boków nie można utworzyć trójkąta.");
            }

        } else {
            System.out.println("Nieprawidłowe dane.");
        }
    }

    static void Zadanie5() {

        Scanner scan = new Scanner(System.in);

        int a;

        System.out.println("Proszę o wybranie liczby z zakresu 1-12");
        System.out.println("po podaniu liczby wyświetle miesiąc,\noraz liczbe dni tego miesiąca.");
        a = scan.nextInt();
        if (a > 0 && a <= 12) {
            switch (a) {
                case 1:
                    System.out.println("Styczeń - 31 dni");
                    break;
                case 2:
                    System.out.println("Luty - 28 Lub 29 dni");
                    break;
                case 3:
                    System.out.println("Marzec - 31 dni");
                    break;
                case 4:
                    System.out.println("Kwiecień - 30 dni");
                    break;
                case 5:
                    System.out.println("Maj - 31 dni");
                    break;
                case 6:
                    System.out.println("Czerwiec - 30 dni");
                    break;
                case 7:
                    System.out.println("Lipiec - 31 dni");
                    break;
                case 8:
                    System.out.println("Sierpień - 31 dni");
                    break;
                case 9:
                    System.out.println("Wrzesień - 30 dni");
                    break;
                case 10:
                    System.out.println("Październik - 31 dni");
                    break;
                case 11:
                    System.out.println("Listopad - 30 dni");
                    break;
                case 12:
                    System.out.println("Grudzień - 31 dni");
                    break;
            }

        } else {
            System.out.println("Niepoprawne dane2");
        }

    }

    static void Zadanie6() {
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        double min = 0, mid = 0, max = 0;

        System.out.println("prosze o podanie 3 liczb rzeczywistych ");
        System.out.println("Liczba a: ");
        a = scan.nextDouble();
        System.out.println("Liczba b: ");
        b = scan.nextDouble();
        System.out.println("Liczba c: ");
        c = scan.nextDouble();
        System.out.println("Posortuje liczby rosnąco i malejąco, potem na odwrót. ");

        if (a > b) {
            if (b > c) {
                max = a;
                mid = b;
                min = c;
            } else if (a > c) {
                max = a;
                mid = c;
                min = b;
            } else {
                max = c;
                mid = a;
                min = b;
            }
        } else {
            if (a > c) {
                max = b;
                mid = a;
                min = c;
            } else if (b > c) {
                max = b;
                mid = c;
                min = a;
            }
        }

        System.out.println("liczby od rosnącej do malejącej: " + max + " " + mid + " " + min);

        System.out.println("liczby od malejącej do rosnącej: " + min + " " + mid + " " + max);

    }

    static void Zadanie7() {
        Scanner scan = new Scanner(System.in);

        int choice, n, m, wynik, totalWynik = 0;

        System.out.println("Prosze o podanie ilości elementów tablicc");
        n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("proszę o podanie liczb do pierwszego zbioru");

      /*  for (int i : A) {
            A[i] = scan.nextInt();
            System.out.println(A[i]);
        }
        System.out.println("proszę o podanie liczb do drugiego zbioru");
        for (int i : B) {
            B[i] = scan.nextInt();
            System.out.println(B[i]);
        }*/
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
            System.out.println(A[i]);
        }
        System.out.println("proszę o podanie liczb do drugiego zbioru");

        for (int i = 0; i < B.length; i++) {
            B[i] = scan.nextInt();
            System.out.println(B[i]);
        }
        for (int i = 0; (i < A.length) || (i < B.length); i++) {

            wynik = A[i] * B[i];
            System.out.println(A[i] + " | * | " + B[i]);
            totalWynik += wynik;
            System.out.println(totalWynik);
        }
        System.out.println(totalWynik);
    }

    static void Zadanie8() {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Podaj liczbe naturalną n: ");
        n = scan.nextInt();

        while (n <= 0) ;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == 1) {
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static void Zadanie9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();
        if (isPalindrome(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    static void Zadanie10(){

        Scanner scan = new Scanner(System.in);
        System.out.println("proszę o podanie ilości wierszy oraz ilości kolumn w Tablicy.");
        System.out.println("liczba Wierszt: ");
        int a = scan.nextInt();
        System.out.println("liczba Kolumn: ");
        int b = scan.nextInt();

        if(a <= 0 || b <= 0 ){
            System.out.println("Nieprawidłowe dane.");
        }
        else {
            int[][] tab = new int[a][b];


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("proszę o wprowadzenie 2 liczb, odzielone musza być spacją");
                tab [i][j] = scan.nextInt();
            }

        }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println();
            }

        }




    }

    static void Zadanie11(){
        Scanner scan = new Scanner(System.in);

    }
}




