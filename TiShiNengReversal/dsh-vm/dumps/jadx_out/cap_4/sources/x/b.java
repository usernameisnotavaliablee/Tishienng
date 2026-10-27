package x;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements java.lang.Comparable<x.b> {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.h(r1)
            r0.k(r2)
            r0.i(r3)
            r0.j(r4)
            return
    }

    public int a(x.b r3) {
            r2 = this;
            java.lang.String r0 = r2.f
            java.lang.String r1 = "#"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.b()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            r3 = 1
            return r3
        L16:
            java.lang.String r0 = r2.f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = r3.b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r3 = -1
            return r3
        L2a:
            java.lang.String r0 = r2.e
            java.lang.String r3 = r3.d()
            int r3 = r0.compareToIgnoreCase(r3)
            return r3
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(x.b r1) {
            r0 = this;
            x.b r1 = (x.b) r1
            int r1 = r0.a(r1)
            return r1
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void h(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void i(java.lang.String r3) {
            r2 = this;
            r2.c = r3
            java.lang.String r3 = x.a.a(r3)
            r2.e = r3
            r0 = 0
            r1 = 1
            java.lang.String r3 = r3.substring(r0, r1)
            java.lang.String r3 = r3.toUpperCase()
            r2.f = r3
            java.lang.String r0 = "[A-Z]"
            boolean r3 = r3.matches(r0)
            if (r3 != 0) goto L20
            java.lang.String r3 = "#"
            r2.f = r3
        L20:
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void k(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
