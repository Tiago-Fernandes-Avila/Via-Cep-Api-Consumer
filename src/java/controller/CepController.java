import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CepController {
    private static final String redColor = "/u001B[31m";
    
    //objetivo: será para fazer uma request http na api viacep com um argumento sendo um cep e retornando para gente um objeto de atributos do cep 
    
    
    public static List<String> requestCepInfo(){
        URI uri = URI.create("https://viacep.com.br/ws/45920000/json");
        HttpClient client = HttpClient.newBuilder().build();

        try{    

            HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .GET()
            .build();

            HttpResponse <String> response = client.send(request, BodyHandlers.ofString());

        
            List<String> listJson = new ArrayList<>(List.of(response.body().split(",")));

            return listJson;

        }
        catch (IOException urlEx) {
            System.out.println(redColor + urlEx.getMessage()+ " Houve um erro na sintaxe da URI/URL OU erro de Input e Output");
        }
        catch (InterruptedException e){
           System.out.println( redColor + e.getMessage() + "erro no envio da request!");  
        }
        return null ;
        

   

    }


    
}
