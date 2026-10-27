package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class z {
    private static final retrofit2.z c = null;
    private final boolean a;

    @javax.annotation.Nullable
    private final java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends retrofit2.z {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: retrofit2.z$a$a, reason: collision with other inner class name */
        static final class ExecutorC0098a implements java.util.concurrent.Executor {
            private final android.os.Handler a;

            ExecutorC0098a() {
                    r2 = this;
                    r2.<init>()
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    r2.a = r0
                    return
            }

            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable r2) {
                    r1 = this;
                    android.os.Handler r0 = r1.a
                    r0.post(r2)
                    return
            }
        }

        a() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                r2.<init>(r0)
                return
        }

        @Override // retrofit2.z
        public java.util.concurrent.Executor c() {
                r1 = this;
                retrofit2.z$a$a r0 = new retrofit2.z$a$a
                r0.<init>()
                return r0
        }

        @Override // retrofit2.z
        @javax.annotation.Nullable
        java.lang.Object h(java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Object r5, java.lang.Object... r6) throws java.lang.Throwable {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto Lb
                java.lang.Object r3 = super.h(r3, r4, r5, r6)
                return r3
            Lb:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r4 = "Calling default methods on API 24 and 25 is not supported"
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            retrofit2.z r0 = f()
            retrofit2.z.c = r0
            return
    }

    z(boolean r5) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r0 = 0
            if (r5 == 0) goto L20
            java.lang.Class r5 = retrofit2.s.a()     // Catch: java.lang.Throwable -> L20
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L20
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Constructor r0 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L20
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L20
        L20:
            r4.b = r0
            return
    }

    private static retrofit2.z f() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            retrofit2.z$a r0 = new retrofit2.z$a
            r0.<init>()
            return r0
        L14:
            retrofit2.z r0 = new retrofit2.z
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    static retrofit2.z g() {
            retrofit2.z r0 = retrofit2.z.c
            return r0
    }

    java.util.List<? extends retrofit2.c.a> a(@javax.annotation.Nullable java.util.concurrent.Executor r4) {
            r3 = this;
            retrofit2.h r0 = new retrofit2.h
            r0.<init>(r4)
            boolean r4 = r3.a
            if (r4 == 0) goto L19
            r4 = 2
            retrofit2.c$a[] r4 = new retrofit2.c.a[r4]
            retrofit2.c$a r1 = retrofit2.f.a
            r2 = 0
            r4[r2] = r1
            r1 = 1
            r4[r1] = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            return r4
        L19:
            java.util.List r4 = java.util.Collections.singletonList(r0)
            return r4
    }

    int b() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 2
            return r0
        L6:
            r0 = 1
            return r0
    }

    @javax.annotation.Nullable
    java.util.concurrent.Executor c() {
            r1 = this;
            r0 = 0
            return r0
    }

    java.util.List<? extends retrofit2.g.a> d() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Lb
            retrofit2.g$a r0 = retrofit2.q.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        Lb:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    int e() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @javax.annotation.Nullable
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    java.lang.Object h(java.lang.reflect.Method r5, java.lang.Class<?> r6, java.lang.Object r7, java.lang.Object... r8) throws java.lang.Throwable {
            r4 = this;
            java.lang.reflect.Constructor<java.lang.invoke.MethodHandles$Lookup> r0 = r4.b
            if (r0 == 0) goto L1b
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r1
            java.lang.Object r0 = r0.newInstance(r2)
            java.lang.invoke.MethodHandles$Lookup r0 = retrofit2.t.a(r0)
            goto L1f
        L1b:
            java.lang.invoke.MethodHandles$Lookup r0 = retrofit2.u.a()
        L1f:
            java.lang.invoke.MethodHandle r5 = retrofit2.v.a(r0, r5, r6)
            java.lang.invoke.MethodHandle r5 = retrofit2.w.a(r5, r7)
            java.lang.Object r5 = retrofit2.x.a(r5, r8)
            return r5
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    boolean i(java.lang.reflect.Method r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Lc
            boolean r2 = retrofit2.y.a(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
