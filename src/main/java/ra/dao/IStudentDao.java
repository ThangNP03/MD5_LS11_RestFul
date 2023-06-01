package ra.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ra.model.Student;
@Repository
public interface IStudentDao extends PagingAndSortingRepository<Student, Long> {
    @Query("Select s from Student  as s where s.studentName like concat('%',:studentName,'%')")
    Iterable<Student> searchByName(@Param("studentName") String studentName );
}
