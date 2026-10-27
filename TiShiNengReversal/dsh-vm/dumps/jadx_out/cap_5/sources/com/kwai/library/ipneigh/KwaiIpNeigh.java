package com.kwai.library.ipneigh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class KwaiIpNeigh {
    private static final java.lang.String TAG = "KwaiIpNeigh";

    static {
            java.lang.String r0 = "ipneigh-android"
            java.lang.System.loadLibrary(r0)
            return
    }

    KwaiIpNeigh() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean aC(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\s+"
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 2
            if (r1 >= r2) goto Lf
            return r0
        Lf:
            r3 = r3[r0]
            boolean r3 = r3.equals(r4)
            return r3
    }

    private static native int getARPTableFromJni(int r0);

    private static native int getARPTableFromJni2(int r0);

    public static java.lang.String i(java.lang.String r4, boolean r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.os.ParcelFileDescriptor[] r0 = android.os.ParcelFileDescriptor.createPipe()     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L23
            android.os.ParcelFileDescriptor$AutoCloseInputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.lang.Throwable -> L23
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L23
            int r0 = r0.detachFd()     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            int r5 = getARPTableFromJni2(r0)     // Catch: java.lang.Throwable -> L23
            goto L29
        L23:
            r4 = move-exception
            goto L45
        L25:
            int r5 = getARPTableFromJni(r0)     // Catch: java.lang.Throwable -> L23
        L29:
            if (r5 == 0) goto L2c
            return r1
        L2c:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L23
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L23
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L23
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L23
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L23
        L38:
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L48
            boolean r2 = aC(r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L38
            return r0
        L45:
            r4.getMessage()
        L48:
            return r1
    }
}
