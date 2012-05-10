
import com.epsiyaya.projetvideoejb.metier.dao.PersonnaliteDAO;
import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import org.junit.Test;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.mockito.Matchers;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.junit.Assert.assertEquals;

public class TestHibernateMapping {

    private SessionFactory sessionFactory;
    private Session session;
    private PersonnaliteDAO personnaliteDAO;

    
    @Before
    public void before() {
        sessionFactory = mock(SessionFactory.class);
        session = mock(Session.class);
        
        personnaliteDAO = mock(PersonnaliteDAO.class);
        //personnaliteDAO = new PersonnaliteDAO();
        personnaliteDAO.setSessionFactory(sessionFactory);
    }
    
    @Test
    public void test() {
        Personnalite perso = createPerso();
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        
        //when(session.save(Personnalite.class)).thenReturn(session);
        when(personnaliteDAO.saveIt(perso)).thenReturn(new Personnalite());
        

        verify(personnaliteDAO).saveIt(perso);
        
        //assertEquals(p2.getId(), perso.getId());
    }

    
    
    /*@Test
    public void testGetById() {
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        Personnalite perso = createPerso();

        when(session.get(Personnalite.class, 1)).thenReturn(perso);
        
        
        Personnalite p2 = verify(personnaliteDAO).getById(1);
        assertEquals(perso.getNom(), p2.getNom());
    }*/
    
    
    
 /*   
    @Before
    public void before() {
        personnaliteDAO = new PersonnaliteDAO();
        sessionFactory = createStrictMock(SessionFactory.class);
        session = createStrictMock(Session.class);
        personnaliteDAO.setSessionFactory(session);
    }

    @Test
    public void testGetById() {
        expect(sessionFactory.getCurrentSession()).andReturn(session).anyTimes();
        Personnalite perso = createPerso();

        expect(session.get(Personnalite.class, 1)).andReturn(perso);
        replay(sessionFactory, session);
        Personnalite p2 = personnaliteDAO.getById(1);
        assertEquals(perso.getNom(), p2.getNom());
        verify(session, sessionFactory);
    }

    @Test
    public void testSave() {
        expect(sessionFactory.getCurrentSession()).andReturn(session).anyTimes();
        Personnalite perso = createPerso();

        expect(session.save(Personnalite.class)).andReturn(1);
        //replay(sessionFactory, session);

        personnaliteDAO.saveIt(notNull());
        expectLastCall().andAnswer(new IAnswer<Object>() {
            public Object answer() throws Throwable {
                Personnalite thePersonnaliteBeingSaved = (Personnalite) getCurrentArguments()[0];
                assertEquals("nomDuPerso", thePersonnaliteBeingSaved.getNom());
                return null;
            }
        });
        
        replay(sessionFactory, session);
        
        verify(sessionFactory, session);
    }*/

    private Personnalite createPerso() {
        Personnalite pers = new Personnalite();
        pers.setId(1);
        pers.setNom("nomDuPerso");
        return pers;
    }
}
