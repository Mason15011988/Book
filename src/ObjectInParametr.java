class Test{
    int a,b;
    Test (int i,int j){
        a=i;
        b=j;
    }
    int f(Test t){
        int rez ;
        rez= t.a*a + t.b*b;
        return rez;
    }
}
public class ObjectInParametr {
    public static void main(String[] args) {
        Test ob1 = new Test(1,2);
        Test ob2 = new Test(3,4);
        Test ob3 = new Test(5,6);
        Test ob4 = new Test(7,8);
        System.out.println(ob1.f(ob1));
        System.out.println(ob2.f(ob1));
        System.out.println(ob1.f(ob3));


    }

}
