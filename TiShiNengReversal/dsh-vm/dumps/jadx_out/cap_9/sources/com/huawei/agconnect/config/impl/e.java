package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class e extends i1.a {
    private final android.content.Context c;
    private final java.lang.String d;
    private i1.b e;
    private volatile com.huawei.agconnect.config.impl.f f;
    private final java.lang.Object g;
    private com.huawei.agconnect.b h;
    private final java.util.Map<java.lang.String, java.lang.String> i;
    private volatile com.huawei.agconnect.config.impl.g j;

    static class a extends i1.b {
        final /* synthetic */ java.io.InputStream c;

        a(android.content.Context r1, java.io.InputStream r2) {
                r0 = this;
                r0.c = r2
                r0.<init>(r1)
                return
        }

        public java.io.InputStream b(android.content.Context r1) {
                r0 = this;
                java.io.InputStream r1 = r0.c
                return r1
        }
    }

    public e(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.g = r0
            com.huawei.agconnect.b r0 = com.huawei.agconnect.b.b
            r1.h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.i = r0
            r1.c = r2
            r1.d = r3
            return
    }

    private static i1.b j(android.content.Context r1, java.io.InputStream r2) {
            com.huawei.agconnect.config.impl.e$a r0 = new com.huawei.agconnect.config.impl.e$a
            r0.<init>(r1, r2)
            return r0
    }

    private static java.lang.String k(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 47
            r2 = 0
            if (r0 <= 0) goto L12
        L9:
            char r0 = r3.charAt(r2)
            if (r0 != r1) goto L12
            int r2 = r2 + 1
            goto L9
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r3 = r3.substring(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private void l() {
            r4 = this;
            com.huawei.agconnect.config.impl.f r0 = r4.f
            if (r0 != 0) goto L42
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            com.huawei.agconnect.config.impl.f r1 = r4.f     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L3b
            i1.b r1 = r4.e     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            java.io.InputStream r1 = r1.c()     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.config.impl.j r2 = new com.huawei.agconnect.config.impl.j     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L25
            r4.f = r2     // Catch: java.lang.Throwable -> L25
            i1.b r1 = r4.e     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            r1 = 0
            r4.e = r1     // Catch: java.lang.Throwable -> L25
            goto L32
        L25:
            r1 = move-exception
            goto L40
        L27:
            com.huawei.agconnect.config.impl.m r1 = new com.huawei.agconnect.config.impl.m     // Catch: java.lang.Throwable -> L25
            android.content.Context r2 = r4.c     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r4.d     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L25
            r4.f = r1     // Catch: java.lang.Throwable -> L25
        L32:
            com.huawei.agconnect.config.impl.g r1 = new com.huawei.agconnect.config.impl.g     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.config.impl.f r2 = r4.f     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r4.j = r1     // Catch: java.lang.Throwable -> L25
        L3b:
            r4.n()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
        L42:
            return
    }

    private java.lang.String m(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = com.huawei.agconnect.i.a()
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.Object r4 = r0.get(r4)
            com.huawei.agconnect.i$a r4 = (com.huawei.agconnect.i.a) r4
            if (r4 == 0) goto L19
            java.lang.String r4 = r4.a(r3)
            return r4
        L19:
            return r2
    }

    private void n() {
            r4 = this;
            com.huawei.agconnect.b r0 = r4.h
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.b
            if (r0 != r1) goto L21
            com.huawei.agconnect.config.impl.f r0 = r4.f
            if (r0 == 0) goto L21
            com.huawei.agconnect.config.impl.f r0 = r4.f
            java.lang.String r1 = "/region"
            r2 = 0
            java.lang.String r0 = r0.a(r1, r2)
            com.huawei.agconnect.config.impl.f r1 = r4.f
            java.lang.String r3 = "/agcgw/url"
            java.lang.String r1 = r1.a(r3, r2)
            com.huawei.agconnect.b r0 = com.huawei.agconnect.config.impl.b.f(r0, r1)
            r4.h = r0
        L21:
            return
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.getBoolean(r2, r0)
            return r2
    }

    public int b(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.getInt(r2, r0)
            return r2
    }

    public com.huawei.agconnect.b c() {
            r2 = this;
            com.huawei.agconnect.b r0 = r2.h
            if (r0 != 0) goto L8
            com.huawei.agconnect.b r0 = com.huawei.agconnect.b.b
            r2.h = r0
        L8:
            com.huawei.agconnect.b r0 = r2.h
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.b
            if (r0 != r1) goto L15
            com.huawei.agconnect.config.impl.f r0 = r2.f
            if (r0 != 0) goto L15
            r2.l()
        L15:
            com.huawei.agconnect.b r0 = r2.h
            if (r0 != 0) goto L1a
            return r1
        L1a:
            return r0
    }

    public void f(i1.b r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void g(java.io.InputStream r2) {
            r1 = this;
            android.content.Context r0 = r1.c
            i1.b r2 = j(r0, r2)
            r1.f(r2)
            return
    }

    public boolean getBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r0.getString(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            return r1
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.c
            return r0
    }

    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = "DEFAULT_INSTANCE"
            return r0
    }

    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: java.lang.NumberFormatException -> Ld
            java.lang.String r2 = r1.getString(r2, r0)     // Catch: java.lang.NumberFormatException -> Ld
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Ld
            return r2
        Ld:
            return r3
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L32
            com.huawei.agconnect.config.impl.f r0 = r1.f
            if (r0 != 0) goto L9
            r1.l()
        L9:
            java.lang.String r2 = k(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.i
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L18
            return r0
        L18:
            java.lang.String r0 = r1.m(r2)
            if (r0 == 0) goto L1f
            return r0
        L1f:
            com.huawei.agconnect.config.impl.f r0 = r1.f
            java.lang.String r2 = r0.a(r2, r3)
            boolean r0 = com.huawei.agconnect.config.impl.g.c(r2)
            if (r0 == 0) goto L31
            com.huawei.agconnect.config.impl.g r0 = r1.j
            java.lang.String r2 = r0.a(r2, r3)
        L31:
            return r2
        L32:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "path must not be null."
            r2.<init>(r3)
            throw r2
    }

    public void h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.i
            java.lang.String r2 = com.huawei.agconnect.config.impl.b.e(r2)
            r0.put(r2, r3)
            return
    }

    public void i(com.huawei.agconnect.b r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
