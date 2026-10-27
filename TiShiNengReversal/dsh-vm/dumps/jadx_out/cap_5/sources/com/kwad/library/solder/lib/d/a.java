package com.kwad.library.solder.lib.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static java.lang.String arH;
    private static java.lang.String arI;
    private static final java.util.Map<java.lang.String, java.lang.String> arJ = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.library.solder.lib.d.a.arJ = r0
            java.lang.String r1 = "mips"
            r0.put(r1, r1)
            java.lang.String r1 = "mips64"
            r0.put(r1, r1)
            java.lang.String r1 = "x86"
            r0.put(r1, r1)
            java.lang.String r1 = "x86_64"
            r0.put(r1, r1)
            java.lang.String r1 = "arm64"
            java.lang.String r2 = "arm64-v8a"
            r0.put(r1, r2)
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String Az() {
            boolean r0 = is64Bit()
            if (r0 == 0) goto L9
            java.lang.String r0 = "arm64-v8a"
            return r0
        L9:
            java.lang.String r0 = "armeabi-v7a"
            return r0
    }

    private static boolean is64Bit() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r0 = com.bytedance.pangle.up.a.a()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "dalvik.system.VMRuntime"
            java.lang.String r2 = "getRuntime"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L21
            java.lang.Object r1 = com.kwad.sdk.utils.z.a(r1, r2, r3)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "is64Bit"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L21
            java.lang.Object r1 = com.kwad.sdk.utils.z.callMethod(r1, r2, r3)     // Catch: java.lang.Exception -> L21
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L28
            boolean r0 = r1.booleanValue()
        L28:
            return r0
    }
}
