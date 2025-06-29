package org.example;

public class MyService {
    private final ExternalApi  externalApi;
    public MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public  String FetchData(){
        return externalApi.getData();
    }
}
