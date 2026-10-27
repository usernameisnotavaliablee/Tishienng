package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o implements kotlin.reflect.jvm.internal.impl.load.java.lazy.n {
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.c a;

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d a(@org.jetbrains.annotations.NotNull x3.g r2) {
            r1 = this;
            java.lang.String r0 = "javaClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.c r0 = r1.b()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r0.b(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.c b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.jvm.c r0 = r1.a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    public final void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.jvm.c r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }
}
