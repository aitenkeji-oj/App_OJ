package entity;

import java.sql.Date;

/**
 * �����ֵ��
 * @author Administrator
 *
 */
public class Data_Dictionary {

	 protected int 	id;//����ID
	 protected String typeCode;//���ͱ���
	 protected String typeName; //��������
	 protected int valueId; //����ֵID
	 protected String valueName;//����ֵName
	 protected int createdBy;//�����ߣ���Դ��backend_user�û�����û�id��
	 protected String creationDate;//����ʱ��
	 protected int modifyBy;//�����ߣ���Դ��backend_user�û�����û�id��
	 protected String modifyDate; //���¸���ʱ��
	 
	 
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
