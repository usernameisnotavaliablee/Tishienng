package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class n0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.c {
    static final /* synthetic */ boolean e = false;
    private final kotlin.reflect.jvm.internal.impl.descriptors.k c;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h d;

    static {
            return
    }

    public n0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.h.i
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public n0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 3
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 4
            T(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 5
            T(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 6
            T(r0)
        L18:
            r1.<init>(r4, r5)
            r1.c = r2
            r1.d = r3
            return
    }

    private static /* synthetic */ void T(int r8) {
            r0 = 8
            r1 = 7
            if (r8 == r1) goto La
            if (r8 == r0) goto La
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lc
        La:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lc:
            r3 = 2
            if (r8 == r1) goto L13
            if (r8 == r0) goto L13
            r4 = 3
            goto L14
        L13:
            r4 = 2
        L14:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl"
            r6 = 0
            switch(r8) {
                case 1: goto L38;
                case 2: goto L33;
                case 3: goto L1c;
                case 4: goto L38;
                case 5: goto L33;
                case 6: goto L2e;
                case 7: goto L2b;
                case 8: goto L2b;
                case 9: goto L26;
                case 10: goto L21;
                default: goto L1c;
            }
        L1c:
            java.lang.String r7 = "containingDeclaration"
            r4[r6] = r7
            goto L3c
        L21:
            java.lang.String r7 = "outType"
            r4[r6] = r7
            goto L3c
        L26:
            java.lang.String r7 = "newOwner"
            r4[r6] = r7
            goto L3c
        L2b:
            r4[r6] = r5
            goto L3c
        L2e:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L3c
        L33:
            java.lang.String r7 = "annotations"
            r4[r6] = r7
            goto L3c
        L38:
            java.lang.String r7 = "value"
            r4[r6] = r7
        L3c:
            r6 = 1
            if (r8 == r1) goto L49
            if (r8 == r0) goto L44
            r4[r6] = r5
            goto L4d
        L44:
            java.lang.String r5 = "getContainingDeclaration"
            r4[r6] = r5
            goto L4d
        L49:
            java.lang.String r5 = "getValue"
            r4[r6] = r5
        L4d:
            switch(r8) {
                case 7: goto L5e;
                case 8: goto L5e;
                case 9: goto L5a;
                case 10: goto L55;
                default: goto L50;
            }
        L50:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L5e
        L55:
            java.lang.String r5 = "setOutType"
            r4[r3] = r5
            goto L5e
        L5a:
            java.lang.String r5 = "copy"
            r4[r3] = r5
        L5e:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L6c
            if (r8 == r0) goto L6c
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L71
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L71:
            throw r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r2.c
            if (r0 != 0) goto L9
            r1 = 8
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0 = r2.d
            if (r0 != 0) goto L8
            r1 = 7
            T(r1)
        L8:
            return r0
    }
}
