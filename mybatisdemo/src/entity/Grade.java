package entity;
/**
 *@auth ������
 *@time 2019��4��30������3:28:56
 */
import java.util.HashSet;
import java.util.Set;

/*
 * �༶��
 * */
public class Grade {
    //�༶���
    private Integer gid;
    //�༶����
    private String gname;


    //�༶�µ�ѧ����Ϣ
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
