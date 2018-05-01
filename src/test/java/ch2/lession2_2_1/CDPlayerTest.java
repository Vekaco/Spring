package ch2.lession2_2_1;

import static org.junit.Assert.*;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_1.configs.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)

public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShoudNotBeNull(){
        assertNotNull(cd);
    }
}
