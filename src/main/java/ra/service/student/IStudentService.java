package ra.service.student;

import org.springframework.data.repository.query.Param;
import ra.model.Student;
import ra.service.IGeneric;

public interface IStudentService extends IGeneric<Student, Long > {
    Iterable<Student> searchByName(String studentName );
}
