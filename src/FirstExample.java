import java.math.BigDecimal;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import com.gdc.nms.common.DateUtil;
import com.gdc.nms.model.config.ServerAgent;
import com.gdc.nms.server.agent.SnmpAgent;

public class FirstExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://192.168.207.41/nms";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "vitalnoc";
   
   public static void main(String[] args) {
	   SimpleDateFormat formateador = new SimpleDateFormat(
			   
	   "EEEE dd MMMM  yyyy hh:mm:ss", new Locale("es","MX"));
	   Date fechaDate = new Date(System.currentTimeMillis());
	   String fecha = formateador.format(fechaDate);
	   Locale currentLocale = Locale.getDefault();
	   System.out.println(currentLocale.getCountry()+" " + currentLocale.getLanguage());
	   System.out.println(fecha);
   }
}//end FirstExample