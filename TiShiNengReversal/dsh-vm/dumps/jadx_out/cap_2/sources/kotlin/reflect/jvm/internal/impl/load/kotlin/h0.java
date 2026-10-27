package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h0 implements kotlin.reflect.jvm.internal.impl.load.kotlin.g0<kotlin.reflect.jvm.internal.impl.load.kotlin.s> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.h0 a = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.h0 r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.h0
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.h0.a = r0
            return
    }

    private h0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.s a(kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.s r1 = r0.g(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    @org.jetbrains.annotations.Nullable
    public java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    @org.jetbrains.annotations.Nullable
    public java.lang.String d(kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r1 = this;
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.g0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 f(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r13) {
            r12 = this;
            java.lang.String r0 = "types"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "There should be no intersection type in existing descriptors, but found: "
            r1.append(r2)
            r3 = r13
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r10 = 63
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r13 = kotlin.collections.f0.r3(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.s g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }
}
