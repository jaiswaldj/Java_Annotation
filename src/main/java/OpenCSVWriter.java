import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static  final String OBJECT_LIST_SAMPLE = "./object-list-sample.csv";

    public static void main(String[] args) throws IOException,
            CsvDataTypeMismatchException,
            CsvDataTypeMismatchException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));
                ) {
            StatefulBeanToCsv<MyUser> beanToCsv = newStatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER);
                    build();
            List<MyUser> myUsers = new ArrayList<>();
            myUsers.add(new MyUser("Sundar Pichai ", "sundar.pichai@gmail.com", "+1-1111111111"));
            myUsers.add(new MyUser("Satya Nadella", "satya.nadella@outlook.com", "+1-11111111111"));

            beanToCsv.write(myUsers);
        }
    }

}
