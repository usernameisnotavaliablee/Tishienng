package xyz.adscope.common.network.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Cookie implements java.io.Serializable {
    private long a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private boolean g;
    private java.lang.String h;
    private long i;
    private java.lang.String j;
    private java.lang.String k;
    private boolean l;
    private int m;

    public Cookie() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
            r0 = 1
            r2.m = r0
            return
    }

    public static boolean isExpired(xyz.adscope.common.network.cookie.Cookie r4) {
            long r0 = r4.i
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }

    public static xyz.adscope.common.network.cookie.Cookie toCookie(java.lang.String r7, java.net.HttpCookie r8) {
            xyz.adscope.common.network.cookie.Cookie r0 = new xyz.adscope.common.network.cookie.Cookie
            r0.<init>()
            r0.setUrl(r7)
            java.lang.String r7 = r8.getName()
            r0.setName(r7)
            java.lang.String r7 = r8.getValue()
            r0.setValue(r7)
            java.lang.String r7 = r8.getComment()
            r0.setComment(r7)
            java.lang.String r7 = r8.getCommentURL()
            r0.setCommentURL(r7)
            boolean r7 = r8.getDiscard()
            r0.setDiscard(r7)
            java.lang.String r7 = r8.getDomain()
            r0.setDomain(r7)
            long r1 = r8.getMaxAge()
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L57
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L53
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 3153600000000(0x2de41353000, double:1.558085420725E-311)
            long r1 = r1 + r3
        L53:
            r0.setExpiry(r1)
            goto L62
        L57:
            if (r7 >= 0) goto L5f
            r1 = -1
            r0.setExpiry(r1)
            goto L62
        L5f:
            r0.setExpiry(r3)
        L62:
            java.lang.String r7 = r8.getPath()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L85
            int r1 = r7.length()
            r2 = 1
            if (r1 <= r2) goto L85
            java.lang.String r1 = "/"
            boolean r1 = r7.endsWith(r1)
            if (r1 == 0) goto L85
            int r1 = r7.length()
            int r1 = r1 - r2
            r2 = 0
            java.lang.String r7 = r7.substring(r2, r1)
        L85:
            r0.setPath(r7)
            java.lang.String r7 = r8.getPortlist()
            r0.setPortList(r7)
            boolean r7 = r8.getSecure()
            r0.setSecure(r7)
            int r7 = r8.getVersion()
            r0.setVersion(r7)
            return r0
    }

    public static java.net.HttpCookie toHttpCookie(xyz.adscope.common.network.cookie.Cookie r7) {
            java.net.HttpCookie r0 = new java.net.HttpCookie
            java.lang.String r1 = r7.c
            java.lang.String r2 = r7.d
            r0.<init>(r1, r2)
            java.lang.String r1 = r7.e
            r0.setComment(r1)
            java.lang.String r1 = r7.f
            r0.setCommentURL(r1)
            boolean r1 = r7.g
            r0.setDiscard(r1)
            java.lang.String r1 = r7.h
            r0.setDomain(r1)
            long r1 = r7.i
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L29
            r0.setMaxAge(r3)
            goto L42
        L29:
            if (r5 >= 0) goto L31
            r1 = -1
            r0.setMaxAge(r1)
            goto L42
        L31:
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L3b
            goto L3c
        L3b:
            r3 = r1
        L3c:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r1
            r0.setMaxAge(r3)
        L42:
            java.lang.String r1 = r7.j
            r0.setPath(r1)
            java.lang.String r1 = r7.k
            r0.setPortlist(r1)
            boolean r1 = r7.l
            r0.setSecure(r1)
            int r7 = r7.m
            r0.setVersion(r7)
            return r0
    }

    public java.lang.String getComment() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String getCommentURL() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String getDomain() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public long getExpiry() {
            r2 = this;
            long r0 = r2.i
            return r0
    }

    public long getId() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String getPortList() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public int getVersion() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public boolean isDiscard() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public boolean isSecure() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public void setComment(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setCommentURL(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setDiscard(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setDomain(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setExpiry(long r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setId(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setPath(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setPortList(java.lang.String r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setSecure(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setValue(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setVersion(int r1) {
            r0 = this;
            r0.m = r1
            return
    }
}
