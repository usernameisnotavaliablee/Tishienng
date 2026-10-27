package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class oq extends java.net.ProxySelector {
    private static final java.util.List<java.net.Proxy> j = null;
    private final java.lang.String cw;

    /* renamed from: r, reason: collision with root package name */
    private final int f1720r;
    private final java.net.ProxySelector xt;

    static {
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.bykv.vk.openvk.component.video.j.xt.oq.j = r0
            return
    }

    private oq(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            r1.xt = r0
            r1.cw = r2
            r1.f1720r = r3
            return
    }

    static void j(java.lang.String r1, int r2) {
            com.bykv.vk.openvk.component.video.j.xt.oq r0 = new com.bykv.vk.openvk.component.video.j.xt.oq
            r0.<init>(r1, r2)
            java.net.ProxySelector.setDefault(r0)
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI r2, java.net.SocketAddress r3, java.io.IOException r4) {
            r1 = this;
            java.net.ProxySelector r0 = r1.xt
            r0.connectFailed(r2, r3, r4)
            return
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI r3) {
            r2 = this;
            if (r3 == 0) goto L20
            java.lang.String r0 = r2.cw
            java.lang.String r1 = r3.getHost()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L19
            int r0 = r2.f1720r
            int r1 = r3.getPort()
            if (r0 != r1) goto L19
            java.util.List<java.net.Proxy> r3 = com.bykv.vk.openvk.component.video.j.xt.oq.j
            return r3
        L19:
            java.net.ProxySelector r0 = r2.xt
            java.util.List r3 = r0.select(r3)
            return r3
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI can't be null"
            r3.<init>(r0)
            throw r3
    }
}
