package sprint1;

public class Main {
	public static void main(String[] args) {
		
		
		
		// This is our first test targetting Photograph
		
		
		
		// Creating two objects of the same picture 
		Photograph newpic = new Photograph("coolfilename", "superduper cool picture caption");
		Photograph samepic = new Photograph("coolfilename", "superduper cool picture caption");
		
		
		
		// Testing to make sure our accessors from Photograph work
		System.out.println(newpic.getCaption() + " is the caption for the picture " + newpic.getFileName());	
		System.out.println(samepic.getCaption() + " is the caption for the picture " + samepic.getFileName());
		
		
		
		// Test our equals method		
		if (newpic.equals(samepic)) {
			System.out.println("Both pictures have the file name " + samepic.getFileName() + " and the caption " + samepic.getCaption() + ".");		
		}
		else {
			System.out.println("Different pictures.");	
		}
		
		
		
		// Checking the format of our toString()  method
		System.out.println(newpic.toString());
		
		
		
		
		
		// This is our Second test targeting PhotoLibrary
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
