class Area {
     void fun1(){
        System.out.println("Area1");
    }
    static void fun2(){
System.out.println("Area 2");
    }   
}
class First {
      static void fun1(){
        System.out.println("A");
    }
      static void fun2(){
        System.out.println("B");
    }
    public static void main (String[]args){
System.out.println("C");
Area a1=new Area()
First.fun2();
    }
}