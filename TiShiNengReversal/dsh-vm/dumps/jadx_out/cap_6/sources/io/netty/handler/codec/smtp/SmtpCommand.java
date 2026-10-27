package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SmtpCommand {
    private static final java.util.Map<java.lang.String, io.netty.handler.codec.smtp.SmtpCommand> COMMANDS = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand DATA = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand EHLO = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand EXPN = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand HELO = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand HELP = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand MAIL = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand NOOP = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand QUIT = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand RCPT = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand RSET = null;
    public static final io.netty.handler.codec.smtp.SmtpCommand VRFY = null;
    private final io.netty.util.AsciiString name;

    static {
            io.netty.handler.codec.smtp.SmtpCommand r0 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r1 = "EHLO"
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r1)
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpCommand.EHLO = r0
            io.netty.handler.codec.smtp.SmtpCommand r1 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r2 = "HELO"
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.cached(r2)
            r1.<init>(r2)
            io.netty.handler.codec.smtp.SmtpCommand.HELO = r1
            io.netty.handler.codec.smtp.SmtpCommand r2 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r3 = "MAIL"
            io.netty.util.AsciiString r3 = io.netty.util.AsciiString.cached(r3)
            r2.<init>(r3)
            io.netty.handler.codec.smtp.SmtpCommand.MAIL = r2
            io.netty.handler.codec.smtp.SmtpCommand r3 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r4 = "RCPT"
            io.netty.util.AsciiString r4 = io.netty.util.AsciiString.cached(r4)
            r3.<init>(r4)
            io.netty.handler.codec.smtp.SmtpCommand.RCPT = r3
            io.netty.handler.codec.smtp.SmtpCommand r4 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r5 = "DATA"
            io.netty.util.AsciiString r5 = io.netty.util.AsciiString.cached(r5)
            r4.<init>(r5)
            io.netty.handler.codec.smtp.SmtpCommand.DATA = r4
            io.netty.handler.codec.smtp.SmtpCommand r5 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r6 = "NOOP"
            io.netty.util.AsciiString r6 = io.netty.util.AsciiString.cached(r6)
            r5.<init>(r6)
            io.netty.handler.codec.smtp.SmtpCommand.NOOP = r5
            io.netty.handler.codec.smtp.SmtpCommand r6 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r7 = "RSET"
            io.netty.util.AsciiString r7 = io.netty.util.AsciiString.cached(r7)
            r6.<init>(r7)
            io.netty.handler.codec.smtp.SmtpCommand.RSET = r6
            io.netty.handler.codec.smtp.SmtpCommand r7 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r8 = "EXPN"
            io.netty.util.AsciiString r8 = io.netty.util.AsciiString.cached(r8)
            r7.<init>(r8)
            io.netty.handler.codec.smtp.SmtpCommand.EXPN = r7
            io.netty.handler.codec.smtp.SmtpCommand r8 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r9 = "VRFY"
            io.netty.util.AsciiString r9 = io.netty.util.AsciiString.cached(r9)
            r8.<init>(r9)
            io.netty.handler.codec.smtp.SmtpCommand.VRFY = r8
            io.netty.handler.codec.smtp.SmtpCommand r9 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r10 = "HELP"
            io.netty.util.AsciiString r10 = io.netty.util.AsciiString.cached(r10)
            r9.<init>(r10)
            io.netty.handler.codec.smtp.SmtpCommand.HELP = r9
            io.netty.handler.codec.smtp.SmtpCommand r10 = new io.netty.handler.codec.smtp.SmtpCommand
            java.lang.String r11 = "QUIT"
            io.netty.util.AsciiString r11 = io.netty.util.AsciiString.cached(r11)
            r10.<init>(r11)
            io.netty.handler.codec.smtp.SmtpCommand.QUIT = r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            io.netty.handler.codec.smtp.SmtpCommand.COMMANDS = r11
            io.netty.util.AsciiString r12 = r0.name()
            java.lang.String r12 = r12.toString()
            r11.put(r12, r0)
            io.netty.util.AsciiString r0 = r1.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r1)
            io.netty.util.AsciiString r0 = r2.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r2)
            io.netty.util.AsciiString r0 = r3.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r3)
            io.netty.util.AsciiString r0 = r4.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r4)
            io.netty.util.AsciiString r0 = r5.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r5)
            io.netty.util.AsciiString r0 = r6.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r6)
            io.netty.util.AsciiString r0 = r7.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r7)
            io.netty.util.AsciiString r0 = r8.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r8)
            io.netty.util.AsciiString r0 = r9.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r9)
            io.netty.util.AsciiString r0 = r10.name()
            java.lang.String r0 = r0.toString()
            r11.put(r0, r10)
            return
    }

    private SmtpCommand(io.netty.util.AsciiString r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    public static io.netty.handler.codec.smtp.SmtpCommand valueOf(java.lang.CharSequence r2) {
            java.lang.String r0 = "commandName"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.Map<java.lang.String, io.netty.handler.codec.smtp.SmtpCommand> r0 = io.netty.handler.codec.smtp.SmtpCommand.COMMANDS
            java.lang.String r1 = r2.toString()
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.smtp.SmtpCommand r0 = (io.netty.handler.codec.smtp.SmtpCommand) r0
            if (r0 == 0) goto L14
            return r0
        L14:
            io.netty.handler.codec.smtp.SmtpCommand r0 = new io.netty.handler.codec.smtp.SmtpCommand
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.of(r2)
            r0.<init>(r2)
            return r0
    }

    void encode(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            io.netty.buffer.ByteBufUtil.writeAscii(r2, r0)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.handler.codec.smtp.SmtpCommand
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            io.netty.util.AsciiString r0 = r1.name
            io.netty.handler.codec.smtp.SmtpCommand r2 = (io.netty.handler.codec.smtp.SmtpCommand) r2
            io.netty.util.AsciiString r2 = r2.name()
            boolean r2 = r0.contentEqualsIgnoreCase(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            int r0 = r0.hashCode()
            return r0
    }

    boolean isContentExpected() {
            r1 = this;
            io.netty.handler.codec.smtp.SmtpCommand r0 = io.netty.handler.codec.smtp.SmtpCommand.DATA
            boolean r0 = r1.equals(r0)
            return r0
    }

    public io.netty.util.AsciiString name() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.name
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SmtpCommand{name="
            r0.append(r1)
            io.netty.util.AsciiString r1 = r2.name
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
