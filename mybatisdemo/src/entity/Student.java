package entity;

import java.sql.Date;

/**
 *@auth ������
 *@time 2019��4��30������3:28:42
 */
public class Student {

	    //ѧ�����
	    private Integer sid;
	    //ѧ������
	    private String sname;
	    //ѧ���Ա�
	    private Date sbirthday;
	    
	    public Date getSbirthday() {
			return sbirthday;
		}
		public void setSbirthday(Date sbirthday) {
			this.sbirthday = sbirthday;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		private String grade;
	    

	    
		private String sex;
	    

		
	    public Student(Integer sid, String sname, Date sbirthday, String grade, String sex) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sbirthday = sbirthday;
			this.grade = grade;
			this.sex = sex;
		}
		public Integer getSid() {
	        return sid;
	    }
	    public void setSid(Integer sid) {
	        this.sid = sid;
	    }
	    public String getSname() {
	        return sname;
	    }
	    public void setSname(String sname) {
	        this.sname = sname;
	    }
	    public String getSex() {
	        return sex;
	    }
	    public void setSex(String sex) {
	        this.sex = sex;
	    }
	    
	}

