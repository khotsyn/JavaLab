package Task1.Task1_12;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int editor;

    public Book(int isbn) {
        this.isbn = isbn;
    }

    public int compareTo(Book book) {
        int bookIsbn = book.isbn;
        return this.isbn - bookIsbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        if (price != other.price) {
            return false;
        }
        if (isbn != other.isbn) {
            return false;
        }
        if (null == title) {
            return (title == other.title);
        } else {
            if (!title.equals(other.title)) {
                return false;
            }
        }

        if (null == author) {
            return (author == other.author);
        } else {
            if (!author.equals(other.author)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + price;
        hash = hash * 31 + isbn;
        hash = hash * 31 + (title == null ? 0 : title.hashCode());
        hash = hash * 31 + (author == null ? 0 : author.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        String obj = "\"" + title + "\" " + author + " " + price + "$";
        return obj;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book book = null;
        book = (Book) super.clone();
        return book;
    }

}
