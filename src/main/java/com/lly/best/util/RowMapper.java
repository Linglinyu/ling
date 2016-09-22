package com.lly.best.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author cwx
 * @date 2016/09/22 14:08
 * And it’s as if I never really even knew love until right now, in this moment, with you.
 */
public interface RowMapper {
    public Object mapRow(ResultSet rs, int index)
            throws SQLException;
}
