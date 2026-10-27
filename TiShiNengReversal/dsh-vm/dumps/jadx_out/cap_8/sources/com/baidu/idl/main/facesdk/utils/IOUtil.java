package com.baidu.idl.main.facesdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IOUtil {
    public IOUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(java.io.Closeable... r3) throws java.io.IOException {
            if (r3 == 0) goto L10
            int r0 = r3.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L10
            r2 = r3[r1]
            if (r2 == 0) goto Ld
            r2.close()
        Ld:
            int r1 = r1 + 1
            goto L4
        L10:
            return
    }

    public static void closeQuietly(java.io.Closeable... r0) {
            close(r0)     // Catch: java.io.IOException -> L3
        L3:
            return
    }
}
