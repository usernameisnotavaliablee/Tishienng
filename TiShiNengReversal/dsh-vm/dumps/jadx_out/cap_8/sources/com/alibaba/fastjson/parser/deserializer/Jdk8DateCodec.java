package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Jdk8DateCodec extends com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.serializer.ContextObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    private static final java.time.format.DateTimeFormatter ISO_FIXED_FORMAT = null;
    private static final java.time.format.DateTimeFormatter defaultFormatter = null;
    private static final java.lang.String defaultPatttern = "yyyy-MM-dd HH:mm:ss";
    private static final java.time.format.DateTimeFormatter formatter_d10_cn = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_de = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_eur = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_in = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_kr = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_tw = null;
    private static final java.time.format.DateTimeFormatter formatter_d10_us = null;
    private static final java.time.format.DateTimeFormatter formatter_d8 = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_cn = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_cn_1 = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_de = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_eur = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_in = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_kr = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_tw = null;
    private static final java.time.format.DateTimeFormatter formatter_dt19_us = null;
    private static final java.time.format.DateTimeFormatter formatter_iso8601 = null;
    private static final java.lang.String formatter_iso8601_pattern = "yyyy-MM-dd'T'HH:mm:ss";
    public static final com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec r0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance = r0
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r0)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter = r1
            java.lang.String r1 = "yyyy/MM/dd HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_tw = r1
            java.lang.String r1 = "yyyy年M月d日 HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn = r1
            java.lang.String r1 = "yyyy年M月d日 H时m分s秒"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn_1 = r1
            java.lang.String r1 = "yyyy년M월d일 HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_kr = r1
            java.lang.String r1 = "MM/dd/yyyy HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_us = r1
            java.lang.String r1 = "dd/MM/yyyy HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_eur = r1
            java.lang.String r1 = "dd.MM.yyyy HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_de = r1
            java.lang.String r1 = "dd-MM-yyyy HH:mm:ss"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_in = r1
            java.lang.String r1 = "yyyyMMdd"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d8 = r1
            java.lang.String r1 = "yyyy/MM/dd"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_tw = r1
            java.lang.String r1 = "yyyy年M月d日"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_cn = r1
            java.lang.String r1 = "yyyy년M월d일"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_kr = r1
            java.lang.String r1 = "MM/dd/yyyy"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_us = r1
            java.lang.String r1 = "dd/MM/yyyy"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_eur = r1
            java.lang.String r1 = "dd.MM.yyyy"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_de = r1
            java.lang.String r1 = "dd-MM-yyyy"
            java.time.format.DateTimeFormatter r1 = com.alibaba.fastjson.parser.deserializer.w.a(r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_in = r1
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson.parser.deserializer.w.a(r0)
            java.time.ZoneId r1 = com.alibaba.fastjson.parser.deserializer.h0.a()
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson.parser.deserializer.j0.a(r0, r1)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.ISO_FIXED_FORMAT = r0
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson.parser.deserializer.w.a(r0)
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_iso8601 = r0
            return
    }

    public Jdk8DateCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    private void write(com.alibaba.fastjson.serializer.SerializeWriter r2, java.time.temporal.TemporalAccessor r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
            if (r4 != r0) goto L7
            java.time.format.DateTimeFormatter r4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_iso8601
            goto Lb
        L7:
            java.time.format.DateTimeFormatter r4 = com.alibaba.fastjson.parser.deserializer.w.a(r4)
        Lb:
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.d.a(r4, r3)
            r2.writeString(r3)
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.String r6, int r7) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r3 = r3.lexer
            int r5 = r3.token()
            r7 = 0
            r0 = 8
            if (r5 != r0) goto Lf
            r3.nextToken()
            return r7
        Lf:
            int r5 = r3.token()
            r1 = 4
            if (r5 != r1) goto L106
            java.lang.String r5 = r3.stringVal()
            r3.nextToken()
            if (r6 == 0) goto L2f
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L2a
            java.time.format.DateTimeFormatter r3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            goto L30
        L2a:
            java.time.format.DateTimeFormatter r3 = com.alibaba.fastjson.parser.deserializer.w.a(r6)
            goto L30
        L2f:
            r3 = r7
        L30:
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L39
            return r7
        L39:
            java.lang.Class r1 = com.alibaba.fastjson.parser.deserializer.n0.a()
            if (r4 != r1) goto L60
            int r4 = r5.length()
            r7 = 10
            if (r4 == r7) goto L53
            int r4 = r5.length()
            if (r4 != r0) goto L4e
            goto L53
        L4e:
            java.time.LocalDateTime r3 = r2.parseDateTime(r5, r3)
            return r3
        L53:
            java.time.LocalDate r3 = r2.parseLocalDate(r5, r6, r3)
            java.time.LocalTime r4 = com.alibaba.fastjson.parser.deserializer.a0.a()
            java.time.LocalDateTime r3 = com.alibaba.fastjson.parser.deserializer.c0.a(r3, r4)
            return r3
        L60:
            java.lang.Class r0 = com.alibaba.fastjson.parser.deserializer.d0.a()
            r1 = 23
            if (r4 != r0) goto L88
            int r4 = r5.length()
            if (r4 != r1) goto L83
            java.time.LocalDateTime r3 = com.alibaba.fastjson.parser.deserializer.e.a(r5)
            int r4 = com.alibaba.fastjson.parser.deserializer.e0.a(r3)
            int r5 = com.alibaba.fastjson.parser.deserializer.f0.a(r3)
            int r3 = com.alibaba.fastjson.parser.deserializer.g0.a(r3)
            java.time.LocalDate r3 = com.alibaba.fastjson.parser.deserializer.i0.a(r4, r5, r3)
            return r3
        L83:
            java.time.LocalDate r3 = r2.parseLocalDate(r5, r6, r3)
            return r3
        L88:
            java.lang.Class r6 = com.alibaba.fastjson.parser.deserializer.g.a()
            if (r4 != r6) goto Lb2
            int r3 = r5.length()
            if (r3 != r1) goto Lad
            java.time.LocalDateTime r3 = com.alibaba.fastjson.parser.deserializer.e.a(r5)
            int r4 = com.alibaba.fastjson.parser.deserializer.h.a(r3)
            int r5 = com.alibaba.fastjson.parser.deserializer.i.a(r3)
            int r6 = com.alibaba.fastjson.parser.deserializer.j.a(r3)
            int r3 = com.alibaba.fastjson.parser.deserializer.b.a(r3)
            java.time.LocalTime r3 = com.alibaba.fastjson.parser.deserializer.k.a(r4, r5, r6, r3)
            return r3
        Lad:
            java.time.LocalTime r3 = com.alibaba.fastjson.parser.deserializer.m.a(r5)
            return r3
        Lb2:
            java.lang.Class r6 = com.alibaba.fastjson.parser.deserializer.n.a()
            if (r4 != r6) goto Lc3
            java.time.format.DateTimeFormatter r4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            if (r3 != r4) goto Lbe
            java.time.format.DateTimeFormatter r3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.ISO_FIXED_FORMAT
        Lbe:
            java.time.ZonedDateTime r3 = r2.parseZonedDateTime(r5, r3)
            return r3
        Lc3:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.o.a()
            if (r4 != r3) goto Lce
            java.time.OffsetDateTime r3 = com.alibaba.fastjson.parser.deserializer.p.a(r5)
            return r3
        Lce:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.q.a()
            if (r4 != r3) goto Ld9
            java.time.OffsetTime r3 = com.alibaba.fastjson.parser.deserializer.r.a(r5)
            return r3
        Ld9:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.s.a()
            if (r4 != r3) goto Le4
            java.time.ZoneId r3 = com.alibaba.fastjson.parser.deserializer.t.a(r5)
            return r3
        Le4:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.u.a()
            if (r4 != r3) goto Lef
            java.time.Period r3 = com.alibaba.fastjson.parser.deserializer.v.a(r5)
            return r3
        Lef:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.x.a()
            if (r4 != r3) goto Lfa
            java.time.Duration r3 = com.alibaba.fastjson.parser.deserializer.y.a(r5)
            return r3
        Lfa:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.z.a()
            if (r4 != r3) goto L105
            java.time.Instant r3 = com.alibaba.fastjson.parser.deserializer.b0.a(r5)
            return r3
        L105:
            return r7
        L106:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 4
            return r0
    }

    protected java.time.LocalDateTime parseDateTime(java.lang.String r12, java.time.format.DateTimeFormatter r13) {
            r11 = this;
            if (r13 != 0) goto Lec
            int r0 = r12.length()
            r1 = 19
            r2 = 1
            r3 = 4
            if (r0 != r1) goto Lc2
            char r0 = r12.charAt(r3)
            r1 = 7
            char r1 = r12.charAt(r1)
            r4 = 10
            char r5 = r12.charAt(r4)
            r6 = 13
            char r6 = r12.charAt(r6)
            r7 = 16
            char r7 = r12.charAt(r7)
            r8 = 58
            if (r6 != r8) goto Lc2
            if (r7 != r8) goto Lc2
            r6 = 45
            if (r0 != r6) goto L45
            if (r1 != r6) goto L45
            r0 = 84
            if (r5 != r0) goto L3d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.k0.a()
            goto Lc2
        L3d:
            r0 = 32
            if (r5 != r0) goto Lc2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            goto Lc2
        L45:
            if (r0 != r6) goto L4d
            if (r1 != r6) goto L4d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            goto Lc2
        L4d:
            r5 = 47
            if (r0 != r5) goto L57
            if (r1 != r5) goto L57
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_tw
            goto Lc2
        L57:
            r1 = 0
            char r1 = r12.charAt(r1)
            char r7 = r12.charAt(r2)
            r8 = 2
            char r8 = r12.charAt(r8)
            r9 = 3
            char r9 = r12.charAt(r9)
            r10 = 5
            char r10 = r12.charAt(r10)
            if (r8 != r5) goto Lb3
            if (r10 != r5) goto Lb3
            int r1 = r1 + (-48)
            int r1 = r1 * 10
            int r7 = r7 + (-48)
            int r1 = r1 + r7
            int r9 = r9 + (-48)
            int r9 = r9 * 10
            int r0 = r0 + (-48)
            int r9 = r9 + r0
            r0 = 12
            if (r1 <= r0) goto L88
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_eur
            goto Lc2
        L88:
            if (r9 <= r0) goto L8d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_us
            goto Lc2
        L8d:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r1 = "US"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La0
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_us
            goto Lc2
        La0:
            java.lang.String r1 = "BR"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lb0
            java.lang.String r1 = "AU"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc2
        Lb0:
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_eur
            goto Lc2
        Lb3:
            r0 = 46
            if (r8 != r0) goto Lbc
            if (r10 != r0) goto Lbc
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_de
            goto Lc2
        Lbc:
            if (r8 != r6) goto Lc2
            if (r10 != r6) goto Lc2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_in
        Lc2:
            int r0 = r12.length()
            r1 = 17
            if (r0 < r1) goto Lec
            char r0 = r12.charAt(r3)
            r1 = 24180(0x5e74, float:3.3883E-41)
            if (r0 != r1) goto Le5
            int r13 = r12.length()
            int r13 = r13 - r2
            char r13 = r12.charAt(r13)
            r0 = 31186(0x79d2, float:4.3701E-41)
            if (r13 != r0) goto Le2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn_1
            goto Lec
        Le2:
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn
            goto Lec
        Le5:
            r1 = 45380(0xb144, float:6.3591E-41)
            if (r0 != r1) goto Lec
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_kr
        Lec:
            if (r13 != 0) goto Lf3
            java.time.LocalDateTime r12 = com.alibaba.fastjson.parser.deserializer.e.a(r12)
            return r12
        Lf3:
            java.time.LocalDateTime r12 = com.alibaba.fastjson.parser.deserializer.f.a(r12, r13)
            return r12
    }

    protected java.time.LocalDate parseLocalDate(java.lang.String r9, java.lang.String r10, java.time.format.DateTimeFormatter r11) {
            r8 = this;
            if (r11 != 0) goto Lb0
            int r10 = r9.length()
            r0 = 8
            if (r10 != r0) goto Lc
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d8
        Lc:
            int r10 = r9.length()
            r0 = 4
            r1 = 10
            if (r10 != r1) goto L96
            char r10 = r9.charAt(r0)
            r2 = 7
            char r2 = r9.charAt(r2)
            r3 = 47
            if (r10 != r3) goto L26
            if (r2 != r3) goto L26
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_tw
        L26:
            r2 = 0
            char r2 = r9.charAt(r2)
            r4 = 1
            char r4 = r9.charAt(r4)
            r5 = 2
            char r5 = r9.charAt(r5)
            r6 = 3
            char r6 = r9.charAt(r6)
            r7 = 5
            char r7 = r9.charAt(r7)
            if (r5 != r3) goto L83
            if (r7 != r3) goto L83
            int r2 = r2 + (-48)
            int r2 = r2 * 10
            int r4 = r4 + (-48)
            int r2 = r2 + r4
            int r6 = r6 + (-48)
            int r6 = r6 * 10
            int r10 = r10 + (-48)
            int r6 = r6 + r10
            r10 = 12
            if (r2 <= r10) goto L58
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_eur
            goto L96
        L58:
            if (r6 <= r10) goto L5d
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_us
            goto L96
        L5d:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            java.lang.String r1 = "US"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L70
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_us
            goto L96
        L70:
            java.lang.String r1 = "BR"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L80
            java.lang.String r1 = "AU"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L96
        L80:
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_eur
            goto L96
        L83:
            r10 = 46
            if (r5 != r10) goto L8d
            if (r7 != r10) goto L8d
            java.time.format.DateTimeFormatter r10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_de
        L8b:
            r11 = r10
            goto L96
        L8d:
            r10 = 45
            if (r5 != r10) goto L96
            if (r7 != r10) goto L96
            java.time.format.DateTimeFormatter r10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_in
            goto L8b
        L96:
            int r10 = r9.length()
            r1 = 9
            if (r10 < r1) goto Lb0
            char r10 = r9.charAt(r0)
            r0 = 24180(0x5e74, float:3.3883E-41)
            if (r10 != r0) goto La9
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_cn
            goto Lb0
        La9:
            r0 = 45380(0xb144, float:6.3591E-41)
            if (r10 != r0) goto Lb0
            java.time.format.DateTimeFormatter r11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_d10_kr
        Lb0:
            if (r11 != 0) goto Lb7
            java.time.LocalDate r9 = com.alibaba.fastjson.parser.deserializer.a.a(r9)
            return r9
        Lb7:
            java.time.LocalDate r9 = com.alibaba.fastjson.parser.deserializer.l.a(r9, r11)
            return r9
    }

    protected java.time.ZonedDateTime parseZonedDateTime(java.lang.String r12, java.time.format.DateTimeFormatter r13) {
            r11 = this;
            if (r13 != 0) goto Lec
            int r0 = r12.length()
            r1 = 19
            r2 = 1
            r3 = 4
            if (r0 != r1) goto Lc2
            char r0 = r12.charAt(r3)
            r1 = 7
            char r1 = r12.charAt(r1)
            r4 = 10
            char r5 = r12.charAt(r4)
            r6 = 13
            char r6 = r12.charAt(r6)
            r7 = 16
            char r7 = r12.charAt(r7)
            r8 = 58
            if (r6 != r8) goto Lc2
            if (r7 != r8) goto Lc2
            r6 = 45
            if (r0 != r6) goto L45
            if (r1 != r6) goto L45
            r0 = 84
            if (r5 != r0) goto L3d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.k0.a()
            goto Lc2
        L3d:
            r0 = 32
            if (r5 != r0) goto Lc2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            goto Lc2
        L45:
            if (r0 != r6) goto L4d
            if (r1 != r6) goto L4d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.defaultFormatter
            goto Lc2
        L4d:
            r5 = 47
            if (r0 != r5) goto L57
            if (r1 != r5) goto L57
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_tw
            goto Lc2
        L57:
            r1 = 0
            char r1 = r12.charAt(r1)
            char r7 = r12.charAt(r2)
            r8 = 2
            char r8 = r12.charAt(r8)
            r9 = 3
            char r9 = r12.charAt(r9)
            r10 = 5
            char r10 = r12.charAt(r10)
            if (r8 != r5) goto Lb3
            if (r10 != r5) goto Lb3
            int r1 = r1 + (-48)
            int r1 = r1 * 10
            int r7 = r7 + (-48)
            int r1 = r1 + r7
            int r9 = r9 + (-48)
            int r9 = r9 * 10
            int r0 = r0 + (-48)
            int r9 = r9 + r0
            r0 = 12
            if (r1 <= r0) goto L88
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_eur
            goto Lc2
        L88:
            if (r9 <= r0) goto L8d
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_us
            goto Lc2
        L8d:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r1 = "US"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La0
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_us
            goto Lc2
        La0:
            java.lang.String r1 = "BR"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lb0
            java.lang.String r1 = "AU"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc2
        Lb0:
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_eur
            goto Lc2
        Lb3:
            r0 = 46
            if (r8 != r0) goto Lbc
            if (r10 != r0) goto Lbc
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_de
            goto Lc2
        Lbc:
            if (r8 != r6) goto Lc2
            if (r10 != r6) goto Lc2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_in
        Lc2:
            int r0 = r12.length()
            r1 = 17
            if (r0 < r1) goto Lec
            char r0 = r12.charAt(r3)
            r1 = 24180(0x5e74, float:3.3883E-41)
            if (r0 != r1) goto Le5
            int r13 = r12.length()
            int r13 = r13 - r2
            char r13 = r12.charAt(r13)
            r0 = 31186(0x79d2, float:4.3701E-41)
            if (r13 != r0) goto Le2
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn_1
            goto Lec
        Le2:
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_cn
            goto Lec
        Le5:
            r1 = 45380(0xb144, float:6.3591E-41)
            if (r0 != r1) goto Lec
            java.time.format.DateTimeFormatter r13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.formatter_dt19_kr
        Lec:
            if (r13 != 0) goto Lf3
            java.time.ZonedDateTime r12 = com.alibaba.fastjson.parser.deserializer.l0.a(r12)
            return r12
        Lf3:
            java.time.ZonedDateTime r12 = com.alibaba.fastjson.parser.deserializer.m0.a(r12, r13)
            return r12
    }

    @Override // com.alibaba.fastjson.serializer.ContextObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, com.alibaba.fastjson.serializer.BeanContext r3) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            java.lang.String r3 = r3.getFormat()
            java.time.temporal.TemporalAccessor r2 = com.alibaba.fastjson.parser.deserializer.c.a(r2)
            r0.write(r1, r2, r3)
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.Object r6, java.lang.reflect.Type r7, int r8) throws java.io.IOException {
            r3 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r4.out
            if (r5 != 0) goto L8
            r6.writeNull()
            return
        L8:
            if (r7 != 0) goto Le
            java.lang.Class r7 = r5.getClass()
        Le:
            java.lang.Class r0 = com.alibaba.fastjson.parser.deserializer.n0.a()
            if (r7 != r0) goto L48
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat
            int r0 = r7.getMask()
            java.time.LocalDateTime r1 = com.alibaba.fastjson.parser.deserializer.o0.a(r5)
            java.lang.String r2 = r4.getDateFormatPattern()
            if (r2 != 0) goto L27
            r8 = r8 & r0
            if (r8 != 0) goto L2d
        L27:
            boolean r4 = r4.isEnabled(r7)
            if (r4 == 0) goto L2f
        L2d:
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss"
        L2f:
            int r4 = com.alibaba.fastjson.parser.deserializer.b.a(r1)
            if (r4 == 0) goto L40
            if (r2 == 0) goto L38
            goto L40
        L38:
            java.lang.String r4 = r5.toString()
            r6.writeString(r4)
            return
        L40:
            if (r2 != 0) goto L44
            java.lang.String r2 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT
        L44:
            r3.write(r6, r1, r2)
            return
        L48:
            java.lang.String r4 = r5.toString()
            r6.writeString(r4)
            return
    }
}
