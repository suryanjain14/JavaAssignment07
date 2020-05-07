interface  Cal{
    public void cal(int a);
}
public class Double {

    public static void main(String[] args) {
        Cal c;
        int no=12;
        c= a->{
            System.out.println(no*2);
        };

        c.cal(no);
    }

}
