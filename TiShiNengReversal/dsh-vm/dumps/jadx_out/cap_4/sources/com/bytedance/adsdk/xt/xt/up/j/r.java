package com.bytedance.adsdk.xt.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.Object j(double r5, java.lang.Number r7) {
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L66
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 != 0) goto L66
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L66
        Lf:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L22
            long r3 = r7.longValue()
            double r3 = (double) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L22:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L35
            float r7 = r7.floatValue()
            double r3 = (double) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L30
            r1 = 1
        L30:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L35:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L47
            double r3 = r7.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L42
            r1 = 1
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L47:
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
        L66:
            int r7 = r7.intValue()
            double r3 = (double) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L70
            r1 = 1
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    private static java.lang.Object j(float r5, java.lang.Number r6) {
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L66
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto L66
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L66
        Lf:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L22
            long r3 = r6.longValue()
            float r6 = (float) r3
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L22:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L34
            float r6 = r6.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L2f
            r1 = 1
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L34:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L47
            double r3 = (double) r5
            double r5 = r6.doubleValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L42
            r1 = 1
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L47:
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
        L66:
            int r6 = r6.intValue()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L70
            r1 = 1
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    private static java.lang.Object j(int r5, java.lang.Number r6) {
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L67
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto L67
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L67
        Lf:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L22
            long r3 = (long) r5
            long r5 = r6.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L22:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L35
            float r5 = (float) r5
            float r6 = r6.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L30
            r1 = 1
        L30:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L35:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L48
            double r3 = (double) r5
            double r5 = r6.doubleValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L43
            r1 = 1
        L43:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L48:
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
        L67:
            int r6 = r6.intValue()
            if (r5 >= r6) goto L6e
            r1 = 1
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    private static java.lang.Object j(long r5, java.lang.Number r7) {
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L66
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 != 0) goto L66
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            goto L66
        Lf:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L21
            long r3 = r7.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1c
            r1 = 1
        L1c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L21:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L34
            float r5 = (float) r5
            float r6 = r7.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L2f
            r1 = 1
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L34:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L47
            double r5 = (double) r5
            double r3 = r7.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L42
            r1 = 1
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L47:
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
        L66:
            int r7 = r7.intValue()
            long r3 = (long) r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L70
            r1 = 1
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    public static java.lang.Object j(java.lang.Object r2, java.lang.Number r3) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L87
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L87
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto Le
            goto L87
        Le:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L1d
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            java.lang.Object r2 = j(r0, r3)
            return r2
        L1d:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L2c
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.lang.Object r2 = j(r2, r3)
            return r2
        L2c:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L3b
            java.lang.Double r2 = (java.lang.Double) r2
            double r0 = r2.doubleValue()
            java.lang.Object r2 = j(r0, r3)
            return r2
        L3b:
            boolean r0 = r2 instanceof java.lang.String
            java.lang.String r1 = "This type of addition operation is not supported"
            if (r0 == 0) goto L6a
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L4d
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.Object r2 = j(r0, r3)     // Catch: java.lang.NumberFormatException -> L4d
            return r2
        L4d:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L6a:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L87:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r2 = j(r2, r3)
            return r2
    }
}
