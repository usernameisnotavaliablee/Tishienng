package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> La
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> La
            return r1
        La:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String b(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lb
            r1 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> Lb
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            java.lang.String r2 = ""
            return r2
    }
}
