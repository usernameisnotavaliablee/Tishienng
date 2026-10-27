package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m implements kotlin.reflect.jvm.internal.impl.load.java.lazy.p {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k b;
    private final int c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<x3.y, java.lang.Integer> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<x3.y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1> e;

    public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull x3.z r4, int r5) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeParameterOwner"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r5
            java.util.List r3 = r4.getTypeParameters()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Map r3 = kotlin.reflect.jvm.internal.impl.utils.a.d(r3)
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.l r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.l
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r2.c(r3)
            r1.e = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1 b(kotlin.reflect.jvm.internal.impl.load.java.lazy.m r0, x3.y r1) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1 r0 = c(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1 c(kotlin.reflect.jvm.internal.impl.load.java.lazy.m r4, x3.y r5) {
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map<x3.y, java.lang.Integer> r0 = r4.d
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1 r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.d(r2, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r4.b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.getAnnotations()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.k(r2, r3)
            int r3 = r4.c
            int r3 = r3 + r0
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b
            r1.<init>(r2, r5, r3, r4)
            return r1
        L2e:
            r4 = 0
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.p
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.j1 a(@org.jetbrains.annotations.NotNull x3.y r2) {
            r1 = this;
            java.lang.String r0 = "javaTypeParameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.h<x3.y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1> r0 = r1.e
            java.lang.Object r0 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1 r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = r0.a(r2)
            return r2
    }
}
