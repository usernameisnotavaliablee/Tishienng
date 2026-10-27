package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2FrameStreamEvent {
    private final io.netty.handler.codec.http2.Http2FrameStream stream;
    private final io.netty.handler.codec.http2.Http2FrameStreamEvent.Type type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Type extends java.lang.Enum<io.netty.handler.codec.http2.Http2FrameStreamEvent.Type> {
        private static final /* synthetic */ io.netty.handler.codec.http2.Http2FrameStreamEvent.Type[] $VALUES = null;
        public static final io.netty.handler.codec.http2.Http2FrameStreamEvent.Type State = null;
        public static final io.netty.handler.codec.http2.Http2FrameStreamEvent.Type Writability = null;

        static {
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r0 = new io.netty.handler.codec.http2.Http2FrameStreamEvent$Type
                java.lang.String r1 = "State"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.State = r0
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r1 = new io.netty.handler.codec.http2.Http2FrameStreamEvent$Type
                java.lang.String r3 = "Writability"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.Writability = r1
                r3 = 2
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type[] r3 = new io.netty.handler.codec.http2.Http2FrameStreamEvent.Type[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.$VALUES = r3
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.Http2FrameStreamEvent.Type valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.Http2FrameStreamEvent$Type> r0 = io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r1 = (io.netty.handler.codec.http2.Http2FrameStreamEvent.Type) r1
                return r1
        }

        public static io.netty.handler.codec.http2.Http2FrameStreamEvent.Type[] values() {
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type[] r0 = io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.Http2FrameStreamEvent$Type[] r0 = (io.netty.handler.codec.http2.Http2FrameStreamEvent.Type[]) r0
                return r0
        }
    }

    private Http2FrameStreamEvent(io.netty.handler.codec.http2.Http2FrameStream r1, io.netty.handler.codec.http2.Http2FrameStreamEvent.Type r2) {
            r0 = this;
            r0.<init>()
            r0.stream = r1
            r0.type = r2
            return
    }

    static io.netty.handler.codec.http2.Http2FrameStreamEvent stateChanged(io.netty.handler.codec.http2.Http2FrameStream r2) {
            io.netty.handler.codec.http2.Http2FrameStreamEvent r0 = new io.netty.handler.codec.http2.Http2FrameStreamEvent
            io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r1 = io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.State
            r0.<init>(r2, r1)
            return r0
    }

    static io.netty.handler.codec.http2.Http2FrameStreamEvent writabilityChanged(io.netty.handler.codec.http2.Http2FrameStream r2) {
            io.netty.handler.codec.http2.Http2FrameStreamEvent r0 = new io.netty.handler.codec.http2.Http2FrameStreamEvent
            io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r1 = io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.Writability
            r0.<init>(r2, r1)
            return r0
    }

    public io.netty.handler.codec.http2.Http2FrameStream stream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r1.stream
            return r0
    }

    public io.netty.handler.codec.http2.Http2FrameStreamEvent.Type type() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r0 = r1.type
            return r0
    }
}
