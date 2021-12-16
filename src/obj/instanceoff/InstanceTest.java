package obj.instanceoff;

public class InstanceTest
{
    public static void main(String[] args)
    {
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        speak(a);
        speak(b);
        speak(c);
        speak(d);
    }
    // instanceof 关键字是用于比较类与类是否相同，相同返回true，不同返回false
//当你不清楚你需要的参数是什么类型的，可以用Object来代替，Object可以代替任何类
    static void speak(Object obj)
    {
        if(obj instanceof A)//意思是：如果参数是 A 类，那么就执行一下语句
        {
            A aobj=(A)obj;//这里是向下转换，需要强制转换
            aobj.axx();
        }
        else if(obj instanceof B)
        {
            B bobj=(B)obj;
            bobj.bxx();
        }
        else if(obj instanceof C)
        {
            C cobj=(C)obj;
            cobj.cxx();
        }else if(obj instanceof D){
            D dobj=(D)obj;
            dobj.dxx();
        }
    }
}
//这里举了四个类，他们的函数都不同，但都是 Object 类的子类
class A
{
    void axx()
    {
        System.out.println("Good morning!");
        System.out.println("This is A");
    }
}

class B
{
    void bxx()
    {
        System.out.println("Holle!");
        System.out.println("This is B");
    }
}

class C
{
    void cxx()
    {
        System.out.println("Look!");
        System.out.println("This is C");
    }
}

class D
{
    void dxx()
    {
        System.out.println("Oh!Bad!");
        System.out.println("This is D");
    }
}