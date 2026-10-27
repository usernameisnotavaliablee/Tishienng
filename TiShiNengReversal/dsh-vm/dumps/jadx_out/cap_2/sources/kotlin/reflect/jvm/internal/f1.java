package kotlin.reflect.jvm.internal;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f1 implements java.util.Comparator {
    private final kotlin.jvm.functions.Function2 a;

    public f1(kotlin.jvm.functions.Function2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlin.jvm.functions.Function2 r0 = r1.a
            int r2 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.r(r0, r2, r3)
            return r2
    }
}
