package com.sonu.collections.service;

import java.util.Date;
import java.util.List;

import com.sonu.collections.dao.BookDao;
import com.sonu.collections.dao.EmployeeDao;
import com.sonu.collections.model.Employee;
import com.sonu.collections.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonu.collections.dao.PersonDao;
import com.sonu.collections.model.Book;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private EmployeeDao empDao;


    public List<Person> giveFewcolumns(String lastName) {
        return personDao.giveFewcolumns(lastName);
    }


    public Iterable<Employee> saveAllEmployees(Iterable<Employee> empList) {
        return empDao.saveAll(empList);
    }

    public Iterable<Employee> retrieveAllEmployees() {
        return empDao.findAll();
    }

    public List<Object[]> getMaxSalaryByDept(List<String> deptNames) {
        return empDao.getMaxSalaryByDept(deptNames);
    }

    public List<Object[]> getDeptAndSalWhoseSalIsGreaterThanProvided(Integer salary) {
        return empDao.getDeptAndSalWhoseSalIsGreaterThanProvided(salary);
    }


    public Object[] getDeptAndSalWhoseSalIsGreaterThanProvidedAnotherWay(Integer salary) {
        return empDao.getDeptAndSalWhoseSalIsGreaterThanProvidedAnotherWay(salary);
    }

    public Iterable<Book> retireveByBookName(String bookName) {
        return bookDao.retireveByBookName(bookName);
    }


    public Iterable<Book> findByBookName(String bookName) {
        return bookDao.findByBookName(bookName);
    }


    public Iterable<Book> retireveBookById(Integer bookId) {
        return bookDao.retireveBookById(bookId);
    }


    public Iterable<Book> saveBooks(Iterable<Book> booksList) {
        return bookDao.saveAll(booksList);
    }

    public Iterable<Book> findBooks() {
        return bookDao.findAll();
    }

    public Iterable<Person> saveAllPersons(Iterable<Person> personsList) {
        return personDao.saveAll(personsList);
    }


    public Iterable<Person> getMultiplePersons(Iterable<Integer> personIds) {
        return personDao.findAllById(personIds);
    }

    public Iterable<Person> getAllPersons() {
        return personDao.findAll();
    }

    //Implementation of Derived Queries


    public Iterable<Person> findByLastNameOrFirstName(String lastName, String firstName) {
        return personDao.findByLastNameOrFirstName(lastName, firstName);
    }


    public Person findByLastNameAndFirstName(String lastName, String firstName) {
        return personDao.findByLastNameAndFirstName(lastName, firstName);
    }


    public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName) {
        return personDao.findByLastNameOrderByCreatedDateDesc(lastName);
    }


    public List<Person> findByAgeLessThanEqual(Integer age) {
        return personDao.findByAgeLessThanEqual(age);


    }

    public List<Person> findByFirstNameLike(String firstName) {
        return personDao.findByFirstNameLike(firstName);
    }

    public List<Person> findByLastNameAndAgeLessThanEqual(String lastName, int age) {
        return personDao.findByLastNameAndAgeLessThanEqual(lastName, age);
    }

    public List<Person> findByCreatedDateBetween(Date startdate, Date endDate) {
        return personDao.findByCreatedDateBetween(startdate, endDate);
    }

    public List<Person> giveDataByLastName(String lastName) {
        return personDao.giveDataByLastName(lastName);
    }
}
