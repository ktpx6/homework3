public class Main {
    public static void main(String[] args) {
        System.out.println ("Задача 1");

        int q = 3000000;
        byte w = 120;
        short e = 15;
        long x = 151_515_151_515L;
        float t = 2.7f;
        double y = -1.1;

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(x);
        System.out.println(t);
        System.out.println(y);

        System.out.println ("Задача 2");

        byte b1 = 67;
        short s1 = 569;
        int i1 = 27897;
        long l1 = 987_678_965_549L;
        float f1 = 27.12f;
        double d1 = 2.786;
        short s2 = -159;

        System.out.println (b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(s2);

        System.out.println ("Задача 3");

        int lyudmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;
        int totalStudents = lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int totalPaperSheets = 480;
        int sheetsPerStudent = totalPaperSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println ("Задача 4");

        int bottlesPerMinute = 8;
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerMonth = 30;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * minutesPerHour * hoursPerDay;
        int bottlesIn3Days = bottlesPerDay * 3;
        int bottlesInMonth = bottlesPerDay * daysPerMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("В сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        System.out.println ("Задача 5");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);

        int whiteCans = totalClasses * whiteCansPerClass;
        int brownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        System.out.println ("Задача 6");

        int bananaCount = 5;
        int bananaWeight = 80;
        int milkVolume = 2;
        int milkWeightPerMl = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggCount = 4;
        int eggWeight = 70;

        int bananaTotalWeight = bananaCount * bananaWeight;
        int milkTotalWeight = milkVolume * milkWeightPerMl;
        int iceCreamTotalWeight = iceCreamCount * iceCreamWeight;
        int eggTotalWeight = eggCount * eggWeight;

        int breakfastTotalWeight = (bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggTotalWeight);

        double breakfastWeightInKg = (double) breakfastTotalWeight / 1000;

        System.out.println("Вес завтрака:");
        System.out.println("- В граммах: " + breakfastTotalWeight);
        System.out.println("- В килограммах: " + breakfastWeightInKg);

        System.out.println ("Задача 7");

        double goalLosingWeight = 7.0;
        double lossDayMinimum = 250.0;
        double lossDayMaximum = 500.0;

        int daysMinimum = (int) (7.0 / 0.25);
        int daysMaximum = (int) (7.0 / 0.5);

        int daysAverage = (daysMinimum + daysMaximum) / 2;

        System.out.println("При минимальной потере веса (250 г/день): " + daysMinimum + " дней");
        System.out.println("При максимальной потере веса (500 г/день): " + daysMaximum + " дней");
        System.out.println("В среднем: " + (daysAverage) + " день");

        System.out.println ("Задача 8");

        int mashaCurrentSalary = 67760;
        double mashaIncrease = mashaCurrentSalary * 0.1;
        int mashaNewSalary = mashaCurrentSalary + (int) mashaIncrease;
        int mashaAnnualIncrease = (mashaNewSalary - mashaCurrentSalary) * 12;

        int denisCurrentSalary = 83690;
        double denisIncrease = denisCurrentSalary * 0.1;
        int denisNewSalary = denisCurrentSalary + (int) denisIncrease;
        int denisAnnualIncrease = (denisNewSalary - denisCurrentSalary) * 12;

        int kristinaCurrentSalary = 76230;
        double kristinaIncrease = kristinaCurrentSalary * 0.1;
        int kristinaNewSalary = kristinaCurrentSalary + (int) kristinaIncrease;
        int kristinaAnnualIncrease = (kristinaNewSalary - kristinaCurrentSalary) * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncrease + " рублей.");

    }
}