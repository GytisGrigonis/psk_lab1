package lab1.usecases;

import lab1.mybatis.dao.LecturerMapper;
import lab1.mybatis.model.Lecturer;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class LecturersMyBatis {
    @Inject
    private LecturerMapper lecturerMapper;

    @Getter
    @Setter
    private Lecturer newLecturer = new Lecturer();

    @Getter
    private List<Lecturer> allLecturers;

    @PostConstruct
    public void init() {
        loadAllLecturers();
    }

    public Lecturer findById(int id) {
        return lecturerMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void add() {
        lecturerMapper.insert(newLecturer);
    }

    private void loadAllLecturers() {
        allLecturers = lecturerMapper.selectAll();
    }
}

