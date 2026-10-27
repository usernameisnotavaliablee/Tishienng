package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultCookie implements io.netty.handler.codec.http.cookie.Cookie {
    private java.lang.String domain;
    private boolean httpOnly;
    private long maxAge;
    private final java.lang.String name;
    private java.lang.String path;
    private boolean secure;
    private java.lang.String value;
    private boolean wrap;

    public DefaultCookie(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775808
            r2.maxAge = r0
            java.lang.String r0 = "name"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1f
            r2.name = r3
            r2.setValue(r4)
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "empty name"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.cookie.Cookie r5) {
            r4 = this;
            java.lang.String r0 = r4.name()
            java.lang.String r1 = r5.name()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = r4.path()
            r1 = 1
            r2 = -1
            if (r0 != 0) goto L1e
            java.lang.String r0 = r5.path()
            if (r0 == 0) goto L34
            return r2
        L1e:
            java.lang.String r0 = r5.path()
            if (r0 != 0) goto L25
            return r1
        L25:
            java.lang.String r0 = r4.path()
            java.lang.String r3 = r5.path()
            int r0 = r0.compareTo(r3)
            if (r0 == 0) goto L34
            return r0
        L34:
            java.lang.String r0 = r4.domain()
            if (r0 != 0) goto L43
            java.lang.String r5 = r5.domain()
            if (r5 == 0) goto L41
            return r2
        L41:
            r5 = 0
            return r5
        L43:
            java.lang.String r0 = r5.domain()
            if (r0 != 0) goto L4a
            return r1
        L4a:
            java.lang.String r0 = r4.domain()
            java.lang.String r5 = r5.domain()
            int r5 = r0.compareToIgnoreCase(r5)
            return r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.cookie.Cookie r1) {
            r0 = this;
            io.netty.handler.codec.http.cookie.Cookie r1 = (io.netty.handler.codec.http.cookie.Cookie) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public java.lang.String domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.handler.codec.http.cookie.Cookie
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.handler.codec.http.cookie.Cookie r5 = (io.netty.handler.codec.http.cookie.Cookie) r5
            java.lang.String r1 = r4.name()
            java.lang.String r3 = r5.name()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            java.lang.String r1 = r4.path()
            if (r1 != 0) goto L28
            java.lang.String r1 = r5.path()
            if (r1 == 0) goto L3e
            return r2
        L28:
            java.lang.String r1 = r5.path()
            if (r1 != 0) goto L2f
            return r2
        L2f:
            java.lang.String r1 = r4.path()
            java.lang.String r3 = r5.path()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3e
            return r2
        L3e:
            java.lang.String r1 = r4.domain()
            if (r1 != 0) goto L4c
            java.lang.String r5 = r5.domain()
            if (r5 == 0) goto L4b
            return r2
        L4b:
            return r0
        L4c:
            java.lang.String r0 = r4.domain()
            java.lang.String r5 = r5.domain()
            boolean r5 = r0.equalsIgnoreCase(r5)
            return r5
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public boolean isHttpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public boolean isSecure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public long maxAge() {
            r2 = this;
            long r0 = r2.maxAge
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setDomain(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "domain"
            java.lang.String r2 = io.netty.handler.codec.http.cookie.CookieUtil.validateAttributeValue(r0, r2)
            r1.domain = r2
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setHttpOnly(boolean r1) {
            r0 = this;
            r0.httpOnly = r1
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setMaxAge(long r1) {
            r0 = this;
            r0.maxAge = r1
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setPath(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "path"
            java.lang.String r2 = io.netty.handler.codec.http.cookie.CookieUtil.validateAttributeValue(r0, r2)
            r1.path = r2
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setSecure(boolean r1) {
            r0 = this;
            r0.secure = r1
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setValue(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.value = r2
            return
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public void setWrap(boolean r1) {
            r0 = this;
            r0.wrap = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = io.netty.handler.codec.http.cookie.CookieUtil.stringBuilder()
            java.lang.String r1 = r6.name()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r6.value()
            r0.append(r1)
            java.lang.String r1 = r6.domain()
            if (r1 == 0) goto L29
            java.lang.String r1 = ", domain="
            r0.append(r1)
            java.lang.String r1 = r6.domain()
            r0.append(r1)
        L29:
            java.lang.String r1 = r6.path()
            if (r1 == 0) goto L3b
            java.lang.String r1 = ", path="
            r0.append(r1)
            java.lang.String r1 = r6.path()
            r0.append(r1)
        L3b:
            long r1 = r6.maxAge()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L56
            java.lang.String r1 = ", maxAge="
            r0.append(r1)
            long r1 = r6.maxAge()
            r0.append(r1)
            r1 = 115(0x73, float:1.61E-43)
            r0.append(r1)
        L56:
            boolean r1 = r6.isSecure()
            if (r1 == 0) goto L61
            java.lang.String r1 = ", secure"
            r0.append(r1)
        L61:
            boolean r1 = r6.isHttpOnly()
            if (r1 == 0) goto L6c
            java.lang.String r1 = ", HTTPOnly"
            r0.append(r1)
        L6c:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    protected java.lang.String validateValue(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = io.netty.handler.codec.http.cookie.CookieUtil.validateAttributeValue(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // io.netty.handler.codec.http.cookie.Cookie
    public boolean wrap() {
            r1 = this;
            boolean r0 = r1.wrap
            return r0
    }
}
