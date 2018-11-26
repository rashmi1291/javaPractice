package interview.practice.multithreading;

public class CustomerWaitNotifyExample {

    int amount = 10000;

    synchronized void withdraw(int amount) {

        System.out.println("Going to withdraw");
        if (this.amount < amount) {
            try {
                System.out.println("Balance is low");
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            this.amount -= amount;
            System.out.println("Withdraw completed");
            System.out.println("Balance Amount: " + this.amount);
        }
    }

    synchronized void deposit(int amount) {
        System.out.println("Making deposit");
        this.amount += amount;
        System.out.println("Deposit completed");
        System.out.println("Balance Amount: " + this.amount);
        notify();
    }

}




