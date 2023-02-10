package example1;

interface Feature {

    default void action() {
        System.out.println("Default action");
    }

    default void action2() {
        String answer = subAction();
        System.out.println(answer);
    }
    private String subAction() {
        return "Default Action";
    }
    // для декомпозиции каого-либо большого дефолтного метода
    // java позволяет нам декларировать приватные методы в интерфейсе
}
