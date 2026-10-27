package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class p0 extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c c;

    public p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r1 = this;
            java.lang.String r0 = "moduleDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r0 = r0.f()
            boolean r0 = r4.a(r0)
            if (r0 != 0) goto L1d
            java.util.List r4 = kotlin.collections.f0.J()
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
        L1d:
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.c
            boolean r0 = r0.c()
            if (r0 == 0) goto L38
            java.util.List r4 = r4.l()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.c$b r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.c.b.a
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L38
            java.util.List r4 = kotlin.collections.f0.J()
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
        L38:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r4 = r3.b
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.c
            java.util.Collection r4 = r4.q(r0, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L4d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.name.c r1 = (kotlin.reflect.jvm.internal.impl.name.c) r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.f()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4d
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = r3.i(r1)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r1)
            goto L4d
        L71:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected final kotlin.reflect.jvm.internal.impl.descriptors.s0 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.i()
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r3.b
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.c
            kotlin.reflect.jvm.internal.impl.name.c r4 = r2.b(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r4 = r0.M(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L20
            return r1
        L20:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subpackages of "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = " from "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
