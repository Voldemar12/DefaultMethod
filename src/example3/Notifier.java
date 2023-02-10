package example3;

public interface Notifier {
    default void greeting() {
        System.out.println("Notifier is ready");
    }
}
