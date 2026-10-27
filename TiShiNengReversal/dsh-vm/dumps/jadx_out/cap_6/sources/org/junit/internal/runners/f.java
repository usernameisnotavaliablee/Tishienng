package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private final java.lang.Object a;
    private final org.junit.runner.notification.a b;
    private final org.junit.runner.Description c;
    private org.junit.internal.runners.j d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ org.junit.internal.runners.f b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: org.junit.internal.runners.f$a$a, reason: collision with other inner class name */
        class CallableC0078a implements java.util.concurrent.Callable<java.lang.Object> {
            final /* synthetic */ org.junit.internal.runners.f.a a;

            CallableC0078a(org.junit.internal.runners.f.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.concurrent.Callable
            public java.lang.Object call() throws java.lang.Exception {
                    r1 = this;
                    org.junit.internal.runners.f$a r0 = r1.a
                    org.junit.internal.runners.f r0 = r0.b
                    r0.g()
                    r0 = 0
                    return r0
            }
        }

        a(org.junit.internal.runners.f r1, long r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
                org.junit.internal.runners.f$a$a r1 = new org.junit.internal.runners.f$a$a
                r1.<init>(r5)
                java.util.concurrent.Future r1 = r0.submit(r1)
                r0.shutdown()
                long r2 = r5.a     // Catch: java.lang.Exception -> L1e java.util.concurrent.TimeoutException -> L2c
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1e java.util.concurrent.TimeoutException -> L2c
                boolean r2 = r0.awaitTermination(r2, r4)     // Catch: java.lang.Exception -> L1e java.util.concurrent.TimeoutException -> L2c
                if (r2 != 0) goto L20
                r0.shutdownNow()     // Catch: java.lang.Exception -> L1e java.util.concurrent.TimeoutException -> L2c
                goto L20
            L1e:
                r0 = move-exception
                goto L26
            L20:
                r2 = 0
                r1.get(r2, r4)     // Catch: java.lang.Exception -> L1e java.util.concurrent.TimeoutException -> L2c
                return
            L26:
                org.junit.internal.runners.f r1 = r5.b
                r1.a(r0)
                goto L3a
            L2c:
                org.junit.internal.runners.f r0 = r5.b
                org.junit.runners.model.TestTimedOutException r1 = new org.junit.runners.model.TestTimedOutException
                long r2 = r5.a
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1.<init>(r2, r4)
                r0.a(r1)
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ org.junit.internal.runners.f a;

        b(org.junit.internal.runners.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                org.junit.internal.runners.f r0 = r1.a
                r0.g()
                return
        }
    }

    public f(java.lang.Object r1, org.junit.internal.runners.j r2, org.junit.runner.notification.a r3, org.junit.runner.Description r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r2
            return
    }

    private void c() {
            r4 = this;
            org.junit.internal.runners.j r0 = r4.d
            java.util.List r0 = r0.b()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Object r2 = r4.a     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f
            r3 = 0
            r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f
            goto La
        L1d:
            r1 = move-exception
            goto L21
        L1f:
            r1 = move-exception
            goto L25
        L21:
            r4.a(r1)
            goto La
        L25:
            java.lang.Throwable r1 = r1.getTargetException()
            r4.a(r1)
            goto La
        L2d:
            return
    }

    private void d() throws org.junit.internal.runners.c {
            r4 = this;
            org.junit.internal.runners.j r0 = r4.d     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            java.lang.Object r2 = r4.a     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            r3 = 0
            r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1d java.lang.reflect.InvocationTargetException -> L1f org.junit.internal.AssumptionViolatedException -> L30
            goto La
        L1d:
            r0 = move-exception
            goto L27
        L1f:
            r0 = move-exception
            goto L22
        L21:
            return
        L22:
            java.lang.Throwable r0 = r0.getTargetException()     // Catch: java.lang.Throwable -> L1d org.junit.internal.AssumptionViolatedException -> L30
            throw r0     // Catch: java.lang.Throwable -> L1d org.junit.internal.AssumptionViolatedException -> L30
        L27:
            r4.a(r0)
            org.junit.internal.runners.c r0 = new org.junit.internal.runners.c
            r0.<init>()
            throw r0
        L30:
            org.junit.internal.runners.c r0 = new org.junit.internal.runners.c
            r0.<init>()
            throw r0
    }

    private void h(long r2) {
            r1 = this;
            org.junit.internal.runners.f$a r0 = new org.junit.internal.runners.f$a
            r0.<init>(r1, r2)
            r1.e(r0)
            return
    }

    protected void a(java.lang.Throwable r4) {
            r3 = this;
            org.junit.runner.notification.a r0 = r3.b
            org.junit.runner.notification.Failure r1 = new org.junit.runner.notification.Failure
            org.junit.runner.Description r2 = r3.c
            r1.<init>(r2, r4)
            r0.f(r1)
            return
    }

    public void b() {
            r5 = this;
            org.junit.internal.runners.j r0 = r5.d
            boolean r0 = r0.g()
            if (r0 == 0) goto L10
            org.junit.runner.notification.a r0 = r5.b
            org.junit.runner.Description r1 = r5.c
            r0.i(r1)
            return
        L10:
            org.junit.runner.notification.a r0 = r5.b
            org.junit.runner.Description r1 = r5.c
            r0.l(r1)
            org.junit.internal.runners.j r0 = r5.d     // Catch: java.lang.Throwable -> L27
            long r0 = r0.e()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L29
            r5.h(r0)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r0 = move-exception
            goto L34
        L29:
            r5.f()     // Catch: java.lang.Throwable -> L27
        L2c:
            org.junit.runner.notification.a r0 = r5.b
            org.junit.runner.Description r1 = r5.c
            r0.h(r1)
            return
        L34:
            org.junit.runner.notification.a r1 = r5.b
            org.junit.runner.Description r2 = r5.c
            r1.h(r2)
            throw r0
    }

    public void e(java.lang.Runnable r2) {
            r1 = this;
            r1.d()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc org.junit.internal.runners.c -> L18
            r2.run()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc org.junit.internal.runners.c -> L18
            r1.c()
            return
        La:
            r2 = move-exception
            goto L14
        Lc:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "test should never throw an exception to this level"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> La
        L14:
            r1.c()
            throw r2
        L18:
            r1.c()
            return
    }

    public void f() {
            r1 = this;
            org.junit.internal.runners.f$b r0 = new org.junit.internal.runners.f$b
            r0.<init>(r1)
            r1.e(r0)
            return
    }

    protected void g() {
            r3 = this;
            org.junit.internal.runners.j r0 = r3.d     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            r0.f(r1)     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            org.junit.internal.runners.j r0 = r3.d     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            if (r0 == 0) goto L90
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.String r2 = "Expected exception: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            org.junit.internal.runners.j r2 = r3.d     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.Class r2 = r2.d()     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            r1.append(r2)     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            r3.a(r0)     // Catch: java.lang.Throwable -> L33 java.lang.reflect.InvocationTargetException -> L35
            return
        L33:
            r0 = move-exception
            goto L37
        L35:
            r0 = move-exception
            goto L3b
        L37:
            r3.a(r0)
            goto L90
        L3b:
            java.lang.Throwable r0 = r0.getTargetException()
            boolean r1 = r0 instanceof org.junit.internal.AssumptionViolatedException
            if (r1 == 0) goto L44
            goto L90
        L44:
            org.junit.internal.runners.j r1 = r3.d
            boolean r1 = r1.a()
            if (r1 != 0) goto L50
            r3.a(r0)
            goto L90
        L50:
            org.junit.internal.runners.j r1 = r3.d
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected exception, expected<"
            r1.append(r2)
            org.junit.internal.runners.j r2 = r3.d
            java.lang.Class r2 = r2.d()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = "> but was<"
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ">"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r1, r0)
            r3.a(r2)
        L90:
            return
    }
}
