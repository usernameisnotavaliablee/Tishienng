package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y6 extends javax.net.ssl.SSLSocketFactory {
    private javax.net.ssl.SSLSocketFactory a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4271b;

    /* renamed from: c, reason: collision with root package name */
    private javax.net.ssl.SSLContext f4272c;

    public y6(android.content.Context r4, javax.net.ssl.SSLContext r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "<init3>"
            java.lang.String r1 = "<init2>"
            java.lang.String r2 = "myssl"
            if (r4 == 0) goto L18
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L16
            r3.f4271b = r4     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L43
        L18:
            r3.f4272c = r5     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L22
            javax.net.ssl.SSLSocketFactory r4 = r5.getSocketFactory()     // Catch: java.lang.Throwable -> L16
            r3.a = r4     // Catch: java.lang.Throwable -> L16
        L22:
            javax.net.ssl.SSLContext r4 = r3.f4272c     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L31
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getDefault()     // Catch: java.lang.Throwable -> L2d
            r3.f4272c = r4     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r2, r1)
        L31:
            javax.net.ssl.SSLSocketFactory r4 = r3.a     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L66
            javax.net.SocketFactory r4 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch: java.lang.Throwable -> L3e
            javax.net.ssl.SSLSocketFactory r4 = (javax.net.ssl.SSLSocketFactory) r4     // Catch: java.lang.Throwable -> L3e
            r3.a = r4     // Catch: java.lang.Throwable -> L3e
            goto L66
        L3e:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r2, r0)
            return
        L43:
            java.lang.String r5 = "<init>"
            com.amap.api.col.p0003l.w5.p(r4, r2, r5)     // Catch: java.lang.Throwable -> L6b
            javax.net.ssl.SSLContext r4 = r3.f4272c     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L57
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getDefault()     // Catch: java.lang.Throwable -> L53
            r3.f4272c = r4     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r2, r1)
        L57:
            javax.net.ssl.SSLSocketFactory r4 = r3.a     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L66
            javax.net.SocketFactory r4 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch: java.lang.Throwable -> L64
            javax.net.ssl.SSLSocketFactory r4 = (javax.net.ssl.SSLSocketFactory) r4     // Catch: java.lang.Throwable -> L64
            r3.a = r4     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r4 = move-exception
            goto L67
        L66:
            return
        L67:
            com.amap.api.col.p0003l.w5.p(r4, r2, r0)
            return
        L6b:
            r4 = move-exception
            javax.net.ssl.SSLContext r5 = r3.f4272c     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L7b
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getDefault()     // Catch: java.lang.Throwable -> L77
            r3.f4272c = r5     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r5 = move-exception
            com.amap.api.col.p0003l.w5.p(r5, r2, r1)
        L7b:
            javax.net.ssl.SSLSocketFactory r5 = r3.a     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L8c
            javax.net.SocketFactory r5 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch: java.lang.Throwable -> L88
            javax.net.ssl.SSLSocketFactory r5 = (javax.net.ssl.SSLSocketFactory) r5     // Catch: java.lang.Throwable -> L88
            r3.a = r5     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r5 = move-exception
            com.amap.api.col.p0003l.w5.p(r5, r2, r0)
        L8c:
            throw r4
    }

    private static java.net.Socket a(java.net.Socket r3) {
            boolean r0 = com.amap.api.col.3l.g4.g.f3403b     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            boolean r0 = r3 instanceof javax.net.ssl.SSLSocket     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r0 = r3
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "TLSv1.2"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L15
            r0.setEnabledProtocols(r1)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r0 = move-exception
            goto L18
        L17:
            return r3
        L18:
            java.lang.String r1 = "myssl"
            java.lang.String r2 = "stlv2"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return r3
    }

    private void c(android.net.SSLSessionCache r10) {
            r9 = this;
            javax.net.ssl.SSLContext r0 = r9.f4272c
            if (r0 != 0) goto L5
            goto L4b
        L5:
            javax.net.ssl.SSLSessionContext r0 = r0.getClientSessionContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "UbVNlc3Npb25DYWNoZQ"
            java.lang.String r2 = com.amap.api.col.p0003l.q4.u(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L46
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Throwable -> L46
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "Yc2V0UGVyc2lzdGVudENhY2hl"
            java.lang.String r3 = com.amap.api.col.p0003l.q4.u(r3)     // Catch: java.lang.Throwable -> L46
            int r4 = r1.length     // Catch: java.lang.Throwable -> L46
            r5 = 0
            r6 = 0
        L30:
            if (r6 >= r4) goto L4b
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L46
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L48
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L46
            r1[r5] = r10     // Catch: java.lang.Throwable -> L46
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r10 = move-exception
            goto L4c
        L48:
            int r6 = r6 + 1
            goto L30
        L4b:
            return
        L4c:
            java.lang.String r0 = "myssl"
            java.lang.String r1 = "isc2"
            com.amap.api.col.p0003l.w5.p(r10, r0, r1)
            return
    }

    private static void d(java.net.Socket r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = com.amap.api.col.3l.g4.g.f3404c
            if (r1 == 0) goto L48
            boolean r1 = com.amap.api.col.3l.g4.g.f3406e
            if (r1 != 0) goto Lb
            goto L48
        Lb:
            boolean r1 = r6 instanceof javax.net.ssl.SSLSocket
            if (r1 != 0) goto L10
            goto L48
        L10:
            int r1 = com.amap.api.col.3l.g4.g.f3407f
            int r2 = com.amap.api.col.3l.g4.g.f3405d
            if (r1 <= r2) goto L17
            goto L19
        L17:
            int r2 = com.amap.api.col.3l.g4.g.f3407f
        L19:
            r1 = 17
            if (r2 <= r1) goto L20
            if (r0 <= r2) goto L20
            goto L48
        L20:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r1 = "Cc2V0VXNlU2Vzc2lvblRpY2tldHM"
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)     // Catch: java.lang.Throwable -> L40
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L40
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L40
            r1[r5] = r2     // Catch: java.lang.Throwable -> L40
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r6 = move-exception
            java.lang.String r0 = "myssl"
            java.lang.String r1 = "sust"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
        L48:
            return
    }

    public final void b() {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = com.amap.api.col.3l.g4.g.f3404c
            if (r1 != 0) goto L7
            goto L5a
        L7:
            android.content.Context r1 = r8.f4271b
            if (r1 == 0) goto L5a
            javax.net.ssl.SSLContext r1 = r8.f4272c
            if (r1 != 0) goto L10
            goto L5a
        L10:
            int r1 = com.amap.api.col.3l.g4.g.f3405d
            r2 = 17
            if (r1 <= r2) goto L19
            if (r0 <= r1) goto L19
            goto L5a
        L19:
            android.net.SSLSessionCache r1 = new android.net.SSLSessionCache
            android.content.Context r2 = r8.f4271b
            r1.<init>(r2)
            r2 = 28
            if (r0 >= r2) goto L57
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "MaW5zdGFsbA"
            java.lang.String r2 = com.amap.api.col.p0003l.q4.u(r2)     // Catch: java.lang.Throwable -> L4b
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<android.net.SSLSessionCache> r5 = android.net.SSLSessionCache.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<javax.net.ssl.SSLContext> r5 = javax.net.ssl.SSLContext.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L4b
            javax.net.ssl.SSLContext r2 = r8.f4272c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4b
            r3[r6] = r1     // Catch: java.lang.Throwable -> L4b
            r3[r7] = r2     // Catch: java.lang.Throwable -> L4b
            r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r0 = move-exception
            java.lang.String r2 = "myssl"
            java.lang.String r3 = "isc1"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)
            r8.c(r1)
            return
        L57:
            r8.c(r1)
        L5a:
            return
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket() throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLSocketFactory r0 = r3.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1c
            java.net.Socket r0 = r0.createSocket()     // Catch: java.lang.Throwable -> L10
            java.net.Socket r0 = a(r0)     // Catch: java.lang.Throwable -> L10
            d(r0)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            java.lang.String r1 = "myssl"
            java.lang.String r2 = "cs1"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1e
        L1c:
            r0 = 0
            return r0
        L1e:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L20
            java.net.Socket r2 = r0.createSocket(r2, r3)     // Catch: java.lang.Throwable -> L10
            java.net.Socket r2 = a(r2)     // Catch: java.lang.Throwable -> L10
            d(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "myssl"
            java.lang.String r0 = "cs3"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            boolean r3 = r2 instanceof java.net.UnknownHostException
            if (r3 != 0) goto L25
            boolean r3 = r2 instanceof java.io.IOException
            if (r3 != 0) goto L22
        L20:
            r2 = 0
            return r2
        L22:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L25:
            java.net.UnknownHostException r2 = (java.net.UnknownHostException) r2
            throw r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException, java.net.UnknownHostException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L20
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            java.net.Socket r2 = a(r2)     // Catch: java.lang.Throwable -> L10
            d(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "myssl"
            java.lang.String r4 = "cs4"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
            boolean r3 = r2 instanceof java.net.UnknownHostException
            if (r3 != 0) goto L25
            boolean r3 = r2 instanceof java.io.IOException
            if (r3 != 0) goto L22
        L20:
            r2 = 0
            return r2
        L22:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L25:
            java.net.UnknownHostException r2 = (java.net.UnknownHostException) r2
            throw r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1c
            java.net.Socket r2 = r0.createSocket(r2, r3)     // Catch: java.lang.Throwable -> L10
            java.net.Socket r2 = a(r2)     // Catch: java.lang.Throwable -> L10
            d(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "myssl"
            java.lang.String r0 = "cs5"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            boolean r3 = r2 instanceof java.io.IOException
            if (r3 != 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1c
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            java.net.Socket r2 = a(r2)     // Catch: java.lang.Throwable -> L10
            d(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "myssl"
            java.lang.String r4 = "cs6"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
            boolean r3 = r2 instanceof java.io.IOException
            if (r3 != 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1c
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            java.net.Socket r2 = a(r2)     // Catch: java.lang.Throwable -> L10
            d(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.String r3 = "myssl"
            java.lang.String r4 = "cs2"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
            boolean r3 = r2 instanceof java.io.IOException
            if (r3 != 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
            r3 = this;
            javax.net.ssl.SSLSocketFactory r0 = r3.a     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r0.getDefaultCipherSuites()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "myssl"
            java.lang.String r2 = "gdcs"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L11:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
            r3 = this;
            javax.net.ssl.SSLSocketFactory r0 = r3.a     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r0.getSupportedCipherSuites()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "myssl"
            java.lang.String r2 = "gscs"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L11:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }
}
