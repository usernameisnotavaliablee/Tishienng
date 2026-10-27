package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";
    private static final java.lang.Object sAppLocaleStorageSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync = r0
            return
    }

    private AppLocalesStorageHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void persistLocales(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6) {
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L5f
        L14:
            r1 = 0
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r1)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L51
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L46
        L44:
            goto L4c
        L46:
            if (r5 == 0) goto L4b
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4b
        L4b:
            throw r6     // Catch: java.lang.Throwable -> L12
        L4c:
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5e
        L51:
            java.lang.String r5 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r6[r1] = r2     // Catch: java.lang.Throwable -> L12
            java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5e:
            return
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    @androidx.annotation.NonNull
    public static java.lang.String readLocales(@androidx.annotation.NonNull android.content.Context r8) {
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L65
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r6 = 1
            if (r5 == r6) goto L46
            r6 = 3
            if (r5 != r6) goto L2d
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            if (r7 <= r4) goto L46
            goto L2d
        L29:
            r8 = move-exception
            goto L4e
        L2b:
            goto L54
        L2d:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L33
            goto L18
        L33:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L46:
            if (r2 == 0) goto L57
        L48:
            r2.close()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L57
            goto L57
        L4c:
            r8 = move-exception
            goto L67
        L4e:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
        L53:
            throw r8     // Catch: java.lang.Throwable -> L4c
        L54:
            if (r2 == 0) goto L57
            goto L48
        L57:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L5e
            goto L63
        L5e:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4c
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r8
    }
}
