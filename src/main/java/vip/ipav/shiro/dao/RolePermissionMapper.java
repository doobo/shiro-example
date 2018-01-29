package vip.ipav.shiro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import vip.ipav.shiro.pojo.RolePermission;
import vip.ipav.shiro.pojo.RolePermissionExample;
@Component
public interface RolePermissionMapper {
    /**
     *  根据指定的条件获取数据库记录数,roles_permissions
     *
     * @param example
     */
    long countByExample(RolePermissionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,roles_permissions
     *
     * @param example
     */
    int deleteByExample(RolePermissionExample example);

    /**
     *  根据主键删除数据库的记录,roles_permissions
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,roles_permissions
     *
     * @param record
     */
    int insert(RolePermission record);

    /**
     *  动态字段,写入数据库记录,roles_permissions
     *
     * @param record
     */
    int insertSelective(RolePermission record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,roles_permissions
     *
     * @param example
     */
    List<RolePermission> selectByExample(RolePermissionExample example);

    /**
     *  根据指定主键获取一条数据库记录,roles_permissions
     *
     * @param id
     */
    RolePermission selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,roles_permissions
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,roles_permissions
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,roles_permissions
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     *  根据主键来更新符合条件的数据库记录,roles_permissions
     *
     * @param record
     */
    int updateByPrimaryKey(RolePermission record);
}