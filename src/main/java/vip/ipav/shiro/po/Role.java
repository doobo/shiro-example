package vip.ipav.shiro.po;

import java.util.List;

public class Role {
    /**
     * 
     * 表字段 : roles.id
     */
    private Long id;

    /**
     * 
     * 表字段 : roles.name
     */
    private String name;

    /**
     * 
     * 表字段 : roles.code
     */
    private String code;

    /**
     * 
     * 表字段 : roles.next
     */
    private String next;

    private List<UserRole> userRoles;

    private List<RolePermission> rolePermissions;

    /**
     * 获取  字段:roles.id
     *
     * @return roles.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:roles.id
     *
     * @param id the value for roles.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:roles.name
     *
     * @return roles.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:roles.name
     *
     * @param name the value for roles.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:roles.code
     *
     * @return roles.code, 
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置  字段:roles.code
     *
     * @param code the value for roles.code, 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取  字段:roles.next
     *
     * @return roles.next, 
     */
    public String getNext() {
        return next;
    }

    /**
     * 设置  字段:roles.next
     *
     * @param next the value for roles.next, 
     */
    public void setNext(String next) {
        this.next = next == null ? null : next.trim();
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles=userRoles;
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<RolePermission> rolePermissions) {
        this.rolePermissions=rolePermissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", next='" + next + '\'' +
                ", rolePermissions=" + rolePermissions +
                '}';
    }
}