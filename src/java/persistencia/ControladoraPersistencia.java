package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Client;
import logica.Employee;
import logica.Service;
import logica.User;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    UserJpaController userJPA = new UserJpaController();
    EmployeeJpaController employeeJPA = new EmployeeJpaController();
    ClientJpaController clientJPA = new ClientJpaController();
    ServiceJpaController serviceJPA = new ServiceJpaController();
    PackageJpaController packageJPA = new PackageJpaController();
    SaleJpaController saleJPA = new SaleJpaController();

////////////////////////////////////////////////////////////////////////////////
//                               U S E R                                      //
////////////////////////////////////////////////////////////////////////////////
     
////////////////////////////// Create Zone /////////////////////////////////////    
    public void createUser(User user) {
        userJPA.create(user);
    }

/////////////////////////////// Read Zone //////////////////////////////////////    
    public List<User> getAllUsers() {
        return userJPA.findUserEntities();
    }
        
    public User searchUser(int id) {
        return userJPA.findUser(id);
    }
    
////////////////////////////// Update Zone /////////////////////////////////////
    public void updateUser(User user) {
        try {
            userJPA.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }    
    
////////////////////////////// Delete Zone /////////////////////////////////////
    public void deleteUser(int id) {
        try {        
            userJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(
                    ControladoraPersistencia.class.getName()).log(
                            Level.SEVERE, null, ex);
        }
    }
    
////////////////////////////////////////////////////////////////////////////////
//                           E M P L O Y E E                                  //
////////////////////////////////////////////////////////////////////////////////
    
////////////////////////////// Create Zone /////////////////////////////////////    
    public void createEmployee(Employee employee, User user) {
        userJPA.create(user);
        employeeJPA.create(employee);
    }

/////////////////////////////// Read Zone //////////////////////////////////////    
    public List<Employee> getAllEmployees() {
        return employeeJPA.findEmployeeEntities();
    }

    public Employee searchEmployee(int id) {
        return employeeJPA.findEmployee(id);
    }
    
////////////////////////////// Update Zone /////////////////////////////////////    
    public void updateEmployee(Employee employee) {
        try {
            employeeJPA.edit(employee);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
    
////////////////////////////// Delete Zone /////////////////////////////////////    
    public void deleteEmployee(int id) {
        try {
            employeeJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

////////////////////////////////////////////////////////////////////////////////
//                             C L I E N T                                    //
////////////////////////////////////////////////////////////////////////////////
     
////////////////////////////// Create Zone /////////////////////////////////////    
    public void createClient(Client client) {
        clientJPA.create(client);
    }
  
/////////////////////////////// Read Zone //////////////////////////////////////    
    public List<Client> getAllClients() {
        return clientJPA.findClientEntities();
    }

    public Client searchClient(int id) {
        return clientJPA.findClient(id);
    }

////////////////////////////// Update Zone /////////////////////////////////////    
    public void updateClient(Client client) {
        try {
            clientJPA.edit(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

////////////////////////////// Delete Zone /////////////////////////////////////
    public void deleteClient(int id) {
        try {
            clientJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }    
    
////////////////////////////////////////////////////////////////////////////////
//                            S E R V I C E                                   //
////////////////////////////////////////////////////////////////////////////////
     
////////////////////////////// Create Zone /////////////////////////////////////
    public void createService(Service service) {
        serviceJPA.create(service);
    }   
    
/////////////////////////////// Read Zone //////////////////////////////////////
    public List<Service> getAllServices() {
        return serviceJPA.findServiceEntities();
    }
    
    public Service searchService(int service_code) {
        return serviceJPA.findService(service_code);
    } 
    
////////////////////////////// Update Zone /////////////////////////////////////
    public void updateService(Service service) {
        try {
            serviceJPA.edit(service);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
       
////////////////////////////// Delete Zone /////////////////////////////////////
public void deleteService(int service_code) {
        try {
            serviceJPA.destroy(service_code);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
    
////////////////////////////////////////////////////////////////////////////////
//                               S A L E                                      //
////////////////////////////////////////////////////////////////////////////////
     
////////////////////////////// Create Zone /////////////////////////////////////
    
    
/////////////////////////////// Read Zone //////////////////////////////////////
    
    
////////////////////////////// Update Zone /////////////////////////////////////
    
    
////////////////////////////// Delete Zone /////////////////////////////////////

        
////////////////////////////////////////////////////////////////////////////////
//                            P A C K A G E                                   //
////////////////////////////////////////////////////////////////////////////////
     
////////////////////////////// Create Zone /////////////////////////////////////
    
    
/////////////////////////////// Read Zone //////////////////////////////////////
    
    
////////////////////////////// Update Zone /////////////////////////////////////
    
    
////////////////////////////// Delete Zone /////////////////////////////////////

    
}