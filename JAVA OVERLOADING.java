class overload1{
    void display(int a){
        System.out.println("a = "+a);
    }
    void display(int a,int b){
        System.out.println("a is "+a+"   "+"b is "+b);
        
    }
    double display(double x){
        System.out.println("x is "+x);
        return x*x;
        
    }
}
public class Main{
    public static void main(String[] args){
        overload1 obj = new overload1();
        obj.display(4);
        obj.display(8,5);
        double result;
        
       result =  obj.display(4.5);
        System.out.println("the result is : "+result);
        
    }
}
