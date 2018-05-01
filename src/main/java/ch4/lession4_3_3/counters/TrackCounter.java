package ch4.lession4_3_3.counters;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;

@Aspect
public class TrackCounter {
    private HashMap<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* ch4.lession4_3_3.cds.CompactDisc.play(int))" +
    "&& args(trackNumber)")
    public void  trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
