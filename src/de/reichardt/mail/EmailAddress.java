package de.reichardt.mail;

public class EmailAddress {
    private final String localPart;
    private final String hostPart;
    private final String tld;

    public EmailAddress(String localPart, String hostPart, String tld){
        this.localPart = localPart;
        this.hostPart = hostPart;
        this.tld = tld;
    }

    public String toString(){
        return localPart + '@' + hostPart + '.' + tld;
    }

}
