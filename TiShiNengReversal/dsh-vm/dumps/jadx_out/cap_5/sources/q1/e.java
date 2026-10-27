package q1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static final java.lang.String a = "e";

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(java.lang.Long r5) {
            r0 = 1
            if (r5 != 0) goto Lb
            java.lang.String r5 = q1.e.a
            java.lang.String r1 = "Method isTimeExpire input param expireTime is null."
            com.huawei.hms.framework.common.Logger.v(r5, r1)
            return r0
        Lb:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L2b
            long r3 = r5.longValue()     // Catch: java.lang.NumberFormatException -> L2b
            long r3 = r3 - r1
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L23
            java.lang.String r5 = q1.e.a     // Catch: java.lang.NumberFormatException -> L2b
            java.lang.String r1 = "isSpExpire false."
            com.huawei.hms.framework.common.Logger.i(r5, r1)     // Catch: java.lang.NumberFormatException -> L2b
            r5 = 0
            return r5
        L23:
            java.lang.String r5 = q1.e.a     // Catch: java.lang.NumberFormatException -> L2b
            java.lang.String r1 = "isSpExpire true."
            com.huawei.hms.framework.common.Logger.i(r5, r1)     // Catch: java.lang.NumberFormatException -> L2b
            goto L32
        L2b:
            java.lang.String r5 = q1.e.a
            java.lang.String r1 = "isSpExpire spValue NumberFormatException."
            com.huawei.hms.framework.common.Logger.v(r5, r1)
        L32:
            return r0
    }

    public static boolean b(java.lang.Long r5, long r6) {
            r0 = 1
            if (r5 != 0) goto Lb
            java.lang.String r5 = q1.e.a
            java.lang.String r6 = "Method isTimeWillExpire input param expireTime is null."
            com.huawei.hms.framework.common.Logger.v(r5, r6)
            return r0
        Lb:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L24
            long r3 = r5.longValue()     // Catch: java.lang.NumberFormatException -> L24
            long r1 = r1 + r6
            long r3 = r3 - r1
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L2b
            java.lang.String r5 = q1.e.a     // Catch: java.lang.NumberFormatException -> L24
            java.lang.String r6 = "isSpExpire false."
            com.huawei.hms.framework.common.Logger.v(r5, r6)     // Catch: java.lang.NumberFormatException -> L24
            r5 = 0
            return r5
        L24:
            java.lang.String r5 = q1.e.a
            java.lang.String r6 = "isSpExpire spValue NumberFormatException."
            com.huawei.hms.framework.common.Logger.v(r5, r6)
        L2b:
            return r0
    }
}
