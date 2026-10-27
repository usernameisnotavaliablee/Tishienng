package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SafeBase64 {
    private static final java.lang.String a = "SafeBase64";

    static {
            return
    }

    private SafeBase64() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r0, int r1) {
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    public static byte[] decode(byte[] r0, int r1) {
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    public static byte[] decode(byte[] r0, int r1, int r2, int r3) {
            byte[] r0 = android.util.Base64.decode(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    public static byte[] encode(byte[] r0, int r1) {
            byte[] r0 = android.util.Base64.encode(r0, r1)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    public static byte[] encode(byte[] r0, int r1, int r2, int r3) {
            byte[] r0 = android.util.Base64.encode(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    public static java.lang.String encodeToString(byte[] r0, int r1) {
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String encodeToString(byte[] r0, int r1, int r2, int r3) {
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            r0.getMessage()
            java.lang.String r0 = ""
            return r0
    }
}
