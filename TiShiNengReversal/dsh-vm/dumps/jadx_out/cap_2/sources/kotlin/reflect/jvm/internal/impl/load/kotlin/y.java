package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y implements kotlin.reflect.jvm.internal.impl.descriptors.e1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 b;

    public y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r2) {
            r1 = this;
            java.lang.String r0 = "packageFragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            java.lang.String r1 = "NO_SOURCE_FILE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r2.b
            java.util.Map r1 = r1.J0()
            java.util.Set r1 = r1.keySet()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
