package ch4.lession4_3_4.aspects;

import ch4.lession4_3_4.encoreables.Encoreable;
import ch4.lession4_3_4.encoreables.EncoreableImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "ch4.lession4_3_1.performances.Performance+", defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;

}
