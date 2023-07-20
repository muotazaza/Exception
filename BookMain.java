package exceptions;

public class BookMain {
    public static void main(String[] args) {
        Book[] books=new Book[5];
        books[0] =new Book(1,"A Case of Identity");
        books[1] =new Book(2,"The Adventures of Sherlock Holmes");
        books[2] =new Book(3,"The Memoirs of Sherlock Holmes");
        books[3] =new Book(4,"The Return of Sherlock Holmes ");
        books[4] =new Book(5,"His Last Bow ");
        try {
            findById(books,6);
            System.out.println("found");
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }


    }

    private static Book findById(Book[] books,int id)throws BookNotFoundException {
        for (Book book:books){
            if (book.getId() ==id) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with the given id is not present");
    }
}
