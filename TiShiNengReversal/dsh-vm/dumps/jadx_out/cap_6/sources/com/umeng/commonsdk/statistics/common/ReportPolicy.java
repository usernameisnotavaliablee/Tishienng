package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ReportPolicy {
    public static final int BATCH_AT_LAUNCH = 1;
    static final int BATCH_AT_TERMINATE = 2;
    public static final int BATCH_BY_INTERVAL = 6;
    public static final int DAILY = 4;
    static final int IMMEDIATE = 3;
    public static final int QUASI_REALTIME_POLICY = 11;
    public static final int REALTIME = 0;
    public static final int SMART_POLICY = 8;
    public static final int WIFIONLY = 5;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DebugPolicy extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private final long ReportInterval;
        private com.umeng.commonsdk.statistics.internal.StatTracer mTracer;

        public DebugPolicy(com.umeng.commonsdk.statistics.internal.StatTracer r3) {
                r2 = this;
                r2.<init>()
                r0 = 15000(0x3a98, double:7.411E-320)
                r2.ReportInterval = r0
                r2.mTracer = r3
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r5) {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.content.Context r5 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastSuccessfulBuildTime(r5)
                long r0 = r0 - r2
                r2 = 15000(0x3a98, double:7.411E-320)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L15
                r5 = 1
                return r5
            L15:
                r5 = 0
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DefconPolicy extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private com.umeng.commonsdk.statistics.noise.Defcon defcon;
        private com.umeng.commonsdk.statistics.internal.StatTracer tracer;

        public DefconPolicy(com.umeng.commonsdk.statistics.internal.StatTracer r1, com.umeng.commonsdk.statistics.noise.Defcon r2) {
                r0 = this;
                r0.<init>()
                r0.tracer = r1
                r0.defcon = r2
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
                r1 = this;
                com.umeng.commonsdk.statistics.noise.Defcon r0 = r1.defcon
                boolean r0 = r0.isOpen()
                return r0
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r7) {
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                com.umeng.commonsdk.statistics.noise.Defcon r7 = r6.defcon
                long r2 = r7.getReqInterval()
                android.content.Context r7 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastSuccessfulBuildTime(r7)
                long r0 = r0 - r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 < 0) goto L19
                r7 = 1
                return r7
            L19:
                r7 = 0
                return r7
        }

        public boolean shouldSendMessageByInstant() {
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                com.umeng.commonsdk.statistics.noise.Defcon r2 = r6.defcon
                long r2 = r2.getReqInterval()
                android.content.Context r4 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastInstantBuildTime(r4)
                long r0 = r0 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L19
                r0 = 1
                return r0
            L19:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LatentPolicy extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private long latency;
        private long start;

        public LatentPolicy(int r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.start = r0
                long r0 = (long) r3
                r2.latency = r0
                long r0 = java.lang.System.currentTimeMillis()
                r2.start = r0
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
                r5 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r5.start
                long r0 = r0 - r2
                long r2 = r5.latency
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r5) {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.start
                long r0 = r0 - r2
                long r2 = r4.latency
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto Lf
                r5 = 1
                return r5
            Lf:
                r5 = 0
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportAtLaunch extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        public ReportAtLaunch() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r1) {
                r0 = this;
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportByInterval extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private static long MAX_REPORT_INTERVAL = 86400000;
        private static long MIN_REPORT_INTERVAL = 90000;
        private long mReportInterval;
        private com.umeng.commonsdk.statistics.internal.StatTracer mTracer;

        static {
                return
        }

        public ReportByInterval(com.umeng.commonsdk.statistics.internal.StatTracer r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.mTracer = r1
                r0.setReportInterval(r2)
                return
        }

        public static boolean isValidValue(int r4) {
                long r0 = (long) r4
                long r2 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval.MIN_REPORT_INTERVAL
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L9
                r4 = 0
                return r4
            L9:
                r4 = 1
                return r4
        }

        public long getReportInterval() {
                r2 = this;
                long r0 = r2.mReportInterval
                return r0
        }

        public void setReportInterval(long r6) {
                r5 = this;
                long r0 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval.MIN_REPORT_INTERVAL
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                long r2 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval.MAX_REPORT_INTERVAL
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 > 0) goto Lf
                r5.mReportInterval = r6
                return
            Lf:
                r5.mReportInterval = r0
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r6) {
                r5 = this;
                r0 = 1
                if (r6 == 0) goto L4
                return r0
            L4:
                long r1 = java.lang.System.currentTimeMillis()
                android.content.Context r6 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastSuccessfulBuildTime(r6)
                long r1 = r1 - r3
                long r3 = r5.mReportInterval
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 < 0) goto L18
                return r0
            L18:
                r6 = 0
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportDaily extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private long HOURS_DAY;
        private com.umeng.commonsdk.statistics.internal.StatTracer mTracer;

        public ReportDaily(com.umeng.commonsdk.statistics.internal.StatTracer r3) {
                r2 = this;
                r2.<init>()
                r0 = 86400000(0x5265c00, double:4.2687272E-316)
                r2.HOURS_DAY = r0
                r2.mTracer = r3
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r5) {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.content.Context r5 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastSuccessfulBuildTime(r5)
                long r0 = r0 - r2
                long r2 = r4.HOURS_DAY
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L15
                r5 = 1
                return r5
            L15:
                r5 = 0
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportQuasiRealtime extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private static long DEFAULT_REPORT_INTERVAL = 15000;
        private static long MAX_REPORT_INTERVAL = 90000;
        private static long MIN_REPORT_INTERVAL = 3000;
        private long mReportInterval;

        static {
                return
        }

        public ReportQuasiRealtime() {
                r0 = this;
                r0.<init>()
                return
        }

        public long getReportInterval() {
                r2 = this;
                long r0 = r2.mReportInterval
                return r0
        }

        public void setReportInterval(long r4) {
                r3 = this;
                long r0 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime.MIN_REPORT_INTERVAL
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                long r0 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime.MAX_REPORT_INTERVAL
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto Lf
                r3.mReportInterval = r4
                return
            Lf:
                long r4 = com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime.DEFAULT_REPORT_INTERVAL
                r3.mReportInterval = r4
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportRealtime extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        public ReportRealtime() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportStrategy {
        public ReportStrategy() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }

        public boolean shouldSendMessage(boolean r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ReportWifiOnly extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private android.content.Context mContext;

        public ReportWifiOnly(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r1) {
                r0 = this;
                android.content.Context r1 = r0.mContext
                boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.isWiFiAvailable(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SmartPolicy extends com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy {
        private final long ReportInterval;
        private com.umeng.commonsdk.statistics.internal.StatTracer mTracer;

        public SmartPolicy(com.umeng.commonsdk.statistics.internal.StatTracer r3) {
                r2 = this;
                r2.<init>()
                r0 = 10800000(0xa4cb80, double:5.335909E-317)
                r2.ReportInterval = r0
                r2.mTracer = r3
                return
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean r5) {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.content.Context r5 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
                long r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.getLastSuccessfulBuildTime(r5)
                long r0 = r0 - r2
                r2 = 10800000(0xa4cb80, double:5.335909E-317)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L16
                r5 = 1
                return r5
            L16:
                r5 = 0
                return r5
        }
    }

    public ReportPolicy() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isValid(int r1) {
            r0 = 8
            if (r1 == r0) goto Ld
            r0 = 11
            if (r1 == r0) goto Ld
            switch(r1) {
                case 0: goto Ld;
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Ld;
                case 4: goto Ld;
                case 5: goto Ld;
                case 6: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }
}
