public class Book extends ReferenceMaterial {
    private String author;
    private String ISBN;
    private int numberOfPages;

    public Book(int itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
                String author, String ISBN, int numberOfPages) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book" +
                "itemReference=" + getItemReference() +
                ", title='" + getTitle() + '\'' +
                ", suitableForChildren=" + isSuitableForChildren() +
                ", replacementValue=" + getReplacementValue() +
                ", location='" + getLocation() + '\'' +
                ", available=" + isAvailable() +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfPages=" + numberOfPages;
    }
}
