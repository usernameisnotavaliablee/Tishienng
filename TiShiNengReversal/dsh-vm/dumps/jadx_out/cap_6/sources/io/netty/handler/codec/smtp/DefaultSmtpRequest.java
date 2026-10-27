package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultSmtpRequest implements io.netty.handler.codec.smtp.SmtpRequest {
    private final io.netty.handler.codec.smtp.SmtpCommand command;
    private final java.util.List<java.lang.CharSequence> parameters;

    public DefaultSmtpRequest(io.netty.handler.codec.smtp.SmtpCommand r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "command"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.smtp.SmtpCommand r2 = (io.netty.handler.codec.smtp.SmtpCommand) r2
            r1.command = r2
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r1.parameters = r2
            return
    }

    DefaultSmtpRequest(io.netty.handler.codec.smtp.SmtpCommand r2, java.util.List<java.lang.CharSequence> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "command"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.smtp.SmtpCommand r2 = (io.netty.handler.codec.smtp.SmtpCommand) r2
            r1.command = r2
            if (r3 == 0) goto L14
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            goto L16
        L14:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
        L16:
            r1.parameters = r2
            return
    }

    public DefaultSmtpRequest(io.netty.handler.codec.smtp.SmtpCommand r2, java.lang.CharSequence... r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "command"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.smtp.SmtpCommand r2 = (io.netty.handler.codec.smtp.SmtpCommand) r2
            r1.command = r2
            java.util.List r2 = io.netty.handler.codec.smtp.SmtpUtils.toUnmodifiableList(r3)
            r1.parameters = r2
            return
    }

    public DefaultSmtpRequest(java.lang.CharSequence r1, java.lang.CharSequence... r2) {
            r0 = this;
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.valueOf(r1)
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.smtp.SmtpRequest
    public io.netty.handler.codec.smtp.SmtpCommand command() {
            r1 = this;
            io.netty.handler.codec.smtp.SmtpCommand r0 = r1.command
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.smtp.DefaultSmtpRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            io.netty.handler.codec.smtp.DefaultSmtpRequest r5 = (io.netty.handler.codec.smtp.DefaultSmtpRequest) r5
            io.netty.handler.codec.smtp.SmtpCommand r2 = r4.command()
            io.netty.handler.codec.smtp.SmtpCommand r3 = r5.command()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.util.List r2 = r4.parameters()
            java.util.List r5 = r5.parameters()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L29
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r2 = this;
            io.netty.handler.codec.smtp.SmtpCommand r0 = r2.command
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.CharSequence> r1 = r2.parameters
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.smtp.SmtpRequest
    public java.util.List<java.lang.CharSequence> parameters() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.parameters
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultSmtpRequest{command="
            r0.append(r1)
            io.netty.handler.codec.smtp.SmtpCommand r1 = r2.command
            r0.append(r1)
            java.lang.String r1 = ", parameters="
            r0.append(r1)
            java.util.List<java.lang.CharSequence> r1 = r2.parameters
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
