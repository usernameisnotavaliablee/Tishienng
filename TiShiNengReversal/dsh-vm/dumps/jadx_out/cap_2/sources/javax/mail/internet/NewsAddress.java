package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class NewsAddress extends javax.mail.Address {
    private static final long serialVersionUID = -4203797299824684143L;
    protected java.lang.String host;
    protected java.lang.String newsgroup;

    public NewsAddress() {
            r0 = this;
            r0.<init>()
            return
    }

    public NewsAddress(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NewsAddress(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.newsgroup = r1
            r0.host = r2
            return
    }

    public static javax.mail.internet.NewsAddress[] parse(java.lang.String r3) throws javax.mail.internet.AddressException {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ","
            r0.<init>(r3, r1)
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
        Lc:
            boolean r1 = r0.hasMoreTokens()
            if (r1 != 0) goto L1e
            int r0 = r3.size()
            javax.mail.internet.NewsAddress[] r1 = new javax.mail.internet.NewsAddress[r0]
            if (r0 <= 0) goto L1d
            r3.copyInto(r1)
        L1d:
            return r1
        L1e:
            java.lang.String r1 = r0.nextToken()
            javax.mail.internet.NewsAddress r2 = new javax.mail.internet.NewsAddress
            r2.<init>(r1)
            r3.addElement(r2)
            goto Lc
    }

    public static java.lang.String toString(javax.mail.Address[] r3) {
            if (r3 == 0) goto L30
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L30
        L6:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 0
            r1 = r3[r1]
            javax.mail.internet.NewsAddress r1 = (javax.mail.internet.NewsAddress) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 1
        L15:
            int r2 = r3.length
            if (r1 < r2) goto L1d
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.lang.String r2 = ","
            r0.append(r2)
            r2 = r3[r1]
            javax.mail.internet.NewsAddress r2 = (javax.mail.internet.NewsAddress) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L15
        L30:
            r3 = 0
            return r3
    }

    @Override // javax.mail.Address
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.internet.NewsAddress
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.internet.NewsAddress r4 = (javax.mail.internet.NewsAddress) r4
            java.lang.String r0 = r3.newsgroup
            java.lang.String r2 = r4.newsgroup
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.host
            if (r0 != 0) goto L1a
            java.lang.String r2 = r4.host
            if (r2 == 0) goto L26
        L1a:
            if (r0 == 0) goto L28
            java.lang.String r4 = r4.host
            if (r4 == 0) goto L28
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L28
        L26:
            r4 = 1
            return r4
        L28:
            return r1
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public java.lang.String getNewsgroup() {
            r1 = this;
            java.lang.String r0 = r1.newsgroup
            return r0
    }

    @Override // javax.mail.Address
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "news"
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.newsgroup
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = r3.host
            if (r1 == 0) goto L19
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L19:
            return r0
    }

    public void setHost(java.lang.String r1) {
            r0 = this;
            r0.host = r1
            return
    }

    public void setNewsgroup(java.lang.String r1) {
            r0 = this;
            r0.newsgroup = r1
            return
    }

    @Override // javax.mail.Address
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.newsgroup
            return r0
    }
}
