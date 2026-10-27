package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class PropertyReference extends kotlin.jvm.internal.CallableReference implements kotlin.reflect.n {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.syntheticJavaProperty = r0
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public PropertyReference(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.syntheticJavaProperty = r1
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            r8 = 1
        L7:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            goto Lf
        Ld:
            r8 = 0
            goto L7
        Lf:
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 2
            r11 = r14 & 2
            if (r11 != r10) goto L18
            r1 = 1
        L18:
            r3.syntheticJavaProperty = r1
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c compute() {
            r1 = this;
            boolean r0 = r1.syntheticJavaProperty
            if (r0 == 0) goto L5
            return r1
        L5:
            kotlin.reflect.c r0 = super.compute()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.PropertyReference
            r2 = 0
            if (r1 == 0) goto L45
            kotlin.jvm.internal.PropertyReference r5 = (kotlin.jvm.internal.PropertyReference) r5
            kotlin.reflect.h r1 = r4.getOwner()
            kotlin.reflect.h r3 = r5.getOwner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r5 = r5.getBoundReceiver()
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 == 0) goto L44
            return r0
        L44:
            return r2
        L45:
            boolean r0 = r5 instanceof kotlin.reflect.n
            if (r0 == 0) goto L52
            kotlin.reflect.c r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L52:
            return r2
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    protected /* bridge */ /* synthetic */ kotlin.reflect.c getReflected() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    protected kotlin.reflect.n getReflected() {
            r2 = this;
            boolean r0 = r2.syntheticJavaProperty
            if (r0 != 0) goto Lb
            kotlin.reflect.c r0 = super.getReflected()
            kotlin.reflect.n r0 = (kotlin.reflect.n) r0
            return r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.h r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.n
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isConst() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            boolean r0 = r0.isConst()
            return r0
    }

    @Override // kotlin.reflect.n
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isLateinit() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            boolean r0 = r0.isLateinit()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.c r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "property "
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
