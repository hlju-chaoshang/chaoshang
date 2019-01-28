package hlju.chaoshang.po;

public class Applyinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.position
     *
     * @mbggenerated
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.country
     *
     * @mbggenerated
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.passport
     *
     * @mbggenerated
     */
    private String passport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.licenseid
     *
     * @mbggenerated
     */
    private Byte licenseid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table applyinfo
     *
     * @mbggenerated
     */
    public Applyinfo(String position, String name, String sex, String country, String province, String city, String id, String passport, Byte licenseid) {
        this.position = position;
        this.name = name;
        this.sex = sex;
        this.country = country;
        this.province = province;
        this.city = city;
        this.id = id;
        this.passport = passport;
        this.licenseid = licenseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.position
     *
     * @return the value of applyinfo.position
     *
     * @mbggenerated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.name
     *
     * @return the value of applyinfo.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.sex
     *
     * @return the value of applyinfo.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.country
     *
     * @return the value of applyinfo.country
     *
     * @mbggenerated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.province
     *
     * @return the value of applyinfo.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.city
     *
     * @return the value of applyinfo.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.ID
     *
     * @return the value of applyinfo.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.passport
     *
     * @return the value of applyinfo.passport
     *
     * @mbggenerated
     */
    public String getPassport() {
        return passport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.licenseid
     *
     * @return the value of applyinfo.licenseid
     *
     * @mbggenerated
     */
    public Byte getLicenseid() {
        return licenseid;
    }
}