package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.jvm.internal.g a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.coroutines.jvm.internal.g.a b = null;

    @org.jetbrains.annotations.Nullable
    private static kotlin.coroutines.jvm.internal.g.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method a;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method b;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method c;

        public a(@org.jetbrains.annotations.Nullable java.lang.reflect.Method r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }
    }

    static {
            kotlin.coroutines.jvm.internal.g r0 = new kotlin.coroutines.jvm.internal.g
            r0.<init>()
            kotlin.coroutines.jvm.internal.g.a = r0
            kotlin.coroutines.jvm.internal.g$a r0 = new kotlin.coroutines.jvm.internal.g$a
            r1 = 0
            r0.<init>(r1, r1, r1)
            kotlin.coroutines.jvm.internal.g.b = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.coroutines.jvm.internal.g.a a(kotlin.coroutines.jvm.internal.BaseContinuationImpl r5) {
            r4 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L39
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L39
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "java.lang.Module"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "getDescriptor"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L39
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L39
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r5 = r5.loadClass(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "name"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L39
            kotlin.coroutines.jvm.internal.g$a r2 = new kotlin.coroutines.jvm.internal.g$a     // Catch: java.lang.Exception -> L39
            r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L39
            kotlin.coroutines.jvm.internal.g.c = r2     // Catch: java.lang.Exception -> L39
            return r2
        L39:
            kotlin.coroutines.jvm.internal.g$a r5 = kotlin.coroutines.jvm.internal.g.b
            kotlin.coroutines.jvm.internal.g.c = r5
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            r3 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.coroutines.jvm.internal.g$a r0 = kotlin.coroutines.jvm.internal.g.c
            if (r0 != 0) goto Ld
            kotlin.coroutines.jvm.internal.g$a r0 = r3.a(r4)
        Ld:
            kotlin.coroutines.jvm.internal.g$a r1 = kotlin.coroutines.jvm.internal.g.b
            r2 = 0
            if (r0 != r1) goto L13
            return r2
        L13:
            java.lang.reflect.Method r1 = r0.a
            if (r1 == 0) goto L3e
            java.lang.Class r4 = r4.getClass()
            java.lang.Object r4 = r1.invoke(r4, r2)
            if (r4 != 0) goto L22
            goto L3e
        L22:
            java.lang.reflect.Method r1 = r0.b
            if (r1 == 0) goto L3e
            java.lang.Object r4 = r1.invoke(r4, r2)
            if (r4 != 0) goto L2d
            goto L3e
        L2d:
            java.lang.reflect.Method r0 = r0.c
            if (r0 == 0) goto L36
            java.lang.Object r4 = r0.invoke(r4, r2)
            goto L37
        L36:
            r4 = r2
        L37:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L3e
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L3e:
            return r2
    }
}
