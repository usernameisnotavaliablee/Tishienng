package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtocolCommandEvent extends java.util.EventObject {
    private static final long serialVersionUID = 403743538418947240L;
    private final java.lang.String __command;
    private final boolean __isCommand;
    private final java.lang.String __message;
    private final int __replyCode;

    public ProtocolCommandEvent(java.lang.Object r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.__replyCode = r2
            r0.__message = r3
            r1 = 0
            r0.__isCommand = r1
            r1 = 0
            r0.__command = r1
            return
    }

    public ProtocolCommandEvent(java.lang.Object r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.__replyCode = r1
            r0.__message = r3
            r1 = 1
            r0.__isCommand = r1
            r0.__command = r2
            return
    }

    public java.lang.String getCommand() {
            r1 = this;
            java.lang.String r0 = r1.__command
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.__message
            return r0
    }

    public int getReplyCode() {
            r1 = this;
            int r0 = r1.__replyCode
            return r0
    }

    public boolean isCommand() {
            r1 = this;
            boolean r0 = r1.__isCommand
            return r0
    }

    public boolean isReply() {
            r1 = this;
            boolean r0 = r1.isCommand()
            r0 = r0 ^ 1
            return r0
    }
}
