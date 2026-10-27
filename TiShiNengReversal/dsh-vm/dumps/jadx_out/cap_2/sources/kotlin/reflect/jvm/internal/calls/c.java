package kotlin.reflect.jvm.internal.calls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c implements java.lang.reflect.InvocationHandler {
    private final java.lang.Class a;
    private final java.util.Map b;
    private final kotlin.s c;
    private final kotlin.s d;
    private final java.util.List e;

    public c(java.lang.Class r1, java.util.Map r2, kotlin.s r3, kotlin.s r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
            r8 = this;
            java.lang.Class r0 = r8.a
            java.util.Map r1 = r8.b
            kotlin.s r2 = r8.c
            kotlin.s r3 = r8.d
            java.util.List r4 = r8.e
            r5 = r9
            r6 = r10
            r7 = r11
            java.lang.Object r9 = kotlin.reflect.jvm.internal.calls.e.e(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }
}
