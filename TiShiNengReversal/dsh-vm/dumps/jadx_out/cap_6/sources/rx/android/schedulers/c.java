package rx.android.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c extends rx.h {
    private final android.os.Handler a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends rx.h.a {
        private final android.os.Handler a;
        private final rx.android.plugins.b b;
        private volatile boolean c;

        a(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.android.plugins.a r1 = rx.android.plugins.a.a()
                rx.android.plugins.b r1 = r1.b()
                r0.b = r1
                return
        }

        @Override // rx.h.a
        public rx.m d(rx.functions.a r4) {
                r3 = this;
                r0 = 0
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                rx.m r4 = r3.e(r4, r0, r2)
                return r4
        }

        @Override // rx.h.a
        public rx.m e(rx.functions.a r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto L9
                rx.m r3 = rx.subscriptions.f.e()
                return r3
            L9:
                rx.android.plugins.b r0 = r2.b
                rx.functions.a r3 = r0.c(r3)
                rx.android.schedulers.c$b r0 = new rx.android.schedulers.c$b
                android.os.Handler r1 = r2.a
                r0.<init>(r3, r1)
                android.os.Handler r3 = r2.a
                android.os.Message r3 = android.os.Message.obtain(r3, r0)
                r3.obj = r2
                android.os.Handler r1 = r2.a
                long r4 = r6.toMillis(r4)
                r1.sendMessageDelayed(r3, r4)
                boolean r3 = r2.c
                if (r3 == 0) goto L35
                android.os.Handler r3 = r2.a
                r3.removeCallbacks(r0)
                rx.m r3 = rx.subscriptions.f.e()
                return r3
            L35:
                return r0
        }

        @Override // rx.m
        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.c
                return r0
        }

        @Override // rx.m
        public void unsubscribe() {
                r1 = this;
                r0 = 1
                r1.c = r0
                android.os.Handler r0 = r1.a
                r0.removeCallbacksAndMessages(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements java.lang.Runnable, rx.m {
        private final rx.functions.a a;
        private final android.os.Handler b;
        private volatile boolean c;

        b(rx.functions.a r1, android.os.Handler r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // rx.m
        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.c
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                rx.functions.a r0 = r3.a     // Catch: java.lang.Throwable -> L6
                r0.call()     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                boolean r1 = r0 instanceof rx.exceptions.OnErrorNotImplementedException
                if (r1 == 0) goto L13
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Exception thrown on Scheduler.Worker thread. Add `onError` handling."
                r1.<init>(r2, r0)
                goto L1a
            L13:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Fatal Exception thrown on Scheduler.Worker thread."
                r1.<init>(r2, r0)
            L1a:
                rx.plugins.f r0 = rx.plugins.f.c()
                rx.plugins.b r0 = r0.b()
                r0.a(r1)
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Thread$UncaughtExceptionHandler r2 = r0.getUncaughtExceptionHandler()
                r2.uncaughtException(r0, r1)
                return
        }

        @Override // rx.m
        public void unsubscribe() {
                r1 = this;
                r0 = 1
                r1.c = r0
                android.os.Handler r0 = r1.b
                r0.removeCallbacks(r1)
                return
        }
    }

    c(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    c(android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // rx.h
    public rx.h.a a() {
            r2 = this;
            rx.android.schedulers.c$a r0 = new rx.android.schedulers.c$a
            android.os.Handler r1 = r2.a
            r0.<init>(r1)
            return r0
    }
}
