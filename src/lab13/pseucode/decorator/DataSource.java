package lab13.pseucode.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
