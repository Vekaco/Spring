package ch4;

import ch4.lession4_3_3.cds.CompactDisc;
import ch4.lession4_3_3.configs.TrackCounterConfig;
import ch4.lession4_3_3.counters.TrackCounter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.play(0);
        cd.play(1);
        cd.play(2);
        cd.play(3);
        cd.play(0);

        assertEquals(2, counter.getPlayCount(0));
        assertEquals(1,counter.getPlayCount(1));
        assertEquals(1,counter.getPlayCount(2));
        assertEquals(1,counter.getPlayCount(3));
    }
}
