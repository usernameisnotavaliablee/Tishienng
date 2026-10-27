package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractDerivedByteBuf extends io.netty.buffer.AbstractByteBuf {
    protected AbstractDerivedByteBuf(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.nioBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    final boolean isAccessible() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            return r2
    }

    public final int refCnt() {
            r1 = this;
            int r0 = r1.refCnt0()
            return r0
    }

    int refCnt0() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r0 = r0.refCnt()
            return r0
    }

    public final boolean release() {
            r1 = this;
            boolean r0 = r1.release0()
            return r0
    }

    public final boolean release(int r1) {
            r0 = this;
            boolean r1 = r0.release0(r1)
            return r1
    }

    boolean release0() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.release()
            return r0
    }

    boolean release0(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain0()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain0(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    io.netty.buffer.ByteBuf retain0() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.retain()
            return r1
    }

    io.netty.buffer.ByteBuf retain0(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.retain(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch0()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch0(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }

    io.netty.buffer.ByteBuf touch0() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.touch()
            return r1
    }

    io.netty.buffer.ByteBuf touch0(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.touch(r2)
            return r1
    }
}
