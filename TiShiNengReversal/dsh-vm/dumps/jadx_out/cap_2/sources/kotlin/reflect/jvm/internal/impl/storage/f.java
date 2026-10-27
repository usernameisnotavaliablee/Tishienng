package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f implements kotlin.reflect.jvm.internal.impl.storage.n {
    private static final java.lang.String d = null;
    public static final kotlin.reflect.jvm.internal.impl.storage.n e = null;
    static final /* synthetic */ boolean f = false;
    protected final kotlin.reflect.jvm.internal.impl.storage.k a;
    private final kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f b;
    private final java.lang.String c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends kotlin.reflect.jvm.internal.impl.storage.f {
        a(java.lang.String r2, kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f r3, kotlin.reflect.jvm.internal.impl.storage.k r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        private static /* synthetic */ void j(int r7) {
                r0 = 1
                if (r7 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                r2 = 2
                if (r7 == r0) goto Ld
                r3 = 3
                goto Le
            Ld:
                r3 = 2
            Le:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1"
                r5 = 0
                if (r7 == r0) goto L1a
                java.lang.String r6 = "source"
                r3[r5] = r6
                goto L1c
            L1a:
                r3[r5] = r4
            L1c:
                java.lang.String r5 = "recursionDetectedDefault"
                if (r7 == r0) goto L23
                r3[r0] = r4
                goto L25
            L23:
                r3[r0] = r5
            L25:
                if (r7 == r0) goto L29
                r3[r2] = r5
            L29:
                java.lang.String r1 = java.lang.String.format(r1, r3)
                if (r7 == r0) goto L35
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r1)
                goto L3a
            L35:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r1)
            L3a:
                throw r7
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f
        @org.jetbrains.annotations.NotNull
        protected <K, V> kotlin.reflect.jvm.internal.impl.storage.f.o<V> p(@org.jetbrains.annotations.NotNull java.lang.String r1, K r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                j(r1)
            L6:
                kotlin.reflect.jvm.internal.impl.storage.f$o r1 = kotlin.reflect.jvm.internal.impl.storage.f.o.a()
                if (r1 != 0) goto L10
                r2 = 1
                j(r2)
            L10:
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b<T> extends kotlin.reflect.jvm.internal.impl.storage.f.j<T> {
        final /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f f;

        b(kotlin.reflect.jvm.internal.impl.storage.f r1, kotlin.reflect.jvm.internal.impl.storage.f r2, kotlin.jvm.functions.Function0 r3, java.lang.Object r4) {
                r0 = this;
                r0.f = r1
                r0.e = r4
                r0.<init>(r2, r3)
                return
        }

        private static /* synthetic */ void a(int r2) {
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "recursionDetected"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "@NotNull method %s.%s must not return null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r2)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.storage.f.o<T> c(boolean r2) {
                r1 = this;
                java.lang.Object r2 = r1.e
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = kotlin.reflect.jvm.internal.impl.storage.f.o.d(r2)
                if (r2 != 0) goto Lc
                r0 = 0
                a(r0)
            Lc:
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c<T> extends kotlin.reflect.jvm.internal.impl.storage.f.k<T> {
        final /* synthetic */ kotlin.jvm.functions.Function1 f;
        final /* synthetic */ kotlin.jvm.functions.Function1 g;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f h;

        c(kotlin.reflect.jvm.internal.impl.storage.f r1, kotlin.reflect.jvm.internal.impl.storage.f r2, kotlin.jvm.functions.Function0 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5) {
                r0 = this;
                r0.h = r1
                r0.f = r4
                r0.g = r5
                r0.<init>(r2, r3)
                return
        }

        private static /* synthetic */ void a(int r6) {
                r0 = 2
                if (r6 == r0) goto L6
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
                goto L8
            L6:
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L8:
                if (r6 == r0) goto Lc
                r2 = 2
                goto Ld
            Lc:
                r2 = 3
            Ld:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5"
                r4 = 0
                if (r6 == r0) goto L17
                r2[r4] = r3
                goto L1b
            L17:
                java.lang.String r5 = "value"
                r2[r4] = r5
            L1b:
                r4 = 1
                if (r6 == r0) goto L23
                java.lang.String r3 = "recursionDetected"
                r2[r4] = r3
                goto L25
            L23:
                r2[r4] = r3
            L25:
                if (r6 == r0) goto L28
                goto L2c
            L28:
                java.lang.String r3 = "doPostCompute"
                r2[r0] = r3
            L2c:
                java.lang.String r1 = java.lang.String.format(r1, r2)
                if (r6 == r0) goto L38
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r6.<init>(r1)
                goto L3d
            L38:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r1)
            L3d:
                throw r6
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.storage.f.o<T> c(boolean r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.f
                if (r0 != 0) goto Lf
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = super.c(r2)
                if (r2 != 0) goto Le
                r0 = 0
                a(r0)
            Le:
                return r2
            Lf:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.Object r2 = r0.invoke(r2)
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = kotlin.reflect.jvm.internal.impl.storage.f.o.d(r2)
                if (r2 != 0) goto L21
                r0 = 1
                a(r0)
            L21:
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i
        protected void d(@org.jetbrains.annotations.NotNull T r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 2
                a(r0)
            L6:
                kotlin.jvm.functions.Function1 r0 = r1.g
                r0.invoke(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d<K, V> extends kotlin.reflect.jvm.internal.impl.storage.f.e<K, V> implements kotlin.reflect.jvm.internal.impl.storage.a<K, V> {
        static final /* synthetic */ boolean d = false;

        static {
                return
        }

        private d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.f.g<K, V>, java.lang.Object> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                b(r0)
            Lc:
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        /* synthetic */ d(kotlin.reflect.jvm.internal.impl.storage.f r1, java.util.concurrent.ConcurrentMap r2, kotlin.reflect.jvm.internal.impl.storage.f.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ void b(int r8) {
                r0 = 3
                if (r8 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                r2 = 2
                if (r8 == r0) goto Ld
                r3 = 3
                goto Le
            Ld:
                r3 = 2
            Le:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction"
                r5 = 1
                r6 = 0
                if (r8 == r5) goto L27
                if (r8 == r2) goto L22
                if (r8 == r0) goto L1f
                java.lang.String r7 = "storageManager"
                r3[r6] = r7
                goto L2b
            L1f:
                r3[r6] = r4
                goto L2b
            L22:
                java.lang.String r7 = "computation"
                r3[r6] = r7
                goto L2b
            L27:
                java.lang.String r7 = "map"
                r3[r6] = r7
            L2b:
                java.lang.String r6 = "computeIfAbsent"
                if (r8 == r0) goto L32
                r3[r5] = r4
                goto L34
            L32:
                r3[r5] = r6
            L34:
                if (r8 == r2) goto L3d
                if (r8 == r0) goto L3f
                java.lang.String r4 = "<init>"
                r3[r2] = r4
                goto L3f
            L3d:
                r3[r2] = r6
            L3f:
                java.lang.String r1 = java.lang.String.format(r1, r3)
                if (r8 == r0) goto L4b
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r1)
                goto L50
            L4b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r8.<init>(r1)
            L50:
                throw r8
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.e, kotlin.reflect.jvm.internal.impl.storage.a
        @org.jetbrains.annotations.NotNull
        public V a(K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends V> r3) {
                r1 = this;
                if (r3 != 0) goto L6
                r0 = 2
                b(r0)
            L6:
                java.lang.Object r2 = super.a(r2, r3)
                if (r2 != 0) goto L10
                r3 = 3
                b(r3)
            L10:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e<K, V> extends kotlin.reflect.jvm.internal.impl.storage.f.l<kotlin.reflect.jvm.internal.impl.storage.f.g<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.b<K, V> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.storage.f.g<K, V>, V> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public V a(kotlin.reflect.jvm.internal.impl.storage.f.g<K, V> r1) {
                    r0 = this;
                    kotlin.jvm.functions.Function0 r1 = kotlin.reflect.jvm.internal.impl.storage.f.g.a(r1)
                    java.lang.Object r1 = r1.invoke()
                    return r1
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    r0 = this;
                    kotlin.reflect.jvm.internal.impl.storage.f$g r1 = (kotlin.reflect.jvm.internal.impl.storage.f.g) r1
                    java.lang.Object r1 = r0.a(r1)
                    return r1
            }
        }

        private e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.f.g<K, V>, java.lang.Object> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                b(r0)
            Lc:
                kotlin.reflect.jvm.internal.impl.storage.f$e$a r0 = new kotlin.reflect.jvm.internal.impl.storage.f$e$a
                r0.<init>()
                r1.<init>(r2, r3, r0)
                return
        }

        /* synthetic */ e(kotlin.reflect.jvm.internal.impl.storage.f r1, java.util.concurrent.ConcurrentMap r2, kotlin.reflect.jvm.internal.impl.storage.f.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ void b(int r5) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 2
                r3 = 1
                if (r5 == r3) goto L14
                if (r5 == r2) goto Lf
                java.lang.String r4 = "storageManager"
                r0[r1] = r4
                goto L18
            Lf:
                java.lang.String r4 = "computation"
                r0[r1] = r4
                goto L18
            L14:
                java.lang.String r4 = "map"
                r0[r1] = r4
            L18:
                java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction"
                r0[r3] = r1
                if (r5 == r2) goto L23
                java.lang.String r5 = "<init>"
                r0[r2] = r5
                goto L27
            L23:
                java.lang.String r5 = "computeIfAbsent"
                r0[r2] = r5
            L27:
                java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r5, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r5)
                throw r0
        }

        @org.jetbrains.annotations.Nullable
        public V a(K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends V> r3) {
                r1 = this;
                if (r3 != 0) goto L6
                r0 = 2
                b(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.storage.f$g r0 = new kotlin.reflect.jvm.internal.impl.storage.f$g
                r0.<init>(r2, r3)
                java.lang.Object r2 = r1.invoke(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f, reason: collision with other inner class name */
    public interface InterfaceC0071f {
        public static final kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f a = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f$a */
        static class a implements kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void a(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "throwable"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "handleException"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f
            @org.jetbrains.annotations.NotNull
            public java.lang.RuntimeException handleException(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    a(r0)
                L6:
                    java.lang.RuntimeException r2 = kotlin.reflect.jvm.internal.impl.utils.c.b(r2)
                    throw r2
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.storage.f$f$a r0 = new kotlin.reflect.jvm.internal.impl.storage.f$f$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f.a = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        java.lang.RuntimeException handleException(@org.jetbrains.annotations.NotNull java.lang.Throwable r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class g<K, V> {
        private final K a;
        private final kotlin.jvm.functions.Function0<? extends V> b;

        public g(K r1, kotlin.jvm.functions.Function0<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        static /* synthetic */ kotlin.jvm.functions.Function0 a(kotlin.reflect.jvm.internal.impl.storage.f.g r0) {
                kotlin.jvm.functions.Function0<? extends V> r0 = r0.b
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L20
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L20
            L12:
                kotlin.reflect.jvm.internal.impl.storage.f$g r5 = (kotlin.reflect.jvm.internal.impl.storage.f.g) r5
                K r2 = r4.a
                K r5 = r5.a
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L1f
                return r1
            L1f:
                return r0
            L20:
                return r1
        }

        public int hashCode() {
                r1 = this;
                K r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class h<T> implements kotlin.reflect.jvm.internal.impl.storage.j<T> {
        private final kotlin.reflect.jvm.internal.impl.storage.f a;
        private final kotlin.jvm.functions.Function0<? extends T> b;

        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object c;

        public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.storage.f$n r0 = kotlin.reflect.jvm.internal.impl.storage.f.n.a
                r1.c = r0
                r1.a = r2
                r1.b = r3
                return
        }

        private static /* synthetic */ void a(int r8) {
                r0 = 3
                r1 = 2
                if (r8 == r1) goto L9
                if (r8 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                if (r8 == r1) goto L11
                if (r8 == r0) goto L11
                r3 = 3
                goto L12
            L11:
                r3 = 2
            L12:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue"
                r5 = 0
                r6 = 1
                if (r8 == r6) goto L26
                if (r8 == r1) goto L23
                if (r8 == r0) goto L23
                java.lang.String r7 = "storageManager"
                r3[r5] = r7
                goto L2a
            L23:
                r3[r5] = r4
                goto L2a
            L26:
                java.lang.String r7 = "computable"
                r3[r5] = r7
            L2a:
                if (r8 == r1) goto L36
                if (r8 == r0) goto L31
                r3[r6] = r4
                goto L3a
            L31:
                java.lang.String r4 = "renderDebugInformation"
                r3[r6] = r4
                goto L3a
            L36:
                java.lang.String r4 = "recursionDetected"
                r3[r6] = r4
            L3a:
                if (r8 == r1) goto L42
                if (r8 == r0) goto L42
                java.lang.String r4 = "<init>"
                r3[r1] = r4
            L42:
                java.lang.String r2 = java.lang.String.format(r2, r3)
                if (r8 == r1) goto L50
                if (r8 == r0) goto L50
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r2)
                goto L55
            L50:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r8.<init>(r2)
            L55:
                throw r8
        }

        protected void b(T r1) {
                r0 = this;
                return
        }

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.storage.f.o<T> c(boolean r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.storage.f r3 = r2.a
                java.lang.String r0 = "in a lazy value"
                r1 = 0
                kotlin.reflect.jvm.internal.impl.storage.f$o r3 = r3.p(r0, r1)
                if (r3 != 0) goto Lf
                r0 = 2
                a(r0)
            Lf:
                return r3
        }

        public boolean e() {
                r2 = this;
                java.lang.Object r0 = r2.c
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.a
                if (r0 == r1) goto Le
                java.lang.Object r0 = r2.c
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.b
                if (r0 == r1) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
                r4 = this;
                java.lang.Object r0 = r4.c
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)
                return r0
            Lb:
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r4.a
                kotlin.reflect.jvm.internal.impl.storage.k r0 = r0.a
                r0.lock()
                java.lang.Object r0 = r4.c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r4.a
                kotlin.reflect.jvm.internal.impl.storage.k r1 = r1.a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.b     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.c     // Catch: java.lang.Throwable -> L24
                r4.c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.c     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.f$o r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.c = r1     // Catch: java.lang.Throwable -> L24
                kotlin.jvm.functions.Function0<? extends T> r0 = r4.b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = kotlin.reflect.jvm.internal.impl.utils.c.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.c     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.b     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r4.a     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.f$f r1 = kotlin.reflect.jvm.internal.impl.storage.f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.handleException(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.a     // Catch: java.lang.Throwable -> L24
                r4.c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r4.a
                kotlin.reflect.jvm.internal.impl.storage.k r1 = r1.a
                r1.unlock()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class i<T> extends kotlin.reflect.jvm.internal.impl.storage.f.h<T> {

        @org.jetbrains.annotations.Nullable
        private volatile kotlin.reflect.jvm.internal.impl.storage.l<T> d;

        public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                r1.<init>(r2, r3)
                r2 = 0
                r1.d = r2
                return
        }

        private static /* synthetic */ void a(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "storageManager"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "computable"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "<init>"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        protected final void b(T r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.storage.l r0 = new kotlin.reflect.jvm.internal.impl.storage.l
                r0.<init>(r2)
                r1.d = r0
                r0 = 0
                r1.d(r2)     // Catch: java.lang.Throwable -> Le
                r1.d = r0
                return
            Le:
                r2 = move-exception
                r1.d = r0
                throw r2
        }

        protected abstract void d(T r1);

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, kotlin.jvm.functions.Function0
        public T invoke() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.storage.l<T> r0 = r2.d
                if (r0 == 0) goto Lf
                boolean r1 = r0.b()
                if (r1 == 0) goto Lf
                java.lang.Object r0 = r0.a()
                return r0
            Lf:
                java.lang.Object r0 = super.invoke()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class j<T> extends kotlin.reflect.jvm.internal.impl.storage.f.h<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {
        static final /* synthetic */ boolean d = false;

        static {
                return
        }

        public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                r1.<init>(r2, r3)
                return
        }

        private static /* synthetic */ void a(int r7) {
                r0 = 2
                if (r7 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                if (r7 == r0) goto Lc
                r2 = 3
                goto Ld
            Lc:
                r2 = 2
            Ld:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue"
                r4 = 0
                r5 = 1
                if (r7 == r5) goto L1f
                if (r7 == r0) goto L1c
                java.lang.String r6 = "storageManager"
                r2[r4] = r6
                goto L23
            L1c:
                r2[r4] = r3
                goto L23
            L1f:
                java.lang.String r6 = "computable"
                r2[r4] = r6
            L23:
                if (r7 == r0) goto L28
                r2[r5] = r3
                goto L2c
            L28:
                java.lang.String r3 = "invoke"
                r2[r5] = r3
            L2c:
                if (r7 == r0) goto L32
                java.lang.String r3 = "<init>"
                r2[r0] = r3
            L32:
                java.lang.String r1 = java.lang.String.format(r1, r2)
                if (r7 == r0) goto L3e
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r1)
                goto L43
            L3e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r1)
            L43:
                throw r7
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, kotlin.jvm.functions.Function0
        @org.jetbrains.annotations.NotNull
        public T invoke() {
                r2 = this;
                java.lang.Object r0 = super.invoke()
                if (r0 != 0) goto La
                r1 = 2
                a(r1)
            La:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class k<T> extends kotlin.reflect.jvm.internal.impl.storage.f.i<T> implements kotlin.reflect.jvm.internal.impl.storage.i<T> {
        static final /* synthetic */ boolean e = false;

        static {
                return
        }

        public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                r1.<init>(r2, r3)
                return
        }

        private static /* synthetic */ void a(int r7) {
                r0 = 2
                if (r7 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                if (r7 == r0) goto Lc
                r2 = 3
                goto Ld
            Lc:
                r2 = 2
            Ld:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute"
                r4 = 0
                r5 = 1
                if (r7 == r5) goto L1f
                if (r7 == r0) goto L1c
                java.lang.String r6 = "storageManager"
                r2[r4] = r6
                goto L23
            L1c:
                r2[r4] = r3
                goto L23
            L1f:
                java.lang.String r6 = "computable"
                r2[r4] = r6
            L23:
                if (r7 == r0) goto L28
                r2[r5] = r3
                goto L2c
            L28:
                java.lang.String r3 = "invoke"
                r2[r5] = r3
            L2c:
                if (r7 == r0) goto L32
                java.lang.String r3 = "<init>"
                r2[r0] = r3
            L32:
                java.lang.String r1 = java.lang.String.format(r1, r2)
                if (r7 == r0) goto L3e
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r1)
                goto L43
            L3e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r1)
            L43:
                throw r7
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.i, kotlin.reflect.jvm.internal.impl.storage.f.h, kotlin.jvm.functions.Function0
        @org.jetbrains.annotations.NotNull
        public T invoke() {
                r2 = this;
                java.lang.Object r0 = super.invoke()
                if (r0 != 0) goto La
                r1 = 2
                a(r1)
            La:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.h<K, V> {
        private final kotlin.reflect.jvm.internal.impl.storage.f a;
        private final java.util.concurrent.ConcurrentMap<K, java.lang.Object> b;
        private final kotlin.jvm.functions.Function1<? super K, ? extends V> c;

        public l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                b(r0)
            Lc:
                if (r4 != 0) goto L12
                r0 = 2
                b(r0)
            L12:
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        private static /* synthetic */ void b(int r9) {
                r0 = 4
                r1 = 3
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 2
                if (r9 == r1) goto L12
                if (r9 == r0) goto L12
                r4 = 3
                goto L13
            L12:
                r4 = 2
            L13:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction"
                r6 = 0
                r7 = 1
                if (r9 == r7) goto L2e
                if (r9 == r3) goto L29
                if (r9 == r1) goto L26
                if (r9 == r0) goto L26
                java.lang.String r8 = "storageManager"
                r4[r6] = r8
                goto L32
            L26:
                r4[r6] = r5
                goto L32
            L29:
                java.lang.String r8 = "compute"
                r4[r6] = r8
                goto L32
            L2e:
                java.lang.String r8 = "map"
                r4[r6] = r8
            L32:
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L39
                r4[r7] = r5
                goto L42
            L39:
                java.lang.String r5 = "raceCondition"
                r4[r7] = r5
                goto L42
            L3e:
                java.lang.String r5 = "recursionDetected"
                r4[r7] = r5
            L42:
                if (r9 == r1) goto L4a
                if (r9 == r0) goto L4a
                java.lang.String r5 = "<init>"
                r4[r3] = r5
            L4a:
                java.lang.String r2 = java.lang.String.format(r2, r4)
                if (r9 == r1) goto L58
                if (r9 == r0) goto L58
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L5d
            L58:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L5d:
                throw r9
        }

        private java.lang.AssertionError d(K r4, java.lang.Object r5) {
                r3 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistent key detected. "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.b
                r1.append(r2)
                java.lang.String r2 = " is expected, was: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = ", most probably race condition detected on input "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = " under "
                r1.append(r4)
                kotlin.reflect.jvm.internal.impl.storage.f r4 = r3.a
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                java.lang.Throwable r4 = kotlin.reflect.jvm.internal.impl.storage.f.l(r0)
                java.lang.AssertionError r4 = (java.lang.AssertionError) r4
                return r4
        }

        @org.jetbrains.annotations.NotNull
        private java.lang.AssertionError f(K r4, java.lang.Object r5) {
                r3 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Race condition detected on input "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ". Old value is "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = " under "
                r1.append(r4)
                kotlin.reflect.jvm.internal.impl.storage.f r4 = r3.a
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                java.lang.Throwable r4 = kotlin.reflect.jvm.internal.impl.storage.f.l(r0)
                java.lang.AssertionError r4 = (java.lang.AssertionError) r4
                if (r4 != 0) goto L34
                r5 = 4
                b(r5)
            L34:
                return r4
        }

        private java.lang.AssertionError i(K r4, java.lang.Throwable r5) {
                r3 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to remove "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " under "
                r1.append(r4)
                kotlin.reflect.jvm.internal.impl.storage.f r4 = r3.a
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4, r5)
                java.lang.Throwable r4 = kotlin.reflect.jvm.internal.impl.storage.f.l(r0)
                java.lang.AssertionError r4 = (java.lang.AssertionError) r4
                return r4
        }

        protected kotlin.reflect.jvm.internal.impl.storage.f c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r1.a
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.h
        public boolean g(K r2) {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r1.b
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto Le
                kotlin.reflect.jvm.internal.impl.storage.f$n r0 = kotlin.reflect.jvm.internal.impl.storage.f.n.b
                if (r2 == r0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.storage.f.o<V> h(K r2, boolean r3) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.storage.f r3 = r1.a
                java.lang.String r0 = ""
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = r3.p(r0, r2)
                if (r2 != 0) goto Le
                r3 = 3
                b(r3)
            Le:
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.Nullable
        public V invoke(K r6) {
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.b
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.b
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)
                return r6
            L11:
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r5.a
                kotlin.reflect.jvm.internal.impl.storage.k r0 = r0.a
                r0.lock()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = kotlin.reflect.jvm.internal.impl.storage.f.n.b     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.f$n r0 = kotlin.reflect.jvm.internal.impl.storage.f.n.c     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = r5.h(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
            L33:
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r5.a
                kotlin.reflect.jvm.internal.impl.storage.k r0 = r0.a
                r0.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Ld3
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.c     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                kotlin.reflect.jvm.internal.impl.storage.f$o r2 = r5.h(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.b     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                kotlin.jvm.functions.Function1<? super K, ? extends V> r2 = r5.c     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.b     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                kotlin.reflect.jvm.internal.impl.storage.f r6 = r5.a
                kotlin.reflect.jvm.internal.impl.storage.k r6 = r6.a
                r6.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.f(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.c.a(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L9d
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.b     // Catch: java.lang.Throwable -> L97
                java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L97
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.b     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L94
                java.lang.AssertionError r6 = r5.d(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L94:
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            L97:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.i(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9d:
                if (r1 == r0) goto Lbd
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.f$n r2 = kotlin.reflect.jvm.internal.impl.storage.f.n.b     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto Lb2
                java.lang.AssertionError r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb2:
                kotlin.reflect.jvm.internal.impl.storage.f r6 = r5.a     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.f$f r6 = kotlin.reflect.jvm.internal.impl.storage.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.handleException(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lbd:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.b     // Catch: java.lang.Throwable -> Lcd
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lcd
                kotlin.reflect.jvm.internal.impl.storage.f r6 = r5.a     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.f$f r6 = kotlin.reflect.jvm.internal.impl.storage.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.handleException(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lcd:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.i(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Ld3:
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r5.a
                kotlin.reflect.jvm.internal.impl.storage.k r0 = r0.a
                r0.unlock()
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class m<K, V> extends kotlin.reflect.jvm.internal.impl.storage.f.l<K, V> implements kotlin.reflect.jvm.internal.impl.storage.g<K, V> {
        static final /* synthetic */ boolean d = false;

        static {
                return
        }

        public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                b(r0)
            Lc:
                if (r4 != 0) goto L12
                r0 = 2
                b(r0)
            L12:
                r1.<init>(r2, r3, r4)
                return
        }

        private static /* synthetic */ void b(int r8) {
                r0 = 3
                if (r8 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                r2 = 2
                if (r8 == r0) goto Ld
                r3 = 3
                goto Le
            Ld:
                r3 = 2
            Le:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull"
                r5 = 1
                r6 = 0
                if (r8 == r5) goto L27
                if (r8 == r2) goto L22
                if (r8 == r0) goto L1f
                java.lang.String r7 = "storageManager"
                r3[r6] = r7
                goto L2b
            L1f:
                r3[r6] = r4
                goto L2b
            L22:
                java.lang.String r7 = "compute"
                r3[r6] = r7
                goto L2b
            L27:
                java.lang.String r7 = "map"
                r3[r6] = r7
            L2b:
                if (r8 == r0) goto L30
                r3[r5] = r4
                goto L34
            L30:
                java.lang.String r4 = "invoke"
                r3[r5] = r4
            L34:
                if (r8 == r0) goto L3a
                java.lang.String r4 = "<init>"
                r3[r2] = r4
            L3a:
                java.lang.String r1 = java.lang.String.format(r1, r3)
                if (r8 == r0) goto L46
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r1)
                goto L4b
            L46:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r8.<init>(r1)
            L4b:
                throw r8
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.l, kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.NotNull
        public V invoke(K r2) {
                r1 = this;
                java.lang.Object r2 = super.invoke(r2)
                if (r2 != 0) goto La
                r0 = 3
                b(r0)
            La:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum n extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.storage.f.n> {
        public static final kotlin.reflect.jvm.internal.impl.storage.f.n a = null;
        public static final kotlin.reflect.jvm.internal.impl.storage.f.n b = null;
        public static final kotlin.reflect.jvm.internal.impl.storage.f.n c = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f.n[] d = null;

        static {
                kotlin.reflect.jvm.internal.impl.storage.f$n r0 = new kotlin.reflect.jvm.internal.impl.storage.f$n
                java.lang.String r1 = "NOT_COMPUTED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.storage.f.n.a = r0
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = new kotlin.reflect.jvm.internal.impl.storage.f$n
                java.lang.String r3 = "COMPUTING"
                r4 = 1
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.storage.f.n.b = r1
                kotlin.reflect.jvm.internal.impl.storage.f$n r3 = new kotlin.reflect.jvm.internal.impl.storage.f$n
                java.lang.String r5 = "RECURSION_WAS_DETECTED"
                r6 = 2
                r3.<init>(r5, r6)
                kotlin.reflect.jvm.internal.impl.storage.f.n.c = r3
                r5 = 3
                kotlin.reflect.jvm.internal.impl.storage.f$n[] r5 = new kotlin.reflect.jvm.internal.impl.storage.f.n[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                kotlin.reflect.jvm.internal.impl.storage.f.n.d = r5
                return
        }

        n(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.storage.f.n valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.storage.f$n> r0 = kotlin.reflect.jvm.internal.impl.storage.f.n.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.storage.f$n r1 = (kotlin.reflect.jvm.internal.impl.storage.f.n) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.storage.f.n[] values() {
                kotlin.reflect.jvm.internal.impl.storage.f$n[] r0 = kotlin.reflect.jvm.internal.impl.storage.f.n.d
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.storage.f$n[] r0 = (kotlin.reflect.jvm.internal.impl.storage.f.n[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class o<T> {
        static final /* synthetic */ boolean c = false;
        private final T a;
        private final boolean b;

        static {
                return
        }

        private o(T r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public static <T> kotlin.reflect.jvm.internal.impl.storage.f.o<T> a() {
                kotlin.reflect.jvm.internal.impl.storage.f$o r0 = new kotlin.reflect.jvm.internal.impl.storage.f$o
                r1 = 0
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static <T> kotlin.reflect.jvm.internal.impl.storage.f.o<T> d(T r2) {
                kotlin.reflect.jvm.internal.impl.storage.f$o r0 = new kotlin.reflect.jvm.internal.impl.storage.f$o
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public T b() {
                r1 = this;
                T r0 = r1.a
                return r0
        }

        public boolean c() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                boolean r0 = r1.c()
                if (r0 == 0) goto L9
                java.lang.String r0 = "FALL_THROUGH"
                return r0
            L9:
                T r0 = r1.a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                return r0
        }
    }

    static {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.storage.f> r0 = kotlin.reflect.jvm.internal.impl.storage.f.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = "."
            java.lang.String r2 = ""
            java.lang.String r0 = kotlin.text.u.U5(r0, r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.f.d = r0
            kotlin.reflect.jvm.internal.impl.storage.f$a r0 = new kotlin.reflect.jvm.internal.impl.storage.f$a
            kotlin.reflect.jvm.internal.impl.storage.f$f r1 = kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f.a
            kotlin.reflect.jvm.internal.impl.storage.e r2 = kotlin.reflect.jvm.internal.impl.storage.e.b
            java.lang.String r3 = "NO_LOCKS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.f.e = r0
            return
    }

    public f(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public f(java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Runnable r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.n1> r5) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.f$f r0 = kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f.a
            kotlin.reflect.jvm.internal.impl.storage.k$a r1 = kotlin.reflect.jvm.internal.impl.storage.k.a
            kotlin.reflect.jvm.internal.impl.storage.d r4 = r1.a(r4, r5)
            r2.<init>(r3, r0, r4)
            return
    }

    private f(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.k r4) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 4
            j(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 5
            j(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 6
            j(r0)
        L12:
            r1.<init>()
            r1.a = r4
            r1.b = r3
            r1.c = r2
            return
    }

    /* synthetic */ f(java.lang.String r1, kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f r2, kotlin.reflect.jvm.internal.impl.storage.k r3, kotlin.reflect.jvm.internal.impl.storage.f.a r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static /* synthetic */ void j(int r13) {
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L13
            if (r13 == r2) goto L13
            if (r13 == r1) goto L13
            if (r13 == r0) goto L13
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L21
            if (r13 == r2) goto L21
            if (r13 == r1) goto L21
            if (r13 == r0) goto L21
            r7 = 3
            goto L22
        L21:
            r7 = 2
        L22:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "compute"
            java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L65
            if (r13 == r5) goto L65
            r5 = 5
            if (r13 == r5) goto L65
            r5 = 6
            if (r13 == r5) goto L60
            switch(r13) {
                case 8: goto L65;
                case 9: goto L5d;
                case 10: goto L5a;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L5a;
                case 14: goto L5d;
                case 15: goto L50;
                case 16: goto L5d;
                case 17: goto L55;
                case 18: goto L50;
                case 19: goto L5d;
                case 20: goto L5a;
                case 21: goto L5d;
                case 22: goto L50;
                case 23: goto L4b;
                case 24: goto L4b;
                case 25: goto L55;
                case 26: goto L4b;
                case 27: goto L55;
                case 28: goto L4b;
                case 29: goto L46;
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4b;
                case 33: goto L46;
                case 34: goto L4b;
                case 35: goto L41;
                case 36: goto L3c;
                case 37: goto L5a;
                default: goto L37;
            }
        L37:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L69
        L3c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L69
        L41:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L69
        L46:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L69
        L4b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L69
        L50:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L69
        L55:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L69
        L5a:
            r7[r11] = r9
            goto L69
        L5d:
            r7[r11] = r8
            goto L69
        L60:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L69
        L65:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L69:
            java.lang.String r5 = "createMemoizedFunction"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "sanitizeStackTrace"
            if (r13 == r3) goto L80
            if (r13 == r2) goto L80
            if (r13 == r1) goto L7d
            if (r13 == r0) goto L7a
            r7[r10] = r9
            goto L82
        L7a:
            r7[r10] = r12
            goto L82
        L7d:
            r7[r10] = r11
            goto L82
        L80:
            r7[r10] = r5
        L82:
            switch(r13) {
                case 4: goto Lbe;
                case 5: goto Lbe;
                case 6: goto Lbe;
                case 7: goto Lb9;
                case 8: goto Lb9;
                case 9: goto Lb6;
                case 10: goto Lc2;
                case 11: goto Lb6;
                case 12: goto Lb6;
                case 13: goto Lc2;
                case 14: goto Lb6;
                case 15: goto Lb6;
                case 16: goto Lb6;
                case 17: goto Lb6;
                case 18: goto Lb6;
                case 19: goto Lb3;
                case 20: goto Lc2;
                case 21: goto Lb3;
                case 22: goto Lb3;
                case 23: goto Lae;
                case 24: goto Lae;
                case 25: goto Lae;
                case 26: goto La9;
                case 27: goto La9;
                case 28: goto La4;
                case 29: goto La4;
                case 30: goto L9f;
                case 31: goto L9a;
                case 32: goto L95;
                case 33: goto L95;
                case 34: goto L92;
                case 35: goto L8d;
                case 36: goto L8a;
                case 37: goto Lc2;
                default: goto L85;
            }
        L85:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto Lc2
        L8a:
            r7[r6] = r12
            goto Lc2
        L8d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto Lc2
        L92:
            r7[r6] = r8
            goto Lc2
        L95:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto Lc2
        L9a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto Lc2
        L9f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto Lc2
        La4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto Lc2
        La9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto Lc2
        Lae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto Lc2
        Lb3:
            r7[r6] = r11
            goto Lc2
        Lb6:
            r7[r6] = r5
            goto Lc2
        Lb9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto Lc2
        Lbe:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        Lc2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto Ld4
            if (r13 == r2) goto Ld4
            if (r13 == r1) goto Ld4
            if (r13 == r0) goto Ld4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto Ld9
        Ld4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        Ld9:
            throw r13
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f.InterfaceC0071f k(kotlin.reflect.jvm.internal.impl.storage.f r0) {
            kotlin.reflect.jvm.internal.impl.storage.f$f r0 = r0.b
            return r0
    }

    static /* synthetic */ java.lang.Throwable l(java.lang.Throwable r0) {
            java.lang.Throwable r0 = q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static <K> java.util.concurrent.ConcurrentMap<K, java.lang.Object> m() {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 2
            r3 = 3
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static <T extends java.lang.Throwable> T q(@org.jetbrains.annotations.NotNull T r5) {
            if (r5 != 0) goto L7
            r0 = 36
            j(r0)
        L7:
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r4 = kotlin.reflect.jvm.internal.impl.storage.f.d
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            r2 = -1
        L22:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = r0.subList(r2, r1)
            int r1 = r0.size()
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r5.setStackTrace(r0)
            return r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2, @org.jetbrains.annotations.NotNull T r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 26
            j(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 27
            j(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.storage.f$b r0 = new kotlin.reflect.jvm.internal.impl.storage.f$b
            r0.<init>(r1, r1, r2, r3)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r8, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends T> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r10) {
            r7 = this;
            if (r8 != 0) goto L7
            r0 = 28
            j(r0)
        L7:
            if (r10 != 0) goto Le
            r0 = 29
            j(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.storage.f$c r1 = new kotlin.reflect.jvm.internal.impl.storage.f$c
            r3 = r7
            r2 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 19
            j(r0)
        L7:
            java.util.concurrent.ConcurrentMap r0 = m()
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r1.o(r2, r0)
            if (r2 != 0) goto L16
            r0 = 20
            j(r0)
        L16:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> d() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.f$d r0 = new kotlin.reflect.jvm.internal.impl.storage.f$d
            java.util.concurrent.ConcurrentMap r1 = m()
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <T> kotlin.reflect.jvm.internal.impl.storage.i<T> e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 23
            j(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.storage.f$j r0 = new kotlin.reflect.jvm.internal.impl.storage.f$j
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    public <T> T f(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 34
            j(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.storage.k r0 = r1.a
            r0.lock()
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L16
            kotlin.reflect.jvm.internal.impl.storage.k r0 = r1.a
            r0.unlock()
            return r2
        L16:
            r2 = move-exception
            kotlin.reflect.jvm.internal.impl.storage.f$f r0 = r1.b     // Catch: java.lang.Throwable -> L1e
            java.lang.RuntimeException r2 = r0.handleException(r2)     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1e:
            r2 = move-exception
            kotlin.reflect.jvm.internal.impl.storage.k r0 = r1.a
            r0.unlock()
            throw r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <T> kotlin.reflect.jvm.internal.impl.storage.j<T> g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 30
            j(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.storage.f$h r0 = new kotlin.reflect.jvm.internal.impl.storage.f$h
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.b<K, V> h() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.f$e r0 = new kotlin.reflect.jvm.internal.impl.storage.f$e
            java.util.concurrent.ConcurrentMap r1 = m()
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.n
    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 9
            j(r0)
        L7:
            java.util.concurrent.ConcurrentMap r0 = m()
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r1.n(r2, r0)
            if (r2 != 0) goto L16
            r0 = 10
            j(r0)
        L16:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.g<K, V> n(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 14
            j(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 15
            j(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.storage.f$m r0 = new kotlin.reflect.jvm.internal.impl.storage.f$m
            r0.<init>(r1, r3, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.h<K, V> o(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2, @org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 21
            j(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 22
            j(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.storage.f$l r0 = new kotlin.reflect.jvm.internal.impl.storage.f$l
            r0.<init>(r1, r3, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected <K, V> kotlin.reflect.jvm.internal.impl.storage.f.o<V> p(@org.jetbrains.annotations.NotNull java.lang.String r4, K r5) {
            r3 = this;
            if (r4 != 0) goto L7
            r0 = 35
            j(r0)
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Recursion detected "
            r1.append(r2)
            r1.append(r4)
            if (r5 != 0) goto L1b
            java.lang.String r4 = ""
            goto L2c
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "on input: "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L2c:
            r1.append(r4)
            java.lang.String r4 = " under "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            java.lang.Throwable r4 = q(r0)
            java.lang.AssertionError r4 = (java.lang.AssertionError) r4
            throw r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "@"
            r0.append(r1)
            int r1 = r2.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
