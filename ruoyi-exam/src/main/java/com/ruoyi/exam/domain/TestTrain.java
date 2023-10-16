package com.ruoyi.exam.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 测试训练表
 * </p>
 *
 * @author yxp
 * @since 2023-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("test_train")
@ApiModel(value="TestTrain对象", description="测试训练表")
public class TestTrain implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "考生ID")
    private String candidateId;

    @ApiModelProperty(value = "题库ID")
    private String topicId;

    @ApiModelProperty(value = "题目分类（数据字典编码）")
    private String topicSort;

    @ApiModelProperty(value = "题目类型（1：单选题 2：多选题 3：判断题）")
    private String topicType;

    @ApiModelProperty(value = "试卷题目序号")
    private Integer topicNum;

    @ApiModelProperty(value = "考生答案")
    private String candidateAnswer;

    @ApiModelProperty(value = "答题结果是否正确（1：正确 0：错误）")
    private String answerResult;

    @ApiModelProperty(value = "答案解析")
    private String answerAnalysis;

    @ApiModelProperty(value = "数据状态（1：正常  0：删除）")
    private String delFlag;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "创建人")
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @ApiModelProperty(value = "更新人")
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    @ApiModelProperty(value = "备注")
    private String remark;


}
