package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DecoderResult {
    protected static final io.netty.util.Signal SIGNAL_SUCCESS = null;
    protected static final io.netty.util.Signal SIGNAL_UNFINISHED = null;
    public static final io.netty.handler.codec.DecoderResult SUCCESS = null;
    public static final io.netty.handler.codec.DecoderResult UNFINISHED = null;
    private final java.lang.Throwable cause;

    static {
            java.lang.String r0 = "UNFINISHED"
            java.lang.Class<io.netty.handler.codec.DecoderResult> r1 = io.netty.handler.codec.DecoderResult.class
            io.netty.util.Signal r0 = io.netty.util.Signal.valueOf(r1, r0)
            io.netty.handler.codec.DecoderResult.SIGNAL_UNFINISHED = r0
            java.lang.String r2 = "SUCCESS"
            io.netty.util.Signal r1 = io.netty.util.Signal.valueOf(r1, r2)
            io.netty.handler.codec.DecoderResult.SIGNAL_SUCCESS = r1
            io.netty.handler.codec.DecoderResult r2 = new io.netty.handler.codec.DecoderResult
            r2.<init>(r0)
            io.netty.handler.codec.DecoderResult.UNFINISHED = r2
            io.netty.handler.codec.DecoderResult r0 = new io.netty.handler.codec.DecoderResult
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult.SUCCESS = r0
            return
    }

    protected DecoderResult(java.lang.Throwable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.cause = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cause"
            r2.<init>(r0)
            throw r2
    }

    public static io.netty.handler.codec.DecoderResult failure(java.lang.Throwable r1) {
            if (r1 == 0) goto L8
            io.netty.handler.codec.DecoderResult r0 = new io.netty.handler.codec.DecoderResult
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "cause"
            r1.<init>(r0)
            throw r1
    }

    public java.lang.Throwable cause() {
            r1 = this;
            boolean r0 = r1.isFailure()
            if (r0 == 0) goto L9
            java.lang.Throwable r0 = r1.cause
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isFailure() {
            r2 = this;
            java.lang.Throwable r0 = r2.cause
            io.netty.util.Signal r1 = io.netty.handler.codec.DecoderResult.SIGNAL_SUCCESS
            if (r0 == r1) goto Lc
            io.netty.util.Signal r1 = io.netty.handler.codec.DecoderResult.SIGNAL_UNFINISHED
            if (r0 == r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isFinished() {
            r2 = this;
            java.lang.Throwable r0 = r2.cause
            io.netty.util.Signal r1 = io.netty.handler.codec.DecoderResult.SIGNAL_UNFINISHED
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isSuccess() {
            r2 = this;
            java.lang.Throwable r0 = r2.cause
            io.netty.util.Signal r1 = io.netty.handler.codec.DecoderResult.SIGNAL_SUCCESS
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L34
            boolean r0 = r3.isSuccess()
            if (r0 == 0) goto Lf
            java.lang.String r0 = "success"
            return r0
        Lf:
            java.lang.Throwable r0 = r3.cause()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length()
            int r2 = r2 + 17
            r1.<init>(r2)
            java.lang.String r2 = "failure("
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L34:
            java.lang.String r0 = "unfinished"
            return r0
    }
}
