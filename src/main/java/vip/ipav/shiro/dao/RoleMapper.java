package vip.ipav.shiro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import vip.ipav.shiro.pojo.Role;
import vip.ipav.shiro.pojo.RoleExample;
@Component
public interface RoleMapper {
    /**
     *  根据指定的条件获取数据库记录数,roles
     *
     * @param example
     */
    long countByExample(RoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,roles
     *
     * @param example
     */
    int deleteByExample(RoleExample example);

    /**
     *  根据主键删除数据库的记录,roles
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,roles
     *
     * @param record
     */
    int insert(Role record);

    /**
     *  动态字段,写入数据库记录,roles
     *
     * @param record
     */
    int insertSelective(Role record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,roles
     *
     * @param example
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *  根据指定主键获取一条数据库记录,roles
     *
     * @param id
     */
    Role selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,roles
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,roles
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,roles
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *  根据主键来更新符合条件的数据库记录,roles
     *
     * @param record
     */
    int updateByPrimaryKey(Role record);
}