package com.weibin.bean;

public class Department {

    public Department() {
        super();
    }

    public Department(Integer deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dept.dept_id
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dept.dept_name
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dept.dept_id
     *
     * @return the value of tbl_dept.dept_id
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dept.dept_id
     *
     * @param deptId the value for tbl_dept.dept_id
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dept.dept_name
     *
     * @return the value of tbl_dept.dept_name
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dept.dept_name
     *
     * @param deptName the value for tbl_dept.dept_name
     *
     * @mbg.generated Mon Sep 11 16:00:10 CST 2017
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}