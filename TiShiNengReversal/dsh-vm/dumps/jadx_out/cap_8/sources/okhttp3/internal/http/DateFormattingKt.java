package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DateFormattingKt {

    @org.jetbrains.annotations.NotNull
    private static final java.text.DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = null;
    public static final long MAX_DATE = 253402300799999L;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = null;

    static {
            okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1 r0 = new okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1
            r0.<init>()
            okhttp3.internal.http.DateFormattingKt.STANDARD_DATE_FORMAT = r0
            java.lang.String r14 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String r15 = "EEE MMM d yyyy HH:mm:ss z"
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r2 = "EEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r3 = "EEE MMM d HH:mm:ss yyyy"
            java.lang.String r4 = "EEE, dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r5 = "EEE, dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r6 = "EEE, dd MMM yy HH:mm:ss z"
            java.lang.String r7 = "EEE dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r8 = "EEE dd MMM yyyy HH:mm:ss z"
            java.lang.String r9 = "EEE dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r10 = "EEE dd-MMM-yy HH:mm:ss z"
            java.lang.String r11 = "EEE dd MMM yy HH:mm:ss z"
            java.lang.String r12 = "EEE,dd-MMM-yy HH:mm:ss z"
            java.lang.String r13 = "EEE,dd-MMM-yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            okhttp3.internal.http.DateFormattingKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            okhttp3.internal.http.DateFormattingKt.BROWSER_COMPATIBLE_DATE_FORMATS = r0
            return
    }

    public DateFormattingKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.util.Date toHttpDateOrNull(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r2 = 0
            r0.<init>(r2)
            okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1 r3 = okhttp3.internal.http.DateFormattingKt.STANDARD_DATE_FORMAT
            java.lang.Object r3 = r3.get()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r3 = r3.parse(r10, r0)
            int r4 = r0.getIndex()
            int r5 = r10.length()
            if (r4 != r5) goto L2a
            return r3
        L2a:
            java.lang.String[] r3 = okhttp3.internal.http.DateFormattingKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS
            monitor-enter(r3)
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4a
            r5 = 0
        L2f:
            if (r5 >= r4) goto L5e
            java.text.DateFormat[] r6 = okhttp3.internal.http.DateFormattingKt.BROWSER_COMPATIBLE_DATE_FORMATS     // Catch: java.lang.Throwable -> L4a
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L4c
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r8 = okhttp3.internal.http.DateFormattingKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS     // Catch: java.lang.Throwable -> L4a
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L4a
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L4a
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L4a
            java.util.TimeZone r8 = okhttp3.internal._UtilJvmKt.UTC     // Catch: java.lang.Throwable -> L4a
            r7.setTimeZone(r8)     // Catch: java.lang.Throwable -> L4a
            r6[r5] = r7     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r10 = move-exception
            goto L62
        L4c:
            r0.setIndex(r2)     // Catch: java.lang.Throwable -> L4a
            java.util.Date r6 = r7.parse(r10, r0)     // Catch: java.lang.Throwable -> L4a
            int r7 = r0.getIndex()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L5b
            monitor-exit(r3)
            return r6
        L5b:
            int r5 = r5 + 1
            goto L2f
        L5e:
            kotlin.n1 r10 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)
            return r1
        L62:
            monitor-exit(r3)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHttpDateString(@org.jetbrains.annotations.NotNull java.util.Date r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1 r0 = okhttp3.internal.http.DateFormattingKt.STANDARD_DATE_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r1 = r0.format(r1)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
