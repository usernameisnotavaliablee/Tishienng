package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bc {
    private org.json.JSONObject a;

    public bc(android.content.Context r3, java.lang.String r4, int r5) {
            r2 = this;
            r2.<init>()
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess
            if (r0 == 0) goto L21
            com.kuaishou.weapon.p0.jni.Engine r3 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r3)     // Catch: java.lang.Throwable -> L21
            boolean r0 = com.kuaishou.weapon.p0.cu.a()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            java.lang.String r3 = r3.pqr(r5, r1, r0, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L21
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L21
            r2.a = r4     // Catch: java.lang.Throwable -> L21
        L21:
            return
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
}
