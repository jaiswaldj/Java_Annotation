public class CSVUser {
    @CSVBindByName
    private String name;
    @CsvBindByName(column = "email", required = true)
    private String email;

    @CsvBindByName(column = "phone")
    private String phoneNo;

    @CsvBindByName
    private String country;
    @Override
    public String toString(){
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", country='" + country + '\''+
                '}';
    }
}
