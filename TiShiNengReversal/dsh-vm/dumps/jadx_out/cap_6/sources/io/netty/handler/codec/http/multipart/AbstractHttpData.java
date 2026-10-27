package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractHttpData extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.codec.http.multipart.HttpData {
    private static final java.util.regex.Pattern REPLACE_PATTERN = null;
    private static final java.util.regex.Pattern STRIP_PATTERN = null;
    private java.nio.charset.Charset charset;
    private boolean completed;
    protected long definedSize;
    private long maxSize;
    private final java.lang.String name;
    protected long size;

    static {
            java.lang.String r0 = "(?:^\\s+|\\s+$|\\n)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.multipart.AbstractHttpData.STRIP_PATTERN = r0
            java.lang.String r0 = "[\\r\\t]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.multipart.AbstractHttpData.REPLACE_PATTERN = r0
            return
    }

    protected AbstractHttpData(java.lang.String r3, java.nio.charset.Charset r4, long r5) {
            r2 = this;
            r2.<init>()
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r2.charset = r0
            r0 = -1
            r2.maxSize = r0
            if (r3 == 0) goto L3d
            java.util.regex.Pattern r0 = io.netty.handler.codec.http.multipart.AbstractHttpData.REPLACE_PATTERN
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = " "
            java.lang.String r3 = r3.replaceAll(r0)
            java.util.regex.Pattern r0 = io.netty.handler.codec.http.multipart.AbstractHttpData.STRIP_PATTERN
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = ""
            java.lang.String r3 = r3.replaceAll(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L35
            r2.name = r3
            if (r4 == 0) goto L32
            r2.setCharset(r4)
        L32:
            r2.definedSize = r5
            return
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "empty name"
            r3.<init>(r4)
            throw r3
        L3d:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "name"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void checkSize(long r6) throws java.io.IOException {
            r5 = this;
            long r0 = r5.maxSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            goto L15
        Ld:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Size exceed allowed maximum capacity"
            r6.<init>(r7)
            throw r6
        L15:
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.getByteBuf()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    protected void deallocate() {
            r0 = this;
            r0.delete()
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long definedLength() {
            r2 = this;
            long r0 = r2.definedSize
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long getMaxSize() {
            r2 = this;
            long r0 = r2.maxSize
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isCompleted() {
            r1 = this;
            boolean r0 = r1.completed
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long length() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.HttpData mo39retain() {
            r0 = this;
            super.retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setCharset(java.nio.charset.Charset r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.charset = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "charset"
            r2.<init>(r0)
            throw r2
    }

    protected void setCompleted() {
            r1 = this;
            r0 = 1
            r1.completed = r0
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setMaxSize(long r1) {
            r0 = this;
            r0.maxSize = r1
            return
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }

    /* renamed from: touch */
    public abstract io.netty.handler.codec.http.multipart.HttpData mo41touch();

    /* renamed from: touch */
    public abstract io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1);

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }
}
