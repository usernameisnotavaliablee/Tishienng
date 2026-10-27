package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.Intent a(java.lang.String r1) {
            r0 = 0
            android.content.Intent r1 = a(r1, r0)
            return r1
    }

    public static android.content.Intent a(java.lang.String r2, java.lang.String r3) {
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L14
            r0.setPackage(r3)
        L14:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r2)
            return r0
    }

    public static boolean a(android.content.Context r1, android.content.Intent r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r1.queryIntentActivities(r2, r0)
            if (r1 == 0) goto L14
            int r1 = r1.size()
            if (r1 <= 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static boolean a(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L13
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L13
        La:
            android.content.Intent r3 = a(r3)     // Catch: java.lang.Exception -> L13
            boolean r2 = a(r2, r3)     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            return r0
    }
}
