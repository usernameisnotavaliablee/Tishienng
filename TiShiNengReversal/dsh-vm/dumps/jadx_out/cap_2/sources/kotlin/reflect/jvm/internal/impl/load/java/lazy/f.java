package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g a;

    public f(kotlin.reflect.jvm.internal.impl.load.java.lazy.g r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r0 = r1.a
            x3.a r2 = (x3.a) r2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.g.a(r0, r2)
            return r2
    }
}
