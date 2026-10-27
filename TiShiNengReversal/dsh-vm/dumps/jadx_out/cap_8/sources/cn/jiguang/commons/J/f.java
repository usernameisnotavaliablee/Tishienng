package cn.jiguang.commons.J;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private org.json.JSONArray a;

    /* renamed from: c, reason: collision with root package name */
    private org.json.JSONArray f833c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONArray f834d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f835e;

    public f() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f835e = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r2.a = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r2.f833c = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r2.f834d = r0
            return
    }

    public int a(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f835e
            int r2 = r0.addAndGet(r2)
            return r2
    }

    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = r3.a
            int r1 = r1.length()
            if (r1 <= 0) goto L14
            org.json.JSONArray r1 = r3.a
            java.lang.String r2 = "g"
            r0.put(r2, r1)
        L14:
            org.json.JSONArray r1 = r3.f833c
            int r1 = r1.length()
            if (r1 <= 0) goto L24
            org.json.JSONArray r1 = r3.f833c
            java.lang.String r2 = "w"
            r0.put(r2, r1)
        L24:
            org.json.JSONArray r1 = r3.f834d
            int r1 = r1.length()
            if (r1 <= 0) goto L33
            org.json.JSONArray r1 = r3.f834d
            java.lang.String r2 = "c"
            r0.put(r2, r1)
        L33:
            return r0
    }

    public void a(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            org.json.JSONArray r0 = r1.f834d
            r0.put(r2)
        L7:
            return
    }

    public void c(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            org.json.JSONArray r0 = r1.a
            r0.put(r2)
        L7:
            return
    }

    public void d(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            org.json.JSONArray r0 = r1.f833c
            r0.put(r2)
        L7:
            return
    }
}
