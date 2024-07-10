package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Method Overriding::::::::::::::::::::::::::::
        Parent p = new Child();
        p.area();

//        late biding is done when all the compilation is over and in runtime it is determined which method is to be called
//           Early binding is done in compiletime when static , final and private methods are established
    }
}
