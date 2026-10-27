package tv.cjump.jni;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceUtils {
    public static final java.lang.String a = "x86";
    public static final java.lang.String b = "mips";
    private static tv.cjump.jni.DeviceUtils.ARCH c = null;
    private static final int d = 40;
    private static final int e = 3;
    private static final int f = 8;
    private static final int g = 183;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ARCH extends java.lang.Enum<tv.cjump.jni.DeviceUtils.ARCH> {
        private static final /* synthetic */ tv.cjump.jni.DeviceUtils.ARCH[] $VALUES = null;
        public static final tv.cjump.jni.DeviceUtils.ARCH ARM = null;
        public static final tv.cjump.jni.DeviceUtils.ARCH ARM64 = null;
        public static final tv.cjump.jni.DeviceUtils.ARCH MIPS = null;
        public static final tv.cjump.jni.DeviceUtils.ARCH Unknown = null;
        public static final tv.cjump.jni.DeviceUtils.ARCH X86 = null;

        static {
                tv.cjump.jni.DeviceUtils$ARCH r0 = new tv.cjump.jni.DeviceUtils$ARCH
                java.lang.String r1 = "Unknown"
                r2 = 0
                r0.<init>(r1, r2)
                tv.cjump.jni.DeviceUtils.ARCH.Unknown = r0
                tv.cjump.jni.DeviceUtils$ARCH r1 = new tv.cjump.jni.DeviceUtils$ARCH
                java.lang.String r3 = "ARM"
                r4 = 1
                r1.<init>(r3, r4)
                tv.cjump.jni.DeviceUtils.ARCH.ARM = r1
                tv.cjump.jni.DeviceUtils$ARCH r3 = new tv.cjump.jni.DeviceUtils$ARCH
                java.lang.String r5 = "X86"
                r6 = 2
                r3.<init>(r5, r6)
                tv.cjump.jni.DeviceUtils.ARCH.X86 = r3
                tv.cjump.jni.DeviceUtils$ARCH r5 = new tv.cjump.jni.DeviceUtils$ARCH
                java.lang.String r7 = "MIPS"
                r8 = 3
                r5.<init>(r7, r8)
                tv.cjump.jni.DeviceUtils.ARCH.MIPS = r5
                tv.cjump.jni.DeviceUtils$ARCH r7 = new tv.cjump.jni.DeviceUtils$ARCH
                java.lang.String r9 = "ARM64"
                r10 = 4
                r7.<init>(r9, r10)
                tv.cjump.jni.DeviceUtils.ARCH.ARM64 = r7
                r9 = 5
                tv.cjump.jni.DeviceUtils$ARCH[] r9 = new tv.cjump.jni.DeviceUtils.ARCH[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                tv.cjump.jni.DeviceUtils.ARCH.$VALUES = r9
                return
        }

        ARCH(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static tv.cjump.jni.DeviceUtils.ARCH valueOf(java.lang.String r1) {
                java.lang.Class<tv.cjump.jni.DeviceUtils$ARCH> r0 = tv.cjump.jni.DeviceUtils.ARCH.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                tv.cjump.jni.DeviceUtils$ARCH r1 = (tv.cjump.jni.DeviceUtils.ARCH) r1
                return r1
        }

        public static tv.cjump.jni.DeviceUtils.ARCH[] values() {
                tv.cjump.jni.DeviceUtils$ARCH[] r0 = tv.cjump.jni.DeviceUtils.ARCH.$VALUES
                java.lang.Object r0 = r0.clone()
                tv.cjump.jni.DeviceUtils$ARCH[] r0 = (tv.cjump.jni.DeviceUtils.ARCH[]) r0
                return r0
        }
    }

    static {
            tv.cjump.jni.DeviceUtils$ARCH r0 = tv.cjump.jni.DeviceUtils.ARCH.Unknown
            tv.cjump.jni.DeviceUtils.c = r0
            return
    }

    public DeviceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized tv.cjump.jni.DeviceUtils.ARCH a() {
            java.lang.Class<tv.cjump.jni.DeviceUtils> r0 = tv.cjump.jni.DeviceUtils.class
            monitor-enter(r0)
            r1 = 20
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L60
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L60
            java.io.File r3 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "lib/libc.so"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2.canRead()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L77
            r3 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64 java.io.FileNotFoundException -> L66
            java.lang.String r5 = "r"
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L64 java.io.FileNotFoundException -> L66
            r4.readFully(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            r2 = 19
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            r3 = 8
            int r2 = r2 << r3
            r5 = 18
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            r1 = r1 | r2
            r2 = 3
            if (r1 == r2) goto L58
            if (r1 == r3) goto L53
            r2 = 40
            if (r1 == r2) goto L4e
            r2 = 183(0xb7, float:2.56E-43)
            if (r1 == r2) goto L49
            java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            goto L5c
        L40:
            r1 = move-exception
            r3 = r4
            goto L68
        L43:
            r3 = r4
            goto L6e
        L46:
            r3 = r4
            goto L74
        L49:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.ARM64     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            tv.cjump.jni.DeviceUtils.c = r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            goto L5c
        L4e:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.ARM     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            tv.cjump.jni.DeviceUtils.c = r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            goto L5c
        L53:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.MIPS     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            tv.cjump.jni.DeviceUtils.c = r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            goto L5c
        L58:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.X86     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
            tv.cjump.jni.DeviceUtils.c = r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43 java.io.FileNotFoundException -> L46
        L5c:
            r4.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L77
            goto L77
        L60:
            r1 = move-exception
            goto L7b
        L62:
            r1 = move-exception
            goto L68
        L64:
            goto L6e
        L66:
            goto L74
        L68:
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L6d
        L6d:
            throw r1     // Catch: java.lang.Throwable -> L60
        L6e:
            if (r3 == 0) goto L77
        L70:
            r3.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L77
            goto L77
        L74:
            if (r3 == 0) goto L77
            goto L70
        L77:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.c     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)
            return r1
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r1
    }

    public static java.lang.String b() {
            java.lang.String r0 = android.os.Build.CPU_ABI
            return r0
    }

    public static java.lang.String c() {
            r0 = 0
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r2 = "CPU_ABI2"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L18
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L18
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L18
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L18
            return r1
        L18:
            return r0
    }

    public static boolean d() {
            tv.cjump.jni.DeviceUtils$ARCH r0 = a()
            boolean r1 = l()
            if (r1 != 0) goto L14
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.X86
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean e() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "MagicBox"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L14
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean f() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "Xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L16
            java.lang.String r0 = "dredd"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static boolean g() {
            boolean r0 = f()
            if (r0 != 0) goto Lf
            boolean r0 = e()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static boolean h() {
            tv.cjump.jni.DeviceUtils$ARCH r0 = a()
            java.lang.String r1 = "armeabi-v7a"
            boolean r1 = j(r1)
            if (r1 != 0) goto L14
            java.lang.String r1 = "armeabi"
            boolean r1 = j(r1)
            if (r1 == 0) goto L1e
        L14:
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.ARM
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public static boolean i() {
            tv.cjump.jni.DeviceUtils$ARCH r0 = a()
            java.lang.String r1 = "x86"
            boolean r1 = j(r1)
            if (r1 != 0) goto L17
            tv.cjump.jni.DeviceUtils$ARCH r1 = tv.cjump.jni.DeviceUtils.ARCH.X86
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public static boolean j(java.lang.String r3) {
            java.lang.String r0 = b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r1 != 0) goto L12
            boolean r1 = r0.equalsIgnoreCase(r3)
            if (r1 == 0) goto L12
            return r2
        L12:
            java.lang.String r1 = c()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L23
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L23
            return r2
        L23:
            r3 = 0
            return r3
    }

    public static boolean k() {
            java.lang.String r0 = "mips"
            boolean r0 = j(r0)
            return r0
    }

    public static boolean l() {
            java.lang.String r0 = "x86"
            boolean r0 = j(r0)
            return r0
    }
}
