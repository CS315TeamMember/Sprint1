package sprint1;
import java.util.*;

public class PhotoLibrary{
	
	private String name;
	private final int id;
	private ArrayList<Photograph> photos;
	
	//Constructor
	public PhotoLibrary(String name, int id) {
		this.name = name;
		this.id = id;
		List<Photograph> photos = new ArrayList<Photograph>();
	}
	
	// Accessors (AKA getters)
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public ArrayList<Photograph> getPhotos(){
		return photos;
	}
	
	//Mutators (AKA setters)
	public void setName(String name) {
		this.name = name;
	}
	
	//Other Methods
	//Adds the Photograph p to the current object's
	//photos feed iff p is not already in the list
	public boolean addPhoto(Photograph p) {
		if (!photos.contains(p)) {
			photos.add(p);
			return true;
		}
		else {
			return false;
		}
	}
	
	//Checks to see if p is in the list of photos
	public boolean hasPhoto(Photograph p) {
		if (photos.contains(p)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Erases a photo from the feed
	public boolean erasePhoto(Photograph p) {
		if (!photos.contains(p)) {
			return false;
		}
		else {
			photos.remove(p);
			return true;
		}
	}
	
	public int numPhotographs() {
		int numPhotos = photos.size();
		return numPhotos;
	}
	
	
	public boolean equals(Object o) {
		
	}
	
	public String toString() {
		
	}

	
	public static ArrayList<Photograph> commonPhotos(PhotoLibrary a, PhotoLibrary b){
		ArrayList<Photograph>aPhotos = a.getPhotos();
		ArrayList<Photograph>bPhotos = b.getPhotos();
		
		ArrayList<Photograph>result = new ArrayList<Photograph>();
		
		// Using for each loops to loop through every photo in the ArrayLists aPhotos and bPhotos
		// Structure for these loops are "for (type variableName : arrayName)"
		for (Photograph photoA : aPhotos) {
			for (Photograph photoB : bPhotos) {
				if (photoA.equals(photoB)) {
					result.add(photoA);
				}
			}
		}
		return result;
	}
	
	public static double similarity(PhotoLibrary a, PhotoLibrary b) {
		ArrayList<Photograph>result = PhotoLibrary.commonPhotos(a, b);
		if (result.size() == 0) {
			return 0.0;
		}
		else {
			// Something goes here but I have no idea what
		}
		return 0; //doing this for now but I'm not done
	}
	
	

	
}
