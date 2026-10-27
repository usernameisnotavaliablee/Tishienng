package v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static master.flame.danmaku.danmaku.model.android.f a(master.flame.danmaku.danmaku.model.d r7, master.flame.danmaku.danmaku.model.n r8, master.flame.danmaku.danmaku.model.android.f r9, int r10) {
            if (r9 != 0) goto L7
            master.flame.danmaku.danmaku.model.android.f r9 = new master.flame.danmaku.danmaku.model.android.f
            r9.<init>()
        L7:
            r0 = r9
            float r9 = r7.p
            double r1 = (double) r9
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r9 = r7.q
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r3 = r8.getDensityDpi()
            r4 = 0
            r5 = r10
            r0.d(r1, r2, r3, r4, r5)
            master.flame.danmaku.danmaku.model.android.g r9 = r0.k()
            if (r9 == 0) goto L4c
            r1 = r8
            master.flame.danmaku.danmaku.model.b r1 = (master.flame.danmaku.danmaku.model.b) r1
            android.graphics.Canvas r3 = r9.a
            r5 = 0
            r6 = 1
            r4 = 0
            r2 = r7
            r1.s(r2, r3, r4, r5, r6)
            boolean r7 = r8.isHardwareAccelerated()
            if (r7 == 0) goto L4c
            int r7 = r8.getWidth()
            int r10 = r8.getHeight()
            int r1 = r8.o()
            int r8 = r8.i()
            r9.h(r7, r10, r1, r8)
        L4c:
            return r0
    }

    private static boolean b(int r3, int r4, float[] r5, float[] r6) {
            r0 = 0
            if (r3 == r4) goto L4
            return r0
        L4:
            r4 = 2
            r1 = 1
            if (r3 != r1) goto L12
            r3 = r6[r0]
            r4 = r5[r4]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L11
            return r1
        L11:
            return r0
        L12:
            r2 = 6
            if (r3 != r2) goto L1e
            r3 = r6[r4]
            r4 = r5[r0]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L1e
            return r1
        L1e:
            return r0
    }

    private static boolean c(master.flame.danmaku.danmaku.model.n r1, master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.d r3, long r4) {
            float[] r0 = r2.h(r1, r4)
            float[] r1 = r3.h(r1, r4)
            if (r0 == 0) goto L1a
            if (r1 != 0) goto Ld
            goto L1a
        Ld:
            int r2 = r2.getType()
            int r3 = r3.getType()
            boolean r1 = b(r2, r3, r0, r1)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static final int d(master.flame.danmaku.danmaku.model.d r7, master.flame.danmaku.danmaku.model.d r8) {
            if (r7 != r8) goto L4
            r7 = 0
            return r7
        L4:
            r0 = -1
            if (r7 != 0) goto L8
            return r0
        L8:
            r1 = 1
            if (r8 != 0) goto Lc
            return r1
        Lc:
            long r2 = r7.j()
            long r4 = r8.j()
            long r2 = r2 - r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1c
            return r1
        L1c:
            if (r6 >= 0) goto L1f
            return r0
        L1f:
            int r2 = r7.getType()
            int r3 = r8.getType()
            int r2 = r2 - r3
            if (r2 <= 0) goto L2b
            return r1
        L2b:
            if (r2 >= 0) goto L2e
            return r0
        L2e:
            java.lang.CharSequence r2 = r7.c
            if (r2 != 0) goto L33
            return r0
        L33:
            java.lang.CharSequence r3 = r8.c
            if (r3 != 0) goto L38
            return r1
        L38:
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r3 = r8.c
            java.lang.String r3 = r3.toString()
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L49
            return r2
        L49:
            int r2 = r7.g
            int r3 = r8.g
            int r2 = r2 - r3
            if (r2 == 0) goto L54
            if (r2 >= 0) goto L53
            return r0
        L53:
            return r1
        L54:
            int r2 = r7.s
            int r8 = r8.s
            int r2 = r2 - r8
            if (r2 == 0) goto L5f
            if (r2 >= 0) goto L5e
            return r0
        L5e:
            return r1
        L5f:
            int r8 = r7.hashCode()
            int r7 = r7.hashCode()
            int r8 = r8 - r7
            return r8
    }

    public static void e(master.flame.danmaku.danmaku.model.d r2, java.lang.CharSequence r3) {
            r2.c = r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L26
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "/n"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L15
            goto L26
        L15:
            java.lang.CharSequence r3 = r2.c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L26
            r2.d = r3
        L26:
            return
    }

    public static int f(int r0, int r1, int r2) {
            int r0 = r0 * r1
            int r0 = r0 * r2
            return r0
    }

    public static final boolean g(master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.d r3) {
            r0 = 0
            if (r2 != r3) goto L4
            return r0
        L4:
            java.lang.CharSequence r2 = r2.c
            java.lang.CharSequence r3 = r3.c
            r1 = 1
            if (r2 != r3) goto Lc
            return r1
        Lc:
            if (r2 == 0) goto L15
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L15
            return r1
        L15:
            return r0
    }

    public static final boolean h(master.flame.danmaku.danmaku.model.n r2, master.flame.danmaku.danmaku.model.d r3) {
            boolean r0 = r2.isHardwareAccelerated()
            if (r0 == 0) goto L1e
            float r0 = r3.p
            int r1 = r2.o()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
            float r3 = r3.q
            int r2 = r2.i()
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
        L1c:
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static boolean i(master.flame.danmaku.danmaku.model.n r8, master.flame.danmaku.danmaku.model.d r9, master.flame.danmaku.danmaku.model.d r10, long r11, long r13) {
            int r0 = r9.getType()
            int r1 = r10.getType()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            boolean r1 = r9.s()
            if (r1 == 0) goto L13
            return r2
        L13:
            long r3 = r10.b()
            long r5 = r9.b()
            long r3 = r3 - r5
            r5 = 0
            r1 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L24
            return r1
        L24:
            long r3 = java.lang.Math.abs(r3)
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 >= 0) goto L58
            boolean r11 = r9.w()
            if (r11 != 0) goto L58
            boolean r11 = r10.w()
            if (r11 == 0) goto L39
            goto L58
        L39:
            r11 = 5
            if (r0 == r11) goto L57
            r11 = 4
            if (r0 != r11) goto L40
            goto L57
        L40:
            boolean r11 = c(r8, r9, r10, r13)
            if (r11 != 0) goto L57
            long r11 = r9.b()
            long r13 = r9.f()
            long r11 = r11 + r13
            boolean r8 = c(r8, r9, r10, r11)
            if (r8 == 0) goto L56
            goto L57
        L56:
            return r2
        L57:
            return r1
        L58:
            return r2
    }
}
