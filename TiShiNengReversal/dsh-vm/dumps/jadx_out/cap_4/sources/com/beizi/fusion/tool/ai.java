package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ai {
    private static java.lang.String a = "extra";

    static {
            return
    }

    public ai() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.io.File r3) {
            boolean r0 = r3.isDirectory()     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L1f
            java.io.File[] r0 = r3.listFiles()     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L1b
            int r1 = r0.length     // Catch: java.lang.Exception -> L28
            if (r1 <= 0) goto L1b
            r1 = 0
        L10:
            int r2 = r0.length     // Catch: java.lang.Exception -> L28
            if (r1 >= r2) goto L1b
            r2 = r0[r1]     // Catch: java.lang.Exception -> L28
            a(r2)     // Catch: java.lang.Exception -> L28
            int r1 = r1 + 1
            goto L10
        L1b:
            r3.delete()     // Catch: java.lang.Exception -> L28
            return
        L1f:
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L28
            r3.delete()     // Catch: java.lang.Exception -> L28
        L28:
            return
    }
}
