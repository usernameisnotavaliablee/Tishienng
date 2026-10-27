package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i4 {
    public static final java.lang.String[] a = null;

    static {
            java.lang.String r0 = "com.amap.api.services"
            java.lang.String r1 = "com.amap.api.search.admic"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.amap.api.col.s.i4.a = r0
            return
    }

    public i4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.amap.api.col.s.i1 a(boolean r4) {
            java.lang.String r0 = "9.7.0"
            com.amap.api.col.s.i1$a r1 = new com.amap.api.col.s.i1$a     // Catch: com.amap.api.col.s.bv -> L1e
            java.lang.String r2 = "sea"
            java.lang.String r3 = "AMAP SDK Android Search 9.7.0"
            r1.<init>(r2, r0, r3)     // Catch: com.amap.api.col.s.bv -> L1e
            java.lang.String[] r2 = com.amap.api.col.s.i4.a     // Catch: com.amap.api.col.s.bv -> L1e
            com.amap.api.col.s.i1$a r1 = r1.c(r2)     // Catch: com.amap.api.col.s.bv -> L1e
            com.amap.api.col.s.i1$a r4 = r1.b(r4)     // Catch: com.amap.api.col.s.bv -> L1e
            com.amap.api.col.s.i1$a r4 = r4.a(r0)     // Catch: com.amap.api.col.s.bv -> L1e
            com.amap.api.col.s.i1 r4 = r4.d()     // Catch: com.amap.api.col.s.bv -> L1e
            return r4
        L1e:
            r4 = move-exception
            java.lang.String r0 = "ConfigableConst"
            java.lang.String r1 = "getSDKInfo"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            r4 = 0
            return r4
    }

    public static java.lang.String b() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://restsdk.amap.com/v3"
            return r0
        Le:
            java.lang.String r0 = "https://restsdk.amap.com/v3"
            return r0
    }

    public static java.lang.String c() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://restsdk.amap.com/v4"
            return r0
        Le:
            java.lang.String r0 = "https://restsdk.amap.com/v4"
            return r0
    }

    public static java.lang.String d() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://restsdk.amap.com/v5"
            return r0
        Le:
            java.lang.String r0 = "https://restsdk.amap.com/v5"
            return r0
    }

    public static java.lang.String e() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://yuntuapi.amap.com"
            return r0
        Le:
            java.lang.String r0 = "https://yuntuapi.amap.com"
            return r0
    }

    public static java.lang.String f() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://restsdk.amap.com/rest/me/cpoint"
            return r0
        Le:
            java.lang.String r0 = "https://restsdk.amap.com/rest/me/cpoint"
            return r0
    }

    public static java.lang.String g() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://apistore.amap.com"
            return r0
        Le:
            java.lang.String r0 = "https://apistore.amap.com"
            return r0
    }

    public static java.lang.String h() {
            com.amap.api.services.core.ServiceSettings r0 = com.amap.api.services.core.ServiceSettings.getInstance()
            int r0 = r0.getProtocol()
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.String r0 = "http://m5.amap.com/ws/mapapi/shortaddress/transform"
            return r0
        Le:
            java.lang.String r0 = "https://m5.amap.com/ws/mapapi/shortaddress/transform"
            return r0
    }
}
