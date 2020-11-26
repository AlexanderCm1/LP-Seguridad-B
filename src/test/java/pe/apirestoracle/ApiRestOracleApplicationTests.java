package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.google.gson.Gson;

import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.dao.RolDao;
import pe.apirestoracle.dao.UsuarioDao;
import pe.apirestoracle.entity.Rol;

@SpringBootTest
class ApiRestOracleApplicationTests {

@Autowired
PasswordEncoder passwordEncoder;

@Autowired
RolDao roldao;
@Autowired
ProductoDao productoDao;


@Test
void contextLoads() {
	
	
	//System.out.println(passwordEncoder.encode("123"));
	
	//System.out.println(roldao.readAll());
	System.out.println(productoDao.readAll());
	//System.out.println(roldao.read(1));
	System.out.println(roldao.delete(5));
}
		
}
