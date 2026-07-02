class Rakshit {
    int x;
     private int y;
     static void fun1(){
        
System.out.println("fun1");
    }
    
    void fun2 (){
System.out.println("fun2");
    }
}

class Object1 {
    public static void main (String[]args){
Rakshit r1 = new Rakshit();
Rakshit.fun1();
Rakshit.fun2();



    }
}