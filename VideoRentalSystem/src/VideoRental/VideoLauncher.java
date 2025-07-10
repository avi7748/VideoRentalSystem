package VideoRental;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;
        
        store.addVideo("Matrix");
        store.receiveRating("Matrix", 9);

        store.addVideo("Harry Potter");
        store.receiveRating("Harry Potter", 8);

        store.addVideo("Avengers");
        store.receiveRating("Avengers", 10);

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("------------");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video :");
            System.out.println("3.Return Video :");
            System.out.println("4.Receive Rating :");
            System.out.println("5.List Inventory :");
            System.out.println("6.Exit :");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String addName = sc.nextLine();
                    store.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String coName = sc.nextLine();
                    store.doCheckout(coName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String retName = sc.nextLine();
                    store.doReturn(retName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    store.receiveRating(rateName, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
