package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaToKotlinClassMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n1#1,80:1\n75#1,3:81\n75#1,3:84\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n59#1:81,3\n65#1:84,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.d a = null;

    static {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.d
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f(kotlin.reflect.jvm.internal.impl.builtins.jvm.d r0, kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.reflect.jvm.internal.impl.builtins.j r2, java.lang.Integer r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.e(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r5) {
            r4 = this;
            java.lang.String r0 = "mutable"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r5)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.o(r1)
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.builtins.j r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r5.p(r1)
            java.lang.String r0 = "getBuiltInClassByFqName(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given class "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " is not a "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = " collection"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            r3 = this;
            java.lang.String r0 = "readOnly"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r4)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.p(r0)
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.builtins.j r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r4.p(r0)
            java.lang.String r0 = "getBuiltInClassByFqName(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Given class "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a "
            r1.append(r4)
            java.lang.String r4 = "read-only"
            r1.append(r4)
            java.lang.String r4 = " collection"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            java.lang.String r0 = "mutable"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            boolean r2 = r0.k(r2)
            return r2
    }

    public final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            java.lang.String r0 = "readOnly"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            boolean r2 = r0.l(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r3, @org.jetbrains.annotations.Nullable java.lang.Integer r4) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.h()
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L21
            int r2 = r4.intValue()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a(r2)
            goto L27
        L21:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.b r2 = r4.m(r2)
        L27:
            if (r2 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r3.p(r2)
            return r2
        L32:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r9) {
            r7 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = f(r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L1b
            java.util.Set r8 = kotlin.collections.u1.k()
            return r8
        L1b:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r9 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r8)
            kotlin.reflect.jvm.internal.impl.name.c r9 = r9.p(r0)
            if (r9 != 0) goto L2c
            java.util.Set r8 = kotlin.collections.u1.f(r8)
            return r8
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = r3.p(r9)
            r0 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.d[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.d[r0]
            r1 = 0
            r0[r1] = r8
            r8 = 1
            r0[r8] = r9
            java.util.List r8 = kotlin.collections.f0.Q(r0)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
    }
}
