package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MailDateFormat extends java.text.SimpleDateFormat {
    private static java.util.Calendar cal = null;
    static boolean debug = false;
    private static final long serialVersionUID = -8148227605210628779L;
    private static java.util.TimeZone tz;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            javax.mail.internet.MailDateFormat.tz = r0
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.util.TimeZone r1 = javax.mail.internet.MailDateFormat.tz
            r0.<init>(r1)
            javax.mail.internet.MailDateFormat.cal = r0
            return
    }

    public MailDateFormat() {
            r2 = this;
            java.lang.String r0 = "EEE, d MMM yyyy HH:mm:ss 'XXXXX' (z)"
            java.util.Locale r1 = java.util.Locale.US
            r2.<init>(r0, r1)
            return
    }

    private static synchronized java.util.Date ourUTC(int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            java.lang.Class<javax.mail.internet.MailDateFormat> r0 = javax.mail.internet.MailDateFormat.class
            monitor-enter(r0)
            java.util.Calendar r1 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r1.clear()     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r1 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r1.setLenient(r9)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r9 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r1 = 1
            r9.set(r1, r2)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r9 = 2
            r2.set(r9, r3)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r3 = 5
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r3 = 11
            r2.set(r3, r5)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r3 = 12
            int r6 = r6 + r8
            r2.set(r3, r6)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            r3 = 13
            r2.set(r3, r7)     // Catch: java.lang.Throwable -> L3d
            java.util.Calendar r2 = javax.mail.internet.MailDateFormat.cal     // Catch: java.lang.Throwable -> L3d
            java.util.Date r2 = r2.getTime()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            return r2
        L3d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r2
    }

    private static java.util.Date parseDate(char[] r10, java.text.ParsePosition r11, boolean r12) {
            javax.mail.internet.MailDateParser r0 = new javax.mail.internet.MailDateParser     // Catch: java.lang.Exception -> L18
            r0.<init>(r10)     // Catch: java.lang.Exception -> L18
            r0.skipUntilNumber()     // Catch: java.lang.Exception -> L18
            int r3 = r0.parseNumber()     // Catch: java.lang.Exception -> L18
            r1 = 45
            boolean r2 = r0.skipIfChar(r1)     // Catch: java.lang.Exception -> L18
            if (r2 != 0) goto L1a
            r0.skipWhiteSpace()     // Catch: java.lang.Exception -> L18
            goto L1a
        L18:
            goto L7a
        L1a:
            int r2 = r0.parseMonth()     // Catch: java.lang.Exception -> L18
            boolean r1 = r0.skipIfChar(r1)     // Catch: java.lang.Exception -> L18
            if (r1 != 0) goto L27
            r0.skipWhiteSpace()     // Catch: java.lang.Exception -> L18
        L27:
            int r1 = r0.parseNumber()     // Catch: java.lang.Exception -> L18
            r4 = 50
            if (r1 >= r4) goto L32
            int r1 = r1 + 2000
            goto L38
        L32:
            r4 = 100
            if (r1 >= r4) goto L38
            int r1 = r1 + 1900
        L38:
            r0.skipWhiteSpace()     // Catch: java.lang.Exception -> L18
            int r4 = r0.parseNumber()     // Catch: java.lang.Exception -> L18
            r5 = 58
            r0.skipChar(r5)     // Catch: java.lang.Exception -> L18
            r6 = 58
            int r5 = r0.parseNumber()     // Catch: java.lang.Exception -> L18
            boolean r6 = r0.skipIfChar(r6)     // Catch: java.lang.Exception -> L18
            r7 = 0
            if (r6 == 0) goto L56
            int r6 = r0.parseNumber()     // Catch: java.lang.Exception -> L18
            goto L57
        L56:
            r6 = 0
        L57:
            r0.skipWhiteSpace()     // Catch: java.lang.Exception -> L18 java.text.ParseException -> L5f
            int r7 = r0.parseTimeZone()     // Catch: java.lang.Exception -> L18 java.text.ParseException -> L5f
            goto L6d
        L5f:
            boolean r8 = javax.mail.internet.MailDateFormat.debug     // Catch: java.lang.Exception -> L18
            if (r8 == 0) goto L6d
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.Exception -> L18
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> L18
            r9.<init>(r10)     // Catch: java.lang.Exception -> L18
            r8.getClass()     // Catch: java.lang.Exception -> L18
        L6d:
            int r0 = r0.getIndex()     // Catch: java.lang.Exception -> L18
            r11.setIndex(r0)     // Catch: java.lang.Exception -> L18
            r8 = r12
            java.util.Date r10 = ourUTC(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L18
            return r10
        L7a:
            boolean r12 = javax.mail.internet.MailDateFormat.debug
            if (r12 == 0) goto L88
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
            r12.getClass()
        L88:
            r10 = 1
            r11.setIndex(r10)
            r10 = 0
            return r10
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public java.lang.StringBuffer format(java.util.Date r5, java.lang.StringBuffer r6, java.text.FieldPosition r7) {
            r4 = this;
            int r0 = r6.length()
            super.format(r5, r6, r7)
            int r0 = r0 + 25
        L9:
            char r7 = r6.charAt(r0)
            r1 = 88
            if (r7 != r1) goto L71
            java.util.Calendar r7 = r4.calendar
            r7.clear()
            java.util.Calendar r7 = r4.calendar
            r7.setTime(r5)
            java.util.Calendar r5 = r4.calendar
            r7 = 15
            int r5 = r5.get(r7)
            java.util.Calendar r7 = r4.calendar
            r1 = 16
            int r7 = r7.get(r1)
            int r5 = r5 + r7
            if (r5 >= 0) goto L37
            int r7 = r0 + 1
            r1 = 45
            r6.setCharAt(r0, r1)
            int r5 = -r5
            goto L3e
        L37:
            int r7 = r0 + 1
            r1 = 43
            r6.setCharAt(r0, r1)
        L3e:
            int r5 = r5 / 60
            int r5 = r5 / 1000
            int r0 = r5 / 60
            int r5 = r5 % 60
            int r1 = r7 + 1
            int r2 = r0 / 10
            r3 = 10
            char r2 = java.lang.Character.forDigit(r2, r3)
            r6.setCharAt(r7, r2)
            int r2 = r7 + 2
            int r0 = r0 % r3
            char r0 = java.lang.Character.forDigit(r0, r3)
            r6.setCharAt(r1, r0)
            int r7 = r7 + 3
            int r0 = r5 / 10
            char r0 = java.lang.Character.forDigit(r0, r3)
            r6.setCharAt(r2, r0)
            int r5 = r5 % r3
            char r5 = java.lang.Character.forDigit(r5, r3)
            r6.setCharAt(r7, r5)
            return r6
        L71:
            int r0 = r0 + 1
            goto L9
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public java.util.Date parse(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            char[] r2 = r2.toCharArray()
            boolean r0 = r1.isLenient()
            java.util.Date r2 = parseDate(r2, r3, r0)
            return r2
    }

    @Override // java.text.DateFormat
    public void setCalendar(java.util.Calendar r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Method setCalendar() shouldn't be called"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.text.DateFormat
    public void setNumberFormat(java.text.NumberFormat r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Method setNumberFormat() shouldn't be called"
            r2.<init>(r0)
            throw r2
    }
}
