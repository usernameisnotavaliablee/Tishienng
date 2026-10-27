package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends java.io.InputStream {
    private static final int k = 64;
    private com.sun.mail.imap.g a;
    private java.lang.String b;
    private int c;
    private int d;
    private int e;
    private byte[] f;
    private int g;
    private int h;
    private boolean i;
    private com.sun.mail.iap.d j;

    public f(com.sun.mail.imap.g r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.e = r3
            r0.i = r4
            r2 = 0
            r0.c = r2
            int r1 = r1.r()
            r0.d = r1
            return
    }

    private void a() {
            r3 = this;
            boolean r0 = r3.i
            if (r0 == 0) goto L5
            goto L23
        L5:
            com.sun.mail.imap.g r0 = r3.a     // Catch: javax.mail.MessagingException -> L23
            javax.mail.Folder r0 = r0.getFolder()     // Catch: javax.mail.MessagingException -> L23
            if (r0 == 0) goto L23
            int r0 = r0.getMode()     // Catch: javax.mail.MessagingException -> L23
            r1 = 1
            if (r0 == r1) goto L23
            com.sun.mail.imap.g r0 = r3.a     // Catch: javax.mail.MessagingException -> L23
            javax.mail.Flags$Flag r2 = javax.mail.Flags.Flag.SEEN     // Catch: javax.mail.MessagingException -> L23
            boolean r0 = r0.isSet(r2)     // Catch: javax.mail.MessagingException -> L23
            if (r0 != 0) goto L23
            com.sun.mail.imap.g r0 = r3.a     // Catch: javax.mail.MessagingException -> L23
            r0.setFlag(r2, r1)     // Catch: javax.mail.MessagingException -> L23
        L23:
            return
    }

    private void b() throws java.io.IOException {
            r9 = this;
            int r0 = r9.e
            r1 = -1
            if (r0 == r1) goto L12
            int r2 = r9.c
            if (r2 < r0) goto L12
            if (r2 != 0) goto Le
            r9.a()
        Le:
            r0 = 0
            r9.j = r0
            return
        L12:
            com.sun.mail.iap.d r0 = r9.j
            if (r0 != 0) goto L21
            com.sun.mail.iap.d r0 = new com.sun.mail.iap.d
            int r2 = r9.d
            int r2 = r2 + 64
            r0.<init>(r2)
            r9.j = r0
        L21:
            com.sun.mail.imap.g r0 = r9.a
            java.lang.Object r2 = r0.t()
            monitor-enter(r2)
            com.sun.mail.imap.g r0 = r9.a     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.imap.protocol.h r3 = r0.v()     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.imap.g r0 = r9.a     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            boolean r0 = r0.isExpunged()     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            if (r0 != 0) goto La2
            com.sun.mail.imap.g r0 = r9.a     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r4 = r0.w()     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r0 = r9.d     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r5 = r9.e     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            if (r5 == r1) goto L4a
            int r1 = r9.c     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r6 = r1 + r0
            if (r6 <= r5) goto L4a
            int r0 = r5 - r1
        L4a:
            r7 = r0
            goto L53
        L4c:
            r0 = move-exception
            goto Lc5
        L4f:
            r0 = move-exception
            goto Laa
        L51:
            r0 = move-exception
            goto Lb8
        L53:
            boolean r0 = r9.i     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            if (r0 == 0) goto L62
            java.lang.String r5 = r9.b     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r6 = r9.c     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.iap.d r8 = r9.j     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.imap.protocol.c r0 = r3.w0(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            goto L6c
        L62:
            java.lang.String r5 = r9.b     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            int r6 = r9.c     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.iap.d r8 = r9.j     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            com.sun.mail.imap.protocol.c r0 = r3.O(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
        L6c:
            if (r0 == 0) goto L97
            com.sun.mail.iap.d r0 = r0.a()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L97
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            int r1 = r9.c
            if (r1 != 0) goto L7c
            r9.a()
        L7c:
            byte[] r1 = r0.a()
            r9.f = r1
            int r1 = r0.d()
            r9.h = r1
            int r0 = r0.b()
            int r1 = r9.h
            int r1 = r1 + r0
            r9.g = r1
            int r1 = r9.c
            int r1 = r1 + r0
            r9.c = r1
            return
        L97:
            r9.c()     // Catch: java.lang.Throwable -> L4c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "No content"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        La2:
            com.sun.mail.util.MessageRemovedIOException r0 = new com.sun.mail.util.MessageRemovedIOException     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            java.lang.String r1 = "No content for expunged message"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
            throw r0     // Catch: java.lang.Throwable -> L4c javax.mail.FolderClosedException -> L4f com.sun.mail.iap.ProtocolException -> L51
        Laa:
            com.sun.mail.util.FolderClosedIOException r1 = new com.sun.mail.util.FolderClosedIOException     // Catch: java.lang.Throwable -> L4c
            javax.mail.Folder r3 = r0.getFolder()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Throwable -> L4c
        Lb8:
            r9.c()     // Catch: java.lang.Throwable -> L4c
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Throwable -> L4c
        Lc5:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    private void c() throws com.sun.mail.util.MessageRemovedIOException, com.sun.mail.util.FolderClosedIOException {
            r4 = this;
            com.sun.mail.imap.g r0 = r4.a
            java.lang.Object r0 = r0.t()
            monitor-enter(r0)
            com.sun.mail.imap.g r1 = r4.a     // Catch: java.lang.Throwable -> L11 javax.mail.FolderClosedException -> L13 com.sun.mail.iap.ConnectionException -> L15 com.sun.mail.iap.ProtocolException -> L17
            com.sun.mail.imap.protocol.h r1 = r1.v()     // Catch: java.lang.Throwable -> L11 javax.mail.FolderClosedException -> L13 com.sun.mail.iap.ConnectionException -> L15 com.sun.mail.iap.ProtocolException -> L17
            r1.r0()     // Catch: java.lang.Throwable -> L11 javax.mail.FolderClosedException -> L13 com.sun.mail.iap.ConnectionException -> L15 com.sun.mail.iap.ProtocolException -> L17
            goto L17
        L11:
            r1 = move-exception
            goto L45
        L13:
            r1 = move-exception
            goto L27
        L15:
            r1 = move-exception
            goto L35
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            com.sun.mail.imap.g r0 = r4.a
            boolean r0 = r0.isExpunged()
            if (r0 != 0) goto L21
            return
        L21:
            com.sun.mail.util.MessageRemovedIOException r0 = new com.sun.mail.util.MessageRemovedIOException
            r0.<init>()
            throw r0
        L27:
            com.sun.mail.util.FolderClosedIOException r2 = new com.sun.mail.util.FolderClosedIOException     // Catch: java.lang.Throwable -> L11
            javax.mail.Folder r3 = r1.getFolder()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L11
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L11
        L35:
            com.sun.mail.util.FolderClosedIOException r2 = new com.sun.mail.util.FolderClosedIOException     // Catch: java.lang.Throwable -> L11
            com.sun.mail.imap.g r3 = r4.a     // Catch: java.lang.Throwable -> L11
            javax.mail.Folder r3 = r3.getFolder()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L11
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L11
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.g     // Catch: java.lang.Throwable -> L8
            int r1 = r2.h     // Catch: java.lang.Throwable -> L8
            int r0 = r0 - r1
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.h     // Catch: java.lang.Throwable -> L13
            int r1 = r3.g     // Catch: java.lang.Throwable -> L13
            if (r0 < r1) goto L15
            r3.b()     // Catch: java.lang.Throwable -> L13
            int r0 = r3.h     // Catch: java.lang.Throwable -> L13
            int r1 = r3.g     // Catch: java.lang.Throwable -> L13
            if (r0 < r1) goto L15
            monitor-exit(r3)
            r0 = -1
            return r0
        L13:
            r0 = move-exception
            goto L23
        L15:
            byte[] r0 = r3.f     // Catch: java.lang.Throwable -> L13
            int r1 = r3.h     // Catch: java.lang.Throwable -> L13
            int r2 = r1 + 1
            r3.h = r2     // Catch: java.lang.Throwable -> L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L13
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r3)
            return r0
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.g     // Catch: java.lang.Throwable -> L15
            int r1 = r2.h     // Catch: java.lang.Throwable -> L15
            int r0 = r0 - r1
            if (r0 > 0) goto L17
            r2.b()     // Catch: java.lang.Throwable -> L15
            int r0 = r2.g     // Catch: java.lang.Throwable -> L15
            int r1 = r2.h     // Catch: java.lang.Throwable -> L15
            int r0 = r0 - r1
            if (r0 > 0) goto L17
            monitor-exit(r2)
            r3 = -1
            return r3
        L15:
            r3 = move-exception
            goto L28
        L17:
            if (r0 >= r5) goto L1a
            r5 = r0
        L1a:
            byte[] r0 = r2.f     // Catch: java.lang.Throwable -> L15
            int r1 = r2.h     // Catch: java.lang.Throwable -> L15
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L15
            int r3 = r2.h     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + r5
            r2.h = r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r5
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
