package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SMTPAddressFailedException extends javax.mail.SendFailedException {
    private static final long serialVersionUID = 804831199768630097L;
    protected javax.mail.internet.InternetAddress addr;
    protected java.lang.String cmd;
    protected int rc;

    public SMTPAddressFailedException(javax.mail.internet.InternetAddress r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r4)
            r0.addr = r1
            r0.cmd = r2
            r0.rc = r3
            return
    }

    public javax.mail.internet.InternetAddress getAddress() {
            r1 = this;
            javax.mail.internet.InternetAddress r0 = r1.addr
            return r0
    }

    public java.lang.String getCommand() {
            r1 = this;
            java.lang.String r0 = r1.cmd
            return r0
    }

    public int getReturnCode() {
            r1 = this;
            int r0 = r1.rc
            return r0
    }
}
