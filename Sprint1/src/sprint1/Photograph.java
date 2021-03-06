package sprint1;

/**
 * Sprint 1
 * @author Adair Tabb
 * 
 */

/**
 * Sprint 2
 * @author Evelina
 *
 */

public class Photograph {
	/**
	 * @author Adair Tabb
	 * Stores the permanent filename of a Photograph object.
	 */
	private final String FILENAME;
	/**
	 * @author Adair Tabb
	 * Stores the permanent caption of a Photograph object.
	 */
	private final String CAPTION;
	
	
	/**
	 * @author Evelina
	 * A String containing the date the photograph was taken.
	 * 
	 */
	private String dateTaken;
	
	/**
	 * @author Evelina
	 * An int that contains the rating of the photograph on a scale from 0 to 5.
	 */
	private int rating;
	
	/**
	 * @author Adair Tabb
	 * Constructor for a Photograph object, taking a filename and caption, which are then stored in the class fields.
	 * @param filename The filename of the photograph object.
	 * @param caption  The caption of the photograph object.
	 */
	Photograph(String filename, String caption) {
		this.FILENAME = filename;
		this.CAPTION = caption;
	}
	
	
	/**
	 * @author Evelina 
	 * Constructor for a Photograph object that takes a filename, caption, date the photo was taken, and a rating of the photo and stores it in the class fields.
	 * 
	 * @param filename The filename of the photograph object.
	 * @param caption The caption of the photograph object.
	 * @param dateTaken The date the photograph object was taken.
	 * @param rating The rating on a scale from 0 to 5 of the photo object.
	 */
	public Photograph(String filename, String caption, String dateTaken, int rating) {
		this.FILENAME = filename;
		this.CAPTION = caption;
		this.dateTaken = dateTaken;
		this.rating = rating;
	}
	
	/**
	 * @author Adair Tabb
	 * Gets and returns the filename stored in the corresponding class field.
	 * @return The string currently stored in the FILENAME class field.
	 */
	public String getFileName() {
		return FILENAME;
	}
	
	/**
	 * @author Adair Tabb
	 * Gets and returns the caption stored in the corresponding class field.
	 * @return The string currently stored in the CAPTION class field.
	 */
	public String getCaption() {
		return CAPTION;
	}
	
	/**
	 * @author Evelina
	 * Gets and returns the date the photo was taken in the corresponding class field.
	 * @return The string currently stored in the dateTaken class field.
	 */
	public String getDateTaken() {
		return dateTaken;
	}
	
	/**
	 * @author Evelina
	 * Gets and returns the rating of the photo in the corresponding class field.
	 * @return The int currently stored in the rating class field.
	 */
	public int getRating() {
		return rating;
	}
	
	/**
	 * @author Evelina
	 * Mutator/setter for the field dateTaken.
	 * @param caption
	 */
	public void setCaption(String dateTaken) {
		this.dateTaken = dateTaken;
	}
	
	/**
	 * @author Evelina
	 * Mutator/setter for the field rating.
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	/**
	 * @author Adair Tabb
	 * A method that is meant to compare a different Photograph object to the current Photograph object.
	 * @param o The object to be compared to the current Photograph object.
	 * @return Returns false if the object is not a Photograph, or if the Photograph being compared to the current Photograph has a different value FILENAME and CAPTION. Returns true if the object is a Photograph and has the same value FILENAME and CAPTION.
	 * 
	 * @author Evelina
	 * Edited to fit sprint 2 requirements
	 * Added the dateTaken being compared and added as a requirement for two photos to be considered equal.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof Photograph)) {
			return false;
		}
		Photograph that = (Photograph) o;
		
		return this.FILENAME.equals(that.FILENAME) && this.CAPTION.equals(that.CAPTION) && this.dateTaken.equals(that.dateTaken);
	}
	
	/**
	 * @author Adair Tabb
	 * A method to allow a Photograph object's field information to be printed as an easily readable String when the object is called in a print() or println().
	 * @return A String containing the Photograph object's fields in an understandable format. 
	 */
	public String toString() {
		return "Filename: " + FILENAME + "\n" + "Caption: " + CAPTION;
	}
	
	/**
	 * @author Evelina
	 *  Overrides the default hasCode method in the Object class to produce a uniquw integer for a Photogrpah object.
	 */
	public int hashCode() {
		String uniqueStr = FILENAME + "---" + CAPTION + "---" + dateTaken;
		return uniqueStr.hashCode();
	}
}
