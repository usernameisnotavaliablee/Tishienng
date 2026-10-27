package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class PlatformDependent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADDRESS_SIZE = 0;
    public static final boolean BIG_ENDIAN_NATIVE_ORDER = false;
    private static final int BIT_MODE = 0;
    private static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final boolean CAN_ENABLE_TCP_NODELAY_BY_DEFAULT = false;
    private static final io.netty.util.internal.Cleaner CLEANER = null;
    private static final boolean DIRECT_BUFFER_PREFERRED = false;
    private static final java.util.concurrent.atomic.AtomicLong DIRECT_MEMORY_COUNTER = null;
    private static final long DIRECT_MEMORY_LIMIT = 0;
    private static final boolean IS_IVKVM_DOT_NET = false;
    private static final boolean IS_J9_JVM = false;
    private static final boolean IS_OSX = false;
    private static final boolean IS_WINDOWS = false;
    private static final int MAX_ALLOWED_MPSC_CAPACITY = 1073741824;
    private static final long MAX_DIRECT_MEMORY = 0;
    private static final java.util.regex.Pattern MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN = null;
    private static final boolean MAYBE_SUPER_USER = false;
    private static final int MIN_MAX_MPSC_CAPACITY = 2048;
    private static final int MPSC_CHUNK_SIZE = 1024;
    private static final io.netty.util.internal.Cleaner NOOP = null;
    private static final java.lang.String NORMALIZED_ARCH = null;
    private static final java.lang.String NORMALIZED_OS = null;
    private static final io.netty.util.internal.PlatformDependent.ThreadLocalRandomProvider RANDOM_PROVIDER = null;
    private static final java.io.File TMPDIR = null;
    private static final int UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD = 0;
    private static final java.lang.Throwable UNSAFE_UNAVAILABILITY_CAUSE = null;
    private static final boolean USE_DIRECT_BUFFER_NO_CLEANER = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AtomicLongCounter extends java.util.concurrent.atomic.AtomicLong implements io.netty.util.internal.LongCounter {
        private static final long serialVersionUID = 4074772784610639305L;

        private AtomicLongCounter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AtomicLongCounter(io.netty.util.internal.PlatformDependent.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.util.internal.LongCounter
        public void add(long r1) {
                r0 = this;
                r0.addAndGet(r1)
                return
        }

        @Override // io.netty.util.internal.LongCounter
        public void decrement() {
                r0 = this;
                r0.decrementAndGet()
                return
        }

        @Override // io.netty.util.internal.LongCounter
        public void increment() {
                r0 = this;
                r0.incrementAndGet()
                return
        }

        @Override // io.netty.util.internal.LongCounter
        public long value() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Mpsc {
        private static final boolean USE_MPSC_CHUNKED_ARRAY_QUEUE = false;


        static {
                boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
                if (r0 == 0) goto L10
                io.netty.util.internal.PlatformDependent$Mpsc$1 r0 = new io.netty.util.internal.PlatformDependent$Mpsc$1
                r0.<init>()
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L11
            L10:
                r0 = 0
            L11:
                if (r0 != 0) goto L20
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.access$100()
                java.lang.String r1 = "org.jctools-core.MpscChunkedArrayQueue: unavailable"
                r0.debug(r1)
                r0 = 0
                io.netty.util.internal.PlatformDependent.Mpsc.USE_MPSC_CHUNKED_ARRAY_QUEUE = r0
                return
            L20:
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.access$100()
                java.lang.String r1 = "org.jctools-core.MpscChunkedArrayQueue: available"
                r0.debug(r1)
                r0 = 1
                io.netty.util.internal.PlatformDependent.Mpsc.USE_MPSC_CHUNKED_ARRAY_QUEUE = r0
                return
        }

        private Mpsc() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> java.util.Queue<T> newMpscQueue() {
                boolean r0 = io.netty.util.internal.PlatformDependent.Mpsc.USE_MPSC_CHUNKED_ARRAY_QUEUE
                r1 = 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto Lc
                io.netty.util.internal.shaded.org.jctools.queues.MpscUnboundedArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.MpscUnboundedArrayQueue
                r0.<init>(r1)
                return r0
            Lc:
                io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscUnboundedAtomicArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscUnboundedAtomicArrayQueue
                r0.<init>(r1)
                return r0
        }

        static <T> java.util.Queue<T> newMpscQueue(int r2) {
                r0 = 1073741824(0x40000000, float:2.0)
                int r2 = java.lang.Math.min(r2, r0)
                r0 = 2048(0x800, float:2.87E-42)
                int r2 = java.lang.Math.max(r2, r0)
                boolean r0 = io.netty.util.internal.PlatformDependent.Mpsc.USE_MPSC_CHUNKED_ARRAY_QUEUE
                r1 = 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L18
                io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue
                r0.<init>(r1, r2)
                return r0
            L18:
                io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscGrowableAtomicArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscGrowableAtomicArrayQueue
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface ThreadLocalRandomProvider {
        java.util.Random current();
    }

    static {
            java.lang.Class<io.netty.util.internal.PlatformDependent> r0 = io.netty.util.internal.PlatformDependent.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.PlatformDependent.logger = r0
            java.lang.String r1 = "\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            io.netty.util.internal.PlatformDependent.MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN = r1
            boolean r1 = isWindows0()
            io.netty.util.internal.PlatformDependent.IS_WINDOWS = r1
            boolean r1 = isOsx0()
            io.netty.util.internal.PlatformDependent.IS_OSX = r1
            boolean r1 = isJ9Jvm0()
            io.netty.util.internal.PlatformDependent.IS_J9_JVM = r1
            boolean r1 = isIkvmDotNet0()
            io.netty.util.internal.PlatformDependent.IS_IVKVM_DOT_NET = r1
            boolean r1 = isAndroid()
            r2 = 1
            r1 = r1 ^ r2
            io.netty.util.internal.PlatformDependent.CAN_ENABLE_TCP_NODELAY_BY_DEFAULT = r1
            java.lang.Throwable r1 = unsafeUnavailabilityCause0()
            io.netty.util.internal.PlatformDependent.UNSAFE_UNAVAILABILITY_CAUSE = r1
            long r3 = maxDirectMemory0()
            io.netty.util.internal.PlatformDependent.MAX_DIRECT_MEMORY = r3
            long r5 = byteArrayBaseOffset0()
            io.netty.util.internal.PlatformDependent.BYTE_ARRAY_BASE_OFFSET = r5
            java.io.File r1 = tmpdir0()
            io.netty.util.internal.PlatformDependent.TMPDIR = r1
            int r1 = bitMode0()
            io.netty.util.internal.PlatformDependent.BIT_MODE = r1
            java.lang.String r1 = "os.arch"
            java.lang.String r5 = ""
            java.lang.String r1 = io.netty.util.internal.SystemPropertyUtil.get(r1, r5)
            java.lang.String r1 = normalizeArch(r1)
            io.netty.util.internal.PlatformDependent.NORMALIZED_ARCH = r1
            java.lang.String r1 = "os.name"
            java.lang.String r1 = io.netty.util.internal.SystemPropertyUtil.get(r1, r5)
            java.lang.String r1 = normalizeOs(r1)
            io.netty.util.internal.PlatformDependent.NORMALIZED_OS = r1
            int r1 = addressSize0()
            io.netty.util.internal.PlatformDependent.ADDRESS_SIZE = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r6 = 0
            if (r1 != r5) goto L79
            r1 = 1
            goto L7a
        L79:
            r1 = 0
        L7a:
            io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER = r1
            io.netty.util.internal.PlatformDependent$1 r1 = new io.netty.util.internal.PlatformDependent$1
            r1.<init>()
            io.netty.util.internal.PlatformDependent.NOOP = r1
            int r5 = javaVersion()
            r7 = 7
            if (r5 < r7) goto L92
            io.netty.util.internal.PlatformDependent$2 r5 = new io.netty.util.internal.PlatformDependent$2
            r5.<init>()
            io.netty.util.internal.PlatformDependent.RANDOM_PROVIDER = r5
            goto L99
        L92:
            io.netty.util.internal.PlatformDependent$3 r5 = new io.netty.util.internal.PlatformDependent$3
            r5.<init>()
            io.netty.util.internal.PlatformDependent.RANDOM_PROVIDER = r5
        L99:
            java.lang.String r5 = "io.netty.maxDirectMemory"
            r7 = -1
            long r7 = io.netty.util.internal.SystemPropertyUtil.getLong(r5, r7)
            r5 = 0
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto Ld1
            boolean r12 = hasUnsafe()
            if (r12 == 0) goto Ld1
            boolean r12 = io.netty.util.internal.PlatformDependent0.hasDirectBufferNoCleanerConstructor()
            if (r12 != 0) goto Lb5
            goto Ld1
        Lb5:
            io.netty.util.internal.PlatformDependent.USE_DIRECT_BUFFER_NO_CLEANER = r2
            if (r11 >= 0) goto Lc9
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 > 0) goto Lc0
            io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER = r5
            goto Lc7
        Lc0:
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            r5.<init>()
            io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER = r5
        Lc7:
            r7 = r3
            goto Ld5
        Lc9:
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            r5.<init>()
            io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER = r5
            goto Ld5
        Ld1:
            io.netty.util.internal.PlatformDependent.USE_DIRECT_BUFFER_NO_CLEANER = r6
            io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER = r5
        Ld5:
            java.lang.String r5 = "-Dio.netty.maxDirectMemory: {} bytes"
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            r0.debug(r5, r9)
            r9 = 1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto Le5
            r3 = r7
        Le5:
            io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_LIMIT = r3
            java.lang.String r3 = "io.netty.uninitializedArrayAllocationThreshold"
            r4 = 1024(0x400, float:1.435E-42)
            int r3 = io.netty.util.internal.SystemPropertyUtil.getInt(r3, r4)
            int r4 = javaVersion()
            r5 = 9
            if (r4 < r5) goto Lfe
            boolean r4 = io.netty.util.internal.PlatformDependent0.hasAllocateArrayMethod()
            if (r4 == 0) goto Lfe
            goto Lff
        Lfe:
            r3 = -1
        Lff:
            io.netty.util.internal.PlatformDependent.UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD = r3
            java.lang.String r4 = "-Dio.netty.uninitializedArrayAllocationThreshold: {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.debug(r4, r3)
            boolean r3 = maybeSuperUser0()
            io.netty.util.internal.PlatformDependent.MAYBE_SUPER_USER = r3
            boolean r3 = isAndroid()
            if (r3 != 0) goto L13c
            int r3 = javaVersion()
            if (r3 < r5) goto L12c
            boolean r3 = io.netty.util.internal.CleanerJava9.isSupported()
            if (r3 == 0) goto L128
            io.netty.util.internal.CleanerJava9 r3 = new io.netty.util.internal.CleanerJava9
            r3.<init>()
            goto L129
        L128:
            r3 = r1
        L129:
            io.netty.util.internal.PlatformDependent.CLEANER = r3
            goto L13e
        L12c:
            boolean r3 = io.netty.util.internal.CleanerJava6.isSupported()
            if (r3 == 0) goto L138
            io.netty.util.internal.CleanerJava6 r3 = new io.netty.util.internal.CleanerJava6
            r3.<init>()
            goto L139
        L138:
            r3 = r1
        L139:
            io.netty.util.internal.PlatformDependent.CLEANER = r3
            goto L13e
        L13c:
            io.netty.util.internal.PlatformDependent.CLEANER = r1
        L13e:
            io.netty.util.internal.Cleaner r3 = io.netty.util.internal.PlatformDependent.CLEANER
            if (r3 == r1) goto L14b
            java.lang.String r4 = "io.netty.noPreferDirect"
            boolean r4 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r4, r6)
            if (r4 != 0) goto L14b
            r6 = 1
        L14b:
            io.netty.util.internal.PlatformDependent.DIRECT_BUFFER_PREFERRED = r6
            boolean r4 = r0.isDebugEnabled()
            if (r4 == 0) goto L15d
            r2 = r2 ^ r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "-Dio.netty.noPreferDirect: {}"
            r0.debug(r4, r2)
        L15d:
            if (r3 != r1) goto L16a
            boolean r1 = io.netty.util.internal.PlatformDependent0.isExplicitNoUnsafe()
            if (r1 != 0) goto L16a
            java.lang.String r1 = "Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system instability."
            r0.info(r1)
        L16a:
            return
    }

    private PlatformDependent() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$100() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger
            return r0
    }

    public static int addressSize() {
            int r0 = io.netty.util.internal.PlatformDependent.ADDRESS_SIZE
            return r0
    }

    private static int addressSize0() {
            boolean r0 = hasUnsafe()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = io.netty.util.internal.PlatformDependent0.addressSize()
            return r0
    }

    public static java.nio.ByteBuffer allocateDirectNoCleaner(int r1) {
            incrementMemoryCounter(r1)
            java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent0.allocateDirectNoCleaner(r1)     // Catch: java.lang.Throwable -> L8
            return r1
        L8:
            r0 = move-exception
            decrementMemoryCounter(r1)
            throwException(r0)
            r1 = 0
            return r1
    }

    public static long allocateMemory(long r0) {
            long r0 = io.netty.util.internal.PlatformDependent0.allocateMemory(r0)
            return r0
    }

    public static byte[] allocateUninitializedArray(int r1) {
            int r0 = io.netty.util.internal.PlatformDependent.UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD
            if (r0 < 0) goto Lc
            if (r0 <= r1) goto L7
            goto Lc
        L7:
            byte[] r1 = io.netty.util.internal.PlatformDependent0.allocateUninitializedArray(r1)
            return r1
        Lc:
            byte[] r1 = new byte[r1]
            return r1
    }

    public static int bitMode() {
            int r0 = io.netty.util.internal.PlatformDependent.BIT_MODE
            return r0
    }

    private static int bitMode0() {
            java.lang.String r0 = "io.netty.bitMode"
            r1 = 0
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            if (r0 <= 0) goto L15
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "-Dio.netty.bitMode: {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.debug(r2, r3)
            return r0
        L15:
            java.lang.String r0 = "sun.arch.data.model"
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            if (r0 <= 0) goto L29
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "-Dio.netty.bitMode: {} (sun.arch.data.model)"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.debug(r2, r3)
            return r0
        L29:
            java.lang.String r0 = "com.ibm.vm.bitmode"
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            if (r0 <= 0) goto L3d
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "-Dio.netty.bitMode: {} (com.ibm.vm.bitmode)"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.debug(r2, r3)
            return r0
        L3d:
            java.lang.String r1 = "os.arch"
            java.lang.String r2 = ""
            java.lang.String r1 = io.netty.util.internal.SystemPropertyUtil.get(r1, r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r1 = r1.trim()
            java.lang.String r4 = "amd64"
            boolean r4 = r4.equals(r1)
            r5 = 64
            if (r4 != 0) goto L85
            java.lang.String r4 = "x86_64"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L62
            goto L85
        L62:
            java.lang.String r4 = "i386"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L82
            java.lang.String r4 = "i486"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L82
            java.lang.String r4 = "i586"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L82
            java.lang.String r4 = "i686"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L87
        L82:
            r0 = 32
            goto L87
        L85:
            r0 = 64
        L87:
            if (r0 <= 0) goto L94
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r6 = "-Dio.netty.bitMode: {} (os.arch: {})"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.debug(r6, r0, r1)
        L94:
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r2)
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r1 = "([1-9][0-9]+)-?bit"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto Lb8
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        Lb8:
            return r5
    }

    private static long byteArrayBaseOffset0() {
            boolean r0 = hasUnsafe()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            long r0 = io.netty.util.internal.PlatformDependent0.byteArrayBaseOffset()
            return r0
    }

    public static boolean canEnableTcpNoDelayByDefault() {
            boolean r0 = io.netty.util.internal.PlatformDependent.CAN_ENABLE_TCP_NODELAY_BY_DEFAULT
            return r0
    }

    public static void copyMemory(long r0, long r2, long r4) {
            io.netty.util.internal.PlatformDependent0.copyMemory(r0, r2, r4)
            return
    }

    public static void copyMemory(long r12, byte[] r14, int r15, long r16) {
            long r0 = io.netty.util.internal.PlatformDependent.BYTE_ARRAY_BASE_OFFSET
            long r2 = (long) r15
            long r8 = r0 + r2
            r4 = 0
            r5 = r12
            r7 = r14
            r10 = r16
            io.netty.util.internal.PlatformDependent0.copyMemory(r4, r5, r7, r8, r10)
            return
    }

    public static void copyMemory(byte[] r12, int r13, long r14, long r16) {
            long r0 = io.netty.util.internal.PlatformDependent.BYTE_ARRAY_BASE_OFFSET
            long r2 = (long) r13
            long r5 = r0 + r2
            r7 = 0
            r4 = r12
            r8 = r14
            r10 = r16
            io.netty.util.internal.PlatformDependent0.copyMemory(r4, r5, r7, r8, r10)
            return
    }

    private static void decrementMemoryCounter(int r3) {
            java.util.concurrent.atomic.AtomicLong r0 = io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER
            if (r0 == 0) goto L9
            int r3 = -r3
            long r1 = (long) r3
            r0.addAndGet(r1)
        L9:
            return
    }

    public static java.nio.ByteBuffer directBuffer(long r1, int r3) {
            boolean r0 = io.netty.util.internal.PlatformDependent0.hasDirectBufferNoCleanerConstructor()
            if (r0 == 0) goto Lb
            java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent0.newDirectBuffer(r1, r3)
            return r1
        Lb:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available"
            r1.<init>(r2)
            throw r1
    }

    public static long directBufferAddress(java.nio.ByteBuffer r2) {
            long r0 = io.netty.util.internal.PlatformDependent0.directBufferAddress(r2)
            return r0
    }

    public static boolean directBufferPreferred() {
            boolean r0 = io.netty.util.internal.PlatformDependent.DIRECT_BUFFER_PREFERRED
            return r0
    }

    public static boolean equals(byte[] r1, int r2, byte[] r3, int r4, int r5) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent0.unalignedAccess()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            boolean r1 = io.netty.util.internal.PlatformDependent0.equals(r1, r2, r3, r4, r5)
            return r1
        L12:
            boolean r1 = equalsSafe(r1, r2, r3, r4, r5)
            return r1
    }

    public static int equalsConstantTime(byte[] r1, int r2, byte[] r3, int r4, int r5) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent0.unalignedAccess()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            int r1 = io.netty.util.internal.PlatformDependent0.equalsConstantTime(r1, r2, r3, r4, r5)
            return r1
        L12:
            int r1 = io.netty.util.internal.ConstantTimeUtils.equalsConstantTime(r1, r2, r3, r4, r5)
            return r1
    }

    private static boolean equalsSafe(byte[] r2, int r3, byte[] r4, int r5, int r6) {
            int r6 = r6 + r3
        L1:
            if (r3 >= r6) goto L10
            r0 = r2[r3]
            r1 = r4[r5]
            if (r0 == r1) goto Lb
            r2 = 0
            return r2
        Lb:
            int r3 = r3 + 1
            int r5 = r5 + 1
            goto L1
        L10:
            r2 = 1
            return r2
    }

    public static void freeDirectBuffer(java.nio.ByteBuffer r1) {
            io.netty.util.internal.Cleaner r0 = io.netty.util.internal.PlatformDependent.CLEANER
            r0.freeDirectBuffer(r1)
            return
    }

    public static void freeDirectNoCleaner(java.nio.ByteBuffer r3) {
            int r0 = r3.capacity()
            long r1 = io.netty.util.internal.PlatformDependent0.directBufferAddress(r3)
            io.netty.util.internal.PlatformDependent0.freeMemory(r1)
            decrementMemoryCounter(r0)
            return
    }

    public static void freeMemory(long r0) {
            io.netty.util.internal.PlatformDependent0.freeMemory(r0)
            return
    }

    public static byte getByte(long r0) {
            byte r0 = io.netty.util.internal.PlatformDependent0.getByte(r0)
            return r0
    }

    public static byte getByte(byte[] r0, int r1) {
            byte r0 = io.netty.util.internal.PlatformDependent0.getByte(r0, r1)
            return r0
    }

    public static java.lang.ClassLoader getClassLoader(java.lang.Class<?> r0) {
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent0.getClassLoader(r0)
            return r0
    }

    public static java.lang.ClassLoader getContextClassLoader() {
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent0.getContextClassLoader()
            return r0
    }

    public static int getInt(long r0) {
            int r0 = io.netty.util.internal.PlatformDependent0.getInt(r0)
            return r0
    }

    public static int getInt(java.lang.Object r0, long r1) {
            int r0 = io.netty.util.internal.PlatformDependent0.getInt(r0, r1)
            return r0
    }

    public static int getInt(byte[] r0, int r1) {
            int r0 = io.netty.util.internal.PlatformDependent0.getInt(r0, r1)
            return r0
    }

    private static int getIntSafe(byte[] r2, int r3) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L22
            r0 = r2[r3]
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L20:
            r2 = r2 | r0
            return r2
        L22:
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            int r2 = r2 << 24
            goto L20
    }

    public static long getLong(long r0) {
            long r0 = io.netty.util.internal.PlatformDependent0.getLong(r0)
            return r0
    }

    public static long getLong(byte[] r0, int r1) {
            long r0 = io.netty.util.internal.PlatformDependent0.getLong(r0, r1)
            return r0
    }

    private static long getLongSafe(byte[] r14, int r15) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            r1 = 8
            r2 = 16
            r3 = 24
            r4 = 32
            r5 = 40
            r6 = 48
            r7 = 56
            r8 = 255(0xff, double:1.26E-321)
            if (r0 == 0) goto L54
            r0 = r14[r15]
            long r10 = (long) r0
            long r10 = r10 << r7
            int r0 = r15 + 1
            r0 = r14[r0]
            long r12 = (long) r0
            long r12 = r12 & r8
            long r6 = r12 << r6
            long r6 = r6 | r10
            int r0 = r15 + 2
            r0 = r14[r0]
            long r10 = (long) r0
            long r10 = r10 & r8
            long r10 = r10 << r5
            long r6 = r6 | r10
            int r0 = r15 + 3
            r0 = r14[r0]
            long r10 = (long) r0
            long r10 = r10 & r8
            long r4 = r10 << r4
            long r4 = r4 | r6
            int r0 = r15 + 4
            r0 = r14[r0]
            long r6 = (long) r0
            long r6 = r6 & r8
            long r6 = r6 << r3
            long r4 = r4 | r6
            int r0 = r15 + 5
            r0 = r14[r0]
            long r6 = (long) r0
            long r6 = r6 & r8
            long r2 = r6 << r2
            long r2 = r2 | r4
            int r0 = r15 + 6
            r0 = r14[r0]
            long r4 = (long) r0
            long r4 = r4 & r8
            long r0 = r4 << r1
            long r0 = r0 | r2
            int r15 = r15 + 7
            r14 = r14[r15]
            long r14 = (long) r14
            long r14 = r14 & r8
        L52:
            long r14 = r14 | r0
            return r14
        L54:
            r0 = r14[r15]
            long r10 = (long) r0
            long r10 = r10 & r8
            int r0 = r15 + 1
            r0 = r14[r0]
            long r12 = (long) r0
            long r12 = r12 & r8
            long r0 = r12 << r1
            long r0 = r0 | r10
            int r10 = r15 + 2
            r10 = r14[r10]
            long r10 = (long) r10
            long r10 = r10 & r8
            long r10 = r10 << r2
            long r0 = r0 | r10
            int r2 = r15 + 3
            r2 = r14[r2]
            long r10 = (long) r2
            long r10 = r10 & r8
            long r2 = r10 << r3
            long r0 = r0 | r2
            int r2 = r15 + 4
            r2 = r14[r2]
            long r2 = (long) r2
            long r2 = r2 & r8
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r15 + 5
            r2 = r14[r2]
            long r2 = (long) r2
            long r2 = r2 & r8
            long r2 = r2 << r5
            long r0 = r0 | r2
            int r2 = r15 + 6
            r2 = r14[r2]
            long r2 = (long) r2
            long r2 = r2 & r8
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r15 = r15 + 7
            r14 = r14[r15]
            long r14 = (long) r14
            long r14 = r14 << r7
            goto L52
    }

    public static java.lang.Object getObject(java.lang.Object r0, long r1) {
            java.lang.Object r0 = io.netty.util.internal.PlatformDependent0.getObject(r0, r1)
            return r0
    }

    public static short getShort(long r0) {
            short r0 = io.netty.util.internal.PlatformDependent0.getShort(r0)
            return r0
    }

    public static short getShort(byte[] r0, int r1) {
            short r0 = io.netty.util.internal.PlatformDependent0.getShort(r0, r1)
            return r0
    }

    private static short getShortSafe(byte[] r1, int r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L11
            r0 = r1[r2]
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
        Le:
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
        L11:
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 << 8
            goto Le
    }

    public static java.lang.ClassLoader getSystemClassLoader() {
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent0.getSystemClassLoader()
            return r0
    }

    public static java.lang.Throwable getUnsafeUnavailabilityCause() {
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent.UNSAFE_UNAVAILABILITY_CAUSE
            return r0
    }

    public static boolean hasDirectBufferNoCleanerConstructor() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.hasDirectBufferNoCleanerConstructor()
            return r0
    }

    public static boolean hasUnsafe() {
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent.UNSAFE_UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static int hashCodeAscii(java.lang.CharSequence r9) {
            int r0 = r9.length()
            r1 = r0 & 7
            r2 = 32
            r3 = 8
            r4 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            if (r0 < r2) goto L19
            int r0 = r0 - r3
        L10:
            if (r0 < r1) goto L34
            int r4 = hashCodeAsciiCompute(r9, r0, r4)
            int r0 = r0 + (-8)
            goto L10
        L19:
            if (r0 < r3) goto L34
            int r2 = r0 + (-8)
            int r4 = hashCodeAsciiCompute(r9, r2, r4)
            r2 = 16
            if (r0 < r2) goto L34
            int r2 = r0 + (-16)
            int r4 = hashCodeAsciiCompute(r9, r2, r4)
            r2 = 24
            if (r0 < r2) goto L34
            int r0 = r0 - r2
            int r4 = hashCodeAsciiCompute(r9, r0, r4)
        L34:
            if (r1 != 0) goto L37
            return r4
        L37:
            r0 = 2
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r5 = 4
            if (r1 == r5) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            r0 = r0 & r6
            r6 = 6
            if (r1 == r6) goto L4b
            r6 = 1
            goto L4c
        L4b:
            r6 = 0
        L4c:
            r0 = r0 & r6
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            if (r0 == 0) goto L5f
            int r4 = r4 * r6
            char r0 = r9.charAt(r3)
            int r0 = hashCodeAsciiSanitizeByte(r0)
            int r4 = r4 + r0
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r1 == r2) goto L64
            r7 = 1
            goto L65
        L64:
            r7 = 0
        L65:
            if (r1 == r5) goto L69
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            r7 = r7 & r8
            r8 = 5
            if (r1 == r8) goto L70
            r8 = 1
            goto L71
        L70:
            r8 = 0
        L71:
            r7 = r7 & r8
            r8 = 461845907(0x1b873593, float:2.2368498E-22)
            if (r7 == 0) goto L8d
            if (r0 != 0) goto L7d
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            goto L80
        L7d:
            r7 = 461845907(0x1b873593, float:2.2368498E-22)
        L80:
            int r4 = r4 * r7
            int r7 = hashCodeAsciiSanitizeShort(r9, r0)
            int r7 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r7)
            int r4 = r4 + r7
            int r0 = r0 + 2
        L8d:
            if (r1 < r5) goto La7
            if (r0 != 0) goto L93
            r1 = 1
            goto L94
        L93:
            r1 = 0
        L94:
            r5 = 3
            if (r0 != r5) goto L98
            goto L99
        L98:
            r2 = 0
        L99:
            r1 = r1 | r2
            if (r1 == 0) goto L9d
            goto La0
        L9d:
            r6 = 461845907(0x1b873593, float:2.2368498E-22)
        La0:
            int r4 = r4 * r6
            int r9 = hashCodeAsciiSanitizeInt(r9, r0)
            int r4 = r4 + r9
        La7:
            return r4
    }

    public static int hashCodeAscii(byte[] r1, int r2, int r3) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent0.unalignedAccess()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            int r1 = io.netty.util.internal.PlatformDependent0.hashCodeAscii(r1, r2, r3)
            return r1
        L12:
            int r1 = hashCodeAsciiSafe(r1, r2, r3)
            return r1
    }

    private static int hashCodeAsciiCompute(java.lang.CharSequence r3, int r4, int r5) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            r1 = 461845907(0x1b873593, float:2.2368498E-22)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            if (r0 == 0) goto L1b
            int r5 = r5 * r2
            int r0 = r4 + 4
            int r0 = hashCodeAsciiSanitizeInt(r3, r0)
            int r0 = r0 * r1
            int r5 = r5 + r0
            int r3 = hashCodeAsciiSanitizeInt(r3, r4)
        L19:
            int r5 = r5 + r3
            return r5
        L1b:
            int r5 = r5 * r2
            int r0 = hashCodeAsciiSanitizeInt(r3, r4)
            int r0 = r0 * r1
            int r5 = r5 + r0
            int r4 = r4 + 4
            int r3 = hashCodeAsciiSanitizeInt(r3, r4)
            goto L19
    }

    static int hashCodeAsciiSafe(byte[] r5, int r6, int r7) {
            r0 = r7 & 7
            int r1 = r6 + r0
            int r2 = r6 + (-8)
            int r2 = r2 + r7
            r7 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
        La:
            if (r2 < r1) goto L17
            long r3 = getLongSafe(r5, r2)
            int r7 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiCompute(r3, r7)
            int r2 = r2 + (-8)
            goto La
        L17:
            r1 = 461845907(0x1b873593, float:2.2368498E-22)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            switch(r0) {
                case 1: goto L9f;
                case 2: goto L94;
                case 3: goto L7e;
                case 4: goto L73;
                case 5: goto L5d;
                case 6: goto L45;
                case 7: goto L21;
                default: goto L20;
            }
        L20:
            return r7
        L21:
            int r7 = r7 * r2
            r0 = r5[r6]
            int r0 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r0)
            int r7 = r7 + r0
            int r7 = r7 * r1
            int r0 = r6 + 1
            short r0 = getShortSafe(r5, r0)
            int r0 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r0)
            int r7 = r7 + r0
            int r7 = r7 * r2
            int r6 = r6 + 3
            int r5 = getIntSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
        L43:
            int r7 = r7 + r5
            return r7
        L45:
            int r7 = r7 * r2
            short r0 = getShortSafe(r5, r6)
            int r0 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r0)
            int r7 = r7 + r0
            int r7 = r7 * r1
            int r6 = r6 + 2
            int r5 = getIntSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
        L5d:
            int r7 = r7 * r2
            r0 = r5[r6]
            int r0 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r0)
            int r7 = r7 + r0
            int r7 = r7 * r1
            int r6 = r6 + 1
            int r5 = getIntSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
        L73:
            int r7 = r7 * r2
            int r5 = getIntSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
        L7e:
            int r7 = r7 * r2
            r0 = r5[r6]
            int r0 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r0)
            int r7 = r7 + r0
            int r7 = r7 * r1
            int r6 = r6 + 1
            short r5 = getShortSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
        L94:
            int r7 = r7 * r2
            short r5 = getShortSafe(r5, r6)
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
        L9f:
            int r7 = r7 * r2
            r5 = r5[r6]
            int r5 = io.netty.util.internal.PlatformDependent0.hashCodeAsciiSanitize(r5)
            goto L43
    }

    private static int hashCodeAsciiSanitizeByte(char r0) {
            r0 = r0 & 31
            return r0
    }

    private static int hashCodeAsciiSanitizeInt(java.lang.CharSequence r2, int r3) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L2c
            int r0 = r3 + 3
            char r0 = r2.charAt(r0)
            r0 = r0 & 31
            int r1 = r3 + 2
            char r1 = r2.charAt(r1)
            r1 = r1 & 31
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 1
            char r1 = r2.charAt(r1)
            r1 = r1 & 31
            int r1 = r1 << 16
            r0 = r0 | r1
            char r2 = r2.charAt(r3)
            r2 = r2 & 31
            int r2 = r2 << 24
        L2a:
            r2 = r2 | r0
            return r2
        L2c:
            int r0 = r3 + 3
            char r0 = r2.charAt(r0)
            r0 = r0 & 31
            int r0 = r0 << 24
            int r1 = r3 + 2
            char r1 = r2.charAt(r1)
            r1 = r1 & 31
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 1
            char r1 = r2.charAt(r1)
            r1 = r1 & 31
            int r1 = r1 << 8
            r0 = r0 | r1
            char r2 = r2.charAt(r3)
            r2 = r2 & 31
            goto L2a
    }

    private static int hashCodeAsciiSanitizeShort(java.lang.CharSequence r1, int r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L16
            int r0 = r2 + 1
            char r0 = r1.charAt(r0)
            r0 = r0 & 31
            char r1 = r1.charAt(r2)
            r1 = r1 & 31
            int r1 = r1 << 8
        L14:
            r1 = r1 | r0
            return r1
        L16:
            int r0 = r2 + 1
            char r0 = r1.charAt(r0)
            r0 = r0 & 31
            int r0 = r0 << 8
            char r1 = r1.charAt(r2)
            r1 = r1 & 31
            goto L14
    }

    private static void incrementMemoryCounter(int r9) {
            java.util.concurrent.atomic.AtomicLong r0 = io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER
            if (r0 == 0) goto L42
            long r1 = (long) r9
            long r3 = r0.addAndGet(r1)
            long r5 = io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_LIMIT
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L10
            goto L42
        L10:
            int r7 = -r9
            long r7 = (long) r7
            r0.addAndGet(r7)
            io.netty.util.internal.OutOfDirectMemoryError r0 = new io.netty.util.internal.OutOfDirectMemoryError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "failed to allocate "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r9 = " byte(s) of direct memory (used: "
            r7.append(r9)
            long r3 = r3 - r1
            r7.append(r3)
            java.lang.String r9 = ", max: "
            r7.append(r9)
            r7.append(r5)
            r9 = 41
            r7.append(r9)
            java.lang.String r9 = r7.toString()
            r0.<init>(r9)
            throw r0
        L42:
            return
    }

    public static boolean isAndroid() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.isAndroid()
            return r0
    }

    public static boolean isIkvmDotNet() {
            boolean r0 = io.netty.util.internal.PlatformDependent.IS_IVKVM_DOT_NET
            return r0
    }

    private static boolean isIkvmDotNet0() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = ""
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "IKVM.NET"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isJ9Jvm() {
            boolean r0 = io.netty.util.internal.PlatformDependent.IS_J9_JVM
            return r0
    }

    private static boolean isJ9Jvm0() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = ""
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "ibm j9"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L1f
            java.lang.String r1 = "eclipse openj9"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            return r0
        L1f:
            r0 = 1
            return r0
    }

    public static boolean isOsx() {
            boolean r0 = io.netty.util.internal.PlatformDependent.IS_OSX
            return r0
    }

    private static boolean isOsx0() {
            java.lang.String r0 = "os.name"
            java.lang.String r1 = ""
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "[^a-z0-9]+"
            java.lang.String r0 = r0.replaceAll(r2, r1)
            java.lang.String r1 = "macosx"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = "osx"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            goto L27
        L25:
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L31
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "Platform: MacOS"
            r1.debug(r2)
        L31:
            return r0
    }

    public static boolean isUnaligned() {
            boolean r0 = io.netty.util.internal.PlatformDependent0.isUnaligned()
            return r0
    }

    public static boolean isWindows() {
            boolean r0 = io.netty.util.internal.PlatformDependent.IS_WINDOWS
            return r0
    }

    private static boolean isWindows0() {
            java.lang.String r0 = "os.name"
            java.lang.String r1 = ""
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "win"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "Platform: Windows"
            r1.debug(r2)
        L1d:
            return r0
    }

    public static boolean isZero(byte[] r1, int r2, int r3) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent0.unalignedAccess()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            boolean r1 = io.netty.util.internal.PlatformDependent0.isZero(r1, r2, r3)
            return r1
        L12:
            boolean r1 = isZeroSafe(r1, r2, r3)
            return r1
    }

    private static boolean isZeroSafe(byte[] r1, int r2, int r3) {
            int r3 = r3 + r2
        L1:
            if (r2 >= r3) goto Lc
            r0 = r1[r2]
            if (r0 == 0) goto L9
            r1 = 0
            return r1
        L9:
            int r2 = r2 + 1
            goto L1
        Lc:
            r1 = 1
            return r1
    }

    public static int javaVersion() {
            int r0 = io.netty.util.internal.PlatformDependent0.javaVersion()
            return r0
    }

    public static long maxDirectMemory() {
            long r0 = io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_LIMIT
            return r0
    }

    private static long maxDirectMemory0() {
            r0 = 1
            r1 = 0
            r3 = 0
            java.lang.ClassLoader r4 = getSystemClassLoader()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "java.vm.name"
            java.lang.String r6 = ""
            java.lang.String r5 = io.netty.util.internal.SystemPropertyUtil.get(r5, r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "ibm j9"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L3b
            if (r6 != 0) goto L3f
            java.lang.String r6 = "eclipse openj9"
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L3f
            java.lang.String r5 = "sun.misc.VM"
            java.lang.Class r5 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "maxDirectMemory"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r5.invoke(r3, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L3b
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            goto L3f
        L3d:
            r4 = r3
        L3f:
            r5 = r1
        L40:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L45
            return r5
        L45:
            java.lang.String r7 = "java.lang.management.ManagementFactory"
            java.lang.Class r7 = java.lang.Class.forName(r7, r0, r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "java.lang.management.RuntimeMXBean"
            java.lang.Class r4 = java.lang.Class.forName(r8, r0, r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "getRuntimeMXBean"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r7 = r7.invoke(r3, r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "getInputArguments"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r8, r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r3 = r4.invoke(r7, r3)     // Catch: java.lang.Throwable -> Lbb
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lbb
            int r4 = r3.size()     // Catch: java.lang.Throwable -> Lbb
            int r4 = r4 - r0
        L6c:
            if (r4 < 0) goto Lbc
            java.util.regex.Pattern r7 = io.netty.util.internal.PlatformDependent.MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r8 = r3.get(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Throwable -> Lbb
            java.util.regex.Matcher r7 = r7.matcher(r8)     // Catch: java.lang.Throwable -> Lbb
            boolean r8 = r7.matches()     // Catch: java.lang.Throwable -> Lbb
            if (r8 != 0) goto L83
            int r4 = r4 + (-1)
            goto L6c
        L83:
            java.lang.String r0 = r7.group(r0)     // Catch: java.lang.Throwable -> Lbb
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lbb
            r0 = 2
            java.lang.String r0 = r7.group(r0)     // Catch: java.lang.Throwable -> Lbb
            r3 = 0
            char r0 = r0.charAt(r3)     // Catch: java.lang.Throwable -> Lbb
            r3 = 71
            if (r0 == r3) goto Lb7
            r3 = 75
            if (r0 == r3) goto Lb4
            r3 = 77
            if (r0 == r3) goto Lae
            r3 = 103(0x67, float:1.44E-43)
            if (r0 == r3) goto Lb7
            r3 = 107(0x6b, float:1.5E-43)
            if (r0 == r3) goto Lb4
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 == r3) goto Lae
            goto Lbc
        Lae:
            r3 = 1048576(0x100000, double:5.180654E-318)
        Lb1:
            long r5 = r5 * r3
            goto Lbc
        Lb4:
            r3 = 1024(0x400, double:5.06E-321)
            goto Lb1
        Lb7:
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            goto Lb1
        Lbb:
        Lbc:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld4
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r5 = r0.maxMemory()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r1 = "maxDirectMemory: {} bytes (maybe)"
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.debug(r1, r2)
            goto Ldf
        Ld4:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r1 = "maxDirectMemory: {} bytes"
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.debug(r1, r2)
        Ldf:
            return r5
    }

    public static boolean maybeSuperUser() {
            boolean r0 = io.netty.util.internal.PlatformDependent.MAYBE_SUPER_USER
            return r0
    }

    private static boolean maybeSuperUser0() {
            java.lang.String r0 = "user.name"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            boolean r1 = isWindows()
            if (r1 == 0) goto L13
            java.lang.String r1 = "Administrator"
            boolean r0 = r1.equals(r0)
            return r0
        L13:
            java.lang.String r1 = "root"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L26
            java.lang.String r1 = "toor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            goto L26
        L24:
            r0 = 0
            return r0
        L26:
            r0 = 1
            return r0
    }

    public static <C> java.util.Deque<C> newConcurrentDeque() {
            int r0 = javaVersion()
            r1 = 7
            if (r0 >= r1) goto Ld
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            return r0
        Ld:
            java.util.concurrent.ConcurrentLinkedDeque r0 = new java.util.concurrent.ConcurrentLinkedDeque
            r0.<init>()
            return r0
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentHashMap() {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentHashMap(int r1) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentHashMap(int r1, float r2) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentHashMap(int r1, float r2, int r3) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentHashMap(java.util.Map<? extends K, ? extends V> r1) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Queue<T> newFixedMpscQueue(int r1) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto Lc
            io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue
            r0.<init>(r1)
            return r0
        Lc:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue
            r0.<init>(r1)
            return r0
    }

    public static io.netty.util.internal.LongCounter newLongCounter() {
            int r0 = javaVersion()
            r1 = 8
            if (r0 < r1) goto Le
            io.netty.util.internal.LongAdderCounter r0 = new io.netty.util.internal.LongAdderCounter
            r0.<init>()
            return r0
        Le:
            io.netty.util.internal.PlatformDependent$AtomicLongCounter r0 = new io.netty.util.internal.PlatformDependent$AtomicLongCounter
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Queue<T> newMpscQueue() {
            java.util.Queue r0 = io.netty.util.internal.PlatformDependent.Mpsc.newMpscQueue()
            return r0
    }

    public static <T> java.util.Queue<T> newMpscQueue(int r0) {
            java.util.Queue r0 = io.netty.util.internal.PlatformDependent.Mpsc.newMpscQueue(r0)
            return r0
    }

    public static <T> java.util.Queue<T> newSpscQueue() {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto Lc
            io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue
            r0.<init>()
            return r0
        Lc:
            io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue r0 = new io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue
            r0.<init>()
            return r0
    }

    private static java.lang.String normalize(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "[^a-z0-9]+"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    private static java.lang.String normalizeArch(java.lang.String r1) {
            java.lang.String r1 = normalize(r1)
            java.lang.String r0 = "^(x8664|amd64|ia32e|em64t|x64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "x86_64"
            return r1
        Lf:
            java.lang.String r0 = "^(x8632|x86|i[3-6]86|ia32|x32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L1a
            java.lang.String r1 = "x86_32"
            return r1
        L1a:
            java.lang.String r0 = "^(ia64|itanium64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L25
            java.lang.String r1 = "itanium_64"
            return r1
        L25:
            java.lang.String r0 = "^(sparc|sparc32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L30
            java.lang.String r1 = "sparc_32"
            return r1
        L30:
            java.lang.String r0 = "^(sparcv9|sparc64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L3b
            java.lang.String r1 = "sparc_64"
            return r1
        L3b:
            java.lang.String r0 = "^(arm|arm32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = "arm_32"
            return r1
        L46:
            java.lang.String r0 = "aarch64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            java.lang.String r1 = "aarch_64"
            return r1
        L51:
            java.lang.String r0 = "^(ppc|ppc32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L5c
            java.lang.String r1 = "ppc_32"
            return r1
        L5c:
            java.lang.String r0 = "ppc64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            java.lang.String r1 = "ppc_64"
            return r1
        L67:
            java.lang.String r0 = "ppc64le"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L72
            java.lang.String r1 = "ppcle_64"
            return r1
        L72:
            java.lang.String r0 = "s390"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            java.lang.String r1 = "s390_32"
            return r1
        L7d:
            java.lang.String r0 = "s390x"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L88
            java.lang.String r1 = "s390_64"
            return r1
        L88:
            java.lang.String r1 = "unknown"
            return r1
    }

    private static java.lang.String normalizeOs(java.lang.String r3) {
            java.lang.String r3 = normalize(r3)
            java.lang.String r0 = "aix"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = "hpux"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L16
            return r0
        L16:
            java.lang.String r0 = "os400"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L30
            int r1 = r3.length()
            r2 = 5
            if (r1 <= r2) goto L2f
            char r1 = r3.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L30
        L2f:
            return r0
        L30:
            java.lang.String r0 = "linux"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L39
            return r0
        L39:
            java.lang.String r0 = "macosx"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = "osx"
            if (r0 != 0) goto L82
            boolean r0 = r3.startsWith(r1)
            if (r0 == 0) goto L4a
            goto L82
        L4a:
            java.lang.String r0 = "freebsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L53
            return r0
        L53:
            java.lang.String r0 = "openbsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L5c
            return r0
        L5c:
            java.lang.String r0 = "netbsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L65
            return r0
        L65:
            java.lang.String r0 = "solaris"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = "sunos"
            if (r0 != 0) goto L82
            boolean r0 = r3.startsWith(r1)
            if (r0 == 0) goto L76
            goto L82
        L76:
            java.lang.String r0 = "windows"
            boolean r3 = r3.startsWith(r0)
            if (r3 == 0) goto L7f
            return r0
        L7f:
            java.lang.String r3 = "unknown"
            return r3
        L82:
            return r1
    }

    public static java.lang.String normalizedArch() {
            java.lang.String r0 = io.netty.util.internal.PlatformDependent.NORMALIZED_ARCH
            return r0
    }

    public static java.lang.String normalizedOs() {
            java.lang.String r0 = io.netty.util.internal.PlatformDependent.NORMALIZED_OS
            return r0
    }

    public static long objectFieldOffset(java.lang.reflect.Field r2) {
            long r0 = io.netty.util.internal.PlatformDependent0.objectFieldOffset(r2)
            return r0
    }

    public static void putByte(long r0, byte r2) {
            io.netty.util.internal.PlatformDependent0.putByte(r0, r2)
            return
    }

    public static void putByte(byte[] r0, int r1, byte r2) {
            io.netty.util.internal.PlatformDependent0.putByte(r0, r1, r2)
            return
    }

    public static void putInt(long r0, int r2) {
            io.netty.util.internal.PlatformDependent0.putInt(r0, r2)
            return
    }

    public static void putInt(byte[] r0, int r1, int r2) {
            io.netty.util.internal.PlatformDependent0.putInt(r0, r1, r2)
            return
    }

    public static void putLong(long r0, long r2) {
            io.netty.util.internal.PlatformDependent0.putLong(r0, r2)
            return
    }

    public static void putLong(byte[] r0, int r1, long r2) {
            io.netty.util.internal.PlatformDependent0.putLong(r0, r1, r2)
            return
    }

    public static void putObject(java.lang.Object r0, long r1, java.lang.Object r3) {
            io.netty.util.internal.PlatformDependent0.putObject(r0, r1, r3)
            return
    }

    public static void putShort(long r0, short r2) {
            io.netty.util.internal.PlatformDependent0.putShort(r0, r2)
            return
    }

    public static void putShort(byte[] r0, int r1, short r2) {
            io.netty.util.internal.PlatformDependent0.putShort(r0, r1, r2)
            return
    }

    public static java.nio.ByteBuffer reallocateDirectNoCleaner(java.nio.ByteBuffer r1, int r2) {
            int r0 = r1.capacity()
            int r0 = r2 - r0
            incrementMemoryCounter(r0)
            java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent0.reallocateDirectNoCleaner(r1, r2)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            decrementMemoryCounter(r0)
            throwException(r1)
            r1 = 0
            return r1
    }

    public static long reallocateMemory(long r0, long r2) {
            long r0 = io.netty.util.internal.PlatformDependent0.reallocateMemory(r0, r2)
            return r0
    }

    public static void setMemory(long r0, long r2, byte r4) {
            io.netty.util.internal.PlatformDependent0.setMemory(r0, r2, r4)
            return
    }

    public static void setMemory(byte[] r10, int r11, long r12, byte r14) {
            long r0 = io.netty.util.internal.PlatformDependent.BYTE_ARRAY_BASE_OFFSET
            long r2 = (long) r11
            long r5 = r0 + r2
            r4 = r10
            r7 = r12
            r9 = r14
            io.netty.util.internal.PlatformDependent0.setMemory(r4, r5, r7, r9)
            return
    }

    public static java.util.Random threadLocalRandom() {
            io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider r0 = io.netty.util.internal.PlatformDependent.RANDOM_PROVIDER
            java.util.Random r0 = r0.current()
            return r0
    }

    public static void throwException(java.lang.Throwable r1) {
            boolean r0 = hasUnsafe()
            if (r0 == 0) goto La
            io.netty.util.internal.PlatformDependent0.throwException(r1)
            return
        La:
            throwException0(r1)
            return
    }

    private static <E extends java.lang.Throwable> void throwException0(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }

    public static java.io.File tmpdir() {
            java.io.File r0 = io.netty.util.internal.PlatformDependent.TMPDIR
            return r0
    }

    private static java.io.File tmpdir0() {
            java.lang.String r0 = "io.netty.tmpdir"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = toDirectory(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {}"
            r1.debug(r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            goto L9f
        L17:
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = toDirectory(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L2b
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {} (java.io.tmpdir)"
            r1.debug(r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L2b:
            boolean r0 = isWindows()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L8b
            java.lang.String r0 = "TEMP"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = toDirectory(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L45
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {} (%TEMP%)"
            r1.debug(r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L45:
            java.lang.String r0 = "USERPROFILE"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "\\AppData\\Local\\Temp"
            r1.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.io.File r1 = toDirectory(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6c
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)"
            r0.debug(r2, r1)     // Catch: java.lang.Throwable -> L14
            return r1
        L6c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "\\Local Settings\\Temp"
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = toDirectory(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L9f
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)"
            r1.debug(r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L8b:
            java.lang.String r0 = "TMPDIR"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L14
            java.io.File r0 = toDirectory(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L9f
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "-Dio.netty.tmpdir: {} ($TMPDIR)"
            r1.debug(r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L9f:
            boolean r0 = isWindows()
            if (r0 == 0) goto Lad
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "C:\\Windows\\Temp"
            r0.<init>(r1)
            goto Lb4
        Lad:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/tmp"
            r0.<init>(r1)
        Lb4:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "Failed to get the temporary directory; falling back to: {}"
            r1.warn(r2, r0)
            return r0
    }

    private static java.io.File toDirectory(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r1.mkdirs()
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L13
            return r0
        L13:
            java.io.File r2 = r1.getAbsoluteFile()     // Catch: java.lang.Exception -> L18
            return r2
        L18:
            return r1
    }

    private static java.lang.Throwable unsafeUnavailabilityCause0() {
            boolean r0 = isAndroid()
            if (r0 == 0) goto L13
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r1 = "sun.misc.Unsafe: unavailable (Android)"
            r0.debug(r1)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            return r0
        L13:
            boolean r0 = isIkvmDotNet()
            if (r0 == 0) goto L26
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r1 = "sun.misc.Unsafe: unavailable (IKVM.NET)"
            r0.debug(r1)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            return r0
        L26:
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent0.getUnsafeUnavailabilityCause()
            if (r0 == 0) goto L2d
            return r0
        L2d:
            boolean r0 = io.netty.util.internal.PlatformDependent0.hasUnsafe()     // Catch: java.lang.Throwable -> L48
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "sun.misc.Unsafe: {}"
            if (r0 == 0) goto L3a
            java.lang.String r3 = "available"
            goto L3c
        L3a:
            java.lang.String r3 = "unavailable"
        L3c:
            r1.debug(r2, r3)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L43
            r0 = 0
            return r0
        L43:
            java.lang.Throwable r0 = io.netty.util.internal.PlatformDependent0.getUnsafeUnavailabilityCause()     // Catch: java.lang.Throwable -> L48
            return r0
        L48:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.PlatformDependent.logger
            java.lang.String r2 = "Could not determine if Unsafe is available"
            r1.trace(r2, r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r2, r0)
            return r1
    }

    public static boolean useDirectBufferNoCleaner() {
            boolean r0 = io.netty.util.internal.PlatformDependent.USE_DIRECT_BUFFER_NO_CLEANER
            return r0
    }

    public static long usedDirectMemory() {
            java.util.concurrent.atomic.AtomicLong r0 = io.netty.util.internal.PlatformDependent.DIRECT_MEMORY_COUNTER
            if (r0 == 0) goto L9
            long r0 = r0.get()
            return r0
        L9:
            r0 = -1
            return r0
    }
}
