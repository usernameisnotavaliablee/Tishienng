package org.apache.commons.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e implements org.apache.commons.net.f {
    private final java.io.PrintWriter a;
    private final boolean b;
    private final char c;
    private final boolean d;

    public e(java.io.PrintStream r2) {
            r1 = this;
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public e(java.io.PrintStream r2, boolean r3) {
            r1 = this;
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public e(java.io.PrintStream r2, boolean r3, char r4) {
            r1 = this;
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    public e(java.io.PrintStream r2, boolean r3, char r4, boolean r5) {
            r1 = this;
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r1.<init>(r0, r3, r4, r5)
            return
    }

    public e(java.io.PrintWriter r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public e(java.io.PrintWriter r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public e(java.io.PrintWriter r2, boolean r3, char r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public e(java.io.PrintWriter r1, boolean r2, char r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private java.lang.String e(java.lang.String r4) {
            r3 = this;
            char r0 = r3.c
            if (r0 != 0) goto L5
            return r4
        L5:
            java.lang.String r0 = "\r\n"
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.String r2 = r4.substring(r2, r0)
            r1.append(r2)
            char r2 = r3.c
            r1.append(r2)
            java.lang.String r4 = r4.substring(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L2a:
            return r4
    }

    @Override // org.apache.commons.net.f
    public void b(org.apache.commons.net.ProtocolCommandEvent r3) {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto Lb
            java.io.PrintWriter r0 = r2.a
            java.lang.String r1 = "< "
            r0.print(r1)
        Lb:
            java.io.PrintWriter r0 = r2.a
            java.lang.String r3 = r3.getMessage()
            r0.print(r3)
            java.io.PrintWriter r3 = r2.a
            r3.flush()
            return
    }

    @Override // org.apache.commons.net.f
    public void d(org.apache.commons.net.ProtocolCommandEvent r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto Lb
            java.io.PrintWriter r0 = r3.a
            java.lang.String r1 = "> "
            r0.print(r1)
        Lb:
            boolean r0 = r3.b
            if (r0 == 0) goto L61
            java.lang.String r0 = r4.getCommand()
            java.lang.String r1 = "PASS"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r2 = " *******"
            if (r1 != 0) goto L56
            java.lang.String r1 = "USER"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L26
            goto L56
        L26:
            java.lang.String r1 = "LOGIN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L48
            java.lang.String r4 = r4.getMessage()
            int r0 = r4.indexOf(r1)
            int r0 = r0 + 5
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)
            java.io.PrintWriter r0 = r3.a
            r0.print(r4)
            java.io.PrintWriter r4 = r3.a
            r4.println(r2)
            goto L6e
        L48:
            java.io.PrintWriter r0 = r3.a
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = r3.e(r4)
            r0.print(r4)
            goto L6e
        L56:
            java.io.PrintWriter r4 = r3.a
            r4.print(r0)
            java.io.PrintWriter r4 = r3.a
            r4.println(r2)
            goto L6e
        L61:
            java.io.PrintWriter r0 = r3.a
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = r3.e(r4)
            r0.print(r4)
        L6e:
            java.io.PrintWriter r4 = r3.a
            r4.flush()
            return
    }
}
