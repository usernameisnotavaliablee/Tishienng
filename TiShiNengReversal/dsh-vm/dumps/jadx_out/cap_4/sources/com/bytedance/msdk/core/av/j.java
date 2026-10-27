package com.bytedance.msdk.core.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> T j(java.lang.Class<T> r2) {
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 == r0) goto L49
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L9
            goto L49
        L9:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L43
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L12
            goto L43
        L12:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 == r0) goto L3c
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L1b
            goto L3c
        L1b:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r2 == r0) goto L36
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L24
            goto L36
        L24:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 == r0) goto L2f
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L2d
            goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L36:
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L3c:
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L43:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L49:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
    }

    public static java.lang.Object j(java.util.Map<java.lang.String, java.lang.Object> r1) {
            if (r1 == 0) goto L9
            java.lang.String r0 = "key_baidu_request_parameters"
            java.lang.Object r1 = r1.get(r0)
            return r1
        L9:
            r1 = 0
            return r1
    }
}
