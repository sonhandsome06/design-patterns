package com.sonph.adapter;

public class TestDemo {
    static class RequestAdapter {
        String specificRequest() {
            return "Adapter request";
        }
    }

    static class TargetRequest {

        public TargetRequest() {
        }

        String request() {
            return "Target request";
        }
    }

    static class Adapter extends TargetRequest {
        RequestAdapter requestAdapter;

        public Adapter(RequestAdapter requestAdapter) {
            super();
            this.requestAdapter = requestAdapter;
        }

        public Adapter() {
            super();
        }

        String request() {
            return this.requestAdapter.specificRequest();
        }
    }

    public static void main(String[] args) {
        TargetRequest targetRequest = new TargetRequest();
        System.out.println(targetRequest.request());

        Adapter adapter = new Adapter(new RequestAdapter());
        System.out.println(adapter.request());

        TargetRequest adapter1 = new Adapter();
        System.out.println(adapter1.request());
    }

}
