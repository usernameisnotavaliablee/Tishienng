package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ContentDisposition {
    private java.lang.String disposition;
    private javax.mail.internet.ParameterList list;

    public ContentDisposition() {
            r0 = this;
            r0.<init>()
            return
    }

    public ContentDisposition(java.lang.String r4) throws javax.mail.internet.ParseException {
            r3 = this;
            r3.<init>()
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r1 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r4, r1)
            javax.mail.internet.HeaderTokenizer$Token r4 = r0.next()
            int r1 = r4.getType()
            r2 = -1
            if (r1 != r2) goto L29
            java.lang.String r4 = r4.getValue()
            r3.disposition = r4
            java.lang.String r4 = r0.getRemainder()
            if (r4 == 0) goto L28
            javax.mail.internet.ParameterList r0 = new javax.mail.internet.ParameterList
            r0.<init>(r4)
            r3.list = r0
        L28:
            return
        L29:
            javax.mail.internet.ParseException r4 = new javax.mail.internet.ParseException
            r4.<init>()
            throw r4
    }

    public ContentDisposition(java.lang.String r1, javax.mail.internet.ParameterList r2) {
            r0 = this;
            r0.<init>()
            r0.disposition = r1
            r0.list = r2
            return
    }

    public java.lang.String getDisposition() {
            r1 = this;
            java.lang.String r0 = r1.disposition
            return r0
    }

    public java.lang.String getParameter(java.lang.String r2) {
            r1 = this;
            javax.mail.internet.ParameterList r0 = r1.list
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    public javax.mail.internet.ParameterList getParameterList() {
            r1 = this;
            javax.mail.internet.ParameterList r0 = r1.list
            return r0
    }

    public void setDisposition(java.lang.String r1) {
            r0 = this;
            r0.disposition = r1
            return
    }

    public void setParameter(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            javax.mail.internet.ParameterList r0 = r1.list
            if (r0 != 0) goto Lb
            javax.mail.internet.ParameterList r0 = new javax.mail.internet.ParameterList
            r0.<init>()
            r1.list = r0
        Lb:
            javax.mail.internet.ParameterList r0 = r1.list
            r0.set(r2, r3)
            return
    }

    public void setParameterList(javax.mail.internet.ParameterList r1) {
            r0 = this;
            r0.list = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.disposition
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            javax.mail.internet.ParameterList r1 = r3.list
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>(r0)
            javax.mail.internet.ParameterList r0 = r3.list
            int r2 = r1.length()
            int r2 = r2 + 21
            java.lang.String r0 = r0.toString(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
