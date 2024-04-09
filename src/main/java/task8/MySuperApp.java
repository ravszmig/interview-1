package task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySuperApp {

    @Autowired
    private DataProvider hardDrive;
    
    @Autowired
    private DataProvider oracleData;

    public void run(){
        System.out.println(hardDrive.getData());
        System.out.println(oracleData.getData());
    }
}
