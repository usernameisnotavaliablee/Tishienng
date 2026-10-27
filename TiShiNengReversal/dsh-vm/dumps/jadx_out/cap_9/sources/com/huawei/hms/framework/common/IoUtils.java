package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class IoUtils {
    private static final int a = 4096;
    private static final int b = 16777216;

    private IoUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(android.database.Cursor r0) {
            if (r0 == 0) goto L5
            r0.close()
        L5:
            return
    }

    public static void closeSecure(java.io.Closeable r2) {
            java.lang.String r0 = "IOUtil"
            if (r2 == 0) goto Lf
            r2.close()     // Catch: java.io.IOException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r1 = "closeSecure IOException"
            com.huawei.hms.framework.common.Logger.w(r0, r1, r2)
            return
        Lf:
            java.lang.String r2 = "closeable is null"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            return
    }

    public static void closeSecure(java.io.InputStream r0) {
            closeSecure(r0)
            return
    }

    public static void closeSecure(java.io.OutputStream r0) {
            closeSecure(r0)
            return
    }

    public static void closeSecure(java.io.Reader r0) {
            closeSecure(r0)
            return
    }

    public static void closeSecure(java.io.Writer r0) {
            closeSecure(r0)
            return
    }

    public static long copy(java.io.InputStream r8, java.io.OutputStream r9) throws java.io.IOException {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r0 == 0) goto Lf
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            java.lang.String r0 = r0.getPackageName()
            goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r2 = 0
        L17:
            int r4 = r8.read(r1)
            r5 = -1
            if (r5 == r4) goto L3d
            r5 = 16777216(0x1000000, double:8.289046E-317)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L36
            java.lang.String r5 = "com.huawei.health"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L2e
            goto L36
        L2e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "input data too large for byte."
            r8.<init>(r9)
            throw r8
        L36:
            r5 = 0
            r9.write(r1, r5, r4)
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L17
        L3d:
            return r2
    }

    public static byte[] toByteArray(java.io.InputStream r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            copy(r1, r0)
            byte[] r1 = r0.toByteArray()
            return r1
    }
}
