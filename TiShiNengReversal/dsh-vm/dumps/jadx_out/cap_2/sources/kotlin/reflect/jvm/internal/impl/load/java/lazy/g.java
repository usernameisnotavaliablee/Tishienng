package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k a;

    @org.jetbrains.annotations.NotNull
    private final x3.d b;
    private final boolean c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<x3.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d;

    public g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull x3.d r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "annotationOwner"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.u()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.f r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.f
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r2.c(r3)
            r1.d = r2
            return
    }

    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, x3.d r2, boolean r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(kotlin.reflect.jvm.internal.impl.load.java.lazy.g r0, x3.a r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = d(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c d(kotlin.reflect.jvm.internal.impl.load.java.lazy.g r2, x3.a r3) {
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.a
            boolean r2 = r2.c
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = r0.e(r3, r1, r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            x3.d r0 = r3.b
            x3.a r0 = r0.b(r4)
            if (r0 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.storage.h<x3.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r1 = r3.d
            java.lang.Object r0 = r1.invoke(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r0
            if (r0 != 0) goto L18
            goto L19
        L18:
            return r0
        L19:
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            x3.d r1 = r3.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r4 = r0.a(r4, r1, r2)
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
            r1 = this;
            x3.d r0 = r1.b
            java.util.Collection r0 = r0.getAnnotations()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            x3.d r0 = r1.b
            boolean r0 = r0.s()
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r5 = this;
            x3.d r0 = r5.b
            java.util.Collection r0 = r0.getAnnotations()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.reflect.jvm.internal.impl.storage.h<x3.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r1 = r5.d
            kotlin.sequences.m r0 = kotlin.sequences.p.N1(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.components.d r1 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.y
            x3.d r3 = r5.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r5.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.a(r2, r3, r4)
            kotlin.sequences.m r0 = kotlin.sequences.p.S2(r0, r1)
            kotlin.sequences.m r0 = kotlin.sequences.p.X0(r0)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b.b(r0, r1)
            return r1
    }
}
