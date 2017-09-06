package Day12_Generics;

public class Main {
    public static void main(String[] args) {
        Socks socks=new Socks("40degree","black socks","46");
        Shoes shoes=new Shoes("Nike","pink shoes","47");
        T_Shirt tShirt=new T_Shirt("Wtrrr","blue tShirt","Xl");

        Suitcase<T_Shirt> suitcase =new Suitcase();

        suitcase.setThing(tShirt);
        System.out.println(suitcase.getThing());
        suitcase.setThing(tShirt);
        System.out.println(suitcase.getThing());

//        DLACZEGO INTELLIJ MI TEGO NIE PODKRESLA?
//        Suitcase<Override> suitcase2;
//        suitcase2=new Suitcase<>();



    }
}
