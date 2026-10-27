package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultLastHttpContent extends io.netty.handler.codec.http.DefaultHttpContent implements io.netty.handler.codec.http.LastHttpContent {
    private final io.netty.handler.codec.http.HttpHeaders trailingHeaders;
    private final boolean validateHeaders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TrailingHttpHeaders extends io.netty.handler.codec.http.DefaultHttpHeaders {
        private static final io.netty.handler.codec.DefaultHeaders.NameValidator<java.lang.CharSequence> TrailerNameValidator = null;


        static {
                io.netty.handler.codec.http.DefaultLastHttpContent$TrailingHttpHeaders$1 r0 = new io.netty.handler.codec.http.DefaultLastHttpContent$TrailingHttpHeaders$1
                r0.<init>()
                io.netty.handler.codec.http.DefaultLastHttpContent.TrailingHttpHeaders.TrailerNameValidator = r0
                return
        }

        TrailingHttpHeaders(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L5
                io.netty.handler.codec.DefaultHeaders$NameValidator<java.lang.CharSequence> r0 = io.netty.handler.codec.http.DefaultLastHttpContent.TrailingHttpHeaders.TrailerNameValidator
                goto L7
            L5:
                io.netty.handler.codec.DefaultHeaders$NameValidator r0 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
            L7:
                r1.<init>(r2, r0)
                return
        }
    }

    public DefaultLastHttpContent() {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r0)
            return
    }

    public DefaultLastHttpContent(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public DefaultLastHttpContent(io.netty.buffer.ByteBuf r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            io.netty.handler.codec.http.DefaultLastHttpContent$TrailingHttpHeaders r1 = new io.netty.handler.codec.http.DefaultLastHttpContent$TrailingHttpHeaders
            r1.<init>(r2)
            r0.trailingHeaders = r1
            r0.validateHeaders = r2
            return
    }

    private void appendHeaders(java.lang.StringBuilder r4) {
            r3 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r3.trailingHeaders()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r4.append(r1)
            goto L8
        L31:
            return
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.http.LastHttpContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.http.LastHttpContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.http.DefaultLastHttpContent r0 = new io.netty.handler.codec.http.DefaultLastHttpContent
            boolean r1 = r2.validateHeaders
            r0.<init>(r3, r1)
            io.netty.handler.codec.http.HttpHeaders r3 = r0.trailingHeaders()
            io.netty.handler.codec.http.HttpHeaders r1 = r2.trailingHeaders()
            r3.set(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.LastHttpContent mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http.LastHttpContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.toString()
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            r3.appendHeaders(r0)
            int r2 = r0.length()
            int r1 = r1.length()
            int r2 = r2 - r1
            r0.setLength(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.LastHttpContent mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.LastHttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.DefaultHttpContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.LastHttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.LastHttpContent
    public io.netty.handler.codec.http.HttpHeaders trailingHeaders() {
            r1 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r1.trailingHeaders
            return r0
    }
}
