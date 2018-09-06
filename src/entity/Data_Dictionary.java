package entity;

import java.sql.Date;

/**
 * 数据字典表
 * @author Administrator
 *
 */
public class Data_Dictionary {

	 protected int 	id;//主键ID
	 protected String typeCode;//类型编码
	 protected String typeName; //类型名称
	 protected int valueId; //类型值ID
	 protected String valueName;//类型值Name
	 protected int createdBy;//创建者（来源于backend_user用户表的用户id）
	 protected String creationDate;//创建时间
	 protected int modifyBy;//更新者（来源于backend_user用户表的用户id）
	 protected String modifyDate; //最新更新时间
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getValueId() {
		return valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	 
	 
}
