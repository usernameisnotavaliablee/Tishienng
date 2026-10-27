package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpHeaderDateFormat extends java.text.SimpleDateFormat {
    private static final io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.http.HttpHeaderDateFormat> dateFormatThreadLocal = null;
    private static final long serialVersionUID = -925286159755905325L;
    private final java.text.SimpleDateFormat format1;
    private final java.text.SimpleDateFormat format2;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HttpHeaderDateFormatObsolete1 extends java.text.SimpleDateFormat {
        private static final long serialVersionUID = -3178072504225114298L;

        HttpHeaderDateFormatObsolete1() {
                r2 = this;
                java.lang.String r0 = "E, dd-MMM-yy HH:mm:ss z"
                java.util.Locale r1 = java.util.Locale.ENGLISH
                r2.<init>(r0, r1)
                java.lang.String r0 = "GMT"
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                r2.setTimeZone(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HttpHeaderDateFormatObsolete2 extends java.text.SimpleDateFormat {
        private static final long serialVersionUID = 3010674519968303714L;

        HttpHeaderDateFormatObsolete2() {
                r2 = this;
                java.lang.String r0 = "E MMM d HH:mm:ss yyyy"
                java.util.Locale r1 = java.util.Locale.ENGLISH
                r2.<init>(r0, r1)
                java.lang.String r0 = "GMT"
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                r2.setTimeZone(r0)
                return
        }
    }

    static {
            io.netty.handler.codec.http.HttpHeaderDateFormat$1 r0 = new io.netty.handler.codec.http.HttpHeaderDateFormat$1
            r0.<init>()
            io.netty.handler.codec.http.HttpHeaderDateFormat.dateFormatThreadLocal = r0
            return
    }

    private HttpHeaderDateFormat() {
            r2 = this;
            java.lang.String r0 = "E, dd MMM yyyy HH:mm:ss z"
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2.<init>(r0, r1)
            io.netty.handler.codec.http.HttpHeaderDateFormat$HttpHeaderDateFormatObsolete1 r0 = new io.netty.handler.codec.http.HttpHeaderDateFormat$HttpHeaderDateFormatObsolete1
            r0.<init>()
            r2.format1 = r0
            io.netty.handler.codec.http.HttpHeaderDateFormat$HttpHeaderDateFormatObsolete2 r0 = new io.netty.handler.codec.http.HttpHeaderDateFormat$HttpHeaderDateFormatObsolete2
            r0.<init>()
            r2.format2 = r0
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r2.setTimeZone(r0)
            return
    }

    /* synthetic */ HttpHeaderDateFormat(io.netty.handler.codec.http.HttpHeaderDateFormat.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.http.HttpHeaderDateFormat get() {
            io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.http.HttpHeaderDateFormat> r0 = io.netty.handler.codec.http.HttpHeaderDateFormat.dateFormatThreadLocal
            java.lang.Object r0 = r0.get()
            io.netty.handler.codec.http.HttpHeaderDateFormat r0 = (io.netty.handler.codec.http.HttpHeaderDateFormat) r0
            return r0
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public java.util.Date parse(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            java.util.Date r0 = super.parse(r2, r3)
            if (r0 != 0) goto Lc
            java.text.SimpleDateFormat r0 = r1.format1
            java.util.Date r0 = r0.parse(r2, r3)
        Lc:
            if (r0 != 0) goto L15
            java.text.SimpleDateFormat r0 = r1.format2
            java.util.Date r2 = r0.parse(r2, r3)
            return r2
        L15:
            return r0
    }
}
