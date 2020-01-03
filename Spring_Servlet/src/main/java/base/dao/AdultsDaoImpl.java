package  base.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import base.model.Adults;
public class AdultsDaoImpl implements AdultsDao {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public int register(Adults adult) {
		String sql = "insert into Adults values(?,?,?,?,?,?)";
		createTable();
		return jdbcTemplate.update(sql, new Object[] { adult.getFirstname(), adult.getLastname(), adult.getclassName(),
			    adult.getTime(), adult.getemergencyContact(), adult.getAddress() });
	}

    public void createTable()  {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Adults" 
                + "  (firstname  VARCHAR(255),"
                + "   lastname  VARCHAR(255),"
                + "   className VARCHAR(255),"
                + "   time VARCHAR(255),"
                + "   emergencycontact     VARCHAR(255),"
                + "   address   VARCHAR(255) primary key)";

        jdbcTemplate.execute(sqlCreate);
    }
  }

 
