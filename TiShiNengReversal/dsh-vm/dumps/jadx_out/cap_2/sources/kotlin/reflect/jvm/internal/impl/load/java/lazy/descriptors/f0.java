package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f0 implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 a;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k b;

    public f0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a) r3
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.i0(r0, r1, r3)
            return r3
    }
}
