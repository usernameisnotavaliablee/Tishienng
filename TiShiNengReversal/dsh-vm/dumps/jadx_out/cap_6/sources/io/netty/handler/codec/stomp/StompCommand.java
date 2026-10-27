package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum StompCommand extends java.lang.Enum<io.netty.handler.codec.stomp.StompCommand> {
    private static final /* synthetic */ io.netty.handler.codec.stomp.StompCommand[] $VALUES = null;
    public static final io.netty.handler.codec.stomp.StompCommand ACK = null;
    public static final io.netty.handler.codec.stomp.StompCommand BEGIN = null;
    public static final io.netty.handler.codec.stomp.StompCommand CONNECT = null;
    public static final io.netty.handler.codec.stomp.StompCommand CONNECTED = null;
    public static final io.netty.handler.codec.stomp.StompCommand DISCONNECT = null;
    public static final io.netty.handler.codec.stomp.StompCommand ERROR = null;
    public static final io.netty.handler.codec.stomp.StompCommand MESSAGE = null;
    public static final io.netty.handler.codec.stomp.StompCommand NACK = null;
    public static final io.netty.handler.codec.stomp.StompCommand RECEIPT = null;
    public static final io.netty.handler.codec.stomp.StompCommand SEND = null;
    public static final io.netty.handler.codec.stomp.StompCommand STOMP = null;
    public static final io.netty.handler.codec.stomp.StompCommand SUBSCRIBE = null;
    public static final io.netty.handler.codec.stomp.StompCommand UNKNOWN = null;
    public static final io.netty.handler.codec.stomp.StompCommand UNSUBSCRIBE = null;

    static {
            io.netty.handler.codec.stomp.StompCommand r0 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r1 = "STOMP"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.stomp.StompCommand.STOMP = r0
            io.netty.handler.codec.stomp.StompCommand r1 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r3 = "CONNECT"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.stomp.StompCommand.CONNECT = r1
            io.netty.handler.codec.stomp.StompCommand r3 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r5 = "CONNECTED"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.stomp.StompCommand.CONNECTED = r3
            io.netty.handler.codec.stomp.StompCommand r5 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r7 = "SEND"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.handler.codec.stomp.StompCommand.SEND = r5
            io.netty.handler.codec.stomp.StompCommand r7 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r9 = "SUBSCRIBE"
            r10 = 4
            r7.<init>(r9, r10)
            io.netty.handler.codec.stomp.StompCommand.SUBSCRIBE = r7
            io.netty.handler.codec.stomp.StompCommand r9 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r11 = "UNSUBSCRIBE"
            r12 = 5
            r9.<init>(r11, r12)
            io.netty.handler.codec.stomp.StompCommand.UNSUBSCRIBE = r9
            io.netty.handler.codec.stomp.StompCommand r11 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r13 = "ACK"
            r14 = 6
            r11.<init>(r13, r14)
            io.netty.handler.codec.stomp.StompCommand.ACK = r11
            io.netty.handler.codec.stomp.StompCommand r13 = new io.netty.handler.codec.stomp.StompCommand
            java.lang.String r15 = "NACK"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            io.netty.handler.codec.stomp.StompCommand.NACK = r13
            io.netty.handler.codec.stomp.StompCommand r15 = new io.netty.handler.codec.stomp.StompCommand
            r17 = 7
            java.lang.String r2 = "BEGIN"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            io.netty.handler.codec.stomp.StompCommand.BEGIN = r15
            io.netty.handler.codec.stomp.StompCommand r2 = new io.netty.handler.codec.stomp.StompCommand
            r19 = 8
            java.lang.String r4 = "DISCONNECT"
            r20 = 2
            r6 = 9
            r2.<init>(r4, r6)
            io.netty.handler.codec.stomp.StompCommand.DISCONNECT = r2
            io.netty.handler.codec.stomp.StompCommand r4 = new io.netty.handler.codec.stomp.StompCommand
            r21 = 9
            java.lang.String r6 = "MESSAGE"
            r22 = 3
            r8 = 10
            r4.<init>(r6, r8)
            io.netty.handler.codec.stomp.StompCommand.MESSAGE = r4
            io.netty.handler.codec.stomp.StompCommand r6 = new io.netty.handler.codec.stomp.StompCommand
            r23 = 10
            java.lang.String r8 = "RECEIPT"
            r24 = 4
            r10 = 11
            r6.<init>(r8, r10)
            io.netty.handler.codec.stomp.StompCommand.RECEIPT = r6
            io.netty.handler.codec.stomp.StompCommand r8 = new io.netty.handler.codec.stomp.StompCommand
            r25 = 11
            java.lang.String r10 = "ERROR"
            r26 = 5
            r12 = 12
            r8.<init>(r10, r12)
            io.netty.handler.codec.stomp.StompCommand.ERROR = r8
            io.netty.handler.codec.stomp.StompCommand r10 = new io.netty.handler.codec.stomp.StompCommand
            r27 = 12
            java.lang.String r12 = "UNKNOWN"
            r28 = 6
            r14 = 13
            r10.<init>(r12, r14)
            io.netty.handler.codec.stomp.StompCommand.UNKNOWN = r10
            r12 = 14
            io.netty.handler.codec.stomp.StompCommand[] r12 = new io.netty.handler.codec.stomp.StompCommand[r12]
            r12[r16] = r0
            r12[r18] = r1
            r12[r20] = r3
            r12[r22] = r5
            r12[r24] = r7
            r12[r26] = r9
            r12[r28] = r11
            r12[r17] = r13
            r12[r19] = r15
            r12[r21] = r2
            r12[r23] = r4
            r12[r25] = r6
            r12[r27] = r8
            r12[r14] = r10
            io.netty.handler.codec.stomp.StompCommand.$VALUES = r12
            return
    }

    StompCommand(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.stomp.StompCommand valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.stomp.StompCommand> r0 = io.netty.handler.codec.stomp.StompCommand.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.stomp.StompCommand r1 = (io.netty.handler.codec.stomp.StompCommand) r1
            return r1
    }

    public static io.netty.handler.codec.stomp.StompCommand[] values() {
            io.netty.handler.codec.stomp.StompCommand[] r0 = io.netty.handler.codec.stomp.StompCommand.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.stomp.StompCommand[] r0 = (io.netty.handler.codec.stomp.StompCommand[]) r0
            return r0
    }
}
