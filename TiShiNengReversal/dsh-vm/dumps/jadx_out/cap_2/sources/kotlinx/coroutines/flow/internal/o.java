package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {
    @kotlin.PublishedApi
    public static final int a(int r1) {
            if (r1 < 0) goto L3
            return r1
        L3:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened"
            r1.<init>(r0)
            throw r1
    }

    public static final void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.internal.AbortFlowException r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r2) {
            kotlinx.coroutines.flow.j<?> r0 = r1.owner
            if (r0 != r2) goto L5
            return
        L5:
            throw r1
    }
}
