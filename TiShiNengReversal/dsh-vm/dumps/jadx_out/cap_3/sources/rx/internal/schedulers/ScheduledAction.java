package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements java.lang.Runnable, rx.m {
    private static final long serialVersionUID = -3962399486978279857L;
    final rx.functions.a action;
    final rx.internal.util.m cancel;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements rx.m {
        private final java.util.concurrent.Future<?> a;
        final /* synthetic */ rx.internal.schedulers.ScheduledAction b;

        a(rx.internal.schedulers.ScheduledAction r1, java.util.concurrent.Future<?> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.Future<?> r0 = r1.a
                boolean r0 = r0.isCancelled()
                return r0
        }

        public void unsubscribe() {
                r2 = this;
                rx.internal.schedulers.ScheduledAction r0 = r2.b
                java.lang.Object r0 = r0.get()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                if (r0 == r1) goto L13
                java.util.concurrent.Future<?> r0 = r2.a
                r1 = 1
                r0.cancel(r1)
                return
            L13:
                java.util.concurrent.Future<?> r0 = r2.a
                r1 = 0
                r0.cancel(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends java.util.concurrent.atomic.AtomicBoolean implements rx.m {
        private static final long serialVersionUID = 247232374289553518L;
        final rx.internal.schedulers.ScheduledAction a;
        final rx.internal.util.m b;

        public b(rx.internal.schedulers.ScheduledAction r1, rx.internal.util.m r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.internal.schedulers.ScheduledAction r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Lf
                rx.internal.util.m r0 = r2.b
                rx.internal.schedulers.ScheduledAction r1 = r2.a
                r0.e(r1)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends java.util.concurrent.atomic.AtomicBoolean implements rx.m {
        private static final long serialVersionUID = 247232374289553518L;
        final rx.internal.schedulers.ScheduledAction a;
        final rx.subscriptions.b b;

        public c(rx.internal.schedulers.ScheduledAction r1, rx.subscriptions.b r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.internal.schedulers.ScheduledAction r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Lf
                rx.subscriptions.b r0 = r2.b
                rx.internal.schedulers.ScheduledAction r1 = r2.a
                r0.f(r1)
            Lf:
                return
        }
    }

    public ScheduledAction(rx.functions.a r1) {
            r0 = this;
            r0.<init>()
            r0.action = r1
            rx.internal.util.m r1 = new rx.internal.util.m
            r1.<init>()
            r0.cancel = r1
            return
    }

    public ScheduledAction(rx.functions.a r2, rx.internal.util.m r3) {
            r1 = this;
            r1.<init>()
            r1.action = r2
            rx.internal.util.m r2 = new rx.internal.util.m
            rx.internal.schedulers.ScheduledAction$b r0 = new rx.internal.schedulers.ScheduledAction$b
            r0.<init>(r1, r3)
            r2.<init>(r0)
            r1.cancel = r2
            return
    }

    public ScheduledAction(rx.functions.a r2, rx.subscriptions.b r3) {
            r1 = this;
            r1.<init>()
            r1.action = r2
            rx.internal.util.m r2 = new rx.internal.util.m
            rx.internal.schedulers.ScheduledAction$c r0 = new rx.internal.schedulers.ScheduledAction$c
            r0.<init>(r1, r3)
            r2.<init>(r0)
            r1.cancel = r2
            return
    }

    public void add(java.util.concurrent.Future<?> r3) {
            r2 = this;
            rx.internal.util.m r0 = r2.cancel
            rx.internal.schedulers.ScheduledAction$a r1 = new rx.internal.schedulers.ScheduledAction$a
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }

    public void add(rx.m r2) {
            r1 = this;
            rx.internal.util.m r0 = r1.cancel
            r0.a(r2)
            return
    }

    public void addParent(rx.internal.util.m r3) {
            r2 = this;
            rx.internal.util.m r0 = r2.cancel
            rx.internal.schedulers.ScheduledAction$b r1 = new rx.internal.schedulers.ScheduledAction$b
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }

    public void addParent(rx.subscriptions.b r3) {
            r2 = this;
            rx.internal.util.m r0 = r2.cancel
            rx.internal.schedulers.ScheduledAction$c r1 = new rx.internal.schedulers.ScheduledAction$c
            r1.<init>(r2, r3)
            r0.a(r1)
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            rx.internal.util.m r0 = r1.cancel
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12
            r3.lazySet(r0)     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12
            rx.functions.a r0 = r3.action     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12
            r0.call()     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12
            r3.unsubscribe()
            return
        L10:
            r0 = move-exception
            goto L14
        L12:
            r0 = move-exception
            goto L24
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "Fatal Exception thrown on Scheduler.Worker thread."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L22
            r3.signalError(r1)     // Catch: java.lang.Throwable -> L22
        L1e:
            r3.unsubscribe()
            goto L2f
        L22:
            r0 = move-exception
            goto L30
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "Exception thrown on Scheduler.Worker thread. Add `onError` handling."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L22
            r3.signalError(r1)     // Catch: java.lang.Throwable -> L22
            goto L1e
        L2f:
            return
        L30:
            r3.unsubscribe()
            throw r0
    }

    void signalError(java.lang.Throwable r3) {
            r2 = this;
            rx.plugins.c.I(r3)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r3)
            return
    }

    public void unsubscribe() {
            r1 = this;
            rx.internal.util.m r0 = r1.cancel
            boolean r0 = r0.isUnsubscribed()
            if (r0 != 0) goto Ld
            rx.internal.util.m r0 = r1.cancel
            r0.unsubscribe()
        Ld:
            return
    }
}
