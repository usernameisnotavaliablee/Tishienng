package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> extends rx.l<T> {
        final /* synthetic */ rx.f a;

        a(rx.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.f r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.f r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.f r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<T> extends rx.l<T> {
        final /* synthetic */ rx.functions.b a;

        b(rx.functions.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r0 = this;
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.exceptions.OnErrorNotImplementedException r0 = new rx.exceptions.OnErrorNotImplementedException
                r0.<init>(r2)
                throw r0
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c<T> extends rx.l<T> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.functions.b b;

        c(rx.functions.b r1, rx.functions.b r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r0 = this;
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r2)
                return
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.b
                r0.call(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d<T> extends rx.l<T> {
        final /* synthetic */ rx.functions.a a;
        final /* synthetic */ rx.functions.b b;
        final /* synthetic */ rx.functions.b c;

        d(rx.functions.a r1, rx.functions.b r2, rx.functions.b r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r1 = this;
                rx.functions.a r0 = r1.a
                r0.call()
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.b
                r0.call(r2)
                return
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.c
                r0.call(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e<T> extends rx.l<T> {
        final /* synthetic */ rx.l a;

        e(rx.l r1, rx.l r2) {
                r0 = this;
                r0.a = r2
                r0.<init>(r1)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    private h() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> rx.l<T> a(rx.functions.b<? super T> r1) {
            if (r1 == 0) goto L8
            rx.observers.h$b r0 = new rx.observers.h$b
            r0.<init>(r1)
            return r0
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onNext can not be null"
            r1.<init>(r0)
            throw r1
    }

    public static <T> rx.l<T> b(rx.functions.b<? super T> r1, rx.functions.b<java.lang.Throwable> r2) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto La
            rx.observers.h$c r0 = new rx.observers.h$c
            r0.<init>(r2, r1)
            return r0
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onError can not be null"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onNext can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.l<T> c(rx.functions.b<? super T> r1, rx.functions.b<java.lang.Throwable> r2, rx.functions.a r3) {
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L14
            if (r3 == 0) goto Lc
            rx.observers.h$d r0 = new rx.observers.h$d
            r0.<init>(r3, r2, r1)
            return r0
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onComplete can not be null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onError can not be null"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onNext can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.l<T> d() {
            rx.f r0 = rx.observers.c.d()
            rx.l r0 = e(r0)
            return r0
    }

    public static <T> rx.l<T> e(rx.f<? super T> r1) {
            rx.observers.h$a r0 = new rx.observers.h$a
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.l<T> f(rx.l<? super T> r1) {
            rx.observers.h$e r0 = new rx.observers.h$e
            r0.<init>(r1, r1)
            return r0
    }
}
