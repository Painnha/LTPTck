package dao;

import java.util.Map;

import entities.Department;


public interface DepartmentDAO {
	// Count Course by Department
	public Map<Department, Long> countCoursesByDepartment();
	public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findBudgetGreaterThan(@Param("budget") double budget, @Param("startDate") LocalDateTime startDate);
}
}
