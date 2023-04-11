package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22260
 * Date: 2023-04-03
 * Time: 15:31
 *
 * 1. 确实是否有你删除的数字
 * 2.
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要删除的图书的名字");
        int currentSize = bookList.getUsersize();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index = -1;

        for (int i = 0; i < currentSize; i++) {
            Book tmp = bookList.getBook(i);
            if (tmp.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("输入有误");
        }else {
            for (int j = index; j < currentSize-1; j++) {
                Book book = bookList.getBook(j+1);
                bookList.setBooks(j,book);
            }
            bookList.setUsersize(currentSize - 1);
            //因为删除的是对象  所以把最后一个置为null
            bookList.setBooks(currentSize-1,null);
            System.out.println("删除成功");
        }






    }
}
