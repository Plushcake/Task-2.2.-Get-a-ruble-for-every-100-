public class Main {
    public static void main(String[] args) {
        int enterMoney = 1100;  // Ввод количества денег.
        int clientMoney = 100; // Деньги на счете у клиента.
        boolean bonus = true;
        int bonusMoney = bonus ? enterMoney / 100 : 0; // Бонусы.


        int equation = enterMoney + clientMoney;
        if (equation >= 1200) {
            equation = enterMoney + clientMoney + bonusMoney; // С 9 по 20 строчку была использованна магия.
        } else {                                              // Сам не понял какая. Но каставал очень много часов. @_@.
            equation = enterMoney + clientMoney;              // Повторить смогу, наверное.
        }


        System.out.println("Сумма " + equation + " рублей");

        if (equation >= 1200) {
            System.out.println("Ваш бонус равен " + bonusMoney);
        }

    }
}

//Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей.
//1 рубль за каждые полные 100 рублей пополнения.
