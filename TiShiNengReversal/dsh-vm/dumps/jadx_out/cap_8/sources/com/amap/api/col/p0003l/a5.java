package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a5 {

    /* renamed from: e, reason: collision with root package name */
    public static int f2955e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f2956f = 2;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f2957b;

    /* renamed from: c, reason: collision with root package name */
    private long f2958c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f2959d;

    static {
            return
    }

    private a5(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.f2957b = r1
            r0.f2959d = r2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f2958c = r1
            return
    }

    public static com.amap.api.col.p0003l.a5 b(java.lang.String r2, java.lang.String r3) {
            com.amap.api.col.3l.a5 r0 = new com.amap.api.col.3l.a5
            int r1 = com.amap.api.col.p0003l.a5.f2955e
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static java.lang.String c(int r1) {
            int r0 = com.amap.api.col.p0003l.a5.f2956f
            if (r1 != r0) goto L7
            java.lang.String r1 = "error"
            return r1
        L7:
            java.lang.String r1 = "info"
            return r1
    }

    public static java.lang.String d(java.util.List<com.amap.api.col.p0003l.a5> r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L33
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Lb
            goto L33
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L33
        L14:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L33
            com.amap.api.col.3l.a5 r2 = (com.amap.api.col.p0003l.a5) r2     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = h(r2)     // Catch: java.lang.Throwable -> L33
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L14
            r1.put(r2)     // Catch: java.lang.Throwable -> L33
            goto L14
        L2e:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L33
            return r4
        L33:
            return r0
    }

    public static boolean e(com.amap.api.col.p0003l.a5 r0) {
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.g()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static com.amap.api.col.p0003l.a5 f(java.lang.String r2, java.lang.String r3) {
            com.amap.api.col.3l.a5 r0 = new com.amap.api.col.3l.a5
            int r1 = com.amap.api.col.p0003l.a5.f2956f
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static java.lang.String h(com.amap.api.col.p0003l.a5 r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "info"
            java.lang.String r2 = r4.g()     // Catch: java.lang.Throwable -> L23
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "session"
            java.lang.String r2 = r4.j()     // Catch: java.lang.Throwable -> L23
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "timestamp"
            long r2 = r4.f2958c     // Catch: java.lang.Throwable -> L23
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r0.toString()
            return r4
        L23:
            java.lang.String r4 = ""
            return r4
    }

    private java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.f2959d
            return r0
    }

    public final int a() {
            r1 = this;
            int r0 = r1.f2957b
            return r0
    }

    public final java.lang.String g() {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String i() {
            r1 = this;
            int r0 = r1.f2957b
            java.lang.String r0 = c(r0)
            return r0
    }
}
