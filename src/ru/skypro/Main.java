package ru.skypro;

public class Main {
    public static float averageСalculation (float a){
        return a/30;
    }
    public static float sumOfSpending (float [] arr) {
        float sum = 0;
        for (float i : arr) {
            sum += i;
        }
        return sum;
    }
    public static float[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        float[] arr = new float[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        {
            // Задача 1 (5)
            String fullName = "Ivanov Ivan Ivanovich";
            String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ") );
            String middleName = fullName.substring(fullName.lastIndexOf(" "),fullName.length ());
            String lastName = fullName.substring(0, fullName.indexOf(" "));
            System.out.println("Имя сотрудника " + firstName);
            System.out.println("Фамилия сотрудника " + lastName);
            System.out.println("Отчество сотрудника " + middleName);
        }
        {
            // Задача 2 (6)
            String fullName = "ivanov ivan ivanovich";
            int firstNameChar = fullName.indexOf(" ");
            int middleNameChar = fullName.lastIndexOf(" ");
            char [] arr = fullName.toCharArray();
            arr [0] = Character.toUpperCase(arr[0]);
            arr [firstNameChar + 1] = Character.toUpperCase(arr [firstNameChar + 1]);
            arr [middleNameChar + 1] = Character.toUpperCase(arr [middleNameChar + 1]);
            String fullNameNew = new String (arr);
            System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameNew);
        }
        {
            //Залача 3 (7)
            StringBuilder one = new StringBuilder("135");
            StringBuilder two = new StringBuilder("246");
            one.insert(1, two.charAt(0));
            one.insert(3, two.charAt(1));
            one.insert(5, two.charAt(2));
            System.out.println("Данные строки — " + one);
        }
        {
            // Задача 4 (8)
            String random = "aabccddefgghiijjkk";
            char arr[] = random.toCharArray();
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
        {
            //Задача 5 (6)
            float [] spendingPerMonth = generateRandomArray();
            float sum = sumOfSpending (spendingPerMonth);
            float average = averageСalculation(sum);
            System.out.println("Среднее значение " + average);
        }
    }}