package cn.jiguang.ao;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jiguang.am.a {
    private java.lang.String a;

    public c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // cn.jiguang.am.a
    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "sdk_type"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "count"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "build getExtraJson data failed, "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ExceptMonitor"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // cn.jiguang.am.a
    public org.json.JSONObject b() {
            r1 = this;
            org.json.JSONObject r0 = super.b()
            return r0
    }

    @Override // cn.jiguang.am.a
    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = super.c()
            return r0
    }
}
