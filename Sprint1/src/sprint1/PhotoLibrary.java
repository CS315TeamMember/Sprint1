package sprint1;

public class PhotoLibrary {
	
	public boolean equals(Object o) {
		if (!(o instanceof Photograph)) {
			return false;
		}
		Photograph that = (Photograph) o;
		
		return this.filename.equals(that.filename) && this.caption.equals(that.caption);
	}
	
	
	public String toString() {
		return "Filename: " + filename + "\n" + "Caption: " + caption;
	}

}
