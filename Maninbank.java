class Bank
{
    int bal,yr;
    double rate;
    Bank(int b,int y,double r)
    {
        bal = b;
        yr = y;
        rate = r;
    }
}
class SBI extends Bank
{
    SBI(int b, int y,double r)
    {
        super(b,y,r);
    }
    void getMethod()
    {
        System.out.println(" Balance in SBI:"+bal);
    }
    void getAmount()
    {
        System .out.println(" Total Amount in SBI:"+(bal*yr*rate));
    }
}
class ICICI extends Bank
{
    ICICI(int b,int y,double r)
    {
        super(b,y,r);
    }
    void getMethod()
    {
        System.out.println(" Balance in ICICI:"+bal);
    }
    void getAmount()
    {
        System .out.println(" Total Amount in ICICI:"+(bal*yr*rate));
    }
}
class Maninbank
{
    public static void main(String args[])
    {
        SBI s = new SBI(10000,3,0.5);
        ICICI i = new ICICI(8000,5,0.45);
        s.getMethod();
        s.getAmount();
        i.getMethod();
        i.getAmount();
    }
}