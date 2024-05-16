package lab1.mybatis.model;

import java.util.Set;

public class Lecturer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LECTURER.ID
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LECTURER.FIRSTNAME
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    private String firstname;
    private Set<University> universities;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LECTURER.LASTNAME
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LECTURER.NAME
     *
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    private String name;

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LECTURER.ID
     *
     * @return the value of PUBLIC.LECTURER.ID
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LECTURER.ID
     *
     * @param id the value for PUBLIC.LECTURER.ID
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LECTURER.FIRSTNAME
     *
     * @return the value of PUBLIC.LECTURER.FIRSTNAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LECTURER.FIRSTNAME
     *
     * @param firstname the value for PUBLIC.LECTURER.FIRSTNAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LECTURER.LASTNAME
     *
     * @return the value of PUBLIC.LECTURER.LASTNAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LECTURER.LASTNAME
     *
     * @param lastname the value for PUBLIC.LECTURER.LASTNAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LECTURER.NAME
     *
     * @return the value of PUBLIC.LECTURER.NAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LECTURER.NAME
     *
     * @param name the value for PUBLIC.LECTURER.NAME
     * @mbg.generated Thu May 16 21:20:44 EEST 2024
     */
    public void setName(String name) {
        this.name = name;
    }
}