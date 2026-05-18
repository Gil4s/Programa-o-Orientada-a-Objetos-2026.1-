public class EventoDelegacao{

    private DataHora momento;
    private String momento_name;
    

    public EventoDelegacao (DataHora momento, String momento_name) {
        this.momento = momento;
        this.momento_name = momento_name;
    }

    @Override
    public String toString () {
        return momento + momento_name; 
    }

}