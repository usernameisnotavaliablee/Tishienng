package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements java.lang.Cloneable {
    private java.lang.String a;
    private com.sun.mail.imap.n b;

    public a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            com.sun.mail.imap.n r1 = new com.sun.mail.imap.n
            r1.<init>()
            r0.b = r1
            return
    }

    public a(java.lang.String r1, com.sun.mail.imap.n r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.sun.mail.imap.n b() {
            r1 = this;
            com.sun.mail.imap.n r0 = r1.b
            return r0
    }

    public void c(com.sun.mail.imap.n r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            java.lang.Object r0 = super.clone()
            com.sun.mail.imap.a r0 = (com.sun.mail.imap.a) r0
            com.sun.mail.imap.n r1 = r2.b
            java.lang.Object r1 = r1.clone()
            com.sun.mail.imap.n r1 = (com.sun.mail.imap.n) r1
            r0.b = r1
            return r0
    }
}
