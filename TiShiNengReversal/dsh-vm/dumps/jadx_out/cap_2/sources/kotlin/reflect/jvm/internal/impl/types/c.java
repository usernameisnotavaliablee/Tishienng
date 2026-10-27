package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n+ 2 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n140#2,13:885\n153#2,13:899\n140#2,13:912\n153#2,13:926\n1#3:898\n1#3:925\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n*L\n828#1:885,13\n828#1:899,13\n842#1:912,13\n842#1:926,13\n828#1:898\n842#1:925\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.c a = null;

    static {
            kotlin.reflect.jvm.internal.impl.types.c r0 = new kotlin.reflect.jvm.internal.impl.types.c
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r4, d4.h r5, d4.o r6) {
            r3 = this;
            d4.r r0 = r4.j()
            boolean r1 = r0.v0(r5)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = r0.c0(r5)
            if (r1 == 0) goto L14
            r4 = 0
            return r4
        L14:
            boolean r4 = r4.o()
            if (r4 == 0) goto L21
            boolean r4 = r0.p0(r5)
            if (r4 == 0) goto L21
            return r2
        L21:
            d4.o r4 = r0.g(r5)
            boolean r4 = r0.J(r4, r6)
            return r4
    }

    private final boolean e(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r5, d4.h r6, d4.h r7) {
            r4 = this;
            d4.r r0 = r5.j()
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.h.b
            if (r1 == 0) goto L26
            boolean r1 = r0.h(r6)
            if (r1 != 0) goto L1c
            d4.o r1 = r0.g(r6)
            boolean r1 = r0.P(r1)
            if (r1 != 0) goto L1c
            boolean r1 = r5.l(r6)
        L1c:
            boolean r1 = r0.h(r7)
            if (r1 != 0) goto L26
            boolean r1 = r5.l(r7)
        L26:
            boolean r1 = r0.c0(r7)
            r2 = 1
            if (r1 == 0) goto L2e
            return r2
        L2e:
            boolean r1 = r0.a0(r6)
            if (r1 != 0) goto L75
            boolean r1 = r0.F(r6)
            if (r1 == 0) goto L3b
            goto L75
        L3b:
            boolean r1 = r6 instanceof d4.b
            if (r1 == 0) goto L49
            r1 = r6
            d4.b r1 = (d4.b) r1
            boolean r1 = r0.B(r1)
            if (r1 == 0) goto L49
            return r2
        L49:
            kotlin.reflect.jvm.internal.impl.types.c r1 = kotlin.reflect.jvm.internal.impl.types.c.a
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r3 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a
            boolean r3 = r1.a(r5, r6, r3)
            if (r3 == 0) goto L54
            return r2
        L54:
            boolean r2 = r0.a0(r7)
            r3 = 0
            if (r2 == 0) goto L5c
            return r3
        L5c:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$d r2 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.d.a
            boolean r2 = r1.a(r5, r7, r2)
            if (r2 == 0) goto L65
            return r3
        L65:
            boolean r2 = r0.Y(r6)
            if (r2 == 0) goto L6c
            return r3
        L6c:
            d4.o r7 = r0.g(r7)
            boolean r5 = r1.b(r5, r6, r7)
            return r5
        L75:
            return r2
    }

    public final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r8, @org.jetbrains.annotations.NotNull d4.h r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b r10) {
            r7 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "supertypesPolicy"
            kotlin.jvm.internal.g0.p(r10, r0)
            d4.r r0 = r8.j()
            boolean r1 = r0.Y(r9)
            r2 = 1
            if (r1 == 0) goto L20
            boolean r1 = r0.c0(r9)
            if (r1 == 0) goto L26
        L20:
            boolean r1 = r0.a0(r9)
            if (r1 == 0) goto L27
        L26:
            return r2
        L27:
            r8.k()
            java.util.ArrayDeque r1 = r8.h()
            kotlin.jvm.internal.g0.m(r1)
            java.util.Set r3 = r8.i()
            kotlin.jvm.internal.g0.m(r3)
            r1.push(r9)
        L3b:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto La1
            java.lang.Object r9 = r1.pop()
            d4.h r9 = (d4.h) r9
            kotlin.jvm.internal.g0.m(r9)
            boolean r4 = r3.add(r9)
            if (r4 == 0) goto L3b
            boolean r4 = r0.c0(r9)
            if (r4 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            goto L5a
        L59:
            r4 = r10
        L5a:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r5 != 0) goto L63
            goto L64
        L63:
            r4 = 0
        L64:
            if (r4 != 0) goto L67
            goto L3b
        L67:
            d4.r r5 = r8.j()
            d4.o r9 = r5.g(r9)
            java.util.Collection r9 = r5.k0(r9)
            java.util.Iterator r9 = r9.iterator()
        L77:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r9.next()
            d4.g r5 = (d4.g) r5
            d4.h r5 = r4.a(r8, r5)
            boolean r6 = r0.Y(r5)
            if (r6 == 0) goto L93
            boolean r6 = r0.c0(r5)
            if (r6 == 0) goto L99
        L93:
            boolean r6 = r0.a0(r5)
            if (r6 == 0) goto L9d
        L99:
            r8.e()
            return r2
        L9d:
            r1.add(r5)
            goto L77
        La1:
            r8.e()
            r8 = 0
            return r8
    }

    public final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r8, @org.jetbrains.annotations.NotNull d4.h r9, @org.jetbrains.annotations.NotNull d4.o r10) {
            r7 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "start"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "end"
            kotlin.jvm.internal.g0.p(r10, r0)
            d4.r r0 = r8.j()
            kotlin.reflect.jvm.internal.impl.types.c r1 = kotlin.reflect.jvm.internal.impl.types.c.a
            boolean r1 = r1.c(r8, r9, r10)
            r2 = 1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            r8.k()
            java.util.ArrayDeque r1 = r8.h()
            kotlin.jvm.internal.g0.m(r1)
            java.util.Set r3 = r8.i()
            kotlin.jvm.internal.g0.m(r3)
            r1.push(r9)
        L31:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L8e
            java.lang.Object r9 = r1.pop()
            d4.h r9 = (d4.h) r9
            kotlin.jvm.internal.g0.m(r9)
            boolean r4 = r3.add(r9)
            if (r4 == 0) goto L31
            boolean r4 = r0.c0(r9)
            if (r4 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            goto L51
        L4f:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a
        L51:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r5 != 0) goto L5a
            goto L5b
        L5a:
            r4 = 0
        L5b:
            if (r4 != 0) goto L5e
            goto L31
        L5e:
            d4.r r5 = r8.j()
            d4.o r9 = r5.g(r9)
            java.util.Collection r9 = r5.k0(r9)
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r9.next()
            d4.g r5 = (d4.g) r5
            d4.h r5 = r4.a(r8, r5)
            kotlin.reflect.jvm.internal.impl.types.c r6 = kotlin.reflect.jvm.internal.impl.types.c.a
            boolean r6 = r6.c(r8, r5, r10)
            if (r6 == 0) goto L8a
            r8.e()
            return r2
        L8a:
            r1.add(r5)
            goto L6e
        L8e:
            r8.e()
            r8 = 0
            return r8
    }

    public final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull d4.h r3, @org.jetbrains.annotations.NotNull d4.h r4) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r2 = r1.e(r2, r3, r4)
            return r2
    }
}
