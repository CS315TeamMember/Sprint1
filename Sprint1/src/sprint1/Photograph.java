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
	
	//public boolean equals(Object o) {
		
	//}
	
	public String toString() {
		return "Filename: " + filename + "/n" + "Caption: " + caption;
	}
	
	public static void Main(String args[]) {
		Photograph p = new Photograph("DefaultFilename", "DefaultCaption");
		p.toString();

	}
	
}
