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
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.run();
        myThread2.run();
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I'm Thread! My name is " + getName());
            Random random = new Random();
            Account account1 = new Account(400d,1);
            Account account2 = new Account(1000d,2);
            Account[] accounts = {account1,account2};
            int randomNumber = random.nextInt(0,2);
            double randomSum = random.nextDouble(20,1000);
            double randomSum2 = random.nextDouble(20,1000);
            Account.replenishmentBalance(accounts[randomNumber],randomSum);
            Account.withdrawalFromAccount(accounts[randomNumber],randomSum2);
            System.out.println("\n_______________________________________________\n");
        }
    }
}