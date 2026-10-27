package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OnErrorNotImplementedException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(java.lang.String r1, java.lang.Throwable r2) {
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

    public OnErrorNotImplementedException(java.lang.Throwable r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r0 = r2.getMessage()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r2 == 0) goto Lb
            goto L10
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
        L10:
            r1.<init>(r0, r2)
            return
    }
}
