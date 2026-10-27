package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
    protected final kotlin.reflect.jvm.internal.impl.types.t0 a;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h b;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            c(r0)
        L6:
            r1.<init>()
            r1.a = r2
            if (r3 == 0) goto Le
            goto Lf
        Le:
            r3 = r1
        Lf:
            r1.b = r3
            return
    }

    private static /* synthetic */ void c(int r7) {
            r0 = 2
            r1 = 1
            if (r7 == r1) goto L9
            if (r7 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            if (r7 == r1) goto L11
            if (r7 == r0) goto L11
            r3 = 3
            goto L12
        L11:
            r3 = 2
        L12:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue"
            r5 = 0
            if (r7 == r1) goto L20
            if (r7 == r0) goto L20
            java.lang.String r6 = "receiverType"
            r3[r5] = r6
            goto L22
        L20:
            r3[r5] = r4
        L22:
            if (r7 == r1) goto L2e
            if (r7 == r0) goto L29
            r3[r1] = r4
            goto L32
        L29:
            java.lang.String r4 = "getOriginal"
            r3[r1] = r4
            goto L32
        L2e:
            java.lang.String r4 = "getType"
            r3[r1] = r4
        L32:
            if (r7 == r1) goto L3a
            if (r7 == r0) goto L3a
            java.lang.String r4 = "<init>"
            r3[r0] = r4
        L3a:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L48
            if (r7 == r0) goto L48
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L4d
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L4d:
            throw r7
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
            if (r0 != 0) goto L8
            r1 = 1
            c(r1)
        L8:
            return r0
    }
}
