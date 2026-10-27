package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i1 implements rx.e.a<java.lang.Long> {
    final long a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.a {
        long a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.h.a c;
        final /* synthetic */ rx.internal.operators.i1 d;

        a(rx.internal.operators.i1 r1, rx.l r2, rx.h.a r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void call() {
                r5 = this;
                rx.l r0 = r5.b     // Catch: java.lang.Throwable -> L11
                long r1 = r5.a     // Catch: java.lang.Throwable -> L11
                r3 = 1
                long r3 = r3 + r1
                r5.a = r3     // Catch: java.lang.Throwable -> L11
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L11
                r0.onNext(r1)     // Catch: java.lang.Throwable -> L11
                return
            L11:
                r0 = move-exception
                rx.h$a r1 = r5.c     // Catch: java.lang.Throwable -> L1d
                r1.unsubscribe()     // Catch: java.lang.Throwable -> L1d
                rx.l r1 = r5.b
                rx.exceptions.a.f(r0, r1)
                return
            L1d:
                r1 = move-exception
                rx.l r2 = r5.b
                rx.exceptions.a.f(r0, r2)
                throw r1
        }
    }

    public i1(long r1, long r3, java.util.concurrent.TimeUnit r5, rx.h r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super java.lang.Long> r9) {
            r8 = this;
            rx.h r0 = r8.d
            rx.h$a r1 = r0.a()
            r9.add(r1)
            rx.internal.operators.i1$a r2 = new rx.internal.operators.i1$a
            r2.<init>(r8, r9, r1)
            long r3 = r8.a
            long r5 = r8.b
            java.util.concurrent.TimeUnit r7 = r8.c
            r1.f(r2, r3, r5, r7)
            return
    }
}
