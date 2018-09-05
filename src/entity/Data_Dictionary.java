package entity;

import java.sql.Date;

/**
 * 数据字典表
 * @author Administrator
 *
 */
public class Data_Dictionary {

	protected int id; //用户密码
	protected String userCode; //用户编码
	protected String userName; //用户编码
	protected int userType; //用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
	protected int createdBy; //创建者（来源于backend_user用户表的用户id）
	protected Date creationDate; //创建时间
	protected int modifyBy; //更新者（来源于backend_user用户表的用户id）
	protected Date modifyDate; //最新更新时间
	protected String userPassword; //用户密码
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}
