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
        byte varByte = 1;
        short varShort = 2000;
        int varInt = 3000000;
        long varLong = 400000000000000L;
        float varFloat = 0.55555f;
        double varDouble = 666666.6666666666;


        System.out.println("Задача 1");
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }

    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        int c = 3000000;
        float d = 2.786f;
        short e = 569;
        short f = -159;
        int g = 27897; //использовал int потому что при операциях вероятно выйдет за пределы
        byte h = 67; //для разнообразия


        System.out.println("Задача 2");
        System.out.println("Переменным присвоены заданные значения");
    }

    public static void task3() {
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsEA = 30;
        short allSheets = 480;
        int allStudents = studentsLP + studentsAS + studentsEA;
        int sheetsForOneStudent = allSheets / allStudents;

        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги");

    }

    public static void task4() {
        byte bottlesStart = 16;
        byte timeStart = 2;
        int bottlesPerMinute = bottlesStart / timeStart;
        byte task1Time = 20;
        int task1Result = bottlesPerMinute * task1Time;
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        byte daysInMonth = 30;
        int task2Time = hoursInDay * minutesInHour;
        int task2Result = bottlesPerMinute * task2Time;
        byte task3Time = 3;
        int task3Result = task2Result * task3Time;
        int task4Result = daysInMonth * task2Result;

        System.out.println("Задача 3");
        System.out.println("За 20 минут машина произвела " + task1Result + " штук бутылок");
        System.out.println("В сутки машина произвела " + task2Result + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + task3Result + " штук бутылок");
        System.out.println("За месяц машина произвела " + task4Result + " штук бутылок");

    }

    public static void task5() {
        short cans = 120;
        byte whiteCansOnClass = 2;
        byte brownCansOnClass = 4;
        int classes = cans / (whiteCansOnClass + brownCansOnClass);
        int whiteCans = whiteCansOnClass * classes;
        int brownCans = brownCansOnClass * classes;

        System.out.println("Задача 5");
        System.out.println("НВ школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски ");
    }
    public static void task6() {
        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        short bananaServ = 5;
        short milkServ = 2;
        short iceCreamServ = 2;
        short eggServ = 4;

        int sumGr = bananaWeight * bananaServ + milkWeight * milkServ + iceCreamWeight * iceCreamServ + eggWeight * eggServ;
        float sumKg = (float) sumGr / 1000;
        System.out.println("Задача 6");
        System.out.println("Завтрак весит " + sumGr + " гр.");
        System.out.println("Завтрак весит " + sumKg + " кг.");
    }
    public static void task7() {
        short aim = 7;
        short way1 = 250;
        short way2 = 500;;
        int way1Days = aim * 1000 / way1;
        int way2Days = aim * 1000 / way2;
        int middle = (way2Days + way1Days)/2;



        System.out.println("Задача 7");
        System.out.println("Если каждый день терять " + way1 + " гр., то потребуется " + way1Days + " дней.");
        System.out.println("Если каждый день терять " + way2 + " гр., то потребуется " + way2Days + " дней.");
        System.out.println("В среднем же " + middle + " день.");
    }
    public static void task8() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;;
        int newSalaryMasha = salaryMasha * 10 / 100 + salaryMasha;
        int newSalaryDenis = salaryDenis * 10 / 100 + salaryDenis;
        int newSalaryKristina = salaryKristina * 10 / 100 + salaryKristina;;
        int yearGrowthMasha = 12 * (newSalaryMasha - salaryMasha);
        int yearGrowthDenis = 12 * (newSalaryDenis - salaryDenis);
        int yearGrowthKristina = 12 * (newSalaryKristina - salaryKristina);


        System.out.println("Задача 7");
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearGrowthMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearGrowthDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearGrowthKristina + " рублей");
    }

}