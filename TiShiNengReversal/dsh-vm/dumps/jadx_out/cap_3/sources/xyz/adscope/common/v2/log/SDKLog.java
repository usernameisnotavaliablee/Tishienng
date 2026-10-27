package xyz.adscope.common.v2.log;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SDKLog {
    private static int CURRENT_LOG_LEVEL = 0;
    private static final java.lang.String LOG_CONFIG = "Scope_LogConfig.properties";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LOG_LEVEL extends java.lang.Enum<xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL> {
        private static final /* synthetic */ xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL[] $VALUES = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_ALL = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_DEBUG = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_ERROR = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_RENDER = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_STACK = null;
        public static final xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL LOG_LEVEL_WARN = null;
        private final int value;

        private static /* synthetic */ xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL[] $values() {
                r0 = 6
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL[] r0 = new xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL[r0]
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ERROR
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_WARN
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_DEBUG
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_STACK
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_RENDER
                r2 = 4
                r0[r2] = r1
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ALL
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                java.lang.String r1 = "LOG_LEVEL_ERROR"
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ERROR = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                java.lang.String r1 = "LOG_LEVEL_WARN"
                r2 = 1
                r4 = 4
                r0.<init>(r1, r2, r4)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_WARN = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                java.lang.String r1 = "LOG_LEVEL_DEBUG"
                r2 = 8
                r0.<init>(r1, r3, r2)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_DEBUG = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                r1 = 3
                r2 = 16
                java.lang.String r3 = "LOG_LEVEL_STACK"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_STACK = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                java.lang.String r1 = "LOG_LEVEL_RENDER"
                r2 = 32
                r0.<init>(r1, r4, r2)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_RENDER = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = new xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL
                r1 = 5
                r2 = 268435455(0xfffffff, float:2.5243547E-29)
                java.lang.String r3 = "LOG_LEVEL_ALL"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ALL = r0
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL[] r0 = $values()
                xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.$VALUES = r0
                return
        }

        LOG_LEVEL(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL> r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r1 = (xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL) r1
                return r1
        }

        public static xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL[] values() {
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL[] r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL[] r0 = (xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL[]) r0
                return r0
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    static {
            return
    }

    public SDKLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_DEBUG
            isLogLevel(r0)
            return
    }

    public static void dd(java.lang.String r5, java.lang.String r6) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_DEBUG
            boolean r0 = isLogLevel(r0)
            if (r0 == 0) goto L38
            if (r5 == 0) goto L38
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L38
            if (r6 == 0) goto L38
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L19
            goto L38
        L19:
            int r5 = r6.length()
            long r0 = (long) r5
            r5 = 3072(0xc00, float:4.305E-42)
            long r2 = (long) r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L38
        L26:
            int r0 = r6.length()
            if (r0 <= r5) goto L38
            r0 = 0
            java.lang.String r0 = r6.substring(r0, r5)
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r0, r1)
            goto L26
        L38:
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ERROR
            isLogLevel(r0)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void initSDKLog(android.content.Context r2) {
            xyz.adscope.common.v2.dev.info.PropertiesUtils r0 = xyz.adscope.common.v2.dev.info.PropertiesUtils.getInstance()
            java.lang.String r1 = "Scope_LogConfig.properties"
            r0.loadPropertiesFormAssets(r2, r1)
            xyz.adscope.common.v2.dev.info.PropertiesUtils r2 = xyz.adscope.common.v2.dev.info.PropertiesUtils.getInstance()
            int r2 = r2.getLogLevel()
            if (r2 <= 0) goto L24
            r0 = 5
            if (r2 <= r0) goto L1f
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r2 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_ALL
            int r2 = r2.getValue()
            xyz.adscope.common.v2.log.SDKLog.CURRENT_LOG_LEVEL = r2
            return
        L1f:
            r0 = 1
            int r2 = r0 << r2
            xyz.adscope.common.v2.log.SDKLog.CURRENT_LOG_LEVEL = r2
        L24:
            return
    }

    public static boolean isLogLevel(xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL r1) {
            int r0 = xyz.adscope.common.v2.log.SDKLog.CURRENT_LOG_LEVEL
            if (r0 == 0) goto Lc
            int r1 = r1.getValue()
            if (r0 < r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static void renderError(java.lang.String r0, java.lang.String r1) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_RENDER
            isLogLevel(r0)
            return
    }

    public static void renderInfo(java.lang.String r0, java.lang.String r1) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_RENDER
            isLogLevel(r0)
            return
    }

    public static void setLogLevel(xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL r0) {
            int r0 = r0.getValue()
            xyz.adscope.common.v2.log.SDKLog.CURRENT_LOG_LEVEL = r0
            return
    }

    public static void stack(java.lang.Throwable r0) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_STACK
            isLogLevel(r0)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1) {
            xyz.adscope.common.v2.log.SDKLog$LOG_LEVEL r0 = xyz.adscope.common.v2.log.SDKLog.LOG_LEVEL.LOG_LEVEL_WARN
            isLogLevel(r0)
            return
    }
}
