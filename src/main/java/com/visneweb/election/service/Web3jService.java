package com.visneweb.election.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

/**
 * Sample service to demonstrate web3j bean being correctly injected.
 */
@Service
public class Web3jService {

    @Autowired
    private Web3j web3j;

    public String getClientVersion() throws IOException {
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        return web3ClientVersion.getWeb3ClientVersion();
    }
    
    public void test() {
    	System.out.println(web3j.ethGasPrice().getJsonrpc());
    }
}
