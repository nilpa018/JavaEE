package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateContextListener implements ServletContextListener {
    private static SessionFactory sessionFactory;

    public void contextInitialized(ServletContextEvent event) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        event.getServletContext().setAttribute("SessionFactory", sessionFactory);
    }

    public void contextDestroyed(ServletContextEvent event) {
        sessionFactory.close();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
