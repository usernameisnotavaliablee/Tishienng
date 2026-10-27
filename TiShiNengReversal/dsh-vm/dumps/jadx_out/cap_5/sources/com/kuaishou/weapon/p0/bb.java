package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bb {
    private org.json.JSONObject a;

    public bb(android.content.Context r2, int r3, java.lang.String r4, boolean r5) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess
            if (r0 == 0) goto L29
            if (r5 == 0) goto L29
            com.kuaishou.weapon.p0.jni.Engine r2 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = com.kuaishou.weapon.p0.ck.f     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L29
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L29
            r0 = 0
            java.lang.String r2 = r2.pqr(r5, r0, r3, r4)     // Catch: java.lang.Throwable -> L29
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L29
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r1.a = r3     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    public static boolean a(android.content.Context r3) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L13
            r2 = 23
            if (r1 < r2) goto L11
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            int r3 = com.kuaishou.weapon.p0.g.a(r3, r1)     // Catch: java.lang.Exception -> L13
            r1 = -1
            if (r3 != r1) goto L11
            return r0
        L11:
            r3 = 1
            return r3
        L13:
            return r0
    }

    public java.lang.String a(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L9
            return r2
        L9:
            r2 = 0
            return r2
    }

    public org.json.JSONObject a() {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            return r0
    }
}
