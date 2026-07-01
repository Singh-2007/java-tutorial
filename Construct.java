class Demo{
    int x ,y;
    Demo(){
         x = 20;
         y = 40;
        
    }
    
    void f1(){ 
       x=220;
       y=220;
    }
    }
   

class Construct{
    public static void main(String[]args){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d2.x);
        System.out.println(d2.y);
        System.out.println(d3.x);
        System.out.println(d3.y);
       
    }
}