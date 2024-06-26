package Collections_18;

public class enumexample {
    enum TrafficLight {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        // Using an enum
        TrafficLight light = TrafficLight.RED;

        // Switch statement with enum
        switch (light) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Caution!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }

        // Using enum methods
        System.out.println("All traffic lights:");
        for (TrafficLight l : TrafficLight.values()) {
            System.out.println(l.name() + " at position " + l.ordinal());
        }
    }
}