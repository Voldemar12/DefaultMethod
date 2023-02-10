package example3;

public class ConsoleWriter implements Printer, Notifier {

        @Override
        public void greeting () {
            Printer.super.greeting();
        }
    }
