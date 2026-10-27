package com.kwai.library.ipneigh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class a {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwai.library.ipneigh.a$a, reason: collision with other inner class name */
    static class C0172a extends java.lang.Thread {
        private final java.io.InputStream bfk;

        public C0172a(java.io.InputStream r2) {
                r1 = this;
                java.lang.String r0 = "NoopStreamConsumer"
                r1.<init>(r0)
                r1.bfk = r2
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r5 = this;
                r0 = 0
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L23
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L23
                java.io.InputStream r3 = r5.bfk     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L23
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L23
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L23
            Ld:
                java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
                if (r0 != 0) goto Ld
                com.kwai.library.ipneigh.a.d(r1)
                return
            L17:
                r0 = move-exception
                goto L1f
            L19:
                r0 = r1
                goto L23
            L1b:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L1f:
                com.kwai.library.ipneigh.a.d(r1)
                throw r0
            L23:
                com.kwai.library.ipneigh.a.d(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface b<T> {
        T b(java.io.BufferedReader r1);
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static <T> T a(java.lang.String r5, com.kwai.library.ipneigh.a.b<T> r6) {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a
            java.lang.Process r5 = r1.exec(r5)     // Catch: java.lang.Throwable -> L3a
            com.kwai.library.ipneigh.a$a r1 = new com.kwai.library.ipneigh.a$a     // Catch: java.lang.Throwable -> L37
            java.io.InputStream r2 = r5.getErrorStream()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r1.start()     // Catch: java.lang.Throwable -> L37
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L37
            java.io.InputStream r4 = r5.getInputStream()     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.b(r2)     // Catch: java.lang.Throwable -> L34
            r1.join()     // Catch: java.lang.Throwable -> L34
            r5.waitFor()     // Catch: java.lang.Throwable -> L34
            r5.destroy()
            closeQuietly(r2)
            return r6
        L34:
            r6 = move-exception
        L35:
            r0 = r5
            goto L3c
        L37:
            r6 = move-exception
            r2 = r0
            goto L35
        L3a:
            r6 = move-exception
            r2 = r0
        L3c:
            if (r0 == 0) goto L41
            r0.destroy()
        L41:
            closeQuietly(r2)
            throw r6
    }

    private static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    static /* synthetic */ void d(java.io.Closeable r0) {
            closeQuietly(r0)
            return
    }

    public static java.lang.String hR(java.lang.String r1) {
            com.kwai.library.ipneigh.a$1 r0 = new com.kwai.library.ipneigh.a$1     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = a(r1, r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = 0
            return r1
    }
}
