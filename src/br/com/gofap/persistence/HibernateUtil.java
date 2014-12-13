package br.com.gofap.persistence;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.com.gofap.orm.Coordenacao;
import br.com.gofap.orm.Csra;
import br.com.gofap.orm.CustoEfetivo;
import br.com.gofap.orm.CustoHora;
import br.com.gofap.orm.Fornecedor;
import br.com.gofap.orm.Gdcs;
import br.com.gofap.orm.Indicacao;
import br.com.gofap.orm.Justificativa;
import br.com.gofap.orm.LinguagemProgramacao;
import br.com.gofap.orm.Perfil;
import br.com.gofap.orm.Registro;
import br.com.gofap.orm.Representante;
import br.com.gofap.orm.Rgti;
import br.com.gofap.orm.Solicitacao;
import br.com.gofap.orm.TipoRegistro;
import br.com.gofap.orm.Usuario;
import br.com.gofap.orm.Vertical;




public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static final ServiceRegistry serviceRegistry;
    
    
    static {
        //HIBERNATE 4 NOVA CONFIGURAÇÃO DE SESSION FACTORY PARA HIBERNATE 4.3
        try {
            
        	Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml")
            	.addAnnotatedClass(Coordenacao.class)
            	.addAnnotatedClass(Csra.class)
            	.addAnnotatedClass(CustoEfetivo.class)
            	.addAnnotatedClass(CustoHora.class)
            	.addAnnotatedClass(Fornecedor.class)
            	.addAnnotatedClass(Gdcs.class)
            	.addAnnotatedClass(Indicacao.class)
            	.addAnnotatedClass(Justificativa.class)
            	.addAnnotatedClass(LinguagemProgramacao.class)
            	.addAnnotatedClass(Perfil.class)
            	.addAnnotatedClass(Registro.class)
            	.addAnnotatedClass(Representante.class)
            	.addAnnotatedClass(Rgti.class)
            	.addAnnotatedClass(Solicitacao.class)
            	.addAnnotatedClass(TipoRegistro.class)
            	.addAnnotatedClass(Usuario.class)
            	.addAnnotatedClass(Vertical.class);
             serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();  
        	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      
        }catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

