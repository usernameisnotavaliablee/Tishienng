package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ResourceLeakDetector<T> {
    private static final io.netty.util.ResourceLeakDetector.Level DEFAULT_LEVEL = null;
    private static final int DEFAULT_SAMPLING_INTERVAL = 128;
    private static final int DEFAULT_TARGET_RECORDS = 4;
    private static final java.lang.String PROP_LEVEL = "io.netty.leakDetection.level";
    private static final java.lang.String PROP_LEVEL_OLD = "io.netty.leakDetectionLevel";
    private static final java.lang.String PROP_SAMPLING_INTERVAL = "io.netty.leakDetection.samplingInterval";
    private static final java.lang.String PROP_TARGET_RECORDS = "io.netty.leakDetection.targetRecords";
    static final int SAMPLING_INTERVAL = 0;
    private static final int TARGET_RECORDS = 0;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> excludedMethods = null;
    private static io.netty.util.ResourceLeakDetector.Level level;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Set<io.netty.util.ResourceLeakDetector.DefaultResourceLeak<?>> allLeaks;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> refQueue;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> reportedLeaks;
    private final java.lang.String resourceType;
    private final int samplingInterval;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultResourceLeak<T> extends java.lang.ref.WeakReference<java.lang.Object> implements io.netty.util.ResourceLeakTracker<T>, io.netty.util.ResourceLeak {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.ResourceLeakDetector.DefaultResourceLeak<?>> droppedRecordsUpdater = null;
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.ResourceLeakDetector.DefaultResourceLeak<?>, io.netty.util.ResourceLeakDetector.Record> headUpdater = null;
        private final java.util.Set<io.netty.util.ResourceLeakDetector.DefaultResourceLeak<?>> allLeaks;
        private volatile int droppedRecords;
        private volatile io.netty.util.ResourceLeakDetector.Record head;
        private final int trackedHash;

        static {
                java.lang.Class<io.netty.util.ResourceLeakDetector$Record> r0 = io.netty.util.ResourceLeakDetector.Record.class
                java.lang.String r1 = "head"
                java.lang.Class<io.netty.util.ResourceLeakDetector$DefaultResourceLeak> r2 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                io.netty.util.ResourceLeakDetector.DefaultResourceLeak.headUpdater = r0
                java.lang.String r0 = "droppedRecords"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
                io.netty.util.ResourceLeakDetector.DefaultResourceLeak.droppedRecordsUpdater = r0
                return
        }

        DefaultResourceLeak(java.lang.Object r2, java.lang.ref.ReferenceQueue<java.lang.Object> r3, java.util.Set<io.netty.util.ResourceLeakDetector.DefaultResourceLeak<?>> r4) {
                r1 = this;
                r1.<init>(r2, r3)
                int r2 = java.lang.System.identityHashCode(r2)
                r1.trackedHash = r2
                r4.add(r1)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>, io.netty.util.ResourceLeakDetector$Record> r2 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.headUpdater
                io.netty.util.ResourceLeakDetector$Record r3 = new io.netty.util.ResourceLeakDetector$Record
                io.netty.util.ResourceLeakDetector$Record r0 = io.netty.util.ResourceLeakDetector.Record.access$100()
                r3.<init>(r0)
                r2.set(r1, r3)
                r1.allLeaks = r4
                return
        }

        private static void reachabilityFence0(java.lang.Object r1) {
                if (r1 == 0) goto L8
                monitor-enter(r1)
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                return
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
            L8:
                return
        }

        private void record0(java.lang.Object r7) {
                r6 = this;
                int r0 = io.netty.util.ResourceLeakDetector.access$200()
                if (r0 <= 0) goto L5a
            L6:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>, io.netty.util.ResourceLeakDetector$Record> r0 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.headUpdater
                java.lang.Object r1 = r0.get(r6)
                io.netty.util.ResourceLeakDetector$Record r1 = (io.netty.util.ResourceLeakDetector.Record) r1
                if (r1 != 0) goto L11
                goto L5a
            L11:
                int r2 = io.netty.util.ResourceLeakDetector.Record.access$300(r1)
                r3 = 1
                int r2 = r2 + r3
                int r4 = io.netty.util.ResourceLeakDetector.access$200()
                r5 = 0
                if (r2 < r4) goto L41
                int r4 = io.netty.util.ResourceLeakDetector.access$200()
                int r2 = r2 - r4
                r4 = 30
                int r2 = java.lang.Math.min(r2, r4)
                java.util.Random r4 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
                int r2 = r3 << r2
                int r2 = r4.nextInt(r2)
                if (r2 == 0) goto L36
                goto L37
            L36:
                r3 = 0
            L37:
                if (r3 == 0) goto L3e
                io.netty.util.ResourceLeakDetector$Record r2 = io.netty.util.ResourceLeakDetector.Record.access$400(r1)
                goto L3f
            L3e:
                r2 = r1
            L3f:
                r5 = r3
                goto L42
            L41:
                r2 = r1
            L42:
                io.netty.util.ResourceLeakDetector$Record r3 = new io.netty.util.ResourceLeakDetector$Record
                if (r7 == 0) goto L4a
                r3.<init>(r2, r7)
                goto L4d
            L4a:
                r3.<init>(r2)
            L4d:
                boolean r0 = androidx.concurrent.futures.a.a(r0, r6, r1, r3)
                if (r0 == 0) goto L6
                if (r5 == 0) goto L5a
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r7 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.droppedRecordsUpdater
                r7.incrementAndGet(r6)
            L5a:
                return
        }

        @Override // io.netty.util.ResourceLeak
        public boolean close() {
                r2 = this;
                java.util.Set<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r0 = r2.allLeaks
                boolean r0 = r0.remove(r2)
                if (r0 == 0) goto L13
                r2.clear()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>, io.netty.util.ResourceLeakDetector$Record> r0 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.headUpdater
                r1 = 0
                r0.set(r2, r1)
                r0 = 1
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // io.netty.util.ResourceLeakTracker
        public boolean close(T r2) {
                r1 = this;
                boolean r0 = r1.close()     // Catch: java.lang.Throwable -> L8
                reachabilityFence0(r2)
                return r0
            L8:
                r0 = move-exception
                reachabilityFence0(r2)
                throw r0
        }

        boolean dispose() {
                r1 = this;
                r1.clear()
                java.util.Set<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r0 = r1.allLeaks
                boolean r0 = r0.remove(r1)
                return r0
        }

        @Override // io.netty.util.ResourceLeakTracker, io.netty.util.ResourceLeak
        public void record() {
                r1 = this;
                r0 = 0
                r1.record0(r0)
                return
        }

        @Override // io.netty.util.ResourceLeakTracker, io.netty.util.ResourceLeak
        public void record(java.lang.Object r1) {
                r0 = this;
                r0.record0(r1)
                return
        }

        public java.lang.String toString() {
                r9 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>, io.netty.util.ResourceLeakDetector$Record> r0 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.headUpdater
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r9, r1)
                io.netty.util.ResourceLeakDetector$Record r0 = (io.netty.util.ResourceLeakDetector.Record) r0
                if (r0 != 0) goto Le
                java.lang.String r0 = ""
                return r0
            Le:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r1 = io.netty.util.ResourceLeakDetector.DefaultResourceLeak.droppedRecordsUpdater
                int r1 = r1.get(r9)
                int r2 = io.netty.util.ResourceLeakDetector.Record.access$300(r0)
                r3 = 1
                int r2 = r2 + r3
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                int r5 = r2 * 2048
                r4.<init>(r5)
                java.lang.String r5 = io.netty.util.internal.StringUtil.NEWLINE
                r4.append(r5)
                java.lang.String r6 = "Recent access records: "
                r4.append(r6)
                r4.append(r5)
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>(r2)
                r2 = 0
            L34:
                io.netty.util.ResourceLeakDetector$Record r6 = io.netty.util.ResourceLeakDetector.Record.access$100()
                if (r0 == r6) goto L7c
                java.lang.String r6 = r0.toString()
                boolean r7 = r5.add(r6)
                if (r7 == 0) goto L75
                io.netty.util.ResourceLeakDetector$Record r7 = io.netty.util.ResourceLeakDetector.Record.access$400(r0)
                io.netty.util.ResourceLeakDetector$Record r8 = io.netty.util.ResourceLeakDetector.Record.access$100()
                if (r7 != r8) goto L5c
                java.lang.String r7 = "Created at:"
                r4.append(r7)
                java.lang.String r7 = io.netty.util.internal.StringUtil.NEWLINE
                r4.append(r7)
                r4.append(r6)
                goto L77
            L5c:
                r7 = 35
                r4.append(r7)
                int r7 = r3 + 1
                r4.append(r3)
                r3 = 58
                r4.append(r3)
                java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
                r4.append(r3)
                r4.append(r6)
                r3 = r7
                goto L77
            L75:
                int r2 = r2 + 1
            L77:
                io.netty.util.ResourceLeakDetector$Record r0 = io.netty.util.ResourceLeakDetector.Record.access$400(r0)
                goto L34
            L7c:
                java.lang.String r0 = ": "
                if (r2 <= 0) goto L90
                r4.append(r0)
                r4.append(r2)
                java.lang.String r2 = " leak records were discarded because they were duplicates"
                r4.append(r2)
                java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
                r4.append(r2)
            L90:
                if (r1 <= 0) goto Lb8
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = " leak records were discarded because the leak record count is targeted to "
                r4.append(r0)
                int r0 = io.netty.util.ResourceLeakDetector.access$200()
                r4.append(r0)
                java.lang.String r0 = ". Use system property "
                r4.append(r0)
                java.lang.String r0 = "io.netty.leakDetection.targetRecords"
                r4.append(r0)
                java.lang.String r0 = " to increase the limit."
                r4.append(r0)
                java.lang.String r0 = io.netty.util.internal.StringUtil.NEWLINE
                r4.append(r0)
            Lb8:
                int r0 = r4.length()
                java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
                int r1 = r1.length()
                int r0 = r0 - r1
                r4.setLength(r0)
                java.lang.String r0 = r4.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<io.netty.util.ResourceLeakDetector.Level> {
        private static final /* synthetic */ io.netty.util.ResourceLeakDetector.Level[] $VALUES = null;
        public static final io.netty.util.ResourceLeakDetector.Level ADVANCED = null;
        public static final io.netty.util.ResourceLeakDetector.Level DISABLED = null;
        public static final io.netty.util.ResourceLeakDetector.Level PARANOID = null;
        public static final io.netty.util.ResourceLeakDetector.Level SIMPLE = null;

        static {
                io.netty.util.ResourceLeakDetector$Level r0 = new io.netty.util.ResourceLeakDetector$Level
                java.lang.String r1 = "DISABLED"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.util.ResourceLeakDetector.Level.DISABLED = r0
                io.netty.util.ResourceLeakDetector$Level r1 = new io.netty.util.ResourceLeakDetector$Level
                java.lang.String r3 = "SIMPLE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.util.ResourceLeakDetector.Level.SIMPLE = r1
                io.netty.util.ResourceLeakDetector$Level r3 = new io.netty.util.ResourceLeakDetector$Level
                java.lang.String r5 = "ADVANCED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.util.ResourceLeakDetector.Level.ADVANCED = r3
                io.netty.util.ResourceLeakDetector$Level r5 = new io.netty.util.ResourceLeakDetector$Level
                java.lang.String r7 = "PARANOID"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.util.ResourceLeakDetector.Level.PARANOID = r5
                r7 = 4
                io.netty.util.ResourceLeakDetector$Level[] r7 = new io.netty.util.ResourceLeakDetector.Level[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.util.ResourceLeakDetector.Level.$VALUES = r7
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static io.netty.util.ResourceLeakDetector.Level parseLevel(java.lang.String r5) {
                java.lang.String r5 = r5.trim()
                io.netty.util.ResourceLeakDetector$Level[] r0 = values()
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L2b
                r3 = r0[r2]
                java.lang.String r4 = r3.name()
                boolean r4 = r5.equalsIgnoreCase(r4)
                if (r4 != 0) goto L2a
                int r4 = r3.ordinal()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L27
                goto L2a
            L27:
                int r2 = r2 + 1
                goto La
            L2a:
                return r3
            L2b:
                io.netty.util.ResourceLeakDetector$Level r5 = io.netty.util.ResourceLeakDetector.access$000()
                return r5
        }

        public static io.netty.util.ResourceLeakDetector.Level valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.util.ResourceLeakDetector$Level> r0 = io.netty.util.ResourceLeakDetector.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.util.ResourceLeakDetector$Level r1 = (io.netty.util.ResourceLeakDetector.Level) r1
                return r1
        }

        public static io.netty.util.ResourceLeakDetector.Level[] values() {
                io.netty.util.ResourceLeakDetector$Level[] r0 = io.netty.util.ResourceLeakDetector.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.util.ResourceLeakDetector$Level[] r0 = (io.netty.util.ResourceLeakDetector.Level[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Record extends java.lang.Throwable {
        private static final io.netty.util.ResourceLeakDetector.Record BOTTOM = null;
        private static final long serialVersionUID = 6065153674892850720L;
        private final java.lang.String hintString;
        private final io.netty.util.ResourceLeakDetector.Record next;
        private final int pos;

        static {
                io.netty.util.ResourceLeakDetector$Record r0 = new io.netty.util.ResourceLeakDetector$Record
                r0.<init>()
                io.netty.util.ResourceLeakDetector.Record.BOTTOM = r0
                return
        }

        private Record() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.hintString = r0
                r1.next = r0
                r0 = -1
                r1.pos = r0
                return
        }

        Record(io.netty.util.ResourceLeakDetector.Record r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.hintString = r0
                r1.next = r2
                int r2 = r2.pos
                int r2 = r2 + 1
                r1.pos = r2
                return
        }

        Record(io.netty.util.ResourceLeakDetector.Record r2, java.lang.Object r3) {
                r1 = this;
                r1.<init>()
                boolean r0 = r3 instanceof io.netty.util.ResourceLeakHint
                if (r0 == 0) goto Le
                io.netty.util.ResourceLeakHint r3 = (io.netty.util.ResourceLeakHint) r3
                java.lang.String r3 = r3.toHintString()
                goto L12
            Le:
                java.lang.String r3 = r3.toString()
            L12:
                r1.hintString = r3
                r1.next = r2
                int r2 = r2.pos
                int r2 = r2 + 1
                r1.pos = r2
                return
        }

        static /* synthetic */ io.netty.util.ResourceLeakDetector.Record access$100() {
                io.netty.util.ResourceLeakDetector$Record r0 = io.netty.util.ResourceLeakDetector.Record.BOTTOM
                return r0
        }

        static /* synthetic */ int access$300(io.netty.util.ResourceLeakDetector.Record r0) {
                int r0 = r0.pos
                return r0
        }

        static /* synthetic */ io.netty.util.ResourceLeakDetector.Record access$400(io.netty.util.ResourceLeakDetector.Record r0) {
                io.netty.util.ResourceLeakDetector$Record r0 = r0.next
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 2048(0x800, float:2.87E-42)
                r0.<init>(r1)
                java.lang.String r1 = r8.hintString
                if (r1 == 0) goto L1a
                java.lang.String r1 = "\tHint: "
                r0.append(r1)
                java.lang.String r1 = r8.hintString
                r0.append(r1)
                java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
                r0.append(r1)
            L1a:
                java.lang.StackTraceElement[] r1 = r8.getStackTrace()
                r2 = 3
            L1f:
                int r3 = r1.length
                if (r2 >= r3) goto L64
                r3 = r1[r2]
                java.util.concurrent.atomic.AtomicReference r4 = io.netty.util.ResourceLeakDetector.access$500()
                java.lang.Object r4 = r4.get()
                java.lang.String[] r4 = (java.lang.String[]) r4
                r5 = 0
            L2f:
                int r6 = r4.length
                if (r5 >= r6) goto L50
                r6 = r4[r5]
                java.lang.String r7 = r3.getClassName()
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L4d
                int r6 = r5 + 1
                r6 = r4[r6]
                java.lang.String r7 = r3.getMethodName()
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L4d
                goto L61
            L4d:
                int r5 = r5 + 2
                goto L2f
            L50:
                r4 = 9
                r0.append(r4)
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
                r0.append(r3)
            L61:
                int r2 = r2 + 1
                goto L1f
            L64:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.Level.SIMPLE
            io.netty.util.ResourceLeakDetector.DEFAULT_LEVEL = r0
            java.lang.Class<io.netty.util.ResourceLeakDetector> r1 = io.netty.util.ResourceLeakDetector.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r1)
            io.netty.util.ResourceLeakDetector.logger = r1
            java.lang.String r2 = "io.netty.noResourceLeakDetection"
            java.lang.String r3 = io.netty.util.internal.SystemPropertyUtil.get(r2)
            r4 = 0
            java.lang.String r5 = "io.netty.leakDetection.level"
            if (r3 == 0) goto L31
            boolean r4 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r2, r4)
            java.lang.String r2 = "-Dio.netty.noResourceLeakDetection: {}"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r1.debug(r2, r3)
            java.lang.String r2 = r0.name()
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r3 = "-Dio.netty.noResourceLeakDetection is deprecated. Use '-D{}={}' instead."
            r1.warn(r3, r5, r2)
        L31:
            if (r4 == 0) goto L35
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.Level.DISABLED
        L35:
            java.lang.String r2 = "io.netty.leakDetectionLevel"
            java.lang.String r0 = r0.name()
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r2, r0)
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r5, r0)
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.Level.parseLevel(r0)
            r2 = 4
            java.lang.String r3 = "io.netty.leakDetection.targetRecords"
            int r2 = io.netty.util.internal.SystemPropertyUtil.getInt(r3, r2)
            io.netty.util.ResourceLeakDetector.TARGET_RECORDS = r2
            java.lang.String r4 = "io.netty.leakDetection.samplingInterval"
            r6 = 128(0x80, float:1.8E-43)
            int r4 = io.netty.util.internal.SystemPropertyUtil.getInt(r4, r6)
            io.netty.util.ResourceLeakDetector.SAMPLING_INTERVAL = r4
            io.netty.util.ResourceLeakDetector.level = r0
            boolean r4 = r1.isDebugEnabled()
            if (r4 == 0) goto L76
            java.lang.String r0 = r0.name()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r4 = "-D{}: {}"
            r1.debug(r4, r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.debug(r4, r3, r0)
        L76:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
            r0.<init>(r1)
            io.netty.util.ResourceLeakDetector.excludedMethods = r0
            return
    }

    @java.lang.Deprecated
    public ResourceLeakDetector(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.<init>(r1)
            return
    }

    public ResourceLeakDetector(java.lang.Class<?> r3, int r4) {
            r2 = this;
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.<init>(r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public ResourceLeakDetector(java.lang.Class<?> r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public ResourceLeakDetector(java.lang.String r4) {
            r3 = this;
            r0 = 128(0x80, float:1.8E-43)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r4, r0, r1)
            return
    }

    @java.lang.Deprecated
    public ResourceLeakDetector(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r3)
            r0.allLeaks = r3
            java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
            r3.<init>()
            r0.refQueue = r3
            java.util.concurrent.ConcurrentMap r3 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.reportedLeaks = r3
            if (r1 == 0) goto L22
            r0.resourceType = r1
            r0.samplingInterval = r2
            return
        L22:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "resourceType"
            r1.<init>(r2)
            throw r1
    }

    static /* synthetic */ io.netty.util.ResourceLeakDetector.Level access$000() {
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.DEFAULT_LEVEL
            return r0
    }

    static /* synthetic */ int access$200() {
            int r0 = io.netty.util.ResourceLeakDetector.TARGET_RECORDS
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference access$500() {
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r0 = io.netty.util.ResourceLeakDetector.excludedMethods
            return r0
    }

    public static void addExclusions(java.lang.Class r7, java.lang.String... r8) {
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r8)
            r0.<init>(r1)
            java.lang.reflect.Method[] r1 = r7.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L28
            r5 = r1[r4]
            java.lang.String r5 = r5.getName()
            boolean r5 = r0.remove(r5)
            if (r5 == 0) goto L25
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L25
            goto L28
        L25:
            int r4 = r4 + 1
            goto L10
        L28:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L63
        L2e:
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r0 = io.netty.util.ResourceLeakDetector.excludedMethods
            java.lang.Object r0 = r0.get()
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r1 = r0.length
            int r2 = r8.length
            int r2 = r2 * 2
            int r1 = r1 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
        L42:
            int r4 = r8.length
            if (r2 >= r4) goto L5a
            int r4 = r0.length
            int r5 = r2 * 2
            int r4 = r4 + r5
            java.lang.String r6 = r7.getName()
            r1[r4] = r6
            int r4 = r0.length
            int r4 = r4 + r5
            int r4 = r4 + 1
            r5 = r8[r2]
            r1[r4] = r5
            int r2 = r2 + 1
            goto L42
        L5a:
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r2 = io.netty.util.ResourceLeakDetector.excludedMethods
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto L2e
            return
        L63:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't find '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' in "
            r1.append(r0)
            java.lang.String r7 = r7.getName()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r8.<init>(r7)
            throw r8
    }

    private void clearRefQueue() {
            r1 = this;
        L0:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r1.refQueue
            java.lang.ref.Reference r0 = r0.poll()
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r0 = (io.netty.util.ResourceLeakDetector.DefaultResourceLeak) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r0.dispose()
            goto L0
    }

    public static io.netty.util.ResourceLeakDetector.Level getLevel() {
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.level
            return r0
    }

    public static boolean isEnabled() {
            io.netty.util.ResourceLeakDetector$Level r0 = getLevel()
            int r0 = r0.ordinal()
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.DISABLED
            int r1 = r1.ordinal()
            if (r0 <= r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    private void reportLeak() {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetector.logger
            boolean r0 = r0.isErrorEnabled()
            if (r0 != 0) goto Lc
            r3.clearRefQueue()
            return
        Lc:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.refQueue
            java.lang.ref.Reference r0 = r0.poll()
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r0 = (io.netty.util.ResourceLeakDetector.DefaultResourceLeak) r0
            if (r0 != 0) goto L17
            return
        L17:
            boolean r1 = r0.dispose()
            if (r1 != 0) goto L1e
            goto Lc
        L1e:
            java.lang.String r0 = r0.toString()
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = r3.reportedLeaks
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.putIfAbsent(r0, r2)
            if (r1 != 0) goto Lc
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L38
            java.lang.String r0 = r3.resourceType
            r3.reportUntracedLeak(r0)
            goto Lc
        L38:
            java.lang.String r1 = r3.resourceType
            r3.reportTracedLeak(r1, r0)
            goto Lc
    }

    @java.lang.Deprecated
    public static void setEnabled(boolean r0) {
            if (r0 == 0) goto L5
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.Level.SIMPLE
            goto L7
        L5:
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.Level.DISABLED
        L7:
            setLevel(r0)
            return
    }

    public static void setLevel(io.netty.util.ResourceLeakDetector.Level r1) {
            if (r1 == 0) goto L5
            io.netty.util.ResourceLeakDetector.level = r1
            return
        L5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "level"
            r1.<init>(r0)
            throw r1
    }

    private io.netty.util.ResourceLeakDetector.DefaultResourceLeak track0(T r4) {
            r3 = this;
            io.netty.util.ResourceLeakDetector$Level r0 = io.netty.util.ResourceLeakDetector.level
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.DISABLED
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r0 = r0.ordinal()
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.PARANOID
            int r1 = r1.ordinal()
            if (r0 >= r1) goto L2e
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            int r1 = r3.samplingInterval
            int r0 = r0.nextInt(r1)
            if (r0 != 0) goto L2d
            r3.reportLeak()
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r0 = new io.netty.util.ResourceLeakDetector$DefaultResourceLeak
            java.lang.ref.ReferenceQueue<java.lang.Object> r1 = r3.refQueue
            java.util.Set<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r2 = r3.allLeaks
            r0.<init>(r4, r1, r2)
            return r0
        L2d:
            return r2
        L2e:
            r3.reportLeak()
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r0 = new io.netty.util.ResourceLeakDetector$DefaultResourceLeak
            java.lang.ref.ReferenceQueue<java.lang.Object> r1 = r3.refQueue
            java.util.Set<io.netty.util.ResourceLeakDetector$DefaultResourceLeak<?>> r2 = r3.allLeaks
            r0.<init>(r4, r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public final io.netty.util.ResourceLeak open(T r1) {
            r0 = this;
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r1 = r0.track0(r1)
            return r1
    }

    @java.lang.Deprecated
    protected void reportInstancesLeak(java.lang.String r1) {
            r0 = this;
            return
    }

    protected void reportTracedLeak(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetector.logger
            java.lang.String r1 = "LEAK: {}.release() was not called before it's garbage-collected. See https://netty.io/wiki/reference-counted-objects.html for more information.{}"
            r0.error(r1, r3, r4)
            return
    }

    protected void reportUntracedLeak(java.lang.String r6) {
            r5 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetector.logger
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.ADVANCED
            java.lang.String r1 = r1.name()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r5)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            java.lang.String r6 = "io.netty.leakDetection.level"
            r4 = 1
            r3[r4] = r6
            r6 = 2
            r3[r6] = r1
            r6 = 3
            r3[r6] = r2
            java.lang.String r6 = "LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel() See https://netty.io/wiki/reference-counted-objects.html for more information."
            r0.error(r6, r3)
            return
    }

    public final io.netty.util.ResourceLeakTracker<T> track(T r1) {
            r0 = this;
            io.netty.util.ResourceLeakDetector$DefaultResourceLeak r1 = r0.track0(r1)
            return r1
    }
}
