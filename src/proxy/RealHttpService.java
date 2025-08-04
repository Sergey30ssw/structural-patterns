package proxy;

public class RealHttpService implements HttpService {
    @Override
    public String get(String url) {
        try {
            Thread.sleep(1000); // Имитация сетевой задержки
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Response from " + url;
    }
}