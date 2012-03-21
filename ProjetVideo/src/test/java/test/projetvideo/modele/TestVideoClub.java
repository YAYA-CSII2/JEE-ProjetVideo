package test.projetvideo.modele;

import com.projetvideo.modele.VideoClub;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class TestVideoClub {
    
    VideoClub vc;
            
    @Before
    public void setUp() {
        vc = new VideoClub();
    }
    
    @Test
    public void instanceExiste() {
        assertNotNull(vc);
    }
}
