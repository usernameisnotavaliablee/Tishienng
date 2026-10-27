package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class h implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType a;

    public h(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f0) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a(r0, r2)
            return r2
    }
}
