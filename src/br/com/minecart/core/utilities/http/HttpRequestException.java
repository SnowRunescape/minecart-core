package br.com.minecart.core.utilities.http;

public class HttpRequestException extends Exception {
    private HttpResponse response;

    public HttpRequestException(HttpResponse response) {
        this.response = response;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}
