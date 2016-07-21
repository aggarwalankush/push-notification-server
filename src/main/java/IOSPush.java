import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

public class IOSPush {
    /**
     * Replace DEVICE_TOKEN with your DEVICE_TOKEN
     * Replace PATH_TO_P12_CERT with your YOUR_P12_CERTIFICATE_PATH
     * Replace CERT_PASSWORD with your YOUR_P12_CERTIFICATE_PASSWORD
     */
    private static String DEVICE_TOKEN = "YOUR_DEVICE_TOKEN";
    private static String PATH_TO_P12_CERT = "YOUR_P12_CERTIFICATE_PATH";
    private static String CERT_PASSWORD = "YOUR_P12_CERTIFICATE_PASSWORD";

    public static void main(String[] args) {
        ApnsService service =
                APNS.newService()
                        .withCert(PATH_TO_P12_CERT, CERT_PASSWORD)
                        .withSandboxDestination()
                        .build();

        String payload = APNS.newPayload()
                .alertBody("My first notification\nHello, I'm push notification")
                .sound("default")
                .build();

        service.push(DEVICE_TOKEN, payload);
        System.out.println("The message has been hopefully sent...");
    }
}
