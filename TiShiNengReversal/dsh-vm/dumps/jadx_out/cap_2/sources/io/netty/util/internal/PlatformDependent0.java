package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class PlatformDependent0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long ADDRESS_FIELD_OFFSET = 0;
    private static final java.lang.reflect.Method ALLOCATE_ARRAY_METHOD = null;
    private static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final java.lang.reflect.Constructor<?> DIRECT_BUFFER_CONSTRUCTOR = null;
    private static final java.lang.Throwable EXPLICIT_NO_UNSAFE_CAUSE = null;
    static final int HASH_CODE_ASCII_SEED = -1028477387;
    static final int HASH_CODE_C1 = -862048943;
    static final int HASH_CODE_C2 = 461845907;
    private static final java.lang.Object INTERNAL_UNSAFE = null;
    private static final boolean IS_ANDROID = false;
    private static final boolean IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = false;
    private static final int JAVA_VERSION = 0;
    private static final boolean UNALIGNED = false;
    static final sun.misc.Unsafe UNSAFE = null;
    private static final long UNSAFE_COPY_THRESHOLD = 1048576;
    private static final java.lang.Throwable UNSAFE_UNAVAILABILITY_CAUSE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;











    static {
            java.lang.Class<io.netty.util.internal.PlatformDependent0> r0 = io.netty.util.internal.PlatformDependent0.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.PlatformDependent0.logger = r0
            java.lang.Throwable r1 = explicitNoUnsafeCause0()
            io.netty.util.internal.PlatformDependent0.EXPLICIT_NO_UNSAFE_CAUSE = r1
            int r2 = javaVersion0()
            io.netty.util.internal.PlatformDependent0.JAVA_VERSION = r2
            boolean r2 = isAndroid0()
            io.netty.util.internal.PlatformDependent0.IS_ANDROID = r2
            boolean r2 = explicitTryReflectionSetAccessible0()
            io.netty.util.internal.PlatformDependent0.IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = r2
            r2 = 1
            java.lang.Class<byte[]> r4 = byte[].class
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2d
            r7 = r6
            r8 = r7
            r9 = r8
            goto Laa
        L2d:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r5)
            io.netty.util.internal.PlatformDependent0$1 r8 = new io.netty.util.internal.PlatformDependent0$1
            r8.<init>()
            java.lang.Object r8 = java.security.AccessController.doPrivileged(r8)
            boolean r9 = r8 instanceof java.lang.Throwable
            if (r9 == 0) goto L48
            r1 = r8
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r8 = "sun.misc.Unsafe.theUnsafe: unavailable"
            r0.debug(r8, r1)
            r8 = r6
            goto L4f
        L48:
            sun.misc.Unsafe r8 = (sun.misc.Unsafe) r8
            java.lang.String r9 = "sun.misc.Unsafe.theUnsafe: available"
            r0.debug(r9)
        L4f:
            if (r8 == 0) goto L6b
            io.netty.util.internal.PlatformDependent0$2 r9 = new io.netty.util.internal.PlatformDependent0$2
            r9.<init>(r8)
            java.lang.Object r9 = java.security.AccessController.doPrivileged(r9)
            if (r9 != 0) goto L62
            java.lang.String r9 = "sun.misc.Unsafe.copyMemory: available"
            r0.debug(r9)
            goto L6b
        L62:
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r8 = "sun.misc.Unsafe.copyMemory: unavailable"
            r0.debug(r8, r1)
            r8 = r6
        L6b:
            if (r8 == 0) goto L8d
            io.netty.util.internal.PlatformDependent0$3 r9 = new io.netty.util.internal.PlatformDependent0$3
            r9.<init>(r8, r7)
            java.lang.Object r9 = java.security.AccessController.doPrivileged(r9)
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L82
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.String r10 = "java.nio.Buffer.address: available"
            r0.debug(r10)
            goto L8e
        L82:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.String r1 = "java.nio.Buffer.address: unavailable"
            r0.debug(r1, r9)
            r8 = r6
            r1 = r9
            r9 = r8
            goto L8e
        L8d:
            r9 = r6
        L8e:
            if (r8 == 0) goto Laa
            int r10 = r8.arrayIndexScale(r4)
            long r10 = (long) r10
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto Laa
            java.lang.String r1 = "unsafe.arrayIndexScale is {} (expected: 1). Not using unsafe."
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r0.debug(r1, r8)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Unexpected unsafe.arrayIndexScale"
            r1.<init>(r8)
            r8 = r6
        Laa:
            io.netty.util.internal.PlatformDependent0.UNSAFE_UNAVAILABILITY_CAUSE = r1
            io.netty.util.internal.PlatformDependent0.UNSAFE = r8
            r1 = 0
            r10 = -1
            if (r8 != 0) goto Lbf
            io.netty.util.internal.PlatformDependent0.ADDRESS_FIELD_OFFSET = r10
            io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET = r10
            io.netty.util.internal.PlatformDependent0.UNALIGNED = r1
            io.netty.util.internal.PlatformDependent0.DIRECT_BUFFER_CONSTRUCTOR = r6
            io.netty.util.internal.PlatformDependent0.ALLOCATE_ARRAY_METHOD = r6
            goto L1bb
        Lbf:
            io.netty.util.internal.PlatformDependent0$4 r12 = new io.netty.util.internal.PlatformDependent0$4     // Catch: java.lang.Throwable -> Lf3
            r12.<init>(r7)     // Catch: java.lang.Throwable -> Lf3
            java.lang.Object r7 = java.security.AccessController.doPrivileged(r12)     // Catch: java.lang.Throwable -> Lf3
            boolean r12 = r7 instanceof java.lang.reflect.Constructor     // Catch: java.lang.Throwable -> Lf3
            r13 = 2
            if (r12 == 0) goto Lf7
            long r2 = r8.allocateMemory(r2)     // Catch: java.lang.Throwable -> Lf3
            r8 = r7
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            r15[r1] = r12     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            r15[r5] = r14     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            r8.newInstance(r15)     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            java.lang.String r8 = "direct buffer constructor: available"
            r0.debug(r8)     // Catch: java.lang.Throwable -> Led java.lang.Throwable -> Lf0
            goto L100
        Led:
            r0 = move-exception
            goto L1ce
        Lf0:
            r7 = r6
            goto L100
        Lf3:
            r0 = move-exception
            r2 = r10
            goto L1ce
        Lf7:
            java.lang.String r2 = "direct buffer constructor: unavailable"
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> Lf3
            r0.debug(r2, r7)     // Catch: java.lang.Throwable -> Lf3
            r7 = r6
            r2 = r10
        L100:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L109
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.freeMemory(r2)
        L109:
            io.netty.util.internal.PlatformDependent0.DIRECT_BUFFER_CONSTRUCTOR = r7
            long r2 = objectFieldOffset(r9)
            io.netty.util.internal.PlatformDependent0.ADDRESS_FIELD_OFFSET = r2
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r0 = r0.arrayBaseOffset(r4)
            long r2 = (long) r0
            io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET = r2
            io.netty.util.internal.PlatformDependent0$5 r0 = new io.netty.util.internal.PlatformDependent0$5
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L135
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r4 = "java.nio.Bits.unaligned: available, {}"
            r3.debug(r4, r0)
            goto L150
        L135:
            java.lang.String r2 = "os.arch"
            java.lang.String r3 = ""
            java.lang.String r2 = io.netty.util.internal.SystemPropertyUtil.get(r2, r3)
            java.lang.String r3 = "^(i[3-6]86|x86(_64)?|x64|amd64)$"
            boolean r2 = r2.matches(r3)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r4 = "java.nio.Bits.unaligned: unavailable {}"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r3.debug(r4, r7, r0)
        L150:
            io.netty.util.internal.PlatformDependent0.UNALIGNED = r2
            int r0 = javaVersion()
            r2 = 9
            if (r0 < r2) goto L1b0
            io.netty.util.internal.PlatformDependent0$6 r0 = new io.netty.util.internal.PlatformDependent0$6
            r0.<init>()
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r0)
            boolean r0 = r2 instanceof java.lang.Throwable
            if (r0 != 0) goto L199
            io.netty.util.internal.PlatformDependent0$7 r0 = new io.netty.util.internal.PlatformDependent0$7
            r0.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            boolean r3 = r0 instanceof java.lang.reflect.Method
            if (r3 == 0) goto L193
            r3 = r0
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            r7[r1] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            r7[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            java.lang.Object r1 = r3.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            byte[] r1 = (byte[]) r1     // Catch: java.lang.reflect.InvocationTargetException -> L190 java.lang.IllegalAccessException -> L192
            r6 = r2
            r2 = r0
            r0 = r6
            r6 = r3
            goto L19a
        L190:
            r0 = move-exception
            goto L193
        L192:
            r0 = move-exception
        L193:
            r16 = r2
            r2 = r0
            r0 = r16
            goto L19a
        L199:
            r0 = r6
        L19a:
            boolean r1 = r2 instanceof java.lang.Throwable
            if (r1 == 0) goto L1a8
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r3 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable"
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.debug(r3, r2)
            goto L1b8
        L1a8:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r2 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): available"
            r1.debug(r2)
            goto L1b8
        L1b0:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r1 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable prior to Java9"
            r0.debug(r1)
            r0 = r6
        L1b8:
            io.netty.util.internal.PlatformDependent0.ALLOCATE_ARRAY_METHOD = r6
            r6 = r0
        L1bb:
            io.netty.util.internal.PlatformDependent0.INTERNAL_UNSAFE = r6
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.reflect.Constructor<?> r1 = io.netty.util.internal.PlatformDependent0.DIRECT_BUFFER_CONSTRUCTOR
            if (r1 == 0) goto L1c6
            java.lang.String r1 = "available"
            goto L1c8
        L1c6:
            java.lang.String r1 = "unavailable"
        L1c8:
            java.lang.String r2 = "java.nio.DirectByteBuffer.<init>(long, int): {}"
            r0.debug(r2, r1)
            return
        L1ce:
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 == 0) goto L1d7
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r1.freeMemory(r2)
        L1d7:
            throw r0
    }

    private PlatformDependent0() {
            r0 = this;
            r0.<init>()
            return
    }

    static int addressSize() {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r0 = r0.addressSize()
            return r0
    }

    static java.nio.ByteBuffer allocateDirectNoCleaner(int r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r1 = 1
            int r1 = java.lang.Math.max(r1, r3)
            long r1 = (long) r1
            long r0 = r0.allocateMemory(r1)
            java.nio.ByteBuffer r3 = newDirectBuffer(r0, r3)
            return r3
    }

    static long allocateMemory(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = r0.allocateMemory(r1)
            return r1
    }

    static byte[] allocateUninitializedArray(int r5) {
            java.lang.reflect.Method r0 = io.netty.util.internal.PlatformDependent0.ALLOCATE_ARRAY_METHOD     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Object r1 = io.netty.util.internal.PlatformDependent0.INTERNAL_UNSAFE     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            r3 = 1
            r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            byte[] r5 = (byte[]) r5     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            return r5
        L1a:
            r5 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r5)
            throw r0
        L21:
            r5 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r5)
            throw r0
    }

    static long byteArrayBaseOffset() {
            long r0 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            return r0
    }

    static void copyMemory(long r9, long r11, long r13) {
            int r0 = javaVersion()
            r1 = 8
            if (r0 > r1) goto Lc
            copyMemoryWithSafePointPolling(r9, r11, r13)
            return
        Lc:
            sun.misc.Unsafe r2 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r3 = r9
            r5 = r11
            r7 = r13
            r2.copyMemory(r3, r5, r7)
            return
    }

    static void copyMemory(java.lang.Object r11, long r12, java.lang.Object r14, long r15, long r17) {
            int r0 = javaVersion()
            r1 = 8
            if (r0 > r1) goto Lc
            copyMemoryWithSafePointPolling(r11, r12, r14, r15, r17)
            return
        Lc:
            sun.misc.Unsafe r2 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r9 = r17
            r2.copyMemory(r3, r4, r6, r7, r9)
            return
    }

    private static void copyMemoryWithSafePointPolling(long r7, long r9, long r11) {
            r1 = r7
            r3 = r9
        L2:
            r7 = 0
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L18
            r7 = 1048576(0x100000, double:5.180654E-318)
            long r5 = java.lang.Math.min(r11, r7)
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.copyMemory(r1, r3, r5)
            long r11 = r11 - r5
            long r1 = r1 + r5
            long r3 = r3 + r5
            goto L2
        L18:
            return
    }

    private static void copyMemoryWithSafePointPolling(java.lang.Object r9, long r10, java.lang.Object r12, long r13, long r15) {
            r2 = r10
            r5 = r13
            r10 = r15
        L3:
            r0 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1b
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r7 = java.lang.Math.min(r10, r0)
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r1 = r9
            r4 = r12
            r0.copyMemory(r1, r2, r4, r5, r7)
            long r10 = r10 - r7
            long r2 = r2 + r7
            long r5 = r5 + r7
            goto L3
        L1b:
            return
    }

    static long directBufferAddress(java.nio.ByteBuffer r2) {
            long r0 = io.netty.util.internal.PlatformDependent0.ADDRESS_FIELD_OFFSET
            long r0 = getLong(r2, r0)
            return r0
    }

    static boolean equals(byte[] r20, int r21, byte[] r22, int r23, int r24) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r3 & 7
            long r5 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r7 = (long) r1
            long r5 = r5 + r7
            int r1 = r23 - r1
            long r7 = (long) r1
            r1 = 8
            if (r3 < r1) goto L3d
            long r10 = (long) r4
            long r10 = r10 + r5
            r12 = 8
            long r14 = r5 - r12
            r16 = r10
            r21 = 0
            long r9 = (long) r3
            long r14 = r14 + r9
        L21:
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 < 0) goto L3f
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r9 = r1.getLong(r0, r14)
            r18 = r12
            long r12 = r14 + r7
            long r11 = r1.getLong(r2, r12)
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L38
            return r21
        L38:
            long r14 = r14 - r18
            r12 = r18
            goto L21
        L3d:
            r21 = 0
        L3f:
            r1 = 4
            if (r4 < r1) goto L54
            int r4 = r4 + (-4)
            long r9 = (long) r4
            long r9 = r9 + r5
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r3 = r1.getInt(r0, r9)
            long r9 = r9 + r7
            int r1 = r1.getInt(r2, r9)
            if (r3 == r1) goto L54
            return r21
        L54:
            long r7 = r7 + r5
            r1 = 1
            r3 = 2
            if (r4 < r3) goto L77
            sun.misc.Unsafe r9 = io.netty.util.internal.PlatformDependent0.UNSAFE
            char r10 = r9.getChar(r0, r5)
            char r11 = r9.getChar(r2, r7)
            if (r10 != r11) goto L76
            if (r4 == r3) goto L75
            r3 = 2
            long r5 = r5 + r3
            byte r0 = r9.getByte(r0, r5)
            long r7 = r7 + r3
            byte r2 = r9.getByte(r2, r7)
            if (r0 != r2) goto L76
        L75:
            return r1
        L76:
            return r21
        L77:
            if (r4 == 0) goto L87
            sun.misc.Unsafe r3 = io.netty.util.internal.PlatformDependent0.UNSAFE
            byte r0 = r3.getByte(r0, r5)
            byte r2 = r3.getByte(r2, r7)
            if (r0 != r2) goto L86
            goto L87
        L86:
            return r21
        L87:
            return r1
    }

    static int equalsConstantTime(byte[] r22, int r23, byte[] r24, int r25, int r26) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r3 & 7
            long r4 = (long) r4
            long r6 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r8 = (long) r1
            long r6 = r6 + r8
            long r8 = r6 + r4
            int r1 = r25 - r1
            long r10 = (long) r1
            r12 = 8
            long r14 = r6 - r12
            r16 = r12
            long r12 = (long) r3
            long r14 = r14 + r12
            r18 = 0
        L1e:
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 < 0) goto L35
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r20 = r1.getLong(r0, r14)
            long r12 = r14 + r10
            long r12 = r1.getLong(r2, r12)
            long r12 = r20 ^ r12
            long r18 = r18 | r12
            long r14 = r14 - r16
            goto L1e
        L35:
            r12 = 4
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 < 0) goto L4b
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r3 = r1.getInt(r0, r6)
            long r6 = r6 + r10
            int r1 = r1.getInt(r2, r6)
            r1 = r1 ^ r3
            long r6 = (long) r1
            long r18 = r18 | r6
            long r4 = r4 - r12
        L4b:
            r6 = 2
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            long r12 = r8 - r4
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            char r3 = r1.getChar(r0, r12)
            long r12 = r12 + r10
            char r1 = r1.getChar(r2, r12)
            r1 = r1 ^ r3
            long r12 = (long) r1
            long r18 = r18 | r12
            long r4 = r4 - r6
        L63:
            r6 = 1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L79
            long r8 = r8 - r6
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE
            byte r0 = r1.getByte(r0, r8)
            long r8 = r8 + r10
            byte r1 = r1.getByte(r2, r8)
            r0 = r0 ^ r1
            long r0 = (long) r0
            long r18 = r18 | r0
        L79:
            r0 = r18
            r2 = 0
            int r0 = io.netty.util.internal.ConstantTimeUtils.equalsConstantTime(r0, r2)
            return r0
    }

    private static java.lang.Throwable explicitNoUnsafeCause0() {
            java.lang.String r0 = "io.netty.noUnsafe"
            r1 = 0
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r2 = "-Dio.netty.noUnsafe: {}"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r1.debug(r2, r3)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "sun.misc.Unsafe: unavailable (io.netty.noUnsafe)"
            r1.debug(r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            return r1
        L1f:
            java.lang.String r0 = "io.netty.tryUnsafe"
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.contains(r0)
            if (r2 == 0) goto L28
            goto L2a
        L28:
            java.lang.String r0 = "org.jboss.netty.tryUnsafe"
        L2a:
            r2 = 1
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r2)
            if (r2 != 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sun.misc.Unsafe: unavailable ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.debug(r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            return r1
        L50:
            r0 = 0
            return r0
    }

    private static boolean explicitTryReflectionSetAccessible0() {
            int r0 = javaVersion()
            r1 = 9
            if (r0 >= r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "io.netty.tryReflectionSetAccessible"
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r1, r0)
            return r0
    }

    static void freeMemory(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.freeMemory(r1)
            return
    }

    static byte getByte(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            byte r1 = r0.getByte(r1)
            return r1
    }

    static byte getByte(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            byte r5 = r0.getByte(r5, r1)
            return r5
    }

    static java.lang.ClassLoader getClassLoader(java.lang.Class<?> r1) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lb
            java.lang.ClassLoader r1 = r1.getClassLoader()
            return r1
        Lb:
            io.netty.util.internal.PlatformDependent0$8 r0 = new io.netty.util.internal.PlatformDependent0$8
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            return r1
    }

    static java.lang.ClassLoader getContextClassLoader() {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lf
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            return r0
        Lf:
            io.netty.util.internal.PlatformDependent0$9 r0 = new io.netty.util.internal.PlatformDependent0$9
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    static int getInt(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r1 = r0.getInt(r1)
            return r1
    }

    static int getInt(java.lang.Object r1, long r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    static int getInt(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            int r5 = r0.getInt(r5, r1)
            return r5
    }

    static long getLong(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = r0.getLong(r1)
            return r1
    }

    private static long getLong(java.lang.Object r1, long r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    static long getLong(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            long r5 = r0.getLong(r5, r1)
            return r5
    }

    static java.lang.Object getObject(java.lang.Object r1, long r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    static short getShort(long r1) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            short r1 = r0.getShort(r1)
            return r1
    }

    static short getShort(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            short r5 = r0.getShort(r5, r1)
            return r5
    }

    static java.lang.ClassLoader getSystemClassLoader() {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lb
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            return r0
        Lb:
            io.netty.util.internal.PlatformDependent0$10 r0 = new io.netty.util.internal.PlatformDependent0$10
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    static java.lang.Throwable getUnsafeUnavailabilityCause() {
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent0.UNSAFE_UNAVAILABILITY_CAUSE
            return r0
    }

    static boolean hasAllocateArrayMethod() {
            java.lang.reflect.Method r0 = io.netty.util.internal.PlatformDependent0.ALLOCATE_ARRAY_METHOD
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static boolean hasDirectBufferNoCleanerConstructor() {
            java.lang.reflect.Constructor<?> r0 = io.netty.util.internal.PlatformDependent0.DIRECT_BUFFER_CONSTRUCTOR
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static boolean hasUnsafe() {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static int hashCodeAscii(byte[] r10, int r11, int r12) {
            long r0 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r2 = (long) r11
            long r0 = r0 + r2
            r11 = r12 & 7
            long r2 = (long) r11
            long r2 = r2 + r0
            r4 = 8
            long r6 = r0 - r4
            long r8 = (long) r12
            long r6 = r6 + r8
            r12 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
        L11:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L21
            sun.misc.Unsafe r8 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r8 = r8.getLong(r10, r6)
            int r12 = hashCodeAsciiCompute(r8, r12)
            long r6 = r6 - r4
            goto L11
        L21:
            if (r11 != 0) goto L24
            return r12
        L24:
            r2 = 2
            r3 = 0
            r4 = 1
            if (r11 == r2) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r5 = 4
            if (r11 == r5) goto L31
            r6 = 1
            goto L32
        L31:
            r6 = 0
        L32:
            r2 = r2 & r6
            r6 = 6
            if (r11 == r6) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            r2 = r2 & r6
            r6 = 461845907(0x1b873593, float:2.2368498E-22)
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            if (r2 == 0) goto L56
            int r12 = r12 * r7
            sun.misc.Unsafe r2 = io.netty.util.internal.PlatformDependent0.UNSAFE
            byte r2 = r2.getByte(r10, r0)
            int r2 = hashCodeAsciiSanitize(r2)
            int r12 = r12 + r2
            r8 = 1
            long r0 = r0 + r8
            r2 = 461845907(0x1b873593, float:2.2368498E-22)
            goto L59
        L56:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
        L59:
            if (r11 == r4) goto L5d
            r8 = 1
            goto L5e
        L5d:
            r8 = 0
        L5e:
            if (r11 == r5) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            r8 = r8 & r9
            r9 = 5
            if (r11 == r9) goto L68
            r3 = 1
        L68:
            r3 = r3 & r8
            if (r3 == 0) goto L82
            int r12 = r12 * r2
            sun.misc.Unsafe r3 = io.netty.util.internal.PlatformDependent0.UNSAFE
            short r3 = r3.getShort(r10, r0)
            int r3 = hashCodeAsciiSanitize(r3)
            int r12 = r12 + r3
            if (r2 != r7) goto L7b
            goto L7e
        L7b:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
        L7e:
            r2 = 2
            long r0 = r0 + r2
            r2 = r6
        L82:
            if (r11 < r5) goto L91
            int r12 = r12 * r2
            sun.misc.Unsafe r11 = io.netty.util.internal.PlatformDependent0.UNSAFE
            int r10 = r11.getInt(r10, r0)
            int r10 = hashCodeAsciiSanitize(r10)
            int r12 = r12 + r10
        L91:
            return r12
    }

    static int hashCodeAsciiCompute(long r2, int r4) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r0
            int r0 = (int) r2
            int r0 = hashCodeAsciiSanitize(r0)
            r1 = 461845907(0x1b873593, float:2.2368498E-22)
            int r0 = r0 * r1
            int r4 = r4 + r0
            r0 = 2242545357458243584(0x1f1f1f1f00000000, double:8.854494059669966E-159)
            long r2 = r2 & r0
            r0 = 32
            long r2 = r2 >>> r0
            int r3 = (int) r2
            int r4 = r4 + r3
            return r4
    }

    static int hashCodeAsciiSanitize(byte r0) {
            r0 = r0 & 31
            return r0
    }

    static int hashCodeAsciiSanitize(int r1) {
            r0 = 522133279(0x1f1f1f1f, float:3.3695302E-20)
            r1 = r1 & r0
            return r1
    }

    static int hashCodeAsciiSanitize(short r0) {
            r0 = r0 & 7967(0x1f1f, float:1.1164E-41)
            return r0
    }

    static boolean isAndroid() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.IS_ANDROID
            return r0
    }

    private static boolean isAndroid0() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r2 = "Platform: Android"
            r1.debug(r2)
        L15:
            return r0
    }

    static boolean isExplicitNoUnsafe() {
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent0.EXPLICIT_NO_UNSAFE_CAUSE
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static boolean isExplicitTryReflectionSetAccessible() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE
            return r0
    }

    static boolean isUnaligned() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.UNALIGNED
            return r0
    }

    static boolean isZero(byte[] r18, int r19, int r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 1
            if (r2 > 0) goto La
            return r3
        La:
            long r4 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r6 = (long) r1
            long r4 = r4 + r6
            r6 = r2 & 7
            long r7 = (long) r6
            long r7 = r7 + r4
            r9 = 8
            long r11 = r4 - r9
            long r13 = (long) r2
            long r11 = r11 + r13
        L18:
            r2 = 0
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 < 0) goto L2c
            sun.misc.Unsafe r13 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r13 = r13.getLong(r0, r11)
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L2a
            return r2
        L2a:
            long r11 = r11 - r9
            goto L18
        L2c:
            r7 = 4
            if (r6 < r7) goto L3c
            int r6 = r6 + (-4)
            sun.misc.Unsafe r7 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r8 = (long) r6
            long r8 = r8 + r4
            int r7 = r7.getInt(r0, r8)
            if (r7 == 0) goto L3c
            return r2
        L3c:
            r7 = 2
            if (r6 < r7) goto L50
            sun.misc.Unsafe r8 = io.netty.util.internal.PlatformDependent0.UNSAFE
            char r4 = r8.getChar(r0, r4)
            if (r4 != 0) goto L4f
            if (r6 == r7) goto L4e
            int r1 = r1 + r7
            r0 = r0[r1]
            if (r0 != 0) goto L4f
        L4e:
            return r3
        L4f:
            return r2
        L50:
            r0 = r0[r1]
            if (r0 != 0) goto L55
            return r3
        L55:
            return r2
    }

    static int javaVersion() {
            int r0 = io.netty.util.internal.PlatformDependent0.JAVA_VERSION
            return r0
    }

    private static int javaVersion0() {
            boolean r0 = isAndroid0()
            if (r0 == 0) goto L8
            r0 = 6
            goto Lc
        L8:
            int r0 = majorVersionFromJavaSpecificationVersion()
        Lc:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent0.logger
            java.lang.String r2 = "Java version: {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.debug(r2, r3)
            return r0
    }

    static int majorVersion(java.lang.String r4) {
            java.lang.String r0 = "\\."
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r4.length
            if (r2 >= r3) goto L19
            r3 = r4[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L19:
            r4 = r0[r1]
            r1 = 1
            if (r4 != r1) goto L20
            r4 = r0[r1]
        L20:
            return r4
    }

    static int majorVersionFromJavaSpecificationVersion() {
            java.lang.String r0 = "java.specification.version"
            java.lang.String r1 = "1.6"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            int r0 = majorVersion(r0)
            return r0
    }

    static java.nio.ByteBuffer newDirectBuffer(long r2, int r4) {
            java.lang.String r0 = "capacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            java.lang.reflect.Constructor<?> r0 = io.netty.util.internal.PlatformDependent0.DIRECT_BUFFER_CONSTRUCTOR     // Catch: java.lang.Throwable -> L1f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1f
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r4[r1] = r2     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r4[r2] = r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.newInstance(r4)     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            r2 = move-exception
            boolean r3 = r2 instanceof java.lang.Error
            if (r3 == 0) goto L27
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L27:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>(r2)
            throw r3
    }

    static long objectFieldOffset(java.lang.reflect.Field r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r0 = r0.objectFieldOffset(r2)
            return r0
    }

    static void putByte(long r1, byte r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.putByte(r1, r3)
            return
    }

    static void putByte(byte[] r5, int r6, byte r7) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            r0.putByte(r5, r1, r7)
            return
    }

    static void putInt(long r1, int r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.putInt(r1, r3)
            return
    }

    static void putInt(byte[] r5, int r6, int r7) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            r0.putInt(r5, r1, r7)
            return
    }

    static void putLong(long r1, long r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.putLong(r1, r3)
            return
    }

    static void putLong(byte[] r6, int r7, long r8) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r7
            long r1 = r1 + r3
            r4 = r8
            r2 = r1
            r1 = r6
            r0.putLong(r1, r2, r4)
            return
    }

    static void putObject(java.lang.Object r1, long r2, java.lang.Object r4) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.putObject(r1, r2, r4)
            return
    }

    static void putShort(long r1, short r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r0.putShort(r1, r3)
            return
    }

    static void putShort(byte[] r5, int r6, short r7) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = io.netty.util.internal.PlatformDependent0.BYTE_ARRAY_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            r0.putShort(r5, r1, r7)
            return
    }

    static java.nio.ByteBuffer reallocateDirectNoCleaner(java.nio.ByteBuffer r5, int r6) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = directBufferAddress(r5)
            long r3 = (long) r6
            long r0 = r0.reallocateMemory(r1, r3)
            java.nio.ByteBuffer r5 = newDirectBuffer(r0, r6)
            return r5
    }

    static long reallocateMemory(long r1, long r3) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            long r1 = r0.reallocateMemory(r1, r3)
            return r1
    }

    static void setMemory(long r6, long r8, byte r10) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r1 = r6
            r3 = r8
            r5 = r10
            r0.setMemory(r1, r3, r5)
            return
    }

    static void setMemory(java.lang.Object r7, long r8, long r10, byte r12) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r12
            r0.setMemory(r1, r2, r4, r6)
            return
    }

    static void throwException(java.lang.Throwable r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.PlatformDependent0.UNSAFE
            java.lang.String r1 = "cause"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.throwException(r2)
            return
    }

    static boolean unalignedAccess() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.UNALIGNED
            return r0
    }
}
