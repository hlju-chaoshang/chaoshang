package hlju.chaoshang.po;

public class Applyinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.position
     * 职务
     *
     * @mbggenerated
     */
    private String position;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.name
     * 姓名
     * @mbggenerated
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.sex
     *  性别
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.country
     * 国家
     * @mbggenerated
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.province
     * 省份
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.city
     * 城市
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.ID
     * 身份证
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.passport
     * 护照编号
     * @mbggenerated
     */
    private String passport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.licenseid
     * 证件号
     * @mbggenerated
     */
    private Byte licenseid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table applyinfo
     * 获取报名表信息对象
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
     *  获得当前账号的报名表信息的职务
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
     * 获得当前账号的报名表信息的姓名
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.sex
     * 获得当前账号的报名表信息的性别
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
     * 获得当前账号的报名表信息的国家
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
     * 获得当前账号的报名表信息的省份
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
     * 获得当前账号的报名表信息的城市
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
     * 获得当前账号的报名表信息的身份证
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
     * 获得当前账号的报名表信息的护照编号
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
     * 获得当前账号的报名表信息的许可证
     * @mbggenerated
     */
    public Byte getLicenseid() {
        return licenseid;
    }
}