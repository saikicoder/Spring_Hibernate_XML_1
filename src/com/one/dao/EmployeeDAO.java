package com.one.dao;

import com.one.model.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
 HibernateTemplate template;

 public HibernateTemplate getHibernateTemplate() {
  return template;
 }

 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
  this.template = hibernateTemplate;
 }

 @Transactional
 public void insertEmp(Employee e){
  template.save(e);
 }

 @Transactional
 public void updateEmp(Employee e){
  template.update(e);
 }

 @Transactional
 public void deleteEmp(Employee e){
  template.delete(e);
 }

 public Employee displayempbyid(int id){
  //get or load
  Employee emp = template.get(Employee.class,id);
  return emp;
 }

 public List<Employee> displayall() {

  List<Employee> list = new ArrayList<Employee>();
  list = (List<Employee>) template. loadAll(Employee.class);
  return list;

 }

}
