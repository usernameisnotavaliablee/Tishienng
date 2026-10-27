package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class j {

    final class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hmf.tasks.l a;
        final /* synthetic */ java.util.concurrent.Callable b;
        final /* synthetic */ com.huawei.hmf.tasks.a.j c;

        a(com.huawei.hmf.tasks.a.j r1, com.huawei.hmf.tasks.l r2, java.util.concurrent.Callable r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.huawei.hmf.tasks.l r0 = r2.a     // Catch: java.lang.Exception -> Lc
                java.util.concurrent.Callable r1 = r2.b     // Catch: java.lang.Exception -> Lc
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> Lc
                r0.setResult(r1)     // Catch: java.lang.Exception -> Lc
                return
            Lc:
                r0 = move-exception
                com.huawei.hmf.tasks.l r1 = r2.a
                r1.c(r0)
                return
        }
    }

    static class b implements com.huawei.hmf.tasks.d<java.lang.Void, java.util.List<com.huawei.hmf.tasks.k<?>>> {
        final /* synthetic */ java.util.Collection a;

        b(java.util.Collection r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.d
        public final /* synthetic */ java.util.List<com.huawei.hmf.tasks.k<?>> a(com.huawei.hmf.tasks.k<java.lang.Void> r2) throws java.lang.Exception {
                r1 = this;
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Collection r0 = r1.a
                int r0 = r0.size()
                r2.<init>(r0)
                java.util.Collection r0 = r1.a
                r2.addAll(r0)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TResult] */
    static class c<TResult> implements com.huawei.hmf.tasks.d<java.lang.Void, java.util.List<TResult>> {
        final /* synthetic */ java.util.Collection a;

        c(java.util.Collection r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hmf.tasks.d
        public final /* synthetic */ java.lang.Object a(com.huawei.hmf.tasks.k<java.lang.Void> r3) throws java.lang.Exception {
                r2 = this;
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Collection r0 = r2.a
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                com.huawei.hmf.tasks.k r1 = (com.huawei.hmf.tasks.k) r1
                java.lang.Object r1 = r1.r()
                r3.add(r1)
                goto Lb
            L1f:
                return r3
        }
    }

    public static class d<TResult> implements com.huawei.hmf.tasks.f, com.huawei.hmf.tasks.h, com.huawei.hmf.tasks.i<TResult> {
        public final java.util.concurrent.CountDownLatch a;

        public d() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.a = r0
                return
        }

        @Override // com.huawei.hmf.tasks.f
        public final void onCanceled() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(java.lang.Exception r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.a
                r1.countDown()
                return
        }

        @Override // com.huawei.hmf.tasks.i
        public final void onSuccess(TResult r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.a
                r1.countDown()
                return
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> a(TResult r1) {
            com.huawei.hmf.tasks.l r0 = new com.huawei.hmf.tasks.l
            r0.<init>()
            r0.setResult(r1)
            com.huawei.hmf.tasks.k r1 = r0.b()
            return r1
    }

    public static com.huawei.hmf.tasks.k<java.util.List<com.huawei.hmf.tasks.k<?>>> b(java.util.Collection<? extends com.huawei.hmf.tasks.k<?>> r2) {
            com.huawei.hmf.tasks.k r0 = g(r2)
            com.huawei.hmf.tasks.a.j$b r1 = new com.huawei.hmf.tasks.a.j$b
            r1.<init>(r2)
            com.huawei.hmf.tasks.k r2 = r0.m(r1)
            return r2
    }

    public static <TResult> TResult d(com.huawei.hmf.tasks.k<TResult> r1) throws java.util.concurrent.ExecutionException {
            boolean r0 = r1.v()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.r()
            return r1
        Lb:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Exception r1 = r1.q()
            r0.<init>(r1)
            throw r0
    }

    public static void e(java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    public static <TResult> com.huawei.hmf.tasks.k<java.util.List<TResult>> f(java.util.Collection<? extends com.huawei.hmf.tasks.k<?>> r2) {
            com.huawei.hmf.tasks.k r0 = g(r2)
            com.huawei.hmf.tasks.a.j$c r1 = new com.huawei.hmf.tasks.a.j$c
            r1.<init>(r2)
            com.huawei.hmf.tasks.k r2 = r0.m(r1)
            return r2
    }

    public static com.huawei.hmf.tasks.k<java.lang.Void> g(java.util.Collection<? extends com.huawei.hmf.tasks.k<?>> r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lc
            r4 = 0
            com.huawei.hmf.tasks.k r4 = a(r4)
            return r4
        Lc:
            java.util.Iterator r0 = r4.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            com.huawei.hmf.tasks.k r1 = (com.huawei.hmf.tasks.k) r1
            if (r1 == 0) goto L1f
            goto L10
        L1f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "task can not is null"
            r4.<init>(r0)
            throw r4
        L27:
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            com.huawei.hmf.tasks.a.e r1 = new com.huawei.hmf.tasks.a.e
            int r2 = r4.size()
            r1.<init>(r2, r0)
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r4.next()
            com.huawei.hmf.tasks.k r2 = (com.huawei.hmf.tasks.k) r2
            java.util.concurrent.Executor r3 = com.huawei.hmf.tasks.m.b()
            r2.l(r3, r1)
            java.util.concurrent.Executor r3 = com.huawei.hmf.tasks.m.b()
            r2.i(r3, r1)
            java.util.concurrent.Executor r3 = com.huawei.hmf.tasks.m.b()
            r2.c(r3, r1)
            goto L39
        L5b:
            return r0
    }

    public final <TResult> com.huawei.hmf.tasks.k<TResult> c(java.util.concurrent.Executor r3, java.util.concurrent.Callable<TResult> r4) {
            r2 = this;
            com.huawei.hmf.tasks.l r0 = new com.huawei.hmf.tasks.l
            r0.<init>()
            com.huawei.hmf.tasks.a.j$a r1 = new com.huawei.hmf.tasks.a.j$a     // Catch: java.lang.Exception -> Le
            r1.<init>(r2, r0, r4)     // Catch: java.lang.Exception -> Le
            r3.execute(r1)     // Catch: java.lang.Exception -> Le
            goto L12
        Le:
            r3 = move-exception
            r0.c(r3)
        L12:
            com.huawei.hmf.tasks.k r3 = r0.b()
            return r3
    }
}
