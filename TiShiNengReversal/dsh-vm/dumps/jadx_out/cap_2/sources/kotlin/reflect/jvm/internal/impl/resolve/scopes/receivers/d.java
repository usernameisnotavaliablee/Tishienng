package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.g {
    private final kotlin.reflect.jvm.internal.impl.descriptors.a c;

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r4) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            c(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            c(r0)
        Lc:
            r1.<init>(r3, r4)
            r1.c = r2
            return
    }

    private static /* synthetic */ void c(int r8) {
            r0 = 2
            if (r8 == r0) goto L6
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L8:
            r2 = 3
            if (r8 == r0) goto Ld
            r3 = 3
            goto Le
        Ld:
            r3 = 2
        Le:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver"
            r5 = 1
            r6 = 0
            if (r8 == r5) goto L27
            if (r8 == r0) goto L24
            if (r8 == r2) goto L1f
            java.lang.String r7 = "callableDescriptor"
            r3[r6] = r7
            goto L2b
        L1f:
            java.lang.String r7 = "newType"
            r3[r6] = r7
            goto L2b
        L24:
            r3[r6] = r4
            goto L2b
        L27:
            java.lang.String r7 = "receiverType"
            r3[r6] = r7
        L2b:
            if (r8 == r0) goto L30
            r3[r5] = r4
            goto L34
        L30:
            java.lang.String r4 = "getDeclarationDescriptor"
            r3[r5] = r4
        L34:
            if (r8 == r0) goto L41
            if (r8 == r2) goto L3d
            java.lang.String r2 = "<init>"
            r3[r0] = r2
            goto L41
        L3d:
            java.lang.String r2 = "replaceType"
            r3[r0] = r2
        L41:
            java.lang.String r1 = java.lang.String.format(r1, r3)
            if (r8 == r0) goto L4d
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L52
        L4d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L52:
            throw r8
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            r0.append(r1)
            java.lang.String r1 = ": Ext {"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
