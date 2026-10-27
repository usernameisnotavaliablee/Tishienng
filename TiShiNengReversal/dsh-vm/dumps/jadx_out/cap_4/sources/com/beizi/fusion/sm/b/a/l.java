package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l {
    private static com.beizi.fusion.sm.b.c a;

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.beizi.fusion.sm.b.c a(android.content.Context r1) {
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof android.app.Application
            if (r0 != 0) goto Le
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
        Le:
            com.beizi.fusion.sm.b.c r0 = com.beizi.fusion.sm.b.a.l.a
            if (r0 == 0) goto L13
            return r0
        L13:
            com.beizi.fusion.sm.b.c r0 = b(r1)
            com.beizi.fusion.sm.b.a.l.a = r0
            if (r0 == 0) goto L42
            boolean r0 = r0.a()
            if (r0 == 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Manufacturer interface has been found: "
            r1.append(r0)
            com.beizi.fusion.sm.b.c r0 = com.beizi.fusion.sm.b.a.l.a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.beizi.fusion.sm.b.e.a(r1)
            com.beizi.fusion.sm.b.c r1 = com.beizi.fusion.sm.b.a.l.a
            return r1
        L42:
            com.beizi.fusion.sm.b.c r1 = c(r1)
            com.beizi.fusion.sm.b.a.l.a = r1
            return r1
    }

    private static com.beizi.fusion.sm.b.c b(android.content.Context r1) {
            boolean r0 = com.beizi.fusion.sm.b.f.k()
            if (r0 != 0) goto Lb0
            boolean r0 = com.beizi.fusion.sm.b.f.n()
            if (r0 == 0) goto Le
            goto Lb0
        Le:
            boolean r0 = com.beizi.fusion.sm.b.f.j()
            if (r0 == 0) goto L1a
            com.beizi.fusion.sm.b.a.i r0 = new com.beizi.fusion.sm.b.a.i
            r0.<init>(r1)
            return r0
        L1a:
            boolean r0 = com.beizi.fusion.sm.b.f.l()
            if (r0 == 0) goto L26
            com.beizi.fusion.sm.b.a.k r0 = new com.beizi.fusion.sm.b.a.k
            r0.<init>(r1)
            return r0
        L26:
            boolean r0 = com.beizi.fusion.sm.b.f.e()
            if (r0 != 0) goto Laa
            boolean r0 = com.beizi.fusion.sm.b.f.f()
            if (r0 != 0) goto Laa
            boolean r0 = com.beizi.fusion.sm.b.f.g()
            if (r0 == 0) goto L3a
            goto Laa
        L3a:
            boolean r0 = com.beizi.fusion.sm.b.f.i()
            if (r0 == 0) goto L46
            com.beizi.fusion.sm.b.a.o r0 = new com.beizi.fusion.sm.b.a.o
            r0.<init>(r1)
            return r0
        L46:
            boolean r0 = com.beizi.fusion.sm.b.f.d()
            if (r0 == 0) goto L52
            com.beizi.fusion.sm.b.a.p r0 = new com.beizi.fusion.sm.b.a.p
            r0.<init>(r1)
            return r0
        L52:
            boolean r0 = com.beizi.fusion.sm.b.f.m()
            if (r0 == 0) goto L5e
            com.beizi.fusion.sm.b.a.a r0 = new com.beizi.fusion.sm.b.a.a
            r0.<init>(r1)
            return r0
        L5e:
            boolean r0 = com.beizi.fusion.sm.b.f.a()
            if (r0 != 0) goto La4
            boolean r0 = com.beizi.fusion.sm.b.f.b()
            if (r0 == 0) goto L6b
            goto La4
        L6b:
            boolean r0 = com.beizi.fusion.sm.b.f.c()
            if (r0 != 0) goto L9e
            boolean r0 = com.beizi.fusion.sm.b.f.h()
            if (r0 == 0) goto L78
            goto L9e
        L78:
            boolean r0 = com.beizi.fusion.sm.b.f.a(r1)
            if (r0 == 0) goto L84
            com.beizi.fusion.sm.b.a.b r0 = new com.beizi.fusion.sm.b.a.b
            r0.<init>(r1)
            return r0
        L84:
            boolean r0 = com.beizi.fusion.sm.b.f.p()
            if (r0 == 0) goto L90
            com.beizi.fusion.sm.b.a.c r0 = new com.beizi.fusion.sm.b.a.c
            r0.<init>(r1)
            return r0
        L90:
            boolean r0 = com.beizi.fusion.sm.b.f.o()
            if (r0 == 0) goto L9c
            com.beizi.fusion.sm.b.a.e r0 = new com.beizi.fusion.sm.b.a.e
            r0.<init>(r1)
            return r0
        L9c:
            r1 = 0
            return r1
        L9e:
            com.beizi.fusion.sm.b.a.n r0 = new com.beizi.fusion.sm.b.a.n
            r0.<init>(r1)
            return r0
        La4:
            com.beizi.fusion.sm.b.a.g r0 = new com.beizi.fusion.sm.b.a.g
            r0.<init>(r1)
            return r0
        Laa:
            com.beizi.fusion.sm.b.a.q r0 = new com.beizi.fusion.sm.b.a.q
            r0.<init>(r1)
            return r0
        Lb0:
            com.beizi.fusion.sm.b.a.h r0 = new com.beizi.fusion.sm.b.a.h
            r0.<init>(r1)
            return r0
    }

    private static com.beizi.fusion.sm.b.c c(android.content.Context r2) {
            com.beizi.fusion.sm.b.a.j r0 = new com.beizi.fusion.sm.b.a.j
            r0.<init>(r2)
            boolean r1 = r0.a()
            if (r1 == 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Mobile Security Alliance has been found: "
            r2.append(r1)
            java.lang.Class<com.beizi.fusion.sm.b.a.j> r1 = com.beizi.fusion.sm.b.a.j.class
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.beizi.fusion.sm.b.e.a(r2)
            return r0
        L26:
            com.beizi.fusion.sm.b.a.f r0 = new com.beizi.fusion.sm.b.a.f
            r0.<init>(r2)
            boolean r2 = r0.a()
            if (r2 == 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Google Play Service has been found: "
            r2.append(r1)
            java.lang.Class<com.beizi.fusion.sm.b.a.f> r1 = com.beizi.fusion.sm.b.a.f.class
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.beizi.fusion.sm.b.e.a(r2)
            return r0
        L4c:
            com.beizi.fusion.sm.b.a.d r2 = new com.beizi.fusion.sm.b.a.d
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OAID was not supported: "
            r0.append(r1)
            java.lang.Class<com.beizi.fusion.sm.b.a.d> r1 = com.beizi.fusion.sm.b.a.d.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.beizi.fusion.sm.b.e.a(r0)
            return r2
    }
}
