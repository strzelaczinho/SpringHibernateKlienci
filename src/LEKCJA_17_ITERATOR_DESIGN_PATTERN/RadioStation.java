package LEKCJA_17_ITERATOR_DESIGN_PATTERN;
public class RadioStation {
    public static void main(String[]args)
    {
        SongOfThe70s songs70s = new SongOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        DiscJokey madMike = new DiscJokey(songs70s, songs80s, songs90s);
        madMike.showSongs2();
    }
}
