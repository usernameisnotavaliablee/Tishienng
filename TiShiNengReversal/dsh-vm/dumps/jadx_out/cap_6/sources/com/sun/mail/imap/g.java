package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g extends javax.mail.internet.MimeMessage {
    private static java.lang.String n = "ENVELOPE INTERNALDATE RFC822.SIZE";
    protected com.sun.mail.imap.protocol.d a;
    protected com.sun.mail.imap.protocol.e b;
    private java.util.Date c;
    private int d;
    private boolean e;
    private int f;
    private long g;
    protected java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;
    private boolean l;
    private java.util.Hashtable m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.sun.mail.imap.o.a {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private java.lang.String[] g;

        public a(javax.mail.FetchProfile r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r2.b = r0
                r2.c = r0
                r2.d = r0
                r2.e = r0
                r2.f = r0
                r0 = 0
                r2.g = r0
                javax.mail.FetchProfile$Item r0 = javax.mail.FetchProfile.Item.ENVELOPE
                boolean r0 = r3.contains(r0)
                r1 = 1
                if (r0 == 0) goto L1e
                r2.a = r1
            L1e:
                javax.mail.FetchProfile$Item r0 = javax.mail.FetchProfile.Item.FLAGS
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L28
                r2.b = r1
            L28:
                javax.mail.FetchProfile$Item r0 = javax.mail.FetchProfile.Item.CONTENT_INFO
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L32
                r2.c = r1
            L32:
                javax.mail.UIDFolder$FetchProfileItem r0 = javax.mail.UIDFolder.FetchProfileItem.UID
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L3c
                r2.d = r1
            L3c:
                com.sun.mail.imap.e$t r0 = com.sun.mail.imap.e.t.a
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L46
                r2.e = r1
            L46:
                com.sun.mail.imap.e$t r0 = com.sun.mail.imap.e.t.b
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L50
                r2.f = r1
            L50:
                java.lang.String[] r3 = r3.getHeaderNames()
                r2.g = r3
                return
        }

        @Override // com.sun.mail.imap.o.a
        public boolean a(com.sun.mail.imap.g r7) {
                r6 = this;
                boolean r0 = r6.a
                r1 = 1
                if (r0 == 0) goto Lc
                com.sun.mail.imap.protocol.e r0 = com.sun.mail.imap.g.g(r7)
                if (r0 != 0) goto Lc
                return r1
            Lc:
                boolean r0 = r6.b
                if (r0 == 0) goto L17
                javax.mail.Flags r0 = com.sun.mail.imap.g.h(r7)
                if (r0 != 0) goto L17
                return r1
            L17:
                boolean r0 = r6.c
                if (r0 == 0) goto L22
                com.sun.mail.imap.protocol.d r0 = com.sun.mail.imap.g.i(r7)
                if (r0 != 0) goto L22
                return r1
            L22:
                boolean r0 = r6.d
                if (r0 == 0) goto L31
                long r2 = r7.x()
                r4 = -1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L31
                return r1
            L31:
                boolean r0 = r6.e
                if (r0 == 0) goto L3c
                boolean r0 = com.sun.mail.imap.g.j(r7)
                if (r0 != 0) goto L3c
                return r1
            L3c:
                boolean r0 = r6.f
                if (r0 == 0) goto L48
                int r0 = com.sun.mail.imap.g.k(r7)
                r2 = -1
                if (r0 != r2) goto L48
                return r1
            L48:
                r0 = 0
                r2 = 0
            L4a:
                java.lang.String[] r3 = r6.g
                int r4 = r3.length
                if (r2 < r4) goto L50
                return r0
            L50:
                r3 = r3[r2]
                boolean r3 = com.sun.mail.imap.g.l(r7, r3)
                if (r3 != 0) goto L59
                return r1
            L59:
                int r2 = r2 + 1
                goto L4a
        }
    }

    static {
            return
    }

    protected g(com.sun.mail.imap.e r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.d = r1
            r1 = -1
            r0.g = r1
            r1 = 0
            r0.l = r1
            r0.f = r3
            r1 = 0
            r0.flags = r1
            return
    }

    protected g(javax.mail.Session r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = -1
            r2.d = r3
            r0 = -1
            r2.g = r0
            r3 = 0
            r2.l = r3
            return
    }

    private synchronized void B() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            com.sun.mail.imap.protocol.d r0 = r4.a     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.lang.Object r0 = r4.t()     // Catch: java.lang.Throwable -> L4e
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4e
            com.sun.mail.imap.protocol.h r1 = r4.v()     // Catch: java.lang.Throwable -> L22 com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            r4.n()     // Catch: java.lang.Throwable -> L22 com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            int r2 = r4.w()     // Catch: java.lang.Throwable -> L22 com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            com.sun.mail.imap.protocol.d r1 = r1.R(r2)     // Catch: java.lang.Throwable -> L22 com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            r4.a = r1     // Catch: java.lang.Throwable -> L22 com.sun.mail.iap.ProtocolException -> L2f com.sun.mail.iap.ConnectionException -> L31
            if (r1 == 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            return
        L22:
            r1 = move-exception
            goto L4c
        L24:
            r4.q()     // Catch: java.lang.Throwable -> L22
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "Unable to load BODYSTRUCTURE"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L2f:
            r1 = move-exception
            goto L33
        L31:
            r1 = move-exception
            goto L40
        L33:
            r4.q()     // Catch: java.lang.Throwable -> L22
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L40:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L22
            javax.mail.Folder r3 = r4.folder     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    private synchronized void C() throws javax.mail.MessagingException {
            r11 = this;
            monitor-enter(r11)
            com.sun.mail.imap.protocol.e r0 = r11.b     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L7
            monitor-exit(r11)
            return
        L7:
            java.lang.Object r0 = r11.t()     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3c
            com.sun.mail.imap.protocol.h r1 = r11.v()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r11.n()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r2 = r11.w()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            java.lang.String r3 = com.sun.mail.imap.g.n     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            com.sun.mail.iap.g[] r3 = r1.J(r2, r3)     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r4 = 0
            r5 = 0
        L1f:
            int r6 = r3.length     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r5 < r6) goto L45
            r1.j(r3)     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r2 = r3.length     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r2 = r2 + (-1)
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r1.h(r2)     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            com.sun.mail.imap.protocol.e r0 = r11.b     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L34
            monitor-exit(r11)
            return
        L34:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "Failed to load IMAP envelope"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            goto La7
        L3f:
            r1 = move-exception
            goto La5
        L41:
            r1 = move-exception
            goto L8c
        L43:
            r1 = move-exception
            goto L99
        L45:
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r6 == 0) goto L89
            boolean r7 = r6 instanceof com.sun.mail.imap.protocol.f     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r7 == 0) goto L89
            com.sun.mail.imap.protocol.f r6 = (com.sun.mail.imap.protocol.f) r6     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r6 = r6.E()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r6 == r2) goto L56
            goto L89
        L56:
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            com.sun.mail.imap.protocol.f r6 = (com.sun.mail.imap.protocol.f) r6     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r7 = r6.L()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r8 = 0
        L5f:
            if (r8 < r7) goto L62
            goto L89
        L62:
            com.sun.mail.imap.protocol.l r9 = r6.I(r8)     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            boolean r10 = r9 instanceof com.sun.mail.imap.protocol.e     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r10 == 0) goto L6f
            com.sun.mail.imap.protocol.e r9 = (com.sun.mail.imap.protocol.e) r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r11.b = r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            goto L86
        L6f:
            boolean r10 = r9 instanceof com.sun.mail.imap.protocol.k     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r10 == 0) goto L7c
            com.sun.mail.imap.protocol.k r9 = (com.sun.mail.imap.protocol.k) r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            java.util.Date r9 = r9.b()     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r11.c = r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            goto L86
        L7c:
            boolean r10 = r9 instanceof com.sun.mail.imap.protocol.r     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            if (r10 == 0) goto L86
            com.sun.mail.imap.protocol.r r9 = (com.sun.mail.imap.protocol.r) r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            int r9 = r9.b     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
            r11.d = r9     // Catch: java.lang.Throwable -> L3f com.sun.mail.iap.ProtocolException -> L41 com.sun.mail.iap.ConnectionException -> L43
        L86:
            int r8 = r8 + 1
            goto L5f
        L89:
            int r5 = r5 + 1
            goto L1f
        L8c:
            r11.q()     // Catch: java.lang.Throwable -> L3f
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3f
            throw r2     // Catch: java.lang.Throwable -> L3f
        L99:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L3f
            javax.mail.Folder r3 = r11.folder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3f
            throw r2     // Catch: java.lang.Throwable -> L3f
        La5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3c
        La7:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3c
            throw r0
    }

    private synchronized void D() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            javax.mail.Flags r0 = r4.flags     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.lang.Object r0 = r4.t()     // Catch: java.lang.Throwable -> L41
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L41
            com.sun.mail.imap.protocol.h r1 = r4.v()     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            r4.n()     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            int r2 = r4.w()     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            javax.mail.Flags r1 = r1.S(r2)     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            r4.flags = r1     // Catch: java.lang.Throwable -> L20 com.sun.mail.iap.ProtocolException -> L22 com.sun.mail.iap.ConnectionException -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L20:
            r1 = move-exception
            goto L3f
        L22:
            r1 = move-exception
            goto L26
        L24:
            r1 = move-exception
            goto L33
        L26:
            r4.q()     // Catch: java.lang.Throwable -> L20
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L33:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L20
            javax.mail.Folder r3 = r4.folder     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            throw r0
    }

    private synchronized void E() throws javax.mail.MessagingException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.l     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.lang.Object r0 = r4.t()     // Catch: java.lang.Throwable -> L55
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
            com.sun.mail.imap.protocol.h r1 = r4.v()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            r4.n()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            boolean r2 = r1.i0()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            if (r2 == 0) goto L34
            int r2 = r4.w()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            java.lang.String r3 = "HEADER"
            java.lang.String r3 = r4.K(r3)     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            com.sun.mail.imap.protocol.c r1 = r1.u0(r2, r3)     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            if (r1 == 0) goto L45
            java.io.ByteArrayInputStream r1 = r1.b()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            goto L46
        L2e:
            r1 = move-exception
            goto L78
        L30:
            r1 = move-exception
            goto L5f
        L32:
            r1 = move-exception
            goto L6c
        L34:
            int r2 = r4.w()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            java.lang.String r3 = "HEADER"
            com.sun.mail.imap.protocol.q r1 = r1.T(r2, r3)     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            if (r1 == 0) goto L45
            java.io.ByteArrayInputStream r1 = r1.b()     // Catch: java.lang.Throwable -> L2e com.sun.mail.iap.ProtocolException -> L30 com.sun.mail.iap.ConnectionException -> L32
            goto L46
        L45:
            r1 = 0
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L57
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.headers = r0     // Catch: java.lang.Throwable -> L55
            r0 = 1
            r4.l = r0     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return
        L55:
            r0 = move-exception
            goto L7a
        L57:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "Cannot load header"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L5f:
            r4.q()     // Catch: java.lang.Throwable -> L2e
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L6c:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L2e
            javax.mail.Folder r3 = r4.folder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L55
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            throw r0
    }

    private synchronized void F(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Hashtable r0 = r2.m     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> Le
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r2.m = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L1d
        L10:
            java.util.Hashtable r0 = r2.m     // Catch: java.lang.Throwable -> Le
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r3.toUpperCase(r1)     // Catch: java.lang.Throwable -> Le
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    private synchronized void G(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.l = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    private java.lang.String K(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.h
            if (r0 != 0) goto L5
            return r3
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private com.sun.mail.imap.protocol.d a() {
            r1 = this;
            com.sun.mail.imap.protocol.d r0 = r1.a
            return r0
    }

    private com.sun.mail.imap.protocol.e b() {
            r1 = this;
            com.sun.mail.imap.protocol.e r0 = r1.b
            return r0
    }

    private javax.mail.Flags c() {
            r1 = this;
            javax.mail.Flags r0 = r1.flags
            return r0
    }

    private javax.mail.internet.InternetAddress[] f(javax.mail.internet.InternetAddress[] r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.Object r1 = r1.clone()
            javax.mail.internet.InternetAddress[] r1 = (javax.mail.internet.InternetAddress[]) r1
            return r1
    }

    static /* synthetic */ com.sun.mail.imap.protocol.e g(com.sun.mail.imap.g r0) {
            com.sun.mail.imap.protocol.e r0 = r0.b()
            return r0
    }

    static /* synthetic */ javax.mail.Flags h(com.sun.mail.imap.g r0) {
            javax.mail.Flags r0 = r0.c()
            return r0
    }

    static /* synthetic */ com.sun.mail.imap.protocol.d i(com.sun.mail.imap.g r0) {
            com.sun.mail.imap.protocol.d r0 = r0.a()
            return r0
    }

    static /* synthetic */ boolean j(com.sun.mail.imap.g r0) {
            boolean r0 = r0.m()
            return r0
    }

    static /* synthetic */ int k(com.sun.mail.imap.g r0) {
            int r0 = r0.d
            return r0
    }

    static /* synthetic */ boolean l(com.sun.mail.imap.g r0, java.lang.String r1) {
            boolean r0 = r0.z(r1)
            return r0
    }

    private synchronized boolean m() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    private static java.lang.String o(com.sun.mail.imap.protocol.h r3, java.lang.String[] r4) {
            boolean r0 = r3.i0()
            if (r0 == 0) goto Le
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "BODY.PEEK[HEADER.FIELDS ("
            r0.<init>(r1)
            goto L15
        Le:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "RFC822.HEADER.LINES ("
            r0.<init>(r1)
        L15:
            r1 = 0
        L16:
            int r2 = r4.length
            if (r1 < r2) goto L2f
            boolean r3 = r3.i0()
            if (r3 == 0) goto L25
            java.lang.String r3 = ")]"
            r0.append(r3)
            goto L2a
        L25:
            java.lang.String r3 = ")"
            r0.append(r3)
        L2a:
            java.lang.String r3 = r0.toString()
            return r3
        L2f:
            if (r1 <= 0) goto L36
            java.lang.String r2 = " "
            r0.append(r2)
        L36:
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L16
    }

    static void p(com.sun.mail.imap.e r17, javax.mail.Message[] r18, javax.mail.FetchProfile r19) throws javax.mail.MessagingException {
            r1 = r17
            r0 = r19
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            javax.mail.FetchProfile$Item r3 = javax.mail.FetchProfile.Item.ENVELOPE
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L18
            java.lang.String r3 = com.sun.mail.imap.g.n
            r2.append(r3)
            r3 = 0
            goto L19
        L18:
            r3 = 1
        L19:
            javax.mail.FetchProfile$Item r6 = javax.mail.FetchProfile.Item.FLAGS
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L2c
            if (r3 == 0) goto L26
            java.lang.String r3 = "FLAGS"
            goto L28
        L26:
            java.lang.String r3 = " FLAGS"
        L28:
            r2.append(r3)
            r3 = 0
        L2c:
            javax.mail.FetchProfile$Item r6 = javax.mail.FetchProfile.Item.CONTENT_INFO
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L3f
            if (r3 == 0) goto L39
            java.lang.String r3 = "BODYSTRUCTURE"
            goto L3b
        L39:
            java.lang.String r3 = " BODYSTRUCTURE"
        L3b:
            r2.append(r3)
            r3 = 0
        L3f:
            javax.mail.UIDFolder$FetchProfileItem r6 = javax.mail.UIDFolder.FetchProfileItem.UID
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L52
            if (r3 == 0) goto L4c
            java.lang.String r3 = "UID"
            goto L4e
        L4c:
            java.lang.String r3 = " UID"
        L4e:
            r2.append(r3)
            r3 = 0
        L52:
            com.sun.mail.imap.e$t r6 = com.sun.mail.imap.e.t.a
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L7a
            com.sun.mail.imap.protocol.h r6 = r1.j
            boolean r6 = r6.i0()
            if (r6 == 0) goto L6d
            if (r3 == 0) goto L67
            java.lang.String r3 = "BODY.PEEK[HEADER]"
            goto L69
        L67:
            java.lang.String r3 = " BODY.PEEK[HEADER]"
        L69:
            r2.append(r3)
            goto L77
        L6d:
            if (r3 == 0) goto L72
            java.lang.String r3 = "RFC822.HEADER"
            goto L74
        L72:
            java.lang.String r3 = " RFC822.HEADER"
        L74:
            r2.append(r3)
        L77:
            r3 = 0
            r6 = 1
            goto L7b
        L7a:
            r6 = 0
        L7b:
            com.sun.mail.imap.e$t r7 = com.sun.mail.imap.e.t.b
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L8e
            if (r3 == 0) goto L88
            java.lang.String r3 = "RFC822.SIZE"
            goto L8a
        L88:
            java.lang.String r3 = " RFC822.SIZE"
        L8a:
            r2.append(r3)
            r3 = 0
        L8e:
            r7 = 0
            if (r6 != 0) goto La9
            java.lang.String[] r8 = r0.getHeaderNames()
            int r9 = r8.length
            if (r9 <= 0) goto Laa
            if (r3 != 0) goto L9f
            java.lang.String r3 = " "
            r2.append(r3)
        L9f:
            com.sun.mail.imap.protocol.h r3 = r1.j
            java.lang.String r3 = o(r3, r8)
            r2.append(r3)
            goto Laa
        La9:
            r8 = r7
        Laa:
            com.sun.mail.imap.g$a r3 = new com.sun.mail.imap.g$a
            r3.<init>(r0)
            java.lang.Object r9 = r1.l
            monitor-enter(r9)
            r10 = r18
            com.sun.mail.imap.protocol.o[] r3 = com.sun.mail.imap.o.a(r10, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r3 != 0) goto Lbf
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbc
            return
        Lbc:
            r0 = move-exception
            goto L212
        Lbf:
            java.util.Vector r10 = new java.util.Vector     // Catch: java.lang.Throwable -> Lbc
            r10.<init>()     // Catch: java.lang.Throwable -> Lbc
            com.sun.mail.imap.protocol.h r11 = r1.j     // Catch: java.lang.Throwable -> Lbc com.sun.mail.iap.ProtocolException -> Lcf com.sun.mail.iap.CommandFailedException -> Ld1 com.sun.mail.iap.ConnectionException -> Ld3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbc com.sun.mail.iap.ProtocolException -> Lcf com.sun.mail.iap.CommandFailedException -> Ld1 com.sun.mail.iap.ConnectionException -> Ld3
            com.sun.mail.iap.g[] r7 = r11.L(r3, r2)     // Catch: java.lang.Throwable -> Lbc com.sun.mail.iap.ProtocolException -> Lcf com.sun.mail.iap.CommandFailedException -> Ld1 com.sun.mail.iap.ConnectionException -> Ld3
            goto Le0
        Lcf:
            r0 = move-exception
            goto Ld6
        Ld1:
            goto Le0
        Ld3:
            r0 = move-exception
            goto L208
        Ld6:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lbc
            throw r1     // Catch: java.lang.Throwable -> Lbc
        Le0:
            if (r7 != 0) goto Le4
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbc
            goto Lf7
        Le4:
            r2 = 0
        Le5:
            int r3 = r7.length     // Catch: java.lang.Throwable -> Lbc
            if (r2 < r3) goto Lf8
            int r0 = r10.size()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lf6
            com.sun.mail.iap.g[] r0 = new com.sun.mail.iap.g[r0]     // Catch: java.lang.Throwable -> Lbc
            r10.copyInto(r0)     // Catch: java.lang.Throwable -> Lbc
            r1.F(r0)     // Catch: java.lang.Throwable -> Lbc
        Lf6:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbc
        Lf7:
            return
        Lf8:
            r3 = r7[r2]     // Catch: java.lang.Throwable -> Lbc
            if (r3 != 0) goto Lfd
            goto L11c
        Lfd:
            boolean r11 = r3 instanceof com.sun.mail.imap.protocol.f     // Catch: java.lang.Throwable -> Lbc
            if (r11 != 0) goto L105
            r10.addElement(r3)     // Catch: java.lang.Throwable -> Lbc
            goto L11c
        L105:
            com.sun.mail.imap.protocol.f r3 = (com.sun.mail.imap.protocol.f) r3     // Catch: java.lang.Throwable -> Lbc
            int r11 = r3.E()     // Catch: java.lang.Throwable -> Lbc
            com.sun.mail.imap.g r11 = r1.z(r11)     // Catch: java.lang.Throwable -> Lbc
            int r12 = r3.L()     // Catch: java.lang.Throwable -> Lbc
            r13 = 0
            r14 = 0
        L115:
            if (r13 < r12) goto L11f
            if (r14 == 0) goto L11c
            r10.addElement(r3)     // Catch: java.lang.Throwable -> Lbc
        L11c:
            int r2 = r2 + 1
            goto Le5
        L11f:
            com.sun.mail.imap.protocol.l r15 = r3.I(r13)     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r15 instanceof javax.mail.Flags     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L145
            javax.mail.FetchProfile$Item r5 = javax.mail.FetchProfile.Item.FLAGS     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L13d
            if (r11 != 0) goto L132
            goto L13d
        L132:
            javax.mail.Flags r15 = (javax.mail.Flags) r15     // Catch: java.lang.Throwable -> Lbc
            r11.flags = r15     // Catch: java.lang.Throwable -> Lbc
        L136:
            r18 = r2
            r16 = r3
        L13a:
            r2 = 1
            goto L1f8
        L13d:
            r18 = r2
            r16 = r3
            r2 = 1
            r14 = 1
            goto L1f8
        L145:
            boolean r5 = r15 instanceof com.sun.mail.imap.protocol.e     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L14e
            com.sun.mail.imap.protocol.e r15 = (com.sun.mail.imap.protocol.e) r15     // Catch: java.lang.Throwable -> Lbc
            r11.b = r15     // Catch: java.lang.Throwable -> Lbc
            goto L136
        L14e:
            boolean r5 = r15 instanceof com.sun.mail.imap.protocol.k     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L15b
            com.sun.mail.imap.protocol.k r15 = (com.sun.mail.imap.protocol.k) r15     // Catch: java.lang.Throwable -> Lbc
            java.util.Date r5 = r15.b()     // Catch: java.lang.Throwable -> Lbc
            r11.c = r5     // Catch: java.lang.Throwable -> Lbc
            goto L136
        L15b:
            boolean r5 = r15 instanceof com.sun.mail.imap.protocol.r     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L166
            com.sun.mail.imap.protocol.r r15 = (com.sun.mail.imap.protocol.r) r15     // Catch: java.lang.Throwable -> Lbc
            int r5 = r15.b     // Catch: java.lang.Throwable -> Lbc
            r11.d = r5     // Catch: java.lang.Throwable -> Lbc
            goto L136
        L166:
            boolean r5 = r15 instanceof com.sun.mail.imap.protocol.d     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L16f
            com.sun.mail.imap.protocol.d r15 = (com.sun.mail.imap.protocol.d) r15     // Catch: java.lang.Throwable -> Lbc
            r11.a = r15     // Catch: java.lang.Throwable -> Lbc
            goto L136
        L16f:
            boolean r5 = r15 instanceof com.sun.mail.imap.protocol.v     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L195
            com.sun.mail.imap.protocol.v r15 = (com.sun.mail.imap.protocol.v) r15     // Catch: java.lang.Throwable -> Lbc
            long r4 = r15.b     // Catch: java.lang.Throwable -> Lbc
            r11.g = r4     // Catch: java.lang.Throwable -> Lbc
            java.util.Hashtable r4 = r1.m     // Catch: java.lang.Throwable -> Lbc
            if (r4 != 0) goto L184
            java.util.Hashtable r4 = new java.util.Hashtable     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            r1.m = r4     // Catch: java.lang.Throwable -> Lbc
        L184:
            java.util.Hashtable r4 = r1.m     // Catch: java.lang.Throwable -> Lbc
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> Lbc
            r18 = r2
            r16 = r3
            long r2 = r15.b     // Catch: java.lang.Throwable -> Lbc
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r4.put(r5, r11)     // Catch: java.lang.Throwable -> Lbc
            goto L13a
        L195:
            r18 = r2
            r16 = r3
            boolean r2 = r15 instanceof com.sun.mail.imap.protocol.q     // Catch: java.lang.Throwable -> Lbc
            if (r2 != 0) goto L1a1
            boolean r2 = r15 instanceof com.sun.mail.imap.protocol.c     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L13a
        L1a1:
            boolean r2 = r15 instanceof com.sun.mail.imap.protocol.q     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L1ac
            com.sun.mail.imap.protocol.q r15 = (com.sun.mail.imap.protocol.q) r15     // Catch: java.lang.Throwable -> Lbc
            java.io.ByteArrayInputStream r2 = r15.b()     // Catch: java.lang.Throwable -> Lbc
            goto L1b2
        L1ac:
            com.sun.mail.imap.protocol.c r15 = (com.sun.mail.imap.protocol.c) r15     // Catch: java.lang.Throwable -> Lbc
            java.io.ByteArrayInputStream r2 = r15.b()     // Catch: java.lang.Throwable -> Lbc
        L1b2:
            javax.mail.internet.InternetHeaders r3 = new javax.mail.internet.InternetHeaders     // Catch: java.lang.Throwable -> Lbc
            r3.<init>()     // Catch: java.lang.Throwable -> Lbc
            r3.load(r2)     // Catch: java.lang.Throwable -> Lbc
            javax.mail.internet.InternetHeaders r2 = r11.headers     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L1ea
            if (r6 == 0) goto L1c1
            goto L1ea
        L1c1:
            java.util.Enumeration r2 = r3.getAllHeaders()     // Catch: java.lang.Throwable -> Lbc
        L1c5:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> Lbc
            if (r3 != 0) goto L1cc
            goto L1ec
        L1cc:
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> Lbc
            javax.mail.Header r3 = (javax.mail.Header) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> Lbc
            boolean r4 = r11.z(r4)     // Catch: java.lang.Throwable -> Lbc
            if (r4 != 0) goto L1c5
            javax.mail.internet.InternetHeaders r4 = r11.headers     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbc
            r4.addHeader(r5, r3)     // Catch: java.lang.Throwable -> Lbc
            goto L1c5
        L1ea:
            r11.headers = r3     // Catch: java.lang.Throwable -> Lbc
        L1ec:
            if (r6 == 0) goto L1f3
            r2 = 1
            r11.G(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L1f8
        L1f3:
            r2 = 1
            r3 = 0
        L1f5:
            int r4 = r8.length     // Catch: java.lang.Throwable -> Lbc
            if (r3 < r4) goto L200
        L1f8:
            int r13 = r13 + 1
            r2 = r18
            r3 = r16
            goto L115
        L200:
            r4 = r8[r3]     // Catch: java.lang.Throwable -> Lbc
            r11.F(r4)     // Catch: java.lang.Throwable -> Lbc
            int r3 = r3 + 1
            goto L1f5
        L208:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbc
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            throw r2     // Catch: java.lang.Throwable -> Lbc
        L212:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lbc
            throw r0
    }

    private synchronized boolean z(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.l     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L8
            monitor-exit(r2)
            r3 = 1
            return r3
        L8:
            java.util.Hashtable r0 = r2.m     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r3.toUpperCase(r1)     // Catch: java.lang.Throwable -> L17
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r3 = move-exception
            goto L1c
        L19:
            r3 = 0
        L1a:
            monitor-exit(r2)
            return r3
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    protected boolean A() throws javax.mail.FolderClosedException {
            r2 = this;
            javax.mail.Folder r0 = r2.folder
            com.sun.mail.imap.e r0 = (com.sun.mail.imap.e) r0
            com.sun.mail.imap.protocol.h r0 = r0.j
            if (r0 == 0) goto Ld
            boolean r0 = r0.i0()
            return r0
        Ld:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            javax.mail.Folder r1 = r2.folder
            r0.<init>(r1)
            throw r0
    }

    public synchronized void H(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.e = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    protected void I(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    protected void J(long r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void addFrom(javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void addHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void addHeaderLine(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void addRecipients(javax.mail.Message.RecipientType r1, javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    javax.mail.Session d() {
            r1 = this;
            javax.mail.Session r0 = r1.session
            return r0
    }

    void e(javax.mail.Flags r1) {
            r0 = this;
            r0.flags = r1
            return
    }

    public java.util.Enumeration getAllHeaderLines() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.E()
            java.util.Enumeration r0 = super.getAllHeaderLines()
            return r0
    }

    public java.util.Enumeration getAllHeaders() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.E()
            java.util.Enumeration r0 = super.getAllHeaders()
            return r0
    }

    public java.lang.String getContentID() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.h
            return r0
    }

    public java.lang.String[] getContentLanguage() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String[] r0 = r0.n
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    public java.lang.String getContentMD5() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.j
            return r0
    }

    protected java.io.InputStream getContentStream() throws javax.mail.MessagingException {
            r6 = this;
            boolean r0 = r6.u()
            java.lang.Object r1 = r6.t()
            monitor-enter(r1)
            com.sun.mail.imap.protocol.h r2 = r6.v()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            r6.n()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            boolean r3 = r2.i0()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            if (r3 == 0) goto L37
            int r3 = r6.r()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            r4 = -1
            if (r3 == r4) goto L37
            com.sun.mail.imap.f r2 = new com.sun.mail.imap.f     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            java.lang.String r3 = "TEXT"
            java.lang.String r3 = r6.K(r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            com.sun.mail.imap.protocol.d r5 = r6.a     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            if (r5 == 0) goto L32
            int r4 = r5.f     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            goto L32
        L2c:
            r0 = move-exception
            goto L9a
        L2e:
            r0 = move-exception
            goto L81
        L30:
            r0 = move-exception
            goto L8e
        L32:
            r2.<init>(r6, r3, r4, r0)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return r2
        L37:
            boolean r3 = r2.i0()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            if (r3 == 0) goto L63
            if (r0 == 0) goto L4e
            int r0 = r6.w()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            java.lang.String r3 = "TEXT"
            java.lang.String r3 = r6.K(r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            com.sun.mail.imap.protocol.c r0 = r2.u0(r0, r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            goto L5c
        L4e:
            int r0 = r6.w()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            java.lang.String r3 = "TEXT"
            java.lang.String r3 = r6.K(r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            com.sun.mail.imap.protocol.c r0 = r2.M(r0, r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
        L5c:
            if (r0 == 0) goto L74
            java.io.ByteArrayInputStream r0 = r0.b()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            goto L75
        L63:
            int r0 = r6.w()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            java.lang.String r3 = "TEXT"
            com.sun.mail.imap.protocol.q r0 = r2.T(r0, r3)     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            if (r0 == 0) goto L74
            java.io.ByteArrayInputStream r0 = r0.b()     // Catch: java.lang.Throwable -> L2c com.sun.mail.iap.ProtocolException -> L2e com.sun.mail.iap.ConnectionException -> L30
            goto L75
        L74:
            r0 = 0
        L75:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L79
            return r0
        L79:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "No content"
            r0.<init>(r1)
            throw r0
        L81:
            r6.q()     // Catch: java.lang.Throwable -> L2c
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L8e:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L2c
            javax.mail.Folder r3 = r6.folder     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L9a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    public java.lang.String getContentType() throws javax.mail.MessagingException {
            r4 = this;
            r4.n()
            java.lang.String r0 = r4.i
            if (r0 != 0) goto L1d
            r4.B()
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType
            com.sun.mail.imap.protocol.d r1 = r4.a
            java.lang.String r2 = r1.b
            java.lang.String r3 = r1.c
            javax.mail.internet.ParameterList r1 = r1.l
            r0.<init>(r2, r3, r1)
            java.lang.String r0 = r0.toString()
            r4.i = r0
        L1d:
            java.lang.String r0 = r4.i
            return r0
    }

    public synchronized javax.activation.DataHandler getDataHandler() throws javax.mail.MessagingException {
            r6 = this;
            monitor-enter(r6)
            r6.n()     // Catch: java.lang.Throwable -> L23
            javax.activation.DataHandler r0 = r6.dh     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L7e
            r6.B()     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r6.i     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.d r1 = r6.a     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r1.c     // Catch: java.lang.Throwable -> L23
            javax.mail.internet.ParameterList r1 = r1.l     // Catch: java.lang.Throwable -> L23
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r6.i = r0     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r0 = move-exception
            goto L84
        L25:
            com.sun.mail.imap.protocol.d r0 = r6.a     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L40
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.h r1 = new com.sun.mail.imap.h     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.d r2 = r6.a     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.d[] r2 = r2.o     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r6.h     // Catch: java.lang.Throwable -> L23
            r1.<init>(r6, r2, r3, r6)     // Catch: java.lang.Throwable -> L23
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23
            r6.dh = r0     // Catch: java.lang.Throwable -> L23
            goto L7e
        L40:
            com.sun.mail.imap.protocol.d r0 = r6.a     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7e
            boolean r0 = r6.A()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7e
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.i r1 = new com.sun.mail.imap.i     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.d r2 = r6.a     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.d[] r3 = r2.o     // Catch: java.lang.Throwable -> L23
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L23
            com.sun.mail.imap.protocol.e r2 = r2.p     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r6.h     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L62
            java.lang.String r4 = "1"
            goto L74
        L62:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = ".1"
            r5.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L23
        L74:
            r1.<init>(r6, r3, r2, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r6.i     // Catch: java.lang.Throwable -> L23
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L23
            r6.dh = r0     // Catch: java.lang.Throwable -> L23
        L7e:
            javax.activation.DataHandler r0 = super.getDataHandler()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r6)
            return r0
        L84:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public java.lang.String getDescription() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            java.lang.String r0 = r1.k
            if (r0 == 0) goto L8
            return r0
        L8:
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.i
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.io.UnsupportedEncodingException -> L1a
            r1.k = r0     // Catch: java.io.UnsupportedEncodingException -> L1a
            goto L20
        L1a:
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.i
            r1.k = r0
        L20:
            java.lang.String r0 = r1.k
            return r0
    }

    public java.lang.String getDisposition() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.g
            return r0
    }

    public java.lang.String getEncoding() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            java.lang.String r0 = r0.d
            return r0
    }

    public java.lang.String getFileName() throws javax.mail.MessagingException {
            r2 = this;
            r2.n()
            r2.B()
            com.sun.mail.imap.protocol.d r0 = r2.a
            javax.mail.internet.ParameterList r0 = r0.m
            if (r0 == 0) goto L13
            java.lang.String r1 = "filename"
            java.lang.String r0 = r0.get(r1)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L22
            com.sun.mail.imap.protocol.d r1 = r2.a
            javax.mail.internet.ParameterList r1 = r1.l
            if (r1 == 0) goto L22
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.get(r0)
        L22:
            return r0
    }

    public synchronized javax.mail.Flags getFlags() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            r1.n()     // Catch: java.lang.Throwable -> Ld
            r1.D()     // Catch: java.lang.Throwable -> Ld
            javax.mail.Flags r0 = super.getFlags()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public javax.mail.Address[] getFrom() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.C()
            com.sun.mail.imap.protocol.e r0 = r1.b
            javax.mail.internet.InternetAddress[] r0 = r0.d
            javax.mail.internet.InternetAddress[] r0 = r1.f(r0)
            return r0
    }

    public java.lang.String getHeader(java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            java.lang.String[] r0 = r1.getHeader(r2)
            if (r0 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            javax.mail.internet.InternetHeaders r0 = r1.headers
            java.lang.String r2 = r0.getHeader(r2, r3)
            return r2
    }

    public java.lang.String[] getHeader(java.lang.String r7) throws javax.mail.MessagingException {
            r6 = this;
            r6.n()
            boolean r0 = r6.z(r7)
            if (r0 == 0) goto L10
            javax.mail.internet.InternetHeaders r0 = r6.headers
            java.lang.String[] r7 = r0.getHeader(r7)
            return r7
        L10:
            java.lang.Object r0 = r6.t()
            monitor-enter(r0)
            com.sun.mail.imap.protocol.h r1 = r6.v()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            r6.n()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            boolean r2 = r1.i0()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            r3 = 0
            if (r2 == 0) goto L4f
            int r2 = r6.w()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r5 = "HEADER.FIELDS ("
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            r4.append(r7)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r4 = r6.K(r4)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            com.sun.mail.imap.protocol.c r1 = r1.u0(r2, r4)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            if (r1 == 0) goto L71
            java.io.ByteArrayInputStream r1 = r1.b()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            goto L72
        L49:
            r7 = move-exception
            goto La9
        L4b:
            r7 = move-exception
            goto L90
        L4d:
            r7 = move-exception
            goto L9d
        L4f:
            int r2 = r6.w()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r5 = "HEADER.LINES ("
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            r4.append(r7)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            com.sun.mail.imap.protocol.q r1 = r1.T(r2, r4)     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            if (r1 == 0) goto L71
            java.io.ByteArrayInputStream r1 = r1.b()     // Catch: java.lang.Throwable -> L49 com.sun.mail.iap.ProtocolException -> L4b com.sun.mail.iap.ConnectionException -> L4d
            goto L72
        L71:
            r1 = r3
        L72:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L76
            return r3
        L76:
            javax.mail.internet.InternetHeaders r0 = r6.headers
            if (r0 != 0) goto L81
            javax.mail.internet.InternetHeaders r0 = new javax.mail.internet.InternetHeaders
            r0.<init>()
            r6.headers = r0
        L81:
            javax.mail.internet.InternetHeaders r0 = r6.headers
            r0.load(r1)
            r6.F(r7)
            javax.mail.internet.InternetHeaders r0 = r6.headers
            java.lang.String[] r7 = r0.getHeader(r7)
            return r7
        L90:
            r6.q()     // Catch: java.lang.Throwable -> L49
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L49
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L9d:
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L49
            javax.mail.Folder r2 = r6.folder     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L49
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r7
    }

    public int getLineCount() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.B()
            com.sun.mail.imap.protocol.d r0 = r1.a
            int r0 = r0.e
            return r0
    }

    public java.util.Enumeration getMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.n()
            r0.E()
            java.util.Enumeration r1 = super.getMatchingHeaderLines(r1)
            return r1
    }

    public java.util.Enumeration getMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.n()
            r0.E()
            java.util.Enumeration r1 = super.getMatchingHeaders(r1)
            return r1
    }

    public java.lang.String getMessageID() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.C()
            com.sun.mail.imap.protocol.e r0 = r1.b
            java.lang.String r0 = r0.k
            return r0
    }

    public java.util.Enumeration getNonMatchingHeaderLines(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.n()
            r0.E()
            java.util.Enumeration r1 = super.getNonMatchingHeaderLines(r1)
            return r1
    }

    public java.util.Enumeration getNonMatchingHeaders(java.lang.String[] r1) throws javax.mail.MessagingException {
            r0 = this;
            r0.n()
            r0.E()
            java.util.Enumeration r1 = super.getNonMatchingHeaders(r1)
            return r1
    }

    public java.util.Date getReceivedDate() throws javax.mail.MessagingException {
            r3 = this;
            r3.n()
            r3.C()
            java.util.Date r0 = r3.c
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.Date r0 = new java.util.Date
            java.util.Date r1 = r3.c
            long r1 = r1.getTime()
            r0.<init>(r1)
            return r0
    }

    public javax.mail.Address[] getRecipients(javax.mail.Message.RecipientType r2) throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.C()
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.TO
            if (r2 != r0) goto L13
            com.sun.mail.imap.protocol.e r2 = r1.b
            javax.mail.internet.InternetAddress[] r2 = r2.g
            javax.mail.internet.InternetAddress[] r2 = r1.f(r2)
            return r2
        L13:
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.CC
            if (r2 != r0) goto L20
            com.sun.mail.imap.protocol.e r2 = r1.b
            javax.mail.internet.InternetAddress[] r2 = r2.h
            javax.mail.internet.InternetAddress[] r2 = r1.f(r2)
            return r2
        L20:
            javax.mail.Message$RecipientType r0 = javax.mail.Message.RecipientType.BCC
            if (r2 != r0) goto L2d
            com.sun.mail.imap.protocol.e r2 = r1.b
            javax.mail.internet.InternetAddress[] r2 = r2.i
            javax.mail.internet.InternetAddress[] r2 = r1.f(r2)
            return r2
        L2d:
            javax.mail.Address[] r2 = super.getRecipients(r2)
            return r2
    }

    public javax.mail.Address[] getReplyTo() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.C()
            com.sun.mail.imap.protocol.e r0 = r1.b
            javax.mail.internet.InternetAddress[] r0 = r0.f
            javax.mail.internet.InternetAddress[] r0 = r1.f(r0)
            return r0
    }

    public javax.mail.Address getSender() throws javax.mail.MessagingException {
            r2 = this;
            r2.n()
            r2.C()
            com.sun.mail.imap.protocol.e r0 = r2.b
            javax.mail.internet.InternetAddress[] r0 = r0.e
            if (r0 == 0) goto L10
            r1 = 0
            r0 = r0[r1]
            return r0
        L10:
            r0 = 0
            return r0
    }

    public java.util.Date getSentDate() throws javax.mail.MessagingException {
            r3 = this;
            r3.n()
            r3.C()
            com.sun.mail.imap.protocol.e r0 = r3.b
            java.util.Date r0 = r0.b
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.Date r0 = new java.util.Date
            com.sun.mail.imap.protocol.e r1 = r3.b
            java.util.Date r1 = r1.b
            long r1 = r1.getTime()
            r0.<init>(r1)
            return r0
    }

    public int getSize() throws javax.mail.MessagingException {
            r2 = this;
            r2.n()
            int r0 = r2.d
            r1 = -1
            if (r0 != r1) goto Lb
            r2.C()
        Lb:
            int r0 = r2.d
            return r0
    }

    public java.lang.String getSubject() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            java.lang.String r0 = r1.j
            if (r0 == 0) goto L8
            return r0
        L8:
            r1.C()
            com.sun.mail.imap.protocol.e r0 = r1.b
            java.lang.String r0 = r0.c
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.io.UnsupportedEncodingException -> L1a
            r1.j = r0     // Catch: java.io.UnsupportedEncodingException -> L1a
            goto L20
        L1a:
            com.sun.mail.imap.protocol.e r0 = r1.b
            java.lang.String r0 = r0.c
            r1.j = r0
        L20:
            java.lang.String r0 = r1.j
            return r0
    }

    public synchronized boolean isSet(javax.mail.Flags.Flag r1) throws javax.mail.MessagingException {
            r0 = this;
            monitor-enter(r0)
            r0.n()     // Catch: java.lang.Throwable -> Ld
            r0.D()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = super.isSet(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    protected void n() throws javax.mail.MessageRemovedException {
            r1 = this;
            boolean r0 = r1.expunged
            if (r0 != 0) goto L5
            return
        L5:
            javax.mail.MessageRemovedException r0 = new javax.mail.MessageRemovedException
            r0.<init>()
            throw r0
    }

    protected void q() throws javax.mail.MessageRemovedException, javax.mail.FolderClosedException {
            r4 = this;
            java.lang.Object r0 = r4.t()
            monitor-enter(r0)
            com.sun.mail.imap.protocol.h r1 = r4.v()     // Catch: java.lang.Throwable -> Ld com.sun.mail.iap.ConnectionException -> Lf com.sun.mail.iap.ProtocolException -> L11
            r1.r0()     // Catch: java.lang.Throwable -> Ld com.sun.mail.iap.ConnectionException -> Lf com.sun.mail.iap.ProtocolException -> L11
            goto L11
        Ld:
            r1 = move-exception
            goto L29
        Lf:
            r1 = move-exception
            goto L1d
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r4.expunged
            if (r0 != 0) goto L17
            return
        L17:
            javax.mail.MessageRemovedException r0 = new javax.mail.MessageRemovedException
            r0.<init>()
            throw r0
        L1d:
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> Ld
            javax.mail.Folder r3 = r4.folder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ld
            throw r2     // Catch: java.lang.Throwable -> Ld
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    protected int r() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            javax.mail.Store r0 = r0.getStore()
            com.sun.mail.imap.k r0 = (com.sun.mail.imap.k) r0
            int r0 = r0.h()
            return r0
    }

    public void removeHeader(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String s() throws javax.mail.MessagingException {
            r1 = this;
            r1.n()
            r1.C()
            com.sun.mail.imap.protocol.e r0 = r1.b
            java.lang.String r0 = r0.j
            return r0
    }

    public void setContentID(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setContentLanguage(java.lang.String[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setContentMD5(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setDataHandler(javax.activation.DataHandler r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setDescription(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void setDisposition(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    protected void setExpunged(boolean r1) {
            r0 = this;
            super/*javax.mail.Message*/.setExpunged(r1)
            r1 = -1
            r0.f = r1
            return
    }

    public void setFileName(java.lang.String r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public synchronized void setFlags(javax.mail.Flags r4, boolean r5) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.t()     // Catch: java.lang.Throwable -> L35
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L35
            com.sun.mail.imap.protocol.h r1 = r3.v()     // Catch: java.lang.Throwable -> L17 com.sun.mail.iap.ProtocolException -> L19 com.sun.mail.iap.ConnectionException -> L1b
            r3.n()     // Catch: java.lang.Throwable -> L17 com.sun.mail.iap.ProtocolException -> L19 com.sun.mail.iap.ConnectionException -> L1b
            int r2 = r3.w()     // Catch: java.lang.Throwable -> L17 com.sun.mail.iap.ProtocolException -> L19 com.sun.mail.iap.ConnectionException -> L1b
            r1.M0(r2, r4, r5)     // Catch: java.lang.Throwable -> L17 com.sun.mail.iap.ProtocolException -> L19 com.sun.mail.iap.ConnectionException -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return
        L17:
            r4 = move-exception
            goto L33
        L19:
            r4 = move-exception
            goto L1d
        L1b:
            r4 = move-exception
            goto L27
        L1d:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L17
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L27:
            javax.mail.FolderClosedException r5 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L17
            javax.mail.Folder r1 = r3.folder     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L17
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r4
    }

    public void setFrom(javax.mail.Address r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setHeader(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    protected void setMessageNumber(int r1) {
            r0 = this;
            super/*javax.mail.Message*/.setMessageNumber(r1)
            return
    }

    public void setRecipients(javax.mail.Message.RecipientType r1, javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    public void setReplyTo(javax.mail.Address[] r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setSender(javax.mail.Address r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setSentDate(java.util.Date r2) throws javax.mail.MessagingException {
            r1 = this;
            javax.mail.IllegalWriteException r2 = new javax.mail.IllegalWriteException
            java.lang.String r0 = "IMAPMessage is read-only"
            r2.<init>(r0)
            throw r2
    }

    public void setSubject(java.lang.String r1, java.lang.String r2) throws javax.mail.MessagingException {
            r0 = this;
            javax.mail.IllegalWriteException r1 = new javax.mail.IllegalWriteException
            java.lang.String r2 = "IMAPMessage is read-only"
            r1.<init>(r2)
            throw r1
    }

    protected java.lang.Object t() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            com.sun.mail.imap.e r0 = (com.sun.mail.imap.e) r0
            java.lang.Object r0 = r0.l
            return r0
    }

    public synchronized boolean u() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    protected com.sun.mail.imap.protocol.h v() throws com.sun.mail.iap.ProtocolException, javax.mail.FolderClosedException {
            r2 = this;
            javax.mail.Folder r0 = r2.folder
            com.sun.mail.imap.e r0 = (com.sun.mail.imap.e) r0
            r0.S()
            javax.mail.Folder r0 = r2.folder
            com.sun.mail.imap.e r0 = (com.sun.mail.imap.e) r0
            com.sun.mail.imap.protocol.h r0 = r0.j
            if (r0 == 0) goto L10
            return r0
        L10:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            javax.mail.Folder r1 = r2.folder
            r0.<init>(r1)
            throw r0
    }

    protected int w() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public void writeTo(java.io.OutputStream r6) throws java.io.IOException, javax.mail.MessagingException {
            r5 = this;
            boolean r0 = r5.u()
            java.lang.Object r1 = r5.t()
            monitor-enter(r1)
            com.sun.mail.imap.protocol.h r2 = r5.v()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            r5.n()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            boolean r3 = r2.i0()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            r4 = 0
            if (r3 == 0) goto L3b
            if (r0 == 0) goto L2a
            int r0 = r5.w()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            java.lang.String r3 = r5.h     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            com.sun.mail.imap.protocol.c r0 = r2.u0(r0, r3)     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            goto L34
        L24:
            r6 = move-exception
            goto L7e
        L26:
            r6 = move-exception
            goto L65
        L28:
            r6 = move-exception
            goto L72
        L2a:
            int r0 = r5.w()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            java.lang.String r3 = r5.h     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            com.sun.mail.imap.protocol.c r0 = r2.M(r0, r3)     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
        L34:
            if (r0 == 0) goto L49
            java.io.ByteArrayInputStream r4 = r0.b()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            goto L49
        L3b:
            int r0 = r5.w()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            com.sun.mail.imap.protocol.q r0 = r2.T(r0, r4)     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
            if (r0 == 0) goto L49
            java.io.ByteArrayInputStream r4 = r0.b()     // Catch: java.lang.Throwable -> L24 com.sun.mail.iap.ProtocolException -> L26 com.sun.mail.iap.ConnectionException -> L28
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L5d
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L50:
            int r1 = r4.read(r0)
            r2 = -1
            if (r1 != r2) goto L58
            return
        L58:
            r2 = 0
            r6.write(r0, r2, r1)
            goto L50
        L5d:
            javax.mail.MessagingException r6 = new javax.mail.MessagingException
            java.lang.String r0 = "No content"
            r6.<init>(r0)
            throw r6
        L65:
            r5.q()     // Catch: java.lang.Throwable -> L24
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r6.getMessage()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L72:
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException     // Catch: java.lang.Throwable -> L24
            javax.mail.Folder r2 = r5.folder     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L7e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r6
    }

    protected long x() {
            r2 = this;
            long r0 = r2.g
            return r0
    }

    public synchronized void y() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.l = r0     // Catch: java.lang.Throwable -> L18
            r0 = 0
            r2.m = r0     // Catch: java.lang.Throwable -> L18
            r2.b = r0     // Catch: java.lang.Throwable -> L18
            r2.a = r0     // Catch: java.lang.Throwable -> L18
            r2.c = r0     // Catch: java.lang.Throwable -> L18
            r1 = -1
            r2.d = r1     // Catch: java.lang.Throwable -> L18
            r2.i = r0     // Catch: java.lang.Throwable -> L18
            r2.j = r0     // Catch: java.lang.Throwable -> L18
            r2.k = r0     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
