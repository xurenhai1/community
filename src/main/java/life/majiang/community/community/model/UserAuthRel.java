package life.majiang.community.community.model;

public class UserAuthRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_auth_rel.id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_auth_rel.user_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_auth_rel.auth_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    private Long authId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_auth_rel.auth_type
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    private String authType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_auth_rel.id
     *
     * @return the value of user_auth_rel.id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_auth_rel.id
     *
     * @param id the value for user_auth_rel.id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_auth_rel.user_id
     *
     * @return the value of user_auth_rel.user_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_auth_rel.user_id
     *
     * @param userId the value for user_auth_rel.user_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_auth_rel.auth_id
     *
     * @return the value of user_auth_rel.auth_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_auth_rel.auth_id
     *
     * @param authId the value for user_auth_rel.auth_id
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_auth_rel.auth_type
     *
     * @return the value of user_auth_rel.auth_type
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_auth_rel.auth_type
     *
     * @param authType the value for user_auth_rel.auth_type
     *
     * @mbg.generated Wed Feb 23 23:32:30 CST 2022
     */
    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }
}