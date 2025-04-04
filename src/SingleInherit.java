//Single level inheritence

class base
{
    int b;
    base(){}
    base (int bb)
    {
        this.b = bb; // value assignment to present class attribute
        System.out.println ("\n Base class : b = "+ b);
    }
}

class child extends base
{
    int c;
   child(){}
    child (int bb, int cc)
    {
        super(bb);   // argument passing to base class
        this.c = cc; // value assignment to present class attribute
        System.out.println ("\n Child class : c = "+ c);
    }
}

public class SingleInherit
{
    public static void main(String[] args)
    {
        child cobj = new child(1,2);
    }
}