package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public int a;

    /* renamed from: c, reason: collision with root package name */
    public int f1021c;

    /* renamed from: d, reason: collision with root package name */
    public int f1022d;

    /* renamed from: e, reason: collision with root package name */
    public int f1023e;

    /* renamed from: f, reason: collision with root package name */
    public int f1024f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1025g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1026h;

    /* renamed from: i, reason: collision with root package name */
    public int f1027i;

    public g() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
            r2.f1021c = r0
            r2.f1022d = r0
            r2.f1023e = r0
            r2.f1024f = r0
            r1 = 0
            r2.f1025g = r1
            r2.f1026h = r1
            r2.f1027i = r0
            return
    }

    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = r3.c()
            java.lang.String r1 = "plugged"
            int r2 = r3.f1027i     // Catch: org.json.JSONException -> L19
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L19
            java.lang.String r1 = "isPlugged"
            boolean r2 = r3.f1026h     // Catch: org.json.JSONException -> L19
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L19
            java.lang.String r1 = "isCharging"
            boolean r2 = r3.f1025g     // Catch: org.json.JSONException -> L19
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L19
        L19:
            return r0
    }

    public org.json.JSONObject c() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "level"
            int r2 = r3.a     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "scale"
            int r2 = r3.f1021c     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "status"
            int r2 = r3.f1022d     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "voltage"
            int r2 = r3.f1024f     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "temperature"
            int r2 = r3.f1023e     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
        L29:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JBatteryInfo{level="
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", scale="
            r0.append(r1)
            int r1 = r2.f1021c
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            int r1 = r2.f1022d
            r0.append(r1)
            java.lang.String r1 = ", temperature="
            r0.append(r1)
            int r1 = r2.f1023e
            r0.append(r1)
            java.lang.String r1 = ", voltage="
            r0.append(r1)
            int r1 = r2.f1024f
            r0.append(r1)
            java.lang.String r1 = ", isCharging="
            r0.append(r1)
            boolean r1 = r2.f1025g
            r0.append(r1)
            java.lang.String r1 = ", isPlugged="
            r0.append(r1)
            boolean r1 = r2.f1026h
            r0.append(r1)
            java.lang.String r1 = ", plugged="
            r0.append(r1)
            int r1 = r2.f1027i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
