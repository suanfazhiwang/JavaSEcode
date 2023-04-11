package opera;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 15:32
 */
public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        int currentSize = bookList.getUsersize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);

        }

    }
}
