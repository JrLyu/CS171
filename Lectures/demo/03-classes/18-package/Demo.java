

import p1.C1;      // C1 is in folder p1 !!

public class Demo
{
    void aMethod()
    {
        C1 o = new C1();
        
        o.x1 = 1;   // public  scope
        o.x2 = 99;  // package scope -- error
        
        o.m1();     // public  scope
        o.m2();     // package scope -- error
    }
}
  
