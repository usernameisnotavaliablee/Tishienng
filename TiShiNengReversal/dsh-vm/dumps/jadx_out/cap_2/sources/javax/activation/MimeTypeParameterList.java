package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeTypeParameterList {
    private static final java.lang.String TSPECIALS = "()<>@,;:/[]?=\\\"";
    private java.util.Hashtable parameters;

    public MimeTypeParameterList() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.parameters = r0
            return
    }

    public MimeTypeParameterList(java.lang.String r2) throws javax.activation.MimeTypeParseException {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.parameters = r0
            r1.parse(r2)
            return
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

    private static java.lang.String quote(java.lang.String r7) {
            int r0 = r7.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L19
            if (r3 == 0) goto Lc
            goto L19
        Lc:
            char r3 = r7.charAt(r2)
            boolean r3 = isTokenChar(r3)
            r3 = r3 ^ 1
            int r2 = r2 + 1
            goto L7
        L19:
            if (r3 == 0) goto L4b
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            double r3 = (double) r0
            r5 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r3 = r3 * r5
            int r3 = (int) r3
            r2.ensureCapacity(r3)
            r3 = 34
            r2.append(r3)
        L2e:
            if (r1 < r0) goto L38
            r2.append(r3)
            java.lang.String r7 = r2.toString()
            return r7
        L38:
            char r4 = r7.charAt(r1)
            r5 = 92
            if (r4 == r5) goto L42
            if (r4 != r3) goto L45
        L42:
            r2.append(r5)
        L45:
            r2.append(r4)
            int r1 = r1 + 1
            goto L2e
        L4b:
            return r7
    }

    private static int skipWhiteSpace(java.lang.String r2, int r3) {
            int r0 = r2.length()
        L4:
            if (r3 >= r0) goto L14
            char r1 = r2.charAt(r3)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L11
            goto L14
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            return r3
    }

    private static java.lang.String unquote(java.lang.String r7) {
            int r0 = r7.length()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.ensureCapacity(r0)
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            if (r3 < r0) goto L16
            java.lang.String r7 = r1.toString()
            return r7
        L16:
            char r5 = r7.charAt(r3)
            if (r4 != 0) goto L24
            r6 = 92
            if (r5 == r6) goto L24
            r1.append(r5)
            goto L2c
        L24:
            if (r4 == 0) goto L2b
            r1.append(r5)
            r4 = 0
            goto L2c
        L2b:
            r4 = 1
        L2c:
            int r3 = r3 + 1
            goto Lf
    }

    public java.lang.String get(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.parameters
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public java.util.Enumeration getNames() {
            r1 = this;
            java.util.Hashtable r0 = r1.parameters
            java.util.Enumeration r0 = r0.keys()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Hashtable r0 = r1.parameters
            boolean r0 = r0.isEmpty()
            return r0
    }

    protected void parse(java.lang.String r9) throws javax.activation.MimeTypeParseException {
            r8 = this;
            if (r9 != 0) goto L4
            goto Lea
        L4:
            int r0 = r9.length()
            if (r0 > 0) goto Lc
            goto Lea
        Lc:
            r1 = 0
            int r1 = skipWhiteSpace(r9, r1)
        L11:
            if (r1 >= r0) goto Le8
            char r2 = r9.charAt(r1)
            r3 = 59
            if (r2 == r3) goto L1d
            goto Le8
        L1d:
            int r1 = r1 + 1
            int r1 = skipWhiteSpace(r9, r1)
            if (r1 < r0) goto L27
            goto Lea
        L27:
            r2 = r1
        L28:
            if (r2 >= r0) goto L38
            char r3 = r9.charAt(r2)
            boolean r3 = isTokenChar(r3)
            if (r3 != 0) goto L35
            goto L38
        L35:
            int r2 = r2 + 1
            goto L28
        L38:
            java.lang.String r1 = r9.substring(r1, r2)
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            int r2 = skipWhiteSpace(r9, r2)
            if (r2 >= r0) goto Le0
            char r3 = r9.charAt(r2)
            r4 = 61
            if (r3 != r4) goto Le0
            int r2 = r2 + 1
            int r2 = skipWhiteSpace(r9, r2)
            if (r2 >= r0) goto Lcc
            char r3 = r9.charAt(r2)
            r4 = 34
            if (r3 != r4) goto L92
            int r2 = r2 + 1
            java.lang.String r5 = "Encountered unterminated quoted parameter value."
            if (r2 >= r0) goto L8c
            r6 = r2
        L67:
            if (r6 < r0) goto L6a
            goto L70
        L6a:
            char r3 = r9.charAt(r6)
            if (r3 != r4) goto L83
        L70:
            if (r3 != r4) goto L7d
            java.lang.String r2 = r9.substring(r2, r6)
            java.lang.String r2 = unquote(r2)
            int r6 = r6 + 1
            goto Lad
        L7d:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            r9.<init>(r5)
            throw r9
        L83:
            r7 = 92
            if (r3 != r7) goto L89
            int r6 = r6 + 1
        L89:
            int r6 = r6 + 1
            goto L67
        L8c:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            r9.<init>(r5)
            throw r9
        L92:
            boolean r3 = isTokenChar(r3)
            if (r3 == 0) goto Lb8
            r6 = r2
        L99:
            if (r6 >= r0) goto La9
            char r3 = r9.charAt(r6)
            boolean r3 = isTokenChar(r3)
            if (r3 != 0) goto La6
            goto La9
        La6:
            int r6 = r6 + 1
            goto L99
        La9:
            java.lang.String r2 = r9.substring(r2, r6)
        Lad:
            java.util.Hashtable r3 = r8.parameters
            r3.put(r1, r2)
            int r1 = skipWhiteSpace(r9, r6)
            goto L11
        Lb8:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected character encountered at index "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        Lcc:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't find a value for parameter named "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        Le0:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "Couldn't find the '=' that separates a parameter name from its value."
            r9.<init>(r0)
            throw r9
        Le8:
            if (r1 < r0) goto Leb
        Lea:
            return
        Leb:
            javax.activation.MimeTypeParseException r9 = new javax.activation.MimeTypeParseException
            java.lang.String r0 = "More characters encountered in input than expected."
            r9.<init>(r0)
            throw r9
    }

    public void remove(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.parameters
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            r0.remove(r3)
            return
    }

    public void set(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Hashtable r0 = r2.parameters
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            r0.put(r3, r4)
            return
    }

    public int size() {
            r1 = this;
            java.util.Hashtable r0 = r1.parameters
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.Hashtable r1 = r4.parameters
            int r1 = r1.size()
            int r1 = r1 * 16
            r0.ensureCapacity(r1)
            java.util.Hashtable r1 = r4.parameters
            java.util.Enumeration r1 = r1.keys()
        L16:
            boolean r2 = r1.hasMoreElements()
            if (r2 != 0) goto L21
            java.lang.String r0 = r0.toString()
            return r0
        L21:
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "; "
            r0.append(r3)
            r0.append(r2)
            r3 = 61
            r0.append(r3)
            java.util.Hashtable r3 = r4.parameters
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = quote(r2)
            r0.append(r2)
            goto L16
    }
}
