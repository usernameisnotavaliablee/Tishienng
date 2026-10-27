package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DateFormatter {
    private static final java.lang.String[] CALENDAR_MONTH_TO_SHORT_NAME = null;
    private static final java.lang.String[] DAY_OF_WEEK_TO_SHORT_NAME = null;
    private static final java.util.BitSet DELIMITERS = null;
    private static final io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.DateFormatter> INSTANCES = null;
    private final java.util.GregorianCalendar cal;
    private int dayOfMonth;
    private boolean dayOfMonthFound;
    private int hours;
    private int minutes;
    private int month;
    private boolean monthFound;
    private final java.lang.StringBuilder sb;
    private int seconds;
    private boolean timeFound;
    private int year;
    private boolean yearFound;


    static {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            io.netty.handler.codec.DateFormatter.DELIMITERS = r0
            r1 = 9
            r0.set(r1)
            r0 = 32
        Le:
            r1 = 47
            if (r0 > r1) goto L1b
            java.util.BitSet r1 = io.netty.handler.codec.DateFormatter.DELIMITERS
            r1.set(r0)
            int r0 = r0 + 1
            char r0 = (char) r0
            goto Le
        L1b:
            r0 = 59
        L1d:
            r1 = 64
            if (r0 > r1) goto L2a
            java.util.BitSet r1 = io.netty.handler.codec.DateFormatter.DELIMITERS
            r1.set(r0)
            int r0 = r0 + 1
            char r0 = (char) r0
            goto L1d
        L2a:
            r0 = 91
        L2c:
            r1 = 96
            if (r0 > r1) goto L39
            java.util.BitSet r1 = io.netty.handler.codec.DateFormatter.DELIMITERS
            r1.set(r0)
            int r0 = r0 + 1
            char r0 = (char) r0
            goto L2c
        L39:
            r0 = 123(0x7b, float:1.72E-43)
        L3b:
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 > r1) goto L48
            java.util.BitSet r1 = io.netty.handler.codec.DateFormatter.DELIMITERS
            r1.set(r0)
            int r0 = r0 + 1
            char r0 = (char) r0
            goto L3b
        L48:
            java.lang.String r6 = "Fri"
            java.lang.String r7 = "Sat"
            java.lang.String r1 = "Sun"
            java.lang.String r2 = "Mon"
            java.lang.String r3 = "Tue"
            java.lang.String r4 = "Wed"
            java.lang.String r5 = "Thu"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            io.netty.handler.codec.DateFormatter.DAY_OF_WEEK_TO_SHORT_NAME = r0
            java.lang.String r11 = "Nov"
            java.lang.String r12 = "Dec"
            java.lang.String r1 = "Jan"
            java.lang.String r2 = "Feb"
            java.lang.String r3 = "Mar"
            java.lang.String r4 = "Apr"
            java.lang.String r5 = "May"
            java.lang.String r6 = "Jun"
            java.lang.String r7 = "Jul"
            java.lang.String r8 = "Aug"
            java.lang.String r9 = "Sep"
            java.lang.String r10 = "Oct"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            io.netty.handler.codec.DateFormatter.CALENDAR_MONTH_TO_SHORT_NAME = r0
            io.netty.handler.codec.DateFormatter$1 r0 = new io.netty.handler.codec.DateFormatter$1
            r0.<init>()
            io.netty.handler.codec.DateFormatter.INSTANCES = r0
            return
    }

    private DateFormatter() {
            r2 = this;
            r2.<init>()
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.<init>(r1)
            r2.cal = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 29
            r0.<init>(r1)
            r2.sb = r0
            r2.reset()
            return
    }

    /* synthetic */ DateFormatter(io.netty.handler.codec.DateFormatter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.StringBuilder append(java.util.Date r2, java.lang.StringBuilder r3) {
            io.netty.handler.codec.DateFormatter r0 = formatter()
            java.lang.String r1 = "date"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            java.util.Date r2 = (java.util.Date) r2
            java.lang.String r1 = "sb"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.StringBuilder r2 = r0.append0(r2, r3)
            return r2
    }

    private java.lang.StringBuilder append0(java.util.Date r5, java.lang.StringBuilder r6) {
            r4 = this;
            java.util.GregorianCalendar r0 = r4.cal
            r0.setTime(r5)
            java.lang.String[] r5 = io.netty.handler.codec.DateFormatter.DAY_OF_WEEK_TO_SHORT_NAME
            java.util.GregorianCalendar r0 = r4.cal
            r1 = 7
            int r0 = r0.get(r1)
            r1 = 1
            int r0 = r0 - r1
            r5 = r5[r0]
            r6.append(r5)
            java.lang.String r5 = ", "
            r6.append(r5)
            java.util.GregorianCalendar r5 = r4.cal
            r0 = 5
            int r5 = r5.get(r0)
            r6.append(r5)
            r5 = 32
            r6.append(r5)
            java.lang.String[] r0 = io.netty.handler.codec.DateFormatter.CALENDAR_MONTH_TO_SHORT_NAME
            java.util.GregorianCalendar r2 = r4.cal
            r3 = 2
            int r2 = r2.get(r3)
            r0 = r0[r2]
            r6.append(r0)
            r6.append(r5)
            java.util.GregorianCalendar r0 = r4.cal
            int r0 = r0.get(r1)
            r6.append(r0)
            r6.append(r5)
            java.util.GregorianCalendar r5 = r4.cal
            r0 = 11
            int r5 = r5.get(r0)
            java.lang.StringBuilder r5 = appendZeroLeftPadded(r5, r6)
            r0 = 58
            r5.append(r0)
            java.util.GregorianCalendar r5 = r4.cal
            r1 = 12
            int r5 = r5.get(r1)
            java.lang.StringBuilder r5 = appendZeroLeftPadded(r5, r6)
            r5.append(r0)
            java.util.GregorianCalendar r5 = r4.cal
            r0 = 13
            int r5 = r5.get(r0)
            java.lang.StringBuilder r5 = appendZeroLeftPadded(r5, r6)
            java.lang.String r6 = " GMT"
            r5.append(r6)
            return r5
    }

    private static java.lang.StringBuilder appendZeroLeftPadded(int r1, java.lang.StringBuilder r2) {
            r0 = 10
            if (r1 >= r0) goto L9
            r0 = 48
            r2.append(r0)
        L9:
            r2.append(r1)
            return r2
    }

    private java.util.Date computeDate() {
            r3 = this;
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 5
            int r2 = r3.dayOfMonth
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 2
            int r2 = r3.month
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 1
            int r2 = r3.year
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 11
            int r2 = r3.hours
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 12
            int r2 = r3.minutes
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            r1 = 13
            int r2 = r3.seconds
            r0.set(r1, r2)
            java.util.GregorianCalendar r0 = r3.cal
            java.util.Date r0 = r0.getTime()
            return r0
    }

    public static java.lang.String format(java.util.Date r2) {
            io.netty.handler.codec.DateFormatter r0 = formatter()
            java.lang.String r1 = "date"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            java.util.Date r2 = (java.util.Date) r2
            java.lang.String r2 = r0.format0(r2)
            return r2
    }

    private java.lang.String format0(java.util.Date r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.sb
            r1.append0(r2, r0)
            java.lang.StringBuilder r2 = r1.sb
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static io.netty.handler.codec.DateFormatter formatter() {
            io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.DateFormatter> r0 = io.netty.handler.codec.DateFormatter.INSTANCES
            java.lang.Object r0 = r0.get()
            io.netty.handler.codec.DateFormatter r0 = (io.netty.handler.codec.DateFormatter) r0
            r0.reset()
            return r0
    }

    private static int getNumericalValue(char r0) {
            int r0 = r0 + (-48)
            return r0
    }

    private static boolean isDelim(char r1) {
            java.util.BitSet r0 = io.netty.handler.codec.DateFormatter.DELIMITERS
            boolean r1 = r0.get(r1)
            return r1
    }

    private static boolean isDigit(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private boolean normalizeAndValidate() {
            r5 = this;
            int r0 = r5.dayOfMonth
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L39
            r3 = 31
            if (r0 > r3) goto L39
            int r0 = r5.hours
            r3 = 23
            if (r0 > r3) goto L39
            int r0 = r5.minutes
            r3 = 59
            if (r0 > r3) goto L39
            int r0 = r5.seconds
            if (r0 <= r3) goto L1b
            goto L39
        L1b:
            int r0 = r5.year
            r3 = 70
            if (r0 < r3) goto L2a
            r4 = 99
            if (r0 > r4) goto L2a
            int r0 = r0 + 1900
            r5.year = r0
            goto L38
        L2a:
            if (r0 < 0) goto L33
            if (r0 >= r3) goto L33
            int r0 = r0 + 2000
            r5.year = r0
            goto L38
        L33:
            r3 = 1601(0x641, float:2.243E-42)
            if (r0 >= r3) goto L38
            return r1
        L38:
            return r2
        L39:
            return r1
    }

    private java.util.Date parse0(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            boolean r1 = r0.parse1(r1, r2, r3)
            if (r1 == 0) goto L11
            boolean r1 = r0.normalizeAndValidate()
            if (r1 == 0) goto L11
            java.util.Date r1 = r0.computeDate()
            return r1
        L11:
            r1 = 0
            return r1
    }

    private boolean parse1(java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            r0 = -1
            r1 = -1
        L2:
            r2 = 1
            if (r6 >= r7) goto L20
            char r3 = r5.charAt(r6)
            boolean r3 = isDelim(r3)
            if (r3 == 0) goto L1a
            if (r1 == r0) goto L1d
            boolean r1 = r4.parseToken(r5, r1, r6)
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = -1
            goto L1d
        L1a:
            if (r1 != r0) goto L1d
            r1 = r6
        L1d:
            int r6 = r6 + 1
            goto L2
        L20:
            if (r1 == r0) goto L2d
            int r6 = r5.length()
            boolean r5 = r4.parseToken(r5, r1, r6)
            if (r5 == 0) goto L2d
            return r2
        L2d:
            r5 = 0
            return r5
    }

    public static java.util.Date parseHttpDate(java.lang.CharSequence r2) {
            r0 = 0
            int r1 = r2.length()
            java.util.Date r2 = parseHttpDate(r2, r0, r1)
            return r2
    }

    public static java.util.Date parseHttpDate(java.lang.CharSequence r2, int r3, int r4) {
            int r0 = r4 - r3
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            if (r0 < 0) goto L25
            r1 = 64
            if (r0 > r1) goto L1d
            io.netty.handler.codec.DateFormatter r0 = formatter()
            java.lang.String r1 = "txt"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.util.Date r2 = r0.parse0(r2, r3, r4)
            return r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Can't parse more than 64 chars,looks like a user error or a malformed header"
            r2.<init>(r3)
            throw r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Can't have end < start"
            r2.<init>(r3)
            throw r2
    }

    private boolean parseToken(java.lang.CharSequence r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.timeFound
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1c
            boolean r0 = r3.tryParseTime(r4, r5, r6)
            r3.timeFound = r0
            if (r0 == 0) goto L1c
            boolean r4 = r3.dayOfMonthFound
            if (r4 == 0) goto L1b
            boolean r4 = r3.monthFound
            if (r4 == 0) goto L1b
            boolean r4 = r3.yearFound
            if (r4 == 0) goto L1b
            return r2
        L1b:
            return r1
        L1c:
            boolean r0 = r3.dayOfMonthFound
            if (r0 != 0) goto L36
            boolean r0 = r3.tryParseDayOfMonth(r4, r5, r6)
            r3.dayOfMonthFound = r0
            if (r0 == 0) goto L36
            boolean r4 = r3.timeFound
            if (r4 == 0) goto L35
            boolean r4 = r3.monthFound
            if (r4 == 0) goto L35
            boolean r4 = r3.yearFound
            if (r4 == 0) goto L35
            return r2
        L35:
            return r1
        L36:
            boolean r0 = r3.monthFound
            if (r0 != 0) goto L50
            boolean r0 = r3.tryParseMonth(r4, r5, r6)
            r3.monthFound = r0
            if (r0 == 0) goto L50
            boolean r4 = r3.timeFound
            if (r4 == 0) goto L4f
            boolean r4 = r3.dayOfMonthFound
            if (r4 == 0) goto L4f
            boolean r4 = r3.yearFound
            if (r4 == 0) goto L4f
            return r2
        L4f:
            return r1
        L50:
            boolean r0 = r3.yearFound
            if (r0 != 0) goto L5a
            boolean r4 = r3.tryParseYear(r4, r5, r6)
            r3.yearFound = r4
        L5a:
            boolean r4 = r3.timeFound
            if (r4 == 0) goto L6b
            boolean r4 = r3.dayOfMonthFound
            if (r4 == 0) goto L6b
            boolean r4 = r3.monthFound
            if (r4 == 0) goto L6b
            boolean r4 = r3.yearFound
            if (r4 == 0) goto L6b
            return r2
        L6b:
            return r1
    }

    private boolean tryParseDayOfMonth(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
            int r5 = r5 - r4
            r0 = 1
            if (r5 != r0) goto L15
            char r3 = r3.charAt(r4)
            boolean r4 = isDigit(r3)
            if (r4 == 0) goto L3b
            int r3 = getNumericalValue(r3)
            r2.dayOfMonth = r3
            return r0
        L15:
            r1 = 2
            if (r5 != r1) goto L3b
            char r5 = r3.charAt(r4)
            int r4 = r4 + r0
            char r3 = r3.charAt(r4)
            boolean r4 = isDigit(r5)
            if (r4 == 0) goto L3b
            boolean r4 = isDigit(r3)
            if (r4 == 0) goto L3b
            int r4 = getNumericalValue(r5)
            int r4 = r4 * 10
            int r3 = getNumericalValue(r3)
            int r4 = r4 + r3
            r2.dayOfMonth = r4
            return r0
        L3b:
            r3 = 0
            return r3
    }

    private boolean tryParseMonth(java.lang.CharSequence r11, int r12, int r13) {
            r10 = this;
            int r13 = r13 - r12
            r0 = 0
            r1 = 3
            if (r13 == r1) goto L6
            return r0
        L6:
            char r13 = r11.charAt(r12)
            char r13 = io.netty.util.AsciiString.toLowerCase(r13)
            int r2 = r12 + 1
            char r2 = r11.charAt(r2)
            char r2 = io.netty.util.AsciiString.toLowerCase(r2)
            r3 = 2
            int r12 = r12 + r3
            char r11 = r11.charAt(r12)
            char r11 = io.netty.util.AsciiString.toLowerCase(r11)
            r12 = 110(0x6e, float:1.54E-43)
            r4 = 106(0x6a, float:1.49E-43)
            r5 = 1
            r6 = 97
            if (r13 != r4) goto L33
            if (r2 != r6) goto L33
            if (r11 != r12) goto L33
            r10.month = r0
            goto Lc4
        L33:
            r7 = 102(0x66, float:1.43E-43)
            r8 = 101(0x65, float:1.42E-43)
            if (r13 != r7) goto L43
            if (r2 != r8) goto L43
            r7 = 98
            if (r11 != r7) goto L43
            r10.month = r5
            goto Lc4
        L43:
            r7 = 114(0x72, float:1.6E-43)
            r9 = 109(0x6d, float:1.53E-43)
            if (r13 != r9) goto L51
            if (r2 != r6) goto L51
            if (r11 != r7) goto L51
            r10.month = r3
            goto Lc4
        L51:
            r3 = 112(0x70, float:1.57E-43)
            if (r13 != r6) goto L5d
            if (r2 != r3) goto L5d
            if (r11 != r7) goto L5d
            r10.month = r1
            goto Lc4
        L5d:
            if (r13 != r9) goto L69
            if (r2 != r6) goto L69
            r1 = 121(0x79, float:1.7E-43)
            if (r11 != r1) goto L69
            r11 = 4
            r10.month = r11
            goto Lc4
        L69:
            r1 = 117(0x75, float:1.64E-43)
            if (r13 != r4) goto L75
            if (r2 != r1) goto L75
            if (r11 != r12) goto L75
            r11 = 5
            r10.month = r11
            goto Lc4
        L75:
            if (r13 != r4) goto L81
            if (r2 != r1) goto L81
            r4 = 108(0x6c, float:1.51E-43)
            if (r11 != r4) goto L81
            r11 = 6
            r10.month = r11
            goto Lc4
        L81:
            if (r13 != r6) goto L8d
            if (r2 != r1) goto L8d
            r1 = 103(0x67, float:1.44E-43)
            if (r11 != r1) goto L8d
            r11 = 7
            r10.month = r11
            goto Lc4
        L8d:
            r1 = 115(0x73, float:1.61E-43)
            if (r13 != r1) goto L9a
            if (r2 != r8) goto L9a
            if (r11 != r3) goto L9a
            r11 = 8
            r10.month = r11
            goto Lc4
        L9a:
            r1 = 99
            r3 = 111(0x6f, float:1.56E-43)
            if (r13 != r3) goto Lab
            if (r2 != r1) goto Lab
            r4 = 116(0x74, float:1.63E-43)
            if (r11 != r4) goto Lab
            r11 = 9
            r10.month = r11
            goto Lc4
        Lab:
            if (r13 != r12) goto Lb8
            if (r2 != r3) goto Lb8
            r12 = 118(0x76, float:1.65E-43)
            if (r11 != r12) goto Lb8
            r11 = 10
            r10.month = r11
            goto Lc4
        Lb8:
            r12 = 100
            if (r13 != r12) goto Lc5
            if (r2 != r8) goto Lc5
            if (r11 != r1) goto Lc5
            r11 = 11
            r10.month = r11
        Lc4:
            return r5
        Lc5:
            return r0
    }

    private boolean tryParseTime(java.lang.CharSequence r11, int r12, int r13) {
            r10 = this;
            int r0 = r13 - r12
            r1 = 5
            r2 = 0
            if (r0 < r1) goto L52
            r1 = 8
            if (r0 <= r1) goto Lb
            goto L52
        Lb:
            r0 = -1
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = 0
        L11:
            r7 = 1
            if (r12 >= r13) goto L42
            char r8 = r11.charAt(r12)
            boolean r9 = isDigit(r8)
            if (r9 == 0) goto L2b
            int r3 = r3 * 10
            int r7 = getNumericalValue(r8)
            int r3 = r3 + r7
            int r1 = r1 + 1
            r7 = 2
            if (r1 <= r7) goto L3e
            return r2
        L2b:
            r9 = 58
            if (r8 != r9) goto L41
            if (r1 != 0) goto L32
            return r2
        L32:
            if (r6 == 0) goto L39
            if (r6 == r7) goto L37
            return r2
        L37:
            r5 = r3
            r3 = r4
        L39:
            int r6 = r6 + 1
            r4 = r3
            r1 = 0
            r3 = 0
        L3e:
            int r12 = r12 + 1
            goto L11
        L41:
            return r2
        L42:
            if (r1 <= 0) goto L45
            r0 = r3
        L45:
            if (r4 < 0) goto L52
            if (r5 < 0) goto L52
            if (r0 < 0) goto L52
            r10.hours = r4
            r10.minutes = r5
            r10.seconds = r0
            return r7
        L52:
            return r2
    }

    private boolean tryParseYear(java.lang.CharSequence r4, int r5, int r6) {
            r3 = this;
            int r6 = r6 - r5
            r0 = 2
            r1 = 1
            if (r6 != r0) goto L28
            char r6 = r4.charAt(r5)
            int r5 = r5 + r1
            char r4 = r4.charAt(r5)
            boolean r5 = isDigit(r6)
            if (r5 == 0) goto L75
            boolean r5 = isDigit(r4)
            if (r5 == 0) goto L75
            int r5 = getNumericalValue(r6)
            int r5 = r5 * 10
            int r4 = getNumericalValue(r4)
            int r5 = r5 + r4
            r3.year = r5
            return r1
        L28:
            r0 = 4
            if (r6 != r0) goto L75
            char r6 = r4.charAt(r5)
            int r0 = r5 + 1
            char r0 = r4.charAt(r0)
            int r2 = r5 + 2
            char r2 = r4.charAt(r2)
            int r5 = r5 + 3
            char r4 = r4.charAt(r5)
            boolean r5 = isDigit(r6)
            if (r5 == 0) goto L75
            boolean r5 = isDigit(r0)
            if (r5 == 0) goto L75
            boolean r5 = isDigit(r2)
            if (r5 == 0) goto L75
            boolean r5 = isDigit(r4)
            if (r5 == 0) goto L75
            int r5 = getNumericalValue(r6)
            int r5 = r5 * 1000
            int r6 = getNumericalValue(r0)
            int r6 = r6 * 100
            int r5 = r5 + r6
            int r6 = getNumericalValue(r2)
            int r6 = r6 * 10
            int r5 = r5 + r6
            int r4 = getNumericalValue(r4)
            int r5 = r5 + r4
            r3.year = r5
            return r1
        L75:
            r4 = 0
            return r4
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.timeFound = r0
            r1 = -1
            r2.hours = r1
            r2.minutes = r1
            r2.seconds = r1
            r2.dayOfMonthFound = r0
            r2.dayOfMonth = r1
            r2.monthFound = r0
            r2.month = r1
            r2.yearFound = r0
            r2.year = r1
            java.util.GregorianCalendar r1 = r2.cal
            r1.clear()
            java.lang.StringBuilder r1 = r2.sb
            r1.setLength(r0)
            return
    }
}
