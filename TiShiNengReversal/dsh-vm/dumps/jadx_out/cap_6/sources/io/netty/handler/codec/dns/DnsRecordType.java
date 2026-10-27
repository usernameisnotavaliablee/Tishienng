package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DnsRecordType implements java.lang.Comparable<io.netty.handler.codec.dns.DnsRecordType> {
    public static final io.netty.handler.codec.dns.DnsRecordType A = null;
    public static final io.netty.handler.codec.dns.DnsRecordType AAAA = null;
    public static final io.netty.handler.codec.dns.DnsRecordType AFSDB = null;
    public static final io.netty.handler.codec.dns.DnsRecordType ANY = null;
    public static final io.netty.handler.codec.dns.DnsRecordType APL = null;
    public static final io.netty.handler.codec.dns.DnsRecordType AXFR = null;
    private static final java.util.Map<java.lang.String, io.netty.handler.codec.dns.DnsRecordType> BY_NAME = null;
    private static final io.netty.util.collection.IntObjectHashMap<io.netty.handler.codec.dns.DnsRecordType> BY_TYPE = null;
    public static final io.netty.handler.codec.dns.DnsRecordType CAA = null;
    public static final io.netty.handler.codec.dns.DnsRecordType CERT = null;
    public static final io.netty.handler.codec.dns.DnsRecordType CNAME = null;
    public static final io.netty.handler.codec.dns.DnsRecordType DHCID = null;
    public static final io.netty.handler.codec.dns.DnsRecordType DLV = null;
    public static final io.netty.handler.codec.dns.DnsRecordType DNAME = null;
    public static final io.netty.handler.codec.dns.DnsRecordType DNSKEY = null;
    public static final io.netty.handler.codec.dns.DnsRecordType DS = null;
    private static final java.lang.String EXPECTED = null;
    public static final io.netty.handler.codec.dns.DnsRecordType HIP = null;
    public static final io.netty.handler.codec.dns.DnsRecordType IPSECKEY = null;
    public static final io.netty.handler.codec.dns.DnsRecordType IXFR = null;
    public static final io.netty.handler.codec.dns.DnsRecordType KEY = null;
    public static final io.netty.handler.codec.dns.DnsRecordType KX = null;
    public static final io.netty.handler.codec.dns.DnsRecordType LOC = null;
    public static final io.netty.handler.codec.dns.DnsRecordType MX = null;
    public static final io.netty.handler.codec.dns.DnsRecordType NAPTR = null;
    public static final io.netty.handler.codec.dns.DnsRecordType NS = null;
    public static final io.netty.handler.codec.dns.DnsRecordType NSEC = null;
    public static final io.netty.handler.codec.dns.DnsRecordType NSEC3 = null;
    public static final io.netty.handler.codec.dns.DnsRecordType NSEC3PARAM = null;
    public static final io.netty.handler.codec.dns.DnsRecordType OPT = null;
    public static final io.netty.handler.codec.dns.DnsRecordType PTR = null;
    public static final io.netty.handler.codec.dns.DnsRecordType RP = null;
    public static final io.netty.handler.codec.dns.DnsRecordType RRSIG = null;
    public static final io.netty.handler.codec.dns.DnsRecordType SIG = null;
    public static final io.netty.handler.codec.dns.DnsRecordType SOA = null;
    public static final io.netty.handler.codec.dns.DnsRecordType SPF = null;
    public static final io.netty.handler.codec.dns.DnsRecordType SRV = null;
    public static final io.netty.handler.codec.dns.DnsRecordType SSHFP = null;
    public static final io.netty.handler.codec.dns.DnsRecordType TA = null;
    public static final io.netty.handler.codec.dns.DnsRecordType TKEY = null;
    public static final io.netty.handler.codec.dns.DnsRecordType TLSA = null;
    public static final io.netty.handler.codec.dns.DnsRecordType TSIG = null;
    public static final io.netty.handler.codec.dns.DnsRecordType TXT = null;
    private final int intValue;
    private final java.lang.String name;
    private java.lang.String text;

    static {
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r1 = "A"
            r2 = 1
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.A = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r3 = "NS"
            r4 = 2
            r1.<init>(r4, r3)
            io.netty.handler.codec.dns.DnsRecordType.NS = r1
            io.netty.handler.codec.dns.DnsRecordType r3 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r5 = "CNAME"
            r6 = 5
            r3.<init>(r6, r5)
            io.netty.handler.codec.dns.DnsRecordType.CNAME = r3
            io.netty.handler.codec.dns.DnsRecordType r5 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r7 = "SOA"
            r8 = 6
            r5.<init>(r8, r7)
            io.netty.handler.codec.dns.DnsRecordType.SOA = r5
            io.netty.handler.codec.dns.DnsRecordType r7 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r9 = "PTR"
            r10 = 12
            r7.<init>(r10, r9)
            io.netty.handler.codec.dns.DnsRecordType.PTR = r7
            io.netty.handler.codec.dns.DnsRecordType r9 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r11 = "MX"
            r12 = 15
            r9.<init>(r12, r11)
            io.netty.handler.codec.dns.DnsRecordType.MX = r9
            io.netty.handler.codec.dns.DnsRecordType r11 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r13 = "TXT"
            r14 = 16
            r11.<init>(r14, r13)
            io.netty.handler.codec.dns.DnsRecordType.TXT = r11
            io.netty.handler.codec.dns.DnsRecordType r13 = new io.netty.handler.codec.dns.DnsRecordType
            java.lang.String r15 = "RP"
            r16 = 1
            r2 = 17
            r13.<init>(r2, r15)
            io.netty.handler.codec.dns.DnsRecordType.RP = r13
            io.netty.handler.codec.dns.DnsRecordType r15 = new io.netty.handler.codec.dns.DnsRecordType
            r17 = 17
            java.lang.String r2 = "AFSDB"
            r18 = 2
            r4 = 18
            r15.<init>(r4, r2)
            io.netty.handler.codec.dns.DnsRecordType.AFSDB = r15
            io.netty.handler.codec.dns.DnsRecordType r2 = new io.netty.handler.codec.dns.DnsRecordType
            r19 = 18
            java.lang.String r4 = "SIG"
            r20 = 5
            r6 = 24
            r2.<init>(r6, r4)
            io.netty.handler.codec.dns.DnsRecordType.SIG = r2
            io.netty.handler.codec.dns.DnsRecordType r4 = new io.netty.handler.codec.dns.DnsRecordType
            r21 = 24
            java.lang.String r6 = "KEY"
            r22 = 6
            r8 = 25
            r4.<init>(r8, r6)
            io.netty.handler.codec.dns.DnsRecordType.KEY = r4
            io.netty.handler.codec.dns.DnsRecordType r6 = new io.netty.handler.codec.dns.DnsRecordType
            r23 = 25
            java.lang.String r8 = "AAAA"
            r24 = 12
            r10 = 28
            r6.<init>(r10, r8)
            io.netty.handler.codec.dns.DnsRecordType.AAAA = r6
            io.netty.handler.codec.dns.DnsRecordType r8 = new io.netty.handler.codec.dns.DnsRecordType
            r25 = 28
            java.lang.String r10 = "LOC"
            r26 = 15
            r12 = 29
            r8.<init>(r12, r10)
            io.netty.handler.codec.dns.DnsRecordType.LOC = r8
            io.netty.handler.codec.dns.DnsRecordType r10 = new io.netty.handler.codec.dns.DnsRecordType
            r27 = 29
            java.lang.String r12 = "SRV"
            r28 = 16
            r14 = 33
            r10.<init>(r14, r12)
            io.netty.handler.codec.dns.DnsRecordType.SRV = r10
            io.netty.handler.codec.dns.DnsRecordType r12 = new io.netty.handler.codec.dns.DnsRecordType
            r29 = 33
            java.lang.String r14 = "NAPTR"
            r30 = r0
            r0 = 35
            r12.<init>(r0, r14)
            io.netty.handler.codec.dns.DnsRecordType.NAPTR = r12
            io.netty.handler.codec.dns.DnsRecordType r14 = new io.netty.handler.codec.dns.DnsRecordType
            r31 = 35
            java.lang.String r0 = "KX"
            r32 = r1
            r1 = 36
            r14.<init>(r1, r0)
            io.netty.handler.codec.dns.DnsRecordType.KX = r14
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r33 = 36
            java.lang.String r1 = "CERT"
            r34 = r2
            r2 = 37
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.CERT = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r35 = 37
            java.lang.String r2 = "DNAME"
            r36 = r0
            r0 = 39
            r1.<init>(r0, r2)
            io.netty.handler.codec.dns.DnsRecordType.DNAME = r1
            io.netty.handler.codec.dns.DnsRecordType r2 = new io.netty.handler.codec.dns.DnsRecordType
            r37 = 39
            java.lang.String r0 = "OPT"
            r38 = r1
            r1 = 41
            r2.<init>(r1, r0)
            io.netty.handler.codec.dns.DnsRecordType.OPT = r2
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r1 = 42
            r39 = r2
            java.lang.String r2 = "APL"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsRecordType.APL = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 43
            r40 = r0
            java.lang.String r0 = "DS"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.DS = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 44
            r41 = r1
            java.lang.String r1 = "SSHFP"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.SSHFP = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 45
            r42 = r0
            java.lang.String r0 = "IPSECKEY"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.IPSECKEY = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 46
            r43 = r1
            java.lang.String r1 = "RRSIG"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.RRSIG = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 47
            r44 = r0
            java.lang.String r0 = "NSEC"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.NSEC = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 48
            r45 = r1
            java.lang.String r1 = "DNSKEY"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.DNSKEY = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 49
            r46 = r0
            java.lang.String r0 = "DHCID"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.DHCID = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 50
            r47 = r1
            java.lang.String r1 = "NSEC3"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.NSEC3 = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 51
            r48 = r0
            java.lang.String r0 = "NSEC3PARAM"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.NSEC3PARAM = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 52
            r49 = r1
            java.lang.String r1 = "TLSA"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.TLSA = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 55
            r50 = r0
            java.lang.String r0 = "HIP"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.HIP = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 99
            r51 = r1
            java.lang.String r1 = "SPF"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.SPF = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 249(0xf9, float:3.49E-43)
            r52 = r0
            java.lang.String r0 = "TKEY"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.TKEY = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 250(0xfa, float:3.5E-43)
            r53 = r1
            java.lang.String r1 = "TSIG"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.TSIG = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 251(0xfb, float:3.52E-43)
            r54 = r0
            java.lang.String r0 = "IXFR"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.IXFR = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 252(0xfc, float:3.53E-43)
            r55 = r1
            java.lang.String r1 = "AXFR"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.AXFR = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 255(0xff, float:3.57E-43)
            r56 = r0
            java.lang.String r0 = "ANY"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.ANY = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 257(0x101, float:3.6E-43)
            r57 = r1
            java.lang.String r1 = "CAA"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.CAA = r0
            io.netty.handler.codec.dns.DnsRecordType r1 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 32768(0x8000, float:4.5918E-41)
            r58 = r0
            java.lang.String r0 = "TA"
            r1.<init>(r2, r0)
            io.netty.handler.codec.dns.DnsRecordType.TA = r1
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r2 = 32769(0x8001, float:4.5919E-41)
            r59 = r1
            java.lang.String r1 = "DLV"
            r0.<init>(r2, r1)
            io.netty.handler.codec.dns.DnsRecordType.DLV = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            io.netty.handler.codec.dns.DnsRecordType.BY_NAME = r1
            io.netty.util.collection.IntObjectHashMap r1 = new io.netty.util.collection.IntObjectHashMap
            r1.<init>()
            io.netty.handler.codec.dns.DnsRecordType.BY_TYPE = r1
            r1 = 40
            io.netty.handler.codec.dns.DnsRecordType[] r2 = new io.netty.handler.codec.dns.DnsRecordType[r1]
            r60 = 0
            r2[r60] = r30
            r2[r16] = r32
            r2[r18] = r3
            r3 = 3
            r2[r3] = r5
            r3 = 4
            r2[r3] = r7
            r2[r20] = r9
            r2[r22] = r11
            r3 = 7
            r2[r3] = r13
            r3 = 8
            r2[r3] = r15
            r3 = 9
            r2[r3] = r34
            r3 = 10
            r2[r3] = r4
            r3 = 11
            r2[r3] = r6
            r2[r24] = r8
            r3 = 13
            r2[r3] = r10
            r3 = 14
            r2[r3] = r12
            r2[r26] = r14
            r2[r28] = r36
            r2[r17] = r38
            r2[r19] = r39
            r3 = 19
            r2[r3] = r40
            r3 = 20
            r2[r3] = r41
            r3 = 21
            r2[r3] = r42
            r3 = 22
            r2[r3] = r43
            r3 = 23
            r2[r3] = r44
            r2[r21] = r45
            r2[r23] = r46
            r3 = 26
            r2[r3] = r47
            r3 = 27
            r2[r3] = r48
            r2[r25] = r49
            r2[r27] = r50
            r3 = 30
            r2[r3] = r51
            r3 = 31
            r2[r3] = r52
            r3 = 32
            r2[r3] = r53
            r2[r29] = r54
            r3 = 34
            r2[r3] = r55
            r2[r31] = r56
            r2[r33] = r57
            r2[r35] = r58
            r3 = 38
            r2[r3] = r59
            r2[r37] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 512(0x200, float:7.17E-43)
            r0.<init>(r3)
            java.lang.String r3 = " (expected: "
            r0.append(r3)
            r3 = 0
        L2a6:
            if (r3 >= r1) goto L2d5
            r4 = r2[r3]
            java.util.Map<java.lang.String, io.netty.handler.codec.dns.DnsRecordType> r5 = io.netty.handler.codec.dns.DnsRecordType.BY_NAME
            java.lang.String r6 = r4.name()
            r5.put(r6, r4)
            io.netty.util.collection.IntObjectHashMap<io.netty.handler.codec.dns.DnsRecordType> r5 = io.netty.handler.codec.dns.DnsRecordType.BY_TYPE
            int r6 = r4.intValue()
            r5.put(r6, r4)
            java.lang.String r5 = r4.name()
            r0.append(r5)
            r0.append(r1)
            int r4 = r4.intValue()
            r0.append(r4)
            java.lang.String r4 = "), "
            r0.append(r4)
            int r3 = r3 + 1
            goto L2a6
        L2d5:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            r0.setLength(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.dns.DnsRecordType.EXPECTED = r0
            return
    }

    private DnsRecordType(int r2) {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            r1.<init>(r2, r0)
            return
    }

    public DnsRecordType(int r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            if (r0 != r3) goto Le
            r2.intValue = r3
            r2.name = r4
            return
        Le:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "intValue: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: 0 ~ 65535)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public static io.netty.handler.codec.dns.DnsRecordType valueOf(int r1) {
            io.netty.util.collection.IntObjectHashMap<io.netty.handler.codec.dns.DnsRecordType> r0 = io.netty.handler.codec.dns.DnsRecordType.BY_TYPE
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.dns.DnsRecordType r0 = (io.netty.handler.codec.dns.DnsRecordType) r0
            if (r0 != 0) goto Lf
            io.netty.handler.codec.dns.DnsRecordType r0 = new io.netty.handler.codec.dns.DnsRecordType
            r0.<init>(r1)
        Lf:
            return r0
    }

    public static io.netty.handler.codec.dns.DnsRecordType valueOf(java.lang.String r3) {
            java.util.Map<java.lang.String, io.netty.handler.codec.dns.DnsRecordType> r0 = io.netty.handler.codec.dns.DnsRecordType.BY_NAME
            java.lang.Object r0 = r0.get(r3)
            io.netty.handler.codec.dns.DnsRecordType r0 = (io.netty.handler.codec.dns.DnsRecordType) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "name: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = io.netty.handler.codec.dns.DnsRecordType.EXPECTED
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.dns.DnsRecordType r2) {
            r1 = this;
            int r0 = r1.intValue()
            int r2 = r2.intValue()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.dns.DnsRecordType r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRecordType r1 = (io.netty.handler.codec.dns.DnsRecordType) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsRecordType
            if (r0 == 0) goto Le
            io.netty.handler.codec.dns.DnsRecordType r2 = (io.netty.handler.codec.dns.DnsRecordType) r2
            int r2 = r2.intValue
            int r0 = r1.intValue
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.intValue
            return r0
    }

    public int intValue() {
            r1 = this;
            int r0 = r1.intValue
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
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
