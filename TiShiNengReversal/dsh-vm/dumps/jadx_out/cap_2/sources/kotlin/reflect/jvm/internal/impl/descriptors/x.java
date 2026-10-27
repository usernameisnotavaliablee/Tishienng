package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x {


    static /* synthetic */ int a(kotlin.reflect.jvm.internal.impl.name.b r0) {
            int r0 = e(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = c(r1, r2)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.f c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.r.a(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L6b
            kotlin.reflect.jvm.internal.impl.name.c r0 = r7.f()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r6 = r6.M(r0)
            kotlin.reflect.jvm.internal.impl.name.c r7 = r7.g()
            java.util.List r7 = r7.e()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r6.r()
            java.lang.Object r0 = kotlin.collections.f0.G2(r7)
            kotlin.reflect.jvm.internal.impl.name.f r0 = (kotlin.reflect.jvm.internal.impl.name.f) r0
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.g(r0, r3)
            if (r6 != 0) goto L35
            return r2
        L35:
            int r0 = r7.size()
            java.util.List r7 = r7.subList(r1, r0)
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.name.f r0 = (kotlin.reflect.jvm.internal.impl.name.f) r0
            boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 != 0) goto L52
            return r2
        L52:
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r6.G()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.g(r0, r1)
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6
            goto L66
        L65:
            r6 = r2
        L66:
            if (r6 == 0) goto L69
            goto L41
        L69:
            return r2
        L6a:
            return r6
        L6b:
            kotlin.reflect.jvm.internal.impl.name.c r3 = r7.f()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r0.M(r3)
            kotlin.reflect.jvm.internal.impl.name.c r3 = r7.g()
            java.util.List r3 = r3.e()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            java.lang.Object r4 = kotlin.collections.f0.G2(r3)
            kotlin.reflect.jvm.internal.impl.name.f r4 = (kotlin.reflect.jvm.internal.impl.name.f) r4
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r4, r5)
            if (r0 != 0) goto L8f
        L8d:
            r0 = r2
            goto Lc3
        L8f:
            int r4 = r3.size()
            java.util.List r3 = r3.subList(r1, r4)
            java.util.Iterator r3 = r3.iterator()
        L9b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc3
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.name.f r4 = (kotlin.reflect.jvm.internal.impl.name.f) r4
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r5 != 0) goto Lac
            goto L8d
        Lac:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.G()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r4, r5)
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r4 == 0) goto Lbf
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto Lc0
        Lbf:
            r0 = r2
        Lc0:
            if (r0 == 0) goto L8d
            goto L9b
        Lc3:
            if (r0 != 0) goto L11e
            kotlin.reflect.jvm.internal.impl.name.c r0 = r7.f()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r6 = r6.M(r0)
            kotlin.reflect.jvm.internal.impl.name.c r7 = r7.g()
            java.util.List r7 = r7.e()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r6.r()
            java.lang.Object r0 = kotlin.collections.f0.G2(r7)
            kotlin.reflect.jvm.internal.impl.name.f r0 = (kotlin.reflect.jvm.internal.impl.name.f) r0
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.g(r0, r3)
            if (r6 != 0) goto Le8
            return r2
        Le8:
            int r0 = r7.size()
            java.util.List r7 = r7.subList(r1, r0)
            java.util.Iterator r7 = r7.iterator()
        Lf4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L11d
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.name.f r0 = (kotlin.reflect.jvm.internal.impl.name.f) r0
            boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 != 0) goto L105
            return r2
        L105:
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r6.G()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.g(r0, r1)
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L118
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6
            goto L119
        L118:
            r6 = r2
        L119:
            if (r6 == 0) goto L11c
            goto Lf4
        L11c:
            return r2
        L11d:
            return r6
        L11e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = b(r1, r2)
            if (r1 == 0) goto L16
            return r1
        L16:
            kotlin.reflect.jvm.internal.impl.descriptors.x$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.x.a.a
            kotlin.sequences.m r1 = kotlin.sequences.p.t(r2, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w r0 = kotlin.reflect.jvm.internal.impl.descriptors.w.a
            kotlin.sequences.m r1 = kotlin.sequences.p.N1(r1, r0)
            java.util.List r1 = kotlin.sequences.p.I3(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.d(r2, r1)
            return r1
    }

    private static final int e(kotlin.reflect.jvm.internal.impl.name.b r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.i1 f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = c(r1, r2)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r2 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r1
            return r1
        L15:
            r1 = 0
            return r1
    }
}
