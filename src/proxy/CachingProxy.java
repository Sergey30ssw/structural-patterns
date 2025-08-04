package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements HttpService {
    private final HttpService realService;
    private final Map<String, String> cache = new HashMap<>();

    public CachingProxy(HttpService realService) {
        this.realService = realService;
    }

    @Override
    public String get(String url) {
        if (cache.containsKey(url)) {
            System.out.println("Returning cached response for " + url);
            return cache.get(url);
        }
        String response = realService.get(url);
        cache.put(url, response);
        return response;
    }
}