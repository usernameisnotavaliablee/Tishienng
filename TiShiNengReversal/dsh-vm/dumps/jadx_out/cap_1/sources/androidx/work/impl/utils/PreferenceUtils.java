package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PreferenceUtils {
    public static final java.lang.String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    public static final java.lang.String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final java.lang.String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
    private final androidx.work.impl.WorkDatabase mWorkDatabase;


    public PreferenceUtils(@androidx.annotation.NonNull androidx.work.impl.WorkDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkDatabase = r1
            return
    }

    public static void migrateLegacyPreferences(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull androidx.sqlite.db.SupportSQLiteDatabase r10) {
            java.lang.String r0 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
            java.lang.String r1 = "androidx.work.util.preferences"
            r2 = 0
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r1, r2)
            java.lang.String r1 = "reschedule_needed"
            boolean r3 = r9.contains(r1)
            java.lang.String r4 = "last_cancel_all_time_ms"
            if (r3 != 0) goto L1b
            boolean r3 = r9.contains(r4)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            r5 = 0
            long r7 = r9.getLong(r4, r5)
            boolean r3 = r9.getBoolean(r1, r2)
            if (r3 == 0) goto L29
            r5 = 1
        L29:
            r10.beginTransaction()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5a
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5a
            r8[r2] = r4     // Catch: java.lang.Throwable -> L5a
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L5a
            r10.execSQL(r0, r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5a
            r5[r2] = r1     // Catch: java.lang.Throwable -> L5a
            r5[r4] = r3     // Catch: java.lang.Throwable -> L5a
            r10.execSQL(r0, r5)     // Catch: java.lang.Throwable -> L5a
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L5a
            android.content.SharedPreferences$Editor r9 = r9.clear()     // Catch: java.lang.Throwable -> L5a
            r9.apply()     // Catch: java.lang.Throwable -> L5a
            r10.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5a
            r10.endTransaction()
            return
        L5a:
            r9 = move-exception
            r10.endTransaction()
            throw r9
    }

    public long getLastCancelAllTimeMillis() {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()
            java.lang.String r1 = "last_cancel_all_time_ms"
            java.lang.Long r0 = r0.getLongValue(r1)
            if (r0 == 0) goto L13
            long r0 = r0.longValue()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()
            java.lang.String r1 = "last_cancel_all_time_ms"
            androidx.lifecycle.LiveData r0 = r0.getObservableLongValue(r1)
            androidx.work.impl.utils.PreferenceUtils$1 r1 = new androidx.work.impl.utils.PreferenceUtils$1
            r1.<init>(r2)
            androidx.lifecycle.LiveData r0 = androidx.lifecycle.Transformations.map(r0, r1)
            return r0
    }

    public boolean getNeedsReschedule() {
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()
            java.lang.String r1 = "reschedule_needed"
            java.lang.Long r0 = r0.getLongValue(r1)
            if (r0 == 0) goto L1a
            long r0 = r0.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public void setLastCancelAllTimeMillis(long r3) {
            r2 = this;
            androidx.work.impl.model.Preference r0 = new androidx.work.impl.model.Preference
            java.lang.String r1 = "last_cancel_all_time_ms"
            r0.<init>(r1, r3)
            androidx.work.impl.WorkDatabase r3 = r2.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r3 = r3.preferenceDao()
            r3.insertPreference(r0)
            return
    }

    public void setNeedsReschedule(boolean r3) {
            r2 = this;
            androidx.work.impl.model.Preference r0 = new androidx.work.impl.model.Preference
            java.lang.String r1 = "reschedule_needed"
            r0.<init>(r1, r3)
            androidx.work.impl.WorkDatabase r3 = r2.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r3 = r3.preferenceDao()
            r3.insertPreference(r0)
            return
    }
}
