package com.design.patterns.estrutural.proxy;

public class ProxyInternet implements Internet{

    private final Internet realInternet;
    private static final String[] siteRestrito = {"blocked.com", "restricted.com"};

    public ProxyInternet(){
        this.realInternet = new RealInternet();
    }

    @Override
    public void conectar(String serverHost) throws Exception {
        var restrito = false;

        for (String site : siteRestrito) {
            if (serverHost.contains(site)){
                restrito = true;
                break;
            }
        }
        if (restrito) {
            throw new Exception("Acesso negado a " + serverHost);
        } else {
            realInternet.conectar(serverHost);
        }
    }
}
