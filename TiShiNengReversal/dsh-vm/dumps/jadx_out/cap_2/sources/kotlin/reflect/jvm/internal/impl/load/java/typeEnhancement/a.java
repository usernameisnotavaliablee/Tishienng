package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class a implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d a;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a b;

    public a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r1 = r2.b
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a(r0, r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}
