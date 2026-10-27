package cn.jpush.android.t;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1910b;

    /* renamed from: c, reason: collision with root package name */
    public long f1911c;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.t.b a(java.lang.String r1, java.lang.String r2, long r3) {
            cn.jpush.android.t.b r0 = new cn.jpush.android.t.b
            r0.<init>()
            r0.a = r1
            r0.f1910b = r2
            r0.f1911c = r3
            return r0
    }

    public static cn.jpush.android.t.b a(org.json.JSONObject r3) {
            if (r3 == 0) goto L20
            cn.jpush.android.t.b r0 = new cn.jpush.android.t.b
            r0.<init>()
            java.lang.String r1 = "tpl_id"
            java.lang.String r1 = r3.optString(r1)
            r0.a = r1
            java.lang.String r1 = "tpl_file_name"
            java.lang.String r1 = r3.optString(r1)
            r0.f1910b = r1
            java.lang.String r1 = "tpl_recent_use_time"
            long r1 = r3.optLong(r1)
            r0.f1911c = r1
            return r0
        L20:
            r3 = 0
            return r3
    }

    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "tpl_id"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L1b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "tpl_file_name"
            java.lang.String r2 = r4.f1910b     // Catch: java.lang.Throwable -> L1b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "tpl_recent_use_time"
            long r2 = r4.f1911c     // Catch: java.lang.Throwable -> L1b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "notify inapp toJSON failed. "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "InAppTemplate"
            cn.jpush.android.helper.Logger.w(r1, r0)
            r0 = 0
            return r0
    }
}
