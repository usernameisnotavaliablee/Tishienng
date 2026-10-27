package xyz.adscope.common.tool.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Base64Util {
    public Base64Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String decode(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lb
            r1 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> Lb
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r2 = 0
            return r2
    }

    public static java.lang.String encode(java.lang.String r1) {
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> La
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = 0
            return r1
    }
}
