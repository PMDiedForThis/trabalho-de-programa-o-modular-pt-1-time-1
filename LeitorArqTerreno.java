package LeitorArqTerreno;

import InputTerreno.InputTerreno;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;


public class LeitorArqTerreno{

    public InputTerreno lerArqInput(File ArquivoInput){
        InputTerreno input;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            input = objectMapper.readValue(ArquivoInput, InputTerreno.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return input;
    }
}
