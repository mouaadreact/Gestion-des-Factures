package DBO;
import java.sql.ResultSet;
public interface CrudDAO {
	
	public ResultSet getAll();
	public ResultSet getId(int id);
	public void update(Article A,int id);
	public void delete(int id);
	public int Insert(Article A);

}
