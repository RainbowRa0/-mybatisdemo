package entity;

import java.sql.Date;

/**
 *@auth 饶婷婷
 *@time 2019年4月30日下午3:28:42
 */
public class Student {

	    //学生编号
	    private Integer sid;
	    //学生名称
	    private String sname;
	    //学生性别
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

