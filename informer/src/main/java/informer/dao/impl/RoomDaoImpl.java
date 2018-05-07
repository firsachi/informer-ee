package informer.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import informer.dao.RoomDao;
import informer.entities.Room;


/**
 * @author firsov
 *
 */
@Stateless
public class RoomDaoImpl implements RoomDao{
	
	@PersistenceContext(unitName = "informerDS")
	private EntityManager entityManager;

	@Override
	public boolean add(Room room) {
		entityManager.persist(room);
		return true;
	}

	@Override
	public List<Room> getList() {
		String query = "SELECT r FROM Room r";
		TypedQuery<Room> typedQuery =  entityManager.createQuery(query, Room.class);
		return typedQuery.getResultList();
	}

}
