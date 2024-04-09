package task8;

import org.springframework.stereotype.Service;

@Service
public class OracleDataProvider implements DataProvider {
   
    @Override
    public String getData() {
        return "Data from Oracle";
    }
}
