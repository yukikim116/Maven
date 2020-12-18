package com.company.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RopMapper<G> {
    G mapRow(ResultSet row) throws SQLException;
}
