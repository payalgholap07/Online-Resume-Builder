package resuneBuilder;

import java.util.*;
import java.io.*;
import java.sql.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.PdfPTable;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;


public class Generatepdf {
public static void gpdf() {
	try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/resume", "root","");
		            Statement statement = connection.createStatement();
		            String query = "SELECT * FROM resume ORDER BY timestamp_column DESC LIMIT 1";
		            ResultSet resultSet = statement.executeQuery(query);

		            ResultSetMetaData metaData = resultSet.getMetaData();
		            int columnCount = metaData.getColumnCount();
		            String file_name="D:\\generate pdf\\resume.pdf";
		    		Document documentt = new Document();
		    		PdfWriter.getInstance(documentt, new FileOutputStream(file_name));
		            documentt.open();

		            if (resultSet.next()) {
		                for (int i = 1; i <= columnCount; i++) {
		                    String columnName = metaData.getColumnName(i);
		                    String data = resultSet.getString(i);
		                    Paragraph paragraph = new Paragraph(columnName + ": " + data);
		                    documentt.add(paragraph);
		                }
		            }
		        

		            documentt.close();

		            resultSet.close();
		            statement.close();
		            connection.close();
		            

		            System.out.println("PDF generated successfully!");

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }


		

}
