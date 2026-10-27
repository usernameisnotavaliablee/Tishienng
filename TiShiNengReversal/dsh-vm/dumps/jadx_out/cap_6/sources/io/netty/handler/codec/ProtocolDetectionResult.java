package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ProtocolDetectionResult<T> {
    private static final io.netty.handler.codec.ProtocolDetectionResult INVALID = null;
    private static final io.netty.handler.codec.ProtocolDetectionResult NEEDS_MORE_DATE = null;
    private final T result;
    private final io.netty.handler.codec.ProtocolDetectionState state;

    static {
            io.netty.handler.codec.ProtocolDetectionResult r0 = new io.netty.handler.codec.ProtocolDetectionResult
            io.netty.handler.codec.ProtocolDetectionState r1 = io.netty.handler.codec.ProtocolDetectionState.NEEDS_MORE_DATA
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.ProtocolDetectionResult.NEEDS_MORE_DATE = r0
            io.netty.handler.codec.ProtocolDetectionResult r0 = new io.netty.handler.codec.ProtocolDetectionResult
            io.netty.handler.codec.ProtocolDetectionState r1 = io.netty.handler.codec.ProtocolDetectionState.INVALID
            r0.<init>(r1, r2)
            io.netty.handler.codec.ProtocolDetectionResult.INVALID = r0
            return
    }

    private ProtocolDetectionResult(io.netty.handler.codec.ProtocolDetectionState r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.state = r1
            r0.result = r2
            return
    }

    public static <T> io.netty.handler.codec.ProtocolDetectionResult<T> detected(T r3) {
            io.netty.handler.codec.ProtocolDetectionResult r0 = new io.netty.handler.codec.ProtocolDetectionResult
            io.netty.handler.codec.ProtocolDetectionState r1 = io.netty.handler.codec.ProtocolDetectionState.DETECTED
            java.lang.String r2 = "protocol"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static <T> io.netty.handler.codec.ProtocolDetectionResult<T> invalid() {
            io.netty.handler.codec.ProtocolDetectionResult r0 = io.netty.handler.codec.ProtocolDetectionResult.INVALID
            return r0
    }

    public static <T> io.netty.handler.codec.ProtocolDetectionResult<T> needsMoreData() {
            io.netty.handler.codec.ProtocolDetectionResult r0 = io.netty.handler.codec.ProtocolDetectionResult.NEEDS_MORE_DATE
            return r0
    }

    public T detectedProtocol() {
            r1 = this;
            T r0 = r1.result
            return r0
    }

    public io.netty.handler.codec.ProtocolDetectionState state() {
            r1 = this;
            io.netty.handler.codec.ProtocolDetectionState r0 = r1.state
            return r0
    }
}
