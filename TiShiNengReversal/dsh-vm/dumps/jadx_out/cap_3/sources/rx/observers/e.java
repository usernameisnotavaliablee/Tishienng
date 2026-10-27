package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class e<T> extends rx.l<T> {
    private final rx.l<? super T> a;
    boolean b;

    public e(rx.l<? super T> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r1
            return
    }

    protected void g(java.lang.Throwable r9) {
            r8 = this;
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r9)
            r0 = 1
            r1 = 0
            r2 = 2
            rx.l<? super T> r3 = r8.a     // Catch: java.lang.Throwable -> L21 rx.exceptions.OnErrorNotImplementedException -> L23
            r3.onError(r9)     // Catch: java.lang.Throwable -> L21 rx.exceptions.OnErrorNotImplementedException -> L23
            r8.unsubscribe()     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r9 = move-exception
            rx.plugins.c.I(r9)
            rx.exceptions.OnErrorFailedException r0 = new rx.exceptions.OnErrorFailedException
            r0.<init>(r9)
            throw r0
        L21:
            r3 = move-exception
            goto L25
        L23:
            r3 = move-exception
            goto L60
        L25:
            rx.plugins.c.I(r3)
            r8.unsubscribe()     // Catch: java.lang.Throwable -> L42
            rx.exceptions.OnErrorFailedException r4 = new rx.exceptions.OnErrorFailedException
            rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r2[r1] = r9
            r2[r0] = r3
            java.util.List r9 = java.util.Arrays.asList(r2)
            r5.<init>(r9)
            java.lang.String r9 = "Error occurred when trying to propagate error to Observer.onError"
            r4.<init>(r9, r5)
            throw r4
        L42:
            r4 = move-exception
            rx.plugins.c.I(r4)
            rx.exceptions.OnErrorFailedException r5 = new rx.exceptions.OnErrorFailedException
            rx.exceptions.CompositeException r6 = new rx.exceptions.CompositeException
            r7 = 3
            java.lang.Throwable[] r7 = new java.lang.Throwable[r7]
            r7[r1] = r9
            r7[r0] = r3
            r7[r2] = r4
            java.util.List r9 = java.util.Arrays.asList(r7)
            r6.<init>(r9)
            java.lang.String r9 = "Error occurred when trying to propagate error to Observer.onError and during unsubscription."
            r5.<init>(r9, r6)
            throw r5
        L60:
            r8.unsubscribe()     // Catch: java.lang.Throwable -> L64
            throw r3
        L64:
            r3 = move-exception
            rx.plugins.c.I(r3)
            rx.exceptions.OnErrorNotImplementedException r4 = new rx.exceptions.OnErrorNotImplementedException
            rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r2[r1] = r9
            r2[r0] = r3
            java.util.List r9 = java.util.Arrays.asList(r2)
            r5.<init>(r9)
            java.lang.String r9 = "Observer.onError not implemented and error while unsubscribing."
            r4.<init>(r9, r5)
            throw r4
    }

    public rx.l<? super T> j() {
            r1 = this;
            rx.l<? super T> r0 = r1.a
            return r0
    }

    public void onCompleted() {
            r3 = this;
            boolean r0 = r3.b
            if (r0 != 0) goto L42
            r0 = 1
            r3.b = r0
            rx.l<? super T> r0 = r3.a     // Catch: java.lang.Throwable -> L1e
            r0.onCompleted()     // Catch: java.lang.Throwable -> L1e
            r3.unsubscribe()     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            rx.plugins.c.I(r0)
            rx.exceptions.UnsubscribeFailedException r1 = new rx.exceptions.UnsubscribeFailedException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        L1e:
            r0 = move-exception
            rx.exceptions.a.e(r0)     // Catch: java.lang.Throwable -> L2f
            rx.plugins.c.I(r0)     // Catch: java.lang.Throwable -> L2f
            rx.exceptions.OnCompletedFailedException r1 = new rx.exceptions.OnCompletedFailedException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            r3.unsubscribe()     // Catch: java.lang.Throwable -> L34
            throw r0
        L34:
            r0 = move-exception
            rx.plugins.c.I(r0)
            rx.exceptions.UnsubscribeFailedException r1 = new rx.exceptions.UnsubscribeFailedException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        L42:
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.exceptions.a.e(r2)
            boolean r0 = r1.b
            if (r0 != 0) goto Ld
            r0 = 1
            r1.b = r0
            r1.g(r2)
        Ld:
            return
    }

    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            rx.l<? super T> r0 = r1.a     // Catch: java.lang.Throwable -> La
            r0.onNext(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            goto Ld
        Lc:
            return
        Ld:
            rx.exceptions.a.f(r2, r1)
            return
    }
}
