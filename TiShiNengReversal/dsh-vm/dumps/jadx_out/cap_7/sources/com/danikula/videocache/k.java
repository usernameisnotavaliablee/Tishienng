package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class k implements com.danikula.videocache.q {
    private static final org.slf4j.c e = null;
    private static final int f = 5;
    private final com.danikula.videocache.sourcestorage.c a;
    private com.danikula.videocache.s b;
    private java.net.HttpURLConnection c;
    private java.io.InputStream d;

    static {
            java.lang.String r0 = "HttpUrlSource"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.k.e = r0
            return
    }

    public k(com.danikula.videocache.k r2) {
            r1 = this;
            r1.<init>()
            com.danikula.videocache.s r0 = r2.b
            r1.b = r0
            com.danikula.videocache.sourcestorage.c r2 = r2.a
            r1.a = r2
            return
    }

    public k(java.lang.String r2) {
            r1 = this;
            com.danikula.videocache.sourcestorage.c r0 = com.danikula.videocache.sourcestorage.d.a()
            r1.<init>(r2, r0)
            return
    }

    public k(java.lang.String r4, com.danikula.videocache.sourcestorage.c r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = com.danikula.videocache.n.d(r5)
            com.danikula.videocache.sourcestorage.c r0 = (com.danikula.videocache.sourcestorage.c) r0
            r3.a = r0
            com.danikula.videocache.s r5 = r5.get(r4)
            if (r5 == 0) goto L12
            goto L1e
        L12:
            com.danikula.videocache.s r5 = new com.danikula.videocache.s
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r2 = com.danikula.videocache.p.g(r4)
            r5.<init>(r4, r0, r2)
        L1e:
            r3.b = r5
            return
    }

    private void b() throws com.danikula.videocache.ProxyCacheException {
            r8 = this;
            org.slf4j.c r0 = com.danikula.videocache.k.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Read content info from "
            r1.append(r2)
            com.danikula.videocache.s r2 = r8.b
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
            r1 = 0
            r3 = 10000(0x2710, float:1.4013E-41)
            r4 = 0
            java.net.HttpURLConnection r1 = r8.f(r1, r3)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65
            long r2 = r8.c(r1)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r1.getContentType()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.danikula.videocache.s r6 = new com.danikula.videocache.s     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.danikula.videocache.s r7 = r8.b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r7 = r7.a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r8.b = r6     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.danikula.videocache.sourcestorage.c r2 = r8.a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r3 = r6.a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r2.a(r3, r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r3 = "Source info fetched: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.danikula.videocache.s r3 = r8.b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r2.append(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r0.debug(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.danikula.videocache.p.c(r4)
            r1.disconnect()
            return
        L5e:
            r0 = move-exception
            goto L8a
        L60:
            r0 = move-exception
            goto L67
        L62:
            r0 = move-exception
            r1 = r4
            goto L8a
        L65:
            r0 = move-exception
            r1 = r4
        L67:
            org.slf4j.c r2 = com.danikula.videocache.k.e     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "Error fetching info from "
            r3.append(r5)     // Catch: java.lang.Throwable -> L5e
            com.danikula.videocache.s r5 = r8.b     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r5.a     // Catch: java.lang.Throwable -> L5e
            r3.append(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r2.error(r3, r0)     // Catch: java.lang.Throwable -> L5e
            com.danikula.videocache.p.c(r4)
            if (r1 == 0) goto L89
            r1.disconnect()
        L89:
            return
        L8a:
            com.danikula.videocache.p.c(r4)
            if (r1 == 0) goto L92
            r1.disconnect()
        L92:
            throw r0
    }

    private long c(java.net.HttpURLConnection r3) {
            r2 = this;
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = r3.getHeaderField(r0)
            if (r3 != 0) goto Lb
            r0 = -1
            return r0
        Lb:
            long r0 = java.lang.Long.parseLong(r3)
            return r0
    }

    private java.net.HttpURLConnection f(long r9, int r11) throws java.io.IOException, com.danikula.videocache.ProxyCacheException {
            r8 = this;
            com.danikula.videocache.s r0 = r8.b
            java.lang.String r0 = r0.a
            r1 = 0
            r2 = 0
        L6:
            org.slf4j.c r3 = com.danikula.videocache.k.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Open connection "
            r4.append(r5)
            r5 = 0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " with offset "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            goto L2c
        L2a:
            java.lang.String r5 = ""
        L2c:
            r4.append(r5)
            java.lang.String r5 = " to "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.debug(r4)
            java.net.URL r3 = new java.net.URL
            r3.<init>(r0)
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            if (r7 <= 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = "-"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L66:
            if (r11 <= 0) goto L6e
            r3.setConnectTimeout(r11)
            r3.setReadTimeout(r11)
        L6e:
            int r4 = r3.getResponseCode()
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L81
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L81
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 != r5) goto L7f
            goto L81
        L7f:
            r4 = 0
            goto L82
        L81:
            r4 = 1
        L82:
            if (r4 == 0) goto L8f
            java.lang.String r0 = "Location"
            java.lang.String r0 = r3.getHeaderField(r0)
            int r2 = r2 + 1
            r3.disconnect()
        L8f:
            r5 = 5
            if (r2 > r5) goto L95
            if (r4 != 0) goto L6
            return r3
        L95:
            com.danikula.videocache.ProxyCacheException r9 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Too many redirects: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private long g(java.net.HttpURLConnection r3, long r4, int r6) throws java.io.IOException {
            r2 = this;
            long r0 = r2.c(r3)
            r3 = 200(0xc8, float:2.8E-43)
            if (r6 != r3) goto L9
            return r0
        L9:
            r3 = 206(0xce, float:2.89E-43)
            if (r6 != r3) goto Lf
            long r0 = r0 + r4
            return r0
        Lf:
            com.danikula.videocache.s r3 = r2.b
            long r3 = r3.b
            return r3
    }

    @Override // com.danikula.videocache.q
    public void a(long r6) throws com.danikula.videocache.ProxyCacheException {
            r5 = this;
            r0 = -1
            java.net.HttpURLConnection r0 = r5.f(r6, r0)     // Catch: java.io.IOException -> L37
            r5.c = r0     // Catch: java.io.IOException -> L37
            java.lang.String r0 = r0.getContentType()     // Catch: java.io.IOException -> L37
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L37
            java.net.HttpURLConnection r2 = r5.c     // Catch: java.io.IOException -> L37
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.io.IOException -> L37
            r3 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L37
            r5.d = r1     // Catch: java.io.IOException -> L37
            java.net.HttpURLConnection r1 = r5.c     // Catch: java.io.IOException -> L37
            int r2 = r1.getResponseCode()     // Catch: java.io.IOException -> L37
            long r1 = r5.g(r1, r6, r2)     // Catch: java.io.IOException -> L37
            com.danikula.videocache.s r3 = new com.danikula.videocache.s     // Catch: java.io.IOException -> L37
            com.danikula.videocache.s r4 = r5.b     // Catch: java.io.IOException -> L37
            java.lang.String r4 = r4.a     // Catch: java.io.IOException -> L37
            r3.<init>(r4, r1, r0)     // Catch: java.io.IOException -> L37
            r5.b = r3     // Catch: java.io.IOException -> L37
            com.danikula.videocache.sourcestorage.c r0 = r5.a     // Catch: java.io.IOException -> L37
            java.lang.String r1 = r3.a     // Catch: java.io.IOException -> L37
            r0.a(r1, r3)     // Catch: java.io.IOException -> L37
            return
        L37:
            r0 = move-exception
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error opening connection for "
            r2.append(r3)
            com.danikula.videocache.s r3 = r5.b
            java.lang.String r3 = r3.a
            r2.append(r3)
            java.lang.String r3 = " with offset "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            throw r1
    }

    @Override // com.danikula.videocache.q
    public void close() throws com.danikula.videocache.ProxyCacheException {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.c
            if (r0 == 0) goto L1c
            r0.disconnect()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8 java.lang.IllegalArgumentException -> L11 java.lang.NullPointerException -> L13
            return
        L8:
            r0 = move-exception
            org.slf4j.c r1 = com.danikula.videocache.k.e
            java.lang.String r2 = "Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :("
            r1.error(r2, r0)
            return
        L11:
            r0 = move-exception
            goto L14
        L13:
            r0 = move-exception
        L14:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues."
            r1.<init>(r2, r0)
            throw r1
        L1c:
            return
    }

    public synchronized java.lang.String d() throws com.danikula.videocache.ProxyCacheException {
            r1 = this;
            monitor-enter(r1)
            com.danikula.videocache.s r0 = r1.b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> Lf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r1.b()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L17
        L11:
            com.danikula.videocache.s r0 = r1.b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public java.lang.String e() {
            r1 = this;
            com.danikula.videocache.s r0 = r1.b
            java.lang.String r0 = r0.a
            return r0
    }

    @Override // com.danikula.videocache.q
    public synchronized long length() throws com.danikula.videocache.ProxyCacheException {
            r5 = this;
            monitor-enter(r5)
            com.danikula.videocache.s r0 = r5.b     // Catch: java.lang.Throwable -> L10
            long r0 = r0.b     // Catch: java.lang.Throwable -> L10
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            r5.b()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L18
        L12:
            com.danikula.videocache.s r0 = r5.b     // Catch: java.lang.Throwable -> L10
            long r0 = r0.b     // Catch: java.lang.Throwable -> L10
            monitor-exit(r5)
            return r0
        L18:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // com.danikula.videocache.q
    public int read(byte[] r5) throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            java.io.InputStream r0 = r4.d
            java.lang.String r1 = "Error reading data from "
            if (r0 == 0) goto L4a
            int r2 = r5.length     // Catch: java.io.IOException -> Ld java.io.InterruptedIOException -> Lf
            r3 = 0
            int r5 = r0.read(r5, r3, r2)     // Catch: java.io.IOException -> Ld java.io.InterruptedIOException -> Lf
            return r5
        Ld:
            r5 = move-exception
            goto L11
        Lf:
            r5 = move-exception
            goto L2a
        L11:
            com.danikula.videocache.ProxyCacheException r0 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.danikula.videocache.s r1 = r4.b
            java.lang.String r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r5)
            throw r0
        L2a:
            com.danikula.videocache.InterruptedProxyCacheException r0 = new com.danikula.videocache.InterruptedProxyCacheException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Reading source "
            r1.append(r2)
            com.danikula.videocache.s r2 = r4.b
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r2 = " is interrupted"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r5)
            throw r0
        L4a:
            com.danikula.videocache.ProxyCacheException r5 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            com.danikula.videocache.s r1 = r4.b
            java.lang.String r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = ": connection is absent!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpUrlSource{sourceInfo='"
            r0.append(r1)
            com.danikula.videocache.s r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
