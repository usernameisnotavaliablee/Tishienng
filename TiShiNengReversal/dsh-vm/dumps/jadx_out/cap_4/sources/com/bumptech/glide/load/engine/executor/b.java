package com.bumptech.glide.load.engine.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class b {
    private static final java.lang.String a = "GlideRuntimeCompat";
    private static final java.lang.String b = "cpu[0-9]+";
    private static final java.lang.String c = "/sys/devices/system/cpu/";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.io.FilenameFilter {
        final /* synthetic */ java.util.regex.Pattern a;

        a(java.util.regex.Pattern r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r1, java.lang.String r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.a
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.matches()
                return r1
        }
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    static int a() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            return r0
    }

    private static int b() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "/sys/devices/system/cpu/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "cpu[0-9]+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.load.engine.executor.b$a r3 = new com.bumptech.glide.load.engine.executor.b$a     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            java.io.File[] r1 = r1.listFiles(r3)     // Catch: java.lang.Throwable -> L1e
            android.os.StrictMode.setThreadPolicy(r0)
            goto L28
        L1e:
            java.lang.String r1 = "GlideRuntimeCompat"
            r2 = 6
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L33
            android.os.StrictMode.setThreadPolicy(r0)
            r1 = 0
        L28:
            if (r1 == 0) goto L2c
            int r0 = r1.length
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L33:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }
}
