package com.stub;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_0_sz45352584.dex */
public final class StubApp extends android.app.Application {
    private static android.app.Application a;
    private static android.app.Application b;
    private static java.lang.String c;
    private static android.content.Context d;
    private static java.lang.String e;
    private static java.lang.String f;
    private static java.lang.String g;
    private static java.lang.String h;
    private static java.lang.String i;
    private static java.util.Map<java.lang.Integer, java.lang.String> j;
    private static boolean loadFromLib;
    private static boolean needX86Bridge;
    private static java.util.Map<java.lang.String, java.util.Set<java.lang.String>> perm;
    private static boolean returnIntern;
    public static java.lang.String strEntryApplication;

    static {
            r2 = 0
            r1 = 0
            com.stub.StubApp.a = r1
            java.lang.String r0 = "entryRunApplication"
            com.stub.StubApp.strEntryApplication = r0
            com.stub.StubApp.b = r1
            java.lang.String r0 = "libjiagu"
            com.stub.StubApp.c = r0
            r2 = 0
            com.stub.StubApp.loadFromLib = r2
            r2 = 1
            com.stub.StubApp.needX86Bridge = r2
            r0 = 1
            r0 = 1
            com.stub.StubApp.returnIntern = r0
            com.stub.StubApp.e = r1
            com.stub.StubApp.f = r1
            com.stub.StubApp.g = r1
            com.stub.StubApp.h = r1
            com.stub.StubApp.i = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.stub.StubApp.j = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.stub.StubApp.perm = r0
            return
    }

    public StubApp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ChangeTopApplication() {
            android.app.Application r0 = com.stub.StubApp.a
            android.content.Context r0 = r0.getBaseContext()
            android.app.Application r1 = com.stub.StubApp.b     // Catch: java.lang.Exception -> Lc
            interface7(r1, r0)     // Catch: java.lang.Exception -> Lc
        Lb:
            return
        Lc:
            r0 = move-exception
            goto Lb
    }

    private static android.app.Application a(android.content.Context r2) {
            android.app.Application r0 = com.stub.StubApp.b     // Catch: java.lang.Exception -> L1d
            if (r0 != 0) goto L1a
            java.lang.ClassLoader r0 = r2.getClassLoader()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1a
            java.lang.String r1 = com.stub.StubApp.strEntryApplication     // Catch: java.lang.Exception -> L1d
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L1d
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L1d
            com.stub.StubApp.b = r0     // Catch: java.lang.Exception -> L1d
        L1a:
            android.app.Application r0 = com.stub.StubApp.b
            return r0
        L1d:
            r0 = move-exception
            goto L1a
    }

    private static java.lang.String a(java.lang.String r3, boolean r4, boolean r5) {
            java.lang.String r0 = com.stub.StubApp.c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L1d
            int r1 = r3.hashCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L1d:
            if (r4 == 0) goto L35
            if (r5 != 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "_64.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L34:
            return r0
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ".so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L34
    }

    public static native void fcmark();

    public static android.content.Context getAppContext() {
            android.content.Context r0 = com.stub.StubApp.d
            return r0
    }

    public static java.lang.String getDir() {
            java.lang.String r0 = com.stub.StubApp.h
            return r0
    }

    public static android.content.Context getOrigApplicationContext(android.content.Context r1) {
            android.app.Application r0 = com.stub.StubApp.a
            if (r1 != r0) goto L6
            android.app.Application r1 = com.stub.StubApp.b
        L6:
            return r1
    }

    public static java.lang.String getSoPath1() {
            java.lang.String r0 = com.stub.StubApp.f
            return r0
    }

    public static java.lang.String getSoPath2() {
            java.lang.String r0 = com.stub.StubApp.g
            return r0
    }

    public static java.lang.String getString2(int r3) {
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.stub.StubApp.j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1b
            java.lang.String r0 = interface14(r3)
            java.util.Map<java.lang.Integer, java.lang.String> r1 = com.stub.StubApp.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r0)
        L1b:
            if (r0 == 0) goto L25
            boolean r1 = com.stub.StubApp.returnIntern
            if (r1 == 0) goto L25
            java.lang.String r0 = r0.intern()
        L25:
            return r0
    }

    public static java.lang.String getString2(java.lang.String r1) {
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L9
            java.lang.String r0 = getString2(r0)     // Catch: java.lang.NumberFormatException -> L9
        L8:
            return r0
        L9:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
            goto L8
    }

    public static native void interface11(int r0);

