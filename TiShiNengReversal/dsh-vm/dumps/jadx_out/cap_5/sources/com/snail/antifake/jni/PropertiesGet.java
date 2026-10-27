package com.snail.antifake.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PropertiesGet {
    static {
            java.lang.String r0 = "property_get"
            java.lang.System.loadLibrary(r0)
            return
    }

    public PropertiesGet() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r0) {
            java.lang.String r0 = native_get(r0)
            return r0
    }

    public static java.lang.String b(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = native_get(r0, r1)
            return r0
    }

    private static native java.lang.String native_get(java.lang.String r0);

    private static native java.lang.String native_get(java.lang.String r0, java.lang.String r1);
}
