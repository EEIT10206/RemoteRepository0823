<<<<<<< HEAD
package model;


public interface CustomerDAO {
	public abstract CustomerBean select(String custid);
	public abstract boolean update(byte[] password, String email,
			java.util.Date birth, String custid);
=======
package model;


public interface CustomerDAO {
	public abstract CustomerBean select(String custid);
	public abstract boolean update(byte[] password, String email,
			java.util.Date birth, String custid);
>>>>>>> branch 'master' of https://github.com/EEIT10206/RemoteRepository0823.git
}