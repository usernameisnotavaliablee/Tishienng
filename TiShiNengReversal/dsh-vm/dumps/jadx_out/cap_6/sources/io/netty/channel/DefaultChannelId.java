package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultChannelId implements io.netty.channel.ChannelId {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] MACHINE_ID = null;
    private static final int PROCESS_ID = 0;
    private static final int PROCESS_ID_LEN = 4;
    private static final int RANDOM_LEN = 4;
    private static final int SEQUENCE_LEN = 4;
    private static final int TIMESTAMP_LEN = 8;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final java.util.concurrent.atomic.AtomicInteger nextSequence = null;
    private static final long serialVersionUID = 3884076183504074063L;
    private final byte[] data;
    private final int hashCode;
    private transient java.lang.String longValue;
    private transient java.lang.String shortValue;

    static {
            java.lang.Class<io.netty.channel.DefaultChannelId> r0 = io.netty.channel.DefaultChannelId.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.DefaultChannelId.logger = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            io.netty.channel.DefaultChannelId.nextSequence = r0
            java.lang.String r0 = "io.netty.processId"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            r1 = -1
            if (r0 == 0) goto L3b
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1d
            goto L1f
        L1d:
            r2 = -1
        L1f:
            if (r2 >= 0) goto L29
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r3 = "-Dio.netty.processId: {} (malformed)"
            r2.warn(r3, r0)
            goto L3b
        L29:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DefaultChannelId.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L3a
            java.lang.String r1 = "-Dio.netty.processId: {} (user-set)"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.debug(r1, r3)
        L3a:
            r1 = r2
        L3b:
            if (r1 >= 0) goto L52
            int r1 = defaultProcessId()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DefaultChannelId.logger
            boolean r2 = r0.isDebugEnabled()
            if (r2 == 0) goto L52
            java.lang.String r2 = "-Dio.netty.processId: {} (auto-detected)"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r3)
        L52:
            io.netty.channel.DefaultChannelId.PROCESS_ID = r1
            java.lang.String r0 = "io.netty.machineId"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            r1 = 0
            if (r0 == 0) goto L73
            byte[] r1 = io.netty.util.internal.MacAddressUtil.parseMAC(r0)     // Catch: java.lang.Exception -> L62
            goto L6a
        L62:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r4 = "-Dio.netty.machineId: {} (malformed)"
            r3.warn(r4, r0, r2)
        L6a:
            if (r1 == 0) goto L73
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r3 = "-Dio.netty.machineId: {} (user-set)"
            r2.debug(r3, r0)
        L73:
            if (r1 != 0) goto L8a
            byte[] r1 = io.netty.util.internal.MacAddressUtil.defaultMachineId()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DefaultChannelId.logger
            boolean r2 = r0.isDebugEnabled()
            if (r2 == 0) goto L8a
            java.lang.String r2 = "-Dio.netty.machineId: {} (auto-detected)"
            java.lang.String r3 = io.netty.util.internal.MacAddressUtil.formatAddress(r1)
            r0.debug(r2, r3)
        L8a:
            io.netty.channel.DefaultChannelId.MACHINE_ID = r1
            return
    }

    private DefaultChannelId() {
            r6 = this;
            r6.<init>()
            byte[] r0 = io.netty.channel.DefaultChannelId.MACHINE_ID
            int r1 = r0.length
            int r1 = r1 + 20
            byte[] r1 = new byte[r1]
            r6.data = r1
            r2 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            int r0 = r0.length
            int r2 = io.netty.channel.DefaultChannelId.PROCESS_ID
            int r0 = r6.writeInt(r0, r2)
            java.util.concurrent.atomic.AtomicInteger r2 = io.netty.channel.DefaultChannelId.nextSequence
            int r2 = r2.getAndIncrement()
            int r0 = r6.writeInt(r0, r2)
            long r2 = java.lang.System.nanoTime()
            long r2 = java.lang.Long.reverse(r2)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 ^ r4
            int r0 = r6.writeLong(r0, r2)
            java.util.Random r2 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            int r2 = r2.nextInt()
            r6.writeInt(r0, r2)
            int r0 = java.util.Arrays.hashCode(r1)
            r6.hashCode = r0
            return
    }

    private int appendHexDumpField(java.lang.StringBuilder r2, int r3, int r4) {
            r1 = this;
            byte[] r0 = r1.data
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.hexDump(r0, r3, r4)
            r2.append(r0)
            r0 = 45
            r2.append(r0)
            int r3 = r3 + r4
            return r3
    }

    private static int defaultProcessId() {
            r0 = 1
            r1 = 0
            java.lang.Class<io.netty.channel.DefaultChannelId> r2 = io.netty.channel.DefaultChannelId.class
            java.lang.ClassLoader r2 = io.netty.util.internal.PlatformDependent.getClassLoader(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "java.lang.management.ManagementFactory"
            java.lang.Class r3 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "java.lang.management.RuntimeMXBean"
            java.lang.Class r4 = java.lang.Class.forName(r4, r0, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "getRuntimeMXBean"
            java.lang.Class[] r6 = io.netty.util.internal.EmptyArrays.EMPTY_CLASSES     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = io.netty.util.internal.EmptyArrays.EMPTY_OBJECTS     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.invoke(r1, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r4 = r4.getMethod(r7, r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2f
            goto L5d
        L2f:
            r3 = move-exception
            goto L33
        L31:
            r3 = move-exception
            r2 = r1
        L33:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r5 = "Could not invoke ManagementFactory.getRuntimeMXBean().getName(); Android?"
            r4.debug(r5, r3)
            java.lang.String r3 = "android.os.Process"
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "myPid"
            java.lang.Class[] r3 = io.netty.util.internal.EmptyArrays.EMPTY_CLASSES     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r2 = io.netty.util.internal.EmptyArrays.EMPTY_OBJECTS     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L53
            goto L5d
        L53:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r2 = "Could not invoke Process.myPid(); not Android?"
            r1.debug(r2, r0)
            java.lang.String r3 = ""
        L5d:
            r0 = 64
            int r0 = r3.indexOf(r0)
            if (r0 < 0) goto L6a
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L6a:
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L6f
            goto L70
        L6f:
            r0 = -1
        L70:
            if (r0 >= 0) goto L85
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            int r0 = r0.nextInt()
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.DefaultChannelId.logger
            java.lang.String r2 = "Failed to find the current process ID from '{}'; using a random value: {}"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1.warn(r2, r3, r4)
        L85:
            return r0
    }

    public static io.netty.channel.DefaultChannelId newInstance() {
            io.netty.channel.DefaultChannelId r0 = new io.netty.channel.DefaultChannelId
            r0.<init>()
            return r0
    }

    private java.lang.String newLongValue() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            byte[] r1 = r5.data
            int r1 = r1.length
            int r1 = r1 * 2
            int r1 = r1 + 5
            r0.<init>(r1)
            byte[] r1 = io.netty.channel.DefaultChannelId.MACHINE_ID
            int r1 = r1.length
            r2 = 0
            int r1 = r5.appendHexDumpField(r0, r2, r1)
            r3 = 4
            int r1 = r5.appendHexDumpField(r0, r1, r3)
            int r1 = r5.appendHexDumpField(r0, r1, r3)
            r4 = 8
            int r1 = r5.appendHexDumpField(r0, r1, r4)
            r5.appendHexDumpField(r0, r1, r3)
            int r1 = r0.length()
            int r1 = r1 + (-1)
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    private int writeInt(int r5, int r6) {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r5 + 1
            int r2 = r6 >>> 24
            byte r2 = (byte) r2
            r0[r5] = r2
            int r2 = r5 + 2
            int r3 = r6 >>> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r5 + 3
            int r3 = r6 >>> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r5 = r5 + 4
            byte r6 = (byte) r6
            r0[r1] = r6
            return r5
    }

    private int writeLong(int r7, long r8) {
            r6 = this;
            byte[] r0 = r6.data
            int r1 = r7 + 1
            r2 = 56
            long r2 = r8 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            r0[r7] = r2
            int r2 = r7 + 2
            r3 = 48
            long r3 = r8 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r1] = r3
            int r1 = r7 + 3
            r3 = 40
            long r3 = r8 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r7 + 4
            r3 = 32
            long r3 = r8 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r1] = r3
            int r1 = r7 + 5
            r3 = 24
            long r3 = r8 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r7 + 6
            r3 = 16
            long r3 = r8 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r0[r1] = r3
            int r1 = r7 + 7
            r3 = 8
            long r4 = r8 >>> r3
            int r5 = (int) r4
            byte r4 = (byte) r5
            r0[r2] = r4
            int r7 = r7 + r3
            int r9 = (int) r8
            byte r8 = (byte) r9
            r0[r1] = r8
            return r7
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asLongText() {
            r1 = this;
            java.lang.String r0 = r1.longValue
            if (r0 != 0) goto La
            java.lang.String r0 = r1.newLongValue()
            r1.longValue = r0
        La:
            return r0
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asShortText() {
            r3 = this;
            java.lang.String r0 = r3.shortValue
            if (r0 != 0) goto Lf
            byte[] r0 = r3.data
            int r1 = r0.length
            r2 = 4
            int r1 = r1 - r2
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.hexDump(r0, r1, r2)
            r3.shortValue = r0
        Lf:
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.ChannelId r7) {
            r6 = this;
            r0 = 0
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof io.netty.channel.DefaultChannelId
            if (r1 == 0) goto L29
            io.netty.channel.DefaultChannelId r7 = (io.netty.channel.DefaultChannelId) r7
            byte[] r7 = r7.data
            byte[] r1 = r6.data
            int r1 = r1.length
            int r2 = r7.length
            int r3 = java.lang.Math.min(r1, r2)
        L14:
            if (r0 >= r3) goto L27
            byte[] r4 = r6.data
            r4 = r4[r0]
            r5 = r7[r0]
            if (r4 == r5) goto L24
            r7 = r4 & 255(0xff, float:3.57E-43)
            r0 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r7 - r0
            return r7
        L24:
            int r0 = r0 + 1
            goto L14
        L27:
            int r1 = r1 - r2
            return r1
        L29:
            java.lang.String r0 = r6.asLongText()
            java.lang.String r7 = r7.asLongText()
            int r7 = r0.compareTo(r7)
            return r7
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.ChannelId r1) {
            r0 = this;
            io.netty.channel.ChannelId r1 = (io.netty.channel.ChannelId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.channel.DefaultChannelId
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.channel.DefaultChannelId r5 = (io.netty.channel.DefaultChannelId) r5
            int r1 = r4.hashCode
            int r3 = r5.hashCode
            if (r1 != r3) goto L1d
            byte[] r1 = r4.data
            byte[] r5 = r5.data
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.asShortText()
            return r0
    }
}
