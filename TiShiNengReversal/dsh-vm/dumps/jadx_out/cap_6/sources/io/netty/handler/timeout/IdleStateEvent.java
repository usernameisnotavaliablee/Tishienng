package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IdleStateEvent {
    public static final io.netty.handler.timeout.IdleStateEvent ALL_IDLE_STATE_EVENT = null;
    public static final io.netty.handler.timeout.IdleStateEvent FIRST_ALL_IDLE_STATE_EVENT = null;
    public static final io.netty.handler.timeout.IdleStateEvent FIRST_READER_IDLE_STATE_EVENT = null;
    public static final io.netty.handler.timeout.IdleStateEvent FIRST_WRITER_IDLE_STATE_EVENT = null;
    public static final io.netty.handler.timeout.IdleStateEvent READER_IDLE_STATE_EVENT = null;
    public static final io.netty.handler.timeout.IdleStateEvent WRITER_IDLE_STATE_EVENT = null;
    private final boolean first;
    private final io.netty.handler.timeout.IdleState state;

    static {
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.READER_IDLE
            r2 = 1
            r0.<init>(r1, r2)
            io.netty.handler.timeout.IdleStateEvent.FIRST_READER_IDLE_STATE_EVENT = r0
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            r3 = 0
            r0.<init>(r1, r3)
            io.netty.handler.timeout.IdleStateEvent.READER_IDLE_STATE_EVENT = r0
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.WRITER_IDLE
            r0.<init>(r1, r2)
            io.netty.handler.timeout.IdleStateEvent.FIRST_WRITER_IDLE_STATE_EVENT = r0
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            r0.<init>(r1, r3)
            io.netty.handler.timeout.IdleStateEvent.WRITER_IDLE_STATE_EVENT = r0
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            io.netty.handler.timeout.IdleState r1 = io.netty.handler.timeout.IdleState.ALL_IDLE
            r0.<init>(r1, r2)
            io.netty.handler.timeout.IdleStateEvent.FIRST_ALL_IDLE_STATE_EVENT = r0
            io.netty.handler.timeout.IdleStateEvent r0 = new io.netty.handler.timeout.IdleStateEvent
            r0.<init>(r1, r3)
            io.netty.handler.timeout.IdleStateEvent.ALL_IDLE_STATE_EVENT = r0
            return
    }

    protected IdleStateEvent(io.netty.handler.timeout.IdleState r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "state"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.timeout.IdleState r2 = (io.netty.handler.timeout.IdleState) r2
            r1.state = r2
            r1.first = r3
            return
    }

    public boolean isFirst() {
            r1 = this;
            boolean r0 = r1.first
            return r0
    }

    public io.netty.handler.timeout.IdleState state() {
            r1 = this;
            io.netty.handler.timeout.IdleState r0 = r1.state
            return r0
    }
}
