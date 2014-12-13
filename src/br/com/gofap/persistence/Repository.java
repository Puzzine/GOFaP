package br.com.gofap.persistence;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
 


public class Repository<T> implements IDao<T> {
 
    private final Class<T> entity;
    private Session session;
    public Repository(Class<T> entity ) {
        this.entity = entity;
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
 
    
    
    @Override
    public Class<T> getObjectClass() {
        return this.entity;
    }
 
    @Override
    public T save(T objeto) {
        try {
        	
            Object obj = null;
            obj = session.merge(objeto);
            return (T) obj;
        } catch (HibernateException hibernateException) {
            cancel();
            throw hibernateException;
        }
    }
 
    @Override
    public void delete(T objeto) {
        try {
        	 session.delete(objeto);
        } catch (HibernateException hibernateException) {
            cancel();
            throw hibernateException;
        }
    }

 
	@Override
    public List<T> list() {
        try {
            List<T> list = session.createCriteria(entity).list();
            return (List<T>) list;
        } catch (HibernateException hibernateException) {
            cancel();
            throw hibernateException;
        }
    }
 
    @Override
    public T getById(Integer id) {
        try {
            return (T) session.get(entity, id);
        } catch (HibernateException hibernateException) {
            cancel();
            throw hibernateException;
        }
    }
 
    @Override
    public T getById(Integer id, boolean lock) {
        try {
            if (lock) {
                return (T)session.get(entity, id, LockOptions.UPGRADE);
            } else {
                return (T) session.get(entity, id);
            }
        } catch (HibernateException hibernateException) {
            cancel();
            throw hibernateException;
        }
    }
 
 
    @Override
    public List<T> consultaByTipo(int startIndex, Integer sizeBlock, int tipoConsulta, String campo, Object valor) {
    
    	 Criteria crit = session.createCriteria(entity);
    	 if(tipoConsulta==0){
    	 	 crit.add(Restrictions.ilike(campo, "%"+valor+"%"));
    	 }if(tipoConsulta==1){
    	 	 crit.add(Restrictions.eq(campo, valor));
    	 }if(tipoConsulta==2){
    	 	 crit.add(Restrictions.ilike(campo, "%"+valor));
    	 }if(tipoConsulta==3){
    	 	 crit.add(Restrictions.ilike(campo, valor+"%"));
    	 }if(tipoConsulta==4){
    	 	 crit.add(Restrictions.lt(campo, valor));
    	 }if(tipoConsulta==5){
    	 	 crit.add(Restrictions.le(campo, valor));
    	 }if(tipoConsulta==6){
    	 	 crit.add(Restrictions.ne(campo, valor));
    	 }
    	 if(sizeBlock!=null){
    		 crit.setMaxResults(sizeBlock);
    	 }if(startIndex!=0){
    		 crit.setFirstResult(startIndex);
         	
    	 }    	 return (List<T>)crit.list();
    }
    
    
    public Criteria consultaByTipoCriteria(int startIndex, Integer sizeBlock, int tipoConsulta, String campo, Object valor) {
        
   	 Criteria crit = session.createCriteria(entity);
   	 if(tipoConsulta==0){
   	 	 crit.add(Restrictions.ilike(campo, "%"+valor+"%"));
   	 }if(tipoConsulta==1){
   	 	 crit.add(Restrictions.eq(campo, valor));
   	 }if(tipoConsulta==2){
   	 	 crit.add(Restrictions.ilike(campo, "%"+valor));
   	 }if(tipoConsulta==3){
   	 	 crit.add(Restrictions.ilike(campo, valor+"%"));
   	 }if(tipoConsulta==4){
   	 	 crit.add(Restrictions.lt(campo, valor));
   	 }if(tipoConsulta==5){
   	 	 crit.add(Restrictions.le(campo, valor));
   	 }if(tipoConsulta==6){
   	 	 crit.add(Restrictions.ne(campo, valor));
   	 }
   	 if(sizeBlock!=null){
   		 crit.setMaxResults(sizeBlock);
   	 }if(startIndex!=0){
   		 crit.setFirstResult(startIndex);
        	
   	 }    	 return crit;
   }
    
    
    
    @Override
    public List<T> consultaHQL(String consulta) {
        return (List<T>) session.createQuery(consulta).list();
    }
    
    public Criteria consultaByCriteria() {
        return session.createCriteria(entity);
    }
 
    @Override
    public void cancel(){
    	if(session.isOpen() || session.isConnected()){
        session.getTransaction().rollback();
        session.close();        
    	}
    	
    	}



}