package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class k implements com.orhanobut.logger.m {
    private static final int c = 2;
    private final java.lang.ThreadLocal<java.lang.String> a;
    private final java.util.List<com.orhanobut.logger.g> b;

    k() {
            r1 = this;
            r1.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String n(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            if (r3 == 0) goto La
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto La
        L6:
            java.lang.String r2 = java.lang.String.format(r2, r3)
        La:
            return r2
    }

    @androidx.annotation.Nullable
    private java.lang.String o() {
            r2 = this;
            java.lang.ThreadLocal<java.lang.String> r0 = r2.a
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L10
            java.lang.ThreadLocal<java.lang.String> r1 = r2.a
            r1.remove()
            return r0
        L10:
            r0 = 0
            return r0
    }

    private synchronized void p(int r2, @androidx.annotation.Nullable java.lang.Throwable r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.Object... r5) {
            r1 = this;
            monitor-enter(r1)
            com.orhanobut.logger.n.a(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r1.o()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r1.n(r4, r5)     // Catch: java.lang.Throwable -> L11
            r1.c(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    @Override // com.orhanobut.logger.m
    public void a(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            r0 = 7
            r1 = 0
            r2.p(r0, r1, r3, r4)
            return
    }

    @Override // com.orhanobut.logger.m
    public void b(@androidx.annotation.Nullable java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Invalid Json"
            boolean r1 = com.orhanobut.logger.n.d(r5)
            if (r1 == 0) goto Le
            java.lang.String r5 = "Empty/Null json content"
            r4.d(r5)
            return
        Le:
            r1 = 0
            java.lang.String r5 = r5.trim()     // Catch: org.json.JSONException -> L44
            java.lang.String r2 = "{"
            boolean r2 = r5.startsWith(r2)     // Catch: org.json.JSONException -> L44
            r3 = 2
            if (r2 == 0) goto L29
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r2.<init>(r5)     // Catch: org.json.JSONException -> L44
            java.lang.String r5 = r2.toString(r3)     // Catch: org.json.JSONException -> L44
            r4.d(r5)     // Catch: org.json.JSONException -> L44
            return
        L29:
            java.lang.String r2 = "["
            boolean r2 = r5.startsWith(r2)     // Catch: org.json.JSONException -> L44
            if (r2 == 0) goto L3e
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L44
            r2.<init>(r5)     // Catch: org.json.JSONException -> L44
            java.lang.String r5 = r2.toString(r3)     // Catch: org.json.JSONException -> L44
            r4.d(r5)     // Catch: org.json.JSONException -> L44
            return
        L3e:
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: org.json.JSONException -> L44
            r4.g(r0, r5)     // Catch: org.json.JSONException -> L44
            return
        L44:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r4.g(r0, r5)
            return
    }

    @Override // com.orhanobut.logger.m
    public synchronized void c(int r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.Throwable r6) {
            r2 = this;
            monitor-enter(r2)
            if (r6 == 0) goto L20
            if (r5 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r0.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = " : "
            r0.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = com.orhanobut.logger.n.c(r6)     // Catch: java.lang.Throwable -> L1e
            r0.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L4e
        L20:
            if (r6 == 0) goto L28
            if (r5 != 0) goto L28
            java.lang.String r5 = com.orhanobut.logger.n.c(r6)     // Catch: java.lang.Throwable -> L1e
        L28:
            boolean r6 = com.orhanobut.logger.n.d(r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L30
            java.lang.String r5 = "Empty/NULL log message"
        L30:
            java.util.List<com.orhanobut.logger.g> r6 = r2.b     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1e
        L36:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L1e
            com.orhanobut.logger.g r0 = (com.orhanobut.logger.g) r0     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0.b(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L36
            r0.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L1e
            goto L36
        L4c:
            monitor-exit(r2)
            return
        L4e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    @Override // com.orhanobut.logger.m
    public void d(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            java.lang.String r4 = com.orhanobut.logger.n.f(r4)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 3
            r2 = 0
            r3.p(r1, r2, r4, r0)
            return
    }

    @Override // com.orhanobut.logger.m
    public void d(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.p(r0, r1, r3, r4)
            return
    }

    @Override // com.orhanobut.logger.m
    public void e(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.p(r0, r1, r3, r4)
            return
    }

    @Override // com.orhanobut.logger.m
    public com.orhanobut.logger.m f(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.ThreadLocal<java.lang.String> r0 = r1.a
            r0.set(r2)
        L7:
            return r1
    }

    @Override // com.orhanobut.logger.m
    public void g(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            r0 = 0
            r1.j(r0, r2, r3)
            return
    }

    @Override // com.orhanobut.logger.m
    public void h(@androidx.annotation.Nullable java.lang.String r5) {
            r4 = this;
            boolean r0 = com.orhanobut.logger.n.d(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = "Empty/Null xml content"
            r4.d(r5)
            return
        Lc:
            javax.xml.transform.stream.StreamSource r0 = new javax.xml.transform.stream.StreamSource     // Catch: javax.xml.transform.TransformerException -> L4d
            java.io.StringReader r1 = new java.io.StringReader     // Catch: javax.xml.transform.TransformerException -> L4d
            r1.<init>(r5)     // Catch: javax.xml.transform.TransformerException -> L4d
            r0.<init>(r1)     // Catch: javax.xml.transform.TransformerException -> L4d
            javax.xml.transform.stream.StreamResult r5 = new javax.xml.transform.stream.StreamResult     // Catch: javax.xml.transform.TransformerException -> L4d
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: javax.xml.transform.TransformerException -> L4d
            r1.<init>()     // Catch: javax.xml.transform.TransformerException -> L4d
            r5.<init>(r1)     // Catch: javax.xml.transform.TransformerException -> L4d
            javax.xml.transform.TransformerFactory r1 = javax.xml.transform.TransformerFactory.newInstance()     // Catch: javax.xml.transform.TransformerException -> L4d
            javax.xml.transform.Transformer r1 = r1.newTransformer()     // Catch: javax.xml.transform.TransformerException -> L4d
            java.lang.String r2 = "indent"
            java.lang.String r3 = "yes"
            r1.setOutputProperty(r2, r3)     // Catch: javax.xml.transform.TransformerException -> L4d
            java.lang.String r2 = "{http://xml.apache.org/xslt}indent-amount"
            java.lang.String r3 = "2"
            r1.setOutputProperty(r2, r3)     // Catch: javax.xml.transform.TransformerException -> L4d
            r1.transform(r0, r5)     // Catch: javax.xml.transform.TransformerException -> L4d
            java.io.Writer r5 = r5.getWriter()     // Catch: javax.xml.transform.TransformerException -> L4d
            java.lang.String r5 = r5.toString()     // Catch: javax.xml.transform.TransformerException -> L4d
            java.lang.String r0 = ">"
            java.lang.String r1 = ">\n"
            java.lang.String r5 = r5.replaceFirst(r0, r1)     // Catch: javax.xml.transform.TransformerException -> L4d
            r4.d(r5)     // Catch: javax.xml.transform.TransformerException -> L4d
            return
        L4d:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "Invalid xml"
            r4.g(r0, r5)
            return
    }

    @Override // com.orhanobut.logger.m
    public void i(@androidx.annotation.NonNull com.orhanobut.logger.g r2) {
            r1 = this;
            java.util.List<com.orhanobut.logger.g> r0 = r1.b
            java.lang.Object r2 = com.orhanobut.logger.n.a(r2)
            r0.add(r2)
            return
    }

    @Override // com.orhanobut.logger.m
    public void j(@androidx.annotation.Nullable java.lang.Throwable r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r1 = this;
            r0 = 6
            r1.p(r0, r2, r3, r4)
            return
    }

    @Override // com.orhanobut.logger.m
    public void k() {
            r1 = this;
            java.util.List<com.orhanobut.logger.g> r0 = r1.b
            r0.clear()
            return
    }

    @Override // com.orhanobut.logger.m
    public void l(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.p(r0, r1, r3, r4)
            return
    }

    @Override // com.orhanobut.logger.m
    public void m(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            r0 = 5
            r1 = 0
            r2.p(r0, r1, r3, r4)
            return
    }
}
