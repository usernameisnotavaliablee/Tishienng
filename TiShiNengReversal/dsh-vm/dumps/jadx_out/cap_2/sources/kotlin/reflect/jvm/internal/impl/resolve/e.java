package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e implements kotlin.reflect.jvm.internal.impl.types.checker.e.a {
    private final boolean a;
    private final kotlin.reflect.jvm.internal.impl.descriptors.a b;
    private final kotlin.reflect.jvm.internal.impl.descriptors.a c;

    public e(boolean r1, kotlin.reflect.jvm.internal.impl.descriptors.a r2, kotlin.reflect.jvm.internal.impl.descriptors.a r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
    public boolean a(kotlin.reflect.jvm.internal.impl.types.w1 r4, kotlin.reflect.jvm.internal.impl.types.w1 r5) {
            r3 = this;
            boolean r0 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r3.b
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = r3.c
            boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.g.c(r0, r1, r2, r4, r5)
            return r4
    }
}
