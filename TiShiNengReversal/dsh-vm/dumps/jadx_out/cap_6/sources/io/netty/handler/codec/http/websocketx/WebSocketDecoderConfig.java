package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketDecoderConfig {
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private final boolean closeOnProtocolViolation;
    private final boolean expectMaskedFrames;
    private final int maxFramePayloadLength;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private boolean allowExtensions;
        private boolean allowMaskMismatch;
        private boolean closeOnProtocolViolation;
        private boolean expectMaskedFrames;
        private int maxFramePayloadLength;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 65536(0x10000, float:9.1835E-41)
                r1.maxFramePayloadLength = r0
                r0 = 1
                r1.expectMaskedFrames = r0
                r1.closeOnProtocolViolation = r0
                return
        }

        /* synthetic */ Builder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2) {
                r1 = this;
                r1.<init>()
                r0 = 65536(0x10000, float:9.1835E-41)
                r1.maxFramePayloadLength = r0
                r0 = 1
                r1.expectMaskedFrames = r0
                r1.closeOnProtocolViolation = r0
                java.lang.String r0 = "decoderConfig"
                io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                int r0 = r2.maxFramePayloadLength()
                r1.maxFramePayloadLength = r0
                boolean r0 = r2.expectMaskedFrames()
                r1.expectMaskedFrames = r0
                boolean r0 = r2.allowMaskMismatch()
                r1.allowMaskMismatch = r0
                boolean r0 = r2.allowExtensions()
                r1.allowExtensions = r0
                boolean r2 = r2.closeOnProtocolViolation()
                r1.closeOnProtocolViolation = r2
                return
        }

        /* synthetic */ Builder(io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder allowExtensions(boolean r1) {
                r0 = this;
                r0.allowExtensions = r1
                return r0
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder allowMaskMismatch(boolean r1) {
                r0 = this;
                r0.allowMaskMismatch = r1
                return r0
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig build() {
                r7 = this;
                io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r0 = new io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig
                int r1 = r7.maxFramePayloadLength
                boolean r2 = r7.expectMaskedFrames
                boolean r3 = r7.allowMaskMismatch
                boolean r4 = r7.allowExtensions
                boolean r5 = r7.closeOnProtocolViolation
                r6 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder closeOnProtocolViolation(boolean r1) {
                r0 = this;
                r0.closeOnProtocolViolation = r1
                return r0
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder expectMaskedFrames(boolean r1) {
                r0 = this;
                r0.expectMaskedFrames = r1
                return r0
        }

        public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder maxFramePayloadLength(int r1) {
                r0 = this;
                r0.maxFramePayloadLength = r1
                return r0
        }
    }

    private WebSocketDecoderConfig(int r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.maxFramePayloadLength = r1
            r0.expectMaskedFrames = r2
            r0.allowMaskMismatch = r3
            r0.allowExtensions = r4
            r0.closeOnProtocolViolation = r5
            return
    }

    /* synthetic */ WebSocketDecoderConfig(int r1, boolean r2, boolean r3, boolean r4, boolean r5, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder newBuilder() {
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = new io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean allowExtensions() {
            r1 = this;
            boolean r0 = r1.allowExtensions
            return r0
    }

    public boolean allowMaskMismatch() {
            r1 = this;
            boolean r0 = r1.allowMaskMismatch
            return r0
    }

    public boolean closeOnProtocolViolation() {
            r1 = this;
            boolean r0 = r1.closeOnProtocolViolation
            return r0
    }

    public boolean expectMaskedFrames() {
            r1 = this;
            boolean r0 = r1.expectMaskedFrames
            return r0
    }

    public int maxFramePayloadLength() {
            r1 = this;
            int r0 = r1.maxFramePayloadLength
            return r0
    }

    public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.Builder toBuilder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = new io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WebSocketDecoderConfig [maxFramePayloadLength="
            r0.append(r1)
            int r1 = r2.maxFramePayloadLength
            r0.append(r1)
            java.lang.String r1 = ", expectMaskedFrames="
            r0.append(r1)
            boolean r1 = r2.expectMaskedFrames
            r0.append(r1)
            java.lang.String r1 = ", allowMaskMismatch="
            r0.append(r1)
            boolean r1 = r2.allowMaskMismatch
            r0.append(r1)
            java.lang.String r1 = ", allowExtensions="
            r0.append(r1)
            boolean r1 = r2.allowExtensions
            r0.append(r1)
            java.lang.String r1 = ", closeOnProtocolViolation="
            r0.append(r1)
            boolean r1 = r2.closeOnProtocolViolation
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
