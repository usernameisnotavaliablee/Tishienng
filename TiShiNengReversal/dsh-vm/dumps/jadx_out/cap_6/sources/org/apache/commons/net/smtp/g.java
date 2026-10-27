package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.StringBuffer d;
    private boolean e;
    private java.lang.StringBuffer f;

    public g(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.c = r2
            r0.b = r1
            r0.a = r3
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r0.d = r1
            r1 = 0
            r0.f = r1
            return
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "From cannot be null"
            r1.<init>(r2)
            throw r1
    }

    public void a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuffer r0 = r2.f
            if (r0 != 0) goto Lc
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2.f = r0
            goto L11
        Lc:
            java.lang.String r1 = ", "
            r0.append(r1)
        L11:
            java.lang.StringBuffer r0 = r2.f
            r0.append(r3)
            return
    }

    public void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Date"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            r0 = 1
            r1.e = r0
        Lf:
            java.lang.StringBuffer r0 = r1.d
            r0.append(r2)
            java.lang.StringBuffer r2 = r1.d
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.StringBuffer r2 = r1.d
            r2.append(r3)
            java.lang.StringBuffer r2 = r1.d
            r3 = 10
            r2.append(r3)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r1.<init>(r2, r3)
            boolean r2 = r4.e
            if (r2 != 0) goto L20
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            java.lang.String r2 = "Date"
            r4.b(r2, r1)
        L20:
            java.lang.StringBuffer r1 = r4.d
            int r1 = r1.length()
            if (r1 <= 0) goto L31
            java.lang.StringBuffer r1 = r4.d
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L31:
            java.lang.String r1 = "From: "
            r0.append(r1)
            java.lang.String r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r2 = r4.c
            if (r2 == 0) goto L51
            java.lang.String r2 = "To: "
            r0.append(r2)
            java.lang.String r2 = r4.c
            r0.append(r2)
            r0.append(r1)
        L51:
            java.lang.StringBuffer r2 = r4.f
            if (r2 == 0) goto L66
            java.lang.String r2 = "Cc: "
            r0.append(r2)
            java.lang.StringBuffer r2 = r4.f
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
        L66:
            java.lang.String r2 = r4.a
            if (r2 == 0) goto L77
            java.lang.String r2 = "Subject: "
            r0.append(r2)
            java.lang.String r2 = r4.a
            r0.append(r2)
            r0.append(r1)
        L77:
            r1 = 10
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
