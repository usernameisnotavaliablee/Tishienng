package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultCookie extends io.netty.handler.codec.http.cookie.DefaultCookie implements io.netty.handler.codec.http.Cookie {
    private java.lang.String comment;
    private java.lang.String commentUrl;
    private boolean discard;
    private java.util.Set<java.lang.Integer> ports;
    private java.util.Set<java.lang.Integer> unmodifiablePorts;
    private int version;

    public DefaultCookie(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            r0.ports = r1
            r0.unmodifiablePorts = r1
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String comment() {
            r1 = this;
            java.lang.String r0 = r1.comment
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String commentUrl() {
            r1 = this;
            java.lang.String r0 = r1.commentUrl
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.comment()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getCommentUrl() {
            r1 = this;
            java.lang.String r0 = r1.commentUrl()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getDomain() {
            r1 = this;
            java.lang.String r0 = r1.domain()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public long getMaxAge() {
            r2 = this;
            long r0 = r2.maxAge()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.util.Set<java.lang.Integer> getPorts() {
            r1 = this;
            java.util.Set r0 = r1.ports()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public int getVersion() {
            r1 = this;
            int r0 = r1.version()
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public boolean isDiscard() {
            r1 = this;
            boolean r0 = r1.discard
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public java.util.Set<java.lang.Integer> ports() {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.unmodifiablePorts
            if (r0 != 0) goto Lc
            java.util.Set<java.lang.Integer> r0 = r1.ports
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r1.unmodifiablePorts = r0
        Lc:
            java.util.Set<java.lang.Integer> r0 = r1.unmodifiablePorts
            return r0
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setComment(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "comment"
            java.lang.String r2 = r1.validateValue(r0, r2)
            r1.comment = r2
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setCommentUrl(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "commentUrl"
            java.lang.String r2 = r1.validateValue(r0, r2)
            r1.commentUrl = r2
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setDiscard(boolean r1) {
            r0 = this;
            r0.discard = r1
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setPorts(java.lang.Iterable<java.lang.Integer> r5) {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r5.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            if (r2 <= 0) goto L24
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r3) goto L24
            r0.add(r1)
            goto L9
        L24:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "port out of range: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3b:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L48
            java.util.Set r5 = java.util.Collections.EMPTY_SET
            r4.ports = r5
            r4.unmodifiablePorts = r5
            return
        L48:
            r4.ports = r0
            r5 = 0
            r4.unmodifiablePorts = r5
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setPorts(int... r6) {
            r5 = this;
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r6.clone()
            int[] r6 = (int[]) r6
            int r0 = r6.length
            if (r0 != 0) goto L12
            java.util.Set r6 = java.util.Collections.EMPTY_SET
            r5.ports = r6
            r5.unmodifiablePorts = r6
            return
        L12:
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L19:
            if (r2 >= r1) goto L45
            r3 = r6[r2]
            if (r3 <= 0) goto L2e
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r4) goto L2e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L19
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "port out of range: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L45:
            r5.ports = r0
            r6 = 0
            r5.unmodifiablePorts = r6
            return
        L4b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "ports"
            r6.<init>(r0)
            throw r6
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public void setVersion(int r1) {
            r0 = this;
            r0.version = r1
            return
    }

    @Override // io.netty.handler.codec.http.Cookie
    @java.lang.Deprecated
    public int version() {
            r1 = this;
            int r0 = r1.version
            return r0
    }
}
