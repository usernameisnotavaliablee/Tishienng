package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeType implements java.io.Externalizable {
    private static final java.lang.String TSPECIALS = "()<>@,;:/[]?=\\\"";
    private javax.activation.MimeTypeParameterList parameters;
    private java.lang.String primaryType;
    private java.lang.String subType;

    public MimeType() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "application"
            r1.primaryType = r0
            java.lang.String r0 = "*"
            r1.subType = r0
            javax.activation.MimeTypeParameterList r0 = new javax.activation.MimeTypeParameterList
            r0.<init>()
            r1.parameters = r0
            return
    }

    public MimeType(java.lang.String r1) throws javax.activation.MimeTypeParseException {
            r0 = this;
            r0.<init>()
            r0.parse(r1)
            return
    }

    public MimeType(java.lang.String r2, java.lang.String r3) throws javax.activation.MimeTypeParseException {
            r1 = this;
            r1.<init>()
            boolean r0 = r1.isValidToken(r2)
            if (r0 == 0) goto L2d
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            r1.primaryType = r2
            boolean r2 = r1.isValidToken(r3)
            if (r2 == 0) goto L25
            java.lang.String r2 = r3.toLowerCase(r0)
            r1.subType = r2
            javax.activation.MimeTypeParameterList r2 = new javax.activation.MimeTypeParameterList
            r2.<init>()
            r1.parameters = r2
            return
        L25:
            javax.activation.MimeTypeParseException r2 = new javax.activation.MimeTypeParseException
            java.lang.String r3 = "Sub type is invalid."
            r2.<init>(r3)
            throw r2
        L2d:
            javax.activation.MimeTypeParseException r2 = new javax.activation.MimeTypeParseException
            java.lang.String r3 = "Primary type is invalid."
            r2.<init>(r3)
            throw r2
    }

    private static boolean isTokenChar(char r1) {
            r0 = 32
            if (r1 <= r0) goto L12
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L12
            java.lang.String r0 = "()<>@,;:/[]?=\\\""
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private boolean isValidToken(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 0
            if (r0 <= 0) goto L1a
            r2 = 0
        L8:
            if (r2 < r0) goto Lc
            r5 = 1
            return r5
        Lc:
            char r3 = r5.charAt(r2)
            boolean r3 = isTokenChar(r3)
            if (r3 != 0) goto L17
            return r1
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            return r1
    }

    private void parse(java.lang.String r5) throws javax.activation.MimeTypeParseException {
            r4 = this;
            r0 = 47
            int r0 = r5.indexOf(r0)
            r1 = 59
            int r1 = r5.indexOf(r1)
            java.lang.String r2 = "Unable to find a sub type."
            if (r0 >= 0) goto L19
            if (r1 < 0) goto L13
            goto L19
        L13:
            javax.activation.MimeTypeParseException r5 = new javax.activation.MimeTypeParseException
            r5.<init>(r2)
            throw r5
        L19:
            if (r0 >= 0) goto L24
            if (r1 >= 0) goto L1e
            goto L24
        L1e:
            javax.activation.MimeTypeParseException r5 = new javax.activation.MimeTypeParseException
            r5.<init>(r2)
            throw r5
        L24:
            r3 = 0
            if (r0 < 0) goto L51
            if (r1 >= 0) goto L51
            java.lang.String r1 = r5.substring(r3, r0)
            java.lang.String r1 = r1.trim()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            r4.primaryType = r1
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = r5.toLowerCase(r2)
            r4.subType = r5
            javax.activation.MimeTypeParameterList r5 = new javax.activation.MimeTypeParameterList
            r5.<init>()
            r4.parameters = r5
            goto L7e
        L51:
            if (r0 >= r1) goto L9f
            java.lang.String r2 = r5.substring(r3, r0)
            java.lang.String r2 = r2.trim()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r3)
            r4.primaryType = r2
            int r0 = r0 + 1
            java.lang.String r0 = r5.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = r0.toLowerCase(r3)
            r4.subType = r0
            javax.activation.MimeTypeParameterList r0 = new javax.activation.MimeTypeParameterList
            java.lang.String r5 = r5.substring(r1)
            r0.<init>(r5)
            r4.parameters = r0
        L7e:
            java.lang.String r5 = r4.primaryType
            boolean r5 = r4.isValidToken(r5)
            if (r5 == 0) goto L97
            java.lang.String r5 = r4.subType
            boolean r5 = r4.isValidToken(r5)
            if (r5 == 0) goto L8f
            return
        L8f:
            javax.activation.MimeTypeParseException r5 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "Sub type is invalid."
            r5.<init>(r0)
            throw r5
        L97:
            javax.activation.MimeTypeParseException r5 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "Primary type is invalid."
            r5.<init>(r0)
            throw r5
        L9f:
            javax.activation.MimeTypeParseException r5 = new javax.activation.MimeTypeParseException
            r5.<init>(r2)
            throw r5
    }

    public java.lang.String getBaseType() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.primaryType
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r2.subType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getParameter(java.lang.String r2) {
            r1 = this;
            javax.activation.MimeTypeParameterList r0 = r1.parameters
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    public javax.activation.MimeTypeParameterList getParameters() {
            r1 = this;
            javax.activation.MimeTypeParameterList r0 = r1.parameters
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

    public boolean match(java.lang.String r2) throws javax.activation.MimeTypeParseException {
            r1 = this;
            javax.activation.MimeType r0 = new javax.activation.MimeType
            r0.<init>(r2)
            boolean r2 = r1.match(r0)
            return r2
    }

    public boolean match(javax.activation.MimeType r3) {
            r2 = this;
            java.lang.String r0 = r2.primaryType
            java.lang.String r1 = r3.getPrimaryType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            java.lang.String r0 = r2.subType
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = r3.getSubType()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = r2.subType
            java.lang.String r3 = r3.getSubType()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2e
        L2c:
            r3 = 1
            return r3
        L2e:
            r3 = 0
            return r3
    }

    @Override // java.io.Externalizable
    public void readExternal(java.io.ObjectInput r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r2 = r2.readUTF()     // Catch: javax.activation.MimeTypeParseException -> L8
            r1.parse(r2)     // Catch: javax.activation.MimeTypeParseException -> L8
            return
        L8:
            r2 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public void removeParameter(java.lang.String r2) {
            r1 = this;
            javax.activation.MimeTypeParameterList r0 = r1.parameters
            r0.remove(r2)
            return
    }

    public void setParameter(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            javax.activation.MimeTypeParameterList r0 = r1.parameters
            r0.set(r2, r3)
            return
    }

    public void setPrimaryType(java.lang.String r2) throws javax.activation.MimeTypeParseException {
            r1 = this;
            java.lang.String r0 = r1.primaryType
            boolean r0 = r1.isValidToken(r0)
            if (r0 == 0) goto L11
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            r1.primaryType = r2
            return
        L11:
            javax.activation.MimeTypeParseException r2 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "Primary type is invalid."
            r2.<init>(r0)
            throw r2
    }

    public void setSubType(java.lang.String r2) throws javax.activation.MimeTypeParseException {
            r1 = this;
            java.lang.String r0 = r1.subType
            boolean r0 = r1.isValidToken(r0)
            if (r0 == 0) goto L11
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            r1.subType = r2
            return
        L11:
            javax.activation.MimeTypeParseException r2 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "Sub type is invalid."
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.getBaseType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            javax.activation.MimeTypeParameterList r1 = r2.parameters
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.Externalizable
    public void writeExternal(java.io.ObjectOutput r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.toString()
            r2.writeUTF(r0)
            r2.flush()
            return
    }
}
