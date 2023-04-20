/*Создайте программу, которая имитирует работу банка с несколькими счетами.
        Для этого можно создать класс Account, который будет иметь два поля: баланс и номер счета.

        Задача состоит в том, чтобы создать несколько потоков, каждый из которых будет
        выполнять одну из двух операций: пополнение счета или снятие денег со счета.
        Для этого можно использовать классы java.util.Random и
        java.util.concurrent.locks.ReentrantLock (можно как альтернативу использовать synchronized).

        Каждый поток должен случайным образом выбирать один из счетов и
        производить операцию пополнения или снятия.
        При снятии денег поток должен проверять, достаточно ли денег на счете,
        чтобы выполнить операцию.
        Если денег недостаточно, поток должен ожидать,
        пока на счете не появится достаточное количество денег.

        Для безопасного доступа к общим ресурсам (счетам) можно использовать
        блокировки ReentrantLock (можно как альтернативу использовать synchronized).

        Главный поток должен запустить все потоки и ждать, пока они все закончат свою работу.
        После этого он должен вывести на экран балансы всех счетов.*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            MyThread thread = new MyThread();
            thread.start();
        }
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        double randomBalance = random.nextDouble(400,20000);
        int randomNumber = random.nextInt(1,10);
        Account account = new Account(randomBalance,randomNumber);
        double randomDeposit = random.nextDouble(20,10000);
        account.replenishmentBalance(randomDeposit);
        double randomWithdrawal = random.nextDouble(20,10000);
        account.withdrawalFromAccount(randomWithdrawal);
    }
}