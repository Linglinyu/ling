package com.lly.best.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 类描述: 
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 
 * @version V1.0
 */
public interface  RowMapper {
	public Object mapRow(ResultSet rs, int index)
			throws SQLException;
}
