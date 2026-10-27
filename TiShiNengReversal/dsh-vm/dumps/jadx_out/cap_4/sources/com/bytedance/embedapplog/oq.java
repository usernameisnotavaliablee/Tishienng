package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class oq<SERVICE, RESULT> {
    private final com.bytedance.embedapplog.oq.xt<SERVICE, RESULT> cw;
    private final java.util.concurrent.CountDownLatch j;

    /* renamed from: r, reason: collision with root package name */
    private final android.content.Context f2091r;
    private final android.content.Intent xt;

    class j implements android.content.ServiceConnection {
        private final java.util.concurrent.CountDownLatch cw;

        @androidx.annotation.Nullable
        SERVICE j;

        /* renamed from: r, reason: collision with root package name */
        private final com.bytedance.embedapplog.oq.xt<SERVICE, RESULT> f2092r;
        final /* synthetic */ com.bytedance.embedapplog.oq xt;

        j(com.bytedance.embedapplog.oq r1, java.util.concurrent.CountDownLatch r2, com.bytedance.embedapplog.oq.xt<SERVICE, RESULT> r3) {
                r0 = this;
                r0.xt = r1
                r0.<init>()
                r0.cw = r2
                r0.f2092r = r3
                return
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(android.content.ComponentName r1) {
                r0 = this;
                return
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(android.content.ComponentName r1) {
                r0 = this;
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                java.lang.String r0 = "ServiceBlockBinder#onServiceConnected "
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r2 = r0.concat(r2)
                com.bytedance.embedapplog.uc.j(r2)
                com.bytedance.embedapplog.oq$xt<SERVICE, RESULT> r2 = r1.f2092r     // Catch: java.lang.Throwable -> L20
                java.lang.Object r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L20
                r1.j = r2     // Catch: java.lang.Throwable -> L20
                java.util.concurrent.CountDownLatch r2 = r1.cw     // Catch: java.lang.Exception -> L1b
                r2.countDown()     // Catch: java.lang.Exception -> L1b
                return
            L1b:
                r2 = move-exception
                com.bytedance.embedapplog.uc.j(r2)
                return
            L20:
                r2 = move-exception
                java.lang.String r3 = "ServiceBlockBinder#onServiceConnected"
                com.bytedance.embedapplog.uc.cw(r3, r2)     // Catch: java.lang.Throwable -> L31
                java.util.concurrent.CountDownLatch r2 = r1.cw     // Catch: java.lang.Exception -> L2c
                r2.countDown()     // Catch: java.lang.Exception -> L2c
                return
            L2c:
                r2 = move-exception
                com.bytedance.embedapplog.uc.j(r2)
                return
            L31:
                r2 = move-exception
                java.util.concurrent.CountDownLatch r3 = r1.cw     // Catch: java.lang.Exception -> L38
                r3.countDown()     // Catch: java.lang.Exception -> L38
                goto L3c
            L38:
                r3 = move-exception
                com.bytedance.embedapplog.uc.j(r3)
            L3c:
                throw r2
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                java.lang.String r0 = "ServiceBlockBinder#onServiceDisconnected"
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r2 = r0.concat(r2)
                com.bytedance.embedapplog.uc.j(r2)
                java.util.concurrent.CountDownLatch r2 = r1.cw     // Catch: java.lang.Exception -> L13
                r2.countDown()     // Catch: java.lang.Exception -> L13
                return
            L13:
                r2 = move-exception
                com.bytedance.embedapplog.uc.j(r2)
                return
        }
    }

    interface xt<T, RESULT> {
        T j(android.os.IBinder r1);

        RESULT j(T r1);
    }

    oq(android.content.Context r1, android.content.Intent r2, com.bytedance.embedapplog.oq.xt<SERVICE, RESULT> r3) {
            r0 = this;
            r0.<init>()
            r0.f2091r = r1
            r0.xt = r2
            r0.cw = r3
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            r0.j = r1
            return
    }

    private void j(com.bytedance.embedapplog.oq<SERVICE, RESULT>.j r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.content.Context r0 = r1.f2091r     // Catch: java.lang.Throwable -> L8
            r0.unbindService(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            com.bytedance.embedapplog.uc.j(r2)
        Lc:
            return
    }

    RESULT j() {
            r5 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            r2 = 0
            if (r0 != r1) goto L11
            java.lang.String r0 = "Don't do this in ui thread."
            com.bytedance.embedapplog.uc.cw(r0, r2)
            return r2
        L11:
            com.bytedance.embedapplog.oq$j r0 = new com.bytedance.embedapplog.oq$j     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.CountDownLatch r1 = r5.j     // Catch: java.lang.Throwable -> L35
            com.bytedance.embedapplog.oq$xt<SERVICE, RESULT> r3 = r5.cw     // Catch: java.lang.Throwable -> L35
            r0.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L35
            android.content.Context r1 = r5.f2091r     // Catch: java.lang.Throwable -> L35
            android.content.Intent r3 = r5.xt     // Catch: java.lang.Throwable -> L35
            r4 = 1
            r1.bindService(r3, r0, r4)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.CountDownLatch r1 = r5.j     // Catch: java.lang.Throwable -> L35
            r1.await()     // Catch: java.lang.Throwable -> L35
            com.bytedance.embedapplog.oq$xt<SERVICE, RESULT> r1 = r5.cw     // Catch: java.lang.Throwable -> L33
            SERVICE r3 = r0.j     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.j(r3)     // Catch: java.lang.Throwable -> L33
            r5.j(r0)
            return r1
        L33:
            r1 = move-exception
            goto L37
        L35:
            r1 = move-exception
            r0 = r2
        L37:
            com.bytedance.embedapplog.uc.j(r1)     // Catch: java.lang.Throwable -> L3e
            r5.j(r0)
            return r2
        L3e:
            r1 = move-exception
            r5.j(r0)
            throw r1
    }
}
