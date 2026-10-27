package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultSmtpResponse implements io.netty.handler.codec.smtp.SmtpResponse {
    private final int code;
    private final java.util.List<java.lang.CharSequence> details;

    public DefaultSmtpResponse(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    DefaultSmtpResponse(int r2, java.util.List<java.lang.CharSequence> r3) {
            r1 = this;
            r1.<init>()
            r0 = 100
            if (r2 < r0) goto L1b
            r0 = 599(0x257, float:8.4E-43)
            if (r2 > r0) goto L1b
            r1.code = r2
            if (r3 != 0) goto L14
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r1.details = r2
            return
        L14:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            r1.details = r2
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "code must be 100 <= code <= 599"
            r2.<init>(r3)
            throw r2
    }

    public DefaultSmtpResponse(int r1, java.lang.CharSequence... r2) {
            r0 = this;
            java.util.List r2 = io.netty.handler.codec.smtp.SmtpUtils.toUnmodifiableList(r2)
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.smtp.SmtpResponse
    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @Override // io.netty.handler.codec.smtp.SmtpResponse
    public java.util.List<java.lang.CharSequence> details() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.details
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.smtp.DefaultSmtpResponse
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            io.netty.handler.codec.smtp.DefaultSmtpResponse r5 = (io.netty.handler.codec.smtp.DefaultSmtpResponse) r5
            int r2 = r4.code()
            int r3 = r5.code()
            if (r2 != r3) goto L25
            java.util.List r2 = r4.details()
            java.util.List r5 = r5.details()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.code
            int r0 = r0 * 31
            java.util.List<java.lang.CharSequence> r1 = r2.details
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultSmtpResponse{code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", details="
            r0.append(r1)
            java.util.List<java.lang.CharSequence> r1 = r2.details
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
