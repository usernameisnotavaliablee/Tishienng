package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(android.content.Context r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.io.File r0 = r0.getFilesDir()
            return r0
    }

    public static java.io.File b(android.content.Context r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.io.File r0 = r0.getCacheDir()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.io.File r0 = r0.getCacheDir()
            return r0
    }
}
