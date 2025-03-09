package BookGestion;
import java.util.Scanner;

public class AppBook {
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nenter numbers of books u want: ");
        int bookN = sc.nextInt();sc.nextLine();

        Book[] books = new Book[bookN];

        for (int i = 0; i < bookN; i++){
            System.out.print("\n\nenter details of the "+(i + 1)+ " book:");

            System.out.print("\nenter title: ");
            String title = sc.nextLine();

            System.out.print("\nenter author: ");
            String author = sc.nextLine();

            System.out.print("\nenter price: (or press enter to skip) ");
            String priceInput = sc.nextLine();

            System.out.print("\nenter ISBN: ");
            String isbn = sc.nextLine();

            if (!priceInput.isEmpty()){
                double price = Double.parseDouble(priceInput);
                books[i] = new Book(title, author, price, isbn);
            }else{
                books[i] = new Book(title, author, isbn);
            }



        }

        //use display() to display infos:
        System.out.print("\nlist of books: ");
        for (Book book : books){
            book.Display();
            System.out.print("\n");
            System.out.print(book); //calls toString
            System.out.println("-------------------------");
        }

        System.out.print("\ntotal books created :" + Book.getBookCounter());



        sc.close();


    }





}
