package com.kwad.components.offline.api.core.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SafeUtils {
    public SafeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isDebugPkg(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
