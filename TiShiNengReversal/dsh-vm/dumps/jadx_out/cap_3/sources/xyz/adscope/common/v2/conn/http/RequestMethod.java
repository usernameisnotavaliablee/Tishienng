package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum RequestMethod extends java.lang.Enum<xyz.adscope.common.v2.conn.http.RequestMethod> {
    private static final /* synthetic */ xyz.adscope.common.v2.conn.http.RequestMethod[] $VALUES = null;
    public static final xyz.adscope.common.v2.conn.http.RequestMethod CACHE_IMAGE = null;
    public static final xyz.adscope.common.v2.conn.http.RequestMethod DOWNLOAD = null;
    public static final xyz.adscope.common.v2.conn.http.RequestMethod GET = null;
    public static final xyz.adscope.common.v2.conn.http.RequestMethod POST = null;
    public static final xyz.adscope.common.v2.conn.http.RequestMethod STREAM = null;
    private final java.lang.String name;

    private static /* synthetic */ xyz.adscope.common.v2.conn.http.RequestMethod[] $values() {
            r0 = 5
            xyz.adscope.common.v2.conn.http.RequestMethod[] r0 = new xyz.adscope.common.v2.conn.http.RequestMethod[r0]
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            r2 = 0
            r0[r2] = r1
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            r2 = 1
            r0[r2] = r1
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.DOWNLOAD
            r2 = 2
            r0[r2] = r1
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            r2 = 3
            r0[r2] = r1
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.CACHE_IMAGE
            r2 = 4
            r0[r2] = r1
            return r0
    }

    static {
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = new xyz.adscope.common.v2.conn.http.RequestMethod
            java.lang.String r1 = "POST"
            r2 = 0
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.v2.conn.http.RequestMethod.POST = r0
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = new xyz.adscope.common.v2.conn.http.RequestMethod
            java.lang.String r1 = "GET"
            r2 = 1
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.v2.conn.http.RequestMethod.GET = r0
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = new xyz.adscope.common.v2.conn.http.RequestMethod
            java.lang.String r1 = "DOWNLOAD"
            r2 = 2
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.v2.conn.http.RequestMethod.DOWNLOAD = r0
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = new xyz.adscope.common.v2.conn.http.RequestMethod
            java.lang.String r1 = "STREAM"
            r2 = 3
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.v2.conn.http.RequestMethod.STREAM = r0
            xyz.adscope.common.v2.conn.http.RequestMethod r0 = new xyz.adscope.common.v2.conn.http.RequestMethod
            r1 = 4
            java.lang.String r2 = "CACHE"
            java.lang.String r3 = "CACHE_IMAGE"
            r0.<init>(r3, r1, r2)
            xyz.adscope.common.v2.conn.http.RequestMethod.CACHE_IMAGE = r0
            xyz.adscope.common.v2.conn.http.RequestMethod[] r0 = $values()
            xyz.adscope.common.v2.conn.http.RequestMethod.$VALUES = r0
            return
    }

    RequestMethod(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.name = r3
            return
    }

    public static xyz.adscope.common.v2.conn.http.RequestMethod valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.common.v2.conn.http.RequestMethod> r0 = xyz.adscope.common.v2.conn.http.RequestMethod.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = (xyz.adscope.common.v2.conn.http.RequestMethod) r1
            return r1
    }

    public static xyz.adscope.common.v2.conn.http.RequestMethod[] values() {
            xyz.adscope.common.v2.conn.http.RequestMethod[] r0 = xyz.adscope.common.v2.conn.http.RequestMethod.$VALUES
            java.lang.Object r0 = r0.clone()
            xyz.adscope.common.v2.conn.http.RequestMethod[] r0 = (xyz.adscope.common.v2.conn.http.RequestMethod[]) r0
            return r0
    }

    public java.lang.String getMethodName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
