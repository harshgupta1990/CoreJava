package Overriding;

class Mother {

    public static void smile() {

       System.out.println("Mother smile");
       
    }
}

 
class Baby extends Mother {

    public static void smile() {

       System.out.println("Baby smile");
    }
}

 
public class Main {

    public static void main(String[] args) {

        Mother b = new Baby();;

        b.smile();

    }

}