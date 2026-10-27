package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class v0 implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.types.w1 a;
    private final java.util.List b;
    private final kotlin.reflect.jvm.internal.impl.types.t1 c;
    private final boolean d;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k e;

    public v0(kotlin.reflect.jvm.internal.impl.types.w1 r1, java.util.List r2, kotlin.reflect.jvm.internal.impl.types.t1 r3, boolean r4, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.a
            java.util.List r1 = r6.b
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r6.c
            boolean r3 = r6.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r6.e
            r5 = r7
            kotlin.reflect.jvm.internal.impl.types.checker.g r5 = (kotlin.reflect.jvm.internal.impl.types.checker.g) r5
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.w0.b(r0, r1, r2, r3, r4, r5)
            return r7
    }
}
