// Multi Level Inheritance


class grandbase
{
    int gb;
    grandbase(){}
    grandbase(int gbb)
    {
        this.gb = gbb;
        System.out.println ("\n Grand Base class : gb = "+ gb);
    }
}

class base extends grandbase
{
    int b;
    base(){}
    base (int gb, int bb)
    {
        super(gb);
        this.b = bb;
        System.out.println ("\n Base class : b = "+ b);
    }
}

class child extends base
{
    int c;
    child(){}
    child (int gb, int bb, int cc)
    {
        super(gb, bb);
        this.c = cc;
        System.out.println ("\n Child class : c = "+ c);
    }
}

public class MultiInherit
{
    public static void main(String[] args)
    {
        child cobj = new child(1,2,3);
    }
}
