package maluevArtem;

public class Main {

    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        Thread operator1 = new Thread(null, callCenter::operator, "Оператор1");
        Thread operator2 = new Thread(null, callCenter::operator, "Оператор2");
        Thread operator3 = new Thread(null, callCenter::operator, "Оператор3");

        operator1.start();
        operator2.start();
        operator3.start();

        new Thread(null, callCenter::phoneCall, "АТС").start();
    }
}
