package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ParameterList {
    private static boolean applehack;
    private static boolean decodeParameters;
    private static boolean decodeParametersStrict;
    private static boolean encodeParameters;
    private static final char[] hex = null;
    private java.lang.String lastName;
    private java.util.Map list;
    private java.util.Set multisegmentNames;
    private java.util.Map slist;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MultiValue extends java.util.ArrayList {
        java.lang.String value;

        private MultiValue() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ MultiValue(javax.mail.internet.ParameterList.MultiValue r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ParamEnum implements java.util.Enumeration {
        private java.util.Iterator it;

        ParamEnum(java.util.Iterator r1) {
                r0 = this;
                r0.<init>()
                r0.it = r1
                return
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r1 = this;
                java.util.Iterator r0 = r1.it
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Enumeration
        public java.lang.Object nextElement() {
                r1 = this;
                java.util.Iterator r0 = r1.it
                java.lang.Object r0 = r0.next()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ToStringBuffer {
        private java.lang.StringBuffer sb;
        private int used;

        public ToStringBuffer(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                r1.sb = r0
                r1.used = r2
                return
        }

        public void addNV(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r5 = javax.mail.internet.ParameterList.access$0(r5)
                java.lang.StringBuffer r0 = r3.sb
                java.lang.String r1 = "; "
                r0.append(r1)
                int r0 = r3.used
                int r0 = r0 + 2
                r3.used = r0
                int r0 = r4.length()
                int r1 = r5.length()
                int r0 = r0 + r1
                int r0 = r0 + 1
                int r1 = r3.used
                int r1 = r1 + r0
                r0 = 76
                if (r1 <= r0) goto L2e
                java.lang.StringBuffer r1 = r3.sb
                java.lang.String r2 = "\r\n\t"
                r1.append(r2)
                r1 = 8
                r3.used = r1
            L2e:
                java.lang.StringBuffer r1 = r3.sb
                r1.append(r4)
                r2 = 61
                r1.append(r2)
                int r1 = r3.used
                int r4 = r4.length()
                int r4 = r4 + 1
                int r1 = r1 + r4
                r3.used = r1
                int r4 = r5.length()
                int r1 = r1 + r4
                if (r1 <= r0) goto L74
                int r4 = r3.used
                java.lang.String r4 = javax.mail.internet.MimeUtility.fold(r4, r5)
                java.lang.StringBuffer r5 = r3.sb
                r5.append(r4)
                r5 = 10
                int r5 = r4.lastIndexOf(r5)
                if (r5 < 0) goto L6a
                int r0 = r3.used
                int r4 = r4.length()
                int r4 = r4 - r5
                int r4 = r4 + (-1)
                int r0 = r0 + r4
                r3.used = r0
                return
            L6a:
                int r5 = r3.used
                int r4 = r4.length()
                int r5 = r5 + r4
                r3.used = r5
                return
            L74:
                java.lang.StringBuffer r4 = r3.sb
                r4.append(r5)
                int r4 = r3.used
                int r5 = r5.length()
                int r4 = r4 + r5
                r3.used = r4
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.StringBuffer r0 = r1.sb
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Value {
        java.lang.String charset;
        java.lang.String encodedValue;
        java.lang.String value;

        private Value() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Value(javax.mail.internet.ParameterList.Value r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "mail.mime.encodeparameters"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L4e
            r1 = 0
            r2 = 1
            java.lang.String r3 = "true"
            if (r0 == 0) goto L14
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            javax.mail.internet.ParameterList.encodeParameters = r0     // Catch: java.lang.SecurityException -> L4e
            java.lang.String r0 = "mail.mime.decodeparameters"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L27
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            javax.mail.internet.ParameterList.decodeParameters = r0     // Catch: java.lang.SecurityException -> L4e
            java.lang.String r0 = "mail.mime.decodeparameters.strict"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L3a
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            javax.mail.internet.ParameterList.decodeParametersStrict = r0     // Catch: java.lang.SecurityException -> L4e
            java.lang.String r0 = "mail.mime.applefilenames"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L4c
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L4e
            if (r0 == 0) goto L4c
            r1 = 1
        L4c:
            javax.mail.internet.ParameterList.applehack = r1     // Catch: java.lang.SecurityException -> L4e
        L4e:
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            javax.mail.internet.ParameterList.hex = r0
            return
    }

    public ParameterList() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.list = r0
            r0 = 0
            r1.lastName = r0
            boolean r0 = javax.mail.internet.ParameterList.decodeParameters
            if (r0 == 0) goto L1f
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.multisegmentNames = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.slist = r0
        L1f:
            return
    }

    public ParameterList(java.lang.String r8) throws javax.mail.internet.ParseException {
            r7 = this;
            r7.<init>()
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r1 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r8, r1)
        La:
            javax.mail.internet.HeaderTokenizer$Token r8 = r0.next()
            int r1 = r8.getType()
            r2 = -4
            if (r1 != r2) goto L16
            goto L28
        L16:
            char r3 = (char) r1
            r4 = 59
            r5 = -1
            java.lang.String r6 = "\""
            if (r3 != r4) goto Lc2
            javax.mail.internet.HeaderTokenizer$Token r8 = r0.next()
            int r1 = r8.getType()
            if (r1 != r2) goto L31
        L28:
            boolean r8 = javax.mail.internet.ParameterList.decodeParameters
            if (r8 == 0) goto L30
            r8 = 0
            r7.combineMultisegmentNames(r8)
        L30:
            return
        L31:
            int r1 = r8.getType()
            if (r1 != r5) goto La7
            java.lang.String r8 = r8.getValue()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toLowerCase(r1)
            javax.mail.internet.HeaderTokenizer$Token r1 = r0.next()
            int r2 = r1.getType()
            char r2 = (char) r2
            r3 = 61
            if (r2 != r3) goto L8c
            javax.mail.internet.HeaderTokenizer$Token r1 = r0.next()
            int r2 = r1.getType()
            if (r2 == r5) goto L77
            r3 = -2
            if (r2 != r3) goto L5c
            goto L77
        L5c:
            javax.mail.internet.ParseException r8 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected parameter value, got \""
            r0.<init>(r2)
            java.lang.String r1 = r1.getValue()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L77:
            java.lang.String r1 = r1.getValue()
            r7.lastName = r8
            boolean r2 = javax.mail.internet.ParameterList.decodeParameters
            if (r2 == 0) goto L85
            r7.putEncodedName(r8, r1)
            goto La
        L85:
            java.util.Map r2 = r7.list
            r2.put(r8, r1)
            goto La
        L8c:
            javax.mail.internet.ParseException r8 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected '=', got \""
            r0.<init>(r2)
            java.lang.String r1 = r1.getValue()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        La7:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected parameter name, got \""
            r1.<init>(r2)
            java.lang.String r8 = r8.getValue()
            r1.append(r8)
            r1.append(r6)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lc2:
            boolean r2 = javax.mail.internet.ParameterList.applehack
            if (r2 == 0) goto L10a
            if (r1 != r5) goto L10a
            java.lang.String r1 = r7.lastName
            if (r1 == 0) goto L10a
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lde
            java.lang.String r1 = r7.lastName
            java.lang.String r2 = "filename"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10a
        Lde:
            java.util.Map r1 = r7.list
            java.lang.String r2 = r7.lastName
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r8 = r8.getValue()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.util.Map r1 = r7.list
            java.lang.String r2 = r7.lastName
            r1.put(r2, r8)
            goto La
        L10a:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected ';', got \""
            r1.<init>(r2)
            java.lang.String r8 = r8.getValue()
            r1.append(r8)
            r1.append(r6)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    static /* synthetic */ java.lang.String access$0(java.lang.String r0) {
            java.lang.String r0 = quote(r0)
            return r0
    }

    private void combineMultisegmentNames(boolean r13) throws javax.mail.internet.ParseException {
            r12 = this;
            java.util.Set r0 = r12.multisegmentNames     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9c
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L50
            java.util.Map r13 = r12.slist
            int r13 = r13.size()
            if (r13 <= 0) goto L45
            java.util.Map r13 = r12.slist
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
        L1e:
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L2c
            java.util.Map r13 = r12.list
            java.util.Map r0 = r12.slist
            r13.putAll(r0)
            goto L45
        L2c:
            java.lang.Object r0 = r13.next()
            boolean r1 = r0 instanceof javax.mail.internet.ParameterList.Value
            if (r1 == 0) goto L1e
            javax.mail.internet.ParameterList$Value r0 = (javax.mail.internet.ParameterList.Value) r0
            java.lang.String r1 = r0.encodedValue
            javax.mail.internet.ParameterList$Value r1 = decodeValue(r1)
            java.lang.String r2 = r1.charset
            r0.charset = r2
            java.lang.String r1 = r1.value
            r0.value = r1
            goto L1e
        L45:
            java.util.Set r13 = r12.multisegmentNames
            r13.clear()
            java.util.Map r13 = r12.slist
            r13.clear()
            return
        L50:
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            javax.mail.internet.ParameterList$MultiValue r3 = new javax.mail.internet.ParameterList$MultiValue     // Catch: java.lang.Throwable -> L9c
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            r5 = 0
            r6 = r4
        L63:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch: java.lang.Throwable -> L9c
            r7.append(r5)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L9c
            java.util.Map r8 = r12.slist     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L9c
            if (r8 != 0) goto L81
            goto Lb9
        L81:
            r3.add(r8)     // Catch: java.lang.Throwable -> L9c
            boolean r9 = r8 instanceof javax.mail.internet.ParameterList.Value     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L10f
            javax.mail.internet.ParameterList$Value r8 = (javax.mail.internet.ParameterList.Value) r8     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> Ld8 java.io.UnsupportedEncodingException -> Ldb java.lang.NumberFormatException -> Lde
            java.lang.String r9 = r8.encodedValue     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> Ld8 java.io.UnsupportedEncodingException -> Ldb java.lang.NumberFormatException -> Lde
            if (r5 != 0) goto Lb2
            javax.mail.internet.ParameterList$Value r10 = decodeValue(r9)     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            java.lang.String r11 = r10.charset     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            r8.charset = r11     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            java.lang.String r6 = r10.value     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> L9f java.io.UnsupportedEncodingException -> La1 java.lang.NumberFormatException -> La3
            r8.value = r6     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> L9f java.io.UnsupportedEncodingException -> La1 java.lang.NumberFormatException -> La3
            goto L113
        L9c:
            r0 = move-exception
            goto L120
        L9f:
            r6 = move-exception
            goto Le1
        La1:
            r6 = move-exception
            goto Lf1
        La3:
            r6 = move-exception
            goto L100
        La6:
            r8 = move-exception
        La7:
            r11 = r6
            r6 = r8
            goto Le1
        Laa:
            r8 = move-exception
        Lab:
            r11 = r6
            r6 = r8
            goto Lf1
        Lae:
            r8 = move-exception
        Laf:
            r11 = r6
            r6 = r8
            goto L100
        Lb2:
            if (r6 != 0) goto Lcf
            java.util.Set r8 = r12.multisegmentNames     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            r8.remove(r1)     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
        Lb9:
            if (r5 != 0) goto Lc2
            java.util.Map r2 = r12.list     // Catch: java.lang.Throwable -> L9c
            r2.remove(r1)     // Catch: java.lang.Throwable -> L9c
            goto L6
        Lc2:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9c
            r3.value = r2     // Catch: java.lang.Throwable -> L9c
            java.util.Map r2 = r12.list     // Catch: java.lang.Throwable -> L9c
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L9c
            goto L6
        Lcf:
            java.lang.String r10 = decodeBytes(r9, r6)     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            r8.value = r10     // Catch: java.lang.Throwable -> L9c java.lang.StringIndexOutOfBoundsException -> La6 java.io.UnsupportedEncodingException -> Laa java.lang.NumberFormatException -> Lae
            r11 = r6
            r6 = r10
            goto L113
        Ld8:
            r8 = move-exception
            r9 = r4
            goto La7
        Ldb:
            r8 = move-exception
            r9 = r4
            goto Lab
        Lde:
            r8 = move-exception
            r9 = r4
            goto Laf
        Le1:
            boolean r8 = javax.mail.internet.ParameterList.decodeParametersStrict     // Catch: java.lang.Throwable -> L9c
            if (r8 != 0) goto Le7
        Le5:
            r6 = r9
            goto L113
        Le7:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        Lf1:
            boolean r8 = javax.mail.internet.ParameterList.decodeParametersStrict     // Catch: java.lang.Throwable -> L9c
            if (r8 != 0) goto Lf6
            goto Le5
        Lf6:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        L100:
            boolean r8 = javax.mail.internet.ParameterList.decodeParametersStrict     // Catch: java.lang.Throwable -> L9c
            if (r8 != 0) goto L105
            goto Le5
        L105:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        L10f:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L9c
            r11 = r6
            r6 = r8
        L113:
            r2.append(r6)     // Catch: java.lang.Throwable -> L9c
            java.util.Map r6 = r12.slist     // Catch: java.lang.Throwable -> L9c
            r6.remove(r7)     // Catch: java.lang.Throwable -> L9c
            int r5 = r5 + 1
            r6 = r11
            goto L63
        L120:
            if (r13 == 0) goto L164
            java.util.Map r13 = r12.slist
            int r13 = r13.size()
            if (r13 <= 0) goto L15a
            java.util.Map r13 = r12.slist
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
        L134:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L153
            java.lang.Object r1 = r13.next()
            boolean r2 = r1 instanceof javax.mail.internet.ParameterList.Value
            if (r2 == 0) goto L134
            javax.mail.internet.ParameterList$Value r1 = (javax.mail.internet.ParameterList.Value) r1
            java.lang.String r2 = r1.encodedValue
            javax.mail.internet.ParameterList$Value r2 = decodeValue(r2)
            java.lang.String r3 = r2.charset
            r1.charset = r3
            java.lang.String r2 = r2.value
            r1.value = r2
            goto L134
        L153:
            java.util.Map r13 = r12.list
            java.util.Map r1 = r12.slist
            r13.putAll(r1)
        L15a:
            java.util.Set r13 = r12.multisegmentNames
            r13.clear()
            java.util.Map r13 = r12.slist
            r13.clear()
        L164:
            throw r0
    }

    private static java.lang.String decodeBytes(java.lang.String r6, java.lang.String r7) throws java.io.UnsupportedEncodingException {
            int r0 = r6.length()
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            int r4 = r6.length()
            if (r2 < r4) goto L19
            java.lang.String r6 = new java.lang.String
            java.lang.String r7 = javax.mail.internet.MimeUtility.javaCharset(r7)
            r6.<init>(r0, r1, r3, r7)
            return r6
        L19:
            char r4 = r6.charAt(r2)
            r5 = 37
            if (r4 != r5) goto L32
            int r4 = r2 + 1
            int r5 = r2 + 3
            java.lang.String r4 = r6.substring(r4, r5)
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)
            char r4 = (char) r4
            int r2 = r2 + 2
        L32:
            int r5 = r3 + 1
            byte r4 = (byte) r4
            r0[r3] = r4
            int r2 = r2 + 1
            r3 = r5
            goto L9
    }

    private static javax.mail.internet.ParameterList.Value decodeValue(java.lang.String r4) throws javax.mail.internet.ParseException {
            javax.mail.internet.ParameterList$Value r0 = new javax.mail.internet.ParameterList$Value
            r1 = 0
            r0.<init>(r1)
            r0.encodedValue = r4
            r0.value = r4
            r1 = 39
            int r2 = r4.indexOf(r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            if (r2 > 0) goto L32
            boolean r1 = javax.mail.internet.ParameterList.decodeParametersStrict     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            if (r1 != 0) goto L18
            goto L8c
        L18:
            javax.mail.internet.ParseException r1 = new javax.mail.internet.ParseException     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.String r3 = "Missing charset in encoded value: "
            r2.<init>(r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r2.append(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.String r4 = r2.toString()     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r1.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            throw r1     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
        L2c:
            r4 = move-exception
            goto L6a
        L2e:
            r4 = move-exception
            goto L79
        L30:
            r4 = move-exception
            goto L88
        L32:
            r3 = 0
            java.lang.String r3 = r4.substring(r3, r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            int r2 = r2 + 1
            int r1 = r4.indexOf(r1, r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            if (r1 >= 0) goto L58
            boolean r1 = javax.mail.internet.ParameterList.decodeParametersStrict     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            if (r1 != 0) goto L44
            goto L8c
        L44:
            javax.mail.internet.ParseException r1 = new javax.mail.internet.ParseException     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.String r3 = "Missing language in encoded value: "
            r2.<init>(r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r2.append(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.String r4 = r2.toString()     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r1.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            throw r1     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
        L58:
            r4.substring(r2, r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            int r1 = r1 + 1
            java.lang.String r4 = r4.substring(r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r0.charset = r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            java.lang.String r4 = decodeBytes(r4, r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            r0.value = r4     // Catch: java.lang.StringIndexOutOfBoundsException -> L2c java.io.UnsupportedEncodingException -> L2e java.lang.NumberFormatException -> L30
            return r0
        L6a:
            boolean r1 = javax.mail.internet.ParameterList.decodeParametersStrict
            if (r1 != 0) goto L6f
            goto L8c
        L6f:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L79:
            boolean r1 = javax.mail.internet.ParameterList.decodeParametersStrict
            if (r1 != 0) goto L7e
            goto L8c
        L7e:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L88:
            boolean r1 = javax.mail.internet.ParameterList.decodeParametersStrict
            if (r1 != 0) goto L8d
        L8c:
            return r0
        L8d:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static javax.mail.internet.ParameterList.Value encodeValue(java.lang.String r7, java.lang.String r8) {
            int r0 = javax.mail.internet.MimeUtility.checkAscii(r7)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            java.lang.String r0 = javax.mail.internet.MimeUtility.javaCharset(r8)     // Catch: java.io.UnsupportedEncodingException -> L76
            byte[] r0 = r7.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L76
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            int r3 = r0.length
            int r4 = r8.length()
            int r3 = r3 + r4
            int r3 = r3 + 2
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r3 = "''"
            r1.append(r3)
            r3 = 0
        L27:
            int r4 = r0.length
            if (r3 < r4) goto L3a
            javax.mail.internet.ParameterList$Value r0 = new javax.mail.internet.ParameterList$Value
            r0.<init>(r2)
            r0.charset = r8
            r0.value = r7
            java.lang.String r7 = r1.toString()
            r0.encodedValue = r7
            return r0
        L3a:
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r5 = 32
            r6 = 37
            if (r4 <= r5) goto L60
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L60
            r5 = 42
            if (r4 == r5) goto L60
            r5 = 39
            if (r4 == r5) goto L60
            if (r4 == r6) goto L60
            java.lang.String r5 = "()<>@,;:\\\"\t []/?="
            int r5 = r5.indexOf(r4)
            if (r5 < 0) goto L5c
            goto L60
        L5c:
            r1.append(r4)
            goto L73
        L60:
            r1.append(r6)
            char[] r5 = javax.mail.internet.ParameterList.hex
            int r6 = r4 >> 4
            char r6 = r5[r6]
            r1.append(r6)
            r4 = r4 & 15
            char r4 = r5[r4]
            r1.append(r4)
        L73:
            int r3 = r3 + 1
            goto L27
        L76:
            return r2
    }

    private void putEncodedName(java.lang.String r5, java.lang.String r6) throws javax.mail.internet.ParseException {
            r4 = this;
            r0 = 42
            int r0 = r5.indexOf(r0)
            if (r0 >= 0) goto Le
            java.util.Map r0 = r4.list
            r0.put(r5, r6)
            return
        Le:
            int r1 = r5.length()
            int r1 = r1 + (-1)
            r2 = 0
            if (r0 != r1) goto L25
            java.lang.String r5 = r5.substring(r2, r0)
            java.util.Map r0 = r4.list
            javax.mail.internet.ParameterList$Value r6 = decodeValue(r6)
            r0.put(r5, r6)
            return
        L25:
            java.lang.String r0 = r5.substring(r2, r0)
            java.util.Set r1 = r4.multisegmentNames
            r1.add(r0)
            java.util.Map r1 = r4.list
            java.lang.String r3 = ""
            r1.put(r0, r3)
            java.lang.String r0 = "*"
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L52
            javax.mail.internet.ParameterList$Value r0 = new javax.mail.internet.ParameterList$Value
            r1 = 0
            r0.<init>(r1)
            r0.encodedValue = r6
            r0.value = r6
            int r6 = r5.length()
            int r6 = r6 + (-1)
            java.lang.String r5 = r5.substring(r2, r6)
            r6 = r0
        L52:
            java.util.Map r0 = r4.slist
            r0.put(r5, r6)
            return
    }

    private static java.lang.String quote(java.lang.String r1) {
            java.lang.String r0 = "()<>@,;:\\\"\t []/?="
            java.lang.String r1 = javax.mail.internet.MimeUtility.quote(r1, r0)
            return r1
    }

    public java.lang.String get(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.list
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.Object r3 = r0.get(r3)
            boolean r0 = r3 instanceof javax.mail.internet.ParameterList.MultiValue
            if (r0 == 0) goto L19
            javax.mail.internet.ParameterList$MultiValue r3 = (javax.mail.internet.ParameterList.MultiValue) r3
            java.lang.String r3 = r3.value
            return r3
        L19:
            boolean r0 = r3 instanceof javax.mail.internet.ParameterList.Value
            if (r0 == 0) goto L22
            javax.mail.internet.ParameterList$Value r3 = (javax.mail.internet.ParameterList.Value) r3
            java.lang.String r3 = r3.value
            return r3
        L22:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public java.util.Enumeration getNames() {
            r2 = this;
            javax.mail.internet.ParameterList$ParamEnum r0 = new javax.mail.internet.ParameterList$ParamEnum
            java.util.Map r1 = r2.list
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
    }

    public void remove(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.list
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            r0.remove(r3)
            return
    }

    public void set(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L1d
            if (r3 == 0) goto L1d
            java.lang.String r0 = "DONE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1d
            boolean r2 = javax.mail.internet.ParameterList.decodeParameters
            if (r2 == 0) goto L1c
            java.util.Set r2 = r1.multisegmentNames
            int r2 = r2.size()
            if (r2 <= 0) goto L1c
            r2 = 1
            r1.combineMultisegmentNames(r2)     // Catch: javax.mail.internet.ParseException -> L1c
        L1c:
            return
        L1d:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            boolean r0 = javax.mail.internet.ParameterList.decodeParameters
            if (r0 == 0) goto L35
            r1.putEncodedName(r2, r3)     // Catch: javax.mail.internet.ParseException -> L2f
            return
        L2f:
            java.util.Map r0 = r1.list
            r0.put(r2, r3)
            return
        L35:
            java.util.Map r0 = r1.list
            r0.put(r2, r3)
            return
    }

    public void set(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = javax.mail.internet.ParameterList.encodeParameters
            if (r0 == 0) goto L1e
            javax.mail.internet.ParameterList$Value r4 = encodeValue(r3, r4)
            if (r4 == 0) goto L1a
            java.util.Map r3 = r1.list
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            r3.put(r2, r4)
            return
        L1a:
            r1.set(r2, r3)
            return
        L1e:
            r1.set(r2, r3)
            return
    }

    public int size() {
            r1 = this;
            java.util.Map r0 = r1.list
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(int r9) {
            r8 = this;
            javax.mail.internet.ParameterList$ToStringBuffer r0 = new javax.mail.internet.ParameterList$ToStringBuffer
            r0.<init>(r9)
            java.util.Map r9 = r8.list
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        Lf:
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L1a
            java.lang.String r9 = r0.toString()
            return r9
        L1a:
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r2 = r8.list
            java.lang.Object r2 = r2.get(r1)
            boolean r3 = r2 instanceof javax.mail.internet.ParameterList.MultiValue
            java.lang.String r4 = "*"
            if (r3 == 0) goto L82
            r3 = r2
            javax.mail.internet.ParameterList$MultiValue r3 = (javax.mail.internet.ParameterList.MultiValue) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r5 = r2.toString()
            r1 = 0
        L40:
            int r2 = r3.size()
            if (r1 < r2) goto L47
            goto Lf
        L47:
            java.lang.Object r2 = r3.get(r1)
            boolean r6 = r2 instanceof javax.mail.internet.ParameterList.Value
            if (r6 == 0) goto L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = java.lang.String.valueOf(r5)
            r6.<init>(r7)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            javax.mail.internet.ParameterList$Value r2 = (javax.mail.internet.ParameterList.Value) r2
            java.lang.String r2 = r2.encodedValue
            r0.addNV(r6, r2)
            goto L7f
        L6a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = java.lang.String.valueOf(r5)
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = (java.lang.String) r2
            r0.addNV(r6, r2)
        L7f:
            int r1 = r1 + 1
            goto L40
        L82:
            boolean r3 = r2 instanceof javax.mail.internet.ParameterList.Value
            if (r3 == 0) goto L9f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            javax.mail.internet.ParameterList$Value r2 = (javax.mail.internet.ParameterList.Value) r2
            java.lang.String r2 = r2.encodedValue
            r0.addNV(r1, r2)
            goto Lf
        L9f:
            java.lang.String r2 = (java.lang.String) r2
            r0.addNV(r1, r2)
            goto Lf
    }
}
