package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class h extends com.danikula.videocache.o {
    private static final float n = 0.2f;
    private final com.danikula.videocache.k k;
    private final com.danikula.videocache.file.b l;
    private com.danikula.videocache.e m;

    public h(com.danikula.videocache.k r1, com.danikula.videocache.file.b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.l = r2
            r0.k = r1
            return
    }

    private java.lang.String p(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    private boolean q(com.danikula.videocache.g r9) throws com.danikula.videocache.ProxyCacheException {
            r8 = this;
            com.danikula.videocache.k r0 = r8.k
            long r0 = r0.length()
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            com.danikula.videocache.file.b r3 = r8.l
            long r6 = r3.available()
            if (r2 == 0) goto L2e
            boolean r2 = r9.c
            if (r2 == 0) goto L2e
            long r2 = r9.b
            float r9 = (float) r2
            float r2 = (float) r6
            float r0 = (float) r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r1
            float r2 = r2 + r0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L2d
            goto L2e
        L2d:
            return r4
        L2e:
            return r5
    }

    private java.lang.String r(com.danikula.videocache.g r13) throws java.io.IOException, com.danikula.videocache.ProxyCacheException {
            r12 = this;
            com.danikula.videocache.k r0 = r12.k
            java.lang.String r0 = r0.d()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            com.danikula.videocache.file.b r2 = r12.l
            boolean r2 = r2.isCompleted()
            if (r2 == 0) goto L19
            com.danikula.videocache.file.b r2 = r12.l
            long r2 = r2.available()
            goto L1f
        L19:
            com.danikula.videocache.k r2 = r12.k
            long r2 = r2.length()
        L1f:
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = 0
        L2a:
            boolean r5 = r13.c
            if (r5 == 0) goto L33
            long r8 = r13.b
            long r8 = r2 - r8
            goto L34
        L33:
            r8 = r2
        L34:
            if (r4 == 0) goto L3a
            if (r5 == 0) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r11 = r13.c
            if (r11 == 0) goto L47
            java.lang.String r11 = "HTTP/1.1 206 PARTIAL CONTENT\n"
            goto L49
        L47:
            java.lang.String r11 = "HTTP/1.1 200 OK\n"
        L49:
            r10.append(r11)
            java.lang.String r11 = "Accept-Ranges: bytes\n"
            r10.append(r11)
            java.lang.String r11 = ""
            if (r4 == 0) goto L64
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r4
            java.lang.String r4 = "Content-Length: %d\n"
            java.lang.String r4 = r12.p(r4, r8)
            goto L65
        L64:
            r4 = r11
        L65:
            r10.append(r4)
            if (r5 == 0) goto L8d
            long r4 = r13.b
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r4 = 1
            long r4 = r2 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r13
            r3[r7] = r4
            r13 = 2
            r3[r13] = r2
            java.lang.String r13 = "Content-Range: bytes %d-%d/%d\n"
            java.lang.String r13 = r12.p(r13, r3)
            goto L8e
        L8d:
            r13 = r11
        L8e:
            r10.append(r13)
            if (r1 != 0) goto L9d
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r6] = r0
            java.lang.String r0 = "Content-Type: %s\n"
            java.lang.String r11 = r12.p(r0, r13)
        L9d:
            r10.append(r11)
            java.lang.String r13 = "\n"
            r10.append(r13)
            java.lang.String r13 = r10.toString()
            return r13
    }

    private void u(java.io.OutputStream r5, long r6) throws com.danikula.videocache.ProxyCacheException, java.io.IOException {
            r4 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
        L4:
            int r2 = r4.j(r1, r6, r0)
            r3 = -1
            if (r2 == r3) goto L12
            r3 = 0
            r5.write(r1, r3, r2)
            long r2 = (long) r2
            long r6 = r6 + r2
            goto L4
        L12:
            r5.flush()
            return
    }

    private void v(java.io.OutputStream r3, long r4) throws com.danikula.videocache.ProxyCacheException, java.io.IOException {
            r2 = this;
            com.danikula.videocache.k r0 = new com.danikula.videocache.k
            com.danikula.videocache.k r1 = r2.k
            r0.<init>(r1)
            int r5 = (int) r4
            long r4 = (long) r5
            r0.a(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1c
        L10:
            int r5 = r0.read(r4)     // Catch: java.lang.Throwable -> L1c
            r1 = -1
            if (r5 == r1) goto L1e
            r1 = 0
            r3.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L1c
            goto L10
        L1c:
            r3 = move-exception
            goto L25
        L1e:
            r3.flush()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L25:
            r0.close()
            throw r3
    }

    @Override // com.danikula.videocache.o
    protected void g(int r4) {
            r3 = this;
            com.danikula.videocache.e r0 = r3.m
            if (r0 == 0) goto L11
            com.danikula.videocache.file.b r1 = r3.l
            java.io.File r1 = r1.b
            com.danikula.videocache.k r2 = r3.k
            java.lang.String r2 = r2.e()
            r0.a(r1, r2, r4)
        L11:
            return
    }

    public void s(com.danikula.videocache.g r4, java.net.Socket r5) throws java.io.IOException, com.danikula.videocache.ProxyCacheException {
            r3 = this;
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r5 = r5.getOutputStream()
            r0.<init>(r5)
            java.lang.String r5 = r3.r(r4)
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)
            r0.write(r5)
            long r1 = r4.b
            boolean r4 = r3.q(r4)
            if (r4 == 0) goto L22
            r3.u(r0, r1)
            return
        L22:
            r3.v(r0, r1)
            return
    }

    public void t(com.danikula.videocache.e r1) {
            r0 = this;
            r0.m = r1
            return
    }
}
