package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class u6 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.huawei.hms.scankit.p.u6> CREATOR = null;
    private final float a;
    private final float b;
    private int c;
    private boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.os.Parcelable.Creator<com.huawei.hms.scankit.p.u6> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.huawei.hms.scankit.p.u6 a(android.os.Parcel r2) {
                r1 = this;
                com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
                r0.<init>(r2)
                return r0
        }

        public com.huawei.hms.scankit.p.u6[] a(int r1) {
                r0 = this;
                com.huawei.hms.scankit.p.u6[] r1 = new com.huawei.hms.scankit.p.u6[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.scankit.p.u6 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.huawei.hms.scankit.p.u6 r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.scankit.p.u6[] newArray(int r1) {
                r0 = this;
                com.huawei.hms.scankit.p.u6[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            com.huawei.hms.scankit.p.u6$a r0 = new com.huawei.hms.scankit.p.u6$a
            r0.<init>()
            com.huawei.hms.scankit.p.u6.CREATOR = r0
            return
    }

    public u6(float r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.a = r2
            r1.b = r3
            return
    }

    public u6(float r2, float r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public u6(float r2, float r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.a = r2
            r1.b = r3
            r1.d = r4
            return
    }

    protected u6(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            float r0 = r2.readFloat()
            r1.a = r0
            float r2 = r2.readFloat()
            r1.b = r2
            return
    }

    public static float a(com.huawei.hms.scankit.p.u6 r2, com.huawei.hms.scankit.p.u6 r3) {
            float r0 = r2.a
            float r2 = r2.b
            float r1 = r3.a
            float r3 = r3.b
            float r2 = com.huawei.hms.scankit.p.s4.a(r0, r2, r1, r3)
            return r2
    }

    private static float a(com.huawei.hms.scankit.p.u6 r3, com.huawei.hms.scankit.p.u6 r4, com.huawei.hms.scankit.p.u6 r5) {
            float r0 = r4.a
            float r4 = r4.b
            float r1 = r5.a
            float r1 = r1 - r0
            float r2 = r3.b
            float r2 = r2 - r4
            float r1 = r1 * r2
            float r5 = r5.b
            float r5 = r5 - r4
            float r3 = r3.a
            float r3 = r3 - r0
            float r5 = r5 * r3
            float r1 = r1 - r5
            return r1
    }

    public static void a(com.huawei.hms.scankit.p.u6[] r14) {
            r0 = 0
            r1 = r14[r0]
            r2 = 1
            r3 = r14[r2]
            float r1 = a(r1, r3)
            r3 = r14[r2]
            r4 = 2
            r5 = r14[r4]
            float r3 = a(r3, r5)
            r5 = r14[r0]
            r6 = r14[r4]
            float r5 = a(r5, r6)
            int[] r6 = a(r3, r1, r5)
            r7 = r6[r0]
            r8 = r6[r2]
            r6 = r6[r4]
            r9 = r14[r7]
            r10 = r14[r8]
            r6 = r14[r6]
            r11 = 3
            float[] r11 = new float[r11]
            r11[r0] = r3
            r11[r2] = r5
            r11[r4] = r1
            int r1 = com.huawei.hms.scankit.p.r3.j
            int r1 = r1 % r4
            if (r1 != 0) goto L46
            r1 = r11[r8]
            r3 = r11[r7]
            float r1 = r1 / r3
            double r7 = (double) r1
            r11 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
        L46:
            float r1 = a(r10, r9, r6)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L52
            r13 = r10
            r10 = r6
            r6 = r13
        L52:
            r14[r0] = r10
            r14[r2] = r9
            r14[r4] = r6
            return
    }

    private static int[] a(float r5, float r6, float r7) {
            r0 = 1
            r1 = 2
            r2 = 0
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 < 0) goto L15
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L15
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r0 = 0
            if (r5 <= 0) goto L12
        L10:
            r2 = 1
            goto L29
        L12:
            r1 = 1
        L13:
            r2 = 2
            goto L29
        L15:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto L21
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L21
            if (r3 <= 0) goto L29
            r1 = 0
            goto L13
        L21:
            int r5 = (r5 > r5 ? 1 : (r5 == r5 ? 0 : -1))
            r0 = 2
            if (r5 <= 0) goto L28
            r1 = 0
            goto L10
        L28:
            r1 = 1
        L29:
            int[] r5 = new int[]{r0, r1, r2}
            return r5
    }

    public int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final float b() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public final float c() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.huawei.hms.scankit.p.u6
            r1 = 0
            if (r0 == 0) goto L2a
            com.huawei.hms.scankit.p.u6 r7 = (com.huawei.hms.scankit.p.u6) r7
            float r0 = r6.a
            float r2 = r7.a
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            double r2 = (double) r0
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2a
            float r0 = r6.b
            float r7 = r7.b
            float r0 = r0 - r7
            float r7 = java.lang.Math.abs(r0)
            double r2 = (double) r7
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L2a
            r7 = 1
            return r7
        L2a:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.a
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 * 31
            float r1 = r2.b
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            float r1 = r2.a
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.a
            r1.writeFloat(r2)
            float r2 = r0.b
            r1.writeFloat(r2)
            return
    }
}
