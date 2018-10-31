import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    List<Book> listOfBooks = new ArrayList<>();


    public void add(Book book){
        listOfBooks.add(book);

    }
    public void remove(String title){
        int index = -1;
        for (int i = 0; i <listOfBooks.size(); i++) {
            if (title.equals(listOfBooks.get(i).title)) {
                index = i;
            }

        }
        if (index == -1){
            return;
        }
        listOfBooks.remove(index);
    }

}


