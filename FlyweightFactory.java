import java.util.HashMap;
import java.util.Map;

//ÏíÔªÄ£Ê½
public class FlyweightFactory {

    Map<String,Circle> pool;
    Circle c;

    public FlyweightFactory() {
        this.pool = new HashMap<String,Circle>();
    }

    public Circle getCircle(String color) {

        c = pool.get(color);
        if(c == null)
        {
            c = new Circle(color);
            pool.put(color,c);
        }
        return c;

    }


}
