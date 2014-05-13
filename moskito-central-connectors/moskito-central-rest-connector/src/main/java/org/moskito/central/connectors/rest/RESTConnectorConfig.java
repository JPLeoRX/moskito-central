package org.moskito.central.connectors.rest;

import org.configureme.annotations.ConfigureMe;

/**
 * REST config bean.
 * 
 * @author dagafonov
 * 
 */
@ConfigureMe(allfields = true)
public class RESTConnectorConfig {

	/**
	 * HTTP server host.
	 */
	private String host;

	/**
	 * HTTP server port.
	 */
	private int port;

	/**
	 * HTTP server path.
	 */
	private String resourcePath;

    /**
     * Is HTTP basic auth enabled.
     */
    private boolean basicAuthEnabled;

    /**
     * Basic auth login.
     */
    private String login;

    /**
     * Basic auth password.
     */
    private String password;

    /**
     * If true: self-signed certificates are trusted even if they are not in the truststore.
     */
    private boolean trustSelfSigned;

    /**
     * Is host verification (URL & certificate's value) enabled.
     */
    private boolean hostVerificationEnabled;

    /**
     * Path to TrustStore file.
     */
    private String trustStoreFilePath;

    /**
     * TrustStore password.
     */
    private String trustStorePassword;


	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

    public boolean isBasicAuthEnabled() {
        return basicAuthEnabled;
    }

    public void setBasicAuthEnabled(boolean basicAuthEnabled) {
        this.basicAuthEnabled = basicAuthEnabled;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTrustSelfSigned() {
        return trustSelfSigned;
    }

    public void setTrustSelfSigned(boolean trustSelfSigned) {
        this.trustSelfSigned = trustSelfSigned;
    }

    public boolean isHostVerificationEnabled() {
        return hostVerificationEnabled;
    }

    public void setHostVerificationEnabled(boolean hostVerificationEnabled) {
        this.hostVerificationEnabled = hostVerificationEnabled;
    }

    public String getTrustStoreFilePath() {
        return trustStoreFilePath;
    }

    public void setTrustStoreFilePath(String trustStoreFilePath) {
        this.trustStoreFilePath = trustStoreFilePath;
    }

    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }

    @Override
    public String toString() {
        return "RESTConnectorConfig{" +
                "host='" + host + '\'' +
                ",  port=" + port +
                ", resourcePath='" + resourcePath + '\'' +
                ",  basicAuthEnabled=" + basicAuthEnabled +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ",  trustSelfSigned=" + trustSelfSigned +
                ",  hostVerificationEnabled=" + hostVerificationEnabled +
                ", trustStoreFilePath='" + trustStoreFilePath + '\'' +
                ", trustStorePassword='" + trustStorePassword + '\'' +
                '}';
    }

}
