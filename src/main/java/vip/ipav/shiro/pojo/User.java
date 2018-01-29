package vip.ipav.shiro.pojo;

import java.util.Date;
import java.util.List;

public class User {
    /**
     * 
     * 表字段 : user.id
     */
    private Long id;

    /**
     * 
     * 表字段 : user.username
     */
    private String username;

    /**
     * 
     * 表字段 : user.password
     */
    private String password;

    /**
     * 
     * 表字段 : user.create_time
     */
    private Date createTime;

    /**
     * 
     * 表字段 : user.other
     */
    private String other;

    private List<UserRole> userRoles;

    /**
     * 获取  字段:user.id
     *
     * @return user.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:user.id
     *
     * @param id the value for user.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:user.username
     *
     * @return user.username, 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置  字段:user.username
     *
     * @param username the value for user.username, 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取  字段:user.password
     *
     * @return user.password, 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:user.password
     *
     * @param password the value for user.password, 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取  字段:user.create_time
     *
     * @return user.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:user.create_time
     *
     * @param createTime the value for user.create_time, 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:user.other
     *
     * @return user.other, 
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置  字段:user.other
     *
     * @param other the value for user.other, 
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles=userRoles;
    }
}