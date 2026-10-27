package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum InternalLogLevel extends java.lang.Enum<io.netty.util.internal.logging.InternalLogLevel> {
    private static final /* synthetic */ io.netty.util.internal.logging.InternalLogLevel[] $VALUES = null;
    public static final io.netty.util.internal.logging.InternalLogLevel DEBUG = null;
    public static final io.netty.util.internal.logging.InternalLogLevel ERROR = null;
    public static final io.netty.util.internal.logging.InternalLogLevel INFO = null;
    public static final io.netty.util.internal.logging.InternalLogLevel TRACE = null;
    public static final io.netty.util.internal.logging.InternalLogLevel WARN = null;

    static {
            io.netty.util.internal.logging.InternalLogLevel r0 = new io.netty.util.internal.logging.InternalLogLevel
            java.lang.String r1 = "TRACE"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.util.internal.logging.InternalLogLevel.TRACE = r0
            io.netty.util.internal.logging.InternalLogLevel r1 = new io.netty.util.internal.logging.InternalLogLevel
            java.lang.String r3 = "DEBUG"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.util.internal.logging.InternalLogLevel.DEBUG = r1
            io.netty.util.internal.logging.InternalLogLevel r3 = new io.netty.util.internal.logging.InternalLogLevel
            java.lang.String r5 = "INFO"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.util.internal.logging.InternalLogLevel.INFO = r3
            io.netty.util.internal.logging.InternalLogLevel r5 = new io.netty.util.internal.logging.InternalLogLevel
            java.lang.String r7 = "WARN"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.util.internal.logging.InternalLogLevel.WARN = r5
            io.netty.util.internal.logging.InternalLogLevel r7 = new io.netty.util.internal.logging.InternalLogLevel
            java.lang.String r9 = "ERROR"
            r10 = 4
            r7.<init>(r9, r10)
            io.netty.util.internal.logging.InternalLogLevel.ERROR = r7
            r9 = 5
            io.netty.util.internal.logging.InternalLogLevel[] r9 = new io.netty.util.internal.logging.InternalLogLevel[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            io.netty.util.internal.logging.InternalLogLevel.$VALUES = r9
            return
    }

    InternalLogLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.util.internal.logging.InternalLogLevel valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.util.internal.logging.InternalLogLevel> r0 = io.netty.util.internal.logging.InternalLogLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.util.internal.logging.InternalLogLevel r1 = (io.netty.util.internal.logging.InternalLogLevel) r1
            return r1
    }

    public static io.netty.util.internal.logging.InternalLogLevel[] values() {
            io.netty.util.internal.logging.InternalLogLevel[] r0 = io.netty.util.internal.logging.InternalLogLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.util.internal.logging.InternalLogLevel[] r0 = (io.netty.util.internal.logging.InternalLogLevel[]) r0
            return r0
    }
}
