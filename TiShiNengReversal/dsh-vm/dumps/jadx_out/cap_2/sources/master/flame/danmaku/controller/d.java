package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d {
    public static android.graphics.Paint a = null;
    public static android.graphics.Paint b = null;
    public static android.graphics.RectF c = null;
    private static boolean d = true;
    private static boolean e = true;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            master.flame.danmaku.controller.d.a = r0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
            android.graphics.Paint r0 = master.flame.danmaku.controller.d.a
            r1 = 0
            r0.setColor(r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            master.flame.danmaku.controller.d.c = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.graphics.Canvas r4) {
            boolean r0 = master.flame.danmaku.controller.d.d
            if (r0 == 0) goto L13
            boolean r0 = master.flame.danmaku.controller.d.e
            r1 = 0
            if (r0 == 0) goto Lf
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR
            r4.drawColor(r1, r0)
            return
        Lf:
            r4.drawColor(r1)
            return
        L13:
            android.graphics.RectF r0 = master.flame.danmaku.controller.d.c
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.RectF r0 = master.flame.danmaku.controller.d.c
            c(r4, r0)
            return
    }

    public static void b(android.graphics.Canvas r1, float r2, float r3, float r4, float r5) {
            android.graphics.RectF r0 = master.flame.danmaku.controller.d.c
            r0.set(r2, r3, r4, r5)
            android.graphics.RectF r2 = master.flame.danmaku.controller.d.c
            c(r1, r2)
            return
    }

    private static void c(android.graphics.Canvas r2, android.graphics.RectF r3) {
            float r0 = r3.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = r3.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L12
            goto L17
        L12:
            android.graphics.Paint r0 = master.flame.danmaku.controller.d.a
            r2.drawRect(r3, r0)
        L17:
            return
    }

    public static void d(android.graphics.Canvas r5, java.lang.String r6) {
            android.graphics.Paint r0 = master.flame.danmaku.controller.d.b
            if (r0 != 0) goto L17
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            master.flame.danmaku.controller.d.b = r0
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = master.flame.danmaku.controller.d.b
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.setTextSize(r1)
        L17:
            int r0 = r5.getHeight()
            int r1 = r0 + (-50)
            int r0 = r0 + (-100)
            float r0 = (float) r0
            android.graphics.Paint r2 = master.flame.danmaku.controller.d.b
            float r2 = r2.measureText(r6)
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 + r3
            int r2 = (int) r2
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r4 = 1092616192(0x41200000, float:10.0)
            b(r5, r4, r0, r2, r3)
            float r0 = (float) r1
            android.graphics.Paint r1 = master.flame.danmaku.controller.d.b
            r5.drawText(r6, r4, r0, r1)
            return
    }

    public static void e(android.graphics.Canvas r2) {
            r0 = 0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r2.drawColor(r0, r1)
            return
    }

    public static void f(boolean r0, boolean r1) {
            master.flame.danmaku.controller.d.d = r0
            master.flame.danmaku.controller.d.e = r1
            return
    }
}
