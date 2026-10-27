package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FunctionReference extends kotlin.jvm.internal.CallableReference implements kotlin.jvm.internal.c0, kotlin.reflect.i {
    private final int arity;

    @kotlin.SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int r8) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public FunctionReference(int r8, java.lang.Object r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReference(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto Lc
            r7 = 1
        L6:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto Lf
        Lc:
            r0 = 0
            r7 = 0
            goto L6
        Lf:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            int r9 = r14 >> 1
            r2.flags = r9
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    protected kotlin.reflect.c computeReflected() {
            r1 = this;
            kotlin.reflect.i r0 = kotlin.jvm.internal.o0.c(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionReference
            r2 = 0
            if (r1 == 0) goto L51
            kotlin.jvm.internal.FunctionReference r5 = (kotlin.jvm.internal.FunctionReference) r5
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.flags
            int r3 = r5.flags
            if (r1 != r3) goto L50
            int r1 = r4.arity
            int r3 = r5.arity
            if (r1 != r3) goto L50
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r3 = r5.getBoundReceiver()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L50
            kotlin.reflect.h r1 = r4.getOwner()
            kotlin.reflect.h r5 = r5.getOwner()
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 == 0) goto L50
            return r0
        L50:
            return r2
        L51:
            boolean r0 = r5 instanceof kotlin.reflect.i
            if (r0 == 0) goto L5e
            kotlin.reflect.c r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L5e:
            return r2
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    protected /* bridge */ /* synthetic */ kotlin.reflect.c getReflected() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    protected kotlin.reflect.i getReflected() {
            r1 = this;
            kotlin.reflect.c r0 = super.getReflected()
            kotlin.reflect.i r0 = (kotlin.reflect.i) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.h r0 = r2.getOwner()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            kotlin.reflect.h r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.i
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isExternal() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // kotlin.reflect.i
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isInfix() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // kotlin.reflect.i
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isInline() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // kotlin.reflect.i
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isOperator() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.c r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = "<init>"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            return r0
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "function "
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
