package SpKo_B2;

public class A6 {
    public static void main (String[] args)
    {
        int res = 0;

        //System.out.println("Start function ");

        for(int i = 1000; i > 0; i--){
            if(i%3 == 0 || i%5 == 0){
                res = res + i;
                //System.out.println(i);
            }
        }
        System.out.println(res);
    }

}
