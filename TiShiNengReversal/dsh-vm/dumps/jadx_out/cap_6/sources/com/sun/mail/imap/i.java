package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i extends com.sun.mail.imap.g {
    private com.sun.mail.imap.g o;

    i(com.sun.mail.imap.g r2, com.sun.mail.imap.protocol.d r3, com.sun.mail.imap.protocol.e r4, java.lang.String r5) {
            r1 = this;
            javax.mail.Session r0 = r2.d()
            r1.<init>(r0)
            r1.o = r2
            r1.a = r3
            r1.b = r4
            r1.h = r5
            return
    }

    @Override // com.sun.mail.imap.g
    protected boolean A() throws javax.mail.FolderClosedException {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            boolean r0 = r0.A()
            return r0
    }

    @Override // com.sun.mail.imap.g
    public int getSize() throws javax.mail.MessagingException {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.a
            int r0 = r0.f
            return r0
    }

    public boolean isExpunged() {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            boolean r0 = r0.isExpunged()
            return r0
    }

    @Override // com.sun.mail.imap.g
    protected void n() throws javax.mail.MessageRemovedException {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            r0.n()
            return
    }

    @Override // com.sun.mail.imap.g
    protected int r() {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            int r0 = r0.r()
            return r0
    }

    @Override // com.sun.mail.imap.g
    public synchronized void setFlags(javax.mail.Flags r1, boolean r2) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            javax.mail.MethodNotSupportedException r1 = new javax.mail.MethodNotSupportedException     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "Cannot set flags on this nested message"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // com.sun.mail.imap.g
    protected java.lang.Object t() {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            java.lang.Object r0 = r0.t()
            return r0
    }

    @Override // com.sun.mail.imap.g
    protected com.sun.mail.imap.protocol.h v() throws com.sun.mail.iap.ProtocolException, javax.mail.FolderClosedException {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            com.sun.mail.imap.protocol.h r0 = r0.v()
            return r0
    }

    @Override // com.sun.mail.imap.g
    protected int w() {
            r1 = this;
            com.sun.mail.imap.g r0 = r1.o
            int r0 = r0.w()
            return r0
    }
}
