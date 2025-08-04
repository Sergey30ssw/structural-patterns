package proxy;

public class Main {
    public static void main(String[] args) {
        HttpService realService = new RealHttpService();
        HttpService cachingService = new CachingProxy(realService);

        long startTime = System.nanoTime();
        System.out.println(cachingService.get("https://example.com"));
        System.out.println("First request took: " + (System.nanoTime() - startTime) / 1_000_000 + "ms");

        startTime = System.nanoTime();
        System.out.println(cachingService.get("https://example.com"));
        System.out.println("Second request took: " + (System.nanoTime() - startTime) / 1_000_000 + "ms");
    }
}