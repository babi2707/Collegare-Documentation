# Sistemas Inteligentes 
A aplicação foi concebida com a implementação de dois sistemas inteligentes para melhorar a experiência do usuário e auxilia-lo durante o uso da aplicação.

## Sistema de Recomendação 
A aplicação Collegare atua diretamente com usarios, fazendo com que um sistema de recomendação de serviços seja imprescindível para o lançamento da aplicação.
Essa funcionalidade baseia-se no histórico de busca e contratação do usuário, para fornecer resultados relevantes e recomentação de serviços de acordo com o perfil e necessidade de cada usuário.



``` java
import java.io.IOException;
import org.apache.http.client.fluent.*;
import org.apache.http.entity.ContentType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class App {
    // Handle making the request
    public static void sendRequest(String data) {
        // Replace with the scoring_uri of your service
        String uri = "<http://20.24.233.136/api/v1/service/collegare-service/swagger.json>";
        // If using authentication, replace with the auth key or token
        String key = "<X8ln4PlhC8fwisehmBQeoGTXLfdlwx3c>";
        try {
            // Create the request
            Content content = Request.Post(uri)
            .addHeader("Content-Type", "application/json")
            // Only needed if using authentication
            .addHeader("Authorization", "Bearer " + key)
            // Set the JSON data as the body
            .bodyString(data, ContentType.APPLICATION_JSON)
            // Make the request and display the response.
            .execute().returnContent();
            System.out.println(content);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // Create the data to send to the service
        JSONObject obj = new JSONObject();
        // In this case, it's an array of arrays
        JSONArray dataItems = new JSONArray();
        // Inner array has 10 elements
        JSONArray item1 = new JSONArray();
        item1.add(0.0199132141783263);
        item1.add(0.0506801187398187);
        item1.add(0.104808689473925);
        item1.add(0.0700725447072635);
        item1.add(-0.0359677812752396);
        item1.add(-0.0266789028311707);
        item1.add(-0.0249926566315915);
        item1.add(-0.00259226199818282);
        item1.add(0.00371173823343597);
        item1.add(0.0403433716478807);
        // Add the first set of data to be scored
        dataItems.add(item1);
        // Create and add the second set
        JSONArray item2 = new JSONArray();
        item2.add(-0.0127796318808497);
        item2.add(-0.044641636506989);
        item2.add(0.0606183944448076);
        item2.add(0.0528581912385822);
        item2.add(0.0479653430750293);
        item2.add(0.0293746718291555);
        item2.add(-0.0176293810234174);
        item2.add(0.0343088588777263);
        item2.add(0.0702112981933102);
        item2.add(0.00720651632920303);
        dataItems.add(item2);
        obj.put("data", dataItems);

        // Make the request using the JSON document string
        sendRequest(obj.toJSONString());
    }
}

```

## ChatBot
A concepção do projeto também conta com um sistema de atendimento automático para que usuários possam tirar duvidas e interagir com a plataforma de forma mais humanizada.
O chatBot conta com a recomendação de categorias de serviços de acordo com as peguntas do usuário e responde possíveis duvidas acerca do funcionamento da plataforma Collegare.
