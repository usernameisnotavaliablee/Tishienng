package rx.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class b implements rx.m {
    private final java.util.concurrent.atomic.AtomicBoolean a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.android.b a;

        a(rx.android.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.a
        public void call() {
                r1 = this;
                rx.android.b r0 = r1.a
                r0.a()
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.a = r0
            return
    }

    public static void b() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected to be called on the main thread but was "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected abstract void a();

    @Override // rx.m
    public final boolean isUnsubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.a
            boolean r0 = r0.get()
            return r0
    }

    @Override // rx.m
    public final void unsubscribe() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L28
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L18
            r3.a()
            return
        L18:
            rx.h r0 = rx.android.schedulers.a.b()
            rx.h$a r0 = r0.a()
            rx.android.b$a r1 = new rx.android.b$a
            r1.<init>(r3)
            r0.d(r1)
        L28:
            return
    }
}
