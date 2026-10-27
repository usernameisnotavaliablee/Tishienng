package com.trello.rxlifecycle2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class a {
    static final io.reactivex.functions.Function<java.lang.Throwable, java.lang.Boolean> a = null;
    static final io.reactivex.functions.Predicate<java.lang.Boolean> b = null;
    static final io.reactivex.functions.Function<java.lang.Object, io.reactivex.Completable> c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.trello.rxlifecycle2.a$a, reason: collision with other inner class name */
    static class C0039a implements io.reactivex.functions.Function<java.lang.Throwable, java.lang.Boolean> {
        C0039a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Boolean a(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                boolean r0 = r2 instanceof com.trello.rxlifecycle2.OutsideLifecycleException
                if (r0 == 0) goto L7
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                return r2
            L7:
                io.reactivex.exceptions.Exceptions.propagate(r2)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements io.reactivex.functions.Predicate<java.lang.Boolean> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean a(java.lang.Boolean r1) throws java.lang.Exception {
                r0 = this;
                boolean r1 = r1.booleanValue()
                return r1
        }

        public /* bridge */ /* synthetic */ boolean test(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements io.reactivex.functions.Function<java.lang.Object, io.reactivex.Completable> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.reactivex.Completable a(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
                r1.<init>()
                io.reactivex.Completable r1 = io.reactivex.Completable.error(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Completable r1 = r0.a(r1)
                return r1
        }
    }

    static {
            com.trello.rxlifecycle2.a$a r0 = new com.trello.rxlifecycle2.a$a
            r0.<init>()
            com.trello.rxlifecycle2.a.a = r0
            com.trello.rxlifecycle2.a$b r0 = new com.trello.rxlifecycle2.a$b
            r0.<init>()
            com.trello.rxlifecycle2.a.b = r0
            com.trello.rxlifecycle2.a$c r0 = new com.trello.rxlifecycle2.a$c
            r0.<init>()
            com.trello.rxlifecycle2.a.c = r0
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }
}
