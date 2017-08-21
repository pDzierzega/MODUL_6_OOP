package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

public class BookAndAuthorTest {

    @Test
    public void authorDefaultGetNameGetEmailGetGender(){
        Author testAuthor=new Author("Tolkien","tolkien@mordor.com",'m');

        Assert.assertEquals("Tolkien",testAuthor.getName());
        Assert.assertEquals("tolkien@mordor.com",testAuthor.getEmail());
        Assert.assertEquals(new Character('m'),testAuthor.getGender());
    }

    @Test
    public void authorDefaultSetEmail(){
        Author testAuthor=new Author("Tolkien","tolkien@mordor.com",'m');
        Assert.assertEquals("tolkien@mordor.com",testAuthor.getEmail());

        testAuthor.setEmail("LordOfTheRings@mordor.com");
        Assert.assertEquals("LordOfTheRings@mordor.com",testAuthor.getEmail());
    }

    @Test
    public void BookDefaultGetNameGetAuthorGetPrice(){
        Author tolkien=new Author("Tolkien","tolkien@mordor.com",'m');
        Author martin=new Author("G.G Martin","martin@HBO.com",'m');

        Book testObject=new Book("Lord of the Rings",12.99,tolkien,martin);
        Author[] exceptedOutput={tolkien,martin};

        Assert.assertEquals("Lord of the Rings",testObject.getName());
        Assert.assertArrayEquals(exceptedOutput,testObject.getAuthor().toArray());
        Assert.assertEquals(12.99,testObject.getPrice(),0.01);
        Assert.assertEquals(0,testObject.getQty());
    }

    @Test
    public void BookAndAuthorGetAndSetTest(){
        Author testAuthor=new Author("Jacek Bartosiak","j.bartosiak@CSW.pl",'m');
        Book testBook=new Book("Pacyfik i Eurazja.O wojnie",99.99,11,testAuthor);

        Assert.assertEquals("Jacek Bartosiak",testAuthor.getName());
        Assert.assertEquals("j.bartosiak@CSW.pl",testAuthor.getEmail());
        Assert.assertEquals(new Character('m'),testAuthor.getGender());

        testAuthor.setEmail("bartosiak@NATO.com");
        Assert.assertEquals("bartosiak@NATO.com",testAuthor.getEmail());

        Assert.assertEquals("Pacyfik i Eurazja.O wojnie",testBook.getName());
        Assert.assertEquals(testAuthor, testBook.getAuthor().get(0));
        Assert.assertEquals(99.99,testBook.getPrice(),0.01);
        Assert.assertEquals(11,testBook.getQty());

        testBook.setQty(2);
        testBook.setPrice(119.99);
        Assert.assertEquals(119.99,testBook.getPrice(),0.01);
        Assert.assertEquals(2,testBook.getQty());
    }
}
