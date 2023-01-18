package beans;

public class BeansMain {
    public static void main(String[] args) {
        Datainfo dataInfo = new Datainfo();
        MemberBean memberBean = dataInfo.getDataToMemberBean();

        System.out.println(memberBean.getFirstName() 
        + " " + memberBean.getSecondName()
        + " " + memberBean.getHandleName());
    }
}
