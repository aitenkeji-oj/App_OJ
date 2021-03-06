package entity;

import java.sql.Date;

/**
 * App版本信息表
 * @author Administrator
 *
 */
public class App_Version {

	protected int id;//主键id
	protected int appId;//appId（来源于：app_info表的主键id）
	protected String versionNo;//版本号
	protected String versionInfo;//版本介绍
	protected int publishStatus;//发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
	protected String downloadLink;//下载链接
	protected Double versionSize; //版本大小（单位：M）
	protected int createdBy;//创建者（来源于dev_user开发者信息表的用户id）
	protected Date creationDate; //创建时间
	protected int modifyBy;//更新者（来源于dev_user开发者信息表的用户id）
	protected Date modifyDate; //最新更新时间
	protected String apkLocPath;//apk文件的服务器存储路径
	protected String apkFileName; //上传的apk文件名称
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionInfo() {
		return versionInfo;
	}
	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
	public int getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public Double getVersionSize() {
		return versionSize;
	}
	public void setVersionSize(Double versionSize) {
		this.versionSize = versionSize;
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
	public String getApkLocPath() {
		return apkLocPath;
	}
	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}
	public String getApkFileName() {
		return apkFileName;
	}
	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}
	
	
	
	
	
	
}
