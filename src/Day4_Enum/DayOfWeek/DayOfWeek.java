package Day4_Enum.DayOfWeek;

public enum  DayOfWeek {
    PONIEDZIALEK("poniedziałek"){
        public DayOfWeek nextDay() {return WTOREK;}},

    WTOREK("wtorek"){
        public DayOfWeek nextDay() {return SRODA;}},

    SRODA("sroda"){
        public DayOfWeek nextDay() {return CZWARTEK;}},

    CZWARTEK("czwartek"){
        public DayOfWeek nextDay() {return PIATEK;}},

    PIATEK("piatek"){
        public DayOfWeek nextDay() {return SOBOTA;}},

    SOBOTA("sobota"){
        public DayOfWeek nextDay() {return NIEDZIELA;}},

    NIEDZIELA("niedziela"){
        public DayOfWeek nextDay() {return PONIEDZIALEK;}};

    private final String name;

    DayOfWeek(String name) {
        this.name=name;
    }

    public abstract DayOfWeek nextDay();

}
