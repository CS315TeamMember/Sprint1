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
	

	public static void main(String args[]) {
		Photograph p = new Photograph("DefaultFilename", "DefaultCaption");
		Photograph f = new Photograph("DefaultFilename", "DefaultCaption");
		Photograph e = new Photograph("DifferentFilename", "DifferentCaption");
		System.out.println(p);
		System.out.println(f);
		System.out.println(e);
		
		System.out.println(p.equals(f));
		System.out.println(p.equals(e));
	}
	
}
