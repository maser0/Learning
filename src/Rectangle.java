public class Rectangle {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

//public int circuit (int a,int b) {
//        return a*b;
//}
public int circuit (Rectangle test) {
    return test.getLength()*test.getWidth();
}

public int area (Rectangle test) {
        return 2* test.getWidth()+2* test.getLength();
    }


}
