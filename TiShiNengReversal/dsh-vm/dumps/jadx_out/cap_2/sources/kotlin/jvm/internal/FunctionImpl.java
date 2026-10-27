package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class FunctionImpl implements kotlin.n, java.io.Serializable, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function5, kotlin.jvm.functions.Function6, kotlin.jvm.functions.Function7, kotlin.jvm.functions.Function8, kotlin.jvm.functions.Function9, kotlin.jvm.functions.Function10, kotlin.jvm.functions.Function11, kotlin.jvm.functions.Function12, kotlin.jvm.functions.Function13, kotlin.jvm.functions.Function14, kotlin.jvm.functions.Function15, kotlin.jvm.functions.Function16, kotlin.jvm.functions.Function17, kotlin.jvm.functions.Function18, kotlin.jvm.functions.Function19, kotlin.jvm.functions.Function20, kotlin.jvm.functions.Function21, kotlin.jvm.functions.Function22 {
    public FunctionImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private void checkArity(int r2) {
            r1 = this;
            int r0 = r1.getArity()
            if (r0 == r2) goto L9
            r1.throwWrongArity(r2)
        L9:
            return
    }

    private void throwWrongArity(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong function arity, expected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", actual: "
            r1.append(r4)
            int r4 = r3.getArity()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public abstract int getArity();

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            r0 = 0
            r1.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = r1.invokeVararg(r0)
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 2
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function3
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 3
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function4
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            r0 = 4
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function5
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r2 = this;
            r0 = 5
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function6
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            r2 = this;
            r0 = 6
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function7
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r2 = this;
            r0 = 7
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function8
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r2 = this;
            r0 = 8
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function9
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r2 = this;
            r0 = 9
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function10
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r2 = this;
            r0 = 10
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function11
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r2 = this;
            r0 = 11
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function12
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r2 = this;
            r0 = 12
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function13
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r2 = this;
            r0 = 13
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function14
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
            r2 = this;
            r0 = 14
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function15
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
            r2 = this;
            r0 = 15
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function16
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
            r2 = this;
            r0 = 16
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function17
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r2 = this;
            r0 = 17
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function18
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r2 = this;
            r0 = 18
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function19
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            r2 = this;
            r0 = 19
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function20
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r2 = this;
            r0 = 20
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function21
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
            r2 = this;
            r0 = 21
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            r3 = 20
            r0[r3] = r23
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    @Override // kotlin.jvm.functions.Function22
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
            r2 = this;
            r0 = 22
            r2.checkArity(r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            r3 = 20
            r0[r3] = r23
            r3 = 21
            r0[r3] = r24
            java.lang.Object r3 = r2.invokeVararg(r0)
            return r3
    }

    public java.lang.Object invokeVararg(java.lang.Object... r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
