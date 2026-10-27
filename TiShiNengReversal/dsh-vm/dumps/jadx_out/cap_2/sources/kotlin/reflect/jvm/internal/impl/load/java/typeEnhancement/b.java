package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 a;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] b;

    public b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] r1 = r2.b
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.b(r0, r1, r3)
            return r3
    }
}
