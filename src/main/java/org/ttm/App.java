package org.ttm;
import java.awt.Color;
import java.util.stream.Stream;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App {
    public static void print(MyCamera camera){
        Color color = camera.snap(new Color(125, 125, 125));
        System.out.println(color.toString());
    }

    public static void main( String[] args ) {
        print(new MyCamera());
        print(new MyCamera(Color::brighter));
        print(new MyCamera(Color::darker));
        print(new MyCamera(Color::darker, Color::brighter));
    }
}

class MyCamera{

    Function<Color, Color> filter;

    public MyCamera(Function<Color, Color>... filters){
        //filter = color -> color;
        filter = Stream.of(filters).reduce(Function.identity(), Function::andThen );
    }

    public Color snap(Color input){
        return filter.apply(input);
    }
}