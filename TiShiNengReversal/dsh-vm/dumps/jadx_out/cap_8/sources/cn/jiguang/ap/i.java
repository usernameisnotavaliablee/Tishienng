package cn.jiguang.ap;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i extends cn.jiguang.am.a {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private long f603b;

    /* renamed from: c, reason: collision with root package name */
    private long f604c;

    /* renamed from: d, reason: collision with root package name */
    private long f605d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f606e;

    public i(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "NET_DATA"
            r1.<init>(r2, r0)
            return
    }

    @Override // cn.jiguang.am.a
    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "url"
            java.lang.String r2 = r4.f606e     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "res"
            long r2 = r4.f604c     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "req"
            long r2 = r4.f603b     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "type"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "count"
            long r2 = r4.f605d     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            return r0
        L29:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "build getExtraJson data failed, "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "NetDataLengthMonitor"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }

    public void a(long r1) {
            r0 = this;
            r0.f604c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f606e = r1
            return
    }

    public void b(long r1) {
            r0 = this;
            r0.f603b = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void c(long r1) {
            r0 = this;
            r0.f605d = r1
            return
    }
}
