package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum ProtocolDetectionState extends java.lang.Enum<io.netty.handler.codec.ProtocolDetectionState> {
    private static final /* synthetic */ io.netty.handler.codec.ProtocolDetectionState[] $VALUES = null;
    public static final io.netty.handler.codec.ProtocolDetectionState DETECTED = null;
    public static final io.netty.handler.codec.ProtocolDetectionState INVALID = null;
    public static final io.netty.handler.codec.ProtocolDetectionState NEEDS_MORE_DATA = null;

    static {
            io.netty.handler.codec.ProtocolDetectionState r0 = new io.netty.handler.codec.ProtocolDetectionState
            java.lang.String r1 = "NEEDS_MORE_DATA"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.ProtocolDetectionState.NEEDS_MORE_DATA = r0
            io.netty.handler.codec.ProtocolDetectionState r1 = new io.netty.handler.codec.ProtocolDetectionState
            java.lang.String r3 = "INVALID"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.ProtocolDetectionState.INVALID = r1
            io.netty.handler.codec.ProtocolDetectionState r3 = new io.netty.handler.codec.ProtocolDetectionState
            java.lang.String r5 = "DETECTED"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.ProtocolDetectionState.DETECTED = r3
            r5 = 3
            io.netty.handler.codec.ProtocolDetectionState[] r5 = new io.netty.handler.codec.ProtocolDetectionState[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.netty.handler.codec.ProtocolDetectionState.$VALUES = r5
            return
    }

    ProtocolDetectionState(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.ProtocolDetectionState valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.ProtocolDetectionState> r0 = io.netty.handler.codec.ProtocolDetectionState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.ProtocolDetectionState r1 = (io.netty.handler.codec.ProtocolDetectionState) r1
            return r1
    }

    public static io.netty.handler.codec.ProtocolDetectionState[] values() {
            io.netty.handler.codec.ProtocolDetectionState[] r0 = io.netty.handler.codec.ProtocolDetectionState.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.ProtocolDetectionState[] r0 = (io.netty.handler.codec.ProtocolDetectionState[]) r0
            return r0
    }
}
