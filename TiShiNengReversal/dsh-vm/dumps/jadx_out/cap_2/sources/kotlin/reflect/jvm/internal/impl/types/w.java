package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class w implements kotlin.reflect.jvm.internal.impl.types.w1 {
    private int a;

    public w() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean f(kotlin.reflect.jvm.internal.impl.descriptors.f r2) {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r2)
            if (r0 != 0) goto Le
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.i.E(r2)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f c();

    protected final boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r5) {
            r3 = this;
            java.lang.String r0 = "first"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "second"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r5.getName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto L1a
            return r1
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r5.b()
        L22:
            r0 = 1
            if (r4 == 0) goto L6c
            if (r5 == 0) goto L6c
            boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            if (r2 == 0) goto L2e
            boolean r4 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            return r4
        L2e:
            boolean r2 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            if (r2 == 0) goto L33
            return r1
        L33:
            boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r2 == 0) goto L4f
            boolean r2 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r2 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r4
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.d()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r5
            kotlin.reflect.jvm.internal.impl.name.c r5 = r5.d()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L4e
            return r0
        L4e:
            return r1
        L4f:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto L54
            return r1
        L54:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r5.getName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L63
            return r1
        L63:
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r5.b()
            goto L22
        L6c:
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.w1
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r4.hashCode()
            int r2 = r3.hashCode()
            if (r0 == r2) goto L15
            return r1
        L15:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = (kotlin.reflect.jvm.internal.impl.types.w1) r4
            java.util.List r0 = r4.getParameters()
            int r0 = r0.size()
            java.util.List r2 = r3.getParameters()
            int r2 = r2.size()
            if (r0 == r2) goto L2a
            return r1
        L2a:
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r3.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
            if (r4 != 0) goto L35
            return r1
        L35:
            boolean r0 = r3.f(r0)
            if (r0 == 0) goto L47
            boolean r0 = r3.f(r4)
            if (r0 != 0) goto L42
            goto L47
        L42:
            boolean r4 = r3.g(r4)
            return r4
        L47:
            return r1
    }

    protected abstract boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r1);

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            if (r0 == 0) goto L5
            return r0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r2.c()
            boolean r1 = r2.f(r0)
            if (r1 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r0)
            int r0 = r0.hashCode()
            goto L1c
        L18:
            int r0 = java.lang.System.identityHashCode(r2)
        L1c:
            r2.a = r0
            return r0
    }
}
