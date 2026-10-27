package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ch {
    private android.content.Context a;
    private int b;

    public ch(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public java.lang.String a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            com.kuaishou.weapon.p0.cm r1 = new com.kuaishou.weapon.p0.cm     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = com.kuaishou.weapon.p0.ck.l     // Catch: java.lang.Throwable -> L28
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L28
            android.content.Context r4 = r3.a     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r4 = r1.a(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L11
            return r0
        L11:
            org.json.JSONObject r1 = r3.a()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L1e
            goto L28
        L1e:
            java.lang.String r2 = "module_section"
            r4.put(r2, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            return r0
    }

    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "re_po_rt"
            com.kuaishou.weapon.p0.h r1 = com.kuaishou.weapon.p0.h.a(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "plc001_act_s"
            r3 = 1
            int r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L62
            if (r1 != r3) goto L62
            com.kuaishou.weapon.p0.x r1 = new com.kuaishou.weapon.p0.x     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L61
            org.json.JSONArray r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L61
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L61
            if (r2 <= 0) goto L61
            java.lang.String r2 = "10000"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "11301"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r2.Mn()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L61
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "11302"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r2.getSdkVersion()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L61
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "11303"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r2.getAppId()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L61
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L61
        L61:
            return r0
        L62:
            r0 = 0
            return r0
    }
}
