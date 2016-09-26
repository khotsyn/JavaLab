package task1.task1_13;


import task1.task1_12.Book;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(int isbn) {
        super(isbn);
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
        Book other1 = (Book) this;
        Book other2 = (Book) obj;
        if (!other1.equals(other2)) {
            return false;
        }

        ProgrammerBook prBook = (ProgrammerBook) obj;
        if (level != prBook.level) {
            return false;
        }
        if (null == language) {
            return (language == prBook.language);
        } else {
            if (!language.equals(prBook.language)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = hash * 31 + level;
        hash = hash * 31 + (language == null ? 0 : language.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        String obj = "Language " + language + ", level " + level;
        return obj;
    }
}
