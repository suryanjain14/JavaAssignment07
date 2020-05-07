interface Process{
    public void cal(int[] a);
}
public class Even {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        Process process;
        process= a -> {
            for(int x:a){
                if(x%2==0){
                    System.out.println("even "+x);
                }
            }
        };

        process.cal(array);
    }
}
