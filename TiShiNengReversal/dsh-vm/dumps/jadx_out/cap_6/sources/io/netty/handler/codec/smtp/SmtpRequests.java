package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SmtpRequests {
    private static final io.netty.handler.codec.smtp.SmtpRequest DATA = null;
    private static final io.netty.util.AsciiString FROM_NULL_SENDER = null;
    private static final io.netty.handler.codec.smtp.SmtpRequest HELP_NO_ARG = null;
    private static final io.netty.handler.codec.smtp.SmtpRequest NOOP = null;
    private static final io.netty.handler.codec.smtp.SmtpRequest QUIT = null;
    private static final io.netty.handler.codec.smtp.SmtpRequest RSET = null;

    static {
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.DATA
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpRequests.DATA = r0
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.NOOP
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpRequests.NOOP = r0
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.RSET
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpRequests.RSET = r0
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.HELP
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpRequests.HELP_NO_ARG = r0
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.QUIT
            r0.<init>(r1)
            io.netty.handler.codec.smtp.SmtpRequests.QUIT = r0
            java.lang.String r0 = "FROM:<>"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.smtp.SmtpRequests.FROM_NULL_SENDER = r0
            return
    }

    private SmtpRequests() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.smtp.SmtpRequest data() {
            io.netty.handler.codec.smtp.SmtpRequest r0 = io.netty.handler.codec.smtp.SmtpRequests.DATA
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest ehlo(java.lang.CharSequence r4) {
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.EHLO
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r4
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest expn(java.lang.CharSequence r4) {
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.EXPN
            java.lang.String r2 = "mailingList"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r4
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest helo(java.lang.CharSequence r4) {
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.HELO
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r4
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest help(java.lang.String r4) {
            if (r4 != 0) goto L5
            io.netty.handler.codec.smtp.SmtpRequest r4 = io.netty.handler.codec.smtp.SmtpRequests.HELP_NO_ARG
            return r4
        L5:
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.HELP
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r4
            r0.<init>(r1, r2)
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest mail(java.lang.CharSequence r5, java.lang.CharSequence... r6) {
            r0 = 62
            java.lang.String r1 = "FROM:<"
            r2 = 1
            if (r6 == 0) goto L37
            int r3 = r6.length
            if (r3 != 0) goto Lb
            goto L37
        Lb:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.length
            int r4 = r4 + r2
            r3.<init>(r4)
            if (r5 == 0) goto L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L29
        L27:
            io.netty.util.AsciiString r5 = io.netty.handler.codec.smtp.SmtpRequests.FROM_NULL_SENDER
        L29:
            r3.add(r5)
            java.util.Collections.addAll(r3, r6)
            io.netty.handler.codec.smtp.DefaultSmtpRequest r5 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r6 = io.netty.handler.codec.smtp.SmtpCommand.MAIL
            r5.<init>(r6, r3)
            return r5
        L37:
            io.netty.handler.codec.smtp.DefaultSmtpRequest r6 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r3 = io.netty.handler.codec.smtp.SmtpCommand.MAIL
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            if (r5 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            goto L54
        L52:
            io.netty.util.AsciiString r5 = io.netty.handler.codec.smtp.SmtpRequests.FROM_NULL_SENDER
        L54:
            r0 = 0
            r2[r0] = r5
            r6.<init>(r3, r2)
            return r6
    }

    public static io.netty.handler.codec.smtp.SmtpRequest noop() {
            io.netty.handler.codec.smtp.SmtpRequest r0 = io.netty.handler.codec.smtp.SmtpRequests.NOOP
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest quit() {
            io.netty.handler.codec.smtp.SmtpRequest r0 = io.netty.handler.codec.smtp.SmtpRequests.QUIT
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest rcpt(java.lang.CharSequence r5, java.lang.CharSequence... r6) {
            java.lang.String r0 = "recipient"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            r0 = 1
            r1 = 62
            java.lang.String r2 = "TO:<"
            if (r6 == 0) goto L37
            int r3 = r6.length
            if (r3 != 0) goto L10
            goto L37
        L10:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.length
            int r4 = r4 + r0
            r3.<init>(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            r3.add(r5)
            java.util.Collections.addAll(r3, r6)
            io.netty.handler.codec.smtp.DefaultSmtpRequest r5 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r6 = io.netty.handler.codec.smtp.SmtpCommand.RCPT
            r5.<init>(r6, r3)
            return r5
        L37:
            io.netty.handler.codec.smtp.DefaultSmtpRequest r6 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r3 = io.netty.handler.codec.smtp.SmtpCommand.RCPT
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = r4.toString()
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r1 = 0
            r0[r1] = r5
            r6.<init>(r3, r0)
            return r6
    }

    public static io.netty.handler.codec.smtp.SmtpRequest rset() {
            io.netty.handler.codec.smtp.SmtpRequest r0 = io.netty.handler.codec.smtp.SmtpRequests.RSET
            return r0
    }

    public static io.netty.handler.codec.smtp.SmtpRequest vrfy(java.lang.CharSequence r4) {
            io.netty.handler.codec.smtp.DefaultSmtpRequest r0 = new io.netty.handler.codec.smtp.DefaultSmtpRequest
            io.netty.handler.codec.smtp.SmtpCommand r1 = io.netty.handler.codec.smtp.SmtpCommand.VRFY
            java.lang.String r2 = "user"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r4
            r0.<init>(r1, r2)
            return r0
    }
}
