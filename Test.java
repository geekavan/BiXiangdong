class Date implements Comparable<Date>{
    private final int year;
    private final int month;
    private final int day;
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int compareTo(Date that){
        if(this.year>that.year) return 1;
        if(this.year<that.year) return -1;
        if(this.month>that.year) return 1;
        if(this.month<that.year) return -1;
        if(this.day>that.day) return 1;
        if(this.day<that.day) return -1;
        return 0;
    }
}
class Test{
    public static void main(String[] args){
        Date[] date = new Date[5];
        date[0] = new Date(2019,10,20);
        date[1] = new Date(2019,10,21);
        date[2] = new Date(2019,10,22);
        date[3] = new Date(2019,10,23);
        date[4] = new Date(2019,10,24);
    }
}