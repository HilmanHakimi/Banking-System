package Day8.OOP;

class Book extends LibraryItem {
    private final String author;
    private final String genre;
    private final String isbn;

    public Book(String name, String author, String genre, String isbn){
        super(name);
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }
    @Override
    public String getDetails(){
        return "Book name: "+ getName()+"\nAuthor: " +author+"\nGenre: "+genre+"\nISBN"+isbn+"\nIs Available: "+((isAvailable()?"Yes":"No"));
    }
}
