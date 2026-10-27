package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DnsResponseCode implements java.lang.Comparable<io.netty.handler.codec.dns.DnsResponseCode> {
    public static final io.netty.handler.codec.dns.DnsResponseCode BADALG = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode BADKEY = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode BADMODE = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode BADNAME = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode BADTIME = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode BADVERS_OR_BADSIG = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode FORMERR = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NOERROR = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NOTAUTH = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NOTIMP = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NOTZONE = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NXDOMAIN = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode NXRRSET = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode REFUSED = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode SERVFAIL = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode YXDOMAIN = null;
    public static final io.netty.handler.codec.dns.DnsResponseCode YXRRSET = null;
    private final int code;
    private final java.lang.String name;
    private java.lang.String text;

    static {
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 0
            java.lang.String r2 = "NoError"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NOERROR = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 1
            java.lang.String r2 = "FormErr"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.FORMERR = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 2
            java.lang.String r2 = "ServFail"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.SERVFAIL = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 3
            java.lang.String r2 = "NXDomain"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NXDOMAIN = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 4
            java.lang.String r2 = "NotImp"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NOTIMP = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 5
            java.lang.String r2 = "Refused"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.REFUSED = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 6
            java.lang.String r2 = "YXDomain"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.YXDOMAIN = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 7
            java.lang.String r2 = "YXRRSet"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.YXRRSET = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 8
            java.lang.String r2 = "NXRRSet"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NXRRSET = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 9
            java.lang.String r2 = "NotAuth"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NOTAUTH = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 10
            java.lang.String r2 = "NotZone"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.NOTZONE = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 16
            java.lang.String r2 = "BADVERS_OR_BADSIG"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADVERS_OR_BADSIG = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 17
            java.lang.String r2 = "BADKEY"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADKEY = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 18
            java.lang.String r2 = "BADTIME"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADTIME = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 19
            java.lang.String r2 = "BADMODE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADMODE = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 20
            java.lang.String r2 = "BADNAME"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADNAME = r0
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r1 = 21
            java.lang.String r2 = "BADALG"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsResponseCode.BADALG = r0
            return
    }

    private DnsResponseCode(int r2) {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            r1.<init>(r2, r0)
            return
    }

    public DnsResponseCode(int r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L17
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L17
            r2.code = r3
            java.lang.String r3 = "name"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.name = r3
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: 0 ~ 65535)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public static io.netty.handler.codec.dns.DnsResponseCode valueOf(int r1) {
            switch(r1) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L2a;
                case 7: goto L27;
                case 8: goto L24;
                case 9: goto L21;
                case 10: goto L1e;
                default: goto L3;
            }
        L3:
            switch(r1) {
                case 16: goto L1b;
                case 17: goto L18;
                case 18: goto L15;
                case 19: goto L12;
                case 20: goto Lf;
                case 21: goto Lc;
                default: goto L6;
            }
        L6:
            io.netty.handler.codec.dns.DnsResponseCode r0 = new io.netty.handler.codec.dns.DnsResponseCode
            r0.<init>(r1)
            return r0
        Lc:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADALG
            return r1
        Lf:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADNAME
            return r1
        L12:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADMODE
            return r1
        L15:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADTIME
            return r1
        L18:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADKEY
            return r1
        L1b:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.BADVERS_OR_BADSIG
            return r1
        L1e:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NOTZONE
            return r1
        L21:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NOTAUTH
            return r1
        L24:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NXRRSET
            return r1
        L27:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.YXRRSET
            return r1
        L2a:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.YXDOMAIN
            return r1
        L2d:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.REFUSED
            return r1
        L30:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NOTIMP
            return r1
        L33:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NXDOMAIN
            return r1
        L36:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.SERVFAIL
            return r1
        L39:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.FORMERR
            return r1
        L3c:
            io.netty.handler.codec.dns.DnsResponseCode r1 = io.netty.handler.codec.dns.DnsResponseCode.NOERROR
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.dns.DnsResponseCode r2) {
            r1 = this;
            int r0 = r1.intValue()
            int r2 = r2.intValue()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.dns.DnsResponseCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsResponseCode r1 = (io.netty.handler.codec.dns.DnsResponseCode) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.dns.DnsResponseCode
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.intValue()
            io.netty.handler.codec.dns.DnsResponseCode r3 = (io.netty.handler.codec.dns.DnsResponseCode) r3
            int r3 = r3.intValue()
            if (r0 != r3) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.intValue()
            return r0
    }

    public int intValue() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.text
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            int r1 = r2.intValue()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.text = r0
        L25:
            return r0
    }
}
