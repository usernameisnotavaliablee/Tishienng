package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l3 implements java.lang.Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public static final com.acse.ottn.q4 f2448k = null;
    public static final com.acse.ottn.q4 l = null;
    public static java.lang.Class[] m;
    public static java.lang.Class[] n;
    public static java.lang.Class[] o;
    public static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> p = null;
    public static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> q = null;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.k3 f2449b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Method f2450c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f2451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f2452e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.c2 f2453f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f2454g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f2455h;

    /* renamed from: i, reason: collision with root package name */
    public com.acse.ottn.q4 f2456i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Object f2457j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.acse.ottn.l3 {
        public com.acse.ottn.k1 r;
        public com.acse.ottn.j1 s;
        public float t;

        public b(com.acse.ottn.k3 r2, com.acse.ottn.j1 r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.lang.Class r0 = java.lang.Float.TYPE
                r1.f2452e = r0
                r1.f2453f = r3
                r1.s = r3
                boolean r2 = r2 instanceof com.acse.ottn.k1
                if (r2 == 0) goto L16
                com.acse.ottn.k3 r2 = r1.f2449b
                com.acse.ottn.k1 r2 = (com.acse.ottn.k1) r2
                r1.r = r2
            L16:
                return
        }

        public b(com.acse.ottn.k3 r2, float... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.a(r3)
                boolean r2 = r2 instanceof com.acse.ottn.k1
                if (r2 == 0) goto L11
                com.acse.ottn.k3 r2 = r1.f2449b
                com.acse.ottn.k1 r2 = (com.acse.ottn.k1) r2
                r1.r = r2
            L11:
                return
        }

        public b(java.lang.String r2, com.acse.ottn.j1 r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.lang.Class r2 = java.lang.Float.TYPE
                r1.f2452e = r2
                r1.f2453f = r3
                r1.s = r3
                return
        }

        public b(java.lang.String r2, float... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.a(r3)
                return
        }

        @Override // com.acse.ottn.l3
        public /* bridge */ /* synthetic */ com.acse.ottn.l3 a() {
                r1 = this;
                com.acse.ottn.l3$b r0 = r1.e()
                return r0
        }

        @Override // com.acse.ottn.l3
        public void a(float r2) {
                r1 = this;
                com.acse.ottn.j1 r0 = r1.s
                float r2 = r0.b(r2)
                r1.t = r2
                return
        }

        @Override // com.acse.ottn.l3
        public void a(java.lang.Object r4) {
                r3 = this;
                com.acse.ottn.k1 r0 = r3.r
                if (r0 == 0) goto La
                float r1 = r3.t
                r0.a(r4, r1)
                return
            La:
                com.acse.ottn.k3 r0 = r3.f2449b
                if (r0 == 0) goto L18
                float r1 = r3.t
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0.a(r4, r1)
                return
            L18:
                java.lang.reflect.Method r0 = r3.f2450c
                if (r0 == 0) goto L3a
                java.lang.Object[] r0 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                float r1 = r3.t     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                r2 = 0
                r0[r2] = r1     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.reflect.Method r0 = r3.f2450c     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r1 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                r0.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                return
            L2f:
                r4 = move-exception
                goto L33
            L31:
                r4 = move-exception
                goto L37
            L33:
                r4.toString()
                goto L3a
            L37:
                r4.toString()
            L3a:
                return
        }

        @Override // com.acse.ottn.l3
        public void a(float... r1) {
                r0 = this;
                super.a(r1)
                com.acse.ottn.c2 r1 = r0.f2453f
                com.acse.ottn.j1 r1 = (com.acse.ottn.j1) r1
                r0.s = r1
                return
        }

        @Override // com.acse.ottn.l3
        public java.lang.Object b() {
                r1 = this;
                float r0 = r1.t
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                return r0
        }

        @Override // com.acse.ottn.l3
        public void b(java.lang.Class r2) {
                r1 = this;
                com.acse.ottn.k3 r0 = r1.f2449b
                if (r0 == 0) goto L5
                return
            L5:
                super.b(r2)
                return
        }

        @Override // com.acse.ottn.l3
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.l3$b r0 = r1.e()
                return r0
        }

        public com.acse.ottn.l3.b e() {
                r2 = this;
                com.acse.ottn.l3 r0 = super.a()
                com.acse.ottn.l3$b r0 = (com.acse.ottn.l3.b) r0
                com.acse.ottn.c2 r1 = r0.f2453f
                com.acse.ottn.j1 r1 = (com.acse.ottn.j1) r1
                r0.s = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends com.acse.ottn.l3 {
        public com.acse.ottn.z1 r;
        public com.acse.ottn.y1 s;
        public int t;

        public c(com.acse.ottn.k3 r2, com.acse.ottn.y1 r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.lang.Class r0 = java.lang.Integer.TYPE
                r1.f2452e = r0
                r1.f2453f = r3
                r1.s = r3
                boolean r2 = r2 instanceof com.acse.ottn.z1
                if (r2 == 0) goto L16
                com.acse.ottn.k3 r2 = r1.f2449b
                com.acse.ottn.z1 r2 = (com.acse.ottn.z1) r2
                r1.r = r2
            L16:
                return
        }

        public c(com.acse.ottn.k3 r2, int... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.a(r3)
                boolean r2 = r2 instanceof com.acse.ottn.z1
                if (r2 == 0) goto L11
                com.acse.ottn.k3 r2 = r1.f2449b
                com.acse.ottn.z1 r2 = (com.acse.ottn.z1) r2
                r1.r = r2
            L11:
                return
        }

        public c(java.lang.String r2, com.acse.ottn.y1 r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.lang.Class r2 = java.lang.Integer.TYPE
                r1.f2452e = r2
                r1.f2453f = r3
                r1.s = r3
                return
        }

        public c(java.lang.String r2, int... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.a(r3)
                return
        }

        @Override // com.acse.ottn.l3
        public /* bridge */ /* synthetic */ com.acse.ottn.l3 a() {
                r1 = this;
                com.acse.ottn.l3$c r0 = r1.e()
                return r0
        }

        @Override // com.acse.ottn.l3
        public void a(float r2) {
                r1 = this;
                com.acse.ottn.y1 r0 = r1.s
                int r2 = r0.b(r2)
                r1.t = r2
                return
        }

        @Override // com.acse.ottn.l3
        public void a(java.lang.Object r4) {
                r3 = this;
                com.acse.ottn.z1 r0 = r3.r
                if (r0 == 0) goto La
                int r1 = r3.t
                r0.a(r4, r1)
                return
            La:
                com.acse.ottn.k3 r0 = r3.f2449b
                if (r0 == 0) goto L18
                int r1 = r3.t
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.a(r4, r1)
                return
            L18:
                java.lang.reflect.Method r0 = r3.f2450c
                if (r0 == 0) goto L3a
                java.lang.Object[] r0 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                int r1 = r3.t     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                r2 = 0
                r0[r2] = r1     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.reflect.Method r0 = r3.f2450c     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r1 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                r0.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L2f java.lang.reflect.InvocationTargetException -> L31
                return
            L2f:
                r4 = move-exception
                goto L33
            L31:
                r4 = move-exception
                goto L37
            L33:
                r4.toString()
                goto L3a
            L37:
                r4.toString()
            L3a:
                return
        }

        @Override // com.acse.ottn.l3
        public void a(int... r1) {
                r0 = this;
                super.a(r1)
                com.acse.ottn.c2 r1 = r0.f2453f
                com.acse.ottn.y1 r1 = (com.acse.ottn.y1) r1
                r0.s = r1
                return
        }

        @Override // com.acse.ottn.l3
        public java.lang.Object b() {
                r1 = this;
                int r0 = r1.t
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // com.acse.ottn.l3
        public void b(java.lang.Class r2) {
                r1 = this;
                com.acse.ottn.k3 r0 = r1.f2449b
                if (r0 == 0) goto L5
                return
            L5:
                super.b(r2)
                return
        }

        @Override // com.acse.ottn.l3
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.l3$c r0 = r1.e()
                return r0
        }

        public com.acse.ottn.l3.c e() {
                r2 = this;
                com.acse.ottn.l3 r0 = super.a()
                com.acse.ottn.l3$c r0 = (com.acse.ottn.l3.c) r0
                com.acse.ottn.c2 r1 = r0.f2453f
                com.acse.ottn.y1 r1 = (com.acse.ottn.y1) r1
                r0.s = r1
                return r0
        }
    }

    static {
            com.acse.ottn.x1 r0 = new com.acse.ottn.x1
            r0.<init>()
            com.acse.ottn.l3.f2448k = r0
            com.acse.ottn.h1 r0 = new com.acse.ottn.h1
            r0.<init>()
            com.acse.ottn.l3.l = r0
            r0 = 6
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            java.lang.Class r3 = java.lang.Float.TYPE
            r1[r2] = r3
            r4 = 1
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            r1[r4] = r5
            r6 = 2
            java.lang.Class r7 = java.lang.Double.TYPE
            r1[r6] = r7
            r8 = 3
            java.lang.Class r9 = java.lang.Integer.TYPE
            r1[r8] = r9
            r10 = 4
            java.lang.Class<java.lang.Double> r11 = java.lang.Double.class
            r1[r10] = r11
            r12 = 5
            java.lang.Class<java.lang.Integer> r13 = java.lang.Integer.class
            r1[r12] = r13
            com.acse.ottn.l3.m = r1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r1[r2] = r9
            r1[r4] = r13
            r1[r6] = r3
            r1[r8] = r7
            r1[r10] = r5
            r1[r12] = r11
            com.acse.ottn.l3.n = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r0[r2] = r7
            r0[r4] = r11
            r0[r6] = r3
            r0[r8] = r9
            r0[r10] = r5
            r0[r12] = r13
            com.acse.ottn.l3.o = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.acse.ottn.l3.p = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.acse.ottn.l3.q = r0
            return
    }

    public l3(com.acse.ottn.k3 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2450c = r0
            r1.f2451d = r0
            r1.f2453f = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.f2454g = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f2455h = r0
            r1.f2449b = r2
            if (r2 == 0) goto L20
            java.lang.String r2 = r2.a()
            r1.a = r2
        L20:
            return
    }

    public /* synthetic */ l3(com.acse.ottn.k3 r1, com.acse.ottn.l3.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public l3(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2450c = r0
            r1.f2451d = r0
            r1.f2453f = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.f2454g = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f2455h = r0
            r1.a = r2
            return
    }

    public /* synthetic */ l3(java.lang.String r1, com.acse.ottn.l3.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <V> com.acse.ottn.l3 a(com.acse.ottn.k3 r1, com.acse.ottn.q4<V> r2, V... r3) {
            com.acse.ottn.l3 r0 = new com.acse.ottn.l3
            r0.<init>(r1)
            r0.a(r3)
            r0.a(r2)
            return r0
    }

    public static com.acse.ottn.l3 a(com.acse.ottn.k3<?, java.lang.Float> r1, float... r2) {
            com.acse.ottn.l3$b r0 = new com.acse.ottn.l3$b
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.l3 a(com.acse.ottn.k3<?, java.lang.Integer> r1, int... r2) {
            com.acse.ottn.l3$c r0 = new com.acse.ottn.l3$c
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.l3 a(com.acse.ottn.k3 r2, com.acse.ottn.b2... r3) {
            com.acse.ottn.c2 r0 = com.acse.ottn.c2.a(r3)
            boolean r1 = r0 instanceof com.acse.ottn.y1
            if (r1 == 0) goto L10
            com.acse.ottn.l3$c r3 = new com.acse.ottn.l3$c
            com.acse.ottn.y1 r0 = (com.acse.ottn.y1) r0
            r3.<init>(r2, r0)
            return r3
        L10:
            boolean r1 = r0 instanceof com.acse.ottn.j1
            if (r1 == 0) goto L1c
            com.acse.ottn.l3$b r3 = new com.acse.ottn.l3$b
            com.acse.ottn.j1 r0 = (com.acse.ottn.j1) r0
            r3.<init>(r2, r0)
            return r3
        L1c:
            com.acse.ottn.l3 r1 = new com.acse.ottn.l3
            r1.<init>(r2)
            r1.f2453f = r0
            r2 = 0
            r2 = r3[r2]
            java.lang.Class r2 = r2.d()
            r1.f2452e = r2
            return r1
    }

    public static com.acse.ottn.l3 a(java.lang.String r1, com.acse.ottn.q4 r2, java.lang.Object... r3) {
            com.acse.ottn.l3 r0 = new com.acse.ottn.l3
            r0.<init>(r1)
            r0.a(r3)
            r0.a(r2)
            return r0
    }

    public static com.acse.ottn.l3 a(java.lang.String r1, float... r2) {
            com.acse.ottn.l3$b r0 = new com.acse.ottn.l3$b
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.l3 a(java.lang.String r1, int... r2) {
            com.acse.ottn.l3$c r0 = new com.acse.ottn.l3$c
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.l3 a(java.lang.String r2, com.acse.ottn.b2... r3) {
            com.acse.ottn.c2 r0 = com.acse.ottn.c2.a(r3)
            boolean r1 = r0 instanceof com.acse.ottn.y1
            if (r1 == 0) goto L10
            com.acse.ottn.l3$c r3 = new com.acse.ottn.l3$c
            com.acse.ottn.y1 r0 = (com.acse.ottn.y1) r0
            r3.<init>(r2, r0)
            return r3
        L10:
            boolean r1 = r0 instanceof com.acse.ottn.j1
            if (r1 == 0) goto L1c
            com.acse.ottn.l3$b r3 = new com.acse.ottn.l3$b
            com.acse.ottn.j1 r0 = (com.acse.ottn.j1) r0
            r3.<init>(r2, r0)
            return r3
        L1c:
            com.acse.ottn.l3 r1 = new com.acse.ottn.l3
            r1.<init>(r2)
            r1.f2453f = r0
            r2 = 0
            r2 = r3[r2]
            java.lang.Class r2 = r2.d()
            r1.f2452e = r2
            return r1
    }

    public static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            if (r3 == 0) goto L29
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L29
        L9:
            r0 = 0
            char r0 = r3.charAt(r0)
            char r0 = java.lang.Character.toUpperCase(r0)
            r1 = 1
            java.lang.String r3 = r3.substring(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
        L29:
            return r2
    }

    public com.acse.ottn.l3 a() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            com.acse.ottn.l3 r0 = (com.acse.ottn.l3) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.String r1 = r2.a     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.a = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            com.acse.ottn.k3 r1 = r2.f2449b     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f2449b = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            com.acse.ottn.c2 r1 = r2.f2453f     // Catch: java.lang.CloneNotSupportedException -> L1b
            com.acse.ottn.c2 r1 = r1.a()     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f2453f = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            com.acse.ottn.q4 r1 = r2.f2456i     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f2456i = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public final java.lang.reflect.Method a(java.lang.Class r8, java.lang.String r9, java.lang.Class r10) {
            r7 = this;
            java.lang.String r0 = r7.a
            java.lang.String r9 = a(r9, r0)
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L1c
            java.lang.reflect.Method r8 = r8.getMethod(r9, r1)     // Catch: java.lang.NoSuchMethodException -> Lf
            return r8
        Lf:
            r10 = move-exception
            java.lang.reflect.Method r1 = r8.getDeclaredMethod(r9, r1)     // Catch: java.lang.NoSuchMethodException -> L18
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L18
            goto L6d
        L18:
            r10.toString()
            goto L6d
        L1c:
            java.lang.Class r10 = r7.f2452e
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            boolean r10 = r10.equals(r2)
            r2 = 0
            if (r10 == 0) goto L2a
            java.lang.Class[] r10 = com.acse.ottn.l3.m
            goto L4a
        L2a:
            java.lang.Class r10 = r7.f2452e
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L37
            java.lang.Class[] r10 = com.acse.ottn.l3.n
            goto L4a
        L37:
            java.lang.Class r10 = r7.f2452e
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L44
            java.lang.Class[] r10 = com.acse.ottn.l3.o
            goto L4a
        L44:
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r3 = r7.f2452e
            r10[r2] = r3
        L4a:
            int r3 = r10.length
            r4 = 0
        L4c:
            if (r4 >= r3) goto L68
            r5 = r10[r4]
            java.lang.Class[] r6 = new java.lang.Class[r0]
            r6[r2] = r5
            java.lang.reflect.Method r1 = r8.getMethod(r9, r6)     // Catch: java.lang.NoSuchMethodException -> L5b
            r7.f2452e = r5     // Catch: java.lang.NoSuchMethodException -> L5b
            return r1
        L5b:
            java.lang.reflect.Method r1 = r8.getDeclaredMethod(r9, r6)     // Catch: java.lang.NoSuchMethodException -> L65
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L65
            r7.f2452e = r5     // Catch: java.lang.NoSuchMethodException -> L65
            return r1
        L65:
            int r4 = r4 + 1
            goto L4c
        L68:
            java.lang.Class r8 = r7.f2452e
            java.util.Objects.toString(r8)
        L6d:
            return r1
    }

    public final java.lang.reflect.Method a(java.lang.Class r3, java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> r4, java.lang.String r5, java.lang.Class r6) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f2454g     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Throwable -> L1a
            r0.lock()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            java.lang.String r1 = r2.a     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r3 = move-exception
            goto L3c
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L32
            java.lang.reflect.Method r1 = r2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L2d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L1a
        L2d:
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L1a
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1a
        L32:
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.f2454g
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.unlock()
            return r1
        L3c:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r2.f2454g
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.unlock()
            throw r3
    }

    public void a(float r2) {
            r1 = this;
            com.acse.ottn.c2 r0 = r1.f2453f
            java.lang.Object r2 = r0.a(r2)
            r1.f2457j = r2
            return
    }

    public void a(com.acse.ottn.k3 r1) {
            r0 = this;
            r0.f2449b = r1
            return
    }

    public void a(com.acse.ottn.q4 r2) {
            r1 = this;
            r1.f2456i = r2
            com.acse.ottn.c2 r0 = r1.f2453f
            r0.a(r2)
            return
    }

    public final void a(java.lang.Class r4) {
            r3 = this;
            java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> r0 = com.acse.ottn.l3.q
            java.lang.String r1 = "get"
            r2 = 0
            java.lang.reflect.Method r4 = r3.a(r4, r0, r1, r2)
            r3.f2451d = r4
            return
    }

    public void a(java.lang.Object r4) {
            r3 = this;
            com.acse.ottn.k3 r0 = r3.f2449b
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r3.b()
            r0.a(r4, r1)
        Lb:
            java.lang.reflect.Method r0 = r3.f2450c
            if (r0 == 0) goto L2b
            java.lang.Object[] r0 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            java.lang.Object r1 = r3.b()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            java.lang.reflect.Method r0 = r3.f2450c     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            java.lang.Object[] r1 = r3.f2455h     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            r0.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.reflect.InvocationTargetException -> L22
            return
        L20:
            r4 = move-exception
            goto L24
        L22:
            r4 = move-exception
            goto L28
        L24:
            r4.toString()
            goto L2b
        L28:
            r4.toString()
        L2b:
            return
    }

    public final void a(java.lang.Object r3, com.acse.ottn.b2 r4) {
            r2 = this;
            com.acse.ottn.k3 r0 = r2.f2449b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.a(r3)
            r4.a(r0)
        Lb:
            java.lang.reflect.Method r0 = r2.f2451d     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            if (r0 != 0) goto L1b
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r2.a(r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            goto L1b
        L17:
            r3 = move-exception
            goto L26
        L19:
            r3 = move-exception
            goto L2a
        L1b:
            java.lang.reflect.Method r0 = r2.f2451d     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r4.a(r3)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return
        L26:
            r3.toString()
            goto L2d
        L2a:
            r3.toString()
        L2d:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(float... r2) {
            r1 = this;
            java.lang.Class r0 = java.lang.Float.TYPE
            r1.f2452e = r0
            com.acse.ottn.c2 r2 = com.acse.ottn.c2.a(r2)
            r1.f2453f = r2
            return
    }

    public void a(int... r2) {
            r1 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1.f2452e = r0
            com.acse.ottn.c2 r2 = com.acse.ottn.c2.a(r2)
            r1.f2453f = r2
            return
    }

    public void a(com.acse.ottn.b2... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 2
            int r1 = java.lang.Math.max(r0, r1)
            com.acse.ottn.b2[] r1 = new com.acse.ottn.b2[r1]
            r2 = 0
            r3 = r5[r2]
            java.lang.Class r3 = r3.d()
            r4.f2452e = r3
        L11:
            if (r2 >= r0) goto L1a
            r3 = r5[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L1a:
            com.acse.ottn.c2 r5 = new com.acse.ottn.c2
            r5.<init>(r1)
            r4.f2453f = r5
            return
    }

    public void a(java.lang.Object... r2) {
            r1 = this;
            r0 = 0
            r0 = r2[r0]
            java.lang.Class r0 = r0.getClass()
            r1.f2452e = r0
            com.acse.ottn.c2 r2 = com.acse.ottn.c2.a(r2)
            r1.f2453f = r2
            return
    }

    public java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.f2457j
            return r0
    }

    public void b(java.lang.Class r4) {
            r3 = this;
            java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> r0 = com.acse.ottn.l3.p
            java.lang.Class r1 = r3.f2452e
            java.lang.String r2 = "set"
            java.lang.reflect.Method r4 = r3.a(r4, r0, r2, r1)
            r3.f2450c = r4
            return
    }

    public void b(java.lang.Object r3) {
            r2 = this;
            com.acse.ottn.c2 r0 = r2.f2453f
            java.util.ArrayList<com.acse.ottn.b2> r0 = r0.f2208e
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2 r0 = (com.acse.ottn.b2) r0
            r2.a(r3, r0)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void c(java.lang.Object r6) {
            r5 = this;
            com.acse.ottn.k3 r0 = r5.f2449b
            r1 = 0
            if (r0 == 0) goto L36
            r0.a(r6)     // Catch: java.lang.ClassCastException -> L2c
            com.acse.ottn.c2 r0 = r5.f2453f     // Catch: java.lang.ClassCastException -> L2c
            java.util.ArrayList<com.acse.ottn.b2> r0 = r0.f2208e     // Catch: java.lang.ClassCastException -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.ClassCastException -> L2c
        L10:
            boolean r2 = r0.hasNext()     // Catch: java.lang.ClassCastException -> L2c
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()     // Catch: java.lang.ClassCastException -> L2c
            com.acse.ottn.b2 r2 = (com.acse.ottn.b2) r2     // Catch: java.lang.ClassCastException -> L2c
            boolean r3 = r2.f()     // Catch: java.lang.ClassCastException -> L2c
            if (r3 != 0) goto L10
            com.acse.ottn.k3 r3 = r5.f2449b     // Catch: java.lang.ClassCastException -> L2c
            java.lang.Object r3 = r3.a(r6)     // Catch: java.lang.ClassCastException -> L2c
            r2.a(r3)     // Catch: java.lang.ClassCastException -> L2c
            goto L10
        L2c:
            com.acse.ottn.k3 r0 = r5.f2449b
            r0.a()
            java.util.Objects.toString(r6)
            r5.f2449b = r1
        L36:
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Method r2 = r5.f2450c
            if (r2 != 0) goto L41
            r5.b(r0)
        L41:
            com.acse.ottn.c2 r2 = r5.f2453f
            java.util.ArrayList<com.acse.ottn.b2> r2 = r2.f2208e
            java.util.Iterator r2 = r2.iterator()
        L49:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r2.next()
            com.acse.ottn.b2 r3 = (com.acse.ottn.b2) r3
            boolean r4 = r3.f()
            if (r4 != 0) goto L49
            java.lang.reflect.Method r4 = r5.f2451d
            if (r4 != 0) goto L62
            r5.a(r0)
        L62:
            java.lang.reflect.Method r4 = r5.f2451d     // Catch: java.lang.IllegalAccessException -> L6c java.lang.reflect.InvocationTargetException -> L6e
            java.lang.Object r4 = r4.invoke(r6, r1)     // Catch: java.lang.IllegalAccessException -> L6c java.lang.reflect.InvocationTargetException -> L6e
            r3.a(r4)     // Catch: java.lang.IllegalAccessException -> L6c java.lang.reflect.InvocationTargetException -> L6e
            goto L49
        L6c:
            r3 = move-exception
            goto L70
        L6e:
            r3 = move-exception
            goto L74
        L70:
            r3.toString()
            goto L49
        L74:
            r3.toString()
            goto L49
        L78:
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.l3 r0 = r1.a()
            return r0
    }

    public void d() {
            r2 = this;
            com.acse.ottn.q4 r0 = r2.f2456i
            if (r0 != 0) goto L17
            java.lang.Class r0 = r2.f2452e
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto Ld
            com.acse.ottn.q4 r0 = com.acse.ottn.l3.f2448k
            goto L15
        Ld:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L14
            com.acse.ottn.q4 r0 = com.acse.ottn.l3.l
            goto L15
        L14:
            r0 = 0
        L15:
            r2.f2456i = r0
        L17:
            com.acse.ottn.q4 r0 = r2.f2456i
            if (r0 == 0) goto L20
            com.acse.ottn.c2 r1 = r2.f2453f
            r1.a(r0)
        L20:
            return
    }

    public void d(java.lang.Object r3) {
            r2 = this;
            com.acse.ottn.c2 r0 = r2.f2453f
            java.util.ArrayList<com.acse.ottn.b2> r0 = r0.f2208e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2 r0 = (com.acse.ottn.b2) r0
            r2.a(r3, r0)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.acse.ottn.c2 r1 = r2.f2453f
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
