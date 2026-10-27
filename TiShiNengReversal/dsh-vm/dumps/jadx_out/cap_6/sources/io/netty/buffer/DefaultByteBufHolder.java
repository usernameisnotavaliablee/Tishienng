package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultByteBufHolder implements io.netty.buffer.ByteBufHolder {
    private final io.netty.buffer.ByteBuf data;

    public DefaultByteBufHolder(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.data = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "data"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.data
            int r0 = r0.refCnt()
            if (r0 <= 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r2.data
            return r0
        Lb:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            io.netty.buffer.ByteBuf r1 = r2.data
            int r1 = r1.refCnt()
            r0.<init>(r1)
            throw r0
    }

    protected final java.lang.String contentToString() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.buffer.ByteBufHolder r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.buffer.ByteBufHolder r0 = r1.replace(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.buffer.ByteBufHolder
            if (r0 == 0) goto L15
            io.netty.buffer.ByteBuf r0 = r1.data
            io.netty.buffer.ByteBufHolder r2 = (io.netty.buffer.ByteBufHolder) r2
            io.netty.buffer.ByteBuf r2 = r2.content()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            int r0 = r0.hashCode()
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.DefaultByteBufHolder r0 = new io.netty.buffer.DefaultByteBufHolder
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.retain()
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.buffer.ByteBufHolder mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.retain(r2)
            return r1
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = r1.mo39retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBufHolder r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.buffer.ByteBufHolder r0 = r1.replace(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r2.contentToString()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.touch()
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.touch(r2)
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = r1.mo41touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBufHolder r1 = r0.mo42touch(r1)
            return r1
    }
}
