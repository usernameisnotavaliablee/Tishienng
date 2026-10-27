package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.full.a a = null;

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.full.a.C0024a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.full.a$a, reason: collision with other inner class name */
    public static final class C0024a {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Class<? extends java.lang.annotation.Annotation> a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method b;

        public C0024a(@org.jetbrains.annotations.Nullable java.lang.Class<? extends java.lang.annotation.Annotation> r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Class<? extends java.lang.annotation.Annotation> a() {
                r1 = this;
                java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method b() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.b
                return r0
        }
    }

    static {
            kotlin.reflect.full.a r0 = new kotlin.reflect.full.a
            r0.<init>()
            kotlin.reflect.full.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.full.a.C0024a a() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "java.lang.annotation.Repeatable"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>"
            kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L18
            kotlin.reflect.full.a$a r2 = new kotlin.reflect.full.a$a
            java.lang.String r3 = "value"
            java.lang.reflect.Method r0 = r1.getMethod(r3, r0)
            r2.<init>(r1, r0)
            return r2
        L18:
            kotlin.reflect.full.a$a r1 = new kotlin.reflect.full.a$a
            r1.<init>(r0, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Class<? extends java.lang.annotation.Annotation> b(@org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.annotation.Annotation> r4) {
            r3 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.full.a$a r0 = kotlin.reflect.full.a.b
            if (r0 != 0) goto L1d
            monitor-enter(r3)
            kotlin.reflect.full.a$a r0 = kotlin.reflect.full.a.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            kotlin.reflect.full.a r0 = kotlin.reflect.full.a.a     // Catch: java.lang.Throwable -> L17
            kotlin.reflect.full.a$a r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            kotlin.reflect.full.a.b = r0     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r4 = move-exception
            goto L1b
        L19:
            monitor-exit(r3)
            goto L1d
        L1b:
            monitor-exit(r3)
            throw r4
        L1d:
            java.lang.Class r1 = r0.a()
            r2 = 0
            if (r1 != 0) goto L25
            return r2
        L25:
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r1)
            if (r4 != 0) goto L2c
            return r2
        L2c:
            java.lang.reflect.Method r0 = r0.b()
            if (r0 != 0) goto L33
            return r2
        L33:
            java.lang.Object r4 = r0.invoke(r4, r2)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>"
            kotlin.jvm.internal.g0.n(r4, r0)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
    }
}
