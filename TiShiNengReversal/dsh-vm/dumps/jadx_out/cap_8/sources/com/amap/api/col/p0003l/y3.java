package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class y3<T, V> extends com.amap.api.col.p0003l.g2 {
    protected T r;
    protected int s;
    protected android.content.Context t;
    protected java.lang.String u;
    protected boolean v;

    public y3(android.content.Context r2, T r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.s = r0
            r0 = 0
            r1.v = r0
            r1.i(r2, r3)
            return
    }

    private void i(android.content.Context r1, T r2) {
            r0 = this;
            r0.t = r1
            r0.r = r2
            r1 = 1
            r0.s = r1
            r1 = 30000(0x7530, float:4.2039E-41)
            r0.setSoTimeout(r1)
            r0.setConnectionTimeout(r1)
            return
    }

    private V j(com.amap.api.col.p0003l.a7 r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            java.lang.Object r1 = r0.f(r1)
            return r1
    }

    private V k(byte[] r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            java.lang.Object r1 = r0.h(r1)
            return r1
    }

    private V n() throws com.amap.api.col.p0003l.fc {
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r10.s
            if (r1 >= r2) goto Lc2
            android.content.Context r2 = r10.t     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            java.net.Proxy r2 = com.amap.api.col.p0003l.o4.c(r2)     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            r10.setProxy(r2)     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            boolean r2 = r10.v     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            if (r2 == 0) goto L20
            com.amap.api.col.3l.a7 r2 = r10.makeHttpRequestNeedHeader()     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            java.lang.Object r0 = r10.j(r2)     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            goto L28
        L1c:
            r2 = move-exception
            goto L33
        L1e:
            r2 = move-exception
            goto L44
        L20:
            byte[] r2 = r10.makeHttpRequest()     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            java.lang.Object r0 = r10.k(r2)     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
        L28:
            int r1 = r10.s     // Catch: com.amap.api.col.p0003l.fc -> L1c com.amap.api.col.p0003l.fk -> L1e java.lang.Throwable -> L2b
            goto L2
        L2b:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "未知错误"
            r0.<init>(r1)
            throw r0
        L33:
            int r1 = r1 + 1
            int r3 = r10.s
            if (r1 >= r3) goto L3a
            goto L2
        L3a:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = r2.a()
            r0.<init>(r1)
            throw r0
        L44:
            int r1 = r1 + 1
            int r3 = r10.s
            java.lang.String r4 = "http或socket连接失败 - ConnectionException"
            java.lang.String r5 = "服务器连接失败 - UnknownServiceException"
            java.lang.String r6 = "socket 连接异常 - SocketException"
            java.lang.String r7 = "http连接失败 - ConnectionException"
            if (r1 >= r3) goto L87
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r8)     // Catch: java.lang.InterruptedException -> L58
            goto L2
        L58:
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            goto L81
        L77:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = r2.a()
            r0.<init>(r1)
            throw r0
        L81:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            r0.<init>(r4)
            throw r0
        L87:
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = r2.a()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = r2.getMessage()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb2
            goto Lbc
        Lb2:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = r2.a()
            r0.<init>(r1)
            throw r0
        Lbc:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            r0.<init>(r4)
            throw r0
        Lc2:
            return r0
    }

    protected V f(com.amap.api.col.p0003l.a7 r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            r1 = 0
            return r1
    }

    protected abstract V g(java.lang.String r1) throws com.amap.api.col.p0003l.fc;

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r5 = this;
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.e()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = 16
            r1.<init>(r2)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = com.amap.api.col.p0003l.ha.f3470c
            r1.put(r2, r3)
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r1.put(r2, r3)
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "3dmap"
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            java.lang.String r2 = "platinfo"
            r1.put(r2, r0)
            android.content.Context r0 = r5.t
            java.lang.String r0 = com.amap.api.col.p0003l.h4.i(r0)
            java.lang.String r2 = "X-INFO"
            r1.put(r2, r0)
            android.content.Context r0 = r5.t
            java.lang.String r0 = com.amap.api.col.p0003l.f4.j(r0)
            java.lang.String r2 = "key"
            r1.put(r2, r0)
            java.lang.String r0 = "logversion"
            java.lang.String r2 = "2.1"
            r1.put(r0, r2)
            return r1
    }

    protected V h(byte[] r4) throws com.amap.api.col.p0003l.fc {
            r3 = this;
            r0 = 0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L9
            goto Lb
        L9:
            r1 = r0
        Lb:
            if (r1 == 0) goto L1e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L16
            goto L1e
        L16:
            com.amap.api.col.p0003l.a4.c(r1)
            java.lang.Object r4 = r3.g(r1)
            return r4
        L1e:
            return r0
    }

    protected abstract java.lang.String l();

    public final V m() throws com.amap.api.col.p0003l.fc {
            r1 = this;
            T r0 = r1.r
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.n()     // Catch: com.amap.api.col.p0003l.fc -> L9
            return r0
        L9:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            throw r0
        Le:
            r0 = 0
            return r0
    }
}
