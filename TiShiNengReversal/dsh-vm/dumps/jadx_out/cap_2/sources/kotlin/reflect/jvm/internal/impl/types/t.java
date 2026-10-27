package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t extends kotlin.reflect.jvm.internal.impl.types.r1<kotlin.reflect.jvm.internal.impl.types.t> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a;

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t a(kotlin.reflect.jvm.internal.impl.types.t r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.t r1 = (kotlin.reflect.jvm.internal.impl.types.t) r1
            kotlin.reflect.jvm.internal.impl.types.t r1 = r0.d(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.types.t> b() {
            r1 = this;
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.t> r0 = kotlin.reflect.jvm.internal.impl.types.t.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t c(kotlin.reflect.jvm.internal.impl.types.t r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.t r1 = (kotlin.reflect.jvm.internal.impl.types.t) r1
            kotlin.reflect.jvm.internal.impl.types.t r1 = r0.f(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return r2
        L3:
            kotlin.reflect.jvm.internal.impl.types.t r0 = new kotlin.reflect.jvm.internal.impl.types.t
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(r1, r3)
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            kotlin.reflect.jvm.internal.impl.types.t r2 = (kotlin.reflect.jvm.internal.impl.types.t) r2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.a
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t f(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t r1) {
            r0 = this;
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }
}
