package io.netty.handler.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum LogLevel extends java.lang.Enum<io.netty.handler.logging.LogLevel> {
    private static final /* synthetic */ io.netty.handler.logging.LogLevel[] $VALUES = null;
    public static final io.netty.handler.logging.LogLevel DEBUG = null;
    public static final io.netty.handler.logging.LogLevel ERROR = null;
    public static final io.netty.handler.logging.LogLevel INFO = null;
    public static final io.netty.handler.logging.LogLevel TRACE = null;
    public static final io.netty.handler.logging.LogLevel WARN = null;
    private final io.netty.util.internal.logging.InternalLogLevel internalLevel;

    static {
            io.netty.handler.logging.LogLevel r0 = new io.netty.handler.logging.LogLevel
            io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.TRACE
            java.lang.String r2 = "TRACE"
            r3 = 0
            r0.<init>(r2, r3, r1)
            io.netty.handler.logging.LogLevel.TRACE = r0
            io.netty.handler.logging.LogLevel r1 = new io.netty.handler.logging.LogLevel
            io.netty.util.internal.logging.InternalLogLevel r2 = io.netty.util.internal.logging.InternalLogLevel.DEBUG
            java.lang.String r4 = "DEBUG"
            r5 = 1
            r1.<init>(r4, r5, r2)
            io.netty.handler.logging.LogLevel.DEBUG = r1
            io.netty.handler.logging.LogLevel r2 = new io.netty.handler.logging.LogLevel
            io.netty.util.internal.logging.InternalLogLevel r4 = io.netty.util.internal.logging.InternalLogLevel.INFO
            java.lang.String r6 = "INFO"
            r7 = 2
            r2.<init>(r6, r7, r4)
            io.netty.handler.logging.LogLevel.INFO = r2
            io.netty.handler.logging.LogLevel r4 = new io.netty.handler.logging.LogLevel
            io.netty.util.internal.logging.InternalLogLevel r6 = io.netty.util.internal.logging.InternalLogLevel.WARN
            java.lang.String r8 = "WARN"
            r9 = 3
            r4.<init>(r8, r9, r6)
            io.netty.handler.logging.LogLevel.WARN = r4
            io.netty.handler.logging.LogLevel r6 = new io.netty.handler.logging.LogLevel
            io.netty.util.internal.logging.InternalLogLevel r8 = io.netty.util.internal.logging.InternalLogLevel.ERROR
            java.lang.String r10 = "ERROR"
            r11 = 4
            r6.<init>(r10, r11, r8)
            io.netty.handler.logging.LogLevel.ERROR = r6
            r8 = 5
            io.netty.handler.logging.LogLevel[] r8 = new io.netty.handler.logging.LogLevel[r8]
            r8[r3] = r0
            r8[r5] = r1
            r8[r7] = r2
            r8[r9] = r4
            r8[r11] = r6
            io.netty.handler.logging.LogLevel.$VALUES = r8
            return
    }

    LogLevel(java.lang.String r1, int r2, io.netty.util.internal.logging.InternalLogLevel r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.internalLevel = r3
            return
    }

    public static io.netty.handler.logging.LogLevel valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.logging.LogLevel> r0 = io.netty.handler.logging.LogLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.logging.LogLevel r1 = (io.netty.handler.logging.LogLevel) r1
            return r1
    }

    public static io.netty.handler.logging.LogLevel[] values() {
            io.netty.handler.logging.LogLevel[] r0 = io.netty.handler.logging.LogLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.logging.LogLevel[] r0 = (io.netty.handler.logging.LogLevel[]) r0
            return r0
    }

    public io.netty.util.internal.logging.InternalLogLevel toInternalLevel() {
            r1 = this;
            io.netty.util.internal.logging.InternalLogLevel r0 = r1.internalLevel
            return r0
    }
}
