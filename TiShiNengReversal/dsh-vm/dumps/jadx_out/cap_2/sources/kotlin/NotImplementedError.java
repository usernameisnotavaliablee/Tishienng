package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NotImplementedError extends java.lang.Error {
    public NotImplementedError() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public NotImplementedError(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            return
    }

    public /* synthetic */ NotImplementedError(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "An operation is not implemented."
        L6:
            r0.<init>(r1)
            return
    }
}
