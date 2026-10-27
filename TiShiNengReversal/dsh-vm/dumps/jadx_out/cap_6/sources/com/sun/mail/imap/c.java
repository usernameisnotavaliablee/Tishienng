package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends com.sun.mail.imap.e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.c a;
        private final /* synthetic */ java.lang.String b;

        a(com.sun.mail.imap.c r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r2.b
                com.sun.mail.imap.protocol.m[] r3 = r3.k0(r0, r1)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.sun.mail.imap.e.u {
        final /* synthetic */ com.sun.mail.imap.c a;
        private final /* synthetic */ java.lang.String b;

        b(com.sun.mail.imap.c r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.sun.mail.imap.e.u
        public java.lang.Object a(com.sun.mail.imap.protocol.h r3) throws com.sun.mail.iap.ProtocolException {
                r2 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = r2.b
                com.sun.mail.imap.protocol.m[] r3 = r3.o0(r0, r1)
                return r3
        }
    }

    protected c(com.sun.mail.imap.k r3) {
            r2 = this;
            java.lang.String r0 = ""
            r1 = 65535(0xffff, float:9.1834E-41)
            r2.<init>(r0, r1, r3)
            r3 = 1
            r2.g = r3
            r3 = 2
            r2.c = r3
            return
    }

    @Override // com.sun.mail.imap.e
    public void appendMessages(javax.mail.Message[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "Cannot append to Default Folder"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.sun.mail.imap.e
    public boolean delete(boolean r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "Cannot delete Default Folder"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.sun.mail.imap.e
    public javax.mail.Message[] expunge() throws javax.mail.MessagingException {
            r2 = this;
            javax.mail.MethodNotSupportedException r0 = new javax.mail.MethodNotSupportedException
            java.lang.String r1 = "Cannot expunge Default Folder"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.sun.mail.imap.e
    public javax.mail.Folder getFolder(java.lang.String r4) throws javax.mail.MessagingException {
            r3 = this;
            com.sun.mail.imap.e r0 = new com.sun.mail.imap.e
            javax.mail.Store r1 = r3.store
            com.sun.mail.imap.k r1 = (com.sun.mail.imap.k) r1
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.<init>(r4, r2, r1)
            return r0
    }

    @Override // com.sun.mail.imap.e
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.sun.mail.imap.e
    public javax.mail.Folder getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.sun.mail.imap.e
    public boolean hasNewMessages() throws javax.mail.MessagingException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.sun.mail.imap.e
    public javax.mail.Folder[] list(java.lang.String r7) throws javax.mail.MessagingException {
            r6 = this;
            com.sun.mail.imap.c$a r0 = new com.sun.mail.imap.c$a
            r0.<init>(r6, r7)
            java.lang.Object r7 = r6.p(r0)
            com.sun.mail.imap.protocol.m[] r7 = (com.sun.mail.imap.protocol.m[]) r7
            r0 = 0
            if (r7 != 0) goto L11
            javax.mail.Folder[] r7 = new javax.mail.Folder[r0]
            return r7
        L11:
            int r1 = r7.length
            com.sun.mail.imap.e[] r2 = new com.sun.mail.imap.e[r1]
        L14:
            if (r0 < r1) goto L17
            return r2
        L17:
            com.sun.mail.imap.e r3 = new com.sun.mail.imap.e
            r4 = r7[r0]
            javax.mail.Store r5 = r6.store
            com.sun.mail.imap.k r5 = (com.sun.mail.imap.k) r5
            r3.<init>(r4, r5)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L14
    }

    @Override // com.sun.mail.imap.e
    public javax.mail.Folder[] listSubscribed(java.lang.String r7) throws javax.mail.MessagingException {
            r6 = this;
            com.sun.mail.imap.c$b r0 = new com.sun.mail.imap.c$b
            r0.<init>(r6, r7)
            java.lang.Object r7 = r6.p(r0)
            com.sun.mail.imap.protocol.m[] r7 = (com.sun.mail.imap.protocol.m[]) r7
            r0 = 0
            if (r7 != 0) goto L11
            javax.mail.Folder[] r7 = new javax.mail.Folder[r0]
            return r7
        L11:
            int r1 = r7.length
            com.sun.mail.imap.e[] r2 = new com.sun.mail.imap.e[r1]
        L14:
            if (r0 < r1) goto L17
            return r2
        L17:
            com.sun.mail.imap.e r3 = new com.sun.mail.imap.e
            r4 = r7[r0]
            javax.mail.Store r5 = r6.store
            com.sun.mail.imap.k r5 = (com.sun.mail.imap.k) r5
            r3.<init>(r4, r5)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L14
    }

    @Override // com.sun.mail.imap.e
    public boolean renameTo(javax.mail.Folder r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.MethodNotSupportedException r2 = new javax.mail.MethodNotSupportedException
            java.lang.String r0 = "Cannot rename Default Folder"
            r2.<init>(r0)
            throw r2
    }
}
