package group2jee.projet2.jee.model;

import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class EmployeesSessionBean {
    
    @PersistenceContext(unitName = "jee2_JPAPU")
    private EntityManager em;
    
    public Collection<Employees> getEmployees() {
        Query q = em.createQuery("SELECT e FROM Employees e");
        return q.getResultList();
    }
    
    public Collection<Credentials> getUsers() {
        Query q = em.createQuery("SELECT c FROM Credentials c");
        return q.getResultList();
    }
    
    public void deleteEmployee(int emplId){
        Query q = em.createQuery("DELETE from Employees e WHERE e.id = " + emplId);
        q.executeUpdate();
    }
    
    public void updateEmployee(String id, String name, String firstName, String homePhone, String mobilePhone, String officePhone, String address, String postalCode, String city, String email){
        Query q = em.createQuery("UPDATE Employees e SET e.name = '" + name + "', e.firstname = '" + firstName + "', e.telhome = '" + homePhone + "', e.telmob = '" + mobilePhone + "', e.telpro = '" + officePhone + "', e.adress = '" + address + "', e.postalcode = '" + postalCode + "', e.city = '" + city + "', e.email = '" + email + "' WHERE e.id =" + id);
        q.executeUpdate();
    }
    
    public void persist(Object object) {
        em.persist(object);
    }
    
}
