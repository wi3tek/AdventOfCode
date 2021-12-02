package solutions.day2;

import utils.InputHandler;

import java.util.List;

public class Task2 {

    static int horizontalPosition = 0;
    static int depth = 0;
    static int aim = 0;

    public static void main(String[] args) {
        List<String> inputs = InputHandler.getInput( "day2" );

        inputs.forEach( input -> {
            String[] line = input.split( " " );
            String command = line[0];
            int value = Integer.parseInt( line[1]);

            switch(command) {
                case "forward":
                    horizontalPosition+=value;
                    depth+=(aim*value);
                    break;
                case "up": aim-=value;
                    break;
                case "down": aim+=value;
                    break;

            }

            System.out.println("horizontalPosition: " + horizontalPosition);
            System.out.println("depth: " + depth);
            System.out.println("Result: "+horizontalPosition*depth);
        } );


    }
}
