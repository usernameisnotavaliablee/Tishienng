package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a a = null;

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.C0034a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    public static final class C0034a {

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method b;

        public C0034a(@org.jetbrains.annotations.Nullable java.lang.reflect.Method r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
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
                java.lang.reflect.Method r0 = r1.a
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.C0034a a(java.lang.Object r5) {
            r4 = this;
            java.lang.Class r5 = r5.getClass()
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r1 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.String r2 = "getType"
            java.lang.reflect.Method r2 = r5.getMethod(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.String r3 = "getAccessor"
            java.lang.reflect.Method r5 = r5.getMethod(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L17
            r1.<init>(r2, r5)     // Catch: java.lang.NoSuchMethodException -> L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r5 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a
            r5.<init>(r0, r0)
            return r5
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.C0034a b(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.b
            if (r0 != 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r2 = r1.a(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.b = r2
            return r2
        Lb:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Method c(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "recordComponent"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r0 = r2.b(r3)
            java.lang.reflect.Method r0 = r0.a()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.reflect.Method"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Class<?> d(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "recordComponent"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a r0 = r2.b(r3)
            java.lang.reflect.Method r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.invoke(r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
    }
}
