package ch4.lession4_3_3.configs;

import ch4.lession4_3_3.cds.BlankDisc;
import ch4.lession4_3_3.cds.CompactDisc;
import ch4.lession4_3_3.counters.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPepper(){
        BlankDisc blankDisc = new BlankDisc();

        blankDisc.setTitle("Blank Disc Title");
        blankDisc.setArtist("Unknown Artist");

        List<String> tracks = new ArrayList<String>();
        tracks.add("Track 1");
        tracks.add("Track 2");
        tracks.add("Track 3");
        tracks.add("Track 4");

        blankDisc.setTracks(tracks);

        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
