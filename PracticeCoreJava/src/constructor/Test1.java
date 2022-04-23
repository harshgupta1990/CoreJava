package constructor;

class B1{

}

public class Test1 extends B1{

Test1(){

System.out.println("test");

}

Test1(String name){

System.out.println("test constructor");

}

public static void main(String[] args) {

Test1 t=new Test1("a");

}

}