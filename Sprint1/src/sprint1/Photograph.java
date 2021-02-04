package sprint1;

public class Photograph {
	private final String filename;
	private final String caption;
	
	Photograph(String filename, String caption) {
		this.filename = filename;
		this.caption = caption;
	}
	
	public String getFileName() {
		return filename;
	}
	
	public String getCaption() {
		return caption;
	}
	
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
