package beans;

import java.util.ArrayList;

public class Datainfo {
    public MemberBean getDataToMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

}
