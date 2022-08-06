public class Main {
    public static void main(String[] args) {
        // Задание 1
        int teeth = 28;
        double myHeight = 1.585;
        boolean iHaveMolar = teeth > 28;
        System.out.println(iHaveMolar);
        float myWeight = 45.86f;
        long fingers = 10L;
        short nostrils = 2;
        byte tongue = 1;
        char a = 65;
        char b = 122;
        char c = 101;
        char d = 108;
        char e = 97;
        char f = 176;
        System.out.println(f +  " " + a +  " " + b + " " + e + " " + b + " " + c + " " + d + " " +  d +  " " + f);
        System.out.println(" ");

        // Задание 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        double weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        System.out.println(" ");

        // Задание 3
        double bananaWeight = 80;
        double milkWeight = 105;
        double iceCreamWeight = 100;
        double eggWeight = 70;

        double bananasWeight = bananaWeight * 5;
        double milksWeight = milkWeight * 2;
        double iceCreamsWeight = iceCreamWeight * 2;
        double eggsWeight = eggWeight * 4;

        double allProductsWeight = bananasWeight + milksWeight + iceCreamsWeight + eggsWeight;
        System.out.println("Вес сбалансированного спорт-завтрака составляет " + allProductsWeight + " гр (или " + allProductsWeight / 1000 + " кг)");
        System.out.println(" ");

        // Задание 4
        double loseWeight = 7;

        double firstLoseDuringTheDay = 250;
        double daysForTheFirstWeightLoss = loseWeight * 1000 / firstLoseDuringTheDay;
        System.out.println(daysForTheFirstWeightLoss + " дней уйдет на похудение, сели спортсмен будет терять каждый день по " + firstLoseDuringTheDay + " гр");

        double secondLoseDuringTheDay = 500;
        double daysForTheSecondWeightLoss = loseWeight * 1000 / secondLoseDuringTheDay;
        System.out.println(daysForTheSecondWeightLoss + " дней уйдет на похудение, сели спортсмен будет терять каждый день по " + secondLoseDuringTheDay + " гр");

        double daysOnAverageForWeightLoss = (daysForTheFirstWeightLoss + daysForTheSecondWeightLoss) / 2;
        System.out.println("В среднем может потребоваться " + daysOnAverageForWeightLoss + " день, чтобы добиться результатов похудения");
        System.out.println(" ");

        // Задание 5
        double currentSalaryM = 67760;
        double currentSalaryD = 83690;
        double currentSalaryK = 76230;

        double increaseM = currentSalaryM * 0.1;
        double increaseD = currentSalaryD * 0.1;
        double increaseK = currentSalaryK * 0.1;

        double increasedSalaryM = currentSalaryM + increaseM;
        double increasedSalaryD = currentSalaryD + increaseD;
        double increasedSalaryK = currentSalaryK + increaseK;

        double currentAnnualIncomeM = currentSalaryM * 12;
        double currentAnnualIncomeD = currentSalaryD * 12;
        double currentAnnualIncomeK = currentSalaryK * 12;

        double increasedAnnualIncomeM = increasedSalaryM * 12;
        double increasedAnnualIncomeD = increasedSalaryD * 12;
        double increasedAnnualIncomeK = increasedSalaryK * 12;

        double differenceInMAnnualIncome = increasedAnnualIncomeM - currentAnnualIncomeM;
        double differenceInDAnnualIncome = increasedAnnualIncomeD - currentAnnualIncomeD;
        double differenceInKAnnualIncome = increasedAnnualIncomeK - currentAnnualIncomeK;

        System.out.println("Маша теперь получает " + increasedSalaryM + " рублей. Годовой доход вырос на " + differenceInMAnnualIncome + " рублей.");
        System.out.println("Денис теперь получает " + increasedSalaryD + " рублей. Годовой доход вырос на " + differenceInDAnnualIncome + " рублей.");
        System.out.println("Кристина теперь получает " + increasedSalaryK + " рублей. Годовой доход вырос на " + differenceInKAnnualIncome + " рублей.");

    }
}