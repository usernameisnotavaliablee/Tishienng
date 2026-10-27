package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class z {
    private static final java.lang.String h = "ScreenShotListenManager";
    private static final java.lang.String[] i = null;
    private static final java.lang.String[] j = null;
    private static final java.lang.String[] k = null;

    /* renamed from: l, reason: collision with root package name */
    private static android.graphics.Point f591l;
    private final java.util.List<java.lang.String> a;
    private android.content.Context b;
    private com.bxkj.base.util.z.b c;
    private long d;
    private com.bxkj.base.util.z.a e;
    private com.bxkj.base.util.z.a f;
    private final android.os.Handler g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends android.database.ContentObserver {
        private android.net.Uri a;
        final /* synthetic */ com.bxkj.base.util.z b;

        public a(com.bxkj.base.util.z r1, android.net.Uri r2, android.os.Handler r3) {
                r0 = this;
                r0.b = r1
                r0.<init>(r3)
                r0.a = r2
                return
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r2) {
                r1 = this;
                super.onChange(r2)
                com.bxkj.base.util.z r2 = r1.b
                android.net.Uri r0 = r1.a
                com.bxkj.base.util.z.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(java.lang.String r1);
    }

    static {
            java.lang.String r0 = "_data"
            java.lang.String r1 = "datetaken"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1}
            com.bxkj.base.util.z.i = r2
            java.lang.String r2 = "width"
            java.lang.String r3 = "height"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.bxkj.base.util.z.j = r0
            java.lang.String r11 = "screen-cap"
            java.lang.String r12 = "screen cap"
            java.lang.String r1 = "screenshot"
            java.lang.String r2 = "screen_shot"
            java.lang.String r3 = "screen-shot"
            java.lang.String r4 = "screen shot"
            java.lang.String r5 = "screencapture"
            java.lang.String r6 = "screen_capture"
            java.lang.String r7 = "screen-capture"
            java.lang.String r8 = "screen capture"
            java.lang.String r9 = "screencap"
            java.lang.String r10 = "screen_cap"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.bxkj.base.util.z.k = r0
            return
    }

    private z(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.g = r0
            if (r3 == 0) goto L2c
            r2.b = r3
            android.graphics.Point r3 = com.bxkj.base.util.z.f591l
            if (r3 != 0) goto L2b
            android.graphics.Point r3 = r2.f()
            com.bxkj.base.util.z.f591l = r3
            if (r3 == 0) goto L2b
            android.graphics.Point r3 = com.bxkj.base.util.z.f591l
            int r0 = r3.x
            int r3 = r3.y
        L2b:
            return
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The context must not be null."
            r3.<init>(r0)
            throw r3
    }

    static /* bridge */ /* synthetic */ void a(com.bxkj.base.util.z r0, android.net.Uri r1) {
            r0.g(r1)
            return
    }

    private static void b() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L38
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            if (r0 == 0) goto L20
            int r1 = r0.length
            r2 = 4
            if (r1 < r2) goto L20
            r1 = 3
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Call the method must be in main thread: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L38:
            return
    }

    private boolean c(java.lang.String r4) {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.a
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto La
            r4 = 1
            return r4
        La:
            java.util.List<java.lang.String> r0 = r3.a
            int r0 = r0.size()
            r1 = 20
            r2 = 0
            if (r0 < r1) goto L21
            r0 = 0
        L16:
            r1 = 5
            if (r0 >= r1) goto L21
            java.util.List<java.lang.String> r1 = r3.a
            r1.remove(r2)
            int r0 = r0 + 1
            goto L16
        L21:
            java.util.List<java.lang.String> r0 = r3.a
            r0.add(r4)
            return r2
    }

    private boolean d(java.lang.String r5, long r6, int r8, int r9) {
            r4 = this;
            long r0 = r4.d
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L44
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r6 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L13
            goto L44
        L13:
            android.graphics.Point r6 = com.bxkj.base.util.z.f591l
            if (r6 == 0) goto L26
            int r7 = r6.x
            if (r8 > r7) goto L1f
            int r0 = r6.y
            if (r9 <= r0) goto L26
        L1f:
            if (r9 > r7) goto L25
            int r6 = r6.y
            if (r8 <= r6) goto L26
        L25:
            return r2
        L26:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L2d
            return r2
        L2d:
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String[] r6 = com.bxkj.base.util.z.k
            int r7 = r6.length
            r8 = 0
        L35:
            if (r8 >= r7) goto L44
            r9 = r6[r8]
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L41
            r5 = 1
            return r5
        L41:
            int r8 = r8 + 1
            goto L35
        L44:
            return r2
    }

    private android.graphics.Point e(java.lang.String r3) {
            r2 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r3, r0)
            android.graphics.Point r3 = new android.graphics.Point
            int r1 = r0.outWidth
            int r0 = r0.outHeight
            r3.<init>(r1, r0)
            return r3
    }

    private android.graphics.Point f() {
            r3 = this;
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point     // Catch: java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Exception -> L19
            android.content.Context r0 = r3.b     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Exception -> L18
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.Exception -> L18
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Exception -> L18
            r0.getRealSize(r1)     // Catch: java.lang.Exception -> L18
            return r1
        L18:
            r0 = r1
        L19:
            return r0
    }

    private void g(android.net.Uri r11) {
            r10 = this;
            r1 = 0
            android.content.Context r0 = r10.b     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String[] r4 = com.bxkj.base.util.z.j     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r7 = "date_added desc limit 1"
            r5 = 0
            r6 = 0
            r3 = r11
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r1 != 0) goto L20
            if (r1 == 0) goto L94
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L94
            r1.close()
            return
        L20:
            boolean r11 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r11 != 0) goto L30
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L94
            r1.close()
            return
        L30:
            java.lang.String r11 = "_data"
            int r11 = r1.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r0 = "datetaken"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r2 = "width"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r3 = "height"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r5 = r1.getString(r11)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            long r6 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r2 < 0) goto L65
            if (r3 < 0) goto L65
            int r11 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r0 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r8 = r11
            r9 = r0
        L5e:
            r4 = r10
            goto L70
        L60:
            r0 = move-exception
            r11 = r0
            goto L7d
        L63:
            goto L89
        L65:
            android.graphics.Point r11 = r10.e(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r0 = r11.x     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r11 = r11.y     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r9 = r11
            r8 = r0
            goto L5e
        L70:
            r4.h(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L94
            r1.close()
            return
        L7d:
            if (r1 == 0) goto L88
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L88
            r1.close()
        L88:
            throw r11
        L89:
            if (r1 == 0) goto L94
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L94
            r1.close()
        L94:
            return
    }

    private void h(java.lang.String r1, long r2, int r4, int r5) {
            r0 = this;
            boolean r2 = r0.d(r1, r2, r4, r5)
            r3 = r1
            r1 = r0
            if (r2 == 0) goto L17
            com.bxkj.base.util.z$b r2 = r1.c
            if (r2 == 0) goto L17
            boolean r2 = r0.c(r3)
            if (r2 != 0) goto L17
            com.bxkj.base.util.z$b r2 = r1.c
            r2.a(r3)
        L17:
            return
    }

    public static com.bxkj.base.util.z i(android.content.Context r1) {
            b()
            com.bxkj.base.util.z r0 = new com.bxkj.base.util.z
            r0.<init>(r1)
            return r0
    }

    public void j(com.bxkj.base.util.z.b r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void k() {
            r5 = this;
            b()
            java.util.List<java.lang.String> r0 = r5.a
            r0.clear()
            long r0 = java.lang.System.currentTimeMillis()
            r5.d = r0
            com.bxkj.base.util.z$a r0 = new com.bxkj.base.util.z$a
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            android.os.Handler r2 = r5.g
            r0.<init>(r5, r1, r2)
            r5.e = r0
            com.bxkj.base.util.z$a r0 = new com.bxkj.base.util.z$a
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.os.Handler r3 = r5.g
            r0.<init>(r5, r2, r3)
            r5.f = r0
            android.content.Context r0 = r5.b
            android.content.ContentResolver r0 = r0.getContentResolver()
            com.bxkj.base.util.z$a r3 = r5.e
            r4 = 0
            r0.registerContentObserver(r1, r4, r3)
            android.content.Context r0 = r5.b
            android.content.ContentResolver r0 = r0.getContentResolver()
            com.bxkj.base.util.z$a r1 = r5.f
            r0.registerContentObserver(r2, r4, r1)
            return
    }

    public void l() {
            r3 = this;
            b()
            com.bxkj.base.util.z$a r0 = r3.e
            r1 = 0
            if (r0 == 0) goto L15
            android.content.Context r0 = r3.b     // Catch: java.lang.Exception -> L13
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L13
            com.bxkj.base.util.z$a r2 = r3.e     // Catch: java.lang.Exception -> L13
            r0.unregisterContentObserver(r2)     // Catch: java.lang.Exception -> L13
        L13:
            r3.e = r1
        L15:
            com.bxkj.base.util.z$a r0 = r3.f
            if (r0 == 0) goto L26
            android.content.Context r0 = r3.b     // Catch: java.lang.Exception -> L24
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L24
            com.bxkj.base.util.z$a r2 = r3.f     // Catch: java.lang.Exception -> L24
            r0.unregisterContentObserver(r2)     // Catch: java.lang.Exception -> L24
        L24:
            r3.f = r1
        L26:
            r0 = 0
            r3.d = r0
            java.util.List<java.lang.String> r0 = r3.a
            r0.clear()
            return
    }
}
