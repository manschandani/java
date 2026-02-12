 class book{
    String title;
    String author;
    String isbn;

    public book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
}

 class library{
    book[] books= new book[10];
    int count= 0;
    
    public void addbooks(book book){
        books[count]= book;
        count++;
        System.out.println("book added: "+ book.title);
        
    }
    public void searchbytitle(String title){
        System.out.println("searching for book with title: "+ title);
        for(int i=0;i<count;i++){
        if(books[i].title.equals(title)){
            System.out.println("book found: "+ books[i].title);
            return;
    }
} 
            System.out.println("book not found");
        
        
}
   public void displayallbooks(){ 
    System.out.println("displaying all books in library:");
    for(int i=0;i<count;i++){
        System.out.println("book "+ (i+1)+ ": "+ books[i].title);
    }
   }
}

public class case1{
    public static void main(String[] args){
        book book1 = new book("The Boy in the Striped Pyjamas", "John Boyne", "978-0-14-139550-2");
        book book2 = new book("The Da Vinci Code", "Dan Brown", "978-0-385-50420-8");
        book book3 = new book("Mein Kampf", "Adolf Hitler", "978-0-452-28423-4");
        library library1 = new library();
        library1.addbooks(book1);
        library1.addbooks(book2);
        library1.addbooks(book3);
        library1.searchbytitle("The Da Vinci Code");
        
        library1.displayallbooks();
    }
}