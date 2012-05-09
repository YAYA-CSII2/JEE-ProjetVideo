
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TestHibernate {

    @Test
    public void testGetSessionFactory() {
        assertNotNull(HibernateUtil.getSessionFactory());
    }
}
