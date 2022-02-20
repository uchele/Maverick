/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SchoolManagementSystem;

/**
 *
 * @author HP
 */
class User {
    private int Student;
  private String jtxtFN, jtxtSn, jComboBox, jtxtmaths, jtxteng, jtxtBio, jtxtcom, jtxtchem, jtxtphys,  jtxtFm, jtxtHis, jtxtTs,jtxtAve,jtxtRank;
//private byte[] picture;
    public User (int id,String classcombo,String termcombo,String fee,String sectioncombo,String Name,String Surname,String date,String gender,String nationality,String Previous,String sickness, String Total,String Average,String Rank )
    {
    this.Student = id;
    this.jtxtFN = classcombo;
    this.jtxtSn = termcombo;
    this.jComboBox = fee;
    this.jtxtmaths = sectioncombo;
    this.jtxteng = Name;
    this.jtxtBio = Surname;
    this.jtxtcom = date;
    this.jtxtchem = gender;
    this.jtxtphys = nationality;
    this.jtxtFm = Previous;
    this.jtxtHis = sickness;
    this.jtxtTs = Total;
    this.jtxtAve = Average;
    this.jtxtRank = Rank;
   // }
    //public byte[] getPicture() {
        //return picture;
    //}
    }
public int getid(){
return Student;
}  
public String getclasscombo(){
return jtxtFN;
}
public String gettermcombo(){
return jtxtSn;
}
public String getfee(){
return jComboBox;
}
public String getsectioncombo(){
return jtxtmaths;
}
public String getName(){
return jtxteng;
}
public String getSurname(){
return jtxtBio;
}
public String getdate(){
return jtxtcom;
}
public String getgender(){
return jtxtchem;
}
public String getnationality(){
return jtxtphys;
}
public String getprevious(){
return jtxtFm;
}
public String getsickness(){
return jtxtHis;
}
//public byte[] getImage(){
//return picture;
//}
public String getTotal(){
return jtxtTs;
}
public String getAverage(){
return jtxtAve;
}
public String getRank(){
return jtxtRank;
}

}
