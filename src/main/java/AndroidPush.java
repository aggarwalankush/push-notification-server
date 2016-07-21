import org.json.JSONObject;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AndroidPush {

    /**
     * Replace API_KEY with your API_KEY
     * Replace DEVICE_TOKEN with your DEVICE_TOKEN
     */
    private static String API_KEY = "YOUR_API_KEY";
    private static String DEVICE_TOKEN = "YOUR_DEVICE_TOKEN";

    public static void main(String[] args) throws Exception {
        // Prepare JSON containing the GCM message content. What to send and where to send.
        JSONObject jGcmData = new JSONObject();
        JSONObject jData = new JSONObject();
        jData.put("title", "My First Notification");
        jData.put("message", "Hello, I'm push notification");

        jGcmData.put("to", DEVICE_TOKEN);
        // What to send in GCM message.
        jGcmData.put("data", jData);

        // Create connection to send GCM Message request.
        URL url = new URL("https://gcm-http.googleapis.com/gcm/send");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "key=" + API_KEY);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);

        // Send GCM message content.
        OutputStream outputStream = conn.getOutputStream();
        outputStream.write(jGcmData.toString().getBytes());

        System.out.println(conn.getResponseCode());
        System.out.println(conn.getResponseMessage());
    }
}
