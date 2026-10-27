package com.bytedance.adsdk.xt.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.Object j(double r2, java.lang.Number r4) {
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L58
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 != 0) goto L58
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 == 0) goto Ld
            goto L58
        Ld:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L1c
            long r0 = r4.longValue()
            double r0 = (double) r0
            double r2 = r2 - r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L1c:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L2b
            float r4 = r4.floatValue()
            double r0 = (double) r4
            double r2 = r2 - r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L2b:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L39
            double r0 = r4.doubleValue()
            double r2 = r2 - r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L39:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "This type of addition operation is not supported"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L58:
            int r4 = r4.intValue()
            double r0 = (double) r4
            double r2 = r2 - r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
    }

    private static java.lang.Object j(float r2, java.lang.Number r3) {
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L58
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 != 0) goto L58
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto Ld
            goto L58
        Ld:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L1c
            long r0 = r3.longValue()
            float r3 = (float) r0
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L1c:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2a
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L2a:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L39
            double r0 = (double) r2
            double r2 = r3.doubleValue()
            double r0 = r0 - r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L39:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = "This type of addition operation is not supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L58:
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    private static java.lang.Object j(int r2, java.lang.Number r3) {
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L59
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 != 0) goto L59
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L1c
            long r0 = (long) r2
            long r2 = r3.longValue()
            long r0 = r0 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L1c:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2b
            float r2 = (float) r2
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L2b:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L3a
            double r0 = (double) r2
            double r2 = r3.doubleValue()
            double r0 = r0 - r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L3a:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = "This type of addition operation is not supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L59:
            int r3 = r3.intValue()
            int r2 = r2 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    private static java.lang.Object j(long r2, java.lang.Number r4) {
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L58
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 != 0) goto L58
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 == 0) goto Ld
            goto L58
        Ld:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L1b
            long r0 = r4.longValue()
            long r2 = r2 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L1b:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L2a
            float r2 = (float) r2
            float r3 = r4.floatValue()
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L2a:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L39
            double r2 = (double) r2
            double r0 = r4.doubleValue()
            double r2 = r2 - r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L39:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "This type of addition operation is not supported"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L58:
            int r4 = r4.intValue()
            long r0 = (long) r4
            long r2 = r2 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
    }

    public static java.lang.Object j(java.lang.Number r2, java.lang.Number r3) {
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
            java.lang.Object r2 = j(r0, r3)
            return r2
        L1a:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L27
            float r2 = r2.floatValue()
            java.lang.Object r2 = j(r2, r3)
            return r2
        L27:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L34
            double r0 = r2.doubleValue()
            java.lang.Object r2 = j(r0, r3)
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
            java.lang.Object r2 = j(r2, r3)
            return r2
    }
}
