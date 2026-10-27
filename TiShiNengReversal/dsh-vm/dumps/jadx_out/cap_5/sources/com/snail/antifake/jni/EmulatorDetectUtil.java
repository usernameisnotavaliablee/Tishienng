package com.snail.antifake.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class EmulatorDetectUtil {
    static {
            java.lang.String r0 = "emulator_check"
            java.lang.System.loadLibrary(r0)
            return
    }

    public EmulatorDetectUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            boolean r0 = detect()
            return r0
    }

    public static boolean b(android.content.Context r0) {
            boolean r0 = com.snail.antifake.deviceid.a.q(r0)
            if (r0 != 0) goto Lf
            boolean r0 = detect()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static native boolean detect();

    public void c() {
            r0 = this;
            return
    }
}
