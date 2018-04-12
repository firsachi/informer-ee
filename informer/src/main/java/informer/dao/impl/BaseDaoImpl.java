/**
 * 
 */
package informer.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author firsov
 *
 */
public abstract class BaseDaoImpl<E> {
	
	@PersistenceContext(unitName = "informerDS")
	protected EntityManager entityManager;
	

}
