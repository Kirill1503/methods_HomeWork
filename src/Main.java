public class Main {
    private static boolean isHighYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsHighYearResult(int year, boolean highYear) {
        if (highYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void printIsHighYear(int year) {
        boolean highYear = isHighYear(year);
        printIsHighYearResult(year, highYear);
    }

    public static void printOS(int clientOsIOS) {
        boolean OsIOS = isOsIOS(clientOsIOS);
        clientOsIOSResult(clientOsIOS, OsIOS);
    }
    public static void printOSYear(int clientOsVersionIOS) {
        boolean clientDeviceYear = isOsVersionIOS(clientOsVersionIOS);
        clientOsVersionIOSResult(clientOsVersionIOS, clientDeviceYear);
    }
    private static boolean isOsIOS(int clientOsIOS) {
        return clientOsIOS == 0 ;
    }

    private static boolean isOsVersionIOS(int clientOsVersionIOS) {
        return clientOsVersionIOS >= 2015;
    }
    private static void clientOsVersionIOSResult(int clientOsVersionIOS, boolean clientDeviceYear) {
        if (clientDeviceYear) {
            System.out.print("Установите приложение по ссылке");
        } else {
            System.out.print("Установите облегченную версию приложения по ссылке");
        }
    }
    private static void clientOsIOSResult(int clientOsIOS, boolean OsIOS) {
        if (OsIOS) {
            System.out.println(" для IOS");
        } else {
            System.out.println(" для Android");
        }
    }
    private static void distanceDay(int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("1 day");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("2 day");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100)
            System.out.println("3 day");
    }
        public static void main(String[] args) {
//    public static void printSeparator() {
//        System.out.println("+++++++++++++++++++++++++++++++");
//        System.out.println("-------------------------------");
//    }
//    public static void printIssues(int issueCount){
//        System.out.println(issueCount);
//    }
//    public static int sum (int[] numbers){
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        return sum;
//    }
//        Лекция:
//        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
//        printSeparator();
//        for (int i = 0; i < issuesByMonth.length; i++) {
//            printIssues(issuesByMonth[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesByMonth);
//        printIssues(total);
        int year = 2096;
        printIsHighYear(year);

        printOSYear(2013);
        printOS(1);

        distanceDay(95);
        }
    }