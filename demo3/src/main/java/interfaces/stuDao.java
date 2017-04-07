package interfaces;

import beans.studentBean;

public interface stuDao {
	//显示
     public studentBean show(studentBean bean);
     
     //增加
     public void add(studentBean bean);
     
     //删除
     public void del(int stuId);
     
     //修改
     public void mod(int stuId,String stuName,String stuPwd);
}
