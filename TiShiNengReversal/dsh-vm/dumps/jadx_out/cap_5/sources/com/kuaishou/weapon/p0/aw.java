package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class aw {
    private org.json.JSONObject a;

    public aw(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess
            if (r0 == 0) goto L2a
            com.kuaishou.weapon.p0.jni.Engine r5 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = com.kuaishou.weapon.p0.ck.k     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = ""
            r2 = 0
            r3 = 1
            java.lang.String r5 = r5.pqr(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L2a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            r4.a = r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public org.json.JSONObject a() {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            return r0
    }

    public org.json.JSONObject a(android.content.Context r5) {
            r4 = this;
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L26
            com.kuaishou.weapon.p0.jni.Engine r5 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = com.kuaishou.weapon.p0.ck.j     // Catch: java.lang.Exception -> L26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L26
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            java.lang.String r5 = r5.pqr(r0, r2, r3, r1)     // Catch: java.lang.Exception -> L26
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L26
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26
            r0.<init>(r5)     // Catch: java.lang.Exception -> L26
            return r0
        L26:
            r5 = 0
            return r5
    }

    public void a(org.json.JSONObject r5) {
            r4 = this;
            org.json.JSONObject r0 = r4.a     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L24
            java.util.Iterator r0 = r0.keys()     // Catch: java.lang.Exception -> L24
        L8:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L24
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L24
            org.json.JSONObject r2 = r4.a     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = r2.getString(r1)     // Catch: java.lang.Exception -> L24
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L24
            if (r3 != 0) goto L8
            r5.put(r1, r2)     // Catch: java.lang.Exception -> L24
            goto L8
        L24:
            return
    }

    public org.json.JSONObject b(android.content.Context r5) {
            r4 = this;
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            com.kuaishou.weapon.p0.jni.Engine r5 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r5)     // Catch: java.lang.Exception -> L2c
            java.lang.String r0 = com.kuaishou.weapon.p0.ck.j     // Catch: java.lang.Exception -> L2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1
            java.lang.String r5 = r5.pqr(r0, r3, r2, r1)     // Catch: java.lang.Exception -> L2c
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L2c
            int r0 = r5.length()     // Catch: java.lang.Exception -> L2c
            if (r0 <= r2) goto L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            r0.<init>(r5)     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            r5 = 0
            return r5
    }

    public org.json.JSONObject c(android.content.Context r5) {
            r4 = this;
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L26
            com.kuaishou.weapon.p0.jni.Engine r5 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = com.kuaishou.weapon.p0.ck.j     // Catch: java.lang.Exception -> L26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L26
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1
            java.lang.String r5 = r5.pqr(r0, r2, r3, r1)     // Catch: java.lang.Exception -> L26
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L26
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26
            r0.<init>(r5)     // Catch: java.lang.Exception -> L26
            return r0
        L26:
            r5 = 0
            return r5
    }

    public org.json.JSONObject d(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "com.freeze.kusr"
            r1 = 0
            boolean r2 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Exception -> L3a
            r3 = 1
            if (r2 == 0) goto L29
            com.kuaishou.weapon.p0.jni.Engine r2 = com.kuaishou.weapon.p0.jni.Engine.getInstance(r8)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = com.kuaishou.weapon.p0.ck.j     // Catch: java.lang.Exception -> L3a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L3a
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = ""
            r6 = 3
            java.lang.String r2 = r2.pqr(r4, r3, r6, r5)     // Catch: java.lang.Exception -> L3a
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L3a
            if (r4 != 0) goto L29
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L3a
            r1 = r4
        L29:
            boolean r8 = com.kuaishou.weapon.p0.bh.a(r8, r0)     // Catch: java.lang.Exception -> L3a
            if (r8 == 0) goto L3a
            if (r1 != 0) goto L37
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
            r8.<init>()     // Catch: java.lang.Exception -> L3a
            r1 = r8
        L37:
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L3a
        L3a:
            return r1
    }
}
