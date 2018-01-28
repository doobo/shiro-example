package ibatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.ipav.shiro.dao.*;
/**
 * Created by Doobo on 2018/1/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:ApplicationContext.xml"})
public class ShiroTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @Autowired
    PermissionMapper permissionMapper;

    @Test
    public void sayUser() throws Exception {
        System.out.println(userMapper.selectByPrimaryKey(1L));

        System.out.println(roleMapper.selectByPrimaryKey(3L));
//        System.out.println(rolesPermissionsMapper.selectByExample(null));
    }
}
