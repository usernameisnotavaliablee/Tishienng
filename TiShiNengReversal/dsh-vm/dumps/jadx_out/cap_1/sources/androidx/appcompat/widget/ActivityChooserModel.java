package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ActivityChooserModel extends android.database.DataSetObservable {
    static final java.lang.String ATTRIBUTE_ACTIVITY = "activity";
    static final java.lang.String ATTRIBUTE_TIME = "time";
    static final java.lang.String ATTRIBUTE_WEIGHT = "weight";
    static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final java.lang.String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    static final java.lang.String LOG_TAG = "ActivityChooserModel";
    static final java.lang.String TAG_HISTORICAL_RECORD = "historical-record";
    static final java.lang.String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> sDataModelRegistry = null;
    private static final java.lang.Object sRegistryLock = null;
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mActivities;
    private androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
    private androidx.appcompat.widget.ActivityChooserModel.ActivitySorter mActivitySorter;
    boolean mCanReadHistoricalData;
    final android.content.Context mContext;
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    final java.lang.String mHistoryFileName;
    private int mHistoryMaxSize;
    private final java.lang.Object mInstanceLock;
    private android.content.Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ActivityResolveInfo implements java.lang.Comparable<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> {
        public final android.content.pm.ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(android.content.pm.ResolveInfo r1) {
                r0 = this;
                r0.<init>()
                r0.resolveInfo = r1
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo r2) {
                r1 = this;
                float r2 = r2.weight
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r0 = r1.weight
                int r0 = java.lang.Float.floatToIntBits(r0)
                int r2 = r2 - r0
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo r1) {
                r0 = this;
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r2 = androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L11
                return r1
            L11:
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r5 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r5
                float r2 = r4.weight
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r5 = r5.weight
                int r5 = java.lang.Float.floatToIntBits(r5)
                if (r2 == r5) goto L22
                return r1
            L22:
                return r0
        }

        public int hashCode() {
                r1 = this;
                float r0 = r1.weight
                int r0 = java.lang.Float.floatToIntBits(r0)
                int r0 = r0 + 31
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "resolveInfo:"
                r0.append(r1)
                android.content.pm.ResolveInfo r1 = r4.resolveInfo
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "; weight:"
                r0.append(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                float r2 = r4.weight
                double r2 = (double) r2
                r1.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ActivitySorter {
        void sort(android.content.Intent r1, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> r2, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultSorter implements androidx.appcompat.widget.ActivityChooserModel.ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap;

        DefaultSorter() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mPackageNameToActivityMap = r0
                return
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(android.content.Intent r7, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> r8, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> r9) {
                r6 = this;
                java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r7 = r6.mPackageNameToActivityMap
                r7.clear()
                int r0 = r8.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L28
                java.lang.Object r2 = r8.get(r1)
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r2 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r2
                r3 = 0
                r2.weight = r3
                android.content.ComponentName r3 = new android.content.ComponentName
                android.content.pm.ResolveInfo r4 = r2.resolveInfo
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r5 = r4.packageName
                java.lang.String r4 = r4.name
                r3.<init>(r5, r4)
                r7.put(r3, r2)
                int r1 = r1 + 1
                goto La
            L28:
                int r0 = r9.size()
                int r0 = r0 + (-1)
                r1 = 1065353216(0x3f800000, float:1.0)
            L30:
                if (r0 < 0) goto L53
                java.lang.Object r2 = r9.get(r0)
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r2 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r2
                android.content.ComponentName r3 = r2.activity
                java.lang.Object r3 = r7.get(r3)
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r3 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r3
                if (r3 == 0) goto L50
                float r4 = r3.weight
                float r2 = r2.weight
                float r2 = r2 * r1
                float r4 = r4 + r2
                r3.weight = r4
                r2 = 1064514355(0x3f733333, float:0.95)
                float r1 = r1 * r2
            L50:
                int r0 = r0 + (-1)
                goto L30
            L53:
                java.util.Collections.sort(r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HistoricalRecord {
        public final android.content.ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(android.content.ComponentName r1, long r2, float r4) {
                r0 = this;
                r0.<init>()
                r0.activity = r1
                r0.time = r2
                r0.weight = r4
                return
        }

        public HistoricalRecord(java.lang.String r1, long r2, float r4) {
                r0 = this;
                android.content.ComponentName r1 = android.content.ComponentName.unflattenFromString(r1)
                r0.<init>(r1, r2, r4)
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 != 0) goto L8
                return r1
            L8:
                java.lang.Class<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r2 = androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L11
                return r1
            L11:
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r8 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r8
                android.content.ComponentName r2 = r7.activity
                if (r2 != 0) goto L1c
                android.content.ComponentName r2 = r8.activity
                if (r2 == 0) goto L25
                return r1
            L1c:
                android.content.ComponentName r3 = r8.activity
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L25
                return r1
            L25:
                long r2 = r7.time
                long r4 = r8.time
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L2e
                return r1
            L2e:
                float r2 = r7.weight
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r8 = r8.weight
                int r8 = java.lang.Float.floatToIntBits(r8)
                if (r2 == r8) goto L3d
                return r1
            L3d:
                return r0
        }

        public int hashCode() {
                r6 = this;
                android.content.ComponentName r0 = r6.activity
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                r1 = 31
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r2 = r6.time
                r4 = 32
                long r4 = r2 >>> r4
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r0 = r0 + r3
                int r0 = r0 * 31
                float r1 = r6.weight
                int r1 = java.lang.Float.floatToIntBits(r1)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "; activity:"
                r0.append(r1)
                android.content.ComponentName r1 = r4.activity
                r0.append(r1)
                java.lang.String r1 = "; time:"
                r0.append(r1)
                long r1 = r4.time
                r0.append(r1)
                java.lang.String r1 = "; weight:"
                r0.append(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                float r2 = r4.weight
                double r2 = (double) r2
                r1.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnChooseActivityListener {
        boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel r1, android.content.Intent r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PersistHistoryAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserModel this$0;

        PersistHistoryAsyncTask(androidx.appcompat.widget.ActivityChooserModel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.doInBackground2(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public java.lang.Void doInBackground2(java.lang.Object... r14) {
                r13 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                r2 = 0
                r3 = r14[r2]
                java.util.List r3 = (java.util.List) r3
                r4 = 1
                r14 = r14[r4]
                java.lang.String r14 = (java.lang.String) r14
                r5 = 0
                androidx.appcompat.widget.ActivityChooserModel r6 = r13.this$0     // Catch: java.io.FileNotFoundException -> La4
                android.content.Context r6 = r6.mContext     // Catch: java.io.FileNotFoundException -> La4
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> La4
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                int r7 = r3.size()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r8 = 0
            L2d:
                if (r8 >= r7) goto L62
                java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r9 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r9     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r10 = "activity"
                android.content.ComponentName r11 = r9.activity     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r10 = "time"
                long r11 = r9.time     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r10 = "weight"
                float r9 = r9.weight     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                int r8 = r8 + 1
                goto L2d
            L60:
                r0 = move-exception
                goto L9a
            L62:
                r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                r6.endDocument()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L72 java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L8c
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0
                r0.mCanReadHistoricalData = r4
                if (r14 == 0) goto L99
            L6e:
                r14.close()     // Catch: java.io.IOException -> L99
                goto L99
            L72:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0     // Catch: java.lang.Throwable -> L60
                java.lang.String r0 = r0.mHistoryFileName     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0
                r0.mCanReadHistoricalData = r4
                if (r14 == 0) goto L99
                goto L6e
            L7f:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0     // Catch: java.lang.Throwable -> L60
                java.lang.String r0 = r0.mHistoryFileName     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0
                r0.mCanReadHistoricalData = r4
                if (r14 == 0) goto L99
                goto L6e
            L8c:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0     // Catch: java.lang.Throwable -> L60
                java.lang.String r0 = r0.mHistoryFileName     // Catch: java.lang.Throwable -> L60
                androidx.appcompat.widget.ActivityChooserModel r0 = r13.this$0
                r0.mCanReadHistoricalData = r4
                if (r14 == 0) goto L99
                goto L6e
            L99:
                return r5
            L9a:
                androidx.appcompat.widget.ActivityChooserModel r1 = r13.this$0
                r1.mCanReadHistoricalData = r4
                if (r14 == 0) goto La3
                r14.close()     // Catch: java.io.IOException -> La3
            La3:
                throw r0
            La4:
                java.lang.String r14 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG
                return r5
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.ActivityChooserModel.sRegistryLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.appcompat.widget.ActivityChooserModel.sDataModelRegistry = r0
            return
    }

    private ActivityChooserModel(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mInstanceLock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mActivities = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mHistoricalRecords = r0
            androidx.appcompat.widget.ActivityChooserModel$DefaultSorter r0 = new androidx.appcompat.widget.ActivityChooserModel$DefaultSorter
            r0.<init>()
            r2.mActivitySorter = r0
            r0 = 50
            r2.mHistoryMaxSize = r0
            r0 = 1
            r2.mCanReadHistoricalData = r0
            r1 = 0
            r2.mReadShareHistoryCalled = r1
            r2.mHistoricalRecordsChanged = r0
            r2.mReloadActivities = r1
            android.content.Context r3 = r3.getApplicationContext()
            r2.mContext = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L53
            java.lang.String r3 = ".xml"
            boolean r0 = r4.endsWith(r3)
            if (r0 != 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.mHistoryFileName = r3
            return
        L53:
            r2.mHistoryFileName = r4
            return
    }

    private boolean addHistoricalRecord(androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord r2) {
            r1 = this;
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r1.mHistoricalRecords
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto L17
            r0 = 1
            r1.mHistoricalRecordsChanged = r0
            r1.pruneExcessiveHistoricalRecordsIfNeeded()
            r1.persistHistoricalDataIfNeeded()
            r1.sortActivitiesIfNeeded()
            r1.notifyChanged()
        L17:
            return r2
    }

    private void ensureConsistentState() {
            r2 = this;
            boolean r0 = r2.loadActivitiesIfNeeded()
            boolean r1 = r2.readHistoricalDataIfNeeded()
            r0 = r0 | r1
            r2.pruneExcessiveHistoricalRecordsIfNeeded()
            if (r0 == 0) goto L14
            r2.sortActivitiesIfNeeded()
            r2.notifyChanged()
        L14:
            return
    }

    public static androidx.appcompat.widget.ActivityChooserModel get(android.content.Context r3, java.lang.String r4) {
            java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.sRegistryLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> r1 = androidx.appcompat.widget.ActivityChooserModel.sDataModelRegistry     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            androidx.appcompat.widget.ActivityChooserModel r2 = (androidx.appcompat.widget.ActivityChooserModel) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            androidx.appcompat.widget.ActivityChooserModel r2 = new androidx.appcompat.widget.ActivityChooserModel     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    private boolean loadActivitiesIfNeeded() {
            r6 = this;
            boolean r0 = r6.mReloadActivities
            r1 = 0
            if (r0 == 0) goto L37
            android.content.Intent r0 = r6.mIntent
            if (r0 == 0) goto L37
            r6.mReloadActivities = r1
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r0 = r6.mActivities
            r0.clear()
            android.content.Context r0 = r6.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = r6.mIntent
            java.util.List r0 = r0.queryIntentActivities(r2, r1)
            int r2 = r0.size()
        L20:
            if (r1 >= r2) goto L35
            java.lang.Object r3 = r0.get(r1)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r4 = r6.mActivities
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r5 = new androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo
            r5.<init>(r3)
            r4.add(r5)
            int r1 = r1 + 1
            goto L20
        L35:
            r0 = 1
            return r0
        L37:
            return r1
    }

    private void persistHistoricalDataIfNeeded() {
            r6 = this;
            boolean r0 = r6.mReadShareHistoryCalled
            if (r0 == 0) goto L30
            boolean r0 = r6.mHistoricalRecordsChanged
            if (r0 != 0) goto L9
            goto L2f
        L9:
            r0 = 0
            r6.mHistoricalRecordsChanged = r0
            java.lang.String r1 = r6.mHistoryFileName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2f
            androidx.appcompat.widget.ActivityChooserModel$PersistHistoryAsyncTask r1 = new androidx.appcompat.widget.ActivityChooserModel$PersistHistoryAsyncTask
            r1.<init>(r6)
            java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r4 = r6.mHistoricalRecords
            r3.<init>(r4)
            java.lang.String r4 = r6.mHistoryFileName
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r3
            r0 = 1
            r5[r0] = r4
            r1.executeOnExecutor(r2, r5)
        L2f:
            return
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No preceding call to #readHistoricalData"
            r0.<init>(r1)
            throw r0
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
            r4 = this;
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r4.mHistoricalRecords
            int r0 = r0.size()
            int r1 = r4.mHistoryMaxSize
            int r0 = r0 - r1
            if (r0 > 0) goto Lc
            goto L1e
        Lc:
            r1 = 1
            r4.mHistoricalRecordsChanged = r1
            r1 = 0
            r2 = 0
        L11:
            if (r2 >= r0) goto L1e
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r3 = r4.mHistoricalRecords
            java.lang.Object r3 = r3.remove(r1)
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r3 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r3
            int r2 = r2 + 1
            goto L11
        L1e:
            return
    }

    private boolean readHistoricalDataIfNeeded() {
            r2 = this;
            boolean r0 = r2.mCanReadHistoricalData
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r2.mHistoricalRecordsChanged
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.mHistoryFileName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            r2.mCanReadHistoricalData = r1
            r0 = 1
            r2.mReadShareHistoryCalled = r0
            r2.readHistoricalDataImpl()
            return r0
        L1a:
            return r1
    }

    private void readHistoricalDataImpl() {
            r9 = this;
            android.content.Context r0 = r9.mContext     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r9.mHistoryFileName     // Catch: java.lang.Throwable -> L98
            java.io.FileInputStream r0 = r0.openFileInput(r1)     // Catch: java.lang.Throwable -> L98
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r2 = "UTF-8"
            r1.setInput(r0, r2)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            r2 = 0
        L12:
            r3 = 1
            if (r2 == r3) goto L24
            r4 = 2
            if (r2 == r4) goto L24
            int r2 = r1.next()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            goto L12
        L1d:
            r1 = move-exception
            goto L89
        L1f:
            goto L8f
        L21:
            goto L95
        L24:
            java.lang.String r2 = "historical-records"
            java.lang.String r4 = r1.getName()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            if (r2 == 0) goto L81
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r2 = r9.mHistoricalRecords     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            r2.clear()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
        L35:
            int r4 = r1.next()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            if (r4 != r3) goto L41
            if (r0 == 0) goto L98
            r0.close()
            return
        L41:
            r5 = 3
            if (r4 == r5) goto L35
            r5 = 4
            if (r4 != r5) goto L48
            goto L35
        L48:
            java.lang.String r4 = r1.getName()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r5 = "historical-record"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            if (r4 == 0) goto L79
            java.lang.String r4 = "activity"
            r5 = 0
            java.lang.String r4 = r1.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r6 = "time"
            java.lang.String r6 = r1.getAttributeValue(r5, r6)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r8 = "weight"
            java.lang.String r5 = r1.getAttributeValue(r5, r8)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r8 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            r8.<init>(r4, r6, r5)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            r2.add(r8)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            goto L35
        L79:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r2 = "Share records file not well-formed."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            throw r1     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
        L81:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            java.lang.String r2 = "Share records file does not start with historical-records tag."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
            throw r1     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f org.xmlpull.v1.XmlPullParserException -> L21
        L89:
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.io.IOException -> L8e
        L8e:
            throw r1
        L8f:
            if (r0 == 0) goto L98
        L91:
            r0.close()     // Catch: java.lang.Throwable -> L98
            goto L98
        L95:
            if (r0 == 0) goto L98
            goto L91
        L98:
            return
    }

    private boolean sortActivitiesIfNeeded() {
            r4 = this;
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r0 = r4.mActivitySorter
            if (r0 == 0) goto L29
            android.content.Intent r0 = r4.mIntent
            if (r0 == 0) goto L29
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r0 = r4.mActivities
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r4.mHistoricalRecords
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r0 = r4.mActivitySorter
            android.content.Intent r1 = r4.mIntent
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r2 = r4.mActivities
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r3 = r4.mHistoricalRecords
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r0.sort(r1, r2, r3)
            r0 = 1
            return r0
        L29:
            r0 = 0
            return r0
    }

    public android.content.Intent chooseActivity(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r6.mIntent     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 != 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r7 = move-exception
            goto L51
        Lc:
            r6.ensureConsistentState()     // Catch: java.lang.Throwable -> La
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r6.mActivities     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r7 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r7     // Catch: java.lang.Throwable -> La
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La
            android.content.pm.ResolveInfo r7 = r7.resolveInfo     // Catch: java.lang.Throwable -> La
            android.content.pm.ActivityInfo r7 = r7.activityInfo     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = r7.packageName     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = r7.name     // Catch: java.lang.Throwable -> La
            r1.<init>(r3, r7)     // Catch: java.lang.Throwable -> La
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            android.content.Intent r3 = r6.mIntent     // Catch: java.lang.Throwable -> La
            r7.<init>(r3)     // Catch: java.lang.Throwable -> La
            r7.setComponent(r1)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener r3 = r6.mActivityChoserModelPolicy     // Catch: java.lang.Throwable -> La
            if (r3 == 0) goto L41
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            r3.<init>(r7)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener r4 = r6.mActivityChoserModelPolicy     // Catch: java.lang.Throwable -> La
            boolean r3 = r4.onChooseActivity(r6, r3)     // Catch: java.lang.Throwable -> La
            if (r3 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L41:
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r2 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> La
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> La
            r6.addHistoricalRecord(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r7
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r7
    }

    public android.content.pm.ResolveInfo getActivity(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> L12
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r2.mActivities     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L12
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r3 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r3     // Catch: java.lang.Throwable -> L12
            android.content.pm.ResolveInfo r3 = r3.resolveInfo     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public int getActivityCount() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r2.mActivities     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public int getActivityIndex(android.content.pm.ResolveInfo r6) {
            r5 = this;
            java.lang.Object r0 = r5.mInstanceLock
            monitor-enter(r0)
            r5.ensureConsistentState()     // Catch: java.lang.Throwable -> L1b
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r5.mActivities     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
        Ld:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r4 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r4     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ResolveInfo r4 = r4.resolveInfo     // Catch: java.lang.Throwable -> L1b
            if (r4 != r6) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r6 = move-exception
            goto L23
        L1d:
            int r3 = r3 + 1
            goto Ld
        L20:
            r6 = -1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
    }

    public android.content.pm.ResolveInfo getDefaultActivity() {
            r3 = this;
            java.lang.Object r0 = r3.mInstanceLock
            monitor-enter(r0)
            r3.ensureConsistentState()     // Catch: java.lang.Throwable -> L1b
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r3.mActivities     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r3.mActivities     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1b
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ResolveInfo r1 = r1.resolveInfo     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            return r0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public int getHistoryMaxSize() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public int getHistorySize() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r1 = r2.mHistoricalRecords     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public android.content.Intent getIntent() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r2.mIntent     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void setActivitySorter(androidx.appcompat.widget.ActivityChooserModel.ActivitySorter r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r1 = r2.mActivitySorter     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L18
        Lb:
            r2.mActivitySorter = r3     // Catch: java.lang.Throwable -> L9
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L16
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L9
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public void setDefaultActivity(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.mInstanceLock
            monitor-enter(r0)
            r5.ensureConsistentState()     // Catch: java.lang.Throwable -> L22
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r5.mActivities     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r6 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r6     // Catch: java.lang.Throwable -> L22
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r5.mActivities     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            float r1 = r1.weight     // Catch: java.lang.Throwable -> L22
            float r2 = r6.weight     // Catch: java.lang.Throwable -> L22
            float r1 = r1 - r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 + r2
            goto L26
        L22:
            r6 = move-exception
            goto L41
        L24:
            r1 = 1065353216(0x3f800000, float:1.0)
        L26:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L22
            android.content.pm.ResolveInfo r6 = r6.resolveInfo     // Catch: java.lang.Throwable -> L22
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r6.packageName     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.name     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r6 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L22
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L22
            r5.addHistoricalRecord(r6)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r6
    }

    public void setHistoryMaxSize(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L1b
        Lb:
            r2.mHistoryMaxSize = r3     // Catch: java.lang.Throwable -> L9
            r2.pruneExcessiveHistoricalRecordsIfNeeded()     // Catch: java.lang.Throwable -> L9
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L19
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public void setIntent(android.content.Intent r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r2.mIntent     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L15
        Lb:
            r2.mIntent = r3     // Catch: java.lang.Throwable -> L9
            r3 = 1
            r2.mReloadActivities = r3     // Catch: java.lang.Throwable -> L9
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public void setOnChooseActivityListener(androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInstanceLock
            monitor-enter(r0)
            r1.mActivityChoserModelPolicy = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
