package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Authenticator {
    private int requestingPort;
    private java.lang.String requestingPrompt;
    private java.lang.String requestingProtocol;
    private java.net.InetAddress requestingSite;
    private java.lang.String requestingUserName;

    public Authenticator() {
            r0 = this;
            r0.<init>()
            return
    }

    private void reset() {
            r2 = this;
            r0 = 0
            r2.requestingSite = r0
            r1 = -1
            r2.requestingPort = r1
            r2.requestingProtocol = r0
            r2.requestingPrompt = r0
            r2.requestingUserName = r0
            return
    }

    protected final java.lang.String getDefaultUserName() {
            r1 = this;
            java.lang.String r0 = r1.requestingUserName
            return r0
    }

    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final int getRequestingPort() {
            r1 = this;
            int r0 = r1.requestingPort
            return r0
    }

    protected final java.lang.String getRequestingPrompt() {
            r1 = this;
            java.lang.String r0 = r1.requestingPrompt
            return r0
    }

    protected final java.lang.String getRequestingProtocol() {
            r1 = this;
            java.lang.String r0 = r1.requestingProtocol
            return r0
    }

    protected final java.net.InetAddress getRequestingSite() {
            r1 = this;
            java.net.InetAddress r0 = r1.requestingSite
            return r0
    }

    final javax.mail.PasswordAuthentication requestPasswordAuthentication(java.net.InetAddress r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.reset()
            r0.requestingSite = r1
            r0.requestingPort = r2
            r0.requestingProtocol = r3
            r0.requestingPrompt = r4
            r0.requestingUserName = r5
            javax.mail.PasswordAuthentication r1 = r0.getPasswordAuthentication()
            return r1
    }
}
