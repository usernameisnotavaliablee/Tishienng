package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public static final java.lang.String i = "UNIX";
    public static final java.lang.String j = "UNIX_LTRIM";
    public static final java.lang.String k = "VMS";
    public static final java.lang.String l = "WINDOWS";
    public static final java.lang.String m = "OS/2";
    public static final java.lang.String n = "OS/400";
    public static final java.lang.String o = "AS/400";
    public static final java.lang.String p = "MVS";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f50q = "TYPE: L8";
    public static final java.lang.String r = "NETWARE";
    public static final java.lang.String s = "MACOS PETER";
    private static final java.util.Map<java.lang.String, java.lang.Object> t = null;
    private final java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private boolean h;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            org.apache.commons.net.ftp.d.t = r0
            java.lang.String r1 = "en"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0.put(r1, r2)
            java.lang.String r1 = "de"
            java.util.Locale r2 = java.util.Locale.GERMAN
            r0.put(r1, r2)
            java.lang.String r1 = "it"
            java.util.Locale r2 = java.util.Locale.ITALIAN
            r0.put(r1, r2)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "es"
            java.lang.String r3 = ""
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "pt"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "da"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "sv"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "no"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "nl"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "ro"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "sq"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "sh"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "sk"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "sl"
            r1.<init>(r2, r3, r3)
            r0.put(r2, r1)
            java.lang.String r1 = "fr"
            java.lang.String r2 = "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc"
            r0.put(r1, r2)
            return
    }

    public d() {
            r1 = this;
            java.lang.String r0 = "UNIX"
            r1.<init>(r0)
            return
    }

    public d(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.c = r0
            r1 = 1
            r2.d = r1
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r0 = 0
            r2.h = r0
            r2.a = r3
            return
    }

    public d(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            r0.c = r3
            return
    }

    public d(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            r0.c = r3
            r0.e = r4
            r0.f = r5
            r0.g = r6
            return
    }

    public d(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            r0.d = r7
            r0.c = r3
            r0.h = r8
            r0.e = r4
            r0.f = r5
            r0.g = r6
            return
    }

    d(java.lang.String r3, org.apache.commons.net.ftp.d r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.c = r0
            r1 = 1
            r2.d = r1
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r0 = 0
            r2.h = r0
            r2.a = r3
            java.lang.String r3 = r4.b
            r2.b = r3
            boolean r3 = r4.d
            r2.d = r3
            java.lang.String r3 = r4.c
            r2.c = r3
            boolean r3 = r4.h
            r2.h = r3
            java.lang.String r3 = r4.e
            r2.e = r3
            java.lang.String r3 = r4.g
            r2.g = r3
            java.lang.String r3 = r4.f
            r2.f = r3
            return
    }

    public d(org.apache.commons.net.ftp.d r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.c = r0
            r1 = 1
            r2.d = r1
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r0 = 0
            r2.h = r0
            java.lang.String r0 = r3.a
            r2.a = r0
            java.lang.String r0 = r3.b
            r2.b = r0
            boolean r0 = r3.d
            r2.d = r0
            java.lang.String r0 = r3.c
            r2.c = r0
            boolean r0 = r3.h
            r2.h = r0
            java.lang.String r0 = r3.e
            r2.e = r0
            java.lang.String r0 = r3.g
            r2.g = r0
            java.lang.String r3 = r3.f
            r2.f = r3
            return
    }

    public static java.text.DateFormatSymbols a(java.lang.String r2) {
            java.lang.String[] r2 = s(r2)
            java.text.DateFormatSymbols r0 = new java.text.DateFormatSymbols
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r1)
            r0.setShortMonths(r2)
            return r0
    }

    public static java.util.Collection<java.lang.String> h() {
            java.util.Map<java.lang.String, java.lang.Object> r0 = org.apache.commons.net.ftp.d.t
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public static java.text.DateFormatSymbols k(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = org.apache.commons.net.ftp.d.t
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L1f
            boolean r0 = r1 instanceof java.util.Locale
            if (r0 == 0) goto L14
            java.text.DateFormatSymbols r0 = new java.text.DateFormatSymbols
            java.util.Locale r1 = (java.util.Locale) r1
            r0.<init>(r1)
            return r0
        L14:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L1f
            java.lang.String r1 = (java.lang.String) r1
            java.text.DateFormatSymbols r1 = a(r1)
            return r1
        L1f:
            java.text.DateFormatSymbols r1 = new java.text.DateFormatSymbols
            java.util.Locale r0 = java.util.Locale.US
            r1.<init>(r0)
            return r1
    }

    private static java.lang.String[] s(java.lang.String r4) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "|"
            r0.<init>(r4, r1)
            int r4 = r0.countTokens()
            r1 = 12
            if (r1 != r4) goto L29
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]
            r1 = 0
        L14:
            boolean r2 = r0.hasMoreTokens()
            if (r2 == 0) goto L24
            int r2 = r1 + 1
            java.lang.String r3 = r0.nextToken()
            r4[r1] = r3
            r1 = r2
            goto L14
        L24:
            java.lang.String r0 = ""
            r4[r1] = r0
            return r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "expecting a pipe-delimited string containing 12 tokens"
            r4.<init>(r0)
            throw r4
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void l(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void m(boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void n(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void o(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void p(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void q(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void r(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
