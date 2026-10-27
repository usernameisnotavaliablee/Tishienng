package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class StreamUtils {
    private StreamUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeStreams(java.io.Closeable... r4) {
            java.lang.String r0 = "StreamUtils"
            if (r4 != 0) goto L5
            goto L1f
        L5:
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1f
            r3 = r4[r2]
            if (r3 == 0) goto L1c
            r3.close()     // Catch: java.lang.RuntimeException -> L11 java.io.IOException -> L17
            goto L1c
        L11:
            java.lang.String r3 = "RuntimeException closeStreams"
            com.huawei.hms.ml.common.utils.SmartLog.w(r0, r3)
            goto L1c
        L17:
            java.lang.String r3 = "IOException closeStreams"
            com.huawei.hms.ml.common.utils.SmartLog.w(r0, r3)
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            return
    }
}
