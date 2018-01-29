package vip.ipav.shiro.pojo;

import java.util.List;

public class Permission {
    /**
     * 
     * 表字段 : permissions.id
     */
    private Long id;

    /**
     * 
     * 表字段 : permissions.execute
     */
    private String execute;

    /**
     * 
     * 表字段 : permissions.description
     */
    private String description;

    /**
     * 
     * 表字段 : permissions.other
     */
    private String other;

    private List<RolePermission> rolePermissions;

    /**
     * 获取  字段:permissions.id
     *
     * @return permissions.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:permissions.id
     *
     * @param id the value for permissions.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:permissions.execute
     *
     * @return permissions.execute, 
     */
    public String getExecute() {
        return execute;
    }

    /**
     * 设置  字段:permissions.execute
     *
     * @param execute the value for permissions.execute, 
     */
    public void setExecute(String execute) {
        this.execute = execute == null ? null : execute.trim();
    }

    /**
     * 获取  字段:permissions.description
     *
     * @return permissions.description, 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置  字段:permissions.description
     *
     * @param description the value for permissions.description, 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取  字段:permissions.other
     *
     * @return permissions.other, 
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置  字段:permissions.other
     *
     * @param other the value for permissions.other, 
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<RolePermission> rolePermissions) {
        this.rolePermissions=rolePermissions;
    }
}