    public static native java.util.Enumeration<java.lang.String> interface12(dalvik.system.DexFile r0);

    public static native long interface13(int r0, long r1, long r3, long r5, int r7, int r8, long r9);

    public static native java.lang.String interface14(int r0);

    public static native android.content.res.AssetFileDescriptor interface17(android.content.res.AssetManager r0, java.lang.String r1);

    public static native java.io.InputStream interface18(java.lang.Class r0, java.lang.String r1);

    public static native java.io.InputStream interface19(java.lang.ClassLoader r0, java.lang.String r1);

    public static native java.io.InputStream interface199(android.content.res.AssetManager r0, java.lang.String r1);

    public static native void interface20();

    public static native void interface21(android.app.Application r0);

    public static native void interface22(int r0, java.lang.String[] r1, int[] r2);

    public static native void interface24(android.app.Activity r0, java.lang.String[] r1, int r2);

    public static native java.util.zip.ZipEntry interface30(java.util.zip.ZipFile r0, java.lang.String r1);

    public static native void interface5(android.app.Application r0);

    public static native java.io.InputStream interface51(android.content.res.Resources r0, int r1);

    public static native java.io.InputStream interface52(android.content.res.Resources r0, int r1, android.util.TypedValue r2);

    public static native android.content.res.AssetFileDescriptor interface53(android.content.res.Resources r0, int r1);

    public static native android.media.MediaPlayer interface54(android.content.Context r0, int r1);

    public static native android.media.MediaPlayer interface55(android.content.Context r0, int r1, android.media.AudioAttributes r2, int r3);

    public static native int interface56(android.media.SoundPool r0, android.content.Context r1, int r2, int r3);

    public static native java.lang.String interface6(java.lang.String r0);

    public static native boolean interface7(android.app.Application r0, android.content.Context r1);

    public static native boolean interface8(android.app.Application r0, android.content.Context r1);

    public static native void interface99(android.app.Application r0);

    public static boolean isX86Arch() {
            boolean r0 = com.tianyu.util.a.a()
            return r0
    }

    public static native android.location.Location mark(android.location.LocationManager r0, java.lang.String r1);

    public static native void mark();

    public static native void mark(android.location.Location r0);

    public static native void n0110();

    public static native boolean n0111();

    public static native void n01110(int r0);

    public static native int n01111(int r0);

    public static native void n011110(boolean r0, int r1);

    public static native int n011111(int r0, int r1);

    public static native void n0111110(int r0, int r1, int r2);

    public static native int n0111111(int r0, boolean r1, boolean r2);

    public static native void n011111111310(int r0, int r1, int r2, int r3, boolean r4, boolean r5, java.lang.Object r6, boolean r7);

    public static native long n01111112(float r0, float r1, float r2, int r3);

    public static native java.lang.Object n01111113(int r0, int r1, int r2, boolean r3);

    public static native long n011112(int r0, int r1);

    public static native int n011112113111(int r0, boolean r1, long r2, int r4, int r5, java.lang.Object r6, int r7, int r8);

    public static native int n01111213111(int r0, boolean r1, long r2, int r4, java.lang.Object r5, int r6, int r7);

    public static native java.lang.Object n011112333(int r0, int r1, long r2, java.lang.Object r4, java.lang.Object r5);

    public static native java.lang.Object n011113(boolean r0, boolean r1);

    public static native void n0111130(int r0, int r1, java.lang.Object r2);

    public static native byte n0111131(int r0, int r1, java.lang.Object r2);

    public static native void n011113110(int r0, boolean r1, java.lang.Object r2, int r3, int r4);

    public static native int n011113111(int r0, boolean r1, java.lang.Object r2, int r3, int r4);

    public static native int n011113113111(int r0, boolean r1, java.lang.Object r2, int r3, int r4, java.lang.Object r5, int r6, int r7);

    public static native void n011113130(int r0, boolean r1, java.lang.Object r2, int r3, java.lang.Object r4);

    public static native double n0111132(int r0, int r1, java.lang.Object r2);

    public static native java.lang.Object n0111133(int r0, int r1, java.lang.Object r2);

    public static native void n0111133110(int r0, boolean r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5);

    public static native void n01111331130(int r0, boolean r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5, java.lang.Object r6);

    public static native long n01112(int r0);

    public static native void n011120(int r0, long r1);

    public static native void n0111210(int r0, long r1, boolean r3);

    public static native boolean n0111211(int r0, long r1, int r3);

