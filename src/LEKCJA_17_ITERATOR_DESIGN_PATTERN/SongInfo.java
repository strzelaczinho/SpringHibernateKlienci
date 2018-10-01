package LEKCJA_17_ITERATOR_DESIGN_PATTERN;
public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;
    
    public SongInfo(String newSongName,String newBandName,int newYearReleased)
    {
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;
        
    }
    public String getSongName(){return songName;}
    public String getBandName() { return bandName;}
    public int getYearReleased(){return yearReleased;}
    
    
}
