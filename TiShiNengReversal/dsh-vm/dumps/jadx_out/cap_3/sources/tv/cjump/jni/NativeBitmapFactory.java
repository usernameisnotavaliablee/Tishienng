package tv.cjump.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NativeBitmapFactory {
    static java.lang.reflect.Field a;
    static boolean b;
    static boolean c;

    static {
            return
    }

    public NativeBitmapFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap a(int r1, int r2, android.graphics.Bitmap.Config r3) {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L13
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            android.graphics.Bitmap r1 = b(r1, r2, r3, r0)
            return r1
    }

    public static synchronized android.graphics.Bitmap b(int r2, int r3, android.graphics.Bitmap.Config r4, boolean r5) {
            java.lang.Class<tv.cjump.jni.NativeBitmapFactory> r0 = tv.cjump.jni.NativeBitmapFactory.class
            monitor-enter(r0)
            boolean r1 = tv.cjump.jni.NativeBitmapFactory.b     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.reflect.Field r1 = tv.cjump.jni.NativeBitmapFactory.a     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Lc
            goto L14
        Lc:
            android.graphics.Bitmap r2 = c(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            goto L1a
        L14:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private static android.graphics.Bitmap c(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3) {
            int r2 = d(r2)
            android.graphics.Bitmap r0 = createBitmap(r0, r1, r2, r3)
            return r0
    }

    private static native android.graphics.Bitmap createBitmap(int r0, int r1, int r2, boolean r3);

    private static native android.graphics.Bitmap createBitmap19(int r0, int r1, int r2, boolean r3);

    public static int d(android.graphics.Bitmap.Config r2) {
            r0 = 0
            java.lang.reflect.Field r1 = tv.cjump.jni.NativeBitmapFactory.a     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L6
            return r0
        L6:
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            return r0
    }

    static void e() {
            java.lang.Class<android.graphics.Bitmap$Config> r0 = android.graphics.Bitmap.Config.class
            java.lang.String r1 = "nativeInt"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lf
            tv.cjump.jni.NativeBitmapFactory.a = r0     // Catch: java.lang.NoSuchFieldException -> Lf
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Lf
            return
        Lf:
            r0 = 0
            tv.cjump.jni.NativeBitmapFactory.a = r0
            return
    }

    public static boolean f() {
            boolean r0 = tv.cjump.jni.NativeBitmapFactory.b
            if (r0 == 0) goto La
            java.lang.reflect.Field r0 = tv.cjump.jni.NativeBitmapFactory.a
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static void g() {
            boolean r0 = tv.cjump.jni.NativeBitmapFactory.c
            if (r0 == 0) goto L5
            goto L1c
        L5:
            boolean r0 = tv.cjump.jni.DeviceUtils.h()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L18
            boolean r0 = tv.cjump.jni.DeviceUtils.i()
            if (r0 != 0) goto L18
            tv.cjump.jni.NativeBitmapFactory.c = r2
            tv.cjump.jni.NativeBitmapFactory.b = r1
            return
        L18:
            boolean r0 = tv.cjump.jni.NativeBitmapFactory.b
            if (r0 == 0) goto L1d
        L1c:
            return
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Error -> L30 java.lang.Exception -> L35
            r3 = 23
            if (r0 >= r3) goto L2b
            java.lang.String r0 = "ndkbitmap"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Error -> L30 java.lang.Exception -> L35
            tv.cjump.jni.NativeBitmapFactory.b = r2     // Catch: java.lang.Error -> L30 java.lang.Exception -> L35
            goto L39
        L2b:
            tv.cjump.jni.NativeBitmapFactory.c = r2     // Catch: java.lang.Error -> L30 java.lang.Exception -> L35
            tv.cjump.jni.NativeBitmapFactory.b = r1     // Catch: java.lang.Error -> L30 java.lang.Exception -> L35
            goto L39
        L30:
            tv.cjump.jni.NativeBitmapFactory.c = r2
            tv.cjump.jni.NativeBitmapFactory.b = r1
            goto L39
        L35:
            tv.cjump.jni.NativeBitmapFactory.c = r2
            tv.cjump.jni.NativeBitmapFactory.b = r1
        L39:
            boolean r0 = tv.cjump.jni.NativeBitmapFactory.b
            if (r0 == 0) goto L5b
            boolean r0 = init()
            if (r0 != 0) goto L4b
            release()
            tv.cjump.jni.NativeBitmapFactory.c = r2
            tv.cjump.jni.NativeBitmapFactory.b = r1
            goto L5b
        L4b:
            e()
            boolean r0 = j()
            if (r0 != 0) goto L5b
            release()
            tv.cjump.jni.NativeBitmapFactory.c = r2
            tv.cjump.jni.NativeBitmapFactory.b = r1
        L5b:
            return
    }

    public static void h(android.graphics.Bitmap r0) {
            r0.recycle()
            return
    }

    public static synchronized void i() {
            java.lang.Class<tv.cjump.jni.NativeBitmapFactory> r0 = tv.cjump.jni.NativeBitmapFactory.class
            monitor-enter(r0)
            boolean r1 = tv.cjump.jni.NativeBitmapFactory.b     // Catch: java.lang.Throwable -> L11
            r2 = 0
            tv.cjump.jni.NativeBitmapFactory.a = r2     // Catch: java.lang.Throwable -> L11
            r2 = 0
            tv.cjump.jni.NativeBitmapFactory.b = r2     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            release()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private static native boolean init();

    @android.annotation.SuppressLint({"NewApi"})
    private static boolean j() {
            java.lang.reflect.Field r0 = tv.cjump.jni.NativeBitmapFactory.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r3 = 1
            r4 = 2
            android.graphics.Bitmap r2 = c(r4, r4, r0, r3)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            if (r2 == 0) goto L25
            int r0 = r2.getWidth()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            if (r0 != r4) goto L25
            int r0 = r2.getHeight()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            if (r0 != r4) goto L25
            r0 = 1
            goto L26
        L1f:
            r0 = move-exception
            goto L73
        L21:
            goto L64
        L23:
            r0 = move-exception
            goto L6a
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L5e
            boolean r0 = r2.isPremultiplied()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            if (r0 != 0) goto L31
            r2.setPremultiplied(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
        L31:
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            android.graphics.Paint r8 = new android.graphics.Paint     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r8.<init>()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r8.setColor(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r0 = 1101004800(0x41a00000, float:20.0)
            r8.setTextSize(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            int r0 = r2.getWidth()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            float r6 = (float) r0     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            int r0 = r2.getHeight()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            float r7 = (float) r0     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            r4 = 0
            r5 = 0
            r3.drawRect(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            java.lang.String r0 = "TestLib"
            r4 = 0
            r3.drawText(r0, r4, r4, r8)     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
            boolean r0 = r2.isPremultiplied()     // Catch: java.lang.Throwable -> L1f java.lang.Error -> L21 java.lang.Exception -> L23
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            return r0
        L64:
            if (r2 == 0) goto L69
            r2.recycle()
        L69:
            return r1
        L6a:
            r0.toString()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L72
            r2.recycle()
        L72:
            return r1
        L73:
            if (r2 == 0) goto L78
            r2.recycle()
        L78:
            throw r0
    }

    private static native boolean release();
}
