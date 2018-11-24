public class Circle extends Shape {

    String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("绘制圆形，颜色为："+color);
    }
}
