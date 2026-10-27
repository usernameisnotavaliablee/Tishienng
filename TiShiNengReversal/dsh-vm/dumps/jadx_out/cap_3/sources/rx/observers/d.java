package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d implements rx.d, rx.m {
    final rx.d a;
    rx.m b;
    boolean c;

    public d(rx.d r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a(rx.m r2) {
            r1 = this;
            r1.b = r2
            rx.d r0 = r1.a     // Catch: java.lang.Throwable -> L8
            r0.a(r1)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r2.unsubscribe()
            r1.onError(r0)
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto Lf
            rx.m r0 = r1.b
            boolean r0 = r0.isUnsubscribed()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public void onCompleted() {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.c = r0
            rx.d r0 = r2.a     // Catch: java.lang.Throwable -> Le
            r0.onCompleted()     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            rx.exceptions.OnCompletedFailedException r1 = new rx.exceptions.OnCompletedFailedException
            r1.<init>(r0)
            throw r1
    }

    public void onError(java.lang.Throwable r7) {
            r6 = this;
            boolean r0 = r6.c
            if (r0 == 0) goto L8
            rx.plugins.c.I(r7)
            return
        L8:
            r0 = 1
            r6.c = r0
            rx.d r1 = r6.a     // Catch: java.lang.Throwable -> L11
            r1.onError(r7)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            rx.exceptions.a.e(r1)
            rx.exceptions.OnErrorFailedException r2 = new rx.exceptions.OnErrorFailedException
            rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r5 = 0
            r4[r5] = r7
            r4[r0] = r1
            r3.<init>(r4)
            r2.<init>(r3)
            throw r2
    }

    public void unsubscribe() {
            r1 = this;
            rx.m r0 = r1.b
            r0.unsubscribe()
            return
    }
}
