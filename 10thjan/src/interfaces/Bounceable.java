package interfaces;

public interface Bounceable {

    int BBF=5;  //static and final //BBF - BaseBounceFactor
    void bounce(); //public, abstract
    void setBounceFactor(int multiple);//public,abstract

    default String getInterfaceInfo()
    {
        return "This represents the bouncing feature of any bouncebale type like ball etc";
    }

    static double getBBF()
    {
        return BBF;
    }
}


