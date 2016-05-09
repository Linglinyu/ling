package com.lly.best.util;
import java.util.List;
/**
 * 类描述: 分页信息封装类
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 
 * @version V1.0
*/
public class PageResults<T> {
	// 下一页
	private int pageNo;
	// 当前页
	private int currentPage;
	// 每页个个数
	private int pageSize;
	// 总条数
	private int totalCount;
	// 总页数
	private int pageCount;
	// 记录
	private List<T> results;
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageNo() {
	if (pageNo <= 0) {
			return 1;
		} else{
			return pageNo > pageCount ? pageCount : pageNo;
		}
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize <= 0 ? 10 : pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public void resetPageNo() {
		pageNo = currentPage + 1;
		pageCount = totalCount % pageSize == 0 ? totalCount / pageSize
		: totalCount / pageSize + 1;
	}
}