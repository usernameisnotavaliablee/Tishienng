package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static final java.lang.Object a = null;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> f1673b;

    private static class a extends java.lang.ThreadLocal<java.text.SimpleDateFormat> {
        private java.lang.String a;

        a(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        protected java.text.SimpleDateFormat a() {
                r3 = this;
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r1 = r3.a
                java.util.Locale r2 = java.util.Locale.ENGLISH
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.text.SimpleDateFormat initialValue() {
                r1 = this;
                java.text.SimpleDateFormat r0 = r1.a()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.ad.b.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.ad.b.f1673b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.text.SimpleDateFormat a(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jpush.android.ad.b.f1673b
            java.lang.Object r0 = r0.get(r3)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L28
            java.lang.Object r1 = cn.jpush.android.ad.b.a
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jpush.android.ad.b.f1673b     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            cn.jpush.android.ad.b$a r0 = new cn.jpush.android.ad.b$a     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r2 = cn.jpush.android.ad.b.f1673b     // Catch: java.lang.Throwable -> L22
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            goto L28
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r3
        L28:
            java.lang.Object r3 = r0.get()
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            return r3
    }

    public static long b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r0 = a(r0)     // Catch: java.text.ParseException -> L16
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L16
            long r0 = r2.getTime()     // Catch: java.text.ParseException -> L16
            return r0
        L16:
            r0 = -1
            return r0
    }
}
