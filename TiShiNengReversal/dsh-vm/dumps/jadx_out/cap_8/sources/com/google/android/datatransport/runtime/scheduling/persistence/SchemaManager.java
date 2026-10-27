package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class SchemaManager extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final java.lang.String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final java.lang.String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final java.lang.String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final java.lang.String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final java.lang.String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final java.lang.String DB_NAME = "com.google.android.datatransport.events";
    private static final java.lang.String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final java.lang.String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final java.lang.String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final java.lang.String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration> INCREMENTAL_MIGRATIONS = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V1 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V2 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V3 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V4 = null;
    static int SCHEMA_VERSION = 4;
    private boolean configured;
    private final int schemaVersion;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Migration {
        void upgrade(android.database.sqlite.SQLiteDatabase r1);
    }

    static {
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$1.lambdaFactory$()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V1 = r0
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r1 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2.lambdaFactory$()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V2 = r1
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r2 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$3.lambdaFactory$()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V3 = r2
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r3 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$4.lambdaFactory$()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V4 = r3
            r4 = 4
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration[] r4 = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.List r0 = java.util.Arrays.asList(r4)
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS = r0
            return
    }

    @javax.inject.Inject
    SchemaManager(android.content.Context r2, @javax.inject.Named("SQLITE_DB_NAME") java.lang.String r3, @javax.inject.Named("SCHEMA_VERSION") int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            r2 = 0
            r1.configured = r2
            r1.schemaVersion = r4
            return
    }

    private void ensureConfigured(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            boolean r0 = r1.configured
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            return
    }

    static /* synthetic */ void lambda$static$0(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX events_backend_id on events(context_id)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)"
            r1.execSQL(r0)
            return
    }

    static /* synthetic */ void lambda$static$1(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE transport_contexts ADD COLUMN extras BLOB"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)"
            r1.execSQL(r0)
            java.lang.String r0 = "DROP INDEX contexts_backend_priority"
            r1.execSQL(r0)
            return
    }

    static /* synthetic */ void lambda$static$2(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN payload_encoding TEXT"
            r1.execSQL(r0)
            return
    }

    static /* synthetic */ void lambda$static$3(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1"
            r1.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))"
            r1.execSQL(r0)
            return
    }

    private void onCreate(android.database.sqlite.SQLiteDatabase r2, int r3) {
            r1 = this;
            r1.ensureConfigured(r2)
            r0 = 0
            r1.upgrade(r2, r0, r3)
            return
    }

    private void upgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            r3 = this;
            java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration> r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS
            int r1 = r0.size()
            if (r6 > r1) goto L19
        L8:
            if (r5 >= r6) goto L18
            java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration> r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS
            java.lang.Object r0 = r0.get(r5)
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r0 = (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration) r0
            r0.upgrade(r4)
            int r5 = r5 + 1
            goto L8
        L18:
            return
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Migration from "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " to "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " was requested, but cannot be performed. Only "
            r1.append(r5)
            int r5 = r0.size()
            r1.append(r5)
            java.lang.String r5 = " migrations are provided"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            r0 = 1
            r3.configured = r0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "PRAGMA busy_timeout=0;"
            android.database.Cursor r1 = r4.rawQuery(r2, r1)
            r1.close()
            r4.setForeignKeyConstraintsEnabled(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            int r0 = r1.schemaVersion
            r1.onCreate(r2, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE events"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE event_metadata"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE transport_contexts"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r2)
            r0.onCreate(r1, r3)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.ensureConfigured(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            r0.ensureConfigured(r1)
            r0.upgrade(r1, r2, r3)
            return
    }
}
