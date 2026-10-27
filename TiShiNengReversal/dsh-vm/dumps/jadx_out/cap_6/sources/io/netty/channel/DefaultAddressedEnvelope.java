package io.netty.channel;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultAddressedEnvelope<M, A extends java.net.SocketAddress> implements io.netty.channel.AddressedEnvelope<M, A> {
    private final M message;
    private final A recipient;
    private final A sender;

    public DefaultAddressedEnvelope(M r2, A r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultAddressedEnvelope(M r1, A r2, A r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L19
            if (r2 != 0) goto L12
            if (r3 == 0) goto La
            goto L12
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "recipient and sender"
            r1.<init>(r2)
            throw r1
        L12:
            r0.message = r1
            r0.sender = r3
            r0.recipient = r2
            return
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "message"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.AddressedEnvelope
    public M content() {
            r1 = this;
            M r0 = r1.message
            return r0
    }

    @Override // io.netty.channel.AddressedEnvelope
    public A recipient() {
            r1 = this;
            A extends java.net.SocketAddress r0 = r1.recipient
            return r0
    }

    public int refCnt() {
            r2 = this;
            M r0 = r2.message
            boolean r1 = r0 instanceof io.netty.util.ReferenceCounted
            if (r1 == 0) goto Ld
            io.netty.util.ReferenceCounted r0 = (io.netty.util.ReferenceCounted) r0
            int r0 = r0.refCnt()
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean release() {
            r1 = this;
            M r0 = r1.message
            boolean r0 = io.netty.util.ReferenceCountUtil.release(r0)
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            M r0 = r1.message
            boolean r2 = io.netty.util.ReferenceCountUtil.release(r0, r2)
            return r2
    }

    @Override // io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public io.netty.channel.AddressedEnvelope<M, A> mo179retain() {
            r1 = this;
            M r0 = r1.message
            io.netty.util.ReferenceCountUtil.retain(r0)
            return r1
    }

    @Override // io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public io.netty.channel.AddressedEnvelope<M, A> mo180retain(int r2) {
            r1 = this;
            M r0 = r1.message
            io.netty.util.ReferenceCountUtil.retain(r0, r2)
            return r1
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo39retain() {
            r1 = this;
            io.netty.channel.AddressedEnvelope r0 = r1.mo179retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo40retain(int r1) {
            r0 = this;
            io.netty.channel.AddressedEnvelope r1 = r0.mo180retain(r1)
            return r1
    }

    @Override // io.netty.channel.AddressedEnvelope
    public A sender() {
            r1 = this;
            A extends java.net.SocketAddress r0 = r1.sender
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            A extends java.net.SocketAddress r0 = r4.sender
            r1 = 41
            java.lang.String r2 = ", "
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r0.append(r3)
            r3 = 40
            r0.append(r3)
            A extends java.net.SocketAddress r3 = r4.sender
            r0.append(r3)
            java.lang.String r3 = " => "
            r0.append(r3)
            A extends java.net.SocketAddress r3 = r4.recipient
            r0.append(r3)
            r0.append(r2)
            M r2 = r4.message
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r0.append(r3)
            java.lang.String r3 = "(=> "
            r0.append(r3)
            A extends java.net.SocketAddress r3 = r4.recipient
            r0.append(r3)
            r0.append(r2)
            M r2 = r4.message
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public io.netty.channel.AddressedEnvelope<M, A> mo181touch() {
            r1 = this;
            M r0 = r1.message
            io.netty.util.ReferenceCountUtil.touch(r0)
            return r1
    }

    @Override // io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public io.netty.channel.AddressedEnvelope<M, A> mo182touch(java.lang.Object r2) {
            r1 = this;
            M r0 = r1.message
            io.netty.util.ReferenceCountUtil.touch(r0, r2)
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo41touch() {
            r1 = this;
            io.netty.channel.AddressedEnvelope r0 = r1.mo181touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.AddressedEnvelope r1 = r0.mo182touch(r1)
            return r1
    }
}
