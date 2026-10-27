package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SctpMessage extends io.netty.buffer.DefaultByteBufHolder {
    private final com.sun.nio.sctp.MessageInfo msgInfo;
    private final int protocolIdentifier;
    private final int streamIdentifier;
    private final boolean unordered;

    public SctpMessage(int r2, int r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public SctpMessage(int r1, int r2, boolean r3, io.netty.buffer.ByteBuf r4) {
            r0 = this;
            r0.<init>(r4)
            r0.protocolIdentifier = r1
            r0.streamIdentifier = r2
            r0.unordered = r3
            r1 = 0
            r0.msgInfo = r1
            return
    }

    public SctpMessage(com.sun.nio.sctp.MessageInfo r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 == 0) goto L1a
            r0.msgInfo = r1
            int r2 = r1.streamNumber()
            r0.streamIdentifier = r2
            int r2 = r1.payloadProtocolID()
            r0.protocolIdentifier = r2
            boolean r1 = r1.isUnordered()
            r0.unordered = r1
            return
        L1a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "msgInfo"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.sctp.SctpMessage copy() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.copy()
            io.netty.channel.sctp.SctpMessage r0 = (io.netty.channel.sctp.SctpMessage) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.sctp.SctpMessage duplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.duplicate()
            io.netty.channel.sctp.SctpMessage r0 = (io.netty.channel.sctp.SctpMessage) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L34
            java.lang.Class<io.netty.channel.sctp.SctpMessage> r1 = io.netty.channel.sctp.SctpMessage.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L34
        L10:
            io.netty.channel.sctp.SctpMessage r4 = (io.netty.channel.sctp.SctpMessage) r4
            int r1 = r3.protocolIdentifier
            int r2 = r4.protocolIdentifier
            if (r1 == r2) goto L19
            return r0
        L19:
            int r1 = r3.streamIdentifier
            int r2 = r4.streamIdentifier
            if (r1 == r2) goto L20
            return r0
        L20:
            boolean r1 = r3.unordered
            boolean r2 = r4.unordered
            if (r1 == r2) goto L27
            return r0
        L27:
            io.netty.buffer.ByteBuf r0 = r3.content()
            io.netty.buffer.ByteBuf r4 = r4.content()
            boolean r4 = r0.equals(r4)
            return r4
        L34:
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public int hashCode() {
            r2 = this;
            int r0 = r2.streamIdentifier
            int r0 = r0 * 31
            int r1 = r2.protocolIdentifier
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.unordered
            if (r1 == 0) goto L10
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L12
        L10:
            r1 = 1237(0x4d5, float:1.733E-42)
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            io.netty.buffer.ByteBuf r1 = r2.content()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean isComplete() {
            r1 = this;
            com.sun.nio.sctp.MessageInfo r0 = r1.msgInfo
            if (r0 == 0) goto L9
            boolean r0 = r0.isComplete()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public boolean isUnordered() {
            r1 = this;
            boolean r0 = r1.unordered
            return r0
    }

    public com.sun.nio.sctp.MessageInfo messageInfo() {
            r1 = this;
            com.sun.nio.sctp.MessageInfo r0 = r1.msgInfo
            return r0
    }

    public int protocolIdentifier() {
            r1 = this;
            int r0 = r1.protocolIdentifier
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.sctp.SctpMessage replace(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            com.sun.nio.sctp.MessageInfo r0 = r4.msgInfo
            if (r0 != 0) goto L10
            io.netty.channel.sctp.SctpMessage r0 = new io.netty.channel.sctp.SctpMessage
            int r1 = r4.protocolIdentifier
            int r2 = r4.streamIdentifier
            boolean r3 = r4.unordered
            r0.<init>(r1, r2, r3, r5)
            return r0
        L10:
            io.netty.channel.sctp.SctpMessage r1 = new io.netty.channel.sctp.SctpMessage
            r1.<init>(r0, r5)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.channel.sctp.SctpMessage mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.channel.sctp.SctpMessage mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.sctp.SctpMessage retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.retainedDuplicate()
            io.netty.channel.sctp.SctpMessage r0 = (io.netty.channel.sctp.SctpMessage) r0
            return r0
    }

    public int streamIdentifier() {
            r1 = this;
            int r0 = r1.streamIdentifier
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SctpFrame{streamIdentifier="
            r0.append(r1)
            int r1 = r2.streamIdentifier
            r0.append(r1)
            java.lang.String r1 = ", protocolIdentifier="
            r0.append(r1)
            int r1 = r2.protocolIdentifier
            r0.append(r1)
            java.lang.String r1 = ", unordered="
            r0.append(r1)
            boolean r1 = r2.unordered
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            java.lang.String r1 = r2.contentToString()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.channel.sctp.SctpMessage mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.channel.sctp.SctpMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.channel.sctp.SctpMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r1 = r0.mo42touch(r1)
            return r1
    }
}
