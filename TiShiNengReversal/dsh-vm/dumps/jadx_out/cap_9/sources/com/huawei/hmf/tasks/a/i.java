package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class i<TResult> extends com.huawei.hmf.tasks.k<TResult> {
    private final java.lang.Object a;
    private boolean b;
    private volatile boolean c;
    private TResult d;
    private java.lang.Exception e;
    private java.util.List<com.huawei.hmf.tasks.e<TResult>> f;

    final class a implements com.huawei.hmf.tasks.i<TResult> {
        final /* synthetic */ com.huawei.hmf.tasks.j a;
        final /* synthetic */ com.huawei.hmf.tasks.a.i b;
        final /* synthetic */ com.huawei.hmf.tasks.a.i c;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* renamed from: com.huawei.hmf.tasks.a.i$a$a, reason: collision with other inner class name */
        final class C0026a<TContinuationResult> implements com.huawei.hmf.tasks.g<TContinuationResult> {
            final /* synthetic */ com.huawei.hmf.tasks.a.i.a a;

            C0026a(com.huawei.hmf.tasks.a.i.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.huawei.hmf.tasks.g
            public final void a(com.huawei.hmf.tasks.k<TContinuationResult> r2) {
                    r1 = this;
                    boolean r0 = r2.v()
                    if (r0 == 0) goto L12
                    com.huawei.hmf.tasks.a.i$a r0 = r1.a
                    com.huawei.hmf.tasks.a.i r0 = r0.b
                    java.lang.Object r2 = r2.r()
                    r0.A(r2)
                    return
                L12:
                    boolean r0 = r2.t()
                    if (r0 == 0) goto L20
                    com.huawei.hmf.tasks.a.i$a r2 = r1.a
                    com.huawei.hmf.tasks.a.i r2 = r2.b
                    r2.B()
                    return
                L20:
                    com.huawei.hmf.tasks.a.i$a r0 = r1.a
                    com.huawei.hmf.tasks.a.i r0 = r0.b
                    java.lang.Exception r2 = r2.q()
                    r0.z(r2)
                    return
            }
        }

        a(com.huawei.hmf.tasks.a.i r1, com.huawei.hmf.tasks.j r2, com.huawei.hmf.tasks.a.i r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.i
        public final void onSuccess(TResult r3) {
                r2 = this;
                com.huawei.hmf.tasks.j r0 = r2.a     // Catch: java.lang.Exception -> L1e
                com.huawei.hmf.tasks.k r3 = r0.then(r3)     // Catch: java.lang.Exception -> L1e
                if (r3 != 0) goto L15
                com.huawei.hmf.tasks.a.i r3 = r2.b
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "SuccessContinuation returned null"
                r0.<init>(r1)
                r3.z(r0)
                return
            L15:
                com.huawei.hmf.tasks.a.i$a$a r0 = new com.huawei.hmf.tasks.a.i$a$a
                r0.<init>(r2)
                r3.e(r0)
                return
            L1e:
                r3 = move-exception
                com.huawei.hmf.tasks.a.i r0 = r2.b
                r0.z(r3)
                return
        }
    }

    final class b implements com.huawei.hmf.tasks.h {
        final /* synthetic */ com.huawei.hmf.tasks.a.i a;
        final /* synthetic */ com.huawei.hmf.tasks.a.i b;

        b(com.huawei.hmf.tasks.a.i r1, com.huawei.hmf.tasks.a.i r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(java.lang.Exception r2) {
                r1 = this;
                com.huawei.hmf.tasks.a.i r0 = r1.a
                r0.z(r2)
                return
        }
    }

    final class c implements com.huawei.hmf.tasks.f {
        final /* synthetic */ com.huawei.hmf.tasks.a.i a;
        final /* synthetic */ com.huawei.hmf.tasks.a.i b;

        c(com.huawei.hmf.tasks.a.i r1, com.huawei.hmf.tasks.a.i r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.f
        public final void onCanceled() {
                r1 = this;
                com.huawei.hmf.tasks.a.i r0 = r1.a
                r0.B()
                return
        }
    }

    final class d implements com.huawei.hmf.tasks.g<TResult> {
        final /* synthetic */ com.huawei.hmf.tasks.d a;
        final /* synthetic */ com.huawei.hmf.tasks.a.i b;
        final /* synthetic */ com.huawei.hmf.tasks.a.i c;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        final class a<TContinuationResult> implements com.huawei.hmf.tasks.g<TContinuationResult> {
            final /* synthetic */ com.huawei.hmf.tasks.a.i.d a;

            a(com.huawei.hmf.tasks.a.i.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.huawei.hmf.tasks.g
            public final void a(com.huawei.hmf.tasks.k<TContinuationResult> r2) {
                    r1 = this;
                    boolean r0 = r2.v()
                    if (r0 == 0) goto L12
                    com.huawei.hmf.tasks.a.i$d r0 = r1.a
                    com.huawei.hmf.tasks.a.i r0 = r0.b
                    java.lang.Object r2 = r2.r()
                    r0.A(r2)
                    return
                L12:
                    boolean r0 = r2.t()
                    if (r0 == 0) goto L20
                    com.huawei.hmf.tasks.a.i$d r2 = r1.a
                    com.huawei.hmf.tasks.a.i r2 = r2.b
                    r2.B()
                    return
                L20:
                    com.huawei.hmf.tasks.a.i$d r0 = r1.a
                    com.huawei.hmf.tasks.a.i r0 = r0.b
                    java.lang.Exception r2 = r2.q()
                    r0.z(r2)
                    return
            }
        }

        d(com.huawei.hmf.tasks.a.i r1, com.huawei.hmf.tasks.d r2, com.huawei.hmf.tasks.a.i r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.g
        public final void a(com.huawei.hmf.tasks.k<TResult> r3) {
                r2 = this;
                com.huawei.hmf.tasks.d r0 = r2.a     // Catch: java.lang.Exception -> L20
                java.lang.Object r3 = r0.a(r3)     // Catch: java.lang.Exception -> L20
                com.huawei.hmf.tasks.k r3 = (com.huawei.hmf.tasks.k) r3     // Catch: java.lang.Exception -> L20
                if (r3 != 0) goto L17
                com.huawei.hmf.tasks.a.i r3 = r2.b
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Continuation returned null"
                r0.<init>(r1)
                r3.z(r0)
                return
            L17:
                com.huawei.hmf.tasks.a.i$d$a r0 = new com.huawei.hmf.tasks.a.i$d$a
                r0.<init>(r2)
                r3.e(r0)
                return
            L20:
                r3 = move-exception
                com.huawei.hmf.tasks.a.i r0 = r2.b
                r0.z(r3)
                return
        }
    }

    final class e implements com.huawei.hmf.tasks.g<TResult> {
        final /* synthetic */ com.huawei.hmf.tasks.a.i a;
        final /* synthetic */ com.huawei.hmf.tasks.d b;
        final /* synthetic */ com.huawei.hmf.tasks.a.i c;

        e(com.huawei.hmf.tasks.a.i r1, com.huawei.hmf.tasks.a.i r2, com.huawei.hmf.tasks.d r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.g
        public final void a(com.huawei.hmf.tasks.k<TResult> r2) {
                r1 = this;
                boolean r0 = r2.t()
                if (r0 == 0) goto Lc
                com.huawei.hmf.tasks.a.i r2 = r1.a
                r2.B()
                return
            Lc:
                com.huawei.hmf.tasks.d r0 = r1.b     // Catch: java.lang.Exception -> L18
                java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Exception -> L18
                com.huawei.hmf.tasks.a.i r0 = r1.a     // Catch: java.lang.Exception -> L18
                r0.A(r2)     // Catch: java.lang.Exception -> L18
                return
            L18:
                r2 = move-exception
                com.huawei.hmf.tasks.a.i r0 = r1.a
                r0.z(r2)
                return
        }
    }

    public i() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f = r0
            return
    }

    private void C() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.List<com.huawei.hmf.tasks.e<TResult>> r1 = r3.f     // Catch: java.lang.Throwable -> L19
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L19
            com.huawei.hmf.tasks.e r2 = (com.huawei.hmf.tasks.e) r2     // Catch: java.lang.Throwable -> L19
            r2.a(r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b java.lang.RuntimeException -> L22
            goto L9
        L19:
            r1 = move-exception
            goto L29
        L1b:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L19
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L22:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L19
        L24:
            r1 = 0
            r3.f = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    private com.huawei.hmf.tasks.k<TResult> y(com.huawei.hmf.tasks.e<TResult> r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.u()     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.util.List<com.huawei.hmf.tasks.e<TResult>> r2 = r3.f     // Catch: java.lang.Throwable -> Lf
            r2.add(r4)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r4 = move-exception
            goto L18
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L17
            r4.a(r3)
        L17:
            return r3
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    public final void A(TResult r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
        L7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L19
        Lb:
            r1 = 1
            r2.b = r1     // Catch: java.lang.Throwable -> L9
            r2.d = r3     // Catch: java.lang.Throwable -> L9
            java.lang.Object r3 = r2.a     // Catch: java.lang.Throwable -> L9
            r3.notifyAll()     // Catch: java.lang.Throwable -> L9
            r2.C()     // Catch: java.lang.Throwable -> L9
            goto L7
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public final boolean B() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            goto L1b
        Lc:
            r1 = 1
            r3.b = r1     // Catch: java.lang.Throwable -> La
            r3.c = r1     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r3.a     // Catch: java.lang.Throwable -> La
            r2.notifyAll()     // Catch: java.lang.Throwable -> La
            r3.C()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> a(android.app.Activity r3, com.huawei.hmf.tasks.f r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.b r0 = new com.huawei.hmf.tasks.a.b
            java.util.concurrent.Executor r1 = com.huawei.hmf.tasks.m.c()
            r0.<init>(r1, r4)
            com.huawei.hmf.tasks.a.g.c(r3, r0)
            com.huawei.hmf.tasks.k r3 = r2.y(r0)
            return r3
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> b(com.huawei.hmf.tasks.f r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.c(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> c(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.f r3) {
            r1 = this;
            com.huawei.hmf.tasks.a.b r0 = new com.huawei.hmf.tasks.a.b
            r0.<init>(r2, r3)
            com.huawei.hmf.tasks.k r2 = r1.y(r0)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> d(android.app.Activity r3, com.huawei.hmf.tasks.g<TResult> r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.d r0 = new com.huawei.hmf.tasks.a.d
            java.util.concurrent.Executor r1 = com.huawei.hmf.tasks.m.c()
            r0.<init>(r1, r4)
            com.huawei.hmf.tasks.a.g.c(r3, r0)
            com.huawei.hmf.tasks.k r3 = r2.y(r0)
            return r3
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> e(com.huawei.hmf.tasks.g<TResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.f(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> f(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.g<TResult> r3) {
            r1 = this;
            com.huawei.hmf.tasks.a.d r0 = new com.huawei.hmf.tasks.a.d
            r0.<init>(r2, r3)
            com.huawei.hmf.tasks.k r2 = r1.y(r0)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> g(android.app.Activity r3, com.huawei.hmf.tasks.h r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.f r0 = new com.huawei.hmf.tasks.a.f
            java.util.concurrent.Executor r1 = com.huawei.hmf.tasks.m.c()
            r0.<init>(r1, r4)
            com.huawei.hmf.tasks.a.g.c(r3, r0)
            com.huawei.hmf.tasks.k r3 = r2.y(r0)
            return r3
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> h(com.huawei.hmf.tasks.h r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.i(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> i(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.h r3) {
            r1 = this;
            com.huawei.hmf.tasks.a.f r0 = new com.huawei.hmf.tasks.a.f
            r0.<init>(r2, r3)
            com.huawei.hmf.tasks.k r2 = r1.y(r0)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> j(android.app.Activity r3, com.huawei.hmf.tasks.i<TResult> r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.h r0 = new com.huawei.hmf.tasks.a.h
            java.util.concurrent.Executor r1 = com.huawei.hmf.tasks.m.c()
            r0.<init>(r1, r4)
            com.huawei.hmf.tasks.a.g.c(r3, r0)
            com.huawei.hmf.tasks.k r3 = r2.y(r0)
            return r3
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> k(com.huawei.hmf.tasks.i<TResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.l(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final com.huawei.hmf.tasks.k<TResult> l(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.i<TResult> r3) {
            r1 = this;
            com.huawei.hmf.tasks.a.h r0 = new com.huawei.hmf.tasks.a.h
            r0.<init>(r2, r3)
            com.huawei.hmf.tasks.k r2 = r1.y(r0)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> m(com.huawei.hmf.tasks.d<TResult, TContinuationResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.n(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> n(java.util.concurrent.Executor r3, com.huawei.hmf.tasks.d<TResult, TContinuationResult> r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            com.huawei.hmf.tasks.a.i$e r1 = new com.huawei.hmf.tasks.a.i$e
            r1.<init>(r2, r0, r4)
            r2.f(r3, r1)
            return r0
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> o(com.huawei.hmf.tasks.d<TResult, com.huawei.hmf.tasks.k<TContinuationResult>> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.p(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> p(java.util.concurrent.Executor r3, com.huawei.hmf.tasks.d<TResult, com.huawei.hmf.tasks.k<TContinuationResult>> r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            com.huawei.hmf.tasks.a.i$d r1 = new com.huawei.hmf.tasks.a.i$d
            r1.<init>(r2, r4, r0)
            r2.f(r3, r1)
            return r0
    }

    @Override // com.huawei.hmf.tasks.k
    public final java.lang.Exception q() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.lang.Exception r1 = r2.e     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.huawei.hmf.tasks.k
    public final TResult r() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.lang.Exception r1 = r3.e     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            TResult r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L15
        Ld:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.Exception r2 = r3.e     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.huawei.hmf.tasks.k
    public final <E extends java.lang.Throwable> TResult s(java.lang.Class<E> r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            if (r3 == 0) goto L19
            java.lang.Exception r1 = r2.e     // Catch: java.lang.Throwable -> L17
            boolean r1 = r3.isInstance(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto Le
            goto L19
        Le:
            java.lang.Exception r1 = r2.e     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r3.cast(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            goto L29
        L19:
            java.lang.Exception r3 = r2.e     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L21
            TResult r3 = r2.d     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L21:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L17
            java.lang.Exception r1 = r2.e     // Catch: java.lang.Throwable -> L17
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    @Override // com.huawei.hmf.tasks.k
    public final boolean t() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // com.huawei.hmf.tasks.k
    public final boolean u() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.huawei.hmf.tasks.k
    public final boolean v() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            boolean r1 = r2.t()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.lang.Exception r1 = r2.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L13:
            r1 = move-exception
            goto L18
        L15:
            r1 = 0
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> w(com.huawei.hmf.tasks.j<TResult, TContinuationResult> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.m.c()
            com.huawei.hmf.tasks.k r2 = r1.x(r0, r2)
            return r2
    }

    @Override // com.huawei.hmf.tasks.k
    public final <TContinuationResult> com.huawei.hmf.tasks.k<TContinuationResult> x(java.util.concurrent.Executor r3, com.huawei.hmf.tasks.j<TResult, TContinuationResult> r4) {
            r2 = this;
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            com.huawei.hmf.tasks.a.i$a r1 = new com.huawei.hmf.tasks.a.i$a
            r1.<init>(r2, r4, r0)
            r2.l(r3, r1)
            com.huawei.hmf.tasks.a.i$b r3 = new com.huawei.hmf.tasks.a.i$b
            r3.<init>(r2, r0)
            r2.h(r3)
            com.huawei.hmf.tasks.a.i$c r3 = new com.huawei.hmf.tasks.a.i$c
            r3.<init>(r2, r0)
            r2.b(r3)
            return r0
    }

    public final void z(java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
        L7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L19
        Lb:
            r1 = 1
            r2.b = r1     // Catch: java.lang.Throwable -> L9
            r2.e = r3     // Catch: java.lang.Throwable -> L9
            java.lang.Object r3 = r2.a     // Catch: java.lang.Throwable -> L9
            r3.notifyAll()     // Catch: java.lang.Throwable -> L9
            r2.C()     // Catch: java.lang.Throwable -> L9
            goto L7
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }
}
