package Day12_Generics.Day12_Exceptions;

public class Main {
    public static void main(String[] args) {
        Something something=new Something();
        System.out.println(something.i);

        try {something.doException();
        } catch (Exception e){e.printStackTrace();}
        System.out.println(something.i);

        try {something.doException();
        } catch (Exception e){e.printStackTrace();}
        System.out.println(something.i);

        try {something.doException();
        } catch (Exception e){e.printStackTrace();}
        System.out.println(something.i);

        try {something.doException();
        } catch (Exception e){e.printStackTrace();}
        System.out.println(something.i);
    }
}
