package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class x {
    private boolean a;
    private final android.os.Handler b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements android.os.Handler.Callback {
        static final int a = 1;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Ld
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.engine.u r3 = (com.bumptech.glide.load.engine.u) r3
                r3.recycle()
                return r1
            Ld:
                r3 = 0
                return r3
        }
    }

    x() {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.bumptech.glide.load.engine.x$a r2 = new com.bumptech.glide.load.engine.x$a
            r2.<init>()
            r0.<init>(r1, r2)
            r3.b = r0
            return
    }

    synchronized void a(com.bumptech.glide.load.engine.u<?> r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r0 != 0) goto L14
            if (r4 == 0) goto L9
            goto L14
        L9:
            r2.a = r1     // Catch: java.lang.Throwable -> L12
            r3.recycle()     // Catch: java.lang.Throwable -> L12
            r3 = 0
            r2.a = r3     // Catch: java.lang.Throwable -> L12
            goto L1d
        L12:
            r3 = move-exception
            goto L1f
        L14:
            android.os.Handler r4 = r2.b     // Catch: java.lang.Throwable -> L12
            android.os.Message r3 = r4.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> L12
            r3.sendToTarget()     // Catch: java.lang.Throwable -> L12
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }
}
