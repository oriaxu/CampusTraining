/**
 * Created by jingyixu on 7/4/17.
 */
//page153_3
//page192
public class Book {
    String bookName = "Book";
    int pageCount = 123;
    double price = 44.3;

    public Book(){
        bookName = "Book";
        pageCount = 123;
        price = 44.3;
    }

    public Book(String bookName, int pageCount, double price){
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getBookName(){
        return bookName;
    }

    public int getPageCount(){
        return pageCount;
    }

    public double getPrice(){
        return price;
    }


    public static void main(String[] args){
        //page_152
        Book book = new Book();
        Book book1 = book;
        Book book2 = book;
        book1.bookName = "book1";
        book2.price = 22.2;
        System.out.println(book.bookName);
        System.out.println(book.pageCount);
        System.out.println(book.price);

        //page_192
        Book example = new Book();
        example.setBookName("Harry Potter");
        example.setPageCount(551);
        example.setPrice(168.2);
        System.out.println("The book name is "+ example.getBookName());
        System.out.println("The pages are "+example.getPageCount());
        System.out.println("The price is "+example.getPrice());
    }
}
