package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    public java.lang.String a;
    public int b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            return
    }

    public static com.ss.android.socialbase.appdownloader.d a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.ss.android.socialbase.appdownloader.d r0 = new com.ss.android.socialbase.appdownloader.d
            r0.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "device_plans"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Throwable -> L42
            r0.e = r3     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "real_device_plan"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Throwable -> L42
            r0.d = r3     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "error_msg"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Throwable -> L42
            r0.c = r3     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "ah_plan_type"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Throwable -> L42
            r0.a = r3     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Throwable -> L42
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L44
            r3 = -1
            r0.b = r3     // Catch: java.lang.Throwable -> L42
            return r0
        L42:
            r3 = move-exception
            goto L4b
        L44:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L42
            r0.b = r3     // Catch: java.lang.Throwable -> L42
            return r0
        L4b:
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            org.json.JSONObject r0 = r1.d()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void c(org.json.JSONObject r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L2a
        L3:
            java.lang.String r0 = "ah_plan_type"
            java.lang.String r1 = r2.a     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "error_code"
            int r1 = r2.b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "error_msg"
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "real_device_plan"
            java.lang.String r1 = r2.d     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "device_plans"
            java.lang.String r1 = r2.e     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public org.json.JSONObject d() {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.c(r0)
            return r0
    }
}
