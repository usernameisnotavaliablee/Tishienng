package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class PasswordAuthentication {
    private java.lang.String password;
    private java.lang.String userName;

    public PasswordAuthentication(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.userName = r1
            r0.password = r2
            return
    }

    public java.lang.String getPassword() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }
}
