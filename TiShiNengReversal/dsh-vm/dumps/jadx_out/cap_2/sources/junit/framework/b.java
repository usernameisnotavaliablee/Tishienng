package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b {
    private static final java.lang.String f = "...";
    private static final java.lang.String g = "]";
    private static final java.lang.String h = "[";
    private int a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;
    private int e;

    public b(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private boolean a() {
            r2 = this;
            java.lang.String r0 = r2.b
            java.lang.String r1 = r2.c
            boolean r0 = r0.equals(r1)
            return r0
    }

    private java.lang.String c(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int r1 = r4.d
            int r2 = r5.length()
            int r3 = r4.e
            int r2 = r2 - r3
            int r2 = r2 + 1
            java.lang.String r5 = r5.substring(r1, r2)
            r0.append(r5)
            java.lang.String r5 = "]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            int r0 = r4.d
            if (r0 <= 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.d()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L3c:
            int r0 = r4.e
            if (r0 <= 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = r4.e()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L53:
            return r5
    }

    private java.lang.String d() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.d
            int r2 = r4.a
            if (r1 <= r2) goto Le
            java.lang.String r1 = "..."
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            r0.append(r1)
            java.lang.String r1 = r4.b
            int r2 = r4.d
            int r3 = r4.a
            int r2 = r2 - r3
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r4.d
            java.lang.String r1 = r1.substring(r2, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String e() {
            r5 = this;
            java.lang.String r0 = r5.b
            int r0 = r0.length()
            int r1 = r5.e
            int r0 = r0 - r1
            int r0 = r0 + 1
            int r1 = r5.a
            int r0 = r0 + r1
            java.lang.String r1 = r5.b
            int r1 = r1.length()
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.b
            int r3 = r2.length()
            int r4 = r5.e
            int r3 = r3 - r4
            int r3 = r3 + 1
            java.lang.String r0 = r2.substring(r3, r0)
            r1.append(r0)
            java.lang.String r0 = r5.b
            int r0 = r0.length()
            int r2 = r5.e
            int r0 = r0 - r2
            int r0 = r0 + 1
            java.lang.String r2 = r5.b
            int r2 = r2.length()
            int r3 = r5.a
            int r2 = r2 - r3
            if (r0 >= r2) goto L48
            java.lang.String r0 = "..."
            goto L4a
        L48:
            java.lang.String r0 = ""
        L4a:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private void f() {
            r4 = this;
            r0 = 0
            r4.d = r0
            java.lang.String r0 = r4.b
            int r0 = r0.length()
            java.lang.String r1 = r4.c
            int r1 = r1.length()
            int r0 = java.lang.Math.min(r0, r1)
        L13:
            int r1 = r4.d
            if (r1 >= r0) goto L2f
            java.lang.String r2 = r4.b
            char r1 = r2.charAt(r1)
            java.lang.String r2 = r4.c
            int r3 = r4.d
            char r2 = r2.charAt(r3)
            if (r1 == r2) goto L28
            goto L2f
        L28:
            int r1 = r4.d
            int r1 = r1 + 1
            r4.d = r1
            goto L13
        L2f:
            return
    }

    private void g() {
            r4 = this;
            java.lang.String r0 = r4.b
            int r0 = r0.length()
            int r0 = r0 + (-1)
            java.lang.String r1 = r4.c
            int r1 = r1.length()
            int r1 = r1 + (-1)
        L10:
            int r2 = r4.d
            if (r1 < r2) goto L2a
            if (r0 < r2) goto L2a
            java.lang.String r2 = r4.b
            char r2 = r2.charAt(r0)
            java.lang.String r3 = r4.c
            char r3 = r3.charAt(r1)
            if (r2 == r3) goto L25
            goto L2a
        L25:
            int r1 = r1 + (-1)
            int r0 = r0 + (-1)
            goto L10
        L2a:
            java.lang.String r1 = r4.b
            int r1 = r1.length()
            int r1 = r1 - r0
            r4.e = r1
            return
    }

    public java.lang.String b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.b
            if (r0 == 0) goto L26
            java.lang.String r0 = r2.c
            if (r0 == 0) goto L26
            boolean r0 = r2.a()
            if (r0 == 0) goto Lf
            goto L26
        Lf:
            r2.f()
            r2.g()
            java.lang.String r0 = r2.b
            java.lang.String r0 = r2.c(r0)
            java.lang.String r1 = r2.c
            java.lang.String r1 = r2.c(r1)
            java.lang.String r3 = junit.framework.a.N(r3, r0, r1)
            return r3
        L26:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r2.c
            java.lang.String r3 = junit.framework.a.N(r3, r0, r1)
            return r3
    }
}
