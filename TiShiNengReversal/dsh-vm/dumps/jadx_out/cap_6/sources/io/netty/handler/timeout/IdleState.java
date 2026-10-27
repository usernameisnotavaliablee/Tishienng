package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum IdleState extends java.lang.Enum<io.netty.handler.timeout.IdleState> {
    private static final /* synthetic */ io.netty.handler.timeout.IdleState[] $VALUES = null;
    public static final io.netty.handler.timeout.IdleState ALL_IDLE = null;
    public static final io.netty.handler.timeout.IdleState READER_IDLE = null;
    public static final io.netty.handler.timeout.IdleState WRITER_IDLE = null;

    static {
            io.netty.handler.timeout.IdleState r0 = new io.netty.handler.timeout.IdleState
            java.lang.String r1 = "READER_IDLE"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.timeout.IdleState.READER_IDLE = r0
            io.netty.handler.timeout.IdleState r1 = new io.netty.handler.timeout.IdleState
            java.lang.String r3 = "WRITER_IDLE"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.timeout.IdleState.WRITER_IDLE = r1
            io.netty.handler.timeout.IdleState r3 = new io.netty.handler.timeout.IdleState
            java.lang.String r5 = "ALL_IDLE"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.timeout.IdleState.ALL_IDLE = r3
            r5 = 3
            io.netty.handler.timeout.IdleState[] r5 = new io.netty.handler.timeout.IdleState[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.netty.handler.timeout.IdleState.$VALUES = r5
            return
    }

    IdleState(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.timeout.IdleState valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.timeout.IdleState> r0 = io.netty.handler.timeout.IdleState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.timeout.IdleState r1 = (io.netty.handler.timeout.IdleState) r1
            return r1
    }

    public static io.netty.handler.timeout.IdleState[] values() {
            io.netty.handler.timeout.IdleState[] r0 = io.netty.handler.timeout.IdleState.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.timeout.IdleState[] r0 = (io.netty.handler.timeout.IdleState[]) r0
            return r0
    }
}
