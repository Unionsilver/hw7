public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int total = 0;
        int month = 0;
        int depositMonth = 15_000;
        while (total < 2_459_000) {
            System.out.println(month + " месяцев понадобиться что бы накопить " + total);
            total = total + depositMonth;
            month = month + 1;
        }
    }

    public static void task2() {
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num = num + 1;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int born = 17;
        int die = 8;
        int totalPeople = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            totalPeople += (totalPeople / 1000) * (born - die);
            System.out.println("Год " + i + ", численность населения составляет " + totalPeople);

        }
    }

    public static void task4() {
        int month = 0;
        double total = 15000.0;
        double limit = 12000000.0;
        while (total < limit) {
            month++;
            total = total * 1.07;
            System.out.printf("месяц %d: сумма  накоплений составляет %.2f рублей %n", month, total);
            System.out.println();
        }
    }


    public static void task5() {
        int month = 0;
        double total = 15000.0;
        double limit = 12000000.0;
        double percent = 7.0;
        while (total < limit) {
            month++;
            total = total * total * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("месяц %d: сумма  накоплений составляет %.2f рублей %n", month, total);
            }
        }
    }

    public static void task6() {
        int month = 0;
        double total = 15000.0;
        int years9 = 9 * 12;
        double percent = 7.0;
        while (month < years9) {
            month++;
            total = total + total * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("месяц %d: сумма  накоплений составляет %.2f рублей %n", month, total);
            }
        }
//        int month;
//        double total = 15000.0;
//        int years9 = 9 * 12;
//        double percent = 7.0;
//        for (month = 0; month <= years9; month++) {
//            total = total + total * percent / 100;
//            if (month % 6 == 0) {
//                System.out.printf("месяц %d: сумма  накоплений составляет %.2f рублей %n", month, total);
//            }
    }


    public static void task7() {
        int daysInMonth = 31;
        for (int friday = 5; friday <= daysInMonth; friday = friday + 7) {
            System.out.println(friday + " число, пятница отчетный день напоминание! Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        int cometEvery79Year = 79;
        int after2023Years = 2023 + 100;
        int before2023years = 2023 - 200;
        for (int comet = 0; comet < after2023Years; comet = comet + cometEvery79Year) {
            if (comet > before2023years) {
                System.out.println(comet);
            }
        }
    }
}
