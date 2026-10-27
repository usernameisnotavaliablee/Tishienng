package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {


    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void j(java.io.InputStream r1) {
            com.bytedance.pangle.m.j$1 r0 = new com.bytedance.pangle.m.j$1
            r0.<init>(r1)
            com.bytedance.pangle.up.up.xt(r0)
            return
    }

    public static boolean j(java.lang.String[] r4) {
            int r0 = r4.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.lang.Process r0 = r0.exec(r4)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.io.InputStream r2 = r0.getErrorStream()     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            j(r2)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            j(r3)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            int r0 = r0.waitFor()     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            if (r0 == 0) goto L3d
            java.lang.String r0 = "Zeus/install_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.lang.String r3 = "exec dex2oat failed : "
            r2.<init>(r3)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            r2.append(r4)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r4)     // Catch: java.lang.InterruptedException -> L39 java.io.IOException -> L3b
            return r1
        L39:
            r4 = move-exception
            goto L3f
        L3b:
            r4 = move-exception
            goto L43
        L3d:
            r4 = 1
            return r4
        L3f:
            com.bytedance.sdk.openadsdk.api.m.j(r4)
            return r1
        L43:
            com.bytedance.sdk.openadsdk.api.m.j(r4)
            return r1
    }
}
