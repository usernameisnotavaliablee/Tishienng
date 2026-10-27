package xyz.adscope.common.network.simple.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum CacheMode extends java.lang.Enum<xyz.adscope.common.network.simple.cache.CacheMode> {
    public static final xyz.adscope.common.network.simple.cache.CacheMode HTTP = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode HTTP_YES_THEN_WRITE_CACHE = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode NETWORK = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode NETWORK_NO_THEN_READ_CACHE = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode NETWORK_YES_THEN_HTTP = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode NETWORK_YES_THEN_WRITE_CACHE = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode READ_CACHE = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode READ_CACHE_NO_THEN_HTTP = null;
    public static final xyz.adscope.common.network.simple.cache.CacheMode READ_CACHE_NO_THEN_NETWORK = null;
    private static final /* synthetic */ xyz.adscope.common.network.simple.cache.CacheMode[] a = null;

    static {
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "HTTP"
            r2 = 0
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.HTTP = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "HTTP_YES_THEN_WRITE_CACHE"
            r2 = 1
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.HTTP_YES_THEN_WRITE_CACHE = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "NETWORK"
            r2 = 2
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.NETWORK = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "NETWORK_YES_THEN_HTTP"
            r2 = 3
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_HTTP = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "NETWORK_YES_THEN_WRITE_CACHE"
            r2 = 4
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_WRITE_CACHE = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "NETWORK_NO_THEN_READ_CACHE"
            r2 = 5
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_NO_THEN_READ_CACHE = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "READ_CACHE"
            r2 = 6
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "READ_CACHE_NO_THEN_NETWORK"
            r2 = 7
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_NETWORK = r0
            xyz.adscope.common.network.simple.cache.CacheMode r0 = new xyz.adscope.common.network.simple.cache.CacheMode
            java.lang.String r1 = "READ_CACHE_NO_THEN_HTTP"
            r2 = 8
            r0.<init>(r1, r2)
            xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_HTTP = r0
            xyz.adscope.common.network.simple.cache.CacheMode[] r0 = a()
            xyz.adscope.common.network.simple.cache.CacheMode.a = r0
            return
    }

    CacheMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static /* synthetic */ xyz.adscope.common.network.simple.cache.CacheMode[] a() {
            r0 = 9
            xyz.adscope.common.network.simple.cache.CacheMode[] r0 = new xyz.adscope.common.network.simple.cache.CacheMode[r0]
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP
            r2 = 0
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.HTTP_YES_THEN_WRITE_CACHE
            r2 = 1
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK
            r2 = 2
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_HTTP
            r2 = 3
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_YES_THEN_WRITE_CACHE
            r2 = 4
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.NETWORK_NO_THEN_READ_CACHE
            r2 = 5
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE
            r2 = 6
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_NETWORK
            r2 = 7
            r0[r2] = r1
            xyz.adscope.common.network.simple.cache.CacheMode r1 = xyz.adscope.common.network.simple.cache.CacheMode.READ_CACHE_NO_THEN_HTTP
            r2 = 8
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.common.network.simple.cache.CacheMode valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.common.network.simple.cache.CacheMode> r0 = xyz.adscope.common.network.simple.cache.CacheMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.common.network.simple.cache.CacheMode r1 = (xyz.adscope.common.network.simple.cache.CacheMode) r1
            return r1
    }

    public static xyz.adscope.common.network.simple.cache.CacheMode[] values() {
            xyz.adscope.common.network.simple.cache.CacheMode[] r0 = xyz.adscope.common.network.simple.cache.CacheMode.a
            java.lang.Object r0 = r0.clone()
            xyz.adscope.common.network.simple.cache.CacheMode[] r0 = (xyz.adscope.common.network.simple.cache.CacheMode[]) r0
            return r0
    }
}
