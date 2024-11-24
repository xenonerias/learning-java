package Java102;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("One Piece", "B123", "Eiichiro Oda", 21450);
        DVD dvd1 = new DVD("One Piece Film: Red", "D456", 115);
        Book book2 = new Book("Moby Dick", "B124", "Herman Melville", 635);

        LibraryItem[] items = {book1, dvd1, book2};

        book1.checkOut();
        dvd1.checkOut();

        System.out.println(book1.title + " available: " + book1.available());
        System.out.println(dvd1.title + " available: " + dvd1.available());

        returnAll(items);

        System.out.println(book1.title + " available: " + book1.available());
        System.out.println(dvd1.title + " available: " + dvd1.available());

          ArrayList<LibraryItem> availableItems = availableItems(items);

          System.out.println("Available items:");
          for (LibraryItem item : availableItems) {
              System.out.println(item);
          }
      }
  
        
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableList = new ArrayList<>();

        for (LibraryItem item : items) {
            if (item.available()) {
                availableList.add(item);
            }
        }

        return availableList;
    }
}

