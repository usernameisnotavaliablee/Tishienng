package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1#2:106\n11228#3:107\n11563#3,3:108\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n*L\n100#1:107\n100#1:108,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c a = null;

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method b;

        public a(@org.jetbrains.annotations.Nullable java.lang.reflect.Method r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2) {
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
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.a a(@org.jetbrains.annotations.NotNull java.lang.reflect.Member r5) {
            r4 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Class r5 = r5.getClass()
            r0 = 0
            java.lang.String r1 = "getParameters"
            java.lang.reflect.Method r1 = r5.getMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.ClassLoader r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.j(r5)
            java.lang.String r2 = "java.lang.reflect.Parameter"
            java.lang.Class r5 = r5.loadClass(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a
            java.lang.String r3 = "getName"
            java.lang.reflect.Method r5 = r5.getMethod(r3, r0)
            r2.<init>(r1, r5)
            return r2
        L26:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a r5 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a
            r5.<init>(r0, r0)
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> b(@org.jetbrains.annotations.NotNull java.lang.reflect.Member r8) {
            r7 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.b
            if (r0 != 0) goto L1d
            monitor-enter(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.a     // Catch: java.lang.Throwable -> L17
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a r0 = r0.a(r8)     // Catch: java.lang.Throwable -> L17
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.b = r0     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r8 = move-exception
            goto L1b
        L19:
            monitor-exit(r7)
            goto L1d
        L1b:
            monitor-exit(r7)
            throw r8
        L1d:
            java.lang.reflect.Method r1 = r0.b()
            r2 = 0
            if (r1 != 0) goto L25
            return r2
        L25:
            java.lang.reflect.Method r0 = r0.a()
            if (r0 != 0) goto L2c
            return r2
        L2c:
            java.lang.Object r8 = r1.invoke(r8, r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<*>"
            kotlin.jvm.internal.g0.n(r8, r1)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r8.length
            r1.<init>(r3)
            int r3 = r8.length
            r4 = 0
        L3f:
            if (r4 >= r3) goto L54
            r5 = r8[r4]
            java.lang.Object r5 = r0.invoke(r5, r2)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.g0.n(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            r1.add(r5)
            int r4 = r4 + 1
            goto L3f
        L54:
            return r1
    }
}
