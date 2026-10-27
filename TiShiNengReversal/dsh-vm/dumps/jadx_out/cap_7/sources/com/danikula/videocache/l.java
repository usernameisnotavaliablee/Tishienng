package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class l extends java.net.ProxySelector {
    private static final java.util.List<java.net.Proxy> d = null;
    private final java.net.ProxySelector a;
    private final java.lang.String b;
    private final int c;

    static {
            r0 = 1
            java.net.Proxy[] r0 = new java.net.Proxy[r0]
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.danikula.videocache.l.d = r0
            return
    }

    l(java.net.ProxySelector r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.danikula.videocache.n.d(r1)
            java.net.ProxySelector r1 = (java.net.ProxySelector) r1
            r0.a = r1
            java.lang.Object r1 = com.danikula.videocache.n.d(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.b = r1
            r0.c = r3
            return
    }

    static void a(java.lang.String r2, int r3) {
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            com.danikula.videocache.l r1 = new com.danikula.videocache.l
            r1.<init>(r0, r2, r3)
            java.net.ProxySelector.setDefault(r1)
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI r2, java.net.SocketAddress r3, java.io.IOException r4) {
            r1 = this;
            java.net.ProxySelector r0 = r1.a
            r0.connectFailed(r2, r3, r4)
            return
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI r3) {
            r2 = this;
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.getHost()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            int r0 = r2.c
            int r1 = r3.getPort()
            if (r0 != r1) goto L17
            java.util.List<java.net.Proxy> r3 = com.danikula.videocache.l.d
            return r3
        L17:
            java.net.ProxySelector r0 = r2.a
            java.util.List r3 = r0.select(r3)
            return r3
    }
}
