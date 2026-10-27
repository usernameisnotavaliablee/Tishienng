package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.a {
    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            c(r0)
        L6:
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 1
            c(r0)
        L6:
            r1.<init>(r2, r3)
            return
    }

    private static /* synthetic */ void c(int r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            if (r4 == r2) goto Lc
            java.lang.String r3 = "type"
            r0[r1] = r3
            goto L10
        Lc:
            java.lang.String r3 = "newType"
            r0[r1] = r3
        L10:
            r1 = 1
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver"
            r0[r1] = r3
            if (r4 == r2) goto L1c
            java.lang.String r4 = "<init>"
            r0[r2] = r4
            goto L20
        L1c:
            java.lang.String r4 = "replaceType"
            r0[r2] = r4
        L20:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{Transient} : "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
