package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f686b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> f687c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.TimeZone f688d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.text.SimpleDateFormat> f689e = null;


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
            cn.jiguang.av.e.f686b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.av.e.f687c = r0
            java.lang.String r0 = "yyyyMMdd_HHmm"
            cn.jiguang.av.e.a = r0
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            cn.jiguang.av.e.f688d = r0
            cn.jiguang.av.e$1 r0 = new cn.jiguang.av.e$1
            r0.<init>()
            cn.jiguang.av.e.f689e = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(int r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 6
            r0.add(r1, r2)
            java.util.Date r2 = r0.getTime()
            long r0 = r2.getTime()
            return r0
    }

    public static java.lang.String a() {
            java.lang.String r0 = "yyyyMMdd HH:mm:ss.SSS"
            java.text.SimpleDateFormat r0 = a(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String a(java.util.Date r1) {
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = cn.jiguang.av.e.f689e
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r1 = r0.format(r1)
            return r1
    }

    public static java.text.SimpleDateFormat a(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jiguang.av.e.f687c
            java.lang.Object r0 = r0.get(r3)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L28
            java.lang.Object r1 = cn.jiguang.av.e.f686b
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jiguang.av.e.f687c     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            cn.jiguang.av.e$a r0 = new cn.jiguang.av.e$a     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r2 = cn.jiguang.av.e.f687c     // Catch: java.lang.Throwable -> L22
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

    public static java.lang.String b() {
            java.lang.String r0 = "yyyy-MM-dd_HH:mm:ss"
            java.text.SimpleDateFormat r0 = a(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.util.Date c() {
            java.util.TimeZone r0 = cn.jiguang.av.e.f688d
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            java.util.Date r0 = r0.getTime()
            return r0
    }

    static /* synthetic */ java.util.TimeZone d() {
            java.util.TimeZone r0 = cn.jiguang.av.e.f688d
            return r0
    }
}
