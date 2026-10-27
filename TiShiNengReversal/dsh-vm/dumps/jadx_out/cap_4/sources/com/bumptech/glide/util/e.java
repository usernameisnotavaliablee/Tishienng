package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {
    private static final java.util.concurrent.Executor a = null;
    private static final java.util.concurrent.Executor b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Executor {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r1) {
                r0 = this;
                com.bumptech.glide.util.l.x(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.util.concurrent.Executor {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r1) {
                r0 = this;
                r1.run()
                return
        }
    }

    static {
            com.bumptech.glide.util.e$a r0 = new com.bumptech.glide.util.e$a
            r0.<init>()
            com.bumptech.glide.util.e.a = r0
            com.bumptech.glide.util.e$b r0 = new com.bumptech.glide.util.e$b
            r0.<init>()
            com.bumptech.glide.util.e.b = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor a() {
            java.util.concurrent.Executor r0 = com.bumptech.glide.util.e.b
            return r0
    }

    public static java.util.concurrent.Executor b() {
            java.util.concurrent.Executor r0 = com.bumptech.glide.util.e.a
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static void c(java.util.concurrent.ExecutorService r4) {
            r4.shutdownNow()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1f
            r1 = 5
            boolean r3 = r4.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L1f
            if (r3 != 0) goto L21
            r4.shutdownNow()     // Catch: java.lang.InterruptedException -> L1f
            boolean r0 = r4.awaitTermination(r1, r0)     // Catch: java.lang.InterruptedException -> L1f
            if (r0 == 0) goto L17
            goto L21
        L17:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L1f
            java.lang.String r1 = "Failed to shutdown"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1f
            throw r0     // Catch: java.lang.InterruptedException -> L1f
        L1f:
            r0 = move-exception
            goto L22
        L21:
            return
        L22:
            r4.shutdownNow()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r0)
            throw r4
    }
}
