package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SMTPSendFailedException extends javax.mail.SendFailedException {
    private static final long serialVersionUID = 8049122628728932894L;
    protected javax.mail.internet.InternetAddress addr;
    protected java.lang.String cmd;
    protected int rc;

    public SMTPSendFailedException(java.lang.String r7, int r8, java.lang.String r9, java.lang.Exception r10, javax.mail.Address[] r11, javax.mail.Address[] r12, javax.mail.Address[] r13) {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r0.cmd = r7
            r0.rc = r8
            return
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
