package com.bytedance.adsdk.xt.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean j(double r5, java.lang.Number r7) {
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5a
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 != 0) goto L5a
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L5a
        Lf:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            long r3 = r7.longValue()
            double r3 = (double) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L2d
            float r7 = r7.floatValue()
            double r3 = (double) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L2c
            return r2
        L2c:
            return r1
        L2d:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L3b
            double r3 = r7.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L3a
            return r2
        L3a:
            return r1
        L3b:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r6.append(r7)
            java.lang.String r7 = "This type of addition operation is not supported"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5a:
            int r7 = r7.intValue()
            double r3 = (double) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L64
            return r2
        L64:
            return r1
    }

    private static boolean j(float r5, java.lang.Number r6) {
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5a
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto L5a
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L5a
        Lf:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            long r3 = r6.longValue()
            float r6 = (float) r3
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L2c
            float r6 = r6.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L2b
            return r2
        L2b:
            return r1
        L2c:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L3b
            double r3 = (double) r5
            double r5 = r6.doubleValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            return r2
        L3a:
            return r1
        L3b:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r0.append(r6)
            java.lang.String r6 = "This type of addition operation is not supported"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L5a:
            int r6 = r6.intValue()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L64
            return r2
        L64:
            return r1
    }

    private static boolean j(int r5, java.lang.Number r6) {
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5b
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto L5b
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L5b
        Lf:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            long r3 = (long) r5
            long r5 = r6.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L2d
            float r5 = (float) r5
            float r6 = r6.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L2c
            return r2
        L2c:
            return r1
        L2d:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L3c
            double r3 = (double) r5
            double r5 = r6.doubleValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L3b
            return r2
        L3b:
            return r1
        L3c:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r0.append(r6)
            java.lang.String r6 = "This type of addition operation is not supported"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L5b:
            int r6 = r6.intValue()
            if (r5 != r6) goto L62
            return r2
        L62:
            return r1
    }

    private static boolean j(long r5, java.lang.Number r7) {
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5a
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 != 0) goto L5a
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L5a
        Lf:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L1d
            long r3 = r7.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L1c
            return r2
        L1c:
            return r1
        L1d:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L2c
            float r5 = (float) r5
            float r6 = r7.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L2b
            return r2
        L2b:
            return r1
        L2c:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L3b
            double r5 = (double) r5
            double r3 = r7.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L3a
            return r2
        L3a:
            return r1
        L3b:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r6.append(r7)
            java.lang.String r7 = "This type of addition operation is not supported"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5a:
            int r7 = r7.intValue()
            long r3 = (long) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L64
            return r2
        L64:
            return r1
    }

    public static boolean j(java.lang.Number r2, java.lang.Number r3) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L53
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L53
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto Ld
            goto L53
        Ld:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L1a
            long r0 = r2.longValue()
            boolean r2 = j(r0, r3)
            return r2
        L1a:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L27
            float r2 = r2.floatValue()
            boolean r2 = j(r2, r3)
            return r2
        L27:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L34
            double r0 = r2.doubleValue()
            boolean r2 = j(r0, r3)
            return r2
        L34:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "This type of addition operation is not supported"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L53:
            int r2 = r2.intValue()
            boolean r2 = j(r2, r3)
            return r2
    }
}