    public static native void n01112110(int r0, long r1, float r3, float r4);

    public static native int n01112111(int r0, long r1, int r3, int r4);

    public static native void n011121110(int r0, long r1, boolean r3, int r4, int r5);

    public static native int n0111211111(int r0, long r1, int r3, int r4, int r5, int r6);

    public static native void n01112111110(int r0, long r1, int r3, int r4, int r5, int r6, int r7);

    public static native void n011121111110(int r0, long r1, int r3, int r4, int r5, int r6, int r7, int r8);

    public static native java.lang.Object n0111211113(int r0, long r1, int r3, int r4, int r5, int r6);

    public static native boolean n0111211113111(int r0, long r1, int r3, int r4, float r5, float r6, java.lang.Object r7, boolean r8, boolean r9);

    public static native java.lang.Object n01112113(int r0, long r1, int r3, int r4);

    public static native long n0111212(int r0, long r1, int r3);

    public static native int n01112121111(int r0, long r1, int r3, long r4, int r6, int r7, int r8);

    public static native int n011121221(int r0, long r1, int r3, long r4, long r6);

    public static native java.lang.Object n0111213(int r0, long r1, boolean r3);

    public static native long n011122(int r0, long r1);

    public static native void n0111220(int r0, long r1, long r3);

    public static native void n0111230(int r0, long r1, java.lang.Object r3);

    public static native boolean n0111231(int r0, long r1, java.lang.Object r3);

    public static native void n01112310(int r0, long r1, java.lang.Object r3, int r4);

    public static native void n011123130(int r0, long r1, java.lang.Object r3, int r4, java.lang.Object r5);

    public static native void n0111232111110(int r0, long r1, java.lang.Object r3, long r4, int r6, int r7, int r8, int r9, int r10);

    public static native java.lang.Object n0111233(int r0, long r1, java.lang.Object r3);

    public static native void n01112330(int r0, long r1, java.lang.Object r3, java.lang.Object r4);

    public static native void n01112333111111110(int r0, long r1, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6, int r7, int r8, float r9, boolean r10, int r11, int r12, int r13);

    public static native java.lang.Object n01113(int r0);

    public static native void n011130(int r0, java.lang.Object r1);

    public static native int n011131(int r0, java.lang.Object r1);

    public static native boolean n0111311(int r0, java.lang.Object r1, int r2);

    public static native int n01113111(int r0, java.lang.Object r1, int r2, int r3);

    public static native long n011131122(int r0, java.lang.Object r1, int r2, int r3, long r4);

    public static native java.lang.Object n01113113(int r0, java.lang.Object r1, int r2, int r3);

    public static native long n011132(int r0, java.lang.Object r1);

    public static native long n011132222(int r0, java.lang.Object r1, long r2, long r4, long r6);

    public static native java.lang.Object n011133(int r0, java.lang.Object r1);

    public static native void n0111330(int r0, java.lang.Object r1, java.lang.Object r2);

