package ra.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.dao.IStudentDao;
import ra.model.Student;

import java.util.Optional;
@Service
public class StudenService implements IStudentService{
    @Autowired
    private IStudentDao studentDao;
    @Override
    public Iterable<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void delete(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public Iterable<Student> searchByName(String studentName) {
        return studentDao.searchByName(studentName);
    }
}
