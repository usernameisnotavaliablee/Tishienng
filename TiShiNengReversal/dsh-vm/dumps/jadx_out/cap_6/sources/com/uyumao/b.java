package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b implements java.lang.Runnable {
    public final /* synthetic */ android.content.Context a;

    public b(android.content.Context r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> L72
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L72
            r1.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L72
            r1.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "net_change"
            r1.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L72
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = com.uyumao.e.b(r0)     // Catch: java.lang.Throwable -> L72
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L72
            r2 = 0
            if (r1 != 0) goto L4b
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L72
            int r1 = r0.length     // Catch: java.lang.Throwable -> L72
            if (r1 <= 0) goto L4b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            int r3 = r0.length     // Catch: java.lang.Throwable -> L72
            r4 = 0
        L3c:
            if (r4 >= r3) goto L4c
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L72
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L72
            r1.put(r6)     // Catch: java.lang.Throwable -> L72
            int r4 = r4 + 1
            goto L3c
        L4b:
            r1 = 0
        L4c:
            android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L72
            android.content.Context r3 = com.uyumao.j.a     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L5e
            if (r0 == 0) goto L5e
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L72
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L72
            com.uyumao.j.a = r0     // Catch: java.lang.Throwable -> L72
        L5e:
            com.uyumao.j r0 = com.uyumao.j.a.a     // Catch: java.lang.Throwable -> L72
            com.uyumao.i r0 = r0.a()     // Catch: java.lang.Throwable -> L72
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> L72
            org.json.JSONObject r0 = com.uyumao.c.a(r3, r0, r1)     // Catch: java.lang.Throwable -> L72
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L6f
            r2 = 1
        L6f:
            com.uyumao.c.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L72
        L72:
            return
    }
}
