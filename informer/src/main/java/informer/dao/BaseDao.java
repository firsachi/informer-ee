package informer.dao;

import java.util.List;

public interface BaseDao<E> {

	boolean save(E entity);
	
	List<E> getList();
}
