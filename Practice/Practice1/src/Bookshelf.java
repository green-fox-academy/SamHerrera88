import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bookshelf {

        List<Book> books = new ArrayList<>();

        public void add(Book book){
            books.add(book);
        }
        public void remove(String title){
            Book bookToRemove = null;
            for (Book book:books) {
                if(title.equals(book.title)){
                    bookToRemove = book;
                }
            }
            books.remove(bookToRemove);
        }
        public void favoriteTitle(){
            HashMap<String, Integer> map = new HashMap<>();
            for (Book book:books) {
                if (!map.containsKey(book.author))
                    map.put(book.author, 1);
                else {
                    int count = map.get(book.author);
                    map.put(book.author, count + 1);
                }



            }
        }
        public void earliest(){
            for (Book earlyTitle:books) {
                int smallest = num[0];
                smallest = num[i];
                if( )
            }


        }
        public void latest(){

        }
}


