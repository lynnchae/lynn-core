package com.lynn.framework.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.lynn.framework.constant.enums.ResourcesStatus;
import com.lynn.framework.constant.enums.ResourcesType;
import com.lynn.framework.entity.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ResourcesDto extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String parentId;

    private String modulesName;

    private String modulesCode;

    private String name;

    private String description;

    private String url;

    private String controller;

    private String action;

    private ResourcesStatus status;

    private ResourcesType type;

    private Integer sort;
    private String remark;
    private String titleName;
    private String content;

    //判断下面是否有子节点
    private Boolean isLeaf;

    private String parentName;

    private List<ResourcesDto> children;


}