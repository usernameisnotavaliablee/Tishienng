package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class NativeLibraryUtil {
    private NativeLibraryUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void loadLibrary(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L6
            java.lang.System.load(r0)
            return
        L6:
            java.lang.System.loadLibrary(r0)
            return
    }
}
