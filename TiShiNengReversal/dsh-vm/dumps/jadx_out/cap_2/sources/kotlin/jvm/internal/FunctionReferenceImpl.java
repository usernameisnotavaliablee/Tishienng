package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FunctionReferenceImpl extends kotlin.jvm.internal.FunctionReference {
    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public FunctionReferenceImpl(int r8, kotlin.reflect.h r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r9
            kotlin.jvm.internal.s r0 = (kotlin.jvm.internal.s) r0
            java.lang.Class r3 = r0.c()
            boolean r9 = r9 instanceof kotlin.reflect.d
            r6 = r9 ^ 1
            r0 = r7
            r1 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }
}
