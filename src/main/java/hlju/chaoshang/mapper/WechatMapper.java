package hlju.chaoshang.mapper;

import hlju.chaoshang.po.Wechat;
import hlju.chaoshang.po.WechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface WechatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    int countByExample(WechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    int deleteByExample(WechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    @Insert({
        "insert into wechat (openid)",
        "values (#{openid,jdbcType=VARCHAR})"
    })
    int insert(Wechat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    int insertSelective(Wechat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    List<Wechat> selectByExample(WechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Wechat record, @Param("example") WechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Wechat record, @Param("example") WechatExample example);
}