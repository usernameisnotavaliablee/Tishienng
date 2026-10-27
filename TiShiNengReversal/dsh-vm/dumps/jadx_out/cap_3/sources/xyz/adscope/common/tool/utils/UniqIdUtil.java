package xyz.adscope.common.tool.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UniqIdUtil {
    private static xyz.adscope.common.tool.utils.UniqIdUtil f;
    private java.lang.String a;
    private final java.util.Random b;
    private final xyz.adscope.common.tool.utils.UniqIdUtil.UniqTimer c;
    private boolean d;
    private final java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.tool.utils.UniqIdUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class UniqTimer {
        private final java.util.concurrent.atomic.AtomicLong a;
        final /* synthetic */ xyz.adscope.common.tool.utils.UniqIdUtil b;

        private UniqTimer(xyz.adscope.common.tool.utils.UniqIdUtil r3) {
                r2 = this;
                r2.b = r3
                r2.<init>()
                java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
                long r0 = java.lang.System.currentTimeMillis()
                r3.<init>(r0)
                r2.a = r3
                return
        }

        /* synthetic */ UniqTimer(xyz.adscope.common.tool.utils.UniqIdUtil r1, xyz.adscope.common.tool.utils.UniqIdUtil.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String getCurrentTime() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.a
                long r0 = r0.incrementAndGet()
                java.lang.String r0 = xyz.adscope.common.tool.utils.UniqIdUtil.timestamp2Date(r0)
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.String r1 = xyz.adscope.common.tool.utils.UniqIdUtil.timestamp2Date(r1)
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2f
                java.util.concurrent.atomic.AtomicLong r0 = r5.a
                long r1 = java.lang.System.currentTimeMillis()
                xyz.adscope.common.tool.utils.UniqIdUtil r3 = r5.b
                java.util.Random r3 = xyz.adscope.common.tool.utils.UniqIdUtil.a(r3)
                r4 = 10000(0x2710, float:1.4013E-41)
                int r3 = r3.nextInt(r4)
                long r3 = (long) r3
                long r1 = r1 + r3
                r0.set(r1)
            L2f:
                java.util.concurrent.atomic.AtomicLong r0 = r5.a
                long r0 = r0.incrementAndGet()
                java.lang.String r0 = xyz.adscope.common.tool.utils.UniqIdUtil.a(r0)
                return r0
        }
    }

    static {
            xyz.adscope.common.tool.utils.UniqIdUtil r0 = new xyz.adscope.common.tool.utils.UniqIdUtil
            r0.<init>()
            xyz.adscope.common.tool.utils.UniqIdUtil.f = r0
            return
    }

    private UniqIdUtil() {
            r3 = this;
            r3.<init>()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r3.b = r0
            xyz.adscope.common.tool.utils.UniqIdUtil$UniqTimer r0 = new xyz.adscope.common.tool.utils.UniqIdUtil$UniqTimer
            r1 = 0
            r0.<init>(r3, r1)
            r3.c = r0
            r0 = 0
            r3.d = r0
            java.lang.String r0 = "MTI3LjAuMC4x"
            r3.e = r0
            java.lang.String r0 = xyz.adscope.common.tool.security.Base64Util.decode(r0)
            java.lang.String r1 = r3.a
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.trim()
            int r1 = r1.length()
            if (r1 == 0) goto L33
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
        L33:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.a = r0
        L3d:
            java.lang.String r0 = r3.a
            int r1 = r0.length()
            int r1 = r1 + (-2)
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = "."
            java.lang.String r2 = "0"
            java.lang.String r0 = r0.replace(r1, r2)
            r3.a = r0
            boolean r0 = r3.d
            if (r0 == 0) goto L61
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = r3.a
            r1.length()
            r0.getClass()
        L61:
            return
    }

    static /* synthetic */ java.lang.String a(long r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    static /* synthetic */ java.util.Random a(xyz.adscope.common.tool.utils.UniqIdUtil r0) {
            java.util.Random r0 = r0.b
            return r0
    }

    private static java.lang.String b(long r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMddHHmmss"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r2 = r0.format(r1)
            return r2
    }

    public static xyz.adscope.common.tool.utils.UniqIdUtil getInstance() {
            xyz.adscope.common.tool.utils.UniqIdUtil r0 = xyz.adscope.common.tool.utils.UniqIdUtil.f
            r1 = 0
            r0.d = r1
            return r0
    }

    public static xyz.adscope.common.tool.utils.UniqIdUtil getInstanceWithLog() {
            xyz.adscope.common.tool.utils.UniqIdUtil r0 = xyz.adscope.common.tool.utils.UniqIdUtil.f
            r1 = 1
            r0.d = r1
            return r0
    }

    public static java.lang.String left(java.lang.String r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r2 >= 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            int r0 = r1.length()
            if (r0 > r2) goto L10
            return r1
        L10:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            return r1
    }

    public static java.lang.String leftPad(java.lang.String r2, int r3, char r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length()
            int r0 = r3 - r0
            if (r0 > 0) goto Ld
            return r2
        Ld:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r1) goto L1a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = leftPad(r2, r3, r4)
            return r2
        L1a:
            java.lang.String r3 = repeat(r4, r0)
            java.lang.String r2 = r3.concat(r2)
            return r2
    }

    public static java.lang.String leftPad(java.lang.String r4, int r5, java.lang.String r6) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lc
            java.lang.String r6 = ""
        Lc:
            int r0 = r6.length()
            int r1 = r4.length()
            int r1 = r5 - r1
            if (r1 > 0) goto L19
            return r4
        L19:
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L2a
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 > r2) goto L2a
            char r6 = r6.charAt(r3)
            java.lang.String r4 = leftPad(r4, r5, r6)
            return r4
        L2a:
            if (r1 != r0) goto L31
            java.lang.String r4 = r6.concat(r4)
            return r4
        L31:
            if (r1 >= r0) goto L3c
            java.lang.String r5 = r6.substring(r3, r1)
            java.lang.String r4 = r5.concat(r4)
            return r4
        L3c:
            char[] r5 = new char[r1]
            char[] r6 = r6.toCharArray()
        L42:
            if (r3 >= r1) goto L4d
            int r2 = r3 % r0
            char r2 = r6[r2]
            r5[r3] = r2
            int r3 = r3 + 1
            goto L42
        L4d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            java.lang.String r4 = r6.concat(r4)
            return r4
    }

    public static java.lang.String repeat(char r0, int r1) {
            if (r1 > 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            char[] r1 = new char[r1]
            java.util.Arrays.fill(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String timestamp2Date(long r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
            return r4
    }

    public java.lang.String getUniqID() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r4.getUniqTime()
            java.util.Random r2 = r4.b
            r3 = 8999999(0x89543f, float:1.2611685E-38)
            int r2 = r2.nextInt(r3)
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r2 = r2 + r3
            r0.append(r1)
            java.lang.String r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = r4.getUniqThreadCode()
            r0.append(r1)
            r0.append(r2)
            boolean r1 = r4.d
            if (r1 == 0) goto L3d
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r2.length()
            r1.getClass()
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
        L3d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getUniqThreadCode() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 9
            java.lang.String r0 = left(r0, r1)
            boolean r2 = r3.d
            if (r2 == 0) goto L1e
            java.io.PrintStream r2 = java.lang.System.out
            r0.length()
            r2.getClass()
        L1e:
            java.lang.String r2 = "0"
            java.lang.String r0 = leftPad(r0, r1, r2)
            return r0
    }

    public java.lang.String getUniqTime() {
            r2 = this;
            xyz.adscope.common.tool.utils.UniqIdUtil$UniqTimer r0 = r2.c
            java.lang.String r0 = r0.getCurrentTime()
            boolean r1 = r2.d
            if (r1 == 0) goto L12
            java.io.PrintStream r1 = java.lang.System.out
            r0.length()
            r1.getClass()
        L12:
            return r0
    }
}
