package br.com.gofap.persistence;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

public interface IDao<T> {

	Class<T> getObjectClass();

	public void delete(T objeto);

	public T save(T objeto);

	public List<T> list();

	public T getById(Serializable id);

	public T getById(Serializable id, boolean lock);

	public List<T> consultaByTipo(int startIndex, Integer sizeBlock,
			int tipoConsulta, String campo, Object valor);

	public Criteria consultaByTipoCriteria(int startIndex, Integer sizeBlock,
			int tipoConsulta, String campo, Object valor);

	public List<T> consultaHQL(String consulta);

	public Criteria consultaByCriteria();

	public void cancel();

}
