package example3;

public interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
}