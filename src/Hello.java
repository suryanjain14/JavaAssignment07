interface Display{
     void show(String Msg);
}

class Show implements Display{
    public void show(String Msg){
        System.out.println("hello "+ Msg);
    }

}

public class Hello {
    public static void main(String[] args) {

        Show show=new Show();
        String msg="lambda";
        Display a;

        a=Msg-> System.out.println("hello "+Msg);
        a.show(msg);

        System.out.println("printing by implementing a  interface through a class");
        show.show(msg);
        System.out.println("printing by implementing interface through anonymous inner class");
        Display display = new Display() {

            public void show(String Msg) {
                System.out.println("hello "+Msg);
            }
        };

        display.show(msg);

    }
}
