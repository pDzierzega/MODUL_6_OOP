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
        Author testAuthor=new Author("Tolkien","tolkien@mordor.com",'m');
        Book testObject=new Book("Lord of the Rings",testAuthor,12.99);

        Assert.assertEquals("Lord of the Rings",testObject.getName());
        Assert.assertEquals(testAuthor,testObject.getAuthor());
        Assert.assertEquals(12.99,testObject.getPrice(),0.01);
        Assert.assertEquals(0,testObject.getQty());
    }
}
