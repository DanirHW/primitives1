public class Main {
    public static void main(String[] args) {

        int cost = 25001; // Стоимост билета
        int condition = 20; // За каждые 20 рублей начисляем 1 милю

        int bonus = cost / condition; // Расчитываем бонус

        System.out.println((bonus) + " бонуса(ов)");

    }
}