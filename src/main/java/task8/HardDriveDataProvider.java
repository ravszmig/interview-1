package task8;

import org.springframework.stereotype.Service;

@Service
public class HardDriveDataProvider implements DataProvider {
   
    @Override
    public String getData() {
        return "Data from hard drive";
    }
}
