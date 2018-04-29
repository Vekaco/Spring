package ch1.lession1_1_4.dao;

import ch1.lession1_1_4.java_bean.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(long id);
}
