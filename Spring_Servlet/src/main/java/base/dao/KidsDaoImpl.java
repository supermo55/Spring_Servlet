package  base.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import base.model.Kids;
import  base.model.Login;
import  base.model.User;
public class KidsDaoImpl implements KidsDao {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public int register(Kids kid) {
		String sql = "insert into kids values(?,?,?,?,?,?,?,?)";
		createTable();
		return jdbcTemplate.update(sql, new Object[] { kid.getKidsfname(), kid.getKidslname(), kid.getclassName(),
			    kid.getTime(), kid.getpfirstName(),kid.getplastName(),kid.getemergencyContact(), kid.getAddress() });
	}

    public void createTable()  {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Kids" 
                + "  (kidsfname  VARCHAR(255),"
                + "   kidslname  VARCHAR(255),"
                + "   className VARCHAR(255),"
                + "   time VARCHAR(255),"
                + "   pfirstname VARCHAR(255),"
                + "   plastname VARCHAR(255),"
                + "   emergencycontact     VARCHAR(255),"
                + "   address   VARCHAR(255) primary key)";

        jdbcTemplate.execute(sqlCreate);
    }
  }

 
