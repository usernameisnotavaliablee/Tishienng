package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c implements com.orhanobut.logger.f {
    private static final java.lang.String e = null;
    private static final java.lang.String f = " <br> ";
    private static final java.lang.String g = ",";

    @androidx.annotation.NonNull
    private final java.util.Date a;

    @androidx.annotation.NonNull
    private final java.text.SimpleDateFormat b;

    @androidx.annotation.NonNull
    private final com.orhanobut.logger.h c;

    @androidx.annotation.Nullable
    private final java.lang.String d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private static final int e = 512000;
        java.util.Date a;
        java.text.SimpleDateFormat b;
        com.orhanobut.logger.h c;
        java.lang.String d;

        private b() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "PRETTY_LOGGER"
                r1.d = r0
                return
        }

        /* synthetic */ b(com.orhanobut.logger.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.c a() {
                r4 = this;
                java.util.Date r0 = r4.a
                if (r0 != 0) goto Lb
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                r4.a = r0
            Lb:
                java.text.SimpleDateFormat r0 = r4.b
                if (r0 != 0) goto L1a
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r1 = "yyyy.MM.dd HH:mm:ss.SSS"
                java.util.Locale r2 = java.util.Locale.UK
                r0.<init>(r1, r2)
                r4.b = r0
            L1a:
                com.orhanobut.logger.h r0 = r4.c
                if (r0 != 0) goto L68
                java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                char r0 = java.io.File.separatorChar
                r1.append(r0)
                java.lang.String r0 = "logger"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                android.os.HandlerThread r1 = new android.os.HandlerThread
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "AndroidFileLogger."
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r1.start()
                com.orhanobut.logger.e$a r2 = new com.orhanobut.logger.e$a
                android.os.Looper r1 = r1.getLooper()
                r3 = 512000(0x7d000, float:7.17465E-40)
                r2.<init>(r1, r0, r3)
                com.orhanobut.logger.e r0 = new com.orhanobut.logger.e
                r0.<init>(r2)
                r4.c = r0
            L68:
                com.orhanobut.logger.c r0 = new com.orhanobut.logger.c
                r1 = 0
                r0.<init>(r4, r1)
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.c.b b(@androidx.annotation.Nullable java.util.Date r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.c.b c(@androidx.annotation.Nullable java.text.SimpleDateFormat r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.c.b d(@androidx.annotation.Nullable com.orhanobut.logger.h r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.c.b e(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.orhanobut.logger.c.e = r0
            return
    }

    private c(@androidx.annotation.NonNull com.orhanobut.logger.c.b r2) {
            r1 = this;
            r1.<init>()
            com.orhanobut.logger.n.a(r2)
            java.util.Date r0 = r2.a
            r1.a = r0
            java.text.SimpleDateFormat r0 = r2.b
            r1.b = r0
            com.orhanobut.logger.h r0 = r2.c
            r1.c = r0
            java.lang.String r2 = r2.d
            r1.d = r2
            return
    }

    /* synthetic */ c(com.orhanobut.logger.c.b r1, com.orhanobut.logger.c.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String b(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            boolean r0 = com.orhanobut.logger.n.d(r3)
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.d
            boolean r0 = com.orhanobut.logger.n.b(r0, r3)
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L25:
            java.lang.String r3 = r2.d
            return r3
    }

    @androidx.annotation.NonNull
    public static com.orhanobut.logger.c.b c() {
            com.orhanobut.logger.c$b r0 = new com.orhanobut.logger.c$b
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.orhanobut.logger.f
    public void a(int r5, @androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7) {
            r4 = this;
            com.orhanobut.logger.n.a(r7)
            java.lang.String r6 = r4.b(r6)
            java.util.Date r0 = r4.a
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Date r1 = r4.a
            long r1 = r1.getTime()
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.text.SimpleDateFormat r2 = r4.b
            java.util.Date r3 = r4.a
            java.lang.String r2 = r2.format(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = com.orhanobut.logger.n.e(r5)
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r2 = com.orhanobut.logger.c.e
            boolean r3 = r7.contains(r2)
            if (r3 == 0) goto L50
            java.lang.String r3 = " <br> "
            java.lang.String r7 = r7.replaceAll(r2, r3)
        L50:
            r0.append(r1)
            r0.append(r7)
            r0.append(r2)
            com.orhanobut.logger.h r7 = r4.c
            java.lang.String r0 = r0.toString()
            r7.a(r5, r6, r0)
            return
    }
}
