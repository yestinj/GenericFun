package org.example;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<DummyEnum, Service<? extends Response, ? extends Request>> services
            = new EnumMap<>(DummyEnum.class);

    static {
        services.put(DummyEnum.DUMMY_1, new DummyService());
    }

    private static List<? extends Request> generateRequest() {
        return List.of(new DummyRequest());
    }

    public static void main(String[] args) {
        List<? extends Request> requests = generateRequest();
        requests.forEach(request -> services.get(request.getDummyEnum()).insertRequest(request));
    }
}
