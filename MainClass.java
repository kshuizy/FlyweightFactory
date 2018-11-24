public class MainClass {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Circle circle1 = flyweightFactory.getCircle("粉色");
        Circle circle2 = flyweightFactory.getCircle("蓝色");
        Circle circle3 = flyweightFactory.getCircle("红色");
        Circle circle4 = flyweightFactory.getCircle("粉色");

        circle1.draw();
        circle2.draw();
        circle3.draw();
        circle4.draw();

        if(circle1 == circle4)
        {
            System.out.println("true");
        }


    }

}
