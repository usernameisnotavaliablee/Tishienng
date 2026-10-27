package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 4 Okio.kt\nokio/Okio__OkioKt\n+ 5 FileSystem.kt\nokio/FileSystem\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1120:1\n1#2:1121\n55#3,4:1122\n55#3,4:1189\n72#4:1126\n58#4,4:1128\n66#4,10:1133\n62#4,3:1143\n77#4,3:1146\n58#4,4:1152\n66#4,10:1157\n62#4,18:1167\n73#5:1127\n74#5:1132\n86#5:1149\n191#5:1150\n95#5:1151\n96#5:1156\n37#6,2:1185\n37#6,2:1187\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n230#1:1122,4\n324#1:1189,4\n279#1:1126\n279#1:1128,4\n279#1:1133,10\n279#1:1143,3\n279#1:1146,3\n411#1:1152,4\n411#1:1157,10\n411#1:1167,18\n279#1:1127\n279#1:1132\n411#1:1149\n411#1:1150\n411#1:1151\n411#1:1156\n715#1:1185,2\n765#1:1187,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable, okhttp3.internal.concurrent.Lockable {

    @kotlin.jvm.JvmField
    public static final long ANY_SEQUENCE_NUMBER = 0;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAN = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.DiskLruCache.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DIRTY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE_BACKUP = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE_TEMP = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.Regex LEGAL_KEY_PATTERN = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MAGIC = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String READ = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REMOVE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERSION_1 = null;
    private final int appVersion;
    private boolean civilizedFileSystem;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.cache.DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final okio.Path directory;

    @org.jetbrains.annotations.NotNull
    private final okio.FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;

    @org.jetbrains.annotations.NotNull
    private final okio.Path journalFile;

    @org.jetbrains.annotations.NotNull
    private final okio.Path journalFileBackup;

    @org.jetbrains.annotations.NotNull
    private final okio.Path journalFileTmp;

    @org.jetbrains.annotations.Nullable
    private okio.BufferedSink journalWriter;

    @org.jetbrains.annotations.NotNull
    private final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class Editor {
        private boolean done;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        @org.jetbrains.annotations.Nullable
        private final boolean[] written;

        public Editor(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r2, okhttp3.internal.cache.DiskLruCache.Entry r3) {
                r1 = this;
                java.lang.String r0 = "entry"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.entry = r3
                boolean r3 = r3.getReadable$okhttp()
                if (r3 == 0) goto L14
                r2 = 0
                goto L1a
            L14:
                int r2 = r2.getValueCount$okhttp()
                boolean[] r2 = new boolean[r2]
            L1a:
                r1.written = r2
                return
        }

        public static /* synthetic */ kotlin.n1 a(okhttp3.internal.cache.DiskLruCache r0, okhttp3.internal.cache.DiskLruCache.Editor r1, java.io.IOException r2) {
                kotlin.n1 r0 = newSink$lambda$0$0(r0, r1, r2)
                return r0
        }

        private static final kotlin.n1 newSink$lambda$0$0(okhttp3.internal.cache.DiskLruCache r1, okhttp3.internal.cache.DiskLruCache.Editor r2, java.io.IOException r3) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r3, r0)
                monitor-enter(r1)
                r2.detach$okhttp()     // Catch: java.lang.Throwable -> Ld
                kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return r2
            Ld:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public final void abort() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L21
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L18
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L18
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L1a
                r1 = 0
                r0.completeEdit$okhttp(r3, r1)     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L29
            L1a:
                r1 = 1
                r3.done = r1     // Catch: java.lang.Throwable -> L18
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)
                return
            L21:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "Check failed."
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
                throw r1     // Catch: java.lang.Throwable -> L18
            L29:
                monitor-exit(r0)
                throw r1
        }

        public final void commit() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L20
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L18
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L18
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)     // Catch: java.lang.Throwable -> L18
                r2 = 1
                if (r1 == 0) goto L1a
                r0.completeEdit$okhttp(r3, r2)     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L28
            L1a:
                r3.done = r2     // Catch: java.lang.Throwable -> L18
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)
                return
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "Check failed."
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
                throw r1     // Catch: java.lang.Throwable -> L18
            L28:
                monitor-exit(r0)
                throw r1
        }

        public final void detach$okhttp() {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.getCurrentEditor$okhttp()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L21
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                r1 = 0
                r0.completeEdit$okhttp(r2, r1)
                return
            L1b:
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                r1 = 1
                r0.setZombie$okhttp(r1)
            L21:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache.DiskLruCache.Entry getEntry$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r1.entry
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final boolean[] getWritten$okhttp() {
                r1 = this;
                boolean[] r0 = r1.written
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Sink newSink(int r4) {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L51
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L19
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r4
            L19:
                r4 = move-exception
                goto L59
            L1b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L2b
                boolean[] r1 = r3.written     // Catch: java.lang.Throwable -> L19
                kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L19
            L2b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L19
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L19
                okio.Path r4 = (okio.Path) r4     // Catch: java.lang.Throwable -> L19
                okio.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch: java.lang.Throwable -> L19 java.io.FileNotFoundException -> L4b
                okio.Sink r4 = r1.sink(r4)     // Catch: java.lang.Throwable -> L19 java.io.FileNotFoundException -> L4b
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch: java.lang.Throwable -> L19
                okhttp3.internal.cache.b r2 = new okhttp3.internal.cache.b     // Catch: java.lang.Throwable -> L19
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L19
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r1
            L4b:
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)
                return r4
            L51:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = "Check failed."
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
                throw r4     // Catch: java.lang.Throwable -> L19
            L59:
                monitor-exit(r0)
                throw r4
        }

        @org.jetbrains.annotations.Nullable
        public final okio.Source newSource(int r5) {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch: java.lang.Throwable -> L3a
                if (r1 != 0) goto L40
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L3a
                r2 = 0
                if (r1 == 0) goto L3e
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L3a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L3e
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r1.getZombie$okhttp()     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L25
                goto L3e
            L25:
                okio.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                okio.Path r5 = (okio.Path) r5     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                okio.Source r2 = r1.source(r5)     // Catch: java.lang.Throwable -> L3a java.io.FileNotFoundException -> L3c
                goto L3c
            L3a:
                r5 = move-exception
                goto L48
            L3c:
                monitor-exit(r0)
                return r2
            L3e:
                monitor-exit(r0)
                return r2
            L40:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = "Check failed."
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L3a
                throw r5     // Catch: java.lang.Throwable -> L3a
            L48:
                monitor-exit(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,1120:1\n55#2,4:1121\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1045#1:1121,4\n*E\n"})
    public final class Entry {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okio.Path> cleanFiles;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.cache.DiskLruCache.Editor currentEditor;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okio.Path> dirtyFiles;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String key;

        @org.jetbrains.annotations.NotNull
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private boolean zombie;

        public Entry(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r7, java.lang.String r8) {
                r6 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r8, r0)
                r6.this$0 = r7
                r6.<init>()
                r6.key = r8
                int r0 = r7.getValueCount$okhttp()
                long[] r0 = new long[r0]
                r6.lengths = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.cleanFiles = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.dirtyFiles = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r8)
                r8 = 46
                r0.append(r8)
                int r8 = r0.length()
                int r7 = r7.getValueCount$okhttp()
                r1 = 0
            L35:
                if (r1 >= r7) goto L77
                r0.append(r1)
                java.util.List<okio.Path> r2 = r6.cleanFiles
                java.util.Collection r2 = (java.util.Collection) r2
                okhttp3.internal.cache.DiskLruCache r3 = r6.this$0
                okio.Path r3 = r3.getDirectory()
                java.lang.String r4 = r0.toString()
                java.lang.String r5 = "toString(...)"
                kotlin.jvm.internal.g0.o(r4, r5)
                okio.Path r3 = r3.resolve(r4)
                r2.add(r3)
                java.lang.String r2 = ".tmp"
                r0.append(r2)
                java.util.List<okio.Path> r2 = r6.dirtyFiles
                java.util.Collection r2 = (java.util.Collection) r2
                okhttp3.internal.cache.DiskLruCache r3 = r6.this$0
                okio.Path r3 = r3.getDirectory()
                java.lang.String r4 = r0.toString()
                kotlin.jvm.internal.g0.o(r4, r5)
                okio.Path r3 = r3.resolve(r4)
                r2.add(r3)
                r0.setLength(r8)
                int r1 = r1 + 1
                goto L35
            L77:
                return
        }

        private final java.lang.Void invalidLengths(java.util.List<java.lang.String> r4) throws java.io.IOException {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected journal line: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final okio.Source newSource(int r3) {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                okio.FileSystem r0 = r0.getFileSystem$okhttp()
                java.util.List<okio.Path> r1 = r2.cleanFiles
                java.lang.Object r3 = r1.get(r3)
                okio.Path r3 = (okio.Path) r3
                okio.Source r3 = r0.source(r3)
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                return r3
            L1b:
                int r0 = r2.lockingSourceCount
                int r0 = r0 + 1
                r2.lockingSourceCount = r0
                okhttp3.internal.cache.DiskLruCache$Entry$newSource$1 r0 = new okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                okhttp3.internal.cache.DiskLruCache r1 = r2.this$0
                r0.<init>(r3, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okio.Path> getCleanFiles$okhttp() {
                r1 = this;
                java.util.List<okio.Path> r0 = r1.cleanFiles
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Editor getCurrentEditor$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r1.currentEditor
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okio.Path> getDirtyFiles$okhttp() {
                r1 = this;
                java.util.List<okio.Path> r0 = r1.dirtyFiles
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKey$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final long[] getLengths$okhttp() {
                r1 = this;
                long[] r0 = r1.lengths
                return r0
        }

        public final int getLockingSourceCount$okhttp() {
                r1 = this;
                int r0 = r1.lockingSourceCount
                return r0
        }

        public final boolean getReadable$okhttp() {
                r1 = this;
                boolean r0 = r1.readable
                return r0
        }

        public final long getSequenceNumber$okhttp() {
                r2 = this;
                long r0 = r2.sequenceNumber
                return r0
        }

        public final boolean getZombie$okhttp() {
                r1 = this;
                boolean r0 = r1.zombie
                return r0
        }

        public final void setCurrentEditor$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.cache.DiskLruCache.Editor r1) {
                r0 = this;
                r0.currentEditor = r1
                return
        }

        public final void setLengths$okhttp(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "strings"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.size()
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                int r1 = r1.getValueCount$okhttp()
                if (r0 != r1) goto L36
                r0 = r6
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.NumberFormatException -> L2d
                int r0 = r0.size()     // Catch: java.lang.NumberFormatException -> L2d
                r1 = 0
            L19:
                if (r1 >= r0) goto L2c
                long[] r2 = r5.lengths     // Catch: java.lang.NumberFormatException -> L2d
                java.lang.Object r3 = r6.get(r1)     // Catch: java.lang.NumberFormatException -> L2d
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L2d
                long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2d
                r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L2d
                int r1 = r1 + 1
                goto L19
            L2c:
                return
            L2d:
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
            L36:
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
        }

        public final void setLockingSourceCount$okhttp(int r1) {
                r0 = this;
                r0.lockingSourceCount = r1
                return
        }

        public final void setReadable$okhttp(boolean r1) {
                r0 = this;
                r0.readable = r1
                return
        }

        public final void setSequenceNumber$okhttp(long r1) {
                r0 = this;
                r0.sequenceNumber = r1
                return
        }

        public final void setZombie$okhttp(boolean r1) {
                r0 = this;
                r0.zombie = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp() {
                r9 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 == 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L34:
                boolean r0 = r9.readable
                r1 = 0
                if (r0 != 0) goto L3a
                return r1
            L3a:
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 != 0) goto L4b
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r9.currentEditor
                if (r0 != 0) goto L4a
                boolean r0 = r9.zombie
                if (r0 == 0) goto L4b
            L4a:
                return r1
            L4b:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                long[] r0 = r9.lengths
                java.lang.Object r0 = r0.clone()
                r8 = r0
                long[] r8 = (long[]) r8
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0     // Catch: java.io.FileNotFoundException -> L78
                int r0 = r0.getValueCount$okhttp()     // Catch: java.io.FileNotFoundException -> L78
                r2 = 0
            L60:
                if (r2 >= r0) goto L6c
                okio.Source r3 = r9.newSource(r2)     // Catch: java.io.FileNotFoundException -> L78
                r7.add(r3)     // Catch: java.io.FileNotFoundException -> L78
                int r2 = r2 + 1
                goto L60
            L6c:
                okhttp3.internal.cache.DiskLruCache$Snapshot r2 = new okhttp3.internal.cache.DiskLruCache$Snapshot     // Catch: java.io.FileNotFoundException -> L78
                okhttp3.internal.cache.DiskLruCache r3 = r9.this$0     // Catch: java.io.FileNotFoundException -> L78
                java.lang.String r4 = r9.key     // Catch: java.io.FileNotFoundException -> L78
                long r5 = r9.sequenceNumber     // Catch: java.io.FileNotFoundException -> L78
                r2.<init>(r3, r4, r5, r7, r8)     // Catch: java.io.FileNotFoundException -> L78
                return r2
            L78:
                java.util.Iterator r0 = r7.iterator()
            L7c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L8c
                java.lang.Object r2 = r0.next()
                okio.Source r2 = (okio.Source) r2
                okhttp3.internal._UtilCommonKt.closeQuietly(r2)
                goto L7c
            L8c:
                okhttp3.internal.cache.DiskLruCache r0 = r9.this$0     // Catch: java.io.IOException -> L91
                r0.removeEntry$okhttp(r9)     // Catch: java.io.IOException -> L91
            L91:
                return r1
        }

        public final void writeLengths$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSink r7) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "writer"
                kotlin.jvm.internal.g0.p(r7, r0)
                long[] r0 = r6.lengths
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L19
                r3 = r0[r2]
                r5 = 32
                okio.BufferedSink r5 = r7.writeByte(r5)
                r5.writeDecimalLong(r3)
                int r2 = r2 + 1
                goto L9
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class Snapshot implements java.io.Closeable {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String key;

        @org.jetbrains.annotations.NotNull
        private final long[] lengths;
        private final long sequenceNumber;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okio.Source> sources;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public Snapshot(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r2, java.lang.String r3, @org.jetbrains.annotations.NotNull long r4, @org.jetbrains.annotations.NotNull java.util.List<? extends okio.Source> r6, long[] r7) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "sources"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "lengths"
                kotlin.jvm.internal.g0.p(r7, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.key = r3
                r1.sequenceNumber = r4
                r1.sources = r6
                r1.lengths = r7
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                java.util.List<okio.Source> r0 = r2.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                okio.Source r1 = (okio.Source) r1
                okhttp3.internal._UtilCommonKt.closeQuietly(r1)
                goto L6
            L16:
                return
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Editor edit() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                java.lang.String r1 = r4.key
                long r2 = r4.sequenceNumber
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
                return r0
        }

        public final long getLength(int r4) {
                r3 = this;
                long[] r0 = r3.lengths
                r1 = r0[r4]
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Source getSource(int r2) {
                r1 = this;
                java.util.List<okio.Source> r0 = r1.sources
                java.lang.Object r2 = r0.get(r2)
                okio.Source r2 = (okio.Source) r2
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String key() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }
    }

    static {
            okhttp3.internal.cache.DiskLruCache$Companion r0 = new okhttp3.internal.cache.DiskLruCache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.Companion = r0
            java.lang.String r0 = "journal"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE = r0
            java.lang.String r0 = "journal.tmp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP = r0
            java.lang.String r0 = "journal.bkp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP = r0
            java.lang.String r0 = "libcore.io.DiskLruCache"
            okhttp3.internal.cache.DiskLruCache.MAGIC = r0
            java.lang.String r0 = "1"
            okhttp3.internal.cache.DiskLruCache.VERSION_1 = r0
            r0 = -1
            okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[a-z0-9_-]{1,120}"
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN = r0
            java.lang.String r0 = "CLEAN"
            okhttp3.internal.cache.DiskLruCache.CLEAN = r0
            java.lang.String r0 = "DIRTY"
            okhttp3.internal.cache.DiskLruCache.DIRTY = r0
            java.lang.String r0 = "REMOVE"
            okhttp3.internal.cache.DiskLruCache.REMOVE = r0
            java.lang.String r0 = "READ"
            okhttp3.internal.cache.DiskLruCache.READ = r0
            return
    }

    public DiskLruCache(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4, int r5, int r6, long r7, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r9) {
            r2 = this;
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r9, r0)
            r2.<init>()
            r2.directory = r4
            r2.appVersion = r5
            r2.valueCount = r6
            okhttp3.internal.cache.DiskLruCache$fileSystem$1 r5 = new okhttp3.internal.cache.DiskLruCache$fileSystem$1
            r5.<init>(r3)
            r2.fileSystem = r5
            r2.maxSize = r7
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r5 = 1061158912(0x3f400000, float:0.75)
            r0 = 1
            r1 = 0
            r3.<init>(r1, r5, r0)
            r2.lruEntries = r3
            okhttp3.internal.concurrent.TaskQueue r3 = r9.newQueue()
            r2.cleanupQueue = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = okhttp3.internal._UtilJvmKt.okHttpName
            r3.append(r5)
            java.lang.String r5 = " Cache"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = new okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            r5.<init>(r2, r3)
            r2.cleanupTask = r5
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L75
            if (r6 <= 0) goto L6d
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE
            okio.Path r3 = r4.resolve(r3)
            r2.journalFile = r3
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP
            okio.Path r3 = r4.resolve(r3)
            r2.journalFileTmp = r3
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP
            okio.Path r3 = r4.resolve(r3)
            r2.journalFileBackup = r3
            return
        L6d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "valueCount <= 0"
            r3.<init>(r4)
            throw r3
        L75:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "maxSize <= 0"
            r3.<init>(r4)
            throw r3
    }

    public static /* synthetic */ kotlin.n1 a(okhttp3.internal.cache.DiskLruCache r0, java.io.IOException r1) {
            kotlin.n1 r0 = newJournalWriter$lambda$0(r0, r1)
            return r0
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.civilizedFileSystem
            return r0
    }

    public static final /* synthetic */ boolean access$getInitialized$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.initialized
            return r0
    }

    public static final /* synthetic */ okio.BufferedSink access$getJournalWriter$p(okhttp3.internal.cache.DiskLruCache r0) {
            okio.BufferedSink r0 = r0.journalWriter
            return r0
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.journalRebuildRequired()
            return r0
    }

    public static final /* synthetic */ void access$setJournalWriter$p(okhttp3.internal.cache.DiskLruCache r0, okio.BufferedSink r1) {
            r0.journalWriter = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentRebuildFailed = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentTrimFailed = r1
            return
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(okhttp3.internal.cache.DiskLruCache r0, int r1) {
            r0.redundantOpCount = r1
            return
    }

    private final synchronized void checkNotClosed() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache r0, java.lang.String r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER
        L6:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    private final boolean journalRebuildRequired() {
            r2 = this;
            int r0 = r2.redundantOpCount
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r2.lruEntries
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private final okio.BufferedSink newJournalWriter() throws java.io.FileNotFoundException {
            r3 = this;
            okio.FileSystem r0 = r3.fileSystem
            okio.Path r1 = r3.journalFile
            okio.Sink r0 = r0.appendingSink(r1)
            okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink
            okhttp3.internal.cache.a r2 = new okhttp3.internal.cache.a
            r2.<init>(r3)
            r1.<init>(r0, r2)
            okio.BufferedSink r0 = okio.Okio.buffer(r1)
            return r0
    }

    private static final kotlin.n1 newJournalWriter$lambda$0(okhttp3.internal.cache.DiskLruCache r2, java.io.IOException r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r3 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r3 == 0) goto L37
            boolean r3 = java.lang.Thread.holdsLock(r2)
            if (r3 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L37:
            r3 = 1
            r2.hasJournalErrors = r3
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private final void processJournal() throws java.io.IOException {
            r9 = this;
            okio.FileSystem r0 = r9.fileSystem
            okio.Path r1 = r9.journalFileTmp
            okhttp3.internal._UtilCommonKt.deleteIfExists(r0, r1)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r1.getCurrentEditor$okhttp()
            r3 = 0
            if (r2 != 0) goto L3b
            int r2 = r9.valueCount
        L2b:
            if (r3 >= r2) goto L11
            long r4 = r9.size
            long[] r6 = r1.getLengths$okhttp()
            r7 = r6[r3]
            long r4 = r4 + r7
            r9.size = r4
            int r3 = r3 + 1
            goto L2b
        L3b:
            r2 = 0
            r1.setCurrentEditor$okhttp(r2)
            int r2 = r9.valueCount
        L41:
            if (r3 >= r2) goto L64
            okio.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getCleanFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            okio.Path r5 = (okio.Path) r5
            okhttp3.internal._UtilCommonKt.deleteIfExists(r4, r5)
            okio.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getDirtyFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            okio.Path r5 = (okio.Path) r5
            okhttp3.internal._UtilCommonKt.deleteIfExists(r4, r5)
            int r3 = r3 + 1
            goto L41
        L64:
            r0.remove()
            goto L11
        L68:
            return
    }

    private final void readJournal() throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = ", "
            okio.FileSystem r1 = r9.fileSystem
            okio.Path r2 = r9.journalFile
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L89
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L89
            int r7 = r9.appVersion     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r4 = kotlin.jvm.internal.g0.g(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L89
            int r4 = r9.valueCount     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L89
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 > 0) goto L89
            r0 = 0
        L51:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r9.readJournalLine(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb7
        L5d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r9.lruEntries     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r9.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L5b
            goto L7d
        L70:
            okio.BufferedSink r0 = r9.journalWriter     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L77
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L5b
        L77:
            okio.BufferedSink r0 = r9.newJournalWriter()     // Catch: java.lang.Throwable -> L5b
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> L5b
        L7d:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto Lc1
        L87:
            r0 = 0
            goto Lc1
        L89:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r7.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> L5b
            r7.append(r2)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r3)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r5)     // Catch: java.lang.Throwable -> L5b
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            r7.append(r6)     // Catch: java.lang.Throwable -> L5b
            r0 = 93
            r7.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r4     // Catch: java.lang.Throwable -> L5b
        Lb7:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.lang.Throwable -> Lbd
            goto Lc1
        Lbd:
            r1 = move-exception
            kotlin.l.a(r0, r1)
        Lc1:
            if (r0 != 0) goto Lc4
            return
        Lc4:
            throw r0
    }

    private final void readJournalLine(java.lang.String r19) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r5 = 6
            r6 = 0
            r2 = 32
            r3 = 0
            r4 = 0
            r1 = r19
            int r7 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "unexpected journal line: "
            r9 = -1
            if (r7 == r9) goto Lcf
            int r3 = r7 + 1
            r5 = 4
            r6 = 0
            r2 = 32
            r4 = 0
            r1 = r19
            int r2 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            java.lang.String r4 = "substring(...)"
            r5 = 2
            r6 = 0
            r10 = 0
            if (r2 != r9) goto L42
            java.lang.String r3 = r1.substring(r3)
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r11 = okhttp3.internal.cache.DiskLruCache.REMOVE
            int r12 = r11.length()
            if (r7 != r12) goto L49
            boolean r11 = kotlin.text.u.H2(r1, r11, r6, r5, r10)
            if (r11 == 0) goto L49
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r0.lruEntries
            r1.remove(r3)
            return
        L42:
            java.lang.String r3 = r1.substring(r3, r2)
            kotlin.jvm.internal.g0.o(r3, r4)
        L49:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r0.lruEntries
            java.lang.Object r11 = r11.get(r3)
            okhttp3.internal.cache.DiskLruCache$Entry r11 = (okhttp3.internal.cache.DiskLruCache.Entry) r11
            if (r11 != 0) goto L5d
            okhttp3.internal.cache.DiskLruCache$Entry r11 = new okhttp3.internal.cache.DiskLruCache$Entry
            r11.<init>(r0, r3)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r12 = r0.lruEntries
            r12.put(r3, r11)
        L5d:
            if (r2 == r9) goto L90
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.CLEAN
            int r12 = r3.length()
            if (r7 != r12) goto L90
            boolean r3 = kotlin.text.u.H2(r1, r3, r6, r5, r10)
            if (r3 == 0) goto L90
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r12 = r1.substring(r2)
            kotlin.jvm.internal.g0.o(r12, r4)
            char[] r13 = new char[r3]
            r1 = 32
            r13[r6] = r1
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            java.util.List r1 = kotlin.text.u.l5(r12, r13, r14, r15, r16, r17)
            r11.setReadable$okhttp(r3)
            r11.setCurrentEditor$okhttp(r10)
            r11.setLengths$okhttp(r1)
            return
        L90:
            if (r2 != r9) goto La9
            java.lang.String r3 = okhttp3.internal.cache.DiskLruCache.DIRTY
            int r4 = r3.length()
            if (r7 != r4) goto La9
            boolean r3 = kotlin.text.u.H2(r1, r3, r6, r5, r10)
            if (r3 == 0) goto La9
            okhttp3.internal.cache.DiskLruCache$Editor r1 = new okhttp3.internal.cache.DiskLruCache$Editor
            r1.<init>(r0, r11)
            r11.setCurrentEditor$okhttp(r1)
            return
        La9:
            if (r2 != r9) goto Lba
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.READ
            int r3 = r2.length()
            if (r7 != r3) goto Lba
            boolean r2 = kotlin.text.u.H2(r1, r2, r6, r5, r10)
            if (r2 == 0) goto Lba
            return
        Lba:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Lcf:
            r1 = r19
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    private final boolean removeOldestEntry() {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.getZombie$okhttp()
            if (r2 != 0) goto La
            r3.removeEntry$okhttp(r1)
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    private final void validateKey(java.lang.String r3) {
            r2 = this;
            kotlin.text.Regex r0 = okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN
            boolean r0 = r0.matches(r3)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r0.append(r1)
            r0.append(r3)
            r3 = 34
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.initialized     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L4d
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto Lb
            goto L4d
        Lb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L37
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "<get-values>(...)"
            kotlin.jvm.internal.g0.o(r0, r2)     // Catch: java.lang.Throwable -> L37
            r2 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r3 = new okhttp3.internal.cache.DiskLruCache.Entry[r2]     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L37
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length     // Catch: java.lang.Throwable -> L37
        L20:
            if (r2 >= r3) goto L3c
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Throwable -> L37
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L39
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            r4.detach$okhttp()     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L51
        L39:
            int r2 = r2 + 1
            goto L20
        L3c:
            r6.trimToSize()     // Catch: java.lang.Throwable -> L37
            okio.BufferedSink r0 = r6.journalWriter     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L46
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L37
        L46:
            r0 = 0
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> L37
            r6.closed = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r6)
            return
        L4d:
            r6.closed = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r6)
            return
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    public final synchronized void completeEdit$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.g0.p(r9, r0)     // Catch: java.lang.Throwable -> L44
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch: java.lang.Throwable -> L44
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L44
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r9)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L147
            r1 = 0
            if (r10 == 0) goto L65
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L65
            int r2 = r8.valueCount     // Catch: java.lang.Throwable -> L44
            r3 = 0
        L20:
            if (r3 >= r2) goto L65
            boolean[] r4 = r9.getWritten$okhttp()     // Catch: java.lang.Throwable -> L44
            kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L4b
            okio.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L44
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L44
            okio.Path r5 = (okio.Path) r5     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4.exists(r5)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L48
            r9.abort()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r8)
            return
        L44:
            r0 = move-exception
            r9 = r0
            goto L14f
        L48:
            int r3 = r3 + 1
            goto L20
        L4b:
            r9.abort()     // Catch: java.lang.Throwable -> L44
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r10.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch: java.lang.Throwable -> L44
            r10.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L44
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L44
            throw r9     // Catch: java.lang.Throwable -> L44
        L65:
            int r9 = r8.valueCount     // Catch: java.lang.Throwable -> L44
        L67:
            if (r1 >= r9) goto Lc0
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            okio.Path r2 = (okio.Path) r2     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto Lb8
            boolean r3 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto Lb8
            okio.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.exists(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto Lbd
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L44
            okio.Path r3 = (okio.Path) r3     // Catch: java.lang.Throwable -> L44
            okio.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L44
            r4.atomicMove(r2, r3)     // Catch: java.lang.Throwable -> L44
            long[] r2 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L44
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L44
            okio.FileSystem r2 = r8.fileSystem     // Catch: java.lang.Throwable -> L44
            okio.FileMetadata r2 = r2.metadata(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Long r2 = r2.getSize()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto La9
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L44
            goto Lab
        La9:
            r2 = 0
        Lab:
            long[] r6 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L44
            r6[r1] = r2     // Catch: java.lang.Throwable -> L44
            long r6 = r8.size     // Catch: java.lang.Throwable -> L44
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch: java.lang.Throwable -> L44
            goto Lbd
        Lb8:
            okio.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L44
            okhttp3.internal._UtilCommonKt.deleteIfExists(r3, r2)     // Catch: java.lang.Throwable -> L44
        Lbd:
            int r1 = r1 + 1
            goto L67
        Lc0:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch: java.lang.Throwable -> L44
            boolean r9 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto Lcf
            r8.removeEntry$okhttp(r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r8)
            return
        Lcf:
            int r9 = r8.redundantOpCount     // Catch: java.lang.Throwable -> L44
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch: java.lang.Throwable -> L44
            okio.BufferedSink r9 = r8.journalWriter     // Catch: java.lang.Throwable -> L44
            kotlin.jvm.internal.g0.m(r9)     // Catch: java.lang.Throwable -> L44
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L44
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L104
            if (r10 == 0) goto Le7
            goto L104
        Le7:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L44
            r10.remove(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.REMOVE     // Catch: java.lang.Throwable -> L44
            okio.BufferedSink r10 = r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L44
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L44
            r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L44
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L44
            goto L129
        L104:
            r0.setReadable$okhttp(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L44
            okio.BufferedSink r1 = r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L44
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L44
            r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L44
            r0.writeLengths$okhttp(r9)     // Catch: java.lang.Throwable -> L44
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L129
            long r1 = r8.nextSequenceNumber     // Catch: java.lang.Throwable -> L44
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch: java.lang.Throwable -> L44
            r0.setSequenceNumber$okhttp(r1)     // Catch: java.lang.Throwable -> L44
        L129:
            r9.flush()     // Catch: java.lang.Throwable -> L44
            long r9 = r8.size     // Catch: java.lang.Throwable -> L44
            long r0 = r8.maxSize     // Catch: java.lang.Throwable -> L44
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L13a
            boolean r9 = r8.journalRebuildRequired()     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L145
        L13a:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch: java.lang.Throwable -> L44
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch: java.lang.Throwable -> L44
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L44
        L145:
            monitor-exit(r8)
            return
        L147:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L44
            throw r9     // Catch: java.lang.Throwable -> L44
        L14f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L44
            throw r9
    }

    public final void delete() throws java.io.IOException {
            r2 = this;
            r2.close()
            okio.FileSystem r0 = r2.fileSystem
            okio.Path r1 = r2.directory
            okhttp3.internal._UtilCommonKt.deleteContents(r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.NotNull java.lang.String r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            okhttp3.internal.cache.DiskLruCache$Editor r8 = edit$default(r1, r2, r3, r5, r6)
            return r8
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.NotNull java.lang.String r11, long r12) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r11, r0)     // Catch: java.lang.Throwable -> L29
            r10.initialize()     // Catch: java.lang.Throwable -> L29
            r10.checkNotClosed()     // Catch: java.lang.Throwable -> L29
            r10.validateKey(r11)     // Catch: java.lang.Throwable -> L29
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L29
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L29
            long r1 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER     // Catch: java.lang.Throwable -> L29
            r3 = 0
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 == 0) goto L2e
            if (r0 == 0) goto L2c
            long r1 = r0.getSequenceNumber$okhttp()     // Catch: java.lang.Throwable -> L29
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L2e
            goto L2c
        L29:
            r0 = move-exception
            r11 = r0
            goto L93
        L2c:
            monitor-exit(r10)
            return r3
        L2e:
            if (r0 == 0) goto L35
            okhttp3.internal.cache.DiskLruCache$Editor r12 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L29
            goto L36
        L35:
            r12 = r3
        L36:
            if (r12 == 0) goto L3a
            monitor-exit(r10)
            return r3
        L3a:
            if (r0 == 0) goto L44
            int r12 = r0.getLockingSourceCount$okhttp()     // Catch: java.lang.Throwable -> L29
            if (r12 == 0) goto L44
            monitor-exit(r10)
            return r3
        L44:
            boolean r12 = r10.mostRecentTrimFailed     // Catch: java.lang.Throwable -> L29
            if (r12 != 0) goto L86
            boolean r12 = r10.mostRecentRebuildFailed     // Catch: java.lang.Throwable -> L29
            if (r12 == 0) goto L4d
            goto L86
        L4d:
            okio.BufferedSink r12 = r10.journalWriter     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.g0.m(r12)     // Catch: java.lang.Throwable -> L29
            java.lang.String r13 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L29
            okio.BufferedSink r13 = r12.writeUtf8(r13)     // Catch: java.lang.Throwable -> L29
            r1 = 32
            okio.BufferedSink r13 = r13.writeByte(r1)     // Catch: java.lang.Throwable -> L29
            okio.BufferedSink r13 = r13.writeUtf8(r11)     // Catch: java.lang.Throwable -> L29
            r1 = 10
            r13.writeByte(r1)     // Catch: java.lang.Throwable -> L29
            r12.flush()     // Catch: java.lang.Throwable -> L29
            boolean r12 = r10.hasJournalErrors     // Catch: java.lang.Throwable -> L29
            if (r12 == 0) goto L70
            monitor-exit(r10)
            return r3
        L70:
            if (r0 != 0) goto L7c
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L29
            r0.<init>(r10, r11)     // Catch: java.lang.Throwable -> L29
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r12 = r10.lruEntries     // Catch: java.lang.Throwable -> L29
            r12.put(r11, r0)     // Catch: java.lang.Throwable -> L29
        L7c:
            okhttp3.internal.cache.DiskLruCache$Editor r11 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L29
            r11.<init>(r10, r0)     // Catch: java.lang.Throwable -> L29
            r0.setCurrentEditor$okhttp(r11)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r10)
            return r11
        L86:
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue     // Catch: java.lang.Throwable -> L29
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask     // Catch: java.lang.Throwable -> L29
            r8 = 2
            r9 = 0
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r10)
            return r3
        L93:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L29
            throw r11
    }

    public final synchronized void evictAll() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch: java.lang.Throwable -> L27
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L27
            r1 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r2 = new okhttp3.internal.cache.DiskLruCache.Entry[r1]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch: java.lang.Throwable -> L27
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L27
            int r2 = r0.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
        L1a:
            if (r3 >= r2) goto L29
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L27
            kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Throwable -> L27
            r5.removeEntry$okhttp(r4)     // Catch: java.lang.Throwable -> L27
            int r3 = r3 + 1
            goto L1a
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r5.mostRecentTrimFailed = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            return
        L2d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.initialized     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.checkNotClosed()     // Catch: java.lang.Throwable -> L17
            r1.trimToSize()     // Catch: java.lang.Throwable -> L17
            okio.BufferedSink r0 = r1.journalWriter     // Catch: java.lang.Throwable -> L17
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L17
            r0.flush()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(@org.jetbrains.annotations.NotNull java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r8, r0)     // Catch: java.lang.Throwable -> L56
            r7.initialize()     // Catch: java.lang.Throwable -> L56
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L56
            r7.validateKey(r8)     // Catch: java.lang.Throwable -> L56
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L56
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L56
            r1 = 0
            if (r0 != 0) goto L1c
            monitor-exit(r7)
            return r1
        L1c:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L24
            monitor-exit(r7)
            return r1
        L24:
            int r1 = r7.redundantOpCount     // Catch: java.lang.Throwable -> L56
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r1 = r7.journalWriter     // Catch: java.lang.Throwable -> L56
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.READ     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L56
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r8 = r1.writeUtf8(r8)     // Catch: java.lang.Throwable -> L56
            r1 = 10
            r8.writeByte(r1)     // Catch: java.lang.Throwable -> L56
            boolean r8 = r7.journalRebuildRequired()     // Catch: java.lang.Throwable -> L56
            if (r8 == 0) goto L59
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch: java.lang.Throwable -> L56
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch: java.lang.Throwable -> L56
            r5 = 2
            r6 = 0
            r3 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r0 = move-exception
            r8 = r0
            goto L5b
        L59:
            monitor-exit(r7)
            return r0
        L5b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
            throw r8
    }

    public final boolean getClosed$okhttp() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Path getDirectory() {
            r1 = this;
            okio.Path r0 = r1.directory
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.FileSystem getFileSystem$okhttp() {
            r1 = this;
            okio.FileSystem r0 = r1.fileSystem
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> getLruEntries$okhttp() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r1.lruEntries
            return r0
    }

    public final synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final int getValueCount$okhttp() {
            r1 = this;
            int r0 = r1.valueCount
            return r0
    }

    public final synchronized void initialize() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L36
            boolean r0 = java.lang.Thread.holdsLock(r5)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto Lc
            goto L36
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Thread "
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            r1.append(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = move-exception
            goto Lc1
        L36:
            boolean r0 = r5.initialized     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L3c
            monitor-exit(r5)
            return
        L3c:
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L61
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFile     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L58
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L33
            r0.delete(r1)     // Catch: java.lang.Throwable -> L33
            goto L61
        L58:
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L33
            okio.Path r2 = r5.journalFile     // Catch: java.lang.Throwable -> L33
            r0.atomicMove(r1, r2)     // Catch: java.lang.Throwable -> L33
        L61:
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> L33
            boolean r0 = okhttp3.internal._UtilCommonKt.isCivilized(r0, r1)     // Catch: java.lang.Throwable -> L33
            r5.civilizedFileSystem = r0     // Catch: java.lang.Throwable -> L33
            okio.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> L33
            okio.Path r1 = r5.journalFile     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> L33
            r1 = 1
            if (r0 == 0) goto Lba
            r5.readJournal()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L80
            r5.processJournal()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L80
            r5.initialized = r1     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L80
            monitor-exit(r5)
            return
        L80:
            r0 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L33
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "DiskLruCache "
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            okio.Path r4 = r5.directory     // Catch: java.lang.Throwable -> L33
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = " is corrupt: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L33
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = ", removing"
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33
            r4 = 5
            r2.log(r3, r4, r0)     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r5.delete()     // Catch: java.lang.Throwable -> Lb6
            r5.closed = r0     // Catch: java.lang.Throwable -> L33
            goto Lba
        Lb6:
            r1 = move-exception
            r5.closed = r0     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        Lba:
            r5.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L33
            r5.initialized = r1     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return
        Lc1:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public final synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            okio.BufferedSink r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Lee
        Lc:
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFileTmp     // Catch: java.lang.Throwable -> L9
            r2 = 0
            okio.Sink r0 = r0.sink(r1, r2)     // Catch: java.lang.Throwable -> L9
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r1 = r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L7b
            r3 = 10
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r1 = r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L7b
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            int r1 = r7.appVersion     // Catch: java.lang.Throwable -> L7b
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r1 = r0.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> L7b
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            int r1 = r7.valueCount     // Catch: java.lang.Throwable -> L7b
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r1 = r0.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> L7b
            r1.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r7.lruEntries     // Catch: java.lang.Throwable -> L7b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7b
        L4e:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L94
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "next(...)"
            kotlin.jvm.internal.g0.o(r4, r5)     // Catch: java.lang.Throwable -> L7b
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch: java.lang.Throwable -> L7b
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L7b
            r6 = 32
            if (r5 == 0) goto L7d
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> L7b
            r5.writeByte(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getKey$okhttp()     // Catch: java.lang.Throwable -> L7b
            r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L7b
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            goto L4e
        L7b:
            r1 = move-exception
            goto La0
        L7d:
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L7b
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> L7b
            r5.writeByte(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = r4.getKey$okhttp()     // Catch: java.lang.Throwable -> L7b
            r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> L7b
            r4.writeLengths$okhttp(r0)     // Catch: java.lang.Throwable -> L7b
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> L7b
            goto L4e
        L94:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L9e
            r0.close()     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r0 = move-exception
            goto Lab
        L9e:
            r0 = 0
            goto Lab
        La0:
            if (r0 == 0) goto Laa
            r0.close()     // Catch: java.lang.Throwable -> La6
            goto Laa
        La6:
            r0 = move-exception
            kotlin.l.a(r1, r0)     // Catch: java.lang.Throwable -> L9
        Laa:
            r0 = r1
        Lab:
            if (r0 != 0) goto Led
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFile     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Ld1
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFile     // Catch: java.lang.Throwable -> L9
            okio.Path r3 = r7.journalFileBackup     // Catch: java.lang.Throwable -> L9
            r0.atomicMove(r1, r3)     // Catch: java.lang.Throwable -> L9
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFileTmp     // Catch: java.lang.Throwable -> L9
            okio.Path r3 = r7.journalFile     // Catch: java.lang.Throwable -> L9
            r0.atomicMove(r1, r3)     // Catch: java.lang.Throwable -> L9
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFileBackup     // Catch: java.lang.Throwable -> L9
            okhttp3.internal._UtilCommonKt.deleteIfExists(r0, r1)     // Catch: java.lang.Throwable -> L9
            goto Lda
        Ld1:
            okio.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> L9
            okio.Path r1 = r7.journalFileTmp     // Catch: java.lang.Throwable -> L9
            okio.Path r3 = r7.journalFile     // Catch: java.lang.Throwable -> L9
            r0.atomicMove(r1, r3)     // Catch: java.lang.Throwable -> L9
        Lda:
            okio.BufferedSink r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Le1
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L9
        Le1:
            okio.BufferedSink r0 = r7.newJournalWriter()     // Catch: java.lang.Throwable -> L9
            r7.journalWriter = r0     // Catch: java.lang.Throwable -> L9
            r7.hasJournalErrors = r2     // Catch: java.lang.Throwable -> L9
            r7.mostRecentRebuildFailed = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r7)
            return
        Led:
            throw r0     // Catch: java.lang.Throwable -> L9
        Lee:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized boolean remove(@org.jetbrains.annotations.NotNull java.lang.String r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r7, r0)     // Catch: java.lang.Throwable -> L2d
            r6.initialize()     // Catch: java.lang.Throwable -> L2d
            r6.checkNotClosed()     // Catch: java.lang.Throwable -> L2d
            r6.validateKey(r7)     // Catch: java.lang.Throwable -> L2d
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L2d
            okhttp3.internal.cache.DiskLruCache$Entry r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            if (r7 != 0) goto L1c
            monitor-exit(r6)
            return r0
        L1c:
            boolean r7 = r6.removeEntry$okhttp(r7)     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L2f
            long r1 = r6.size     // Catch: java.lang.Throwable -> L2d
            long r3 = r6.maxSize     // Catch: java.lang.Throwable -> L2d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L2f
            r6.mostRecentTrimFailed = r0     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r7 = move-exception
            goto L31
        L2f:
            monitor-exit(r6)
            return r7
        L31:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7
    }

    public final boolean removeEntry$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Entry r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = r10.civilizedFileSystem
            r1 = 10
            r2 = 32
            r3 = 1
            if (r0 != 0) goto L3d
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 <= 0) goto L2d
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L2d
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.DIRTY
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r4 = r11.getKey$okhttp()
            r0.writeUtf8(r4)
            r0.writeByte(r1)
            r0.flush()
        L2d:
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 > 0) goto L39
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L3d
        L39:
            r11.setZombie$okhttp(r3)
            return r3
        L3d:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L46
            r0.detach$okhttp()
        L46:
            int r0 = r10.valueCount
            r4 = 0
        L49:
            if (r4 >= r0) goto L70
            okio.FileSystem r5 = r10.fileSystem
            java.util.List r6 = r11.getCleanFiles$okhttp()
            java.lang.Object r6 = r6.get(r4)
            okio.Path r6 = (okio.Path) r6
            okhttp3.internal._UtilCommonKt.deleteIfExists(r5, r6)
            long r5 = r10.size
            long[] r7 = r11.getLengths$okhttp()
            r8 = r7[r4]
            long r5 = r5 - r8
            r10.size = r5
            long[] r5 = r11.getLengths$okhttp()
            r6 = 0
            r5[r4] = r6
            int r4 = r4 + 1
            goto L49
        L70:
            int r0 = r10.redundantOpCount
            int r0 = r0 + r3
            r10.redundantOpCount = r0
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L8b
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.REMOVE
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r2 = r11.getKey$okhttp()
            r0.writeUtf8(r2)
            r0.writeByte(r1)
        L8b:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries
            java.lang.String r11 = r11.getKey$okhttp()
            r0.remove(r11)
            boolean r11 = r10.journalRebuildRequired()
            if (r11 == 0) goto La5
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask
            r8 = 2
            r9 = 0
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)
        La5:
            return r3
    }

    public final void setClosed$okhttp(boolean r1) {
            r0 = this;
            r0.closed = r1
            return
    }

    public final synchronized void setMaxSize(long r7) {
            r6 = this;
            monitor-enter(r6)
            r6.maxSize = r7     // Catch: java.lang.Throwable -> L13
            boolean r7 = r6.initialized     // Catch: java.lang.Throwable -> L13
            if (r7 == 0) goto L16
            okhttp3.internal.concurrent.TaskQueue r0 = r6.cleanupQueue     // Catch: java.lang.Throwable -> L13
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r6.cleanupTask     // Catch: java.lang.Throwable -> L13
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            r7 = r0
            goto L18
        L16:
            monitor-exit(r6)
            return
        L18:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L13
            throw r7
    }

    public final synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.initialize()     // Catch: java.lang.Throwable -> L8
            long r0 = r2.size     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.initialize()     // Catch: java.lang.Throwable -> Lb
            okhttp3.internal.cache.DiskLruCache$snapshots$1 r0 = new okhttp3.internal.cache.DiskLruCache$snapshots$1     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void trimToSize() throws java.io.IOException {
            r5 = this;
        L0:
            long r0 = r5.size
            long r2 = r5.maxSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            boolean r0 = r5.removeOldestEntry()
            if (r0 != 0) goto L0
            return
        Lf:
            r0 = 0
            r5.mostRecentTrimFailed = r0
            return
    }
}
