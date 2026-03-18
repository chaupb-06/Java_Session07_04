package baitap;

public class bt04 {
    public static class Book {
        public String title;
        public String author;
        public double price;
        public void printInfo() {
            System.out.println("Book infomation:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.title = "Sách khoa học";
        bk.author = "Tác giả";
        bk.price = 10.5;
        bk.printInfo();
    }
}
