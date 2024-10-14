package version3;

import java.lang.reflect.Field;

public class Name  {

    private String fName;
    private String mName;
    private String lName;


    public Name(){

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void displayName(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(fName != null){
            sb.append(fName);
        }

        if(mName != null){
            sb.append(" ").append(mName);
        }

        if(lName != null){
            sb.append(" ").append(lName);
        }

        return sb.toString();

    }

}
