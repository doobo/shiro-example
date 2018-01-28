package vip.ipav.shiro.po;

import java.util.Date;

public class UserRole {
    /**
     * 
     * 表字段 : user_roles.user_id
     */
    private Long userId;

    /**
     * 
     * 表字段 : user_roles.roles_id
     */
    private Long rolesId;

    /**
     * 
     * 表字段 : user_roles.create_time
     */
    private Date createTime;

    /**
     * 
     * 表字段 : user_roles.next
     */
    private String next;

    private User user;

    private Role role;

    /**
     * 获取  字段:user_roles.user_id
     *
     * @return user_roles.user_id, 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置  字段:user_roles.user_id
     *
     * @param userId the value for user_roles.user_id, 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:user_roles.roles_id
     *
     * @return user_roles.roles_id, 
     */
    public Long getRolesId() {
        return rolesId;
    }

    /**
     * 设置  字段:user_roles.roles_id
     *
     * @param rolesId the value for user_roles.roles_id, 
     */
    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    /**
     * 获取  字段:user_roles.create_time
     *
     * @return user_roles.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:user_roles.create_time
     *
     * @param createTime the value for user_roles.create_time, 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:user_roles.next
     *
     * @return user_roles.next, 
     */
    public String getNext() {
        return next;
    }

    /**
     * 设置  字段:user_roles.next
     *
     * @param next the value for user_roles.next, 
     */
    public void setNext(String next) {
        this.next = next == null ? null : next.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role=role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId=" + userId +
                ", rolesId=" + rolesId +
                ", createTime=" + createTime +
                ", next='" + next + '\'' +
                ", role=" + role +
                '}';
    }
}