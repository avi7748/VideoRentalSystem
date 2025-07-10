package VideoRental;

import java.util.ArrayList;

public class VideoStore {
	private ArrayList<Video> store = new ArrayList<>();
	
	public void addVideo(String name) {
		store.add(new Video(name));
		System.out.println("Video Added Successfully : " + name);
	}
	
	public  void doCheckout(String name) {
		for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video " + name + " checked successfully.");
                return;
            }
        }
		System.out.println("Video not found!");
	}
	public void doReturn (String name) {
		for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video " + name + " returned successfully.");
                return;
            }
        }
		System.out.println("Video not found!");
		
	}
	public void receiveRating(String name,int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating " + rating + " has been recorded to the Video " + name + "");
                return;
            }
        }
        System.out.println("Video not found!");
	}
	public void listInventory() {
		System.out.println("--------------------------------------------------\n");
        for (Video v : store) {
            System.out.println("Video Name: " + v.getName() +"\nCheckout Status: "+ v.getCheckout() +"\nRating: "+ v.getRating() );
        } 
        System.out.println("--------------------------------------------------");
    }
}
