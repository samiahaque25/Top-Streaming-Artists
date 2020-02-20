import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Spotify_file {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("/Users/sifatbinquadery/Desktop/Spotifydata.txt");
		Scanner scan = new Scanner(file);
		//Jan 23, 2020 (Global) Top 50
		//reading the txt file containing the top 50 chart
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		
		}
		//importing CSV file to a nested array
		int cols = 5; //number of columns in chart
		int rows = 50; //number of rows in chart
		String[][]myList = new String[rows][cols];}
		
		//nested array myList is created and the data is imported from the CSV file.
		//Then an array is created to extract the artist name and song name with the highest streams.
		//The result is printed showing the artists who appeared on the top streams.
		
		//Music artists in alphabetical order
		//linkedlist is made
		
		//A node represents an artist
	class Artist{
		private String name;
		private Artist next;
	}
	
	//TopStreamingArtists - The list contains a series of Artist names.
	
	class TopStreamingArtists{
		private Artist first;
		public void TopSTreamingArtists() {
			first=null;
		}
		public boolean isEmpty() {
			return (first==null);
		}}
	//Inserting an artist name
	
	public static void main(String [] args) {
		TopStreamingArtists artistNames = new TopStreamingArtists();
		artistNames.insert("Stage Name");
		artistNames.displayList();
	}
	//Artist - Tones and I appears as the top streaming list
	//Top 5 music artists in alphabetical order - Eminem ft. Juice world,Justin Bieber, Karol G, Roddy Ricch, Tones and I. 
		}
		
		
		
		
		
	}
