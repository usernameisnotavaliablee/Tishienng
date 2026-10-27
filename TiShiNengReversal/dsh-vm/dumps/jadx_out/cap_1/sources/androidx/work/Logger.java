package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final java.lang.String TAG_PREFIX = "WM-";
    private static androidx.work.Logger sLogger;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LogcatLogger extends androidx.work.Logger {
        private int mLoggingLevel;

        public LogcatLogger(int r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mLoggingLevel = r1
                return
        }

        @Override // androidx.work.Logger
        public void debug(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3) {
                r0 = this;
                int r1 = r0.mLoggingLevel
                r2 = 3
                if (r1 > r2) goto Le
                if (r3 == 0) goto Le
                int r1 = r3.length
                r2 = 1
                if (r1 < r2) goto Le
                r1 = 0
                r1 = r3[r1]
            Le:
                return
        }

        @Override // androidx.work.Logger
        public void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3) {
                r0 = this;
                int r1 = r0.mLoggingLevel
                r2 = 6
                if (r1 > r2) goto Le
                if (r3 == 0) goto Le
                int r1 = r3.length
                r2 = 1
                if (r1 < r2) goto Le
                r1 = 0
                r1 = r3[r1]
            Le:
                return
        }

        @Override // androidx.work.Logger
        public void info(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3) {
                r0 = this;
                int r1 = r0.mLoggingLevel
                r2 = 4
                if (r1 > r2) goto Le
                if (r3 == 0) goto Le
                int r1 = r3.length
                r2 = 1
                if (r1 < r2) goto Le
                r1 = 0
                r1 = r3[r1]
            Le:
                return
        }

        @Override // androidx.work.Logger
        public void verbose(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3) {
                r0 = this;
                int r1 = r0.mLoggingLevel
                r2 = 2
                if (r1 > r2) goto Le
                if (r3 == 0) goto Le
                int r1 = r3.length
                r2 = 1
                if (r1 < r2) goto Le
                r1 = 0
                r1 = r3[r1]
            Le:
                return
        }

        @Override // androidx.work.Logger
        public void warning(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3) {
                r0 = this;
                int r1 = r0.mLoggingLevel
                r2 = 5
                if (r1 > r2) goto Le
                if (r3 == 0) goto Le
                int r1 = r3.length
                r2 = 1
                if (r1 < r2) goto Le
                r1 = 0
                r1 = r3[r1]
            Le:
                return
        }
    }

    static {
            return
    }

    public Logger(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized androidx.work.Logger get() {
            java.lang.Class<androidx.work.Logger> r0 = androidx.work.Logger.class
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.sLogger     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            androidx.work.Logger$LogcatLogger r1 = new androidx.work.Logger$LogcatLogger     // Catch: java.lang.Throwable -> L10
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            androidx.work.Logger.sLogger = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L16
        L12:
            androidx.work.Logger r1 = androidx.work.Logger.sLogger     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static synchronized void setLogger(androidx.work.Logger r1) {
            java.lang.Class<androidx.work.Logger> r0 = androidx.work.Logger.class
            monitor-enter(r0)
            androidx.work.Logger.sLogger = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.lang.String tagWithPrefix(@androidx.annotation.NonNull java.lang.String r3) {
            int r0 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 23
            r1.<init>(r2)
            java.lang.String r2 = "WM-"
            r1.append(r2)
            int r2 = androidx.work.Logger.MAX_PREFIXED_TAG_LENGTH
            if (r0 < r2) goto L1d
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r2)
            r1.append(r3)
            goto L20
        L1d:
            r1.append(r3)
        L20:
            java.lang.String r3 = r1.toString()
            return r3
    }

    public abstract void debug(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void info(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void verbose(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void warning(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);
}
