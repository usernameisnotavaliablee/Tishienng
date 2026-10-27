package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.inject.Singleton
@androidx.annotation.WorkerThread
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SQLiteEventStore implements com.google.android.datatransport.runtime.scheduling.persistence.EventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final java.lang.String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final com.google.android.datatransport.Encoding PROTOBUF_ENCODING = null;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig config;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Function<T, U> {
        U apply(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Metadata {
        final java.lang.String key;
        final java.lang.String value;

        private Metadata(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }

        /* synthetic */ Metadata(java.lang.String r1, java.lang.String r2, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Producer<T> {
        T produce();
    }

    static {
            java.lang.String r0 = "proto"
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.PROTOBUF_ENCODING = r0
            return
    }

    @javax.inject.Inject
    SQLiteEventStore(@com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r1, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r3, com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r4) {
            r0 = this;
            r0.<init>()
            r0.schemaManager = r4
            r0.wallClock = r1
            r0.monotonicClock = r2
            r0.config = r3
            return
    }

    private void ensureBeginTransaction(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Producer r2 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$18.lambdaFactory$(r2)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19.lambdaFactory$()
            r1.retryIfDbLocked(r2, r0)
            return
    }

    private long ensureTransportContext(android.database.sqlite.SQLiteDatabase r5, com.google.android.datatransport.runtime.TransportContext r6) {
            r4 = this;
            java.lang.Long r0 = r4.getTransportContextId(r5, r6)
            if (r0 == 0) goto Lb
            long r5 = r0.longValue()
            return r5
        Lb:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "backend_name"
            java.lang.String r2 = r6.getBackendName()
            r0.put(r1, r2)
            com.google.android.datatransport.Priority r1 = r6.getPriority()
            int r1 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "priority"
            r0.put(r2, r1)
            java.lang.String r1 = "next_request_ms"
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r3)
            byte[] r1 = r6.getExtras()
            if (r1 == 0) goto L47
            byte[] r6 = r6.getExtras()
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r2)
            java.lang.String r1 = "extras"
            r0.put(r1, r6)
        L47:
            java.lang.String r6 = "transport_contexts"
            r1 = 0
            long r5 = r5.insert(r6, r1, r0)
            return r5
    }

    private long getPageCount() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            java.lang.String r1 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    private long getPageSize() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            java.lang.String r1 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    @androidx.annotation.Nullable
    private java.lang.Long getTransportContextId(android.database.sqlite.SQLiteDatabase r13, com.google.android.datatransport.runtime.TransportContext r14) {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "backend_name = ? and priority = ?"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = r14.getBackendName()
            com.google.android.datatransport.Priority r3 = r14.getPriority()
            int r3 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            byte[] r2 = r14.getExtras()
            r3 = 0
            if (r2 == 0) goto L3c
            java.lang.String r2 = " and extras = ?"
            r0.append(r2)
            byte[] r14 = r14.getExtras()
            java.lang.String r14 = android.util.Base64.encodeToString(r14, r3)
            r1.add(r14)
            goto L41
        L3c:
            java.lang.String r14 = " and extras is null"
            r0.append(r14)
        L41:
            java.lang.String r14 = "_id"
            java.lang.String[] r6 = new java.lang.String[]{r14}
            java.lang.String r7 = r0.toString()
            java.lang.String[] r14 = new java.lang.String[r3]
            java.lang.Object[] r14 = r1.toArray(r14)
            r8 = r14
            java.lang.String[] r8 = (java.lang.String[]) r8
            r10 = 0
            r11 = 0
            java.lang.String r5 = "transport_contexts"
            r9 = 0
            r4 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r14 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$6.lambdaFactory$()
            java.lang.Object r13 = tryWithCursor(r13, r14)
            java.lang.Long r13 = (java.lang.Long) r13
            return r13
    }

    private boolean isStorageAtLimit() {
            r5 = this;
            long r0 = r5.getPageCount()
            long r2 = r5.getPageSize()
            long r0 = r0 * r2
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = r5.config
            long r2 = r2.getMaxStorageSizeInBytes()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> join(java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r7, java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> r8) {
            r6 = this;
            java.util.ListIterator r0 = r7.listIterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r1
            long r2 = r1.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r8.containsKey(r2)
            if (r2 != 0) goto L1f
            goto L4
        L1f:
            com.google.android.datatransport.runtime.EventInternal r2 = r1.getEvent()
            com.google.android.datatransport.runtime.EventInternal$Builder r2 = r2.toBuilder()
            long r3 = r1.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r8.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r3.next()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata r4 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata) r4
            java.lang.String r5 = r4.key
            java.lang.String r4 = r4.value
            r2.addMetadata(r5, r4)
            goto L39
        L4d:
            long r3 = r1.getId()
            com.google.android.datatransport.runtime.TransportContext r1 = r1.getTransportContext()
            com.google.android.datatransport.runtime.EventInternal r2 = r2.build()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r3, r1, r2)
            r0.set(r1)
            goto L4
        L61:
            return r7
    }

    static /* synthetic */ java.lang.Integer lambda$cleanUp$10(long r1, android.database.sqlite.SQLiteDatabase r3) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "events"
            java.lang.String r0 = "timestamp_ms < ?"
            int r1 = r3.delete(r2, r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$clearDb$11(android.database.sqlite.SQLiteDatabase r4) {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "events"
            r3 = 0
            r4.delete(r2, r3, r1)
            java.lang.String r1 = "transport_contexts"
            java.lang.String[] r0 = new java.lang.String[r0]
            r4.delete(r1, r3, r0)
            return r3
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$15(android.database.sqlite.SQLiteDatabase r0) {
            r0.beginTransaction()
            r0 = 0
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$16(java.lang.Throwable r2) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationException r0 = new com.google.android.datatransport.runtime.synchronization.SynchronizationException
            java.lang.String r1 = "Timed out while trying to acquire the lock."
            r0.<init>(r1, r2)
            throw r0
    }

    static /* synthetic */ android.database.sqlite.SQLiteDatabase lambda$getDb$0(java.lang.Throwable r2) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationException r0 = new com.google.android.datatransport.runtime.synchronization.SynchronizationException
            java.lang.String r1 = "Timed out while trying to open db."
            r0.<init>(r1, r2)
            throw r0
    }

    static /* synthetic */ java.lang.Long lambda$getNextCallTime$4(android.database.Cursor r2) {
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L10
            r0 = 0
            long r0 = r2.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L10:
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.lang.Long lambda$getTransportContextId$2(android.database.Cursor r2) {
            boolean r0 = r2.moveToNext()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            long r0 = r2.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.lang.Boolean lambda$hasPendingEventsFor$5(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, com.google.android.datatransport.runtime.TransportContext r1, android.database.sqlite.SQLiteDatabase r2) {
            java.lang.Long r1 = r0.getTransportContextId(r2, r1)
            if (r1 != 0) goto L9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L9:
            android.database.sqlite.SQLiteDatabase r0 = r0.getDb()
            java.lang.String r1 = r1.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21.lambdaFactory$()
            java.lang.Object r0 = tryWithCursor(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$8(android.database.Cursor r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            boolean r1 = r3.moveToNext()
            if (r1 == 0) goto L3a
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = com.google.android.datatransport.runtime.TransportContext.builder()
            r2 = 1
            java.lang.String r2 = r3.getString(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setBackendName(r2)
            r2 = 2
            int r2 = r3.getInt(r2)
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setPriority(r2)
            r2 = 3
            java.lang.String r2 = r3.getString(r2)
            byte[] r2 = maybeBase64Decode(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setExtras(r2)
            com.google.android.datatransport.runtime.TransportContext r1 = r1.build()
            r0.add(r1)
            goto L5
        L3a:
            return r0
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$9(android.database.sqlite.SQLiteDatabase r2) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
            android.database.Cursor r2 = r2.rawQuery(r1, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$20.lambdaFactory$()
            java.lang.Object r2 = tryWithCursor(r2, r0)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    static /* synthetic */ java.util.List lambda$loadBatch$7(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, com.google.android.datatransport.runtime.TransportContext r1, android.database.sqlite.SQLiteDatabase r2) {
            java.util.List r1 = r0.loadEvents(r2, r1)
            java.util.Map r2 = r0.loadMetadata(r2, r1)
            java.util.List r0 = r0.join(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$loadEvents$12(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r6, java.util.List r7, com.google.android.datatransport.runtime.TransportContext r8, android.database.Cursor r9) {
        L0:
            boolean r0 = r9.moveToNext()
            if (r0 == 0) goto L7d
            r0 = 0
            long r1 = r9.getLong(r0)
            r3 = 7
            int r3 = r9.getInt(r3)
            r4 = 1
            if (r3 == 0) goto L14
            r0 = 1
        L14:
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = com.google.android.datatransport.runtime.EventInternal.builder()
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setTransportName(r4)
            r4 = 2
            long r4 = r9.getLong(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setEventMillis(r4)
            r4 = 3
            long r4 = r9.getLong(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setUptimeMillis(r4)
            r4 = 4
            if (r0 == 0) goto L4b
            com.google.android.datatransport.runtime.EncodedPayload r0 = new com.google.android.datatransport.runtime.EncodedPayload
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.Encoding r4 = toEncoding(r4)
            r5 = 5
            byte[] r5 = r9.getBlob(r5)
            r0.<init>(r4, r5)
            r3.setEncodedPayload(r0)
            goto L5f
        L4b:
            com.google.android.datatransport.runtime.EncodedPayload r0 = new com.google.android.datatransport.runtime.EncodedPayload
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.Encoding r4 = toEncoding(r4)
            byte[] r5 = r6.readPayload(r1)
            r0.<init>(r4, r5)
            r3.setEncodedPayload(r0)
        L5f:
            r0 = 6
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto L71
            int r0 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L71:
            com.google.android.datatransport.runtime.EventInternal r0 = r3.build()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r0 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r1, r8, r0)
            r7.add(r0)
            goto L0
        L7d:
            r6 = 0
            return r6
    }

    static /* synthetic */ java.lang.Object lambda$loadMetadata$14(java.util.Map r5, android.database.Cursor r6) {
        L0:
            boolean r0 = r6.moveToNext()
            r1 = 0
            if (r0 == 0) goto L37
            r0 = 0
            long r2 = r6.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r5.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L24
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.put(r2, r0)
        L24:
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata
            r3 = 1
            java.lang.String r3 = r6.getString(r3)
            r4 = 2
            java.lang.String r4 = r6.getString(r4)
            r2.<init>(r3, r4, r1)
            r0.add(r2)
            goto L0
        L37:
            return r1
    }

    static /* synthetic */ java.lang.Long lambda$persist$1(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r10, com.google.android.datatransport.runtime.TransportContext r11, com.google.android.datatransport.runtime.EventInternal r12, android.database.sqlite.SQLiteDatabase r13) {
            boolean r0 = r10.isStorageAtLimit()
            if (r0 == 0) goto Ld
            r10 = -1
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        Ld:
            long r0 = r10.ensureTransportContext(r13, r11)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r10 = r10.config
            int r10 = r10.getMaxBlobByteSizePerRow()
            com.google.android.datatransport.runtime.EncodedPayload r11 = r12.getEncodedPayload()
            byte[] r11 = r11.getBytes()
            int r2 = r11.length
            r3 = 0
            r4 = 1
            if (r2 > r10) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "context_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r6, r0)
            java.lang.String r0 = "transport_name"
            java.lang.String r1 = r12.getTransportName()
            r5.put(r0, r1)
            long r0 = r12.getEventMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "timestamp_ms"
            r5.put(r1, r0)
            long r0 = r12.getUptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "uptime_ms"
            r5.put(r1, r0)
            com.google.android.datatransport.runtime.EncodedPayload r0 = r12.getEncodedPayload()
            com.google.android.datatransport.Encoding r0 = r0.getEncoding()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "payload_encoding"
            r5.put(r1, r0)
            java.lang.String r0 = "code"
            java.lang.Integer r1 = r12.getCode()
            r5.put(r0, r1)
            java.lang.String r0 = "num_attempts"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5.put(r0, r1)
            java.lang.String r0 = "inline"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r5.put(r0, r1)
            if (r2 == 0) goto L88
            r0 = r11
            goto L8a
        L88:
            byte[] r0 = new byte[r3]
        L8a:
            java.lang.String r1 = "payload"
            r5.put(r1, r0)
            java.lang.String r0 = "events"
            r1 = 0
            long r5 = r13.insert(r0, r1, r5)
            java.lang.String r0 = "event_id"
            if (r2 != 0) goto Ld6
            int r2 = r11.length
            double r2 = (double) r2
            double r7 = (double) r10
            double r2 = r2 / r7
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
        La3:
            if (r4 > r2) goto Ld6
            int r3 = r4 + (-1)
            int r3 = r3 * r10
            int r7 = r4 * r10
            int r8 = r11.length
            int r7 = java.lang.Math.min(r7, r8)
            byte[] r3 = java.util.Arrays.copyOfRange(r11, r3, r7)
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r7.put(r0, r8)
            java.lang.String r8 = "sequence_num"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r7.put(r8, r9)
            java.lang.String r8 = "bytes"
            r7.put(r8, r3)
            java.lang.String r3 = "event_payloads"
            r13.insert(r3, r1, r7)
            int r4 = r4 + 1
            goto La3
        Ld6:
            java.util.Map r10 = r12.getMetadata()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        Le2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L117
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r12.put(r0, r2)
            java.lang.Object r2 = r11.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "name"
            r12.put(r3, r2)
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r2 = "value"
            r12.put(r2, r11)
            java.lang.String r11 = "event_metadata"
            r13.insert(r11, r1, r12)
            goto Le2
        L117:
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            return r10
    }

    static /* synthetic */ byte[] lambda$readPayload$13(android.database.Cursor r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            boolean r3 = r6.moveToNext()
            if (r3 == 0) goto L17
            byte[] r3 = r6.getBlob(r1)
            r0.add(r3)
            int r3 = r3.length
            int r2 = r2 + r3
            goto L7
        L17:
            byte[] r6 = new byte[r2]
            r2 = 0
            r3 = 0
        L1b:
            int r4 = r0.size()
            if (r2 >= r4) goto L30
            java.lang.Object r4 = r0.get(r2)
            byte[] r4 = (byte[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r6, r3, r5)
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L1b
        L30:
            return r6
    }

    static /* synthetic */ java.lang.Object lambda$recordFailure$3(java.lang.String r0, android.database.sqlite.SQLiteDatabase r1) {
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            r0.execute()
            java.lang.String r0 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            r0.execute()
            r0 = 0
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$recordNextCallTime$6(long r3, com.google.android.datatransport.runtime.TransportContext r5, android.database.sqlite.SQLiteDatabase r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "next_request_ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r1, r3)
            java.lang.String r3 = r5.getBackendName()
            com.google.android.datatransport.Priority r4 = r5.getPriority()
            int r4 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r4 = "transport_contexts"
            java.lang.String r1 = "backend_name = ? and priority = ?"
            int r3 = r6.update(r4, r0, r1, r3)
            r1 = 1
            r2 = 0
            if (r3 >= r1) goto L4b
            java.lang.String r3 = "backend_name"
            java.lang.String r1 = r5.getBackendName()
            r0.put(r3, r1)
            com.google.android.datatransport.Priority r3 = r5.getPriority()
            int r3 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "priority"
            r0.put(r5, r3)
            r6.insert(r4, r2, r0)
        L4b:
            return r2
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadEvents(android.database.sqlite.SQLiteDatabase r21, com.google.android.datatransport.runtime.TransportContext r22) {
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Long r2 = r20.getTransportContextId(r21, r22)
            if (r2 != 0) goto Le
            return r1
        Le:
            java.lang.String r9 = "code"
            java.lang.String r10 = "inline"
            java.lang.String r3 = "_id"
            java.lang.String r4 = "transport_name"
            java.lang.String r5 = "timestamp_ms"
            java.lang.String r6 = "uptime_ms"
            java.lang.String r7 = "payload_encoding"
            java.lang.String r8 = "payload"
            java.lang.String[] r13 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10}
            java.lang.String r2 = r2.toString()
            java.lang.String[] r15 = new java.lang.String[]{r2}
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = r0.config
            int r2 = r2.getLoadBatchSize()
            java.lang.String r19 = java.lang.String.valueOf(r2)
            java.lang.String r12 = "events"
            java.lang.String r14 = "context_id = ?"
            r16 = 0
            r17 = 0
            r18 = 0
            r11 = r21
            android.database.Cursor r2 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = r22
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r3 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$15.lambdaFactory$(r0, r1, r3)
            tryWithCursor(r2, r3)
            return r1
    }

    private java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> loadMetadata(android.database.sqlite.SQLiteDatabase r13, java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r14) {
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "event_id IN ("
            r1.<init>(r2)
            r2 = 0
        Ld:
            int r3 = r14.size()
            if (r2 >= r3) goto L30
            java.lang.Object r3 = r14.get(r2)
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r3 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r3
            long r3 = r3.getId()
            r1.append(r3)
            int r3 = r14.size()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L2d
            r3 = 44
            r1.append(r3)
        L2d:
            int r2 = r2 + 1
            goto Ld
        L30:
            r14 = 41
            r1.append(r14)
            java.lang.String r14 = "name"
            java.lang.String r2 = "value"
            java.lang.String r3 = "event_id"
            java.lang.String[] r6 = new java.lang.String[]{r3, r14, r2}
            java.lang.String r7 = r1.toString()
            r10 = 0
            r11 = 0
            java.lang.String r5 = "event_metadata"
            r8 = 0
            r9 = 0
            r4 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r14 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$17.lambdaFactory$(r0)
            tryWithCursor(r13, r14)
            return r0
    }

    private static byte[] maybeBase64Decode(@androidx.annotation.Nullable java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    private byte[] readPayload(long r9) {
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getDb()
            java.lang.String r1 = "bytes"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String[] r4 = new java.lang.String[]{r9}
            r6 = 0
            java.lang.String r7 = "sequence_num"
            java.lang.String r1 = "event_payloads"
            java.lang.String r3 = "event_id = ?"
            r5 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r10 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$16.lambdaFactory$()
            java.lang.Object r9 = tryWithCursor(r9, r10)
            byte[] r9 = (byte[]) r9
            return r9
    }

    private <T> T retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer<T> r9, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<java.lang.Throwable, T> r10) {
            r8 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r8.monotonicClock
            long r0 = r0.getTime()
        L6:
            java.lang.Object r9 = r9.produce()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> Lb
            return r9
        Lb:
            r2 = move-exception
            com.google.android.datatransport.runtime.time.Clock r3 = r8.monotonicClock
            long r3 = r3.getTime()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r5 = r8.config
            int r5 = r5.getCriticalSectionEnterTimeoutMs()
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L23
            java.lang.Object r9 = r10.apply(r2)
            return r9
        L23:
            r2 = 50
            android.os.SystemClock.sleep(r2)
            goto L6
    }

    private static com.google.android.datatransport.Encoding toEncoding(@androidx.annotation.Nullable java.lang.String r0) {
            if (r0 != 0) goto L5
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.PROTOBUF_ENCODING
            return r0
        L5:
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            return r0
    }

    private static java.lang.String toIdList(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r1
            long r1 = r1.getId()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Lb
            r1 = 44
            r0.append(r1)
            goto Lb
        L2a:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @androidx.annotation.VisibleForTesting
    static <T> T tryWithCursor(android.database.Cursor r0, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.Cursor, T> r1) {
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L8
            r0.close()
            return r1
        L8:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
            r4 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r4.wallClock
            long r0 = r0.getTime()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = r4.config
            long r2 = r2.getEventCleanUpAge()
            long r0 = r0 - r2
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$13.lambdaFactory$(r0)
            java.lang.Object r0 = r4.inTransaction(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public void clearDb() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$14.lambdaFactory$()
            r1.inTransaction(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = r1.schemaManager
            r0.close()
            return
    }

    @androidx.annotation.VisibleForTesting
    long getByteSize() {
            r4 = this;
            long r0 = r4.getPageCount()
            long r2 = r4.getPageSize()
            long r0 = r0 * r2
            return r0
    }

    @androidx.annotation.VisibleForTesting
    android.database.sqlite.SQLiteDatabase getDb() {
            r2 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = r2.schemaManager
            r0.getClass()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Producer r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$1.lambdaFactory$(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$4.lambdaFactory$()
            java.lang.Object r0 = r2.retryIfDbLocked(r0, r1)
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(com.google.android.datatransport.runtime.TransportContext r3) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            java.lang.String r1 = r3.getBackendName()
            com.google.android.datatransport.Priority r3 = r3.getPriority()
            int r3 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r3 = new java.lang.String[]{r1, r3}
            java.lang.String r1 = "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"
            android.database.Cursor r3 = r0.rawQuery(r1, r3)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$8.lambdaFactory$()
            java.lang.Object r3 = tryWithCursor(r3, r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext r1) {
            r0 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$9.lambdaFactory$(r0, r1)
            java.lang.Object r1 = r0.inTransaction(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @androidx.annotation.VisibleForTesting
    <T> T inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.sqlite.SQLiteDatabase, T> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getDb()
            r0.beginTransaction()
            java.lang.Object r2 = r2.apply(r0)     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r2
        L12:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$12.lambdaFactory$()
            java.lang.Object r0 = r1.inTransaction(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext r1) {
            r0 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$11.lambdaFactory$(r0, r1)
            java.lang.Object r1 = r0.inTransaction(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            return r1
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @androidx.annotation.Nullable
    public com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext r6, com.google.android.datatransport.runtime.EventInternal r7) {
            r5 = this;
            com.google.android.datatransport.Priority r0 = r6.getPriority()
            java.lang.String r1 = r7.getTransportName()
            java.lang.String r2 = r6.getBackendName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "SQLiteEventStore"
            java.lang.String r1 = "Storing event with priority=%s, name=%s for destination %s"
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r1, r3)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$5.lambdaFactory$(r5, r6, r7)
            java.lang.Object r0 = r5.inTransaction(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L35
            r6 = 0
            return r6
        L35:
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r6 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r0, r6, r7)
            return r6
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            r0.append(r1)
            java.lang.String r3 = toIdList(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r3 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$7.lambdaFactory$(r3)
            r2.inTransaction(r3)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext r1, long r2) {
            r0 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$10.lambdaFactory$(r2, r1)
            r0.inTransaction(r1)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DELETE FROM events WHERE _id in "
            r0.append(r1)
            java.lang.String r3 = toIdList(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            android.database.sqlite.SQLiteStatement r3 = r0.compileStatement(r3)
            r3.execute()
            return
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getDb()
            r1.ensureBeginTransaction(r0)
            java.lang.Object r2 = r2.execute()     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r2
        L12:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }
}
