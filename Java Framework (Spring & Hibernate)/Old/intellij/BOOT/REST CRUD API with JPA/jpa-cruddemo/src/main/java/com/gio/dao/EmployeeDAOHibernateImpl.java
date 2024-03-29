package com.gio.dao;

import com.gio.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, theId);
    }

    @Override
    public void save(Employee theEmployee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession
                .createQuery("delete from Employee where id=:employeeId")
                .setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }

}
