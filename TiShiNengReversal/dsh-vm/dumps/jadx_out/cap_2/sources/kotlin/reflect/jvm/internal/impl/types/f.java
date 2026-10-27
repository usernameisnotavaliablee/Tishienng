package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f implements kotlin.jvm.functions.Function1 {
    private final java.util.Collection a;
    private final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState b;
    private final d4.r c;
    private final d4.h d;

    public f(java.util.Collection r1, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, d4.r r3, d4.h r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            java.util.Collection r0 = r4.a
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1 = r4.b
            d4.r r2 = r4.c
            d4.h r3 = r4.d
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a r5 = (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a) r5
            kotlin.n1 r5 = kotlin.reflect.jvm.internal.impl.types.h.a(r0, r1, r2, r3, r5)
            return r5
    }
}
