
package LEKCJA_17_ITERATOR_DESIGN_PATTERN;
import java.util.ArrayList;
import java.util.Iterator;
public class SongOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;
    public SongOfThe70s()
    {
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine","John Lenon",1971);
        addSong("American Pie","Don McLean",1971);
        addSong("I will survive","Gloaria Gaynor",1979);
        
    }
    public void addSong(String songName,String bandName, int yearReleased)
    {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }
  
    public ArrayList<SongInfo> getBestSongs()
    {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
      
        
        return bestSongs.iterator();
    }
}
