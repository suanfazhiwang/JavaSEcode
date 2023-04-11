package book;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 14:54
 *
 * 书架
 *
 */
public class BookList {
    private static final int DEFAULT_SIZE = 10;
    private Book[] books = new Book[DEFAULT_SIZE];

    public BookList() {
        books[0] = new Book("三国演义","luoguanzhong",89,"xuaishuo");
        books[1] = new Book("西游记","吴承恩",19,"xiaoshuo");
        books[2] = new Book("红楼梦","caoxueqin",29,"xiaoshuo");
        this.usersize = 3;

    }

    private int usersize;//记录当前books数组中有多少本书？

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

    public int getUsersize() {
        return usersize;
    }

    public void setUsersize(int usersize) {
        this.usersize = usersize;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }

    public void delBook(int pos){
        books[pos] = null;

    }



}
