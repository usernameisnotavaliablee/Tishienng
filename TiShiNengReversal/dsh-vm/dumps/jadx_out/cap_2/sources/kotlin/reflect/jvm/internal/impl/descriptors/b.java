package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b implements kotlin.reflect.jvm.internal.impl.descriptors.j1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k b;
    private final int c;

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, int r4) {
            r1 = this;
            java.lang.String r0 = "originalDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "declarationDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean E() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
            java.lang.Object r2 = r0.W(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1, kotlin.reflect.jvm.internal.impl.descriptors.f, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.j1 a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r0.a()
            java.lang.String r1 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.storage.n d0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.d0()
            java.lang.String r1 = "getStorageManager(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public int getIndex() {
            r2 = this;
            int r0 = r2.c
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = r2.a
            int r1 = r1.getIndex()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r0.getSource()
            java.lang.String r1 = "getSource(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> getUpperBounds() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            java.util.List r0 = r0.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
            boolean r0 = r0.j()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.Variance l() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.l()
            java.lang.String r1 = "getVariance(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1, kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.lang.String r1 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 s() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            java.lang.String r1 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "[inner-copy]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
