package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b a = null;

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method b;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method c;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method d;

        public a(@org.jetbrains.annotations.Nullable java.lang.reflect.Method r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r3, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method a() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method b() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.d
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method c() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.c
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method d() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.a
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a a() {
            r7 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.String r3 = "isSealed"
            java.lang.reflect.Method r3 = r0.getMethod(r3, r1)     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.String r4 = "getPermittedSubclasses"
            java.lang.reflect.Method r4 = r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.String r5 = "isRecord"
            java.lang.reflect.Method r5 = r0.getMethod(r5, r1)     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.String r6 = "getRecordComponents"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r1)     // Catch: java.lang.NoSuchMethodException -> L21
            r2.<init>(r3, r4, r5, r0)     // Catch: java.lang.NoSuchMethodException -> L21
            return r2
        L21:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a
            r0.<init>(r1, r1, r1, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b
            if (r0 != 0) goto La
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b = r0
        La:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Class<?>[] c(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = r2.b()
            java.lang.reflect.Method r0 = r0.a()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object[] d(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = r2.b()
            java.lang.reflect.Method r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean e(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = r2.b()
            java.lang.reflect.Method r0 = r0.c()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean f(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a r0 = r2.b()
            java.lang.reflect.Method r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
    }
}
