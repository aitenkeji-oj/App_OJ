package entity;

import java.sql.Date;

/**
 * App所属分类表
 * @author Administrator
 *
 */
public class App_Category {

	protected int id;//主键ID
	protected String categoryCode;//分类编码
	protected String categoryName; //分类名称
	protected int parentId; //父级节点id
	protected int createdBy; //创建者（来源于backend_user用户表的用户id）
	protected Date creationTime; //创建时间
	protected int modifyBy; //更新者（来源于backend_user用户表的用户id）
	protected Date modifyDate; //最新更新时间
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
