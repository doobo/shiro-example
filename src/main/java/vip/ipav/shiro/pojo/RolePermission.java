package vip.ipav.shiro.pojo;

import java.util.Date;

public class RolePermission {
    /**
     * 
     * 表字段 : roles_permissions.id
     */
    private Long id;

    /**
     * 
     * 表字段 : roles_permissions.roles_id
     */
    private Long rolesId;

    /**
     * 
     * 表字段 : roles_permissions.permissions_id
     */
    private Long permissionsId;

    /**
     * 
     * 表字段 : roles_permissions.create_time
     */
    private Date createTime;

    /**
     * 
     * 表字段 : roles_permissions.next
     */
    private String next;

    private Role role;

    private Permission permission;

    /**
     * 获取  字段:roles_permissions.id
     *
     * @return roles_permissions.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:roles_permissions.id
     *
     * @param id the value for roles_permissions.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:roles_permissions.roles_id
     *
     * @return roles_permissions.roles_id, 
     */
    public Long getRolesId() {
        return rolesId;
    }

    /**
     * 设置  字段:roles_permissions.roles_id
     *
     * @param rolesId the value for roles_permissions.roles_id, 
     */
    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    /**
     * 获取  字段:roles_permissions.permissions_id
     *
     * @return roles_permissions.permissions_id, 
     */
    public Long getPermissionsId() {
        return permissionsId;
    }

    /**
     * 设置  字段:roles_permissions.permissions_id
     *
     * @param permissionsId the value for roles_permissions.permissions_id, 
     */
    public void setPermissionsId(Long permissionsId) {
        this.permissionsId = permissionsId;
    }

    /**
     * 获取  字段:roles_permissions.create_time
     *
     * @return roles_permissions.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:roles_permissions.create_time
     *
     * @param createTime the value for roles_permissions.create_time, 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:roles_permissions.next
     *
     * @return roles_permissions.next, 
     */
    public String getNext() {
        return next;
    }

    /**
     * 设置  字段:roles_permissions.next
     *
     * @param next the value for roles_permissions.next, 
     */
    public void setNext(String next) {
        this.next = next == null ? null : next.trim();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role=role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission=permission;
    }
}