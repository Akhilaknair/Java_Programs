interface Sayable
{
    String say();
}
public class Lambda
{
    public static void main(String[] args) {
        Sayable s=()->{return "hELLO";};
        System.out.println(s.say());
    }
}