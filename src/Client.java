
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import com.wcf.rmi.RenoteInterface;
public class Client {

	static RenoteInterface rmiService;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			rmiService=(RenoteInterface)Naming.lookup("rmi://localhost:8888/server");
		    new Client().select();
		}
		catch(Exception e)
		{
			throw new RuntimeException("������",e);
		}

	}
	
	public void select() throws RemoteException
	{
		System.out.println("��ѡ��Ҫִ�еĲ���");
		System.out.println("1�������ļ�      2���޸��ļ�     3��ɾ���ļ�     4���г��ļ�");
		System.out.println("5��ͳ���ļ�      6��ռ�ÿռ�     0���˳�");
		Scanner s=new Scanner(System.in);
		int selected=s.nextInt();
		switch(selected)
		{
		case 1:create();break;
		case 2:modify();break;
		case 3:delete();break;
		case 4:list();break;
		case 5:count();break;
		case 6:sum();break;
		case 0:break;
		}
	}
	public void create() throws RemoteException
	{
		rmiService.create();
		select();
	}
	public void modify() throws RemoteException
	{
		rmiService.modify();
		select();
	}
	public void delete() throws RemoteException
	{
		rmiService.delete();
		select();
	}
	public void list() throws RemoteException
	{
		rmiService.list();
		select();
	}
	public void count() throws RemoteException
	{
		rmiService.Count();
		select();
	}
	public void sum() throws RemoteException
	{
		rmiService.sum();
		select();
	}
	

}
