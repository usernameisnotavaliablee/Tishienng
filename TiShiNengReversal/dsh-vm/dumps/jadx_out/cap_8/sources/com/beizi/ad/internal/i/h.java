package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h implements com.beizi.ad.internal.i.o {
    private final com.beizi.ad.internal.i.b.c a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.i.p f6984b;

    /* renamed from: c, reason: collision with root package name */
    private java.net.HttpURLConnection f6985c;

    /* renamed from: d, reason: collision with root package name */
    private java.io.InputStream f6986d;

    public h(com.beizi.ad.internal.i.h r2) {
            r1 = this;
            r1.<init>()
            com.beizi.ad.internal.i.p r0 = r2.f6984b
            r1.f6984b = r0
            com.beizi.ad.internal.i.b.c r2 = r2.a
            r1.a = r2
            return
    }

    public h(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.internal.i.b.c r0 = com.beizi.ad.internal.i.b.d.a()
            r1.<init>(r2, r0)
            return
    }

    public h(java.lang.String r3, com.beizi.ad.internal.i.b.c r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = com.beizi.ad.internal.i.k.a(r4)
            com.beizi.ad.internal.i.b.c r0 = (com.beizi.ad.internal.i.b.c) r0
            r2.a = r0
            com.beizi.ad.internal.i.p r4 = r4.a(r3)
            if (r4 == 0) goto L12
            goto L1d
        L12:
            com.beizi.ad.internal.i.p r4 = new com.beizi.ad.internal.i.p
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r1 = com.beizi.ad.internal.i.n.a(r3)
            r4.<init>(r3, r0, r1)
        L1d:
            r2.f6984b = r4
            return
    }

    private int a(java.net.HttpURLConnection r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r2 = r2.getContentLength()
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L9
            return r2
        L9:
            r0 = 206(0xce, float:2.89E-43)
            if (r4 != r0) goto Lf
            int r2 = r2 + r3
            return r2
        Lf:
            com.beizi.ad.internal.i.p r2 = r1.f6984b
            int r2 = r2.f6996b
            return r2
    }

    private java.net.HttpURLConnection a(int r7, int r8) throws java.io.IOException, com.beizi.ad.internal.i.m {
            r6 = this;
            com.beizi.ad.internal.i.p r0 = r6.f6984b
            java.lang.String r0 = r0.a
            r1 = 0
            r2 = 0
        L6:
            java.net.URL r3 = new java.net.URL
            r3.<init>(r0)
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            if (r7 <= 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = "-"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L2e:
            if (r8 <= 0) goto L36
            r3.setConnectTimeout(r8)
            r3.setReadTimeout(r8)
        L36:
            int r4 = r3.getResponseCode()
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L49
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L49
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 != r5) goto L47
            goto L49
        L47:
            r4 = 0
            goto L4a
        L49:
            r4 = 1
        L4a:
            if (r4 == 0) goto L57
            java.lang.String r0 = "Location"
            java.lang.String r0 = r3.getHeaderField(r0)
            int r2 = r2 + 1
            r3.disconnect()
        L57:
            r5 = 5
            if (r2 > r5) goto L5d
            if (r4 != 0) goto L6
            return r3
        L5d:
            com.beizi.ad.internal.i.m r7 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Too many redirects: "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private void e() throws com.beizi.ad.internal.i.m {
            r6 = this;
            r0 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            java.net.HttpURLConnection r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c
            int r1 = r0.getContentLength()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.lang.String r3 = r0.getContentType()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            com.beizi.ad.internal.i.p r4 = new com.beizi.ad.internal.i.p     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            com.beizi.ad.internal.i.p r5 = r6.f6984b     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.lang.String r5 = r5.a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r4.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r6.f6984b = r4     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            com.beizi.ad.internal.i.b.c r1 = r6.a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.lang.String r3 = r4.a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            com.beizi.ad.internal.i.n.a(r2)
            r0.disconnect()
            return
        L2d:
            r1 = move-exception
            goto L33
        L2f:
            goto L3e
        L31:
            r1 = move-exception
            r0 = r2
        L33:
            com.beizi.ad.internal.i.n.a(r2)
            if (r0 == 0) goto L3b
            r0.disconnect()
        L3b:
            throw r1
        L3c:
            r0 = r2
        L3e:
            com.beizi.ad.internal.i.n.a(r2)
            if (r0 == 0) goto L46
            r0.disconnect()
        L46:
            return
    }

    @Override // com.beizi.ad.internal.i.o
    public synchronized int a() throws com.beizi.ad.internal.i.m {
            r2 = this;
            monitor-enter(r2)
            com.beizi.ad.internal.i.p r0 = r2.f6984b     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.f6996b     // Catch: java.lang.Throwable -> Ld
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lf
            r2.e()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L15
        Lf:
            com.beizi.ad.internal.i.p r0 = r2.f6984b     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.f6996b     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // com.beizi.ad.internal.i.o
    public int a(byte[] r5) throws com.beizi.ad.internal.i.m {
            r4 = this;
            java.io.InputStream r0 = r4.f6986d
            java.lang.String r1 = "Error reading data failFrom "
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
            com.beizi.ad.internal.i.m r0 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.beizi.ad.internal.i.p r1 = r4.f6984b
            java.lang.String r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r5)
            throw r0
        L2a:
            com.beizi.ad.internal.i.i r0 = new com.beizi.ad.internal.i.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Reading source "
            r1.append(r2)
            com.beizi.ad.internal.i.p r2 = r4.f6984b
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r2 = " is interrupted"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r5)
            throw r0
        L4a:
            com.beizi.ad.internal.i.m r5 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            com.beizi.ad.internal.i.p r1 = r4.f6984b
            java.lang.String r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = ": connection is absent!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // com.beizi.ad.internal.i.o
    public void a(int r5) throws com.beizi.ad.internal.i.m {
            r4 = this;
            r0 = -1
            java.net.HttpURLConnection r0 = r4.a(r5, r0)     // Catch: java.io.IOException -> L37
            r4.f6985c = r0     // Catch: java.io.IOException -> L37
            java.lang.String r0 = r0.getContentType()     // Catch: java.io.IOException -> L37
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L37
            java.net.HttpURLConnection r2 = r4.f6985c     // Catch: java.io.IOException -> L37
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.io.IOException -> L37
            r3 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L37
            r4.f6986d = r1     // Catch: java.io.IOException -> L37
            java.net.HttpURLConnection r1 = r4.f6985c     // Catch: java.io.IOException -> L37
            int r2 = r1.getResponseCode()     // Catch: java.io.IOException -> L37
            int r1 = r4.a(r1, r5, r2)     // Catch: java.io.IOException -> L37
            com.beizi.ad.internal.i.p r2 = new com.beizi.ad.internal.i.p     // Catch: java.io.IOException -> L37
            com.beizi.ad.internal.i.p r3 = r4.f6984b     // Catch: java.io.IOException -> L37
            java.lang.String r3 = r3.a     // Catch: java.io.IOException -> L37
            r2.<init>(r3, r1, r0)     // Catch: java.io.IOException -> L37
            r4.f6984b = r2     // Catch: java.io.IOException -> L37
            com.beizi.ad.internal.i.b.c r0 = r4.a     // Catch: java.io.IOException -> L37
            java.lang.String r1 = r2.a     // Catch: java.io.IOException -> L37
            r0.a(r1, r2)     // Catch: java.io.IOException -> L37
            return
        L37:
            r0 = move-exception
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error opening connection for "
            r2.append(r3)
            com.beizi.ad.internal.i.p r3 = r4.f6984b
            java.lang.String r3 = r3.a
            r2.append(r3)
            java.lang.String r3 = " with offset "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    @Override // com.beizi.ad.internal.i.o
    public void b() throws com.beizi.ad.internal.i.m {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.f6985c
            if (r0 == 0) goto L13
            r0.disconnect()     // Catch: java.lang.IllegalArgumentException -> L8 java.lang.NullPointerException -> La
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            r0 = move-exception
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Wait... but why? WTF!? "
            r1.<init>(r2, r0)
            throw r1
        L13:
            return
    }

    public synchronized java.lang.String c() throws com.beizi.ad.internal.i.m {
            r1 = this;
            monitor-enter(r1)
            com.beizi.ad.internal.i.p r0 = r1.f6984b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.f6997c     // Catch: java.lang.Throwable -> Lf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r1.e()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L17
        L11:
            com.beizi.ad.internal.i.p r0 = r1.f6984b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.f6997c     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public java.lang.String d() {
            r1 = this;
            com.beizi.ad.internal.i.p r0 = r1.f6984b
            java.lang.String r0 = r0.a
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpUrlSource{sourceInfo='"
            r0.append(r1)
            com.beizi.ad.internal.i.p r1 = r2.f6984b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
