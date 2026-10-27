package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ThreadLocalRandom extends java.util.Random {
    private static final long addend = 11;
    private static volatile long initialSeedUniquifier = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final long mask = 281474976710655L;
    private static final long multiplier = 25214903917L;
    private static volatile long seedGeneratorEndTime = 0;
    private static final long seedGeneratorStartTime = 0;
    private static final java.lang.Thread seedGeneratorThread = null;
    private static final java.util.concurrent.BlockingQueue<java.lang.Long> seedQueue = null;
    private static final java.util.concurrent.atomic.AtomicLong seedUniquifier = null;
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized;
    private long pad0;
    private long pad1;
    private long pad2;
    private long pad3;
    private long pad4;
    private long pad5;
    private long pad6;
    private long pad7;
    private long rnd;



    static {
            java.lang.Class<io.netty.util.internal.ThreadLocalRandom> r0 = io.netty.util.internal.ThreadLocalRandom.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.ThreadLocalRandom.logger = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            io.netty.util.internal.ThreadLocalRandom.seedUniquifier = r0
            java.lang.String r0 = "io.netty.initialSeedUniquifier"
            r1 = 0
            long r3 = io.netty.util.internal.SystemPropertyUtil.getLong(r0, r1)
            io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier = r3
            long r3 = io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier
            r0 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L69
            java.lang.String r3 = "java.util.secureRandomSeed"
            r4 = 0
            boolean r3 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r3, r4)
            if (r3 == 0) goto L4f
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            io.netty.util.internal.ThreadLocalRandom.seedQueue = r0
            long r0 = java.lang.System.nanoTime()
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorStartTime = r0
            io.netty.util.internal.ThreadLocalRandom$1 r0 = new io.netty.util.internal.ThreadLocalRandom$1
            java.lang.String r1 = "initialSeedUniquifierGenerator"
            r0.<init>(r1)
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorThread = r0
            r1 = 1
            r0.setDaemon(r1)
            io.netty.util.internal.ThreadLocalRandom$2 r1 = new io.netty.util.internal.ThreadLocalRandom$2
            r1.<init>()
            r0.setUncaughtExceptionHandler(r1)
            r0.start()
            return
        L4f:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = mix64(r3)
            long r5 = java.lang.System.nanoTime()
            long r5 = mix64(r5)
            long r3 = r3 ^ r5
            io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier = r3
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorThread = r0
            io.netty.util.internal.ThreadLocalRandom.seedQueue = r0
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorStartTime = r1
            return
        L69:
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorThread = r0
            io.netty.util.internal.ThreadLocalRandom.seedQueue = r0
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorStartTime = r1
            return
    }

    ThreadLocalRandom() {
            r2 = this;
            long r0 = newSeed()
            r2.<init>(r0)
            r0 = 1
            r2.initialized = r0
            return
    }

    static /* synthetic */ long access$002(long r0) {
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorEndTime = r0
            return r0
    }

    static /* synthetic */ java.util.concurrent.BlockingQueue access$100() {
            java.util.concurrent.BlockingQueue<java.lang.Long> r0 = io.netty.util.internal.ThreadLocalRandom.seedQueue
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$200() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.ThreadLocalRandom.logger
            return r0
    }

    public static io.netty.util.internal.ThreadLocalRandom current() {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            io.netty.util.internal.ThreadLocalRandom r0 = r0.random()
            return r0
    }

    public static long getInitialSeedUniquifier() {
            long r0 = io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9
            return r0
        L9:
            java.lang.Class<io.netty.util.internal.ThreadLocalRandom> r0 = io.netty.util.internal.ThreadLocalRandom.class
            monitor-enter(r0)
            long r4 = io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier     // Catch: java.lang.Throwable -> L14
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r1 = move-exception
            goto L8f
        L17:
            long r6 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorStartTime     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L14
            r8 = 3
            long r10 = r1.toNanos(r8)     // Catch: java.lang.Throwable -> L14
            long r6 = r6 + r10
        L22:
            long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L14
            long r10 = r6 - r10
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 > 0) goto L35
            java.util.concurrent.BlockingQueue<java.lang.Long> r10 = io.netty.util.internal.ThreadLocalRandom.seedQueue     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            java.lang.Object r10 = r10.poll()     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            goto L3f
        L35:
            java.util.concurrent.BlockingQueue<java.lang.Long> r12 = io.netty.util.internal.ThreadLocalRandom.seedQueue     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            java.lang.Object r10 = r12.poll(r10, r13)     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
        L3f:
            r11 = 0
            if (r10 == 0) goto L47
            long r4 = r10.longValue()     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L5a
            goto L62
        L47:
            if (r1 > 0) goto L22
            java.lang.Thread r1 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorThread     // Catch: java.lang.Throwable -> L14
            r1.interrupt()     // Catch: java.lang.Throwable -> L14
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.ThreadLocalRandom.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = "Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?"
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L14
            r1.warn(r6, r7)     // Catch: java.lang.Throwable -> L14
            goto L62
        L5a:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.ThreadLocalRandom.logger     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = "Failed to generate a seed from SecureRandom due to an InterruptedException."
            r1.warn(r6)     // Catch: java.lang.Throwable -> L14
            r11 = 1
        L62:
            r6 = 3627065505421648153(0x3255ecdc33bae119, double:3.253008663204319E-66)
            long r4 = r4 ^ r6
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L14
            long r6 = java.lang.Long.reverse(r6)     // Catch: java.lang.Throwable -> L14
            long r4 = r4 ^ r6
            io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier = r4     // Catch: java.lang.Throwable -> L14
            if (r11 == 0) goto L81
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L14
            r1.interrupt()     // Catch: java.lang.Throwable -> L14
            java.lang.Thread r1 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorThread     // Catch: java.lang.Throwable -> L14
            r1.interrupt()     // Catch: java.lang.Throwable -> L14
        L81:
            long r6 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorEndTime     // Catch: java.lang.Throwable -> L14
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L8d
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L14
            io.netty.util.internal.ThreadLocalRandom.seedGeneratorEndTime = r1     // Catch: java.lang.Throwable -> L14
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    private static long mix64(long r3) {
            r0 = 33
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r3 = r3 * r1
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r3 = r3 * r1
            long r0 = r3 >>> r0
            long r3 = r3 ^ r0
            return r3
    }

    private static long newSeed() {
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = io.netty.util.internal.ThreadLocalRandom.seedUniquifier
            long r1 = r0.get()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Le
            r6 = r1
            goto L12
        Le:
            long r6 = getInitialSeedUniquifier()
        L12:
            r8 = 181783497276652981(0x285d320ad33fdb5, double:1.6685641475275746E-296)
            long r8 = r8 * r6
            boolean r0 = r0.compareAndSet(r1, r8)
            if (r0 == 0) goto L0
            if (r5 != 0) goto L66
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.ThreadLocalRandom.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L66
            long r1 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorEndTime
            r5 = 1
            r10 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 == 0) goto L55
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorEndTime
            long r6 = io.netty.util.internal.ThreadLocalRandom.seedGeneratorStartTime
            long r3 = r3 - r6
            long r2 = r2.toMillis(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r10] = r1
            r3[r5] = r2
            java.lang.String r1 = "-Dio.netty.initialSeedUniquifier: 0x%016x (took %d ms)"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.debug(r1)
            goto L66
        L55:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r10] = r1
            java.lang.String r1 = "-Dio.netty.initialSeedUniquifier: 0x%016x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.debug(r1)
        L66:
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 ^ r8
            return r0
    }

    public static void setInitialSeedUniquifier(long r0) {
            io.netty.util.internal.ThreadLocalRandom.initialSeedUniquifier = r0
            return
    }

    @Override // java.util.Random
    protected int next(int r5) {
            r4 = this;
            long r0 = r4.rnd
            r2 = 25214903917(0x5deece66d, double:1.24578177886E-313)
            long r0 = r0 * r2
            r2 = 11
            long r0 = r0 + r2
            r2 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r0 = r0 & r2
            r4.rnd = r0
            int r5 = 48 - r5
            long r0 = r0 >>> r5
            int r5 = (int) r0
            return r5
    }

    public double nextDouble(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Ld
            double r0 = r3.nextDouble()
            double r0 = r0 * r4
            return r0
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "n must be positive"
            r4.<init>(r5)
            throw r4
    }

    public double nextDouble(double r3, double r5) {
            r2 = this;
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto Ld
            double r0 = r2.nextDouble()
            double r5 = r5 - r3
            double r0 = r0 * r5
            double r0 = r0 + r3
            return r0
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    public int nextInt(int r1, int r2) {
            r0 = this;
            if (r1 >= r2) goto L9
            int r2 = r2 - r1
            int r2 = r0.nextInt(r2)
            int r2 = r2 + r1
            return r2
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public long nextLong(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L2c
        L6:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L24
            r2 = 2
            int r2 = r6.next(r2)
            r3 = 1
            long r3 = r7 >>> r3
            r5 = r2 & 2
            if (r5 != 0) goto L1a
            goto L1c
        L1a:
            long r3 = r7 - r3
        L1c:
            r2 = r2 & 1
            if (r2 != 0) goto L22
            long r7 = r7 - r3
            long r0 = r0 + r7
        L22:
            r7 = r3
            goto L6
        L24:
            int r8 = (int) r7
            int r7 = r6.nextInt(r8)
            long r7 = (long) r7
            long r0 = r0 + r7
            return r0
        L2c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "n must be positive"
            r7.<init>(r8)
            throw r7
    }

    public long nextLong(long r2, long r4) {
            r1 = this;
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lb
            long r4 = r4 - r2
            long r4 = r1.nextLong(r4)
            long r4 = r4 + r2
            return r4
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Random
    public void setSeed(long r3) {
            r2 = this;
            boolean r0 = r2.initialized
            if (r0 != 0) goto L13
            r0 = 25214903917(0x5deece66d, double:1.24578177886E-313)
            long r3 = r3 ^ r0
            r0 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r3 = r3 & r0
            r2.rnd = r3
            return
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }
}
