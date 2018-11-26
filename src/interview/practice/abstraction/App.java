package interview.practice.abstraction;

public class App extends AbstractDemo {

    public static void main(String[] args) {

        AbstractDemo abstarctDemo = new App();
        abstarctDemo.run();
        abstarctDemo.show();
        // abstarctDemo.shape(); Compilation error
        App app = new App();
        app.show();
        app.run();
        app.shape();
        App application = new App(4, 5, 6);
        System.out.println(application.a);
        System.out.println(application.b);
        System.out.println(application.c);

        // AbstractDemo obj = new AbstractDemo(4, 5);

    }

    int c;

    App(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public App() {
        // TODO Auto-generated constructor stub
    }

    @Override
    void run() {
        System.out.println("Inside Run");
    }

    @Override
    void show() {
        System.out.println("Inside App show");
    }

    void shape() {
        System.out.println("Inside App Shape");
    }

}
