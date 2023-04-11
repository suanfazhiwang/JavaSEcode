package user;

import book.Book;
import book.BookList;
import opera.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 15:22
 */
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    public User(String name) {
        this.name = name;


    }
    public abstract int menu();


    public void doWork(int choice, BookList bookList){
        this.iOperations[choice].work(bookList);//拿到一个对象
    }
}
