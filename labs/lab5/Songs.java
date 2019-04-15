/**
 * @author Jesse Dahl
 * A song class that models a song by song title and artist
 */


public class Songs {

    //Fields
    private String songName;
    private String artist;

    //Constructor
    /**
     * Constructs a new song instance
     * 
     * @param n the title of the song
     * @param a the artist of the song
     */
    public Songs(String n, String a) {
        songName = n;
        artist = a;
    }

    //Methods
    /**
     * @return the song name
     */
    public String getSongName() {
        return(songName);
    }

    /**
     * @return the artist name
     */
    public String getArtist() {
        return(artist);
    }

    /**
     * @return the song name along with the artist name
     * overrides Arrays.toString
     */
    public String toString() {
        return(songName + " (" + artist + ")");
    }
}