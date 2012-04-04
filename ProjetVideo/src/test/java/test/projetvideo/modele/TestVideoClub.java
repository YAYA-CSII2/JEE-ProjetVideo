package test.projetvideo.modele;

import com.projetvideo.modele.VideoClub;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Before;
import org.junit.Test;

public class TestVideoClub {
    
    VideoClub vc;
            
    @Before
    public void setUp() {
        vc = VideoClub.getInstance();
    }
    
    @Test
    public void instanceExiste() {
        assertNotNull(vc);
    }
    
    @Test
    public void testSingletonInstanceUnique() {
        VideoClub vc2 = VideoClub.getInstance();
        
        assertEquals(vc, vc2);
    }
}