    public static native java.lang.Object n01113333(int r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public static native long n0112();

    public static native void n01120(long r0);

    public static native float n01121(long r0);

    public static native void n011210(long r0, int r2);

    public static native boolean n011211(long r0, int r2);

    public static native void n0112110(long r0, int r2, float r3);

    public static native float n0112111(long r0, int r2, float r3);

    public static native void n01121110(long r0, int r2, int r3, int r4);

    public static native float n01121111(long r0, int r2, int r3, float r4);

    public static native void n011211110(long r0, int r2, float r3, float r4, float r5);

    public static native float n0112111111(long r0, int r2, int r3, int r4, int r5, int r6);

    public static native void n0112111111111110(long r0, int r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10, float r11, int r12);

    public static native void n011211130(long r0, int r2, int r3, int r4, java.lang.Object r5);

    public static native void n01121130(long r0, float r2, float r3, java.lang.Object r4);

    public static native boolean n01121131(long r0, int r2, int r3, java.lang.Object r4);

    public static native void n011211330(long r0, float r2, float r3, java.lang.Object r4, java.lang.Object r5);

    public static native long n011212(long r0, int r2);

    public static native void n0112120(long r0, int r2, long r3);

    public static native int n0112121(long r0, int r2, double r3);

    public static native double n0112122(long r0, int r2, double r3);

    public static native void n011212230(long r0, int r2, long r3, long r5, java.lang.Object r7);

    public static native java.lang.Object n011213(long r0, int r2);

    public static native void n0112130(long r0, int r2, java.lang.Object r3);

    public static native int n0112131(long r0, int r2, java.lang.Object r3);

    public static native long n01121312(long r0, int r2, java.lang.Object r3, int r4);

    public static native void n0112131330(long r0, int r2, java.lang.Object r3, int r4, java.lang.Object r5, java.lang.Object r6);

    public static native void n01121320(long r0, int r2, java.lang.Object r3, long r4);

    public static native java.lang.Object n0112133(long r0, int r2, java.lang.Object r3);

    public static native long n01122(long r0);

    public static native void n011220(long r0, long r2);

    public static native int n011221(long r0, long r2);

    public static native void n0112210(long r0, long r2, int r4);

    public static native void n0112220(long r0, double r2, double r4);

    public static native void n01122210(long r0, long r2, long r4, int r6);

    public static native java.lang.Object n01123(long r0);

    public static native void n011230(long r0, java.lang.Object r2);

    public static native int n011231(long r0, java.lang.Object r2);

    public static native void n0112310(long r0, java.lang.Object r2, boolean r3);

    public static native int n0112311(long r0, java.lang.Object r2, int r3);

    public static native void n01123110(long r0, java.lang.Object r2, int r3, int r4);

    public static native long n0112312(long r0, java.lang.Object r2, int r3);

    public static native java.lang.Object n0112313(long r0, java.lang.Object r2, int r3);

    public static native long n011232(long r0, java.lang.Object r2);

    public static native long n0112322(long r0, java.lang.Object r2, long r3);

    public static native java.lang.Object n011233(long r0, java.lang.Object r2);

    public static native void n0112330(long r0, java.lang.Object r2, java.lang.Object r3);

    public static native int n0112331(long r0, java.lang.Object r2, java.lang.Object r3);

    public static native void n011233110(long r0, java.lang.Object r2, java.lang.Object r3, int r4, int r5);

    public static native long n01123312(long r0, java.lang.Object r2, java.lang.Object r3, int r4);

    public static native java.lang.Object n01123313(long r0, java.lang.Object r2, java.lang.Object r3, int r4);

    public static native long n0112332(long r0, java.lang.Object r2, java.lang.Object r3);

    public static native void n011233230(long r0, java.lang.Object r2, java.lang.Object r3, long r4, java.lang.Object r6);

    public static native void n0112332310(long r0, java.lang.Object r2, java.lang.Object r3, long r4, java.lang.Object r6, int r7);

    public static native void n01123330(long r0, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4);

    public static native java.lang.Object n0113();

    public static native void n01130(java.lang.Object r0);

    public static native boolean n01131(java.lang.Object r0);

    public static native void n011310(java.lang.Object r0, int r1);

    public static native int n011311(java.lang.Object r0, int r1);

    public static native int n0113111(java.lang.Object r0, int r1, int r2);

    public static native java.lang.Object n01131111123(java.lang.Object r0, int r1, int r2, int r3, int r4, float r5, double r6);

    public static native java.lang.Object n0113111113(java.lang.Object r0, int r1, int r2, int r3, int r4, int r5);

    public static native java.lang.Object n011311113(java.lang.Object r0, int r1, int r2, int r3, int r4);

    public static native long n01131112(java.lang.Object r0, int r1, int r2, int r3);

    public static native java.lang.Object n01131113(java.lang.Object r0, boolean r1, boolean r2, boolean r3);

    public static native java.lang.Object n011311133(java.lang.Object r0, int r1, int r2, boolean r3, java.lang.Object r4);

    public static native java.lang.Object n0113113(java.lang.Object r0, int r1, int r2);

    public static native long n01131132(java.lang.Object r0, int r1, int r2, java.lang.Object r3);

    public static native java.lang.Object n01131133(java.lang.Object r0, int r1, int r2, java.lang.Object r3);

    public static native java.lang.Object n011313(java.lang.Object r0, int r1);

    public static native void n0113130(java.lang.Object r0, int r1, java.lang.Object r2);

    public static native void n0113131310(java.lang.Object r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5);

    public static native int n01131313111111111(java.lang.Object r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12);

    public static native int n0113131311131111(java.lang.Object r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5, int r6, int r7, java.lang.Object r8, int r9, int r10, int r11);

    public static native int n01131313111331111111(java.lang.Object r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5, int r6, int r7, java.lang.Object r8, java.lang.Object r9, int r10, int r11, int r12, int r13, int r14, int r15);

    public static native int n01131313113113113113331111(java.lang.Object r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5, int r6, java.lang.Object r7, int r8, int r9, java.lang.Object r10, int r11, int r12, java.lang.Object r13, int r14, int r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, int r19, int r20, int r21);

    public static native java.lang.Object n0113133(java.lang.Object r0, int r1, java.lang.Object r2);

    public static native long n011313322(java.lang.Object r0, int r1, java.lang.Object r2, java.lang.Object r3, long r4);

    public static native java.lang.Object n0113133313(java.lang.Object r0, int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, float r5);

    public static native long n01132(java.lang.Object r0);

    public static native void n011320(java.lang.Object r0, long r1);

    public static native void n0113210(java.lang.Object r0, long r1, int r3);

    public static native void n01132130(java.lang.Object r0, long r1, int r3, java.lang.Object r4);

    public static native java.lang.Object n0113233(java.lang.Object r0, long r1, java.lang.Object r3);

    public static native java.lang.Object n01133(java.lang.Object r0);

    public static native void n011330(java.lang.Object r0, java.lang.Object r1);

    public static native int n011331(java.lang.Object r0, java.lang.Object r1);

    public static native void n0113310(java.lang.Object r0, java.lang.Object r1, int r2);

    public static native boolean n0113311(java.lang.Object r0, java.lang.Object r1, boolean r2);

    public static native void n01133110(java.lang.Object r0, java.lang.Object r1, int r2, boolean r3);

    public static native int n01133111111(java.lang.Object r0, java.lang.Object r1, int r2, int r3, int r4, int r5, boolean r6);

    public static native java.lang.Object n0113313(java.lang.Object r0, java.lang.Object r1, int r2);

    public static native long n011332(java.lang.Object r0, java.lang.Object r1);

    public static native java.lang.Object n0113323(java.lang.Object r0, java.lang.Object r1, double r2);

    public static native java.lang.Object n011332313(java.lang.Object r0, java.lang.Object r1, double r2, java.lang.Object r4, int r5);

    public static native java.lang.Object n011333(java.lang.Object r0, java.lang.Object r1);

    public static native boolean n0113331(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2);

    public static native boolean n01133311(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, int r3);

    public static native java.lang.Object n0113331111113(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, int r3, int r4, int r5, int r6, int r7, int r8);

    public static native long n011333112(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, int r3, int r4);

    public static native java.lang.Object n0113333(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2);

    public static native void n01133330(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public static native java.lang.Object n01133333(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public static native void n01133333310(java.lang.Object r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6);

    public static native void pmark(android.content.Context r0);

    public static void put(java.lang.Object r3, java.lang.String[] r4) {
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r0.getCanonicalName()     // Catch: java.lang.Exception -> L38
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r0 = com.stub.StubApp.perm     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L38
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L1a
            java.util.List r1 = java.util.Arrays.asList(r4)     // Catch: java.lang.Exception -> L38
            r0.addAll(r1)     // Catch: java.lang.Exception -> L38
        L19:
            return
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Exception -> L38
            r0.<init>()     // Catch: java.lang.Exception -> L38
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Exception -> L38
            java.util.Collections.addAll(r0, r4)     // Catch: java.lang.Exception -> L38
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r2 = com.stub.StubApp.perm     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r2.put(r1, r0)     // Catch: java.lang.Exception -> L38
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L19
            java.util.List r1 = java.util.Arrays.asList(r4)     // Catch: java.lang.Exception -> L38
            r0.addAll(r1)     // Catch: java.lang.Exception -> L38
            goto L19
        L38:
            r0 = move-exception
            goto L19
    }

    public static native void rmark();

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(android.content.Context r9) {
            r8 = this;
            r7 = 1
            r6 = 0
            java.lang.System.currentTimeMillis()
            super.attachBaseContext(r9)
            com.tianyu.util.a.b()
            com.stub.StubApp.d = r9
            android.app.Application r0 = com.stub.StubApp.a
            if (r0 != 0) goto L13
            com.stub.StubApp.a = r8
        L13:
            android.app.Application r0 = com.stub.StubApp.b
            if (r0 != 0) goto L79
            boolean r0 = com.tianyu.util.a.a()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r4 = "64"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L3b
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r4 = "64"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L3f
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L3f:
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r4 = "mips"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L53
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r4 = "mips"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L57
        L53:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
        L57:
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L66
            boolean r2 = com.stub.StubApp.needX86Bridge
            if (r2 == 0) goto L66
            java.lang.String r2 = "X86Bridge"
            java.lang.System.loadLibrary(r2)
        L66:
            boolean r2 = com.stub.StubApp.loadFromLib
            if (r2 == 0) goto Lc1
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto Lbb
            boolean r0 = com.stub.StubApp.needX86Bridge
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "jiagu_x86"
            java.lang.System.loadLibrary(r0)
        L79:
            com.tianyu.util.DtcLoader.init()
            android.app.Application r0 = com.stub.StubApp.a
            interface5(r0)
            android.app.Application r0 = com.stub.StubApp.b
            if (r0 != 0) goto Lba
            android.app.Application r0 = a(r9)
            com.stub.StubApp.b = r0
            android.app.Application r0 = com.stub.StubApp.b
            if (r0 == 0) goto L24b
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.String r1 = "attach"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L242
            r3 = 0
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r2[r3] = r4     // Catch: java.lang.Exception -> L242
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L242
            if (r0 == 0) goto Lb0
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L242
            android.app.Application r1 = com.stub.StubApp.b     // Catch: java.lang.Exception -> L242
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L242
            r3 = 0
            r2[r3] = r9     // Catch: java.lang.Exception -> L242
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L242
        Lb0:
            android.app.Application r0 = com.stub.StubApp.b
            interface99(r0)
            android.app.Application r0 = com.stub.StubApp.b
            interface8(r0, r9)
        Lba:
            return
        Lbb:
            java.lang.String r0 = "jiagu"
            java.lang.System.loadLibrary(r0)
            goto L79
        Lc1:
            java.io.File r2 = r9.getFilesDir()
            java.io.File r2 = r2.getParentFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.io.File r4 = r9.getFilesDir()     // Catch: java.lang.Exception -> L250
            java.io.File r4 = r4.getParentFile()     // Catch: java.lang.Exception -> L250
            java.lang.String r2 = r4.getCanonicalPath()     // Catch: java.lang.Exception -> L250
        Ld9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = "/.jiagu"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            boolean r4 = r0.booleanValue()
            boolean r5 = r1.booleanValue()
            java.lang.String r4 = a(r2, r4, r5)
            com.stub.StubApp.i = r4
            java.lang.String r4 = a(r2, r6, r6)
            com.stub.StubApp.e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = java.io.File.separator
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = com.stub.StubApp.e
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.stub.StubApp.f = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = java.io.File.separator
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = com.stub.StubApp.i
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.stub.StubApp.g = r4
            com.stub.StubApp.h = r2
            boolean r4 = r1.booleanValue()
            if (r4 == 0) goto L1a9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.stub.StubApp.c
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "_mips.so"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = com.stub.StubApp.e
            com.tianyu.util.a.a(r9, r4, r2, r5)
        L158:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L224
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L224
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L1ea
            boolean r0 = com.stub.StubApp.needX86Bridge
            if (r0 != 0) goto L1ea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.stub.StubApp.c
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "_x64.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = com.stub.StubApp.i
            boolean r0 = com.tianyu.util.a.a(r9, r0, r2, r1)
        L189:
            if (r0 == 0) goto L206
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = com.stub.StubApp.i
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
            goto L79
        L1a9:
            boolean r4 = r3.booleanValue()
            if (r4 == 0) goto L1ce
            boolean r4 = com.stub.StubApp.needX86Bridge
            if (r4 != 0) goto L1ce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.stub.StubApp.c
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "_x86.so"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = com.stub.StubApp.e
            com.tianyu.util.a.a(r9, r4, r2, r5)
            goto L158
        L1ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.stub.StubApp.c
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".so"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = com.stub.StubApp.e
            com.tianyu.util.a.a(r9, r4, r2, r5)
            goto L158
        L1ea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.stub.StubApp.c
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "_a64.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = com.stub.StubApp.i
            boolean r0 = com.tianyu.util.a.a(r9, r0, r2, r1)
            goto L189
        L206:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = com.stub.StubApp.e
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
            goto L79
        L224:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = com.stub.StubApp.e
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
            goto L79
        L242:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to call attachBaseContext."
            r1.<init>(r2, r0)
            throw r1
        L24b:
            java.lang.System.exit(r7)
            goto Lba
        L250:
            r4 = move-exception
            goto Ld9
    }

    public native synchronized void n11030(java.lang.Object r1);

    public native void n1110();

    public native int n1111();

    public native void n11110(int r1);

    public native boolean n11111(int r1);

    public native void n111110(boolean r1, boolean r2);

    public native int n111111(int r1, int r2);

    public native void n1111110(int r1, int r2, boolean r3);

    public native java.lang.Object n1111111113(float r1, float r2, float r3, int r4, boolean r5, boolean r6);

    public native void n111111120(float r1, float r2, float r3, float r4, long r5);

    public native java.lang.Object n11111113(float r1, int r2, boolean r3, boolean r4);

    public native java.lang.Object n111111133(float r1, int r2, boolean r3, boolean r4, java.lang.Object r5);

    public native void n11111120(float r1, float r2, float r3, long r4);

    public native java.lang.Object n11111133(int r1, int r2, int r3, java.lang.Object r4);

    public native double n111112(int r1, int r2);

    public native java.lang.Object n111113(int r1, int r2);

    public native void n111120(int r1, long r2);

    public native boolean n11112111(int r1, long r2, int r4, int r5);

    public native long n111122(int r1, long r2);

    public native void n11112220(boolean r1, long r2, long r4, long r6);

    public native java.lang.Object n11113(int r1);

    public native void n111130(int r1, java.lang.Object r2);

    public native void n11113110(int r1, java.lang.Object r2, int r3, int r4);

    public native long n111132(int r1, java.lang.Object r2);

    public native void n1111320(int r1, java.lang.Object r2, long r3);

    public native java.lang.Object n111133(int r1, java.lang.Object r2);

    public native void n1111330(int r1, java.lang.Object r2, java.lang.Object r3);

    public native boolean n11113311(int r1, java.lang.Object r2, java.lang.Object r3, int r4);

    public native int n11113331(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4);

    public native long n1112();

    public native void n11120(long r1);

    public native int n11121(long r1);

    public native void n111210(long r1, float r3);

    public native int n111211(long r1, int r3);

    public native int n1112111(long r1, int r3, int r4);

    public native boolean n11121111(long r1, int r3, int r4, int r5);

    public native java.lang.Object n111211111223(long r1, int r3, int r4, int r5, int r6, int r7, double r8, double r10);

    public native java.lang.Object n1112113(long r1, int r3, int r4);

    public native int n11121131(long r1, int r3, int r4, java.lang.Object r5);

    public native java.lang.Object n11121133(long r1, int r3, int r4, java.lang.Object r5);

    public native java.lang.Object n1112113333(long r1, int r3, int r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7);

    public native long n111212(long r1, boolean r3);

    public native java.lang.Object n111213(long r1, boolean r3);

    public native java.lang.Object n1112133(double r1, int r3, java.lang.Object r4);

    public native float n11121331(long r1, int r3, java.lang.Object r4, java.lang.Object r5);

    public native float n111213311(long r1, int r3, java.lang.Object r4, java.lang.Object r5, int r6);

    public native int n111213331(long r1, int r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6);

    public native float n1112133331(long r1, int r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7);

    public native long n11122(long r1);

    public native void n111220(double r1, double r3);

    public native long n111222(long r1, long r3);

    public native java.lang.Object n111223(long r1, long r3);

    public native java.lang.Object n11123(long r1);

    public native void n111230(long r1, java.lang.Object r3);

    public native int n111231(long r1, java.lang.Object r3);

    public native int n1112311(long r1, java.lang.Object r3, int r4);

    public native boolean n11123111(long r1, java.lang.Object r3, boolean r4, int r5);

    public native void n111231111110(long r1, java.lang.Object r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    public native java.lang.Object n111231113(long r1, java.lang.Object r3, int r4, int r5, int r6);

    public native long n11123112(long r1, java.lang.Object r3, int r4, int r5);

    public native void n111231130(long r1, java.lang.Object r3, boolean r4, boolean r5, java.lang.Object r6);

    public native long n111232(long r1, java.lang.Object r3);

    public native boolean n1112321(long r1, java.lang.Object r3, double r4);

    public native boolean n11123211(long r1, java.lang.Object r3, double r4, int r6);

    public native double n1112322(long r1, java.lang.Object r3, double r4);

    public native void n11123220(long r1, java.lang.Object r3, long r4, long r6);

    public native java.lang.Object n111233(long r1, java.lang.Object r3);

    public native void n1112330(long r1, java.lang.Object r3, java.lang.Object r4);

    public native boolean n1112331(double r1, java.lang.Object r3, java.lang.Object r4);

    public native void n11123310(long r1, java.lang.Object r3, java.lang.Object r4, boolean r5);

    public native boolean n11123311(long r1, java.lang.Object r3, java.lang.Object r4, int r5);

    public native java.lang.Object n1112331133(long r1, java.lang.Object r3, java.lang.Object r4, float r5, boolean r6, java.lang.Object r7);

    public native java.lang.Object n111233133(long r1, java.lang.Object r3, java.lang.Object r4, float r5, java.lang.Object r6);

    public native java.lang.Object n1112333(long r1, java.lang.Object r3, java.lang.Object r4);

    public native java.lang.Object n11123333(long r1, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5);

    public native void n111233330(long r1, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6);

    public native java.lang.Object n1113();

    public native void n11130(java.lang.Object r1);

    public native boolean n11131(java.lang.Object r1);

    public native void n111310(java.lang.Object r1, int r2);

    public native boolean n111311(java.lang.Object r1, int r2);

    public native void n1113110(java.lang.Object r1, int r2, int r3);

    public native boolean n1113111(java.lang.Object r1, int r2, int r3);

    public native void n11131110(java.lang.Object r1, int r2, int r3, int r4);

    public native boolean n11131111(java.lang.Object r1, int r2, int r3, int r4);

    public native int n1113111111(java.lang.Object r1, int r2, int r3, int r4, float r5, int r6);

    public native java.lang.Object n1113113(java.lang.Object r1, boolean r2, int r3);

    public native java.lang.Object n111313(java.lang.Object r1, int r2);

    public native long n1113132(java.lang.Object r1, int r2, java.lang.Object r3);

    public native java.lang.Object n1113133(java.lang.Object r1, int r2, java.lang.Object r3);

    public native void n11131330(java.lang.Object r1, int r2, java.lang.Object r3, java.lang.Object r4);

    public native void n111322110(java.lang.Object r1, long r2, long r4, int r6, int r7);

    public native java.lang.Object n11133(java.lang.Object r1);

    public native void n111330(java.lang.Object r1, java.lang.Object r2);

    public native int n111331(java.lang.Object r1, java.lang.Object r2);

    public native void n11133110(java.lang.Object r1, java.lang.Object r2, boolean r3, int r4);

    public native int n11133111(java.lang.Object r1, java.lang.Object r2, boolean r3, int r4);

    public native long n111332(java.lang.Object r1, java.lang.Object r2);

    public native java.lang.Object n111333(java.lang.Object r1, java.lang.Object r2);

    public native void n1113330(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public native int n1113331(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public native void n11133310(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4);

    public native int n111333111(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, boolean r4, int r5);

    public native java.lang.Object n1113333(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public native void n11133330(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4);

    public native int n111333311(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5);

    public native java.lang.Object n11133333(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4);

    public native void n1113333330(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6);

    public native void n111333333330(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8);

    public native void n1113333333330(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9);

    @Override // android.app.Application
    public final void onCreate() {
            r5 = this;
            java.lang.System.currentTimeMillis()
            super.onCreate()
            ChangeTopApplication()
            android.app.Application r0 = com.stub.StubApp.b
            if (r0 == 0) goto L12
            android.app.Application r0 = com.stub.StubApp.b
            r0.onCreate()
        L12:
            android.app.Application r0 = com.stub.StubApp.b
            interface21(r0)
            android.app.Application r0 = com.stub.StubApp.b
            if (r0 == 0) goto L1d
            android.app.Application r5 = com.stub.StubApp.b
        L1d:
            android.content.Context r0 = com.stub.StubApp.d
            if (r5 == 0) goto L29
            if (r0 == 0) goto L29
            boolean r0 = com.tianyu.util.a.a(r0)
            if (r0 != 0) goto L2a
        L29:
            return
        L2a:
            java.lang.String r0 = "s\u007f}>zw>rx>Bu`\u007fbdcDy}u"
            java.lang.String r0 = com.tianyu.util.a.a(r0)     // Catch: java.lang.Exception -> L55
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = "BuwycdubQsdyfydiSq||Rqs{c"
            java.lang.String r1 = com.tianyu.util.a.a(r1)     // Catch: java.lang.Exception -> L55
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L55
            r3 = 0
            java.lang.Class<android.app.Application> r4 = android.app.Application.class
            r2[r3] = r4     // Catch: java.lang.Exception -> L55
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L55
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L55
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L55
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L55
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L55
            goto L29
        L55:
            r0 = move-exception
            goto L29
    }
}
