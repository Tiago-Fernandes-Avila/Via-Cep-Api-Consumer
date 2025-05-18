import java.util.List;

public class SerializerApiInfo {

    public Cep serializeStringToObject(String cep){
       List<String> jsonInStringList = CepController.requestCepInfo();

       Cep objectCep = new Cep(jsonInStringList.get(0),jsonInStringList.get(1),jsonInStringList.get(2),jsonInStringList.get(3),jsonInStringList.get(4),jsonInStringList.get(5),jsonInStringList.get(6),jsonInStringList.get(7),jsonInStringList.get(8),jsonInStringList.get(9),jsonInStringList.get(10), jsonInStringList.get(11),jsonInStringList.get(12));
        return objectCep;
    } 

   

}
