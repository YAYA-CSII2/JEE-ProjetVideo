/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import org.hibernate.Session;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestHibernateMapping {

    Session session;

    @Before
    public void testGetSessionFactory() {
        
        session = HibernateUtil.getInstance().getSession();
    }

    
    /*
      
     @Test
public void itShouldHaveIngredients()
{
List<Ingredient> ingredients = new LinkedList<Ingredient>();

Ingredient ingredient_one = mock(Ingredient.class);
Ingredient ingredient_two = mock(Ingredient.class);
when(ingredient_one.getName()).thenReturn("Salt");
when(ingredient_two.getName()).thenReturn("Pepper");

ingredients.add(ingredient_one);
ingredients.add(ingredient_two);

Recipe recipe = recipeDAO.find(1);
recipe.setIngredients(ingredients);
assertEquals(2, recipe.getIngredients().size());
assertEquals("Salt",recipe.getIngredients().get(0).getName());
assertEquals("Pepper",recipe.getIngredients().get(1).getName());
}
     * */
    
    @Test
    public void testPersonnalite() {
        Personnalite perso = createPerso();
        session.save(perso);
        Personnalite persoTest = (Personnalite) session.get(Personnalite.class, perso.getId());
        assertEquals(perso.getId(), persoTest.getId());
    }

    @Test
    public void testPersonnaliteCorrecte() {
        Personnalite perso = createPerso();
        Personnalite persoTest = (Personnalite) session.get(Personnalite.class, perso.getId());
        assertEquals(perso.getNom(), persoTest.getNom());
    }
        
    @Test
    public void testGet() {
        Personnalite perso = (Personnalite) session.get(Personnalite.class, "InvalidKey");
        assertNull(perso);
    }

    @Test
    public void testRemovePerso() {
        Personnalite perso = createPerso();
        session.delete(perso);
        assertNull(perso);
    }

    private Personnalite createPerso() {
        return new Personnalite("nomPersonnalite", "prenomPersonnalite", new DateTime(), "Description du mec");
    }
}
