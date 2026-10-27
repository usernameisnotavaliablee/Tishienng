package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class t extends kotlin.reflect.jvm.internal.impl.descriptors.impl.c {
    private final kotlin.reflect.jvm.internal.impl.descriptors.d c;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e d;

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            r2.<init>(r0)
            r2.c = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e
            r1 = 0
            r0.<init>(r3, r1)
            r2.d = r0
            return
    }

    private static /* synthetic */ void T(int r8) {
            r0 = 2
            r1 = 1
            if (r8 == r1) goto L9
            if (r8 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            if (r8 == r1) goto L12
            if (r8 == r0) goto L12
            r4 = 3
            goto L13
        L12:
            r4 = 2
        L13:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor"
            r6 = 0
            if (r8 == r1) goto L28
            if (r8 == r0) goto L28
            if (r8 == r3) goto L23
            java.lang.String r7 = "descriptor"
            r4[r6] = r7
            goto L2a
        L23:
            java.lang.String r7 = "newOwner"
            r4[r6] = r7
            goto L2a
        L28:
            r4[r6] = r5
        L2a:
            if (r8 == r1) goto L36
            if (r8 == r0) goto L31
            r4[r1] = r5
            goto L3a
        L31:
            java.lang.String r5 = "getContainingDeclaration"
            r4[r1] = r5
            goto L3a
        L36:
            java.lang.String r5 = "getValue"
            r4[r1] = r5
        L3a:
            if (r8 == r1) goto L49
            if (r8 == r0) goto L49
            if (r8 == r3) goto L45
            java.lang.String r3 = "<init>"
            r4[r0] = r3
            goto L49
        L45:
            java.lang.String r3 = "copy"
            r4[r0] = r3
        L49:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L57
            if (r8 == r0) goto L57
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L5c
        L57:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L5c:
            throw r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.c
            if (r0 != 0) goto L8
            r1 = 2
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e r0 = r2.d
            if (r0 != 0) goto L8
            r1 = 1
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r2.c
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "::this"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
