package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final java.lang.String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock;
        final java.util.Queue<java.lang.Runnable> mTasks;

        SerialExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.mTasks = r0
                r1.mExecutor = r2
                return
        }

        public static /* synthetic */ void a(androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor r0, java.lang.Runnable r1) {
                r0.getClass()
                r1.run()     // Catch: java.lang.Throwable -> La
                r0.scheduleNext()
                return
            La:
                r1 = move-exception
                r0.scheduleNext()
                throw r1
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L15
                androidx.appcompat.app.r r2 = new androidx.appcompat.app.r     // Catch: java.lang.Throwable -> L15
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L15
                r1.add(r2)     // Catch: java.lang.Throwable -> L15
                java.lang.Runnable r4 = r3.mActive     // Catch: java.lang.Throwable -> L15
                if (r4 != 0) goto L17
                r3.scheduleNext()     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r4 = move-exception
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r4
        }

        protected void scheduleNext() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L15
                r3.mActive = r1     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L17
                java.util.concurrent.Executor r2 = r3.mExecutor     // Catch: java.lang.Throwable -> L15
                r2.execute(r1)     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r1 = move-exception
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    private AppLocalesStorageHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static void persistLocales(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6) {
            java.lang.String r0 = "locales"
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r1 == 0) goto L10
            r5.deleteFile(r2)
            return
        L10:
            r1 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r1)     // Catch: java.io.FileNotFoundException -> L48
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.startTag(r2, r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.endTag(r2, r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.endDocument()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
            return
        L38:
            r6 = move-exception
            goto L3c
        L3a:
            goto L42
        L3c:
            if (r5 == 0) goto L41
            r5.close()     // Catch: java.io.IOException -> L41
        L41:
            throw r6
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return
        L48:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r2
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String.format(r6, r5)
            return
    }

    @androidx.annotation.NonNull
    static java.lang.String readLocales(@androidx.annotation.NonNull android.content.Context r8) {
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L5e
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            r6 = 1
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 != r6) goto L2a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            if (r7 <= r4) goto L43
            goto L2a
        L26:
            r8 = move-exception
            goto L4b
        L28:
            goto L51
        L2a:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L30
            goto L15
        L30:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        L43:
            if (r2 == 0) goto L54
        L45:
            r2.close()     // Catch: java.io.IOException -> L49
            goto L54
        L49:
            goto L54
        L4b:
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r8
        L51:
            if (r2 == 0) goto L54
            goto L45
        L54:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5b
            goto L5e
        L5b:
            r8.deleteFile(r0)
        L5e:
            return r1
    }

    static void syncLocalesToFramework(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L3c
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r4, r1)
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            r2 = 1
            if (r1 == r2) goto L3c
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.getApplicationLocales()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L35
            java.lang.String r1 = readLocales(r4)
            java.lang.String r3 = "locale"
            java.lang.Object r3 = r4.getSystemService(r3)
            if (r3 == 0) goto L35
            android.os.LocaleList r1 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(r1)
            androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(r3, r1)
        L35:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r4.setComponentEnabledSetting(r0, r2, r2)
        L3c:
            return
    }
}
