package vip.ipav.shiro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import vip.ipav.shiro.po.UserRole;
import vip.ipav.shiro.po.UserRoleExample;
@Component
public interface UserRoleMapper {
    /**
     *  根据指定的条件获取数据库记录数,user_roles
     *
     * @param example
     */
    long countByExample(UserRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,user_roles
     *
     * @param example
     */
    int deleteByExample(UserRoleExample example);

    /**
     *  新写入数据库记录,user_roles
     *
     * @param record
     */
    int insert(UserRole record);

    /**
     *  动态字段,写入数据库记录,user_roles
     *
     * @param record
     */
    int insertSelective(UserRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,user_roles
     *
     * @param example
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,user_roles
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,user_roles
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);
}