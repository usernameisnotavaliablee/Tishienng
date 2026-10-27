package com.umeng.socialize.c.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            return
    }

    public static void a(android.content.Context r0) {
            b(r0)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
            return
    }

    private static void b(android.content.Context r3) {
            java.io.File r0 = new java.io.File
            r1 = 0
            java.io.File r3 = r3.getExternalFilesDir(r1)
            java.lang.String r1 = "umeng_cache"
            r0.<init>(r3, r1)
            java.io.File[] r3 = r0.listFiles()
            if (r3 == 0) goto L22
            int r0 = r3.length
            if (r0 != 0) goto L16
            goto L22
        L16:
            int r0 = r3.length
            r1 = 0
        L18:
            if (r1 >= r0) goto L22
            r2 = r3[r1]
            r2.delete()
            int r1 = r1 + 1
            goto L18
        L22:
            return
    }
}
