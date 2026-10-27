package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c0<T> implements rx.e.a<T> {
    final rx.e<? extends T> a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.c0 b;

        a(rx.internal.operators.c0 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.l r0 = r2.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L15
                rx.internal.operators.c0 r0 = r2.b
                rx.e<? extends T> r0 = r0.a
                rx.l r1 = r2.a
                rx.l r1 = rx.observers.h.f(r1)
                r0.J6(r1)
            L15:
                return
        }
    }

    public c0(rx.e<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r5) {
            r4 = this;
            rx.h r0 = r4.d
            rx.h$a r0 = r0.a()
            r5.add(r0)
            rx.internal.operators.c0$a r1 = new rx.internal.operators.c0$a
            r1.<init>(r4, r5)
            long r2 = r4.b
            java.util.concurrent.TimeUnit r5 = r4.c
            r0.e(r1, r2, r5)
            return
    }
}
