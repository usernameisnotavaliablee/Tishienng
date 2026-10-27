package com.sun.activation.registries;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static boolean d;
    private java.util.Map a;
    private java.util.Map b;
    private java.util.Map c;

    static {
            java.lang.String r0 = "javax.activation.addreverse"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L8
            com.sun.activation.registries.c.d = r0     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto L23
            java.lang.String r0 = "new MailcapFile: default"
            com.sun.activation.registries.b.b(r0)
        L23:
            return
    }

    public c(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.c = r0
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto L23
            java.lang.String r0 = "new MailcapFile: InputStream"
            com.sun.activation.registries.b.b(r0)
        L23:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "iso-8859-1"
            r1.<init>(r4, r2)
            r0.<init>(r1)
            r3.g(r0)
            return
    }

    public c(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.c = r0
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "new MailcapFile: file "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.sun.activation.registries.b.b(r0)
        L2f:
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L44
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41
            r2.g(r3)     // Catch: java.lang.Throwable -> L41
            r1.close()     // Catch: java.io.IOException -> L40
        L40:
            return
        L41:
            r3 = move-exception
            r0 = r1
            goto L45
        L44:
            r3 = move-exception
        L45:
            if (r0 == 0) goto L4a
            r0.close()     // Catch: java.io.IOException -> L4a
        L4a:
            throw r3
    }

    private java.util.Map f(java.util.Map r6, java.util.Map r7) {
            r5 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r6)
        Ld:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L14
            return r1
        L14:
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r1.get(r6)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L2a
            java.lang.Object r2 = r7.get(r6)
            r1.put(r6, r2)
            goto Ld
        L2a:
            java.lang.Object r3 = r7.get(r6)
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r4.addAll(r3)
            r1.put(r6, r4)
            goto Ld
    }

    private void g(java.io.Reader r7) throws java.io.IOException {
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r7)
            r7 = 0
        L6:
            r1 = r7
        L7:
            java.lang.String r2 = r0.readLine()
            if (r2 != 0) goto Le
            return
        Le:
            java.lang.String r2 = r2.trim()
            r3 = 0
            char r4 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L66
            r5 = 35
            if (r4 != r5) goto L1c
            goto L7
        L1c:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L66
            int r4 = r4 + (-1)
            char r4 = r2.charAt(r4)     // Catch: java.lang.Throwable -> L66
            r5 = 92
            if (r4 != r5) goto L4e
            if (r1 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L66
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L66
            int r5 = r5 + (-1)
            java.lang.String r2 = r2.substring(r3, r5)     // Catch: java.lang.Throwable -> L66
            r4.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L66
            goto L7
        L43:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L66
            int r4 = r4 + (-1)
            java.lang.String r1 = r2.substring(r3, r4)     // Catch: java.lang.Throwable -> L66
            goto L7
        L4e:
            if (r1 == 0) goto L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L66
            r6.h(r1)     // Catch: com.sun.activation.registries.MailcapParseException -> L60 java.lang.Throwable -> L66
            goto L6
        L60:
            goto L6
        L62:
            r6.h(r2)     // Catch: java.lang.Throwable -> L66
            goto L7
        L66:
            goto L7
    }

    protected static void i(int r8, int r9, int r10, int r11, java.lang.String r12) throws com.sun.activation.registries.MailcapParseException {
            boolean r0 = com.sun.activation.registries.b.a()
            java.lang.String r1 = " token."
            java.lang.String r2 = ", or a "
            java.lang.String r3 = ", a "
            java.lang.String r4 = ") while expecting a "
            java.lang.String r5 = " token ("
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "PARSE ERROR: Encountered a "
            r0.<init>(r6)
            java.lang.String r6 = com.sun.activation.registries.d.h(r11)
            r0.append(r6)
            r0.append(r5)
            r0.append(r12)
            r0.append(r4)
            java.lang.String r6 = com.sun.activation.registries.d.h(r8)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = com.sun.activation.registries.d.h(r9)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = com.sun.activation.registries.d.h(r10)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.sun.activation.registries.b.b(r0)
        L4c:
            com.sun.activation.registries.MailcapParseException r0 = new com.sun.activation.registries.MailcapParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Encountered a "
            r6.<init>(r7)
            java.lang.String r11 = com.sun.activation.registries.d.h(r11)
            r6.append(r11)
            r6.append(r5)
            r6.append(r12)
            r6.append(r4)
            java.lang.String r8 = com.sun.activation.registries.d.h(r8)
            r6.append(r8)
            r6.append(r3)
            java.lang.String r8 = com.sun.activation.registries.d.h(r9)
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = com.sun.activation.registries.d.h(r10)
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = r6.toString()
            r0.<init>(r8)
            throw r0
    }

    protected static void j(int r3, int r4, int r5, java.lang.String r6) throws com.sun.activation.registries.MailcapParseException {
            com.sun.activation.registries.MailcapParseException r0 = new com.sun.activation.registries.MailcapParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Encountered a "
            r1.<init>(r2)
            java.lang.String r5 = com.sun.activation.registries.d.h(r5)
            r1.append(r5)
            java.lang.String r5 = " token ("
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = ") while expecting a "
            r1.append(r5)
            java.lang.String r3 = com.sun.activation.registries.d.h(r3)
            r1.append(r3)
            java.lang.String r3 = " or a "
            r1.append(r3)
            java.lang.String r3 = com.sun.activation.registries.d.h(r4)
            r1.append(r3)
            java.lang.String r3 = " token."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    protected static void k(int r3, int r4, java.lang.String r5) throws com.sun.activation.registries.MailcapParseException {
            com.sun.activation.registries.MailcapParseException r0 = new com.sun.activation.registries.MailcapParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Encountered a "
            r1.<init>(r2)
            java.lang.String r4 = com.sun.activation.registries.d.h(r4)
            r1.append(r4)
            java.lang.String r4 = " token ("
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ") while expecting a "
            r1.append(r4)
            java.lang.String r3 = com.sun.activation.registries.d.h(r3)
            r1.append(r3)
            java.lang.String r3 = " token."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void a(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "appendToMailcap: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.sun.activation.registries.b.b(r0)
        L17:
            java.io.StringReader r0 = new java.io.StringReader     // Catch: java.io.IOException -> L1f
            r0.<init>(r3)     // Catch: java.io.IOException -> L1f
            r2.g(r0)     // Catch: java.io.IOException -> L1f
        L1f:
            return
    }

    public java.util.Map b(java.lang.String r6) {
            r5 = this;
            java.util.Map r0 = r5.b
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            r1 = 47
            int r1 = r6.indexOf(r1)
            int r1 = r1 + 1
            java.lang.String r2 = r6.substring(r1)
            java.lang.String r3 = "*"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 0
            java.lang.String r6 = r6.substring(r4, r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.<init>(r6)
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            java.util.Map r1 = r5.b
            java.lang.Object r6 = r1.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L42
            if (r0 == 0) goto L41
            java.util.Map r6 = r5.f(r0, r6)
        L41:
            return r6
        L42:
            return r0
    }

    public java.util.Map c(java.lang.String r6) {
            r5 = this;
            java.util.Map r0 = r5.a
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            r1 = 47
            int r1 = r6.indexOf(r1)
            int r1 = r1 + 1
            java.lang.String r2 = r6.substring(r1)
            java.lang.String r3 = "*"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 0
            java.lang.String r6 = r6.substring(r4, r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.<init>(r6)
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            java.util.Map r1 = r5.a
            java.lang.Object r6 = r1.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L42
            if (r0 == 0) goto L41
            java.util.Map r6 = r5.f(r0, r6)
        L41:
            return r6
        L42:
            return r0
    }

    public java.lang.String[] d() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map r1 = r2.a
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Map r1 = r2.b
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.Map r1 = r2.c
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String[] e(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.c
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L1d
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
        L1d:
            r3 = 0
            return r3
    }

    protected void h(java.lang.String r13) throws com.sun.activation.registries.MailcapParseException, java.io.IOException {
            r12 = this;
            com.sun.activation.registries.d r0 = new com.sun.activation.registries.d
            r0.<init>(r13)
            r1 = 0
            r0.l(r1)
            boolean r2 = com.sun.activation.registries.b.a()
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parse: "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.sun.activation.registries.b.b(r2)
        L20:
            int r2 = r0.i()
            r3 = 2
            if (r2 == r3) goto L2e
            java.lang.String r4 = r0.c()
            k(r3, r2, r4)
        L2e:
            java.lang.String r2 = r0.c()
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r4)
            int r5 = r0.i()
            r6 = 47
            r7 = 59
            if (r5 == r6) goto L4b
            if (r5 == r7) goto L4b
            java.lang.String r8 = r0.c()
            j(r6, r7, r5, r8)
        L4b:
            if (r5 != r6) goto L67
            int r5 = r0.i()
            if (r5 == r3) goto L5a
            java.lang.String r6 = r0.c()
            k(r3, r5, r6)
        L5a:
            java.lang.String r5 = r0.c()
            java.lang.String r4 = r5.toLowerCase(r4)
            int r5 = r0.i()
            goto L69
        L67:
            java.lang.String r4 = "*"
        L69:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.<init>(r2)
            java.lang.String r2 = "/"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            boolean r4 = com.sun.activation.registries.b.a()
            if (r4 == 0) goto L95
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "  Type: "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.sun.activation.registries.b.b(r4)
        L95:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            if (r5 == r7) goto La3
            java.lang.String r6 = r0.c()
            k(r7, r5, r6)
        La3:
            r5 = 1
            r0.l(r5)
            int r6 = r0.i()
            r0.l(r1)
            if (r6 == r3) goto Lb9
            if (r6 == r7) goto Lb9
            java.lang.String r8 = r0.c()
            j(r3, r7, r6, r8)
        Lb9:
            if (r6 != r3) goto Ld6
            java.util.Map r8 = r12.c
            java.lang.Object r8 = r8.get(r2)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto Ld3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r13)
            java.util.Map r13 = r12.c
            r13.put(r2, r8)
            goto Ld6
        Ld3:
            r8.add(r13)
        Ld6:
            if (r6 == r7) goto Ldc
            int r6 = r0.i()
        Ldc:
            r13 = 5
            if (r6 != r7) goto L21a
            r6 = 0
        Le0:
            int r8 = r0.i()
            if (r8 == r3) goto Led
            java.lang.String r9 = r0.c()
            k(r3, r8, r9)
        Led:
            java.lang.String r8 = r0.c()
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toLowerCase(r9)
            int r9 = r0.i()
            r10 = 61
            if (r9 == r10) goto L10a
            if (r9 == r7) goto L10a
            if (r9 == r13) goto L10a
            java.lang.String r11 = r0.c()
            i(r10, r7, r13, r9, r11)
        L10a:
            if (r9 != r10) goto L180
            r0.l(r5)
            int r9 = r0.i()
            r0.l(r1)
            if (r9 == r3) goto L11f
            java.lang.String r10 = r0.c()
            k(r3, r9, r10)
        L11f:
            java.lang.String r9 = r0.c()
            java.lang.String r10 = "x-java-"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L17c
            r10 = 7
            java.lang.String r8 = r8.substring(r10)
            java.lang.String r10 = "fallback-entry"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L142
            java.lang.String r10 = "true"
            boolean r10 = r9.equalsIgnoreCase(r10)
            if (r10 == 0) goto L142
            r6 = 1
            goto L17c
        L142:
            boolean r10 = com.sun.activation.registries.b.a()
            if (r10 == 0) goto L161
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "    Command: "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = ", Class: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.sun.activation.registries.b.b(r10)
        L161:
            java.lang.Object r10 = r4.get(r8)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L171
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.put(r8, r10)
        L171:
            boolean r8 = com.sun.activation.registries.c.d
            if (r8 == 0) goto L179
            r10.add(r1, r9)
            goto L17c
        L179:
            r10.add(r9)
        L17c:
            int r9 = r0.i()
        L180:
            if (r9 == r7) goto Le0
            if (r6 == 0) goto L187
            java.util.Map r13 = r12.b
            goto L189
        L187:
            java.util.Map r13 = r12.a
        L189:
            java.lang.Object r0 = r13.get(r2)
            r8 = r0
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L196
            r13.put(r2, r4)
            return
        L196:
            boolean r13 = com.sun.activation.registries.b.a()
            if (r13 == 0) goto L1ad
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Merging commands for type "
            r13.<init>(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.sun.activation.registries.b.b(r13)
        L1ad:
            java.util.Set r13 = r8.keySet()
            java.util.Iterator r9 = r13.iterator()
        L1b5:
            boolean r13 = r9.hasNext()
            if (r13 != 0) goto L1e1
            java.util.Set r13 = r4.keySet()
            java.util.Iterator r13 = r13.iterator()
        L1c3:
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L1ca
            goto L223
        L1ca:
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r8.containsKey(r0)
            if (r1 == 0) goto L1d7
            goto L1c3
        L1d7:
            java.lang.Object r1 = r4.get(r0)
            java.util.List r1 = (java.util.List) r1
            r8.put(r0, r1)
            goto L1c3
        L1e1:
            java.lang.Object r13 = r9.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r8.get(r13)
            r10 = r0
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r13 = r4.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L1f7
            goto L1b5
        L1f7:
            java.util.Iterator r11 = r13.iterator()
        L1fb:
            boolean r13 = r11.hasNext()
            if (r13 != 0) goto L202
            goto L1b5
        L202:
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = r10.contains(r13)
            if (r0 != 0) goto L1fb
            boolean r0 = com.sun.activation.registries.c.d
            if (r0 == 0) goto L216
            r10.add(r1, r13)
            goto L1fb
        L216:
            r10.add(r13)
            goto L1fb
        L21a:
            if (r6 == r13) goto L223
            java.lang.String r0 = r0.c()
            j(r13, r7, r6, r0)
        L223:
            return
    }
}
