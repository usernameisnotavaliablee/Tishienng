package com.baidu.liantian.ac;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LH {
    private LH() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.util.Pair<java.lang.String, java.lang.String> getId(android.content.Context r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = com.baidu.liantian.core.e.a(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = com.baidu.liantian.b.e.l(r3)     // Catch: java.lang.Throwable -> L1a
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "ID"
            java.lang.String r0 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L19:
            r1 = r0
        L1a:
            com.baidu.liantian.b.e.a()
        L1d:
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
    }

    public static android.util.Pair<java.lang.String, java.lang.String> getId(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = com.baidu.liantian.core.e.a(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = com.baidu.liantian.b.e.b(r2, r3)     // Catch: java.lang.Throwable -> L1a
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "ID"
            java.lang.String r0 = r3.getString(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L19:
            r1 = r0
        L1a:
            com.baidu.liantian.b.e.a()
        L1d:
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            return r2
    }

    private static java.lang.String getVersion(android.content.Context r0) {
            java.lang.String r0 = "3.1.6.7"
            return r0
    }

    public static void init(android.content.Context r1, boolean r2) {
            r0 = 0
            com.baidu.liantian.core.e.a(r1, r0, r2)
            return
    }

    public static void initDelay(android.content.Context r0, int r1, boolean r2) {
            com.baidu.liantian.core.e.a(r0, r1, r2)
            return
    }
}
