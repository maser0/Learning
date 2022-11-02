public class MyNumber {




    static int number;

    public static void setNumber(int number) {
        MyNumber.number = number;
    }
    public MyNumber(int number) {
        this.number = number;
    }
    public static int getNumber() {
        return number;
    }

    public boolean isOdd () {
        if (MyNumber.getNumber() %2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven () {
        if (MyNumber.getNumber() %2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double sqrt () {
        return (Math.sqrt(MyNumber.getNumber()));

    }

    public double pow( int x) {
        return (Math.pow(MyNumber.getNumber(), x));
    }

    public int add(int x) {
        int y = MyNumber.getNumber() + x;
        MyNumber.setNumber(y);
        return MyNumber.getNumber();
    }

    public int subtract(int x) {
        int y = MyNumber.getNumber() - x;
        MyNumber.setNumber(y);
        return MyNumber.getNumber();
    }



}
