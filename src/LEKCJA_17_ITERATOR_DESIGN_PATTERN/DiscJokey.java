 package LEKCJA_17_ITERATOR_DESIGN_PATTERN;
 import java.util.ArrayList;
 import java.util.Enumeration;
import java.util.Hashtable;
 import java.util.Iterator;
public class DiscJokey {
    SongsOfThe80s songs80s;
    SongOfThe70s songs70s;
    SongsOfThe90s songs90s;
    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;
   /* OLD WAY
    public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {
        songs70s = newSongs70s;
        songs80s = newSongs80s;
        songs90s = newSongs90s;
    */
    // NEW WAY Initialize the iterators
    public DiscJokey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) 
    {
        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;
    }

   public void showTheSongs()
   {
       ArrayList al70sSongs = songs70s.getBestSongs();
       System.out.println("Songs of the 70s");
       for (int i = 0;i<al70sSongs.size();i++)
       {
           SongInfo bestSongs = (SongInfo) al70sSongs.get(i);
           System.out.println(bestSongs.getSongName());
           System.out.println(bestSongs.getBandName());
           System.out.println(bestSongs.getYearReleased());
       }
       
        SongInfo[] al80sSongs = songs80s.getBestSongs();
       System.out.println("Songs of the 80s");
       for (int i = 0;i<al80sSongs.length;i++)
       {
           SongInfo bestSongs =  al80sSongs[i];
           System.out.println(bestSongs.getSongName());
           System.out.println(bestSongs.getBandName());
           System.out.println(bestSongs.getYearReleased());
       }
       Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
       System.out.println("Songs of the 90s");
       for (Enumeration<Integer> e = ht90sSongs.keys();e.hasMoreElements();)
       {
           SongInfo bestSongs =  ht90sSongs.get(e.nextElement());
           System.out.println(bestSongs.getSongName());
           System.out.println(bestSongs.getBandName());
           System.out.println(bestSongs.getYearReleased());
       }
       
   }
   public void showSongs2()
   {
       Iterator songs70s = iter70sSongs.createIterator();
       Iterator songs80s = iter80sSongs.createIterator();
       Iterator songs90s = iter90sSongs.createIterator();
       
       System.out.println("Songs of the 70s");
       printTheSongs(songs70s);
        System.out.println("Songs of the 80s");
        printTheSongs(songs80s);
         System.out.println("Songs of the 90s");
         printTheSongs(songs90s);
               
   }
   public void printTheSongs(Iterator iterator)
   {
       while(iterator.hasNext())
       {
           SongInfo songInfo = (SongInfo)iterator.next();
           System.out.println(songInfo.getSongName());
           System.out.println(songInfo.getBandName());
           System.out.println(songInfo.getYearReleased());
       }
   }
}
