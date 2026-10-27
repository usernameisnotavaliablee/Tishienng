package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TimeStamp implements java.io.Serializable, java.lang.Comparable<org.apache.commons.net.ntp.TimeStamp> {
    public static final java.lang.String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private java.text.DateFormat simpleFormatter;
    private java.text.DateFormat utcFormatter;

    public TimeStamp(long r1) {
            r0 = this;
            r0.<init>()
            r0.ntpTime = r1
            return
    }

    public TimeStamp(java.lang.String r3) throws java.lang.NumberFormatException {
            r2 = this;
            r2.<init>()
            long r0 = decodeNtpHexString(r3)
            r2.ntpTime = r0
            return
    }

    public TimeStamp(java.util.Date r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L8
            r0 = 0
            goto L10
        L8:
            long r0 = r3.getTime()
            long r0 = toNtpTime(r0)
        L10:
            r2.ntpTime = r0
            return
    }

    private static void appendHexString(java.lang.StringBuilder r1, long r2) {
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            int r3 = r2.length()
        L8:
            r0 = 8
            if (r3 >= r0) goto L14
            r0 = 48
            r1.append(r0)
            int r3 = r3 + 1
            goto L8
        L14:
            r1.append(r2)
            return
    }

    protected static long decodeNtpHexString(java.lang.String r6) throws java.lang.NumberFormatException {
            if (r6 == 0) goto L35
            r0 = 46
            int r0 = r6.indexOf(r0)
            r1 = -1
            r2 = 32
            r3 = 16
            if (r0 != r1) goto L1e
            int r0 = r6.length()
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            long r0 = java.lang.Long.parseLong(r6, r3)
            long r0 = r0 << r2
            return r0
        L1e:
            r1 = 0
            java.lang.String r1 = r6.substring(r1, r0)
            long r4 = java.lang.Long.parseLong(r1, r3)
            long r1 = r4 << r2
            int r0 = r0 + 1
            java.lang.String r6 = r6.substring(r0)
            long r3 = java.lang.Long.parseLong(r6, r3)
            long r1 = r1 | r3
            return r1
        L35:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.String r0 = "null"
            r6.<init>(r0)
            throw r6
    }

    public static org.apache.commons.net.ntp.TimeStamp getCurrentTime() {
            long r0 = java.lang.System.currentTimeMillis()
            org.apache.commons.net.ntp.TimeStamp r0 = getNtpTime(r0)
            return r0
    }

    public static org.apache.commons.net.ntp.TimeStamp getNtpTime(long r1) {
            org.apache.commons.net.ntp.TimeStamp r0 = new org.apache.commons.net.ntp.TimeStamp
            long r1 = toNtpTime(r1)
            r0.<init>(r1)
            return r0
    }

    public static long getTime(long r9) {
            r0 = 32
            long r0 = r9 >>> r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r0 & r2
            long r9 = r9 & r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = (double) r9
            double r9 = r9 * r2
            r2 = 4751297606875873280(0x41f0000000000000, double:4.294967296E9)
            double r9 = r9 / r2
            long r9 = java.lang.Math.round(r9)
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r0 = r0 & r2
            r2 = 0
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L33
            r0 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
        L2e:
            long r4 = r4 * r6
            long r4 = r4 + r0
            long r4 = r4 + r9
            return r4
        L33:
            r0 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
            goto L2e
    }

    public static org.apache.commons.net.ntp.TimeStamp parseNtpString(java.lang.String r3) throws java.lang.NumberFormatException {
            org.apache.commons.net.ntp.TimeStamp r0 = new org.apache.commons.net.ntp.TimeStamp
            long r1 = decodeNtpHexString(r3)
            r0.<init>(r1)
            return r0
    }

    protected static long toNtpTime(long r7) {
            r0 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L13
            r0 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
        L13:
            long r7 = r7 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r7 / r0
            long r7 = r7 % r0
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 * r5
            long r7 = r7 / r0
            if (r2 == 0) goto L29
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 | r0
        L29:
            r0 = 32
            long r0 = r3 << r0
            long r7 = r7 | r0
            return r7
    }

    public static java.lang.String toString(long r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 32
            long r1 = r5 >>> r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            appendHexString(r0, r1)
            r1 = 46
            r0.append(r1)
            long r5 = r5 & r3
            appendHexString(r0, r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.net.ntp.TimeStamp r1) {
            r0 = this;
            org.apache.commons.net.ntp.TimeStamp r1 = (org.apache.commons.net.ntp.TimeStamp) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.net.ntp.TimeStamp r5) {
            r4 = this;
            long r0 = r4.ntpTime
            long r2 = r5.ntpTime
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto La
            r5 = -1
            return r5
        La:
            if (r5 != 0) goto Le
            r5 = 0
            return r5
        Le:
            r5 = 1
            return r5
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof org.apache.commons.net.ntp.TimeStamp
            r1 = 0
            if (r0 == 0) goto L13
            long r2 = r6.ntpTime
            org.apache.commons.net.ntp.TimeStamp r7 = (org.apache.commons.net.ntp.TimeStamp) r7
            long r4 = r7.ntpValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L13
            r7 = 1
            return r7
        L13:
            return r1
    }

    public java.util.Date getDate() {
            r3 = this;
            long r0 = r3.ntpTime
            long r0 = getTime(r0)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
    }

    public long getFraction() {
            r4 = this;
            long r0 = r4.ntpTime
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public long getSeconds() {
            r4 = this;
            long r0 = r4.ntpTime
            r2 = 32
            long r0 = r0 >>> r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.ntpTime
            long r0 = getTime(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.ntpTime
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public long ntpValue() {
            r2 = this;
            long r0 = r2.ntpTime
            return r0
    }

    public java.lang.String toDateString() {
            r3 = this;
            java.text.DateFormat r0 = r3.simpleFormatter
            if (r0 != 0) goto L16
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "EEE, MMM dd yyyy HH:mm:ss.SSS"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            r3.simpleFormatter = r0
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            r0.setTimeZone(r1)
        L16:
            java.util.Date r0 = r3.getDate()
            java.text.DateFormat r1 = r3.simpleFormatter
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.ntpTime
            java.lang.String r0 = toString(r0)
            return r0
    }

    public java.lang.String toUTCString() {
            r3 = this;
            java.text.DateFormat r0 = r3.utcFormatter
            if (r0 != 0) goto L18
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            r3.utcFormatter = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
        L18:
            java.util.Date r0 = r3.getDate()
            java.text.DateFormat r1 = r3.utcFormatter
            java.lang.String r0 = r1.format(r0)
            return r0
    }
}
