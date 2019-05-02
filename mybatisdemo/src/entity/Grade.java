package entity;
/**
 *@auth 饶婷婷
 *@time 2019年4月30日下午3:28:56
 */
import java.util.HashSet;
import java.util.Set;

/*
 * 班级类
 * */
public class Grade {
    //班级编号
    private Integer gid;
    //班级名称
    private String gname;


    //班级下的学生信息
    private Set<Student> stus=new HashSet<Student>();
    
    public Set<Student> getStus() {
        return stus;
    }
    public void setStus(Set<Student> stus) {
        this.stus = stus;
    }
    
    public Grade() {
    }
    public Grade(Integer gid, String gname) {
        this.gid = gid;
        this.gname = gname;
        
    }
    public Integer getGid() {
        return gid;
    }
    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public String getGname() {
        return gname;
    }
    public void setGname(String gname) {
        this.gname = gname;
    }
   
}
