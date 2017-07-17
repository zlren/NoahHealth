package com.yhch.pojo;

import javax.persistence.*;

@Table(name = "result_input_detail")
public class ResultInputDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "result_input_id")
    private Integer resultInputId;

    @Column(name = "third_id")
    private Integer thirdId;

    private String value;

    private String normal;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return result_input_id
     */
    public Integer getResultInputId() {
        return resultInputId;
    }

    /**
     * @param resultInputId
     */
    public void setResultInputId(Integer resultInputId) {
        this.resultInputId = resultInputId;
    }

    /**
     * @return third_id
     */
    public Integer getThirdId() {
        return thirdId;
    }

    /**
     * @param thirdId
     */
    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return normal
     */
    public String getNormal() {
        return normal;
    }

    /**
     * @param normal
     */
    public void setNormal(String normal) {
        this.normal = normal;
    }
}