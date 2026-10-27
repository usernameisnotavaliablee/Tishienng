package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h1 implements rx.e.a<java.lang.Long> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.h1 b;

        a(rx.internal.operators.h1 r1, rx.l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r3 = this;
                rx.l r0 = r3.a     // Catch: java.lang.Throwable -> L11
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L11
                r0.onNext(r1)     // Catch: java.lang.Throwable -> L11
                rx.l r0 = r3.a
                r0.onCompleted()
                return
            L11:
                r0 = move-exception
                rx.l r1 = r3.a
                rx.exceptions.a.f(r0, r1)
                return
        }
    }

    public h1(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super java.lang.Long> r5) {
            r4 = this;
            rx.h r0 = r4.c
            rx.h$a r0 = r0.a()
            r5.add(r0)
            rx.internal.operators.h1$a r1 = new rx.internal.operators.h1$a
            r1.<init>(r4, r5)
            long r2 = r4.a
            java.util.concurrent.TimeUnit r5 = r4.b
            r0.e(r1, r2, r5)
            return
    }
}
