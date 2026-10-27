package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class v implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 a;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z b;

    public v(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1 = r2.b
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            java.util.Collection r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z.p0(r0, r1, r3)
            return r3
    }
}
