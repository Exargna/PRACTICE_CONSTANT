public enum DeliverTypes {
    //Упрощение программы и понимание использования констант и ENUM
    //Для большего понимания, мы создает приватный параметр value
    //Он принимает значения которые мы передаем через константы
    AERO("Авиа доставка стоит 5000 тенге"),
    AUTO("Авто доставка стоит 2000 тенге"),
    STEP("Пешая доставка стоит 1000 тенге"),
    WATER("Водная доставка стоит 5000 тенге");

    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
