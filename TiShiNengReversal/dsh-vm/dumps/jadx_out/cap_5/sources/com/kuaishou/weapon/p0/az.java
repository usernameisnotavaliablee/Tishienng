package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class az {
    private org.json.JSONObject a;

    public az(android.content.Context r4, int r5) {
            r3 = this;
            r3.<init>()
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess
            if (r0 == 0) goto L2f
            com.kuaishou.weapon.p0.jni.Engine r4 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r4)     // Catch: java.lang.Throwable -> L2f
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = 10
        L11:
            java.lang.String r0 = com.kuaishou.weapon.p0.ck.c     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = ""
            r2 = 2
            java.lang.String r4 = r4.pqr(r0, r2, r5, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L2f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            r3.a = r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            return
    }

    private java.lang.String b(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L9
            return r2
        L9:
            r2 = 0
            return r2
    }

    public org.json.JSONObject a(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r1.b(r2)     // Catch: java.lang.Exception -> L10
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L10
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L10
            r0.<init>(r2)     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r2 = 0
            return r2
    }
}
