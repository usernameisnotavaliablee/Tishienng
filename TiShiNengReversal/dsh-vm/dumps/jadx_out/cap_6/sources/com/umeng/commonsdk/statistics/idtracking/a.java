package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class a {
    private final int a;
    private final int b;
    private final java.lang.String c;
    private java.util.List<com.umeng.commonsdk.statistics.proto.a> d;
    private com.umeng.commonsdk.statistics.proto.b e;

    public a(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.a = r0
            r0 = 100
            r1.b = r0
            r1.c = r2
            return
    }

    private boolean g() {
            r8 = this;
            com.umeng.commonsdk.statistics.proto.b r0 = r8.e
            if (r0 != 0) goto L6
            r1 = 0
            goto La
        L6:
            java.lang.String r1 = r0.b()
        La:
            r2 = 0
            if (r0 != 0) goto Lf
            r3 = 0
            goto L13
        Lf:
            int r3 = r0.h()
        L13:
            java.lang.String r4 = r8.f()
            java.lang.String r4 = r8.a(r4)
            if (r4 == 0) goto L73
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L73
            if (r0 != 0) goto L2a
            com.umeng.commonsdk.statistics.proto.b r0 = new com.umeng.commonsdk.statistics.proto.b
            r0.<init>()
        L2a:
            r0.a(r4)
            long r5 = java.lang.System.currentTimeMillis()
            r0.a(r5)
            r5 = 1
            int r3 = r3 + r5
            r0.a(r3)
            com.umeng.commonsdk.statistics.proto.a r3 = new com.umeng.commonsdk.statistics.proto.a
            r3.<init>()
            java.lang.String r6 = r8.c
            r3.a(r6)
            r3.c(r4)
            r3.b(r1)
            long r6 = r0.e()
            r3.a(r6)
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r8.d
            if (r1 != 0) goto L5c
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 2
            r1.<init>(r4)
            r8.d = r1
        L5c:
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r8.d
            r1.add(r3)
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r8.d
            int r1 = r1.size()
            r3 = 10
            if (r1 <= r3) goto L70
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r8.d
            r1.remove(r2)
        L70:
            r8.e = r0
            return r5
        L73:
            return r2
    }

    public java.lang.String a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.trim()
            int r1 = r4.length()
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L18
            return r0
        L18:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r1)
            java.lang.String r2 = "unknown"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L27
            return r0
        L27:
            return r4
    }

    public void a(com.umeng.commonsdk.statistics.proto.b r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(com.umeng.commonsdk.statistics.proto.c r4) {
            r3 = this;
            java.util.Map r0 = r4.c()
            java.lang.String r1 = r3.c
            java.lang.Object r0 = r0.get(r1)
            com.umeng.commonsdk.statistics.proto.b r0 = (com.umeng.commonsdk.statistics.proto.b) r0
            r3.e = r0
            java.util.List r4 = r4.h()
            if (r4 == 0) goto L45
            int r0 = r4.size()
            if (r0 <= 0) goto L45
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r3.d
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d = r0
        L25:
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.next()
            com.umeng.commonsdk.statistics.proto.a r0 = (com.umeng.commonsdk.statistics.proto.a) r0
            java.lang.String r1 = r3.c
            java.lang.String r2 = r0.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L29
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r1 = r3.d
            r1.add(r0)
            goto L29
        L45:
            return
    }

    public void a(java.util.List<com.umeng.commonsdk.statistics.proto.a> r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.g()
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public boolean c() {
            r2 = this;
            com.umeng.commonsdk.statistics.proto.b r0 = r2.e
            if (r0 == 0) goto Le
            int r0 = r0.h()
            r1 = 100
            if (r0 <= r1) goto Le
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
            r1 = this;
            com.umeng.commonsdk.statistics.proto.b r0 = r1.e
            return r0
    }

    public java.util.List<com.umeng.commonsdk.statistics.proto.a> e() {
            r1 = this;
            java.util.List<com.umeng.commonsdk.statistics.proto.a> r0 = r1.d
            return r0
    }

    public abstract java.lang.String f();
}
