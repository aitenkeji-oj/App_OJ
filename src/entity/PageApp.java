package entity;
/**
 * ����
 * @author Administrator
 *
 */
public class PageApp {

	protected int totalPageCount; //��¼��ҳ��
	protected int currentPageNo;//��ǰҳ
	protected int totalCount; //�ܼ�¼��
	protected int current; //����ҳ��
	
	
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
	
}
