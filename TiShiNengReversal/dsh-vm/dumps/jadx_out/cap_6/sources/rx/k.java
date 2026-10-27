package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class k<T> implements rx.m {
    private final rx.internal.util.m a;

    public k() {
            r1 = this;
            r1.<init>()
            rx.internal.util.m r0 = new rx.internal.util.m
            r0.<init>()
            r1.a = r0
            return
    }

    public final void b(rx.m r2) {
            r1 = this;
            rx.internal.util.m r0 = r1.a
            r0.a(r2)
            return
    }

    public abstract void d(T r1);

    @Override // rx.m
    public final boolean isUnsubscribed() {
            r1 = this;
            rx.internal.util.m r0 = r1.a
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    public abstract void onError(java.lang.Throwable r1);

    @Override // rx.m
    public final void unsubscribe() {
            r1 = this;
            rx.internal.util.m r0 = r1.a
            r0.unsubscribe()
            return
    }
}
