package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2Exception extends java.lang.Exception {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -6941186345430164209L;
    private final io.netty.handler.codec.http2.Http2Error error;
    private final io.netty.handler.codec.http2.Http2Exception.ShutdownHint shutdownHint;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ClosedStreamCreationException extends io.netty.handler.codec.http2.Http2Exception {
        private static final long serialVersionUID = -6746542974372246206L;

        public ClosedStreamCreationException(io.netty.handler.codec.http2.Http2Error r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ClosedStreamCreationException(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public ClosedStreamCreationException(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CompositeStreamException extends io.netty.handler.codec.http2.Http2Exception implements java.lang.Iterable<io.netty.handler.codec.http2.Http2Exception.StreamException> {
        private static final long serialVersionUID = 7091134858213711015L;
        private final java.util.List<io.netty.handler.codec.http2.Http2Exception.StreamException> exceptions;

        public CompositeStreamException(io.netty.handler.codec.http2.Http2Error r2, int r3) {
                r1 = this;
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.NO_SHUTDOWN
                r1.<init>(r2, r0)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r3)
                r1.exceptions = r2
                return
        }

        public void add(io.netty.handler.codec.http2.Http2Exception.StreamException r2) {
                r1 = this;
                java.util.List<io.netty.handler.codec.http2.Http2Exception$StreamException> r0 = r1.exceptions
                r0.add(r2)
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<io.netty.handler.codec.http2.Http2Exception.StreamException> iterator() {
                r1 = this;
                java.util.List<io.netty.handler.codec.http2.Http2Exception$StreamException> r0 = r1.exceptions
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HeaderListSizeException extends io.netty.handler.codec.http2.Http2Exception.StreamException {
        private static final long serialVersionUID = -8807603212183882637L;
        private final boolean decode;

        HeaderListSizeException(int r1, io.netty.handler.codec.http2.Http2Error r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.decode = r4
                return
        }

        public boolean duringDecode() {
                r1 = this;
                boolean r0 = r1.decode
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ShutdownHint extends java.lang.Enum<io.netty.handler.codec.http2.Http2Exception.ShutdownHint> {
        private static final /* synthetic */ io.netty.handler.codec.http2.Http2Exception.ShutdownHint[] $VALUES = null;
        public static final io.netty.handler.codec.http2.Http2Exception.ShutdownHint GRACEFUL_SHUTDOWN = null;
        public static final io.netty.handler.codec.http2.Http2Exception.ShutdownHint HARD_SHUTDOWN = null;
        public static final io.netty.handler.codec.http2.Http2Exception.ShutdownHint NO_SHUTDOWN = null;

        static {
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = new io.netty.handler.codec.http2.Http2Exception$ShutdownHint
                java.lang.String r1 = "NO_SHUTDOWN"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.Http2Exception.ShutdownHint.NO_SHUTDOWN = r0
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r1 = new io.netty.handler.codec.http2.Http2Exception$ShutdownHint
                java.lang.String r3 = "GRACEFUL_SHUTDOWN"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.Http2Exception.ShutdownHint.GRACEFUL_SHUTDOWN = r1
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r3 = new io.netty.handler.codec.http2.Http2Exception$ShutdownHint
                java.lang.String r5 = "HARD_SHUTDOWN"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http2.Http2Exception.ShutdownHint.HARD_SHUTDOWN = r3
                r5 = 3
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint[] r5 = new io.netty.handler.codec.http2.Http2Exception.ShutdownHint[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http2.Http2Exception.ShutdownHint.$VALUES = r5
                return
        }

        ShutdownHint(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.Http2Exception.ShutdownHint valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.Http2Exception$ShutdownHint> r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r1 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint) r1
                return r1
        }

        public static io.netty.handler.codec.http2.Http2Exception.ShutdownHint[] values() {
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint[] r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint[] r0 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class StreamException extends io.netty.handler.codec.http2.Http2Exception {
        private static final long serialVersionUID = 602472544416984384L;
        private final int streamId;

        StreamException(int r2, io.netty.handler.codec.http2.Http2Error r3, java.lang.String r4) {
                r1 = this;
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.NO_SHUTDOWN
                r1.<init>(r3, r4, r0)
                r1.streamId = r2
                return
        }

        StreamException(int r2, io.netty.handler.codec.http2.Http2Error r3, java.lang.String r4, java.lang.Throwable r5) {
                r1 = this;
                io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.NO_SHUTDOWN
                r1.<init>(r3, r4, r5, r0)
                r1.streamId = r2
                return
        }

        public int streamId() {
                r1 = this;
                int r0 = r1.streamId
                return r0
        }
    }

    static {
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.HARD_SHUTDOWN
            r1.<init>(r2, r0)
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r2, io.netty.handler.codec.http2.Http2Exception.ShutdownHint r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "error"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Error r2 = (io.netty.handler.codec.http2.Http2Error) r2
            r1.error = r2
            java.lang.String r2 = "shutdownHint"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r2 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint) r2
            r1.shutdownHint = r2
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r2, java.lang.String r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.HARD_SHUTDOWN
            r1.<init>(r2, r3, r0)
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2, io.netty.handler.codec.http2.Http2Exception.ShutdownHint r3) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r2 = "error"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            io.netty.handler.codec.http2.Http2Error r1 = (io.netty.handler.codec.http2.Http2Error) r1
            r0.error = r1
            java.lang.String r1 = "shutdownHint"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r1 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint) r1
            r0.shutdownHint = r1
            return
    }

    @io.netty.util.internal.SuppressJava6Requirement(reason = "uses Java 7+ Exception.<init>(String, Throwable, boolean, boolean) but is guarded by version checks")
    private Http2Exception(io.netty.handler.codec.http2.Http2Error r3, java.lang.String r4, io.netty.handler.codec.http2.Http2Exception.ShutdownHint r5, boolean r6) {
            r2 = this;
            r6 = 0
            r0 = 1
            r1 = 0
            r2.<init>(r4, r1, r6, r0)
            java.lang.String r4 = "error"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r4)
            io.netty.handler.codec.http2.Http2Error r3 = (io.netty.handler.codec.http2.Http2Error) r3
            r2.error = r3
            java.lang.String r3 = "shutdownHint"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r3)
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r3 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint) r3
            r2.shutdownHint = r3
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.HARD_SHUTDOWN
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Http2Exception(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2, java.lang.Throwable r3, io.netty.handler.codec.http2.Http2Exception.ShutdownHint r4) {
            r0 = this;
            r0.<init>(r2, r3)
            java.lang.String r2 = "error"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            io.netty.handler.codec.http2.Http2Error r1 = (io.netty.handler.codec.http2.Http2Error) r1
            r0.error = r1
            java.lang.String r1 = "shutdownHint"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r1 = (io.netty.handler.codec.http2.Http2Exception.ShutdownHint) r1
            r0.shutdownHint = r1
            return
    }

    public static io.netty.handler.codec.http2.Http2Exception closedStreamError(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2, java.lang.Object... r3) {
            io.netty.handler.codec.http2.Http2Exception$ClosedStreamCreationException r0 = new io.netty.handler.codec.http2.Http2Exception$ClosedStreamCreationException
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception connectionError(io.netty.handler.codec.http2.Http2Error r1, java.lang.String r2, java.lang.Object... r3) {
            io.netty.handler.codec.http2.Http2Exception r0 = new io.netty.handler.codec.http2.Http2Exception
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception connectionError(io.netty.handler.codec.http2.Http2Error r1, java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            io.netty.handler.codec.http2.Http2Exception r0 = new io.netty.handler.codec.http2.Http2Exception
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception headerListSizeError(int r1, io.netty.handler.codec.http2.Http2Error r2, boolean r3, java.lang.String r4, java.lang.Object... r5) {
            if (r1 != 0) goto L7
            io.netty.handler.codec.http2.Http2Exception r1 = connectionError(r2, r4, r5)
            return r1
        L7:
            io.netty.handler.codec.http2.Http2Exception$HeaderListSizeException r0 = new io.netty.handler.codec.http2.Http2Exception$HeaderListSizeException
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    public static boolean isStreamError(io.netty.handler.codec.http2.Http2Exception r0) {
            boolean r0 = r0 instanceof io.netty.handler.codec.http2.Http2Exception.StreamException
            return r0
    }

    static io.netty.handler.codec.http2.Http2Exception newStatic(io.netty.handler.codec.http2.Http2Error r2, java.lang.String r3, io.netty.handler.codec.http2.Http2Exception.ShutdownHint r4) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Le
            io.netty.handler.codec.http2.Http2Exception r0 = new io.netty.handler.codec.http2.Http2Exception
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
        Le:
            io.netty.handler.codec.http2.Http2Exception r0 = new io.netty.handler.codec.http2.Http2Exception
            r0.<init>(r2, r3, r4)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception streamError(int r1, io.netty.handler.codec.http2.Http2Error r2, java.lang.String r3, java.lang.Object... r4) {
            if (r1 != 0) goto L7
            io.netty.handler.codec.http2.Http2Exception r1 = connectionError(r2, r3, r4)
            return r1
        L7:
            io.netty.handler.codec.http2.Http2Exception$StreamException r0 = new io.netty.handler.codec.http2.Http2Exception$StreamException
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Exception streamError(int r1, io.netty.handler.codec.http2.Http2Error r2, java.lang.Throwable r3, java.lang.String r4, java.lang.Object... r5) {
            if (r1 != 0) goto L7
            io.netty.handler.codec.http2.Http2Exception r1 = connectionError(r2, r3, r4, r5)
            return r1
        L7:
            io.netty.handler.codec.http2.Http2Exception$StreamException r0 = new io.netty.handler.codec.http2.Http2Exception$StreamException
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    public static int streamId(io.netty.handler.codec.http2.Http2Exception r1) {
            boolean r0 = isStreamError(r1)
            if (r0 == 0) goto Ld
            io.netty.handler.codec.http2.Http2Exception$StreamException r1 = (io.netty.handler.codec.http2.Http2Exception.StreamException) r1
            int r1 = r1.streamId()
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public io.netty.handler.codec.http2.Http2Error error() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Error r0 = r1.error
            return r0
    }

    public io.netty.handler.codec.http2.Http2Exception.ShutdownHint shutdownHint() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = r1.shutdownHint
            return r0
    }
}
