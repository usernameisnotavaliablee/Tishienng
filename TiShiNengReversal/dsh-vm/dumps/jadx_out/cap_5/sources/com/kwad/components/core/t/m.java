package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void c(android.content.Intent r1) {
            if (r1 != 0) goto L3
            goto L16
        L3:
            com.kwad.sdk.api.loader.Loader r0 = com.kwad.sdk.api.loader.Loader.get()
            java.lang.ClassLoader r0 = r0.getExternalClassLoader()
            android.os.Bundle r1 = r1.getExtras()
            if (r0 == 0) goto L16
            if (r1 == 0) goto L16
            r1.setClassLoader(r0)
        L16:
            return
    }
}
