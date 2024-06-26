package lab1.mybatis.dao;

import lab1.mybatis.model.Lecturer;
import lab1.mybatis.model.University;
import org.mybatis.cdi.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface LecturerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LECTURER
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LECTURER
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    int insert(Lecturer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LECTURER
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    Lecturer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LECTURER
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    List<Lecturer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LECTURER
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    int updateByPrimaryKey(Lecturer record);

    Set<University> selectUniversitiesInLecturers(int lecturerId);
}