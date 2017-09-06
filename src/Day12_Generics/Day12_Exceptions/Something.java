package Day12_Generics.Day12_Exceptions;

public class Something {
    public int i;

    public void doException() throws Exception{
        for (int j = 0; j <3 ; j++) {
            this.i++;
            if (i==7) throw new Exception("Dupa");
        }
    }
}
