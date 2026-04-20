package Service;
import Model.SuperAdmin;

public class SuperAdminService
{
    SuperAdmin sa = new SuperAdmin();
    
    public boolean registerSA(String id, String fname, String lname,
                            String contactNum, String position, String password,
                            String confirmPass)
    {
        if (!password.equals(confirmPass))
        {
            return false;
        }
        sa.id = id;
        sa.firstName = fname;
        sa.lastName = lname;
        sa.contactNum = contactNum;
        sa.position = position;        
        sa.password = password;
        
        return true;
    }
    
    public boolean LogIn(String id, String regID, String password, String regPass)
    {
        return id.equals(regID) && password.equals(regPass);
    }
}