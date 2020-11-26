package pe.apirestoracle.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.apirestoracle.dao.ProductoDao;

@Repository
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public List<Map<String, Object>> readAll() {
		List<Map<String,Object>> lista = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_productos") //nombre del paquete
				.withProcedureName("sp_listar_productos") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("cursor_productos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				Map<String, Object> map = simpleJdbcCall.execute();
				lista.add(map);
		return lista;
	}

}
