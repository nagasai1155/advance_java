package functioninterfacewithlambdaexpres;



@FunctionalInterface

interface  Cab{
    public void bookCab(String name,int a);
//    default  void helloEnd(){
//        System.out.println("hello this is default method in inteface");
//    }
//    public static void midnEnd(){
//        System.out.println("this is static method in interface");
//    }

}
//class Ola implements  Cab{
//
//    public void bookCab(){
//        System.out.println("cab is booked here ");
//
//    }                                  //here to avoid this class creation to implement the inteface we use lambda
//}

public class Naga {
    public static void main(String args[]){

        Cab cb = (name,a)->System.out.println("this is lambda expression " +" "+ name +" "+ a);
        cb.bookCab("nagasaibalam",45);



    }
}
