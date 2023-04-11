package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 15:28
 * 书籍默认存放在数组最后一本书的后面
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.nextLine();
        System.out.println("请输入作者：");
        String author = scanner.nextLine();
        System.out.println("请输入类型：");
        String type = scanner.nextLine();
        System.out.println("请输入价格”：");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsersize();
        for (int i = 0; i < currentSize; i++) {
            Book tmp = bookList.getBook(i);
            if (tmp.getName().equals(name)) {
                System.out.println("已经存在");
                return;
            }
        }

        bookList.setBooks(currentSize, book);
        bookList.setUsersize(currentSize + 1);
    }
}
