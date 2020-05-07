interface show{
    void Show();
}
public class HelloWorld {

    public static void main(String[] args) {
        show Show;
        Show = ()->{
            System.out.println("Hello World");
        };

        Show.Show();
    }
}
