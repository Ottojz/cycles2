public class Main {
    public static void main(String[] args) {

        System.out.println();
        //task 1
        System.out.println("task 1");

        int invest = 15_000;
        int savings = 0;
        byte month = 0;

        while (savings < 2_459_000) {
            savings += savings / 100;
            savings += invest;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Для накопления нужной суммы потребуется " + month + " месяцев.");

        System.out.println();
        //task 2
        System.out.println("task 2");

        byte i = 0;

        while (i < 10) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (;i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //Перепенную назвал "i" так как это стандартное название для переменной в цикле "for"

        System.out.println();
        //task 3
        System.out.println("task 3");

        int population = 12_000_000;
        float birthRate = 0.017F;
        float mortality = 0.008F;
        byte year = 0;

        do {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population = (int) (population + (population * birthRate) - (population * mortality));
            ++year;
        } while (year <= 10);

        System.out.println();
        //task 4
        System.out.println("task 4");

        savings = 0;
        float percent = 0.07F;
        invest = 15_000;
        month = 0;

        while (savings <= 12_000_000) {
            savings += (int) (savings * percent) + invest;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + savings);
        }
        System.out.println("Для накопления нужной суммы потребуется " + month + " месяцев.");

        System.out.println();
        //task 5
        System.out.println("task 5");

        savings = 0;
        percent = 0.07F;
        invest = 15_000;
        month = 0;

        while (savings <= 12_000_000) {
            savings += (int) (savings * percent) + invest;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + savings);
            }
        }
        System.out.println("Для накопления нужной суммы потребуется " + month + " месяцев.");

        System.out.println();
        //task 6
        System.out.println("task 6");

        savings = 0;
        percent = 0.07F;
        invest = 15_000;
        month = 0;

        while (month <= (9 * 12)) {
            savings += (int) (savings * percent) + invest;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + savings);
            }
        }
        System.out.println("За 9 лет будет накомлено " + savings + " рублей.");

        System.out.println();
        //task 7
        System.out.println("task 7");

        int firstFriday = 3;

        for (byte date = 1; date <= 31; date++) {
            if ((date - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        //task 8
        System.out.println("task 8");

        byte cometPeriod = 79;
        short cometYear = 0;
        short currentYear = 2024;

        do {
            cometYear += cometPeriod;
            if (currentYear - cometYear <= 200 && currentYear > cometYear) {
                System.out.println(cometYear);
            } else if (currentYear < cometYear && cometYear - currentYear <= 100) {
                System.out.println(cometYear);
            }
        } while (cometYear <= currentYear + 100);

        System.out.println();
        //Понимаю, что можно решить задачу и через другие циклы, но "do while" я за всю домашку использовал только 1 раз
        //А так предполагаю, что удобнее было бы через "for"
    }
}