//OUK library mamagement System
import java.util.ArrayList;
import java.util.List;

//1. Book class
class Book {
    private String title;
    private String author;
    private int publicationYear;
    public Book(String title,String author,int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
}
//2. Members class
class Member{
    private String name;
    private String AdmNo;
    public Member(String name,String AdmNo){
        this.name = name;
        this.AdmNo = AdmNo;
    }
    public String getName(){
        return name;
    }
    public String getAdmNo(){
        return AdmNo;
    }

}
//3. borrowing Transaction class
class BorrowingTransaction{
    private Member member;
    private Book book;
    private String borrowDate;
    private String returnDate;
    public BorrowingTransaction(Member member,Book book,String borrowDate,String returnDate){
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    public Member getMember(){
        return member;
    }
    public Book getBook(){
        return book;
    }
    public String getBorrowDate(){
        return borrowDate;
    }
    public String getReturnDate(){
        return returnDate;
    }
}
//4. Library class encapsulates the Library management system
class Library {
    public List<Book> books;
    public List<Member> members;
    public List<BorrowingTransaction> transactions;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
    }

}


//Main class to run the Library management system
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();
        // Adding books to the library
        library.books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.books.add(new Book("1984", "George Orwell", 1949));

        // Adding members to the library
        library.members.add(new Member("Jackie Kingori", "ST01/50297/2024"));
        library.members.add(new Member("Tracy Nganga", "ST02/12345/2024"));
        library.members.add(new Member("Israel Omondi", "ST01/67890/2024"));
        // Creating borrowing transactions
        library.transactions.add(new BorrowingTransaction(library.members.get(0), library.books.get(0), "2024-06-01", "2024-06-15"));
        library.transactions.add(new BorrowingTransaction(library.members.get(1), library.books.get(1), "2024-06-02", "2024-06-16"));
        library.transactions.add(new BorrowingTransaction(library.members.get(2), library.books.get(2), "2024-06-03", "2024-06-17"));
        // Displaying borrowing transactions
        for (BorrowingTransaction transaction : library.transactions) {
            System.out.println("Member: " + transaction.getMember().getName());
            System.out.println("Book: " + transaction.getBook().getTitle());
            System.out.println("Borrow Date: " + transaction.getBorrowDate());
            System.out.println("Return Date: " + transaction.getReturnDate());
            System.out.println();
        }
    }
}