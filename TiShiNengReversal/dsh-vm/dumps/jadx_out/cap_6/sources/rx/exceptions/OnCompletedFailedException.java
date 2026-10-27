package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OnCompletedFailedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            if (r2 == 0) goto L3
            goto L8
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
        L8:
            r0.<init>(r1, r2)
            return
    }

    public OnCompletedFailedException(java.lang.Throwable r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
        L8:
            r0.<init>(r1)
            return
    }
}
