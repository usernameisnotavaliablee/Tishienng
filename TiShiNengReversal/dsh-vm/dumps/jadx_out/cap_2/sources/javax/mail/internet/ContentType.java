package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ContentType {
    private javax.mail.internet.ParameterList list;
    private java.lang.String primaryType;
    private java.lang.String subType;

    public ContentType() {
            r0 = this;
            r0.<init>()
            return
    }

    public ContentType(java.lang.String r4) throws javax.mail.internet.ParseException {
            r3 = this;
            r3.<init>()
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r1 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r4, r1)
            javax.mail.internet.HeaderTokenizer$Token r4 = r0.next()
            int r1 = r4.getType()
            r2 = -1
            if (r1 != r2) goto L52
            java.lang.String r4 = r4.getValue()
            r3.primaryType = r4
            javax.mail.internet.HeaderTokenizer$Token r4 = r0.next()
            int r4 = r4.getType()
            char r4 = (char) r4
            r1 = 47
            if (r4 != r1) goto L4c
            javax.mail.internet.HeaderTokenizer$Token r4 = r0.next()
            int r1 = r4.getType()
            if (r1 != r2) goto L46
            java.lang.String r4 = r4.getValue()
            r3.subType = r4
            java.lang.String r4 = r0.getRemainder()
            if (r4 == 0) goto L45
            javax.mail.internet.ParameterList r0 = new javax.mail.internet.ParameterList
            r0.<init>(r4)
            r3.list = r0
        L45:
            return
        L46:
            javax.mail.internet.ParseException r4 = new javax.mail.internet.ParseException
            r4.<init>()
            throw r4
        L4c:
            javax.mail.internet.ParseException r4 = new javax.mail.internet.ParseException
            r4.<init>()
            throw r4
        L52:
            javax.mail.internet.ParseException r4 = new javax.mail.internet.ParseException
            r4.<init>()
            throw r4
    }

    public ContentType(java.lang.String r1, java.lang.String r2, javax.mail.internet.ParameterList r3) {
            r0 = this;
            r0.<init>()
            r0.primaryType = r1
            r0.subType = r2
            r0.list = r3
            return
    }

    public java.lang.String getBaseType() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.primaryType
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = r2.subType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
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

    public java.lang.String getPrimaryType() {
            r1 = this;
            java.lang.String r0 = r1.primaryType
            return r0
    }

    public java.lang.String getSubType() {
            r1 = this;
            java.lang.String r0 = r1.subType
            return r0
    }

    public boolean match(java.lang.String r2) {
            r1 = this;
            javax.mail.internet.ContentType r0 = new javax.mail.internet.ContentType     // Catch: javax.mail.internet.ParseException -> La
            r0.<init>(r2)     // Catch: javax.mail.internet.ParseException -> La
            boolean r2 = r1.match(r0)     // Catch: javax.mail.internet.ParseException -> La
            return r2
        La:
            r2 = 0
            return r2
    }

    public boolean match(javax.mail.internet.ContentType r5) {
            r4 = this;
            java.lang.String r0 = r4.primaryType
            java.lang.String r1 = r5.getPrimaryType()
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.String r5 = r5.getSubType()
            java.lang.String r0 = r4.subType
            char r0 = r0.charAt(r1)
            r2 = 1
            r3 = 42
            if (r0 == r3) goto L2d
            char r0 = r5.charAt(r1)
            if (r0 != r3) goto L24
            goto L2d
        L24:
            java.lang.String r0 = r4.subType
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 != 0) goto L2d
            return r1
        L2d:
            return r2
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

    public void setPrimaryType(java.lang.String r1) {
            r0 = this;
            r0.primaryType = r1
            return
    }

    public void setSubType(java.lang.String r1) {
            r0 = this;
            r0.subType = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.primaryType
            if (r0 == 0) goto L33
            java.lang.String r0 = r3.subType
            if (r0 != 0) goto L9
            goto L33
        L9:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r3.primaryType
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = r3.subType
            r0.append(r1)
            javax.mail.internet.ParameterList r1 = r3.list
            if (r1 == 0) goto L2e
            int r2 = r0.length()
            int r2 = r2 + 14
            java.lang.String r1 = r1.toString(r2)
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
        L33:
            r0 = 0
            return r0
    }
}
