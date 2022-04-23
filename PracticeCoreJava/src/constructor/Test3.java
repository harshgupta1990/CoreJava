package constructor;

class B2{

B2(String name){

System.out.println("name");

}

}

public class Test2 extends B2{

Test2(){

System.out.println("Test2");

}

Test2(String name){

System.out.println("Test2 constructor");

}

public static void main(String[] args) {

Test2 t=new Test2("a");

}

}